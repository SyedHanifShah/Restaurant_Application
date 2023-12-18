package com.corn.cornpos.ui.screen.orderDetail

import android.util.Log
import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
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
import com.corn.cornpos.ui.screen.dashboard.getCurrentTimeFormatted
import com.corn.cornpos.ui.screen.table.TableEvents
import com.corn.cornpos.util.NavigationScreen
import com.corn.cornpos.util.UiEvent
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.text.DecimalFormat
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun OrderDetailScreen(
    editOrder: Row?,
    viewModel: OrderDetailsViewModel = hiltViewModel(),
    navController: NavController,
    onNavigate: (UiEvent.Navigate) -> Unit,
) {
    var mEditOrder by remember {
        mutableStateOf<Row?>(null)
    }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    mEditOrder = editOrder
    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current
    val titleFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_semibold)
    val boldFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_bold)
    val regularFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins)
    val lightFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_light)
    val fontMedium = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_medium)
    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    var parentRowId by remember {
        mutableStateOf(1)
    }
    val editOrderNumber = remember {
        mutableStateOf("")
    }
    var quantity by remember {
        mutableStateOf("")
    }



    val font = if (screenWidth > 600.dp) {
        17.sp
    } else if (screenWidth <= 360.dp) {
        9.sp
    } else if (screenWidth <= 420.dp) {
        12.sp
    }else {
        13.sp
    }
    val fontSub = if (screenWidth > 600.dp) {
        16.sp
    } else if (screenWidth <= 360.dp) {
        10.sp
    } else if (screenWidth <= 420.dp) {
        12.sp
    } else {
        12.sp
    }

    val fontTotal = if (screenWidth > 600.dp) {
        18.sp
    } else if (screenWidth <= 360.dp) {
        12.sp
    } else if (screenWidth <= 420.dp) {
        13.sp
    } else {
        14.sp
    }

    val fontFinal = if (screenWidth > 600.dp) {
        20.sp
    } else if (screenWidth <= 360.dp) {
        13.sp
    } else if (screenWidth <= 420.dp) {
        14.sp
    } else {
        17.sp
    }

    val icon = if (screenWidth > 600.dp) {
        22.dp
    }else if (screenWidth <= 360.dp) {
        14.dp
    } else if (screenWidth <= 420.dp) {
        14.dp
    } else {
        15.dp
    }

    val width = if (screenWidth > 600.dp) {
        25.dp
    } else if (screenWidth <= 360.dp) {
        5.dp
    } else if (screenWidth <= 420.dp) {
        13.dp
    } else {
        15.dp
    }

    val lazyHeight = if (screenWidth > 600.dp) {
        0.65f
    }else if (screenWidth <= 360.dp) {
        0.35f
    } else if (screenWidth <= 420.dp) {
        0.6f
    } else {
        0.5f
    }

    val systemUiController = rememberSystemUiController()
    val coroutineScope = rememberCoroutineScope()

    BackHandler(viewModel.orderList.isNotEmpty() && !viewModel.editMode) {
            Toast.makeText(context, "Place or Cancel order first", Toast.LENGTH_SHORT).show()
    }

    DisposableEffect(systemUiController) {
        systemUiController.setSystemBarsColor(
            color = Color(0XFFF4F8FD)
        )
        systemUiController.setNavigationBarColor(color = Color.White)
        onDispose {}
    }



    LaunchedEffect(key1 = true) {

        viewModel.uiEvent.collect { uiEvent ->
            when (uiEvent) {
                is UiEvent.ShowSnackBar -> {
                    Toast.makeText(context, uiEvent.message, Toast.LENGTH_SHORT).show()
                }
                is UiEvent.Navigate-> onNavigate(uiEvent)

                else -> {}
            }
        }
    }


    LaunchedEffect(key1 = true) {
        if (mEditOrder != null) {

                 CoroutineScope(Dispatchers.IO).launch{
                viewModel.dataStore.savedOrderNumber(mEditOrder?.OrderID?.toInt() ?: 0)
                viewModel.dataStore.savedSelectedTable(mEditOrder?.TableID?.let {
                    convertStringToInt(
                        it
                    )
                }

                    ?: 0)
                editOrderNumber.value = mEditOrder!!.OrderNO
                if (mEditOrder?.TableDetail != null){
                    viewModel.dataStore.savedSelectedTableName(viewModel.getTableDetailsFromJson(
                        mEditOrder?.TableDetail!!
                    ) ?: "")
                }
                if (mEditOrder?.CoverTable != ""){
                    viewModel.dataStore.savedCoverTable(mEditOrder?.CoverTable?.toInt() ?: 0)
                }
                mEditOrder?.ServiceTypeID?.toInt()
                    ?.let { viewModel.dataStore.saveServiceTypeID(it) }

                getDetailScreenDateFromString(mEditOrder?.CreateDateTime)?.let {
                    viewModel.dataStore.savedOrderDate(
                        it
                    )
                }
            }


        }



    }


    BackHandler(mEditOrder != null) {
        coroutineScope.launch {
            mEditOrder = null
            viewModel.onEvent(OrderEvents.OnCancelOrderClick)
            navController.popBackStack()
        }
    }



    var totalPrice = 0
    var taxAmount = 0.00
    var finalAmount = 0.00

    val decimalFormat = DecimalFormat("#.##")


    if (viewModel.orderList.isNotEmpty()) {
        viewModel.orderList.forEach {
            val amount = it.price * it.quantity
            totalPrice += amount
        }
        taxAmount = totalPrice * 0.16
        finalAmount = totalPrice + taxAmount

    }

    val topPadding1 = if (screenWidth > 600.dp) {
        10.dp
    } else if (screenWidth <= 360.dp) {
        5.dp
    } else if (screenWidth <= 420.dp) {
        5.dp
    } else {
        10.dp
    }

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        containerColor = Color(0XFFF4F8FD),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Order Details", fontFamily = FontFamily(regularFont!!),
                        color = Color(0XFFF67C3F),
                        fontSize = 17.sp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = topPadding1)
                            .wrapContentWidth(align = Alignment.CenterHorizontally)
                    )
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color(0XFFF4F8FD)
                )

            )


        }
    ) {
        it


        val topPadding = if (screenWidth > 600.dp) {
            70.dp
        } else if (screenWidth <= 360.dp) {
            65.dp
        } else if (screenWidth <= 420.dp) {
            65.dp
        }else {
            70.dp
        }
        Column(
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp, top = topPadding)
        ) {
            Column(
                horizontalAlignment = Alignment.Start,
            ) {


                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 0.dp, bottom = 0.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Row(horizontalArrangement = Arrangement.Start) {
                            Text(
                                text = "Order Taker", fontFamily = FontFamily(boldFont!!),
                                fontSize = font,
                                color = Color.Black
                            )
                            Text(
                                text = ":  ${viewModel.userInfoDatabaseData?.UserName}",
                                fontFamily = FontFamily(boldFont!!),
                                fontSize = font,
                                color = Color.Black

                            )
                        }
                    }

                    Column(
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Row(horizontalArrangement = Arrangement.Start) {
                            Text(
                                text = "Date", fontFamily = FontFamily(boldFont!!),
                                fontSize = font,
                                color = Color.Black
                            )
                            Text(
                                text = ":${viewModel.userInfoDatabaseData?.WorkingDate}",
                                fontFamily = FontFamily(boldFont!!),
                                fontSize = font,
                                color = Color.Black

                            )
                        }
                    }

                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ResponsiveDottedLine(myColor = Color(0xFF707070))

                }

                Spacer(modifier = Modifier.height(8.dp))


                Column(modifier = Modifier.padding(bottom = 0.dp)) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 0.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start,
                        ) {
                            Row(horizontalArrangement = Arrangement.Start) {
                                Text(
                                    text = if (viewModel.tableFloor == "" || viewModel.tableFloor == "0") "" else "${viewModel.tableFloor}",
                                    fontFamily = FontFamily(boldFont!!),
                                    fontSize = font,
                                    color = Color.Black
                                )
                                Text(
                                    text = if (viewModel.tableName != "") " Table: ${viewModel.tableName}" else "",
                                    fontFamily = FontFamily(boldFont!!),
                                    fontSize = font,
                                    color = Color.Black

                                )
                            }
                        }

                        Column(
                            horizontalAlignment = Alignment.Start,
                        ) {
                            Row(horizontalArrangement = Arrangement.Start) {
                                Text(
                                    text = "Order #", fontFamily = FontFamily(boldFont!!),
                                    fontSize = font,
                                    color = Color.Black
                                )
                                    Text(
                                        text = " ${viewModel.orderNumber}",
                                        fontFamily = FontFamily(boldFont!!),
                                        fontSize = font,
                                        color = Color.Black

                                    )

                            }
                        }

                    }

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 0.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.Start,
                        ) {
                            Row(horizontalArrangement = Arrangement.Start) {
                                Text(
                                    text = if (viewModel.tableCover == "0") "" else "Table",
                                    fontFamily = FontFamily(boldFont!!),
                                    fontSize = font,
                                    color = Color.Black
                                )
                                Text(
                                    text = if (viewModel.tableCover == "0" && mEditOrder?.CoverTable == null) "" else " Covers: ${mEditOrder?.CoverTable ?: viewModel.tableCover}",
                                    fontFamily = FontFamily(boldFont!!),
                                    fontSize = font,
                                    color = Color.Black

                                )
                            }
                        }

                        Column(
                            horizontalAlignment = Alignment.Start,
                        ) {
                            Row(horizontalArrangement = Arrangement.Start) {
                                Text(
                                    text = "Order ", fontFamily = FontFamily(boldFont!!),
                                    fontSize = font,
                                    color = Color.Black
                                )
                                Text(
                                    text = "Time ${getDetailScreenTimeFromString(mEditOrder?.CreateDateTime) ?: getCurrentTimeFormatted()}",
                                    fontFamily = FontFamily(boldFont!!),
                                    fontSize = font,
                                    color = Color.Black

                                )
                            }
                        }

                    }
                }
                val padding2 = if (screenWidth > 600.dp) {
                    10.dp
                } else if (screenWidth <= 360.dp) {
                    5.dp
                } else if (screenWidth <= 420.dp) {
                    5.dp
                } else {
                    10.dp
                }


                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = padding2, bottom = padding2)
                ) {
                    ResponsiveDottedLine(myColor = Color(0xFF707070))

                }
                Spacer(modifier = Modifier.height(5.dp))

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 0.dp, bottom = 5.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                    ) {
                        Row(horizontalArrangement = Arrangement.Start) {
                            Text(
                                text = "Order Products:", fontFamily = FontFamily(titleFont!!),
                                fontSize = font,
                                color = Color(0XFFF67C3F)
                            )
                            Text(
                                text = " ${viewModel.orderList.size}",
                                fontFamily = FontFamily(titleFont!!),
                                fontSize = font,
                                color = Color(0XFFF67C3F)

                            )
                        }
                    }

                }

                val spacerHeight = if (screenWidth > 600.dp) {
                    10.dp
                } else if (screenWidth <= 360.dp) {
                    5.dp
                } else if (screenWidth <= 420.dp) {
                    8.dp
                } else {
                    10.dp
                }
                Spacer(modifier = Modifier.height(spacerHeight))

                LazyColumn(modifier = Modifier
                    .fillMaxHeight(lazyHeight)
                    .fillMaxWidth(), content = {
                    items(items = viewModel.orderList) {
                        Column(verticalArrangement = Arrangement.Center) {

                            Spacer(modifier = Modifier.height(10.dp))
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                val adsONnIndented = if (it.adsOnCategory == null ||  it.adsOnCategory == "Deal parent") {
                                    0.dp
                                } else {
                                    15.dp
                                }
                                Column(
                                    horizontalAlignment = Alignment.Start,
                                    modifier = Modifier
                                        .fillMaxWidth(0.5f)
                                        .padding(start = adsONnIndented)
                                ) {
                                    Text(
                                        text = it.itemName,
                                        fontFamily = FontFamily(titleFont!!),
                                        fontSize = font,
                                        color = Color(0XFF1E272E)
                                    )
                                    if (it.adsOnCategory == null || it.adsOnCategory == "Deal parent") {
                                        Text(
                                            text = "PKR ${it.price}",
                                            fontFamily = FontFamily(regularFont!!),
                                            fontSize = fontSub,
                                            color = Color(0XFF1E272E)

                                        )

                                    }
                                }

                                Column(
                                    horizontalAlignment = Alignment.End,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                ) {
                                    Spacer(modifier = Modifier.width(20.dp))



                                    if (it.adsOnCategory != "deal") {
                                        Row(
                                            horizontalArrangement = Arrangement.End,
                                            verticalAlignment = Alignment.CenterVertically,
                                            modifier = Modifier.fillMaxWidth()
                                        ) {
                                            val rowWidth = if (screenWidth > 600.dp) {
                                                150.dp
                                            } else if (screenWidth <= 360.dp) {
                                                90.dp
                                            } else if (screenWidth <= 420.dp) {
                                                110.dp
                                            } else {
                                                110.dp
                                            }

                                            val boxSize = if (screenWidth > 600.dp) {
                                                30.dp
                                            } else if (screenWidth <= 360.dp) {
                                                20.dp
                                            } else if (screenWidth <= 420.dp) {
                                                20.dp
                                            } else {
                                                20.dp
                                            }

                                            //Plus Minus Row
                                            Row(
                                                horizontalArrangement = Arrangement.SpaceBetween,
                                                modifier = Modifier
                                                    .width(rowWidth)
                                                    .background(
                                                        color = Color.White,
                                                        RoundedCornerShape(20.dp)
                                                    )
                                            ) {
                                               quantity = it.quantity.toString()

                                                if (!viewModel.editMode) {
                                                    Box(contentAlignment = Alignment.Center,
                                                        modifier = Modifier
                                                            .size(boxSize)
                                                            .padding(1.dp)
                                                            .clickable {
                                                                if (it.quantity > 1) {
                                                                    if (it.isDeal == 1) {
                                                                        val dealsItemsList =
                                                                            viewModel.orderList.filter { order -> order.itemName == it.itemName }
                                                                        dealsItemsList.forEach { item ->
                                                                            viewModel.onEvent(
                                                                                OrderEvents.OnDecreaseItem(
                                                                                    OrderDetails(
                                                                                        orderNumber = item.orderNumber,
                                                                                        itemName = item.itemName,
                                                                                        quantity = item.quantity - 1,
                                                                                        itemId = item.itemId,
                                                                                        price = item.price,
                                                                                        sectionName = item.sectionName,
                                                                                        parentRowId = item.parentRowId,
                                                                                        isDeal = item.isDeal,
                                                                                        parentDeal = item.parentDeal,
                                                                                        adsOnCategory = item.adsOnCategory

                                                                                    )
                                                                                )
                                                                            )
                                                                        }

                                                                    } else {


                                                                        viewModel.onEvent(
                                                                            OrderEvents.OnDecreaseItem(
                                                                                OrderDetails(
                                                                                    orderNumber = it.orderNumber,
                                                                                    itemName = it.itemName,
                                                                                    quantity = it.quantity - 1,
                                                                                    itemId = it.itemId,
                                                                                    price = it.price,
                                                                                    sectionName = it.sectionName,
                                                                                    parentRowId = it.parentRowId,
                                                                                    isDeal = it.isDeal,
                                                                                    parentDeal = it.parentDeal,
                                                                                    adsOnCategory = it.adsOnCategory
                                                                                )
                                                                            )
                                                                        )
                                                                    }
                                                                    quantity =
                                                                        (it.quantity - 1).toString()
                                                                }
                                                            }
                                                            .background(
                                                                color = Color(0XFF636E72),
                                                                CircleShape
                                                            )) {
                                                        Icon(
                                                            painter = painterResource(id = R.drawable.minus),
                                                            contentDescription = "minus",
                                                            tint = Color.White,
                                                            modifier = Modifier
                                                                .size(icon)
                                                                .padding(2.dp)
                                                        )
                                                    }

                                                }

                                                Spacer(modifier = Modifier.width(width))

                                                BasicTextField(
                                                    value = quantity,
                                                    onValueChange = { stringValue ->
                                                        quantity = stringValue
                                                    },
                                                    modifier = Modifier
                                                        .height(20.dp)
                                                        .width(35.dp)
                                                        .background(Color.White),
                                                    keyboardOptions = KeyboardOptions(
                                                        keyboardType = KeyboardType.Number,
                                                        imeAction = ImeAction.Done
                                                    ),
                                                    keyboardActions = KeyboardActions(onDone = {
                                                        if (it.isDeal == 1) {
                                                            val dealsItemsList =
                                                                viewModel.orderList.filter { order -> order.itemName == it.itemName }
                                                            dealsItemsList.forEach { item ->
                                                                viewModel.onEvent(
                                                                    OrderEvents.OnDecreaseItem(
                                                                        OrderDetails(
                                                                            orderNumber = item.orderNumber,
                                                                            itemName = item.itemName,
                                                                            quantity = convertStringToInt(
                                                                                quantity
                                                                            ),
                                                                            itemId = item.itemId,
                                                                            price = item.price,
                                                                            sectionName = item.sectionName,
                                                                            isDeal = item.isDeal,
                                                                            parentDeal = item.parentDeal,
                                                                            parentRowId = item.parentRowId,
                                                                            adsOnCategory = item.adsOnCategory

                                                                        )
                                                                    )
                                                                )
                                                            }

                                                        } else{

                                                            viewModel.onEvent(
                                                                OrderEvents.OnDecreaseItem(
                                                                    OrderDetails(
                                                                        orderNumber = it.orderNumber,
                                                                        itemName = it.itemName,
                                                                        quantity = convertStringToInt(
                                                                            quantity
                                                                        ),
                                                                        itemId = it.itemId,
                                                                        price = it.price,
                                                                        sectionName = it.sectionName,
                                                                        isDeal = it.isDeal,
                                                                        parentDeal = it.parentDeal,
                                                                        parentRowId = it.parentRowId,
                                                                        adsOnCategory = it.adsOnCategory
                                                                    )
                                                                )
                                                            )
                                                    }
                                                        keyboardController?.hide()
                                                        focusManager.clearFocus()
                                                    }),
                                                    textStyle = TextStyle(
                                                        textAlign = TextAlign.Center
                                                    )

                                                )


//
                                                Spacer(modifier = Modifier.width(width))


                                                Box(contentAlignment = Alignment.Center,
                                                    modifier = Modifier
                                                        .size(boxSize)
                                                        .padding(1.dp)
                                                        .clickable {
                                                            if (it.isDeal == 1) {
                                                                val dealsItemsList =
                                                                    viewModel.orderList.filter { order -> order.itemName == it.itemName }
                                                                dealsItemsList.forEach { item ->
                                                                    viewModel.onEvent(
                                                                        OrderEvents.OnDecreaseItem(
                                                                            OrderDetails(
                                                                                orderNumber = item.orderNumber,
                                                                                itemName = item.itemName,
                                                                                quantity = item.quantity + 1,
                                                                                itemId = item.itemId,
                                                                                price = item.price,
                                                                                sectionName = item.sectionName,
                                                                                parentRowId = item.parentRowId,
                                                                                isDeal = 1,
                                                                                parentDeal = item.parentDeal,
                                                                                adsOnCategory = item.adsOnCategory

                                                                            )
                                                                        )
                                                                    )
                                                                }
                                                                quantity =
                                                                    (it.quantity + 1).toString()

                                                            } else {
                                                                viewModel.onEvent(
                                                                    OrderEvents.OnDecreaseItem(
                                                                        OrderDetails(
                                                                            orderNumber = it.orderNumber,
                                                                            itemName = it.itemName,
                                                                            quantity = it.quantity + 1,
                                                                            itemId = it.itemId,
                                                                            price = it.price,
                                                                            sectionName = it.sectionName,
                                                                            parentRowId = it.parentRowId,
                                                                            isDeal = it.isDeal,
                                                                            parentDeal = it.parentDeal,
                                                                            adsOnCategory = it.adsOnCategory

                                                                        )
                                                                    )
                                                                )
                                                                quantity =
                                                                    (it.quantity + 1).toString()

                                                            }

                                                        }
                                                        .background(
                                                            color = Color(0XFF636E72),
                                                            CircleShape
                                                        )) {
                                                    Icon(
                                                        painter = painterResource(id = R.drawable.add),
                                                        contentDescription = "add",
                                                        tint = Color.White,
                                                        modifier = Modifier
                                                            .size(icon)
                                                            .padding(2.dp)
                                                    )
                                                }
                                            }
                                            Spacer(modifier = Modifier.width(width))

                                            Icon(
                                                painter = painterResource(id = R.drawable.icon_awesome_edit),
                                                contentDescription = "add",
                                                tint = Color(0XFFF39C12),
                                                modifier = Modifier.size(icon)
                                            )
                                            Spacer(modifier = Modifier.width(width))

                                            if (!viewModel.editMode) {
                                                Icon(
                                                    painter = painterResource(id = R.drawable.bin),
                                                    contentDescription = "add",
                                                    tint = Color(0XFFDB5734),
                                                    modifier = Modifier
                                                        .size(icon)
                                                        .clickable {

                                                            if (it.isDeal == 1) {
                                                                val dealsItemsList =
                                                                    viewModel.orderList.filter { order -> order.parentDeal == it.itemName || order.itemName == it.itemName }
                                                                dealsItemsList.forEach { item ->
                                                                    viewModel.onEvent(
                                                                        OrderEvents.OnDelete(
                                                                            OrderDetails(
                                                                                orderNumber = item.orderNumber,
                                                                                itemId = item.itemId,
                                                                                itemName = item.itemName,
                                                                                quantity = item.quantity,
                                                                                price = item.price,
                                                                                sectionName = item.sectionName,
                                                                                parentRowId = item.parentRowId,
                                                                                isDeal = item.isDeal,
                                                                                parentDeal = item.parentDeal

                                                                            )
                                                                        )
                                                                    )
                                                                }
                                                            } else {
                                                                val adsOnList =
                                                                    viewModel.orderList.filter { order -> order.adsOnCategory == it.itemName }
                                                                if (adsOnList.isNotEmpty()) {
                                                                    adsOnList.forEach { adsOn ->
                                                                        viewModel.onEvent(
                                                                            OrderEvents.OnDelete(
                                                                                OrderDetails(
                                                                                    orderNumber = adsOn.orderNumber,
                                                                                    itemId = adsOn.itemId,
                                                                                    itemName = adsOn.itemName,
                                                                                    quantity = adsOn.quantity,
                                                                                    price = adsOn.price,
                                                                                    sectionName = adsOn.sectionName,
                                                                                    parentRowId = it.parentRowId,
                                                                                    isDeal = adsOn.isDeal,
                                                                                    parentDeal = adsOn.parentDeal

                                                                                )
                                                                            )
                                                                        )
                                                                    }
                                                                }
                                                                viewModel.onEvent(
                                                                    OrderEvents.OnDelete(
                                                                        OrderDetails(
                                                                            orderNumber = it.orderNumber,
                                                                            itemId = it.itemId,
                                                                            itemName = it.itemName,
                                                                            quantity = it.quantity,
                                                                            price = it.price,
                                                                            sectionName = it.sectionName,
                                                                            parentRowId = it.parentRowId,
                                                                            isDeal = it.isDeal,
                                                                            parentDeal = it.parentDeal

                                                                        )
                                                                    )
                                                                )


                                                            }


                                                            quantity = it.quantity.toString()

                                                        }
                                                )

                                            }

                                        }
                                    }
                                }

                            }
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 10.dp)
                            ) {
                                ResponsiveDottedLine(myColor = Color(0xFF707070))

                            }

                        }


                    }
                })

            }

            Spacer(modifier = Modifier.height(10.dp))

            Column() {


                Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.fillMaxWidth()) {
                    Column(
                        horizontalAlignment = Alignment.Start,
                        modifier = Modifier.fillMaxWidth(0.56f)
                    ) {
                        Text(
                            text = "Sub Total", fontFamily = FontFamily(fontMedium!!),
                            fontSize = fontSub,
                            color = Color(0XFF1E272E)
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "Tax 16% (VAT included)", fontFamily = FontFamily(fontMedium!!),
                            fontSize = fontSub,
                            color = Color(0XFF1E272E)

                        )


                    }

                    Column(
                        horizontalAlignment = Alignment.End,
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier.fillMaxWidth()
                    ) {


                        Text(
                            text = "${convertPriceToCommaSeparated(totalPrice.toDouble())}",
                            fontFamily = FontFamily(boldFont!!),
                            fontSize = fontTotal,
                            color = Color(0XFF1E272E)
                        )


                        Text(
                            text = convertPriceToCommaSeparated(
                                decimalFormat.format(taxAmount).toDouble()
                            ), fontFamily = FontFamily(boldFont!!),
                            fontSize = fontTotal,
                            color = Color(0XFF1E272E)
                        )

                    }
                }
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    ResponsiveDottedLine(myColor = Color(0xFF707070))

                }
                Spacer(modifier = Modifier.height(5.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Text(
                        text = "Total", fontFamily = FontFamily(boldFont!!),
                        fontSize = fontFinal,
                        color = Color(0XFFDB5734)
                    )
                    Text(
                        text = convertPriceToCommaSeparated(
                            decimalFormat.format(finalAmount).toDouble()
                        ), fontFamily = FontFamily(boldFont!!),
                        fontSize = fontFinal,
                        color = Color(0XFFDB5734)

                    )
                }

                val buttonStyleSize = if (screenWidth > 600.dp) {
                    65.dp
                } else if (screenWidth <= 360.dp) {
                    35.dp
                } else if (screenWidth <= 420.dp) {
                    45.dp
                } else {
                    45.dp
                }
                val buttonStyleWidth = if (screenWidth > 600.dp) {
                    200.dp
                } else if (screenWidth <= 360.dp) {
                   130.dp
                } else if (screenWidth <= 420.dp) {
                    130.dp
                } else {
                    130.dp
                }
                val textButtonStyleSize = if (screenWidth > 600.dp) {
                    18.sp
                } else if (screenWidth <= 360.dp) {
                    11.sp
                } else if (screenWidth <= 420.dp) {
                    12.sp
                } else {
                    14.sp
                }
                Row(
                    horizontalArrangement = Arrangement.Center, modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)
                ) {


                    Box(
                        Modifier
                            .clickable(enabled = !viewModel.isOrderPlaced) {

                                if (viewModel.orderList.isNotEmpty()) {
                                    if (viewModel.editMode) {
                                        viewModel.onEvent(
                                            OrderEvents.OnUpdateOrder(
                                                grossAmount = totalPrice,
                                                GSTAmount = taxAmount.toInt()
                                            )
                                        )
                                    } else {
                                        viewModel.onEvent(
                                            OrderEvents.OnPLaceOrder(
                                                grossAmount = totalPrice,
                                                GSTAmount = taxAmount.toInt()
                                            )
                                        )
                                    }
                                }
                            }
                            .height(buttonStyleSize)
                            .width(buttonStyleWidth)
                            .background(
                                color = Color(0XFFE65100),
                                RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "Place order",
                            color = Color.White,
                            fontFamily = FontFamily(fontMedium!!),
                            fontSize = textButtonStyleSize
                        )
                    }


                    Spacer(modifier = Modifier.width(20.dp))

                    Box(
                        Modifier
                            .clickable {
                                if (viewModel.orderList.isNotEmpty() || viewModel.tableCover != "0" && viewModel.tableId != "0") {
                                    if (mEditOrder != null) {
                                        mEditOrder = null
                                        viewModel.onEvent(OrderEvents.OnCancelOrderClick)
                                        navController.popBackStack()
                                    } else {
                                        viewModel.onEvent(OrderEvents.OnCancelOrderClick)
                                        navController.popBackStack()
                                    }
                                }
                            }
                            .height(buttonStyleSize)
                            .width(buttonStyleWidth)
                            .background(
                                color = Color(0XFFF0932B),
                                RoundedCornerShape(10.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text =  if (!viewModel.editMode)  "Cancel Order" else "Clear cart" ,
                            color = Color.White,
                            fontFamily = FontFamily(fontMedium!!),
                            fontSize = textButtonStyleSize
                        )
                    }
                }


            }


        }
    }
}

fun convertPriceToCommaSeparated(amount: Double): String {
    val price = amount
    val format = NumberFormat.getInstance(Locale.US)
    val commaSeparatedPrice = format.format(price)

    return commaSeparatedPrice
}

fun getDetailScreenTimeFromString(time: String?): String? {
    return if (!time.isNullOrBlank()) {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
        val date = dateFormat.parse(time)
        val timeFormat = SimpleDateFormat("HH:mm:ss")
        timeFormat.format(date)

    } else {
        null
    }
}

fun getDetailScreenDateFromString(time: String?): String? {
    return if (!time.isNullOrBlank()) {
        val inputDateString = "2023-07-26T18:27:52.9"
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S", Locale.ENGLISH)
        val outputFormat = SimpleDateFormat("d MMMM, yy", Locale.ENGLISH)

        try {
            val date = inputFormat.parse(inputDateString)
            val formattedDate = outputFormat.format(date)
            formattedDate
        } catch (e: Exception) {
            null
        }
    } else {
        null
    }
}


fun convertStringToInt(input: String): Int {
    val newString = input.replace("\\D".toRegex(), "")
    return newString.toInt()
}