package com.corn.cornpos.ui.screen.menu

import android.util.Log
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.Tab
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.corn.cornpos.R
import com.corn.cornpos.data.database.AdsOn
import com.corn.cornpos.data.database.Deals
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.database.Products
import com.corn.cornpos.data.remote.dto.Deal
import com.corn.cornpos.ui.screen.dashboard.ResponsiveDottedLine
import com.corn.cornpos.ui.screen.dashboard.getCurrentTimeFormatted
import com.corn.cornpos.util.DealManager
import com.corn.cornpos.util.NavigationScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class, ExperimentalMaterialApi::class)
@Composable
fun MenuScreen(
    viewModel: MenuViewModel = hiltViewModel(),
    navController: NavController
) {

    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current
    val titleFont = ResourcesCompat.getFont(context, R.font.poppins_semibold)
    val boldFont = ResourcesCompat.getFont(context, R.font.poppins_bold)
    val regularFont = ResourcesCompat.getFont(context, R.font.poppins)
    val lightFont = ResourcesCompat.getFont(context, R.font.poppins_light)
    val fontMedium = ResourcesCompat.getFont(context, R.font.poppins_medium)
    val systemUiController = rememberSystemUiController()
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp

    val dealsPageScope = rememberCoroutineScope()
    val dealsPagerState = rememberPagerState()

    var searchFoodName by remember {
        mutableStateOf("")
    }
    var adsOnItemId by remember {
        mutableStateOf<Int?>(null)
    }
    var simpleProductItemId by remember {
        mutableStateOf<Int?>(null)
    }

    var numberOfRecipes by remember {
        mutableStateOf(1)
    }


    var sectionName by remember {
        mutableStateOf("")
    }
    var parentRowId by remember {
        mutableStateOf(1)
    }

    if (viewModel.orderList.isNotEmpty()){
        parentRowId = viewModel.orderList.last().parentRowId + 1
    }



    var adsOnList by remember {
        mutableStateOf<List<AdsOn>>(emptyList())
    }
    var dealItemAdsOnList by remember {
        mutableStateOf<List<AdsOn>>(emptyList())
    }





    var selectedDealItem by remember {
        mutableStateOf<Deals?>(null)
    }


    var currentDealProduct by remember {
        mutableStateOf<Products?>(null)
    }

    var currentDealCategoryNumber by remember {
        mutableStateOf(0)
    }

    var adsOnSelected by remember {
        mutableStateOf<List<AdsOn>>(emptyList())
    }
    var dealAdsOnSelected by remember {
        mutableStateOf<List<AdsOn>>(emptyList())
    }

    var dealsSelectedProducts by remember {
        mutableStateOf<List<Products>>(emptyList())
    }
    var active by rememberSaveable { mutableStateOf(false) }


    var sheetState = rememberModalBottomSheetState(
        initialValue = ModalBottomSheetValue.Hidden,
        skipHalfExpanded = true
    )
    val coroutineScope = rememberCoroutineScope()

    var currentAdsOneProduct by remember {
        mutableStateOf<Products?>(null)
    }

    var currentDealAdsOneProduct by remember {
        mutableStateOf<Products?>(null)
    }
    var selectedItem by remember {
        mutableStateOf("")
    }

    val categoryDatabaseData = viewModel.categoryDatabaseData
    val productsDatabaseData = viewModel.productsDatabaseData
    val orderList = viewModel.orderList
    val dealsCategory = viewModel.dealsList
    var categoriesOfDeals = dealsCategory.distinctBy { it.DealID }
    categoriesOfDeals = categoriesOfDeals.sortedBy { it.DealName }

    if (categoriesOfDeals.isNotEmpty()) {
        val firstTab = dealsCategory.filter { deal ->
            deal.DealName == categoriesOfDeals[0].DealName
        }
        selectedDealItem = firstTab[0]

    }


    var selectedDealCategoryAllProducts = remember {
        mutableStateListOf<OrderDetails?>(null)
    }
    var adsOnCategoryList = adsOnList.distinctBy { it.AdsOnCategoryName }

    var dealAdsOnCategoryList = dealItemAdsOnList.distinctBy { it.AdsOnCategoryName }



    BackHandler(viewModel.orderList.isNotEmpty()) {
            navController.navigate(NavigationScreen.OrderDetailScreen.route){
                popUpTo(NavigationScreen.DashboardScreen.route)
                launchSingleTop
            }
        }




    DisposableEffect(systemUiController) {
        systemUiController.setSystemBarsColor(
            color = Color((0XFFDB5734))
        )
        systemUiController.setNavigationBarColor(color = Color.White)
        onDispose {}
    }


    if (!sheetState.isVisible){
        numberOfRecipes = 1
    }

    val font = if (screenWidth > 600.dp) {
        17.sp
    }else if (screenWidth <= 360.dp) {
        9.sp
    }else if (screenWidth <= 420.dp) {
        11.sp
    } else {
        13.sp
    }
    val searchBarWidth = if (screenWidth > 600.dp) {
        0.9f
    } else {
        0.8f
    }



    val bottomShitIcon = if (screenWidth > 600.dp) {
        18.dp
    }else if (screenWidth <= 360.dp) {
        10.dp
    }else if (screenWidth <= 420.dp) {
        12.dp
    } else {
       12.dp
    }

    val titleFontSize = if (screenWidth > 600.dp) {
        20.sp
    } else if (screenWidth <= 360.dp) {
        13.sp
    }else if (screenWidth <= 420.dp) {
        15.sp
    } else {
        17.sp
    }
    val titlePadding = if (screenWidth > 600.dp) {
        10.dp
    } else if (screenWidth <= 360.dp) {
        0.dp
    } else if (screenWidth <= 420.dp) {
        0.dp
    }else {
        10.dp
    }

    var dealCategoryCount = remember {
        mutableStateOf(0)
    }



    var selectedAdsOnName = remember {
        mutableStateOf("")
    }

    var dealSelectedAdsOnName = remember {
        mutableStateOf("")
    }


    var selectDealsCategoryItemsCount by remember {
        mutableStateOf(0)
    }

    var selectDealsItemsCount by remember {
        mutableStateOf(0)
    }
    var doesTheDealsAllItemsAded by remember {
        mutableStateOf(0)
    }
 var doesDealCount by remember {
        mutableStateOf(true)
    }

    var currentDealCategoryName by remember {
        mutableStateOf(false)
    }

        var previousDealState by remember {
        mutableStateOf(0)
    }


    var categoryWiseAdsOnList by remember { mutableStateOf(listOf<AdsOn>()) }
    var selectedAdsOnCategory by remember { mutableStateOf<AdsOn?>(null) }

    var dealCategoryWiseAdsOnList by remember { mutableStateOf(listOf<AdsOn>()) }
    var dealSelectedAdsOnCategory by remember { mutableStateOf<AdsOn?>(null) }

    if (adsOnCategoryList.isNotEmpty()) {
        categoryWiseAdsOnList = viewModel.adsOnList.filter { adsOn ->
            adsOn.ItemID == adsOnCategoryList[0].ItemID && adsOn.AdsOnCategoryName == adsOnCategoryList[0].AdsOnCategoryName
        }
        selectedAdsOnCategory = adsOnCategoryList[0]
        selectedAdsOnName.value = adsOnCategoryList[0].AdsOnCategoryName
    }

    if (dealAdsOnCategoryList.isNotEmpty()) {
        dealCategoryWiseAdsOnList = viewModel.adsOnList.filter { adsOn ->
            adsOn.ItemID == dealAdsOnCategoryList[0].ItemID && adsOn.AdsOnCategoryName == dealAdsOnCategoryList[0].AdsOnCategoryName
        }
        dealSelectedAdsOnCategory = dealAdsOnCategoryList[0]
        dealSelectedAdsOnName.value = dealAdsOnCategoryList[0].AdsOnCategoryName
    }



    ModalBottomSheetLayout(
        sheetState = sheetState, sheetContent = {

            BackHandler(sheetState.isVisible) {
                coroutineScope.launch {
                    sheetState.hide()
                    viewModel.clearDealsSelectedItems()
                    viewModel.selectedItems.clear()
                    adsOnCategoryList = emptyList()
                    categoryWiseAdsOnList = emptyList()
                    currentAdsOneProduct = null
                    adsOnList = emptyList()
                    selectedDealItem = null
                }
            }

            val height = if (screenWidth > 600.dp) {
                0.6f
            } else if (screenWidth <= 360.dp) {
                0.7f
            }else if (screenWidth <= 420.dp) {
                0.65f
            } else
            {
                0.6f
            }


            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .fillMaxHeight(height)
                    .fillMaxWidth(1f)
            ) {
                Spacer(modifier = Modifier.height(30.dp))
                if (adsOnList.isNotEmpty()) {



                    Column(
                        horizontalAlignment = Alignment.Start, modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 40.dp)
                            .fillMaxHeight(0.1f)
                    ) {

                        val titleFontSize1 = if (screenWidth > 600.dp) {
                            20.sp
                        } else if (screenWidth <= 360.dp) {
                            13.sp
                        }else if (screenWidth <= 420.dp) {
                            18.sp
                        } else {
                            19.sp
                        }
                        Row(
                            horizontalArrangement = Arrangement.Start,
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Row(
                                horizontalArrangement = Arrangement.Start, modifier = Modifier
                            ) {

                                Text(
                                    text = adsOnList[0].ItemName,
                                    fontFamily = FontFamily(fontMedium!!),
                                    fontSize = titleFontSize1,
                                    textAlign = TextAlign.Start,

                                    )

                            }
                            Spacer(modifier = Modifier.width(25.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .padding()
                                    .fillMaxWidth(0.9f)
                            ) {
                                Icon(painter = painterResource(id = R.drawable.minus),
                                    contentDescription = "minus",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(bottomShitIcon)
                                        .clickable {
                                            if (numberOfRecipes > 0) {
                                                numberOfRecipes--
                                            }

                                        }
                                )
                                Spacer(modifier = Modifier.width(11.dp))
                                val subTitleFontSize = if (screenWidth > 600.dp) {
                                    18.sp
                                } else if (screenWidth <= 360.dp) {
                                    11.sp
                                } else if (screenWidth <= 420.dp) {
                                    12.sp
                                }else {
                                    16.sp
                                }
                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier
                                        .size(34.dp)
                                        .background(
                                            Color.White,
                                            shape = RoundedCornerShape(5.dp)
                                        ),
                                ) {
                                    Text(
                                        text = "$numberOfRecipes",
                                        fontSize = subTitleFontSize,
                                        fontFamily = FontFamily(titleFont!!)
                                    )
                                }
                                Spacer(modifier = Modifier.width(5.dp))

                                Icon(painter = painterResource(id = R.drawable.add_small),
                                    contentDescription = "add",
                                    tint = Color.White,
                                    modifier = Modifier
                                        .size(bottomShitIcon)
                                        .clickable {
                                            numberOfRecipes++
                                        }
                                )

                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        val spacerHeight = if (screenWidth > 600.dp) {
                            15.dp
                        } else if (screenWidth <= 360.dp) {
                            5.dp
                        } else if (screenWidth <= 420.dp) {
                            5.dp
                        }else
                        {
                            15.dp
                        }
                        Spacer(modifier = Modifier.height(spacerHeight))
                        Divider(
                            Modifier
                                .height(1.dp)
                                .padding(start = 3.dp, end = 90.dp), color = Color.Black
                        )

                        Spacer(modifier = Modifier.height(15.dp))
                        val qualityFontSize = if (screenWidth > 600.dp) {
                            20.sp
                        } else if (screenWidth <= 360.dp) {
                           9.sp
                        }else if (screenWidth <= 420.dp) {
                            13.sp
                        } else {
                            18.sp
                        }

                    }




                    val columnHeight = if (screenWidth > 600.dp) {
                        0.5f
                    } else if (screenWidth <= 360.dp) {
                        0.5f
                    } else
                    {
                        0.6f
                    }

                    Column(
                        modifier = Modifier
                            .padding(top = 10.dp)
                            .fillMaxHeight(columnHeight)
                    ) {

                        LazyRow(modifier = Modifier.padding(horizontal = 35.dp)){
                            items(items = adsOnCategoryList){

                            AdsOnCategoryIemView(
                                it,
                                selectedItem = selectedAdsOnName.value ,
                                onItemClick = {
                                    categoryWiseAdsOnList = viewModel.adsOnList.filter {adsOn->
                                        adsOn.ItemID == it.ItemID && adsOn.AdsOnCategoryName == it.AdsOnCategoryName
                                    }
                                    selectedAdsOnName.value = it.AdsOnCategoryName
                                    selectedAdsOnCategory = it
                                }
                                )

                            }
                        }

                        Spacer(modifier = Modifier.height(10.dp))
                        selectedAdsOnCategory?.IsMultiSelectModifier?.let {

                            SimpleCheckboxComponent(categoryWiseAdsOnList,
                                viewModel = viewModel,
                                multiModifier = it,
                                onselection = { adsOnSelected = it })
                        }
                    }

                } else {
                    if (dealItemAdsOnList.isNotEmpty()) {
                        Column(
                            horizontalAlignment = Alignment.Start, modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = 40.dp)
                                .fillMaxHeight(0.15f)
                        ) {


                            val titleFontSize1 = if (screenWidth > 600.dp) {
                                20.sp
                            } else if (screenWidth <= 360.dp) {
                                13.sp
                            } else if (screenWidth <= 420.dp) {
                                18.sp
                            } else {
                                19.sp
                            }

                            val titleTextCount = if (screenWidth > 600.dp) {
                                50
                            } else if (screenWidth <= 360.dp) {
                                25
                            } else if (screenWidth <= 420.dp) {
                                28
                            } else {
                                28
                            }


                            Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    modifier = Modifier
                                ) {

                                    Text(
                                        text = if (dealItemAdsOnList[0].ItemName.length > titleTextCount)
                                            "${dealItemAdsOnList[0].ItemName.take(titleTextCount)}..."
                                        else
                                            dealItemAdsOnList[0].ItemName,
                                        fontFamily = FontFamily(fontMedium!!),
                                        fontSize = titleFontSize1,
                                        textAlign = TextAlign.Start,
                                    )


                                }
                                Spacer(modifier = Modifier.width(25.dp))
                                Row(
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .padding()
                                        .fillMaxWidth(0.9f)
                                ) {
                                    Icon(painter = painterResource(id = R.drawable.minus),
                                        contentDescription = "minus",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(bottomShitIcon)
                                            .clickable {
                                                if (numberOfRecipes > 0) {
                                                    numberOfRecipes--
                                                }

                                            }
                                    )
                                    Spacer(modifier = Modifier.width(11.dp))
                                    val subTitleFontSize = if (screenWidth > 600.dp) {
                                        18.sp
                                    } else if (screenWidth <= 360.dp) {
                                        11.sp
                                    } else if (screenWidth <= 420.dp) {
                                        12.sp
                                    } else {
                                        16.sp
                                    }
                                    Box(
                                        contentAlignment = Alignment.Center,
                                        modifier = Modifier
                                            .size(34.dp)
                                            .background(
                                                Color.White,
                                                shape = RoundedCornerShape(5.dp)
                                            ),
                                    ) {
                                        Text(
                                            text = "$numberOfRecipes",
                                            fontSize = subTitleFontSize,
                                            fontFamily = FontFamily(titleFont!!)
                                        )
                                    }
                                    Spacer(modifier = Modifier.width(5.dp))

                                    Icon(painter = painterResource(id = R.drawable.add_small),
                                        contentDescription = "add",
                                        tint = Color.White,
                                        modifier = Modifier
                                            .size(bottomShitIcon)
                                            .clickable {
                                                numberOfRecipes++
                                            }
                                    )

                                }
                            }

                            val spacerHeight = if (screenWidth > 600.dp) {
                                15.dp
                            } else if (screenWidth <= 360.dp) {
                                20.dp
                            } else if (screenWidth <= 420.dp) {
                                20.dp
                            } else {
                                15.dp
                            }
                            Spacer(modifier = Modifier.height(spacerHeight))
                            Divider(
                                Modifier
                                    .height(1.dp)
                                    .padding(start = 3.dp, end = 90.dp), color = Color.Black
                            )

                        }
                        val columnHeight = if (screenWidth > 600.dp) {
                            0.5f
                        } else if (screenWidth <= 360.dp) {
                            0.5f
                        } else {
                            0.6f
                        }


                        Column(
                            modifier = Modifier
                                .padding()
                                .fillMaxHeight(columnHeight)
                        ) {

                            LazyRow(modifier = Modifier.padding(horizontal = 35.dp)) {
                                items(items = dealAdsOnCategoryList) {

                                    AdsOnCategoryIemView(
                                        it,
                                        selectedItem = dealSelectedAdsOnName.value,
                                        onItemClick = {
                                            dealCategoryWiseAdsOnList =
                                                viewModel.adsOnList.filter { adsOn ->
                                                    adsOn.ItemID == it.ItemID && adsOn.AdsOnCategoryName == it.AdsOnCategoryName
                                                }
                                            dealSelectedAdsOnName.value = it.AdsOnCategoryName
                                            dealSelectedAdsOnCategory = it
                                        }
                                    )

                                }
                            }

                            Spacer(modifier = Modifier.height(10.dp))
                            dealSelectedAdsOnCategory?.IsMultiSelectModifier?.let {

                                SimpleCheckboxComponent(dealCategoryWiseAdsOnList,
                                    viewModel = viewModel,
                                    multiModifier = it,
                                    onselection = { dealAdsOnSelected = it })
                            }
                        }


                    }
                }
                Spacer(modifier = Modifier.height(25.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxHeight(0.4f)
                        .fillMaxWidth()
                ) {
                    val buttonStyleSize = if (screenWidth > 600.dp) {
                        50.dp
                    } else if (screenWidth <= 360.dp) {
                        30.dp
                    } else if (screenWidth <= 420.dp) {
                        45.dp
                    }else {
                        50.dp
                    }
                    val textButtonStyleSize = if (screenWidth > 600.dp) {
                        18.sp
                    } else if (screenWidth <= 360.dp) {
                        11.sp
                    } else if (screenWidth <= 420.dp) {
                        13.sp
                    }else {
                        14.sp
                    }
                    Box(
                        Modifier
                            .clickable {
//                                viewModel.clearDealsSelectedItems()
                                viewModel.selectedItems.clear()
//                                selectedDealItem = null
//                                viewModel.selectedDealItems.clear()
                                adsOnCategoryList = emptyList()
                                categoryWiseAdsOnList = emptyList()
                                currentAdsOneProduct = null
                                adsOnList = emptyList()
                                coroutineScope.launch {
                                    sheetState.hide()
                                }
                            }
                            .height(buttonStyleSize)
                            .width(150.dp)
                            .background(
                                color = Color(0XFF535C68),
                                RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Close",
                            color = Color.White,
                            fontFamily = FontFamily(fontMedium!!),
                            fontSize = textButtonStyleSize
                        )
                    }
                    Box(
                        Modifier
                            .clickable {
                                if (dealItemAdsOnList.isNotEmpty()) {
                                    if (selectedDealItem != null) {
                                        val dealManager =
                                            viewModel.dealManager.firstOrNull { deal -> deal.dealName == selectedDealItem!!.DealName && deal.categoryName == selectedDealItem!!.CategoryName }
                                        if (dealManager == null) {
                                            viewModel.dealManager.add(
                                                DealManager(
                                                    dealName = selectedDealItem!!.DealName,
                                                    categoryName = selectedDealItem!!.CategoryName,
                                                    productAddedCount = selectedDealItem!!.DealItemQuantity,
                                                    productList = mutableListOf()
                                                )
                                            )
                                        }

                                        selectDealsItemsCount += 1
                                        parentRowId += 1
                                        currentDealProduct?.let {
                                            dealManager!!.productList.add(
                                                it
                                            )
                                        }


                                        if (currentDealAdsOneProduct != null) {


                                            selectedDealCategoryAllProducts.add(
                                                OrderDetails(
                                                    itemName = currentDealAdsOneProduct!!.ItemName,
                                                    itemId = currentDealAdsOneProduct!!.ItemID,
                                                    quantity = 1,
                                                    price = 0,
                                                    parentRowId = parentRowId,
                                                    sectionName = selectedDealItem!!.CategoryName,
                                                    adsOnCategory = "deal",
                                                    isDeal = 0,
                                                    parentDeal = selectedDealItem!!.DealName
                                                )
                                            )

                                            dealAdsOnSelected.forEach { item ->
                                                selectedDealCategoryAllProducts.add(
                                                    OrderDetails(
                                                        itemName = item.AdsOnName,
                                                        itemId = item.AdsOnID,
                                                        quantity = 1,
                                                        price = item.Price.toInt(),
                                                        sectionName = currentDealAdsOneProduct!!.ItemName,
                                                        parentRowId = parentRowId,
                                                        adsOnCategory = selectedDealItem?.DealName,
                                                        isDeal = 0,
                                                        parentDeal = selectedDealItem!!.DealName,
                                                        intDealID = selectedDealItem!!.intDealID

                                                    )
                                                )
                                            }

//


                                        }

                                        val current = categoriesOfDeals[dealsPagerState.currentPage]
                                        val first = dealsCategory.filter { deal ->
                                            deal.DealName == current.DealName
                                        }


                                        if (selectDealsItemsCount == doesTheDealsAllItemsAded) {
                                            // No next or previous items are available


                                            selectedDealCategoryAllProducts.add(
                                                0,  // Add the item at the first position.
                                                OrderDetails(
                                                    itemName = selectedDealItem!!.DealName,
                                                    itemId = selectedDealItem!!.DealID,
                                                    quantity = 1,
                                                    price = selectedDealItem!!.DealPrice.toInt(),
                                                    sectionName = selectedDealItem!!.DealName,
                                                    parentRowId = parentRowId,
                                                    adsOnCategory = "Deal parent",
                                                    isDeal = 1,
                                                    intDealID = selectedDealItem!!.intDealID,
                                                    parentDeal = selectedDealItem!!.CategoryName
                                                )
                                            )


                                            selectedDealCategoryAllProducts.forEach { item ->
                                                if (item != null) {
                                                    viewModel.onEvent(
                                                        MenuEvents.OnItemClick(
                                                            name = item.itemName,
                                                            ItemId = item.itemId,
                                                            quantity = item.quantity,
                                                            price = item.price.toDouble(),
                                                            sectionName = item.sectionName,
                                                            parentRowId = item.parentRowId,
                                                            adsOnCategory = item.adsOnCategory,
                                                            isDeal = item.isDeal,
                                                            parentDeal = item.parentDeal,
                                                            intDealId = item.intDealID

                                                        )
                                                    )
                                                }
                                            }







                                            currentDealCategoryName =
                                                true
                                            doesTheDealsAllItemsAded =
                                                0
                                            selectDealsItemsCount = 0
                                            viewModel.selectedDealItems.clear()
                                        } else {
                                            if (dealManager?.productList?.size == selectedDealItem!!.DealItemQuantity) {


                                                val tabIndex =
                                                    first.indexOfFirst { it.CategoryName == selectedDealItem?.CategoryName }

                                                if (tabIndex < first.size - 1 && tabIndex > 0) {
//                                                    // Both next and previous options are available, prioritize next
                                                    currentDealCategoryNumber = tabIndex + 1
                                                    selectedDealItem =
                                                        first[currentDealCategoryNumber]
                                                    selectDealsCategoryItemsCount = 0
                                                    viewModel.selectedDealItems.clear()
                                                } else if (tabIndex < first.size - 1) {
                                                    // Only next option is available
                                                    currentDealCategoryNumber =
                                                        tabIndex + 1
                                                    selectedDealItem =
                                                        first[currentDealCategoryNumber]
                                                    selectDealsCategoryItemsCount =
                                                        0
                                                    viewModel.selectedDealItems.clear()
                                                } else if (tabIndex > 0) {
//                                                    // Only previous option is available
                                                    currentDealCategoryNumber = tabIndex - 1
                                                    selectedDealItem =
                                                        first[currentDealCategoryNumber]
                                                    selectDealsCategoryItemsCount = 0
                                                    viewModel.selectedDealItems.clear()
                                                }
                                            }
                                        }


//                                        viewModel.clearDealsSelectedItems()
//                                        selectedDealItem = null
                                        coroutineScope.launch {
                                            sheetState.hide()
                                        }

                                    }
                                } else {
                                    viewModel.onEvent(
                                        MenuEvents.OnItemClick(
                                            name = currentAdsOneProduct!!.ItemName,
                                            ItemId = currentAdsOneProduct!!.ItemID,
                                            quantity = numberOfRecipes,
                                            price = currentAdsOneProduct!!.Price,
                                            parentRowId = parentRowId,
                                            sectionName = sectionName,
                                            adsOnCategory = null,
                                            isDeal = 0,
                                            parentDeal = null
                                        )
                                    )
                                    if (adsOnList.isNotEmpty()) {
                                        adsOnSelected.forEach {
                                            viewModel.onEvent(
                                                MenuEvents.OnItemClick(
                                                    ItemId = it.AdsOnID,
                                                    name = it.AdsOnName,
                                                    quantity = 1,
                                                    price = it.Price,
                                                    parentRowId = parentRowId,
                                                    sectionName = sectionName,
                                                    adsOnCategory = currentAdsOneProduct!!.ItemName,
                                                    isDeal = 0,
                                                    parentDeal = null
                                                )
                                            )
                                            selectedItem = it.ItemName
                                        }

                                    }

                                    coroutineScope.launch {
                                        sheetState.hide()
                                    }

                                    adsOnCategoryList = emptyList()
                                    categoryWiseAdsOnList = emptyList()
                                    currentAdsOneProduct = null
                                    adsOnList = emptyList()
                                    viewModel.selectedItems.clear()
                                }

                            }
                            .height(buttonStyleSize)
                            .width(150.dp)
                            .background(
                                color = Color(0XFFE65100),
                                RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Add to Order",
                            color = Color.White,
                            fontFamily = FontFamily(fontMedium!!),
                            fontSize = textButtonStyleSize
                        )
                    }
                }


            }


        },
        sheetShape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp),
        sheetBackgroundColor = Color(0XFFFFC465),
        modifier = Modifier.fillMaxWidth()
    ) {
        androidx.compose.material3.Scaffold(
            snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
            containerColor = Color(0XFFF4F8FD),
            topBar = {
                TopAppBar(
                    title = {

                        Text(
                            text = viewModel.canTakwAway , fontFamily = FontFamily(regularFont!!),
                            color = Color.White,
                            fontSize = titleFontSize,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = titlePadding)
                                .wrapContentWidth(align = Alignment.CenterHorizontally)
                        )
                    },
                    colors = TopAppBarDefaults.largeTopAppBarColors(
                        containerColor = Color(0XFFDB5734)
                    )

                )
            },
        ) {
            it
            val bottomPadding = if (screenWidth > 600.dp) {
                15.dp
            } else if (screenWidth <= 360.dp) {
                5.dp
            } else if (screenWidth <= 420.dp) {
                10.dp
            } else {
                15.dp
            }
            val topPadding = if (screenWidth > 600.dp) {
                10.dp
            } else if (screenWidth <= 360.dp) {
                10.dp
            } else {
                10.dp
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                    .padding(top = 53.dp, bottom = 5.dp)
                    .fillMaxWidth()
            ) {

                Column(modifier = Modifier.background(color = Color(0XFFDB5734))) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = 20.dp,
                                end = 20.dp,
                                top = topPadding,
                                bottom = bottomPadding
                            )


                    ) {

                        Column(
                            horizontalAlignment = Alignment.Start,
                        ) {
                            Row(horizontalArrangement = Arrangement.Start) {

                                Text(
                                    text = if (viewModel.tableFloor == "") "" else "${viewModel.tableFloor}",
                                    fontFamily = FontFamily(titleFont!!),
                                    fontSize = font,
                                    color = Color.White,
                                    )

                                Text(
                                    text =if (viewModel.tableName == "") "" else " Table : ${viewModel.tableName}",
                                    fontFamily = FontFamily(titleFont!!),
                                    fontSize = font,
                                    color = Color.White

                                )
                            }


                            Row(horizontalArrangement = Arrangement.Start) {
                                Text(
                                    text =if (viewModel.tableCover == "0") "" else "Table",
                                    fontFamily = FontFamily(titleFont!!!!),
                                    fontSize = font,
                                    color = Color.White

                                )
                                Text(
                                    text = if (viewModel.tableCover == "0") "" else " Covers : ${viewModel.tableCover}",
                                    fontFamily = FontFamily(titleFont!!),
                                    fontSize = font,
                                    color = Color.White

                                )
                            }
                        }

                        Column(horizontalAlignment = Alignment.End) {
                            Row(
                                horizontalArrangement = Arrangement.End,
                            ) {
                                Text(
                                    text = "Order # ", fontFamily = FontFamily(titleFont!!!!),
                                    fontSize = font,
                                    color = Color.White,
                                    textAlign = TextAlign.End

                                )
                                Text(
                                    text = viewModel.fakeOrderNumber.toString(),
                                    fontFamily = FontFamily(titleFont!!),
                                    fontSize = font,
                                    color = Color.White,
                                    textAlign = TextAlign.End

                                )
                            }

                            Row(horizontalArrangement = Arrangement.Start) {
                                Text(
                                    text = "Order", fontFamily = FontFamily(titleFont!!!!),
                                    fontSize = font,
                                    color = Color.White


                                )
                                Text(
                                    text = " Time : ${getCurrentTimeFormatted()}",
                                    fontFamily = FontFamily(titleFont!!),
                                    fontSize = font,
                                    color = Color.White


                                )
                            }

                        }

                    }

                }

                val searchTopSpace = if (screenWidth > 600.dp) {
                    20.dp
                } else if (screenWidth <= 360.dp) {
                    5.dp
                } else if (screenWidth <= 420.dp) {
                    10.dp
                }else {
                    20.dp
                }

                Spacer(modifier = Modifier.height(searchTopSpace))

                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                        .fillMaxWidth(0.95f)
                        .background(Color.White)
                ) {

                    val searchBarFont = if (screenWidth > 600.dp) {
                        17.sp
                    }else if (screenWidth <= 360.dp) {
                        9.sp
                    } else if (screenWidth <= 420.dp) {
                        13.sp
                    }else {
                        15.sp
                    }
                    val searchBoxHeight = if (screenWidth > 600.dp) {
                        55.dp
                    }else if (screenWidth <= 360.dp) {
                        40.dp
                    }else if (screenWidth <= 420.dp) {
                        40.dp
                    } else {
                        50.dp
                    }

                    SearchBar(
                        query = searchFoodName,
                        onQueryChange = {
                            searchFoodName = it
                        },
                        onSearch = {
                            active = false
                        },
                        active = active,
                        onActiveChange = { active = it },
                        shape = RoundedCornerShape(10.dp),
                        placeholder = {
                            Text(
                                text = "Search Food",
                                fontSize = searchBarFont,
                                color = Color(0XFF576574),
                                fontFamily = FontFamily(regularFont!!)
                            )
                        },
                        colors = SearchBarDefaults.colors(
                            containerColor = Color.White
                        ),
                        modifier = Modifier.fillMaxWidth(searchBarWidth)

                    ) {
                        val ite = viewModel.productsDatabaseData.filter { item ->
                            item.ItemName.contains(searchFoodName, true)
                        }


                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier
                        ) {
                            LazyColumn(content = {
                                items(items = ite) {
                                    Box(
                                        contentAlignment = Alignment.CenterStart,
                                        modifier = Modifier
                                            .padding(
                                                start = 20.dp,
                                                top = 5.dp,
                                                end = 5.dp
                                            )
                                            .clickable {
                                                searchFoodName = it.ItemName
                                                viewModel.onEvent(
                                                    MenuEvents.OnItemClick(
                                                        name = it.ItemName,
                                                        ItemId = it.ItemID,
                                                        quantity = 1,
                                                        price = it.Price,
                                                        parentRowId = parentRowId,
                                                        sectionName = it.SectionName,
                                                        adsOnCategory = null,
                                                        isDeal = 0,
                                                        parentDeal = null
                                                    )
                                                )
//                                                selectedItem = currentAdsOneCategory
                                                Toast
                                                    .makeText(
                                                        context,
                                                        "Successfully added",
                                                        Toast.LENGTH_LONG
                                                    )
                                                    .show()

                                                active = false
                                                searchFoodName = ""
                                            },
                                    ) {
                                        Text(
                                            text = it.ItemName,
                                            fontSize = searchBarFont,
                                            color = Color(0XFF576574),
                                            fontFamily = FontFamily(regularFont!!)
                                        )
                                    }
                                }
                            })
                        }


                    }

                    if (!active) {
                        Text(
                            text = "|",
                            color = Color(0XFF576574),
                            fontWeight = FontWeight.Bold,
                            fontSize = 23.sp,
                            modifier = Modifier.padding()
                        )
                        Spacer(modifier = Modifier.width(30.dp))

                        Box(
                            contentAlignment = Alignment.Center, modifier = Modifier
                                .height(searchBoxHeight)
                                .padding()
                        ) {
                            Icon(
                                painter = painterResource(id = R.drawable.search),
                                contentDescription = "Search",
                                tint = Color(0XFF576574),
                                modifier = Modifier.size(18.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))

                    }
                }


                val scope = rememberCoroutineScope()
                val pagerState = rememberPagerState()

                val pages = mutableListOf<String>()
                val listy = viewModel.categoryDatabaseData
                if (listy.isNotEmpty()) {
                    listy.forEach {
                        pages.add(it.Category)
                    }
                    pages.sortBy { it }
                    pages.add(0, "Deals")
                } else {
                    pages.add("Dinner")
                    pages.add("Launch")
                }

                val tabBarHeight = if (screenWidth > 600.dp) {
                    40.dp
                }else if (screenWidth <= 360.dp) {
                    20.dp
                } else if (screenWidth <= 420.dp) {
                    35.dp
                }else {
                    40.dp
                }

                val tabBarLineHeight = if (screenWidth > 600.dp) {
                    4.dp
                }else if (screenWidth <= 360.dp) {
                    1.dp
                }else if (screenWidth <= 420.dp) {
                    2.dp
                } else {
                    3.dp
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 5.dp)
                ) {

                    androidx.compose.material.ScrollableTabRow(
                        selectedTabIndex = pagerState.currentPage,
                        indicator = { tabPositions ->
                            TabRowDefaults.Indicator(
                                Modifier
                                    .pagerTabIndicatorOffset(pagerState, tabPositions),
                                color = Color.Black,
                                height = tabBarLineHeight
                            )
                        }, backgroundColor = Color(0XFFF4F8FD),
                        divider = {},
                        edgePadding = 2.dp,
                        modifier = Modifier
                            .height(tabBarHeight)
                            .padding(start = 0.dp)
                            .fillMaxWidth()
                    ) {
                        pages.forEachIndexed { index, icon ->
                            Tab(
                                icon = {
                                    Text(
                                        text = icon,
                                        fontSize = font,
                                        color = if (pagerState.currentPage == index) Color(
                                            0xFF222133
                                        ) else Color(
                                            0XFF7F8C8D
                                        ),
                                        textAlign = TextAlign.Start,
                                        fontFamily = FontFamily(fontMedium!!),
                                        modifier = Modifier.padding(horizontal = 5.dp)
                                    )
                                },
                                selected = pagerState.currentPage == index,
                                onClick = {
                                    scope.launch {
                                        pagerState.animateScrollToPage(index)
                                    }
                                },

                                )
                        }
                    }

                    HorizontalPager(
                        count = pages.size,
                        modifier = Modifier.padding(horizontal = 5.dp),
                        state = pagerState
                    ) { page ->

                        val tabTopPadding = if (screenWidth > 600.dp) {
                            20.dp
                        } else if (screenWidth <= 360.dp) {
                            5.dp
                        } else if (screenWidth <= 420.dp) {
                            15.dp
                        }else {
                            20.dp
                        }
                        Box(
                            contentAlignment = Alignment.Center, modifier = Modifier
                                .padding(start = 4.dp, end = 4.dp, top = tabTopPadding)
                                .fillMaxWidth()
                        ) {
                            ResponsiveDottedLine(myColor = Color.Black)
                        }

                        val rowTopPadding = if (screenWidth > 600.dp) {
                            35.dp
                        } else if (screenWidth <= 360.dp) {
                            14.dp
                        }else if (screenWidth <= 420.dp) {
                            24.dp
                        } else {
                            35.dp
                        }
                        Row(
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .padding(top = rowTopPadding, start = 5.dp, end = 5.dp)
                                .fillMaxWidth()
                        ) {

                            val iconSize = if (screenWidth > 600.dp) {
                                20.dp
                            } else if (screenWidth <= 360.dp) {
                                15.dp
                            }else if (screenWidth <= 420.dp) {
                                17.dp
                            } else {
                                20.dp
                            }

                            if (sheetState.isVisible) {
                                Row(horizontalArrangement = Arrangement.Start) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.md_paper),
                                        contentDescription = "Oreder Details",
                                        modifier = Modifier.size(iconSize),
                                        tint = Color(0xFFF67C3F)
                                    )

                                    Spacer(modifier = Modifier.width(5.dp))
                                    Text(
                                        text = "Order Details",
                                        fontFamily = FontFamily(titleFont!!),
                                        fontSize = font,
                                        color = Color(0xFFF67C3F),

                                        )

                                }
                            } else {
                                Row(horizontalArrangement = Arrangement.Start) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.icon_awesome_walking),
                                        contentDescription = "Walking Person",
                                        modifier = Modifier.size(iconSize),
                                        tint = Color(0xFFF67C3F)
                                    )

                                    Text(
                                        text = viewModel.customerName,
                                        fontFamily = FontFamily(titleFont!!),
                                        fontSize =font,
                                        color = Color(0xFFF67C3F),

                                        )

                                }
                            }




                            Row(
                                horizontalArrangement = Arrangement.Start,
                                modifier = Modifier.padding(end = 5.dp)
                            ) {
                                Text(
                                    text = "Item Selected :",
                                    fontFamily = FontFamily(titleFont!!!!),
                                    fontSize = font,
                                    color = Color.Black

                                )
                                Text(
                                    text = "${viewModel.orderList.size}",
                                    fontFamily = FontFamily(titleFont!!!!),
                                    fontSize = font,
                                    color = Color.Black

                                )
                            }
                        }
                        val boxTopPadding = if (screenWidth > 600.dp) {
                            70.dp
                        } else if (screenWidth <= 360.dp) {
                            40.dp
                        } else if (screenWidth <= 420.dp) {
                            50.dp
                        } else {
                            70.dp
                        }
                        Box(
                            contentAlignment = Alignment.Center, modifier = Modifier
                                .padding(start = 4.dp, end = 4.dp, top = boxTopPadding)
                                .fillMaxWidth()
                        ) {
                            ResponsiveDottedLine(myColor = Color.Black)
                        }



                        when (page) {

                                0 -> {



                                    if (listy.isNotEmpty()) {
                                        Column(
                                            modifier = Modifier
                                                .fillMaxSize()
                                                .padding(top = 60.dp)
                                        ) {

                                            androidx.compose.material.ScrollableTabRow(
                                                selectedTabIndex = dealsPagerState.currentPage,
                                                indicator = { tabPositions ->
                                                    TabRowDefaults.Indicator(
                                                        Modifier
                                                            .pagerTabIndicatorOffset(
                                                                dealsPagerState,
                                                                tabPositions
                                                            ),
                                                        color = Color(
                                                            0xFFFF5722
                                                        ),
                                                        height = 1.dp
                                                    )
                                                }, backgroundColor = Color(0XFFF4F8FD),
                                                divider = {},
                                                edgePadding = 2.dp,
                                                modifier = Modifier
                                                    .height(tabBarHeight)
                                                    .padding(start = 0.dp)
                                                    .fillMaxWidth()
                                            ) {
                                                categoriesOfDeals.forEachIndexed { index, icon ->

                                                    Tab(
                                                        icon = {

                                                            Text(
                                                                text = icon.DealName,
                                                                fontSize = font,
                                                                color = if (dealsPagerState.currentPage == index) Color(
                                                                    0xFFFF5722
                                                                ) else Color(
                                                                    0XFF7F8C8D
                                                                ),
                                                                textAlign = TextAlign.Start,
                                                                fontFamily = FontFamily(fontMedium!!),
                                                                modifier = Modifier.padding(
                                                                    horizontal = 10.dp
                                                                )
                                                            )
                                                        },
                                                        selected = dealsPagerState.currentPage == index,
                                                        onClick = {
                                                            dealsPageScope.launch {
                                                                dealsPagerState.animateScrollToPage(index)
                                                            }
                                                        },

                                                        )
                                                }
                                            }

                                            if (previousDealState != dealsPagerState.currentPage){
                                                currentDealCategoryName = false
                                                doesTheDealsAllItemsAded = 0
                                                selectDealsItemsCount = 0
                                                currentDealCategoryNumber = 0
                                                doesDealCount = true
                                                viewModel.dealManager.clear()
                                                previousDealState = dealsPagerState.currentPage
                                                selectedDealCategoryAllProducts.clear()
                                            }

                                            val current = categoriesOfDeals[dealsPagerState.currentPage]
                                            val first = dealsCategory.filter { deal ->
                                                deal.DealName == current.DealName
                                            }
                                            val dealManager = viewModel.dealManager.firstOrNull {deal-> deal.dealName == selectedDealItem!!.DealName && deal.categoryName == selectedDealItem!!.CategoryName }
                                            if (dealManager == null){
                                                viewModel.dealManager.add(
                                                    DealManager(
                                                    dealName = selectedDealItem!!.DealName,
                                                        categoryName = selectedDealItem!!.CategoryName,
                                                        productAddedCount = selectedDealItem!!.DealItemQuantity,
                                                        productList = mutableListOf()
                                                )
                                                )
                                            }

                                            if (doesDealCount) {

                                                first.forEach {
                                                    doesTheDealsAllItemsAded += it.DealItemQuantity
                                                }
                                                doesDealCount = false
                                            }

                                            if (currentDealCategoryNumber < first.size) {
                                                selectedDealItem = first[currentDealCategoryNumber]
                                                dealCategoryCount.value = first[currentDealCategoryNumber].DealItemQuantity
                                            }


                                            HorizontalPager(
                                                count = categoriesOfDeals.size,
                                                modifier = Modifier.padding(horizontal = 5.dp),
                                                state = dealsPagerState
                                            ) {dealPage->

                                                val currentCategory = categoriesOfDeals[dealPage]
                                                val firstTab = dealsCategory.filter { deal ->
                                                    deal.DealName == currentCategory.DealName
                                                }


                                                if (firstTab.isNotEmpty()) {
                                                    if (!currentDealCategoryName) {
                                                        LazyRow(
                                                            horizontalArrangement = Arrangement.Start,
                                                            modifier = Modifier.padding(top = 10.dp)
                                                        ) {



                                                            items(items = firstTab) {
                                                                DealsCategoryThirdTab(it,
                                                                    onItemClick = {
                                                                        selectedDealItem = it
                                                                        dealCategoryCount.value = it.DealItemQuantity
                                                                        currentDealCategoryNumber = firstTab.indexOf(it)
                                                                        viewModel.selectedDealItems.clear()
                                                                    },
                                                                    selectedName = selectedDealItem!!.CategoryName


                                                                )
                                                            }
                                                        }

                                                        if (selectedDealItem != null) {

                                                            val idList =
                                                                viewModel.getDealId(selectedDealItem!!.DealItems)
                                                            val uniqueDealsProducts =
                                                                mutableListOf<Products>()
                                                            idList.forEach { dealsID ->
                                                                val product =
                                                                    viewModel.productsDatabaseData.singleOrNull { it.ItemID == dealsID && it.CategoryID == selectedDealItem!!.CategoryID }
                                                                if (product != null) {
                                                                    uniqueDealsProducts.add(product)
                                                                }
                                                            }

                                                            if (!currentDealCategoryName) {

                                                                 DealsCard(
                                                                    list = uniqueDealsProducts,
                                                                    onItemClick = {
                                                                        currentDealProduct = it
                                                                        if (dealManager?.productList?.size!! < selectedDealItem!!.DealItemQuantity) {
                                                                            dealItemAdsOnList =
                                                                                viewModel.adsOnList.filter { adsOn ->
                                                                                    adsOn.ItemID == it.ItemID
                                                                                }
                                                                            if (it.IsHasAddsOn == 1 && dealItemAdsOnList.isNotEmpty() ) {


                                                                                coroutineScope.launch {
                                                                                    if (sheetState.isVisible) {
                                                                                        sheetState.hide()
                                                                                    } else {
                                                                                        currentDealAdsOneProduct =
                                                                                            it
                                                                                        sheetState.show()
                                                                                    }
                                                                                }

                                                                            } else {
                                                                                parentRowId+=1

                                                                                selectedDealCategoryAllProducts.add(
                                                                                    OrderDetails(
                                                                                        itemName = it.ItemName,
                                                                                        itemId = it.ItemID,
                                                                                        quantity = numberOfRecipes,
                                                                                        price = 0,
                                                                                        sectionName = it.SectionName,
                                                                                        parentRowId = parentRowId,
                                                                                        adsOnCategory = "deal",
                                                                                        isDeal = 0,
                                                                                        parentDeal = selectedDealItem!!.DealName
                                                                                    )
                                                                                )

                                                                                selectDealsItemsCount += 1
                                                                                dealManager!!.productList.add(
                                                                                    it
                                                                                )

                                                                                if (selectDealsItemsCount == doesTheDealsAllItemsAded) {
                                                                                    // No next or previous items are available


                                                                                    selectedDealCategoryAllProducts.add(
                                                                                        0,  // Add the item at the first position.
                                                                                        OrderDetails(
                                                                                            itemName = selectedDealItem!!.DealName,
                                                                                            itemId = selectedDealItem!!.DealID,
                                                                                            quantity = 1,
                                                                                            price = selectedDealItem!!.DealPrice.toInt(),
                                                                                            sectionName = selectedDealItem!!.DealName,
                                                                                            parentRowId = parentRowId,
                                                                                            adsOnCategory = "Deal parent",
                                                                                            isDeal = 1,
                                                                                            intDealID = selectedDealItem!!.intDealID,
                                                                                            parentDeal = selectedDealItem!!.CategoryName
                                                                                        )
                                                                                    )


                                                                                        selectedDealCategoryAllProducts.forEach { item ->
                                                                                            if (item != null) {

                                                                                                viewModel.onEvent(
                                                                                                    MenuEvents.OnItemClick(
                                                                                                        name = item.itemName,
                                                                                                        ItemId = item.itemId,
                                                                                                        quantity = item.quantity,
                                                                                                        price = item.price.toDouble(),
                                                                                                        sectionName = item.sectionName,
                                                                                                        parentRowId = item.parentRowId,
                                                                                                        adsOnCategory = item.adsOnCategory,
                                                                                                        isDeal = item.isDeal,
                                                                                                        parentDeal = item.parentDeal,
                                                                                                        intDealId = item.intDealID

                                                                                                    )
                                                                                                )
                                                                                            }
                                                                                        }






                                                                                    selectedDealCategoryAllProducts.clear()
                                                                                    currentDealCategoryName =
                                                                                        true
                                                                                    doesTheDealsAllItemsAded =
                                                                                        0
                                                                                    selectDealsItemsCount =
                                                                                        0
                                                                                    viewModel.selectedDealItems.clear()
                                                                                } else {
                                                                                    if (dealManager.productList.size == selectedDealItem!!.DealItemQuantity) {
                                                                                        val tabIndex =
                                                                                            first.indexOfFirst { it.CategoryName == selectedDealItem?.CategoryName }
                                                                                        if (tabIndex < first.size - 1 && tabIndex > 0) {
//                                                    // Both next and previous options are available, prioritize next
                                                                                            currentDealCategoryNumber = tabIndex + 1
                                                                                            selectedDealItem =
                                                                                                first[currentDealCategoryNumber]
                                                                                            selectDealsCategoryItemsCount = 0
                                                                                            viewModel.selectedDealItems.clear()
                                                                                        } else if (tabIndex < first.size - 1) {
                                                                                            // Only next option is available
                                                                                            currentDealCategoryNumber =
                                                                                                tabIndex + 1
                                                                                            selectedDealItem =
                                                                                                first[currentDealCategoryNumber]
                                                                                            selectDealsCategoryItemsCount =
                                                                                                0
                                                                                            viewModel.selectedDealItems.clear()
                                                                                        }else if (tabIndex > 0) {
//                                                    // Only previous option is available
                                                                                            currentDealCategoryNumber = tabIndex - 1
                                                                                            selectedDealItem =
                                                                                                first[currentDealCategoryNumber]
                                                                                            selectDealsCategoryItemsCount = 0
                                                                                            viewModel.selectedDealItems.clear()
                                                                                        }
                                                                                    }
                                                                                }

                                                                            }
                                                                        }

                                                                    },
                                                                     onOrderRemove= {
                                                                         if (selectDealsItemsCount > 0) {
                                                                             selectDealsItemsCount -= 1
                                                                         }
                                                                         selectedDealCategoryAllProducts.forEach {

                                                                         }
                                                                         val orderHasAdded =
                                                                             selectedDealCategoryAllProducts.firstOrNull { order -> order?.itemName == it.ItemName && order.parentDeal == selectedDealItem!!.DealName }

                                                                         dealManager!!.productList.remove(it)
                                                                         orderHasAdded?.let {
                                                                             selectedDealCategoryAllProducts.remove(it)
                                                                         }

                                                                     },
                                                                     selectedDealCategoryAllProducts,
                                                                     selectedDealItem!!
                                                                )
                                                            }

                                                        }
                                                    }
                                                }


                                            }

                                            }
                                        }


                                }
                            else->{

                                if (categoryDatabaseData.isNotEmpty() && productsDatabaseData.isNotEmpty()) {
                                    val indexOfTab = pages[page]
                                    val indexOfCategory = categoryDatabaseData.indexOfFirst { it.Category == indexOfTab }
                                    val myCategory = categoryDatabaseData[indexOfCategory]
                                    val myCategoryId = myCategory.CategoryID.toString()
                                    var list = productsDatabaseData.filter { product ->
                                        product.CategoryID.toString() == myCategoryId
                                    }
                                    list = list.sortedBy { it.ItemName }

                                    RecipeCard(list = list,
                                        orderList,
                                        selectedItem,
                                        onItemClick = {
                                            if (it.IsHasAddsOn == 1){
                                              adsOnList = viewModel.adsOnList.filter {adsOn->
                                                    adsOn.ItemID == it.ItemID
                                                }

                                                coroutineScope.launch {
                                                    if(sheetState.isVisible) {
                                                        sheetState.hide()
                                                    } else {
                                                    currentAdsOneProduct = it
                                                    sheetState.show()
                                                }
                                                }

                                            }else{
                                                viewModel.onEvent(
                                                        MenuEvents.OnItemClick(
                                                            name = it.ItemName,
                                                            ItemId = it.ItemID,
                                                            quantity = numberOfRecipes,
                                                            price = it.Price,
                                                            sectionName = it.SectionName,
                                                            parentRowId = parentRowId,
                                                            adsOnCategory = null,
                                                            isDeal = 0,
                                                            parentDeal = null
                                                        )
                                                    )
                                            }

                                        }

                                    )
                                }
                            }
                        }
                    }
                }


            }
        }

    }


}

@Composable
fun DealsCategoryThirdTab(deal:Deals, onItemClick: (item: Deals) -> Unit, selectedName:String) {

    Card(
        modifier =
        Modifier
            .padding(horizontal = 10.dp, vertical = 5.dp)
            .height(20.dp)
            .border(border = BorderStroke(1.dp, Color.Black), shape = RoundedCornerShape(8.dp))
            .padding(horizontal = 5.dp)
            .clickable {
                onItemClick(deal)
            },

    ){
        Text(text = deal.CategoryName, fontSize = 13.sp, color =
                if (selectedName == deal.CategoryName) Color(0xFFF67C3F) else Color.Black
        )
    }

}


@Composable
fun AdsOnCategoryIemView(adsOnCategory: AdsOn,selectedItem: String ,onItemClick: (item: AdsOn) -> Unit) {
    val fontMedium = ResourcesCompat.getFont(LocalContext.current, R.font.poppins_medium)

    Box(
    modifier = Modifier
        .padding(5.dp)
        .shadow(5.dp, RoundedCornerShape(15.dp))
        .background(
            color = if (adsOnCategory.AdsOnCategoryName == selectedItem) Color(0xFFF67C3F) else Color.White,
            shape = RoundedCornerShape(15.dp)
        )
        .padding(horizontal = 10.dp, vertical = 5.dp)
        .clickable {
            onItemClick(adsOnCategory)
        }
){
    Text(
        text = adsOnCategory.AdsOnCategoryName,
        fontSize = 10.sp,
        color = if (adsOnCategory.AdsOnCategoryName  == selectedItem )Color.White else Color(0xFFF67C3F),
        fontFamily = FontFamily(fontMedium!!)
        )
}


}


