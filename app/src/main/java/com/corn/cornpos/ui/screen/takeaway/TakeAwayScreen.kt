package com.corn.cornpos.ui.screen.takeaway


import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.corn.cornpos.R
import com.corn.cornpos.data.database.OrderDetails
import com.corn.cornpos.data.remote.dto.MYOrder
import com.corn.cornpos.data.remote.dto.Row
import com.corn.cornpos.ui.screen.dashboard.ResponsiveDottedLine
import com.corn.cornpos.ui.screen.dashboard.getCurrentDateFormat
import com.corn.cornpos.ui.screen.dashboard.getCurrentTimeFormatted
import com.corn.cornpos.ui.screen.dashboard.getOrderReamingTime
import com.corn.cornpos.util.NavigationScreen
import com.corn.cornpos.util.UiEvent
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)

@Composable
fun TakeAwayScreen(
    navController: NavController,
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: TakeAwayViewModel = hiltViewModel()
) {


    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current
    val titleFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_semibold)
    val regularFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins)
    val fontMedium = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_medium)
    val isGridView = remember { mutableStateOf(true) }
    val systemUiController = rememberSystemUiController()
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    var allProductsList by remember { mutableStateOf<List<Row>>(emptyList()) }
    val takeAwayValues = TakeAwayValues
    val titleFontSize = takeAwayValues.titleFontSize
    val logoutFontSize = takeAwayValues.logoutFontSize
    val mainContentTopPadding = takeAwayValues.mainContentTopPadding
    val normalTextFontSize = takeAwayValues.normalTextFontSize
    val topRowTopPadding = takeAwayValues.topRowTopPadding
    val mainContentColumnTopPadding = takeAwayValues.mainContentColumnTopPadding
    val columnHeight = takeAwayValues.columnHeight
    val gridBottomPadding = takeAwayValues.gridBottomPadding
    val buttonColumnHeight = takeAwayValues.buttonColumnHeight
    val buttonColumnPadding = takeAwayValues.buttonColumnPadding
    val buttonColumnVerticalArrangement = takeAwayValues.buttonColumnVerticalArrangement
    val pullRefreshState = rememberPullRefreshState(refreshing = false, { viewModel.refreshData() })
    val titleTextCount = takeAwayValues.titleTextCount

    DisposableEffect(systemUiController) {
        systemUiController.setSystemBarsColor(
            color = Color((0XFFDB5734))
        )
        systemUiController.setNavigationBarColor(color = Color.White)
        onDispose {}
    }


    DisposableEffect(viewModel) {
        viewModel.refreshData()
        onDispose {}
    }


    LaunchedEffect(key1 = true) {
        viewModel.uiEvent.collect { uiEvent ->
            when (uiEvent) {
                is UiEvent.ShowSnackBar -> {
                    Toast.makeText(context, uiEvent.message, Toast.LENGTH_SHORT).show()
                }

                is UiEvent.Navigate -> onNavigate(uiEvent)

                else -> {}
            }
        }
    }





    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },

        topBar = {
            TopAppBar(
                title = {

                    Row(
                        Modifier
                            .fillMaxWidth()
                            .padding(start = 0.dp, end = 20.dp)
                    ) {
                        Spacer(Modifier.weight(1f))
                        androidx.compose.material3.Text(
                            text = "Take Away",
                            fontFamily = FontFamily(regularFont!!),
                            color = Color.White,
                            fontSize = titleFontSize,
                            modifier = Modifier
                                .wrapContentWidth(align = Alignment.CenterHorizontally)
                        )
                        Spacer(Modifier.weight(0.6f))

                        androidx.compose.material3.Text(
                            text = "Logout",
                            fontFamily = FontFamily(regularFont!!),
                            color = Color(0XFFF39C12),
                            fontSize = logoutFontSize,
                            modifier = Modifier
                                .clickable {
                                    navController.popBackStack(
                                        NavigationScreen.DashboardScreen.route,
                                        inclusive = true
                                    )
                                    navController.navigate(NavigationScreen.Login.route)
                                }
                                .wrapContentWidth(align = Alignment.End)
                                .padding(top = 5.dp)
                                .border(1.dp, Color(0XFFF39C12), RoundedCornerShape(7.dp))
                                .padding(horizontal = 7.dp, vertical = 1.dp)
                        )


                    }
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color(0XFFDB5734)
                )
            )


        },
    ) {
        it


        Column(
            horizontalAlignment = Alignment.Start, modifier = Modifier
                .padding(top = mainContentTopPadding)
                .fillMaxWidth()
        ) {

            Column(modifier = Modifier.background(color = Color(0XFFDB5734))) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 30.dp, top = 10.dp, bottom = 15.dp)


                ) {


                    Column(
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Row(horizontalArrangement = Arrangement.Start) {
                            androidx.compose.material3.Text(
                                text = "Location", fontFamily = FontFamily(titleFont!!),
                                fontSize = normalTextFontSize,
                                color = Color.White
                            )


                            var text: String= ""
                            if (viewModel.userInfoDatabaseData?.DistributionName != null){
                                if (viewModel.userInfoDatabaseData?.DistributionName?.length!! > titleTextCount)
                                    text =   "${viewModel.userInfoDatabaseData?.DistributionName?.take(titleTextCount)}..."
                                else
                                    text= viewModel.userInfoDatabaseData?.DistributionName!!
                            }else{
                                text= ""
                            }

                            Text(
                                text = ": ${text}",

                                fontFamily = FontFamily(titleFont!!),
                                fontSize = normalTextFontSize,
                                color = Color.White

                            )
                        }


                        Row(horizontalArrangement = Arrangement.Start) {
                            Text(
                                text = "Attendee Name", fontFamily = FontFamily(titleFont!!!!),
                                fontSize = normalTextFontSize,
                                color = Color.White

                            )
                            var textLocation: String= ""
                            if (viewModel.userInfoDatabaseData?.UserName  != null){
                                if (viewModel.userInfoDatabaseData?.UserName?.length!! > titleTextCount)
                                    textLocation =   "${viewModel.userInfoDatabaseData?.UserName?.take(titleTextCount)}..."
                                else
                                    textLocation= viewModel.userInfoDatabaseData?.UserName!!
                            }else{
                                textLocation= ""
                            }

                            Text(
                                text = ": ${textLocation}",
                                fontFamily = FontFamily(titleFont!!),
                                fontSize = normalTextFontSize,
                                color = Color.White

                            )
                        }
                    }


                    Column(horizontalAlignment = Alignment.Start) {
                        Row(horizontalArrangement = Arrangement.Start) {
                            androidx.compose.material3.Text(
                                text = "Date", fontFamily = FontFamily(titleFont!!!!),
                                fontSize = normalTextFontSize,
                                color = Color.White

                            )
                            androidx.compose.material3.Text(
                                text = ": ${viewModel.userInfoDatabaseData?.WorkingDate}",
                                fontFamily = FontFamily(titleFont!!),
                                fontSize = normalTextFontSize,
                                color = Color.White

                            )
                        }

                        Row(horizontalArrangement = Arrangement.Start) {
                            androidx.compose.material3.Text(
                                text = "Time", fontFamily = FontFamily(titleFont!!!!),
                                fontSize = normalTextFontSize,
                                color = Color.White


                            )
                            androidx.compose.material3.Text(
                                text = ": ${getCurrentTimeFormatted()}",
                                fontFamily = FontFamily(titleFont!!),
                                fontSize = normalTextFontSize,
                                color = Color.White


                            )
                        }

                    }

                }

            }




            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp, top = topRowTopPadding, bottom = 10.dp)

            ) {


                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    androidx.compose.material3.Text(
                        text = "Total Orders", fontFamily = FontFamily(titleFont!!),
                        fontSize = normalTextFontSize,
                        color = Color.Black


                    )
                    androidx.compose.material3.Text(
                        text = ": ${allProductsList.size}",
                        fontFamily = FontFamily(titleFont!!),
                        fontSize = normalTextFontSize,
                        color = Color.Black


                    )

                }
                Row(horizontalArrangement = Arrangement.Start) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_awesome_list),
                        contentDescription = "list View",
                        Modifier
                            .size(15.dp)
                            .clickable { isGridView.value = false },
                        tint = if (!isGridView.value) Color(0XFFDB5734) else Color(0XFFA1A1A1),
                    )
                    Spacer(modifier = Modifier.width(10.dp))

                    Icon(
                        painter = painterResource(id = R.drawable.icon_rec),
                        contentDescription = "Grid view",
                        Modifier
                            .size(15.dp)
                            .clickable { isGridView.value = true },
                        tint = if (isGridView.value) Color(0XFFDB5734) else Color(0XFFA1A1A1),
                    )
                }
            }


            ResponsiveDottedLine(myColor = Color.Black)

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center, modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = mainContentColumnTopPadding)
            ) {


                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxHeight(columnHeight)
                        .pullRefresh(pullRefreshState)
                ) {
                    PullRefreshIndicator(false, pullRefreshState, )

                    if (viewModel.loadingDataFromApi) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxWidth()
                        ) {

                            CircularProgressIndicator(
                                color = Color(0XFFF39C12)
                            )
                        }
                    } else {
                        viewModel.dashboardDataFromApi?.Rows?.let {
                            val list = mutableListOf<Row>()
                            it.forEach { row ->
                                if (row.ServiceTypeID == 3) {
                                    list.add(row)
                                }
                            }
                            allProductsList = list
                            if (isGridView.value) {
                                LazyVerticalGrid(
                                    columns = GridCells.Fixed(2), content = {
                                        items(items = allProductsList) { roww ->
                                            TKOrderCardView(
                                                roww,
                                                navController,
                                                viewModel
                                            )
                                        }
                                    },
                                    modifier = Modifier
                                        .padding(
                                            bottom = gridBottomPadding,
                                            start = 8.dp,
                                            end = 8.dp
                                        )
                                        .fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center
                                )
                            } else {
                                LazyColumn(
                                    content = {
                                        items(items = allProductsList) { roww ->
                                            TKOrderListView(
                                                roww,
                                                navController,
                                                viewModel
                                            )
                                        }
                                    },
                                    modifier = Modifier
                                        .padding(bottom = gridBottomPadding)
                                        .fillMaxHeight()
                                        .fillMaxWidth(),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                )
                            }
                        }

                    }

                }

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = buttonColumnVerticalArrangement,
                    modifier = Modifier
                        .fillMaxHeight(buttonColumnHeight)
                        .padding(top = buttonColumnPadding)
                ) {
                    Box(
                        Modifier
                            .clickable {
                                viewModel.onEvent(TakeAwayEvents.OnNewOrderClick)
                            }
                            .height(65.dp)
                            .width(190.dp)
                            .background(color = Color(0XFFF39C12), RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        androidx.compose.material3.Text(text = "New Order", color = Color.White)
                    }

                }

            }


        }


    }
}