@Composable
fun RecipeCard(
    list: List<Products>,
    orderList: List<OrderDetails>,
    selectedItem: String,
    onItemClick:(item: Products) -> Unit
//    onItemClick: (adsOnItemId: Int?, simpleItemItemId: Int?, categoryName: String, price: Double, sectionName:String) -> Unit
) {
    val context = LocalContext.current
    val regularFont = ResourcesCompat.getFont(context, R.font.poppins)
    val fontMedium = ResourcesCompat.getFont(context, R.font.poppins_medium)
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val font = if (screenWidth > 600.dp) {
        17.sp
    }else if (screenWidth <= 360.dp) {
        9.sp
    } else if (screenWidth <= 420.dp) {
        11.sp
    } else {
        13.sp
    }

    val cardTopPadding = if (screenWidth > 600.dp) {
        82.dp
    } else if (screenWidth <= 360.dp) {
        45.dp
    }else if (screenWidth <= 420.dp) {
        60.dp
    } else {
        82.dp
    }

    val cardHeight = if (screenWidth > 600.dp) {
        80.dp
    } else if (screenWidth <= 360.dp) {
        45.dp
    }else if (screenWidth <= 420.dp) {
        60.dp
    } else {
        70.dp
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(top = cardTopPadding, bottom = 70.dp)
            .fillMaxHeight(),
        content = {
            items(items = list) {
                val order = orderList.firstOrNull(){order-> it.ItemName == order.itemName || order.adsOnCategory == it.ItemName}
                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxWidth(),
                    shape = RectangleShape

                ) {
                    Box(
                        modifier = Modifier
                            .height(cardHeight)
                            .clickable {
                                onItemClick(it)
                            },
                    ) {


                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    color = if (order != null) Color(0xFFF67C3F) else Color.Black.copy(
                                        alpha = 0.3f
                                    ),

                                    )
                        ) {
                        }

                        Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center
                        ) {

                        }

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 3.dp, start = 3.dp, end = 10.dp),
                            contentAlignment = Alignment.TopStart
                        ) {
                            Row(horizontalArrangement = Arrangement.Start) {
                                Text(
                                    text = it.ItemName, fontSize = font,
                                    fontFamily = FontFamily(fontMedium!!),
                                    color = Color.White,
                                    lineHeight = 15.sp
                                )

                            }

                        }
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 3.dp, start = 3.dp, end = 3.dp),
                            contentAlignment = Alignment.TopEnd
                        ) {

                            Text(
                                text = if (order?.quantity != null) order.quantity.toString() else "", fontSize = font,
                                fontFamily = FontFamily(fontMedium!!),
                                color = Color.White
                            )
                        }

                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 3.dp, start = 3.dp),
                            contentAlignment = Alignment.BottomEnd
                        ) {
                            Text(
                                text = "PKR ${it.Price}", fontSize = font,
                                fontFamily = FontFamily(regularFont!!),
                                color = Color.White
                            )
                        }


                    }
                }
            }
        })


}