@Composable
fun TKOrderCardView(order: Row, navController: NavController, viewModel: TakeAwayViewModel) {
    val context = LocalContext.current
    val titleFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_semibold)
    val regularFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins)
    val takeAwayValues = TakeAwayValues
    val orderCardViewHorizontalPadding = takeAwayValues.orderCardViewHorizontalPadding
    val orderCardViewVerticalPadding = takeAwayValues.orderCardViewVerticalPadding
    val orderCardViewHeight = takeAwayValues.orderCardViewHeight
    val orderCardViewIconSize = takeAwayValues.orderCardViewIconSize
    val normalTextFontSize = takeAwayValues.normalTextFontSize


    if (order.ServiceTypeID == 3) {
        Card(
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp),
            border = BorderStroke(1.dp, Color(0XFFDB5734)),
            modifier = Modifier
                .padding(
                    vertical = orderCardViewVerticalPadding,
                    horizontal = orderCardViewHorizontalPadding
                )
                .height(orderCardViewHeight)
                .width(210.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(color = Color(0XFFF67C3F))
                    .fillMaxWidth()
                    .fillMaxHeight(0.25f)
                    .padding(horizontal = 10.dp)
                    .height(35.dp)
            ) {


                Text(
                    text = "Order # ${order.OrderID}", fontFamily = FontFamily(titleFont!!),
                    fontSize = normalTextFontSize,
                    color = Color.White
                )
                Icon(painter = painterResource(id = R.drawable.icon_awesome_edit),
                    contentDescription = "Edit Order",
                    tint = Color.White,
                    modifier = Modifier
                        .size(12.dp)
                        .clickable {
                            val orderDetailsList = mutableListOf<OrderDetails>()

                            CoroutineScope(Dispatchers.IO).launch {
                                viewModel.dataStore.savedCustomerName("Walking Customer")
                                viewModel.dataStore.savedCustomerID(0)
                                viewModel.dataStore.savedOrderDate("")
                                viewModel.dataStore.savedCoverTableFloor("")
                                viewModel.dataStore.savedCoverTable(0)
                                viewModel.dataStore.savedSelectedTable(0)
                                viewModel.dataStore.savedSelectedTableName("")
                                viewModel.dataStore.savedTakeAwayTitle("Take Away")
                                viewModel.dataBaseRepository.deleteAllOrder()
                                viewModel.dataStore.saveEditMode(true);
                                if (viewModel.userInfoDatabaseData?.Can_TakeAway == true && viewModel.userInfoDatabaseData?.Can_Delivery == true && viewModel.userInfoDatabaseData?.Can_DineIn == true) {
                                    viewModel.dataStore.saveIsTableScreen(true)
                                } else if (viewModel.userInfoDatabaseData?.Can_TakeAway == true) {
                                    viewModel.dataStore.saveCanTakeAway(true)
                                } else if (viewModel.userInfoDatabaseData?.Can_Delivery == true) {
                                    viewModel.dataStore.saveCanDelivery(true)
                                } else if (viewModel.userInfoDatabaseData?.Can_DineIn == true) {
                                    viewModel.dataStore.saveCanDineIn(true)
                                }

                                if (order.OrderDetail != null) {
                                    val listType = object : TypeToken<List<MYOrder>>() {}.type
                                    val orders: List<MYOrder> =
                                        Gson().fromJson(order.OrderDetail, listType)
                                    orders.forEach { myOrder ->
                                        val adsOnCategory = if (myOrder.IsAddsOn) {
                                            myOrder.IsAddsOn.toString()
                                        } else {
                                            null
                                        }
                                        if (myOrder.IsDeal == 1) {
                                            val dealParent =
                                                viewModel.dealsList.firstOrNull() { it.DealID == myOrder.DealID }
                                            if (dealParent != null) {
                                                if (!viewModel.checkOrderList(dealParent.DealID)) {
                                                    val dealParentOrder = OrderDetails(
                                                        itemId = dealParent.DealID,
                                                        itemName = dealParent.DealName,
                                                        price = dealParent.DealPrice.toInt(),
                                                        quantity = myOrder.DealQty.toInt(),
                                                        sectionName = dealParent.CategoryName,
                                                        parentRowId = myOrder.ModifierParentRowID,
                                                        adsOnCategory = "Deal parent",
                                                        isDeal = 1,
                                                        parentDeal = dealParent.CategoryName
                                                    )

                                                    orderDetailsList.add(dealParentOrder)
                                                    viewModel.alreadyAddedOrder.add(dealParentOrder)
                                                }
                                            }

                                            val order1 = OrderDetails(
                                                itemId = myOrder.ID,
                                                itemName = myOrder.Name,
                                                price = myOrder.Price.toInt(),
                                                quantity = myOrder.Qty.toInt(),
                                                sectionName = myOrder.SectionName,
                                                parentRowId = myOrder.ModifierParentRowID,
                                                adsOnCategory = "deal",
                                                isDeal = 1,
                                                parentDeal = dealParent!!.DealName
                                            )
                                            orderDetailsList.add(order1)

                                        } else if (myOrder.IsHasAddsOn) {

                                            val order4 = OrderDetails(
                                                itemId = myOrder.ID,
                                                itemName = myOrder.Name,
                                                price = myOrder.Price.toInt(),
                                                quantity = myOrder.Qty.toInt(),
                                                sectionName = myOrder.SectionName,
                                                parentRowId= myOrder.ModifierParentRowID,
                                                adsOnCategory = adsOnCategory,
                                                isDeal = myOrder.IsDeal,
                                                parentDeal = null
                                            )
                                            orderDetailsList.add(order4)
                                            val parentId = myOrder.ModifierParentRowID
                                            val adsOn =
                                                orders.filter { it.ModifierParentRowID == parentId && it.IsAddsOn }
                                            Log.d("TAG", "TKOrderCardView:parentID : ${parentId} ")
                                            Log.d("TAG", "TKOrderCardView:adsOnList : ${adsOn} ")
                                            adsOn.forEach {
                                                val order2 = OrderDetails(
                                                    itemId = it.ID,
                                                    itemName = it.Name,
                                                    price = it.Price.toInt(),
                                                    quantity = it.Qty.toInt(),
                                                    sectionName = it.SectionName,
                                                    adsOnCategory = it.ModifierParentRowID.toString(),
                                                    parentRowId= myOrder.ModifierParentRowID,
                                                    isDeal = it.IsDeal,
                                                    parentDeal = null
                                                )
                                                orderDetailsList.add(order2)
                                            }
                                        } else {
                                            val currentOrderAlreadyInList =
                                                orderDetailsList.firstOrNull() { it.itemId == myOrder.ID && it.adsOnCategory?.toInt() == myOrder.ModifierParentRowID }
                                            if (!myOrder.IsAddsOn) {
                                                val order3 = OrderDetails(
                                                    itemId = myOrder.ID,
                                                    itemName = myOrder.Name,
                                                    price = myOrder.Price.toInt(),
                                                    quantity = myOrder.Qty.toInt(),
                                                    sectionName = myOrder.SectionName,
                                                    adsOnCategory = adsOnCategory,
                                                    parentRowId= myOrder.ModifierParentRowID,
                                                    isDeal = myOrder.IsDeal,
                                                    parentDeal = null
                                                )
                                                orderDetailsList.add(order3)
                                            }

                                        }

                                    }

                                }
                                CoroutineScope(Dispatchers.IO).launch {
                                    viewModel.dataBaseRepository.insertOrderList(orderDetailsList)
                                }
                            }


                            val gson = Gson()
                            val userJson = gson.toJson(order)
                            navController.navigate(
                                "DetailScreen/order={order}".replace(
                                    "{order}",
                                    userJson
                                )
                            )
                            viewModel.alreadyAddedOrder.clear()

                        }
                )
            }
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.8f)
                    .padding(top = 10.dp, start = 13.dp, end = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.watch),
                    contentDescription = "Edit Order",
                    modifier = Modifier.size(orderCardViewIconSize)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Time :", fontFamily = FontFamily(titleFont!!),
                    fontSize = normalTextFontSize,
                    color = Color.Black
                )
                Text(
                    text = " ${getOrderReamingTime(order.CreateDateTime)}",
                    fontFamily = FontFamily(regularFont!!),
                    fontSize = normalTextFontSize,
                    color = Color.Black

                )
            }

        }

    }

}