@Composable
fun DealsCard(
    list: List<Products>,
    onItemClick: (item: Products) -> Unit,
    onOrderRemove: (item: Products) -> Unit,
    selectedDealCategoryAllProducts : SnapshotStateList<OrderDetails?>,
    selectedDealItem : Deals
) {
    val context = LocalContext.current
    val regularFont = ResourcesCompat.getFont(context, R.font.poppins)
    val fontMedium = ResourcesCompat.getFont(context, R.font.poppins_semibold)
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val font = if (screenWidth > 600.dp) {
        17.sp
    }else if (screenWidth <= 360.dp) {
        9.sp
    } else if (screenWidth <= 420.dp) {
        11.sp
    } else {
        13.sp
    }


    val cardTopPadding = if (screenWidth > 600.dp) {
        130.dp
    } else if (screenWidth <= 360.dp) {
        105.dp
    }else if (screenWidth <= 420.dp) {
        60.dp
    } else {
        70.dp
    }

    val cardHeight = if (screenWidth > 600.dp) {
        80.dp
    } else if (screenWidth <= 360.dp) {
        45.dp
    }else if (screenWidth <= 420.dp) {
       60.dp
    } else {
        70.dp
    }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .padding(top = cardTopPadding, bottom = 70.dp)
            .fillMaxHeight()
    ) {
        items(items = list) {

            val orderHasAdded =
                selectedDealCategoryAllProducts.firstOrNull { order -> order?.itemName == it.ItemName && order.parentDeal == selectedDealItem.DealName }


            val order =
                selectedDealCategoryAllProducts.firstOrNull() { order -> it.ItemName == order?.itemName }


            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth(),

                shape = RectangleShape,
            ) {
                Box(
                    modifier = Modifier
                        .height(cardHeight)
                        .clickable {
                            if (orderHasAdded == null) {
                                onItemClick(it)
                            } else {
                                onOrderRemove(it)
                            }
                        },
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                color = if (order != null) Color(0xFFF67C3F) else Color.Black.copy(
                                    alpha = 0.3f
                                )
                            )

                    ) {
                    }

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
//                            Text(text = "${it.ItemID}")
                    }


                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 3.dp, start = 3.dp, end = 10.dp),
                        contentAlignment = Alignment.TopStart
                    ) {
                        Row(horizontalArrangement = Arrangement.Start) {
                            Text(
                                text = it.ItemName, fontSize = font,
                                fontFamily = FontFamily(fontMedium!!),
                                color = Color.White,
                                lineHeight = 15.sp
                            )

                        }

                    }
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 3.dp, start = 3.dp, end = 3.dp),
                        contentAlignment = Alignment.TopEnd
                    ) {

                    }




                }
            }


        }
    }
}