@Composable
fun TKOrderListView(order: Row, navController: NavController, viewModel: TakeAwayViewModel) {
    val context = LocalContext.current
    val titleFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_semibold)
    val regularFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins)
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val padding = if (screenWidth > 600.dp) {
        42.dp
    } else {
        16.dp
    }

    val height = if (screenWidth > 600.dp) {
        90.dp
    } else if (screenWidth <= 360.dp) {
        40.dp
    } else {
        50.dp
    }

    val width = if (screenWidth > 600.dp) {
        600.dp
    } else {
        350.dp
    }
    val font = if (screenWidth > 600.dp) {
        15.sp
    } else if (screenWidth <= 360.dp) {
        9.sp
    } else if (screenWidth <= 420.dp) {
        10.sp
    } else {
        12.sp
    }


    val icon = if (screenWidth > 600.dp) {
        18.dp
    } else if (screenWidth <= 360.dp) {
        12.dp
    } else if (screenWidth <= 420.dp) {
        12.dp
    } else {
        15.dp
    }

    if (order.ServiceTypeID == 3) {
        Card(
            shape = RoundedCornerShape(topStart = 20.dp, bottomStart = 20.dp),
            border = BorderStroke(1.dp, Color(0XFFDB5734)),
            modifier = Modifier
                .padding(vertical = 15.dp, horizontal = padding)
                .height(height)
                .width(width),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            )
        ) {
            Row(
                horizontalArrangement = Arrangement.Start
            ) {


                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .background(color = Color(0XFFF67C3F))
                        .fillMaxWidth(0.25f)
                        .fillMaxHeight(1f)
                        .padding()
                ) {

                    Text(
                        text = "Order # ${order.OrderID}", fontFamily = FontFamily(titleFont!!),
                        fontSize = font,
                        color = Color.White
                    )
                }
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .fillMaxHeight(1f)
                        .padding(start = 10.dp)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.take_away),
                        contentDescription = "table",
                        tint = Color(0XFFDB5734),
                        modifier = Modifier.size(icon),
                    )

                    Text(
                        text = "TakeAway", fontFamily = FontFamily(titleFont!!),
                        fontSize = font,
                        color = Color.Black
                    )

                }


                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .fillMaxHeight(1f)
                        .padding(start = 3.dp, end = 0.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.watch),
                        contentDescription = "Edit Order",
                        modifier = Modifier.size(icon)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Text(
                        text = "Time :", fontFamily = FontFamily(titleFont!!),
                        fontSize = font,
                        color = Color.Black
                    )
                    Text(
                        text = " ${getOrderReamingTime(order.CreateDateTime)}",
                        fontFamily = FontFamily(regularFont!!),
                        fontSize = font,
                        color = Color.Black

                    )
                }

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(1f)
                ) {
                    Icon(painter = painterResource(id = R.drawable.icon_awesome_edit),
                        contentDescription = "Edit Order",
                        tint = Color(0XFFDB5734),
                        modifier = Modifier
                            .size(icon)
                            .clickable {
                                val orderDetailsList = mutableListOf<OrderDetails>()

                                CoroutineScope(Dispatchers.IO).launch {
                                    viewModel.dataStore.savedCustomerName("Walking Customer")
                                    viewModel.dataStore.savedCustomerID(0)
                                    viewModel.dataStore.savedOrderDate("")
                                    viewModel.dataStore.savedCoverTableFloor("")
                                    viewModel.dataStore.savedCoverTable(0)
                                    viewModel.dataStore.savedSelectedTable(0)
                                    viewModel.dataStore.savedSelectedTableName("")
                                    viewModel.dataStore.savedTakeAwayTitle("Take Away")
                                    viewModel.dataBaseRepository.deleteAllOrder()
                                    viewModel.dataStore.saveEditMode(true);
                                    if (viewModel.userInfoDatabaseData?.Can_TakeAway == true && viewModel.userInfoDatabaseData?.Can_Delivery == true && viewModel.userInfoDatabaseData?.Can_DineIn == true) {
                                        viewModel.dataStore.saveIsTableScreen(true)
                                    } else if (viewModel.userInfoDatabaseData?.Can_TakeAway == true) {
                                        viewModel.dataStore.saveCanTakeAway(true)
                                    } else if (viewModel.userInfoDatabaseData?.Can_Delivery == true) {
                                        viewModel.dataStore.saveCanDelivery(true)
                                    } else if (viewModel.userInfoDatabaseData?.Can_DineIn == true) {
                                        viewModel.dataStore.saveCanDineIn(true)
                                    }

                                    if (order.OrderDetail != null) {
                                        val listType = object : TypeToken<List<MYOrder>>() {}.type
                                        val orders: List<MYOrder> =
                                            Gson().fromJson(order.OrderDetail, listType)
                                        orders.forEach { myOrder ->
                                            val adsOnCategory = if (myOrder.IsAddsOn) {
                                                myOrder.IsAddsOn.toString()
                                            } else {
                                                null
                                            }
                                            if (myOrder.IsDeal == 1) {

                                                val dealParent =
                                                    viewModel.dealsList.firstOrNull() { it.DealID == myOrder.DealID }

                                                if (dealParent != null) {
                                                    if (!viewModel.checkOrderList(dealParent.DealID)) {

                                                        val dealParentOrder = OrderDetails(
                                                            itemId = dealParent.DealID,
                                                            itemName = dealParent.DealName,
                                                            price = dealParent.DealPrice.toInt(),
                                                            quantity = myOrder.DealQty.toInt(),
                                                            sectionName = dealParent.CategoryName,
                                                            parentRowId = myOrder.ModifierParentRowID,
                                                            adsOnCategory = "Deal parent",
                                                            isDeal = 1,
                                                            parentDeal = dealParent.CategoryName
                                                        )

                                                        orderDetailsList.add(dealParentOrder)
                                                        viewModel.alreadyAddedOrder.add(dealParentOrder)
                                                    }
                                                }

                                                if (myOrder.IsHasAddsOn){

                                                    val order4 = OrderDetails(
                                                        itemId = myOrder.ID,
                                                        itemName = myOrder.Name,
                                                        price = myOrder.Price.toInt(),
                                                        quantity = myOrder.DealQty.toInt(),
                                                        sectionName = myOrder.SectionName,
                                                        parentRowId= myOrder.ModifierParentRowID,
                                                        adsOnCategory = "deal",
                                                        isDeal = myOrder.IsDeal,
                                                        parentDeal = dealParent!!.DealName
                                                    )

                                                    orderDetailsList.add(order4)
                                                    val parentId = myOrder.ModifierParentRowID
                                                    val adsOn =
                                                        orders.filter { it.ModifierParentRowID == parentId && it.IsAddsOn && it.IsDeal == 1 }
                                                    adsOn.forEach {
                                                        val order2 = OrderDetails(
                                                            itemId = it.ID,
                                                            itemName = it.Name,
                                                            price = it.Price.toInt(),
                                                            quantity = it.DealQty.toInt(),
                                                            sectionName = it.SectionName,
                                                            adsOnCategory = it.ModifierParentRowID.toString(),
                                                            parentRowId= myOrder.ModifierParentRowID,
                                                            isDeal = it.IsDeal,
                                                            parentDeal = dealParent!!.DealName
                                                        )
                                                        orderDetailsList.add(order2)
                                                    }


                                                }else {
                                                    if (!myOrder.IsAddsOn) {
                                                        val order1 = OrderDetails(
                                                            itemId = myOrder.ID,
                                                            itemName = myOrder.Name,
                                                            price = myOrder.Price.toInt(),
                                                            quantity = myOrder.DealQty.toInt(),
                                                            sectionName = myOrder.SectionName,
                                                            parentRowId = myOrder.ModifierParentRowID,
                                                            adsOnCategory = "deal",
                                                            isDeal = 1,
                                                            parentDeal = dealParent!!.DealName
                                                        )
                                                        orderDetailsList.add(order1)
                                                    }
                                                }
                                            } else if (myOrder.IsHasAddsOn) {

                                                val order4 = OrderDetails(
                                                    itemId = myOrder.ID,
                                                    itemName = myOrder.Name,
                                                    price = myOrder.Price.toInt(),
                                                    quantity = myOrder.Qty.toInt(),
                                                    sectionName = myOrder.SectionName,
                                                    parentRowId= myOrder.ModifierParentRowID,
                                                    adsOnCategory = adsOnCategory,
                                                    isDeal = myOrder.IsDeal,
                                                    parentDeal = null
                                                )

                                                orderDetailsList.add(order4)
                                                val parentId = myOrder.ModifierParentRowID
                                                val adsOn =
                                                    orders.filter { it.ModifierParentRowID == parentId && it.IsAddsOn && it.IsDeal == 0}
                                                adsOn.forEach {
                                                    val order2 = OrderDetails(
                                                        itemId = it.ID,
                                                        itemName = it.Name,
                                                        price = it.Price.toInt(),
                                                        quantity = it.Qty.toInt(),
                                                        sectionName = it.SectionName,
                                                        adsOnCategory = it.ModifierParentRowID.toString(),
                                                        parentRowId= myOrder.ModifierParentRowID,
                                                        isDeal = it.IsDeal,
                                                        parentDeal = null
                                                    )
                                                    orderDetailsList.add(order2)
                                                }
                                            } else {
//                                        val currentOrderAlreadyInList =
//                                            orderDetailsList.firstOrNull() { it.itemId == myOrder.ID && it.adsOnCategory?.toInt() == myOrder.ModifierParentRowID }
                                                if (!myOrder.IsAddsOn) {
                                                    val order3 = OrderDetails(
                                                        itemId = myOrder.ID,
                                                        itemName = myOrder.Name,
                                                        price = myOrder.Price.toInt(),
                                                        quantity = myOrder.Qty.toInt(),
                                                        sectionName = myOrder.SectionName,
                                                        adsOnCategory = adsOnCategory,
                                                        parentRowId= myOrder.ModifierParentRowID,
                                                        isDeal = myOrder.IsDeal,
                                                        parentDeal = null
                                                    )
                                                    orderDetailsList.add(order3)
                                                }

                                            }

                                        }

                                    }
                                    CoroutineScope(Dispatchers.IO).launch {
                                        viewModel.dataBaseRepository.insertOrderList(orderDetailsList)
                                    }
                                }

                                val gson = Gson()
                                val userJson = gson.toJson(order)
                                navController.navigate(
                                    "DetailScreen/order={order}".replace(
                                        "{order}",
                                        userJson
                                    )
                                )
                                viewModel.alreadyAddedOrder.clear()

                            }
                    )
                }

            }
        }

    }

}