@Composable
fun SimpleCheckboxComponent(list: List<AdsOn>, viewModel: MenuViewModel, multiModifier: Boolean, onselection: (adsOn: List<AdsOn>) -> Unit) {

    val context = LocalContext.current
    val fontMedium = ResourcesCompat.getFont(context, R.font.poppins_medium)
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp


    val boxHeight = if (screenWidth > 600.dp) {
        60.dp
    } else if (screenWidth <= 360.dp) {
        50.dp
    } else if (screenWidth <= 420.dp) {
        55.dp
    } else {
        55.dp
    }
    val boxWidth = if (screenWidth > 600.dp) {
        55.dp
    } else if (screenWidth <= 360.dp) {
        45.dp
    } else if (screenWidth <= 420.dp) {
        50.dp
    } else {
        50.dp
    }

    val font = if (screenWidth > 600.dp) {
        15.sp
    }else if (screenWidth <= 360.dp) {
        10.sp
    } else if (screenWidth <= 420.dp) {
        12.sp
    } else {
        12.sp
    }



    val selectedItems = viewModel.selectedItems

    Column (
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(horizontal = 30.dp)){

        LazyVerticalGrid(verticalArrangement = Arrangement.Center, columns = GridCells.Fixed(3) ){
            items(items =list ){

                Box(
                    modifier = Modifier
                        .padding(vertical = 10.dp, horizontal = 10.dp)
                        .shadow(5.dp, RoundedCornerShape(5.dp))
                        .background(
                            if (selectedItems.contains(it)) Color(0XFFE65100) else Color.White,
                            shape = RoundedCornerShape(5.dp)
                        )
                        .size(width = boxWidth, height = boxHeight)
                        .padding(5.dp)
                        .clickable {
                            if (multiModifier) {
                                // In multiple selection mode, add the item to the list if it's not already there, otherwise remove it
                                if (selectedItems.contains(it)) {
                                    selectedItems.remove(it)
                                } else {
                                    selectedItems.add(it)
                                }
                            } else {
                                // In single selection mode, clear the list and add the newly selected item
                                selectedItems.clear()
                                selectedItems.add(it)
                            }
                            onselection(selectedItems)
                        }
                ){

                Text(text = it.AdsOnName, lineHeight = 10.sp ,fontFamily = FontFamily(fontMedium!!), fontSize = font ,modifier = Modifier.align(Alignment.TopStart))
                    Text(text = it.Price.toString(),fontFamily = FontFamily(fontMedium), fontSize = font ,modifier = Modifier.align(Alignment.BottomEnd))
                }
            }
            
        }

    }
}
