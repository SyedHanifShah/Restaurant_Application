package com.corn.cornpos.ui.screen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.corn.cornpos.MainActivity
import com.corn.cornpos.data.CornPosDataStore
import com.corn.cornpos.data.database.Customer
import com.corn.cornpos.ui.screen.dashboard.DashboardViewModel
import com.corn.cornpos.ui.screen.orderDetail.OrderDetailsViewModel
import com.corn.cornpos.util.CornPosNavGraph
import com.corn.cornpos.util.NavigationScreen
import kotlinx.coroutines.launch
import javax.annotation.meta.When
import kotlin.math.log

@Composable
fun MainScreen(activity: MainActivity) {
    val context = LocalContext.current
    val dataStore = CornPosDataStore(context)
    val _isTableScreen = dataStore.isTableScreen

    val _selectedTable = dataStore.getSelectedTable
    var selectedTable by remember {
        mutableStateOf(0)
    }
    val _coverTable = dataStore.getCoverTable
    var coverTable by remember {
        mutableStateOf(0)
    }
    val _customer = dataStore.getCustomerName
    var customer by remember {
        mutableStateOf("")
    }

    var isTableScreen by remember {
        mutableStateOf(false)
    }

    val _canDineIn = dataStore.getCanDineIn

    var canDineIn by remember {
        mutableStateOf(false)
    }

    val _canDelivery = dataStore.getCanDelivery

    var canDelivery by remember {
        mutableStateOf(false)
    }

    val _canTakeAway = dataStore.getCanTakeAway

    var canTakeAway by remember {
        mutableStateOf(false)
    }



    val navController = rememberNavController()
    val backStackEntry by
    navController.currentBackStackEntryAsState()
    val viewModel : DashboardViewModel = hiltViewModel()
    val orderViewModel : OrderDetailsViewModel = hiltViewModel()
    LaunchedEffect(key1 = true, block = {
        _isTableScreen.collect{
            if (it != null) {
                isTableScreen = it
            }
        }
    })
    LaunchedEffect(key1 = true){
        _canDineIn.collect{
            if (it != null) {
                canDineIn = it
            }
        }
    }

    LaunchedEffect(key1 = true){
        _canTakeAway.collect{
            if (it != null) {
                canTakeAway = it
            }
        }
    }

    LaunchedEffect(key1 = true){
        _canDelivery.collect{
            if (it != null) {
                canDelivery = it
            }
        }
    }



    LaunchedEffect(key1 = true ){

        try {
            _coverTable.collect{
                if (it != null) {
                    coverTable = it
                }
            }

        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    LaunchedEffect(key1 = true ){

        try {
            _customer.collect{
                if (it != null) {
                    customer = it
                }
            }

        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    LaunchedEffect(key1 = true ){

        try {
            _selectedTable.collect{
                if (it != null) {
                    selectedTable = it
                }
            }

        }catch (e:Exception){
            e.printStackTrace()
        }

    }

    var showBar by remember {
        mutableStateOf(true)
    }
    showBar = when (backStackEntry?.destination?.route) {
        NavigationScreen.Login.route,NavigationScreen.Splash.route, NavigationScreen.PIN.route, NavigationScreen.ForgotPassword.route -> false
        else -> true
    }

    Scaffold(
      bottomBar = { if (showBar)BottomBar(navController = navController,isTableScreen,
          viewModel = viewModel,canDelivery, canTakeAway, canDineIn, orderViewModel,
            tableNo = selectedTable,
            tableCover = coverTable,
            customer = customer
          ) }
    ) {
        it
        CornPosNavGraph(navController = navController, activity = activity)
    }
}




@Composable
fun BottomBar(navController: NavHostController, isTableScreen: Boolean, viewModel: DashboardViewModel, canDelivery: Boolean , canTakeAway: Boolean ,
              canDineIn: Boolean, orderDetailsViewModel: OrderDetailsViewModel,
              tableNo: Int,
              tableCover: Int,
              customer: String
              ) {

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    var screens: List<NavigationScreen>
        screens = listOf(
        NavigationScreen.DashboardScreen,
        NavigationScreen.TableScreen,
        NavigationScreen.OrderDetailScreen,
        NavigationScreen.MenuScreen
    )

    if(currentDestination?.route == NavigationScreen.DashboardScreen.route || currentDestination?.route == NavigationScreen.DineInScreen.route || currentDestination?.route == NavigationScreen.TakeAwayScreen.route || currentDestination?.route == NavigationScreen.DeliveryScreen.route){
        screens = listOf(
            NavigationScreen.DashboardScreen,
            NavigationScreen.TakeAwayScreen,
            NavigationScreen.DineInScreen
        )

    }else if (isTableScreen){
        screens = listOf(
            NavigationScreen.DashboardScreen,
            NavigationScreen.TableScreen,
            NavigationScreen.OrderDetailScreen,
            NavigationScreen.MenuScreen
        )
    }else if (canDelivery){
        screens = listOf(
            NavigationScreen.DeliveryScreen,
            NavigationScreen.OrderDetailScreen,
            NavigationScreen.MenuScreen
        )
    } else if (canDineIn){
        screens = listOf(
            NavigationScreen.DineInScreen,
            NavigationScreen.TableScreen,
            NavigationScreen.OrderDetailScreen,
            NavigationScreen.MenuScreen
        )
    } else if (canTakeAway){
        screens = listOf(
            NavigationScreen.TakeAwayScreen,
            NavigationScreen.OrderDetailScreen,
            NavigationScreen.MenuScreen
        )
    }





    BottomAppBar(
        containerColor =   Color.White,
        modifier = Modifier
    ) {
        screens.forEach { screen ->
            AddItem(
                screen = screen,
                currentDestination = currentDestination,
                navController = navController,
                viewModel = viewModel,
                orderDetailsViewModel = orderDetailsViewModel,
                tableNo = tableNo,
                tableCover = tableCover,
                customer = customer,
                canDineIn
            )
        }

    }
}



@Composable
fun RowScope.AddItem(
    screen: NavigationScreen,
    currentDestination: NavDestination?,
    navController: NavHostController,
    viewModel: DashboardViewModel,
    orderDetailsViewModel: OrderDetailsViewModel,
    tableNo:Int,
    tableCover:Int,
    customer: String,
    canDineIn: Boolean
) {
    val context = LocalContext.current
   val titleFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins)
    val currentRoute = currentDestination?.route?.substringBefore("/")

    Log.d("TAG", "screen: ${screen.baseRoute}")
    Log.d("TAG", "current: ${currentRoute}")

    NavigationBarItem(
        label = {
            Text(text = screen.title ,
            fontFamily = FontFamily(titleFont!!),
                fontSize = 10.sp
                )
        },
        icon = {
            Icon(
                painter = painterResource(id = screen.icon),
                contentDescription = "Navigation Icon",
                modifier = Modifier.size(20.dp)
            )
        },

        selected = currentDestination?.hierarchy?.any {
            currentRoute == screen.baseRoute
        } == true,


        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color(0XFFDB5734),
            unselectedIconColor = Color(0XFFA1A1A1),
            selectedTextColor = Color(0XFFDB5734),
            unselectedTextColor = Color(0XFFA1A1A1),
            indicatorColor = Color.White
        ),

        onClick = {
            if (orderDetailsViewModel.orderList.isNotEmpty()){
                if (screen.route == NavigationScreen.DashboardScreen.route || screen.route == NavigationScreen.TakeAwayScreen.route || screen.route == NavigationScreen.DeliveryScreen.route || screen.route == NavigationScreen.DineInScreen.route) {
                   if (orderDetailsViewModel.editMode){
                       Toast.makeText(context, "Please clear cart or place order first", Toast.LENGTH_SHORT).show()
                   }else{
                       Toast.makeText(context, "Place or Cancel order first", Toast.LENGTH_SHORT).show()
                   }
                }else{
                    if (screen.route == NavigationScreen.TableScreen.route) {
                            navController.navigate(screen.route) {
                                popUpTo(NavigationScreen.OrderDetailScreen.route)
                                launchSingleTop = true
                            }
                    } else  if (screen.route == NavigationScreen.OrderDetailScreen.route) {
                            navController.navigate(screen.route) {
                                popUpTo(NavigationScreen.DashboardScreen.route)
                                launchSingleTop = true
                            }
                    } else  if (screen.route == NavigationScreen.MenuScreen.route) {
                        navController.navigate(screen.route) {
                                popUpTo(NavigationScreen.DashboardScreen.route)
                                launchSingleTop = true
                            }
                    }
                }

            }else{
                if (screen.route == NavigationScreen.DeliveryScreen.route) {
                    if (viewModel.userInfoDatabaseData?.Can_Delivery == true)
                        navController.navigate(screen.route) {
                            popUpTo(NavigationScreen.DashboardScreen.route)
                            launchSingleTop = true
                        }
                } else if (screen.route == NavigationScreen.DineInScreen.route) {
                    if (viewModel.userInfoDatabaseData?.Can_DineIn == true)
                        navController.navigate(screen.route) {
                            popUpTo(NavigationScreen.DashboardScreen.route)
                            launchSingleTop = true
                        }
                } else if (screen.route == NavigationScreen.TakeAwayScreen.route) {
                    if (viewModel.userInfoDatabaseData?.Can_TakeAway == true)
                        navController.navigate(screen.route) {
                            popUpTo(NavigationScreen.DashboardScreen.route)
                            launchSingleTop = true
                        }
                }else if (screen.route == NavigationScreen.MenuScreen.route) {
                    if (canDineIn){
                        if (tableCover != 0 && tableNo != 0 && customer != ""){
                            navController.navigate(screen.route) {
                                popUpTo(NavigationScreen.DashboardScreen.route)
                                launchSingleTop = true
                            }
                        }
                    }else{
                        navController.navigate(screen.route) {
                            popUpTo(NavigationScreen.DashboardScreen.route)
                            launchSingleTop = true
                        }
                    }
                }else {
                    navController.navigate(screen.route) {
                        popUpTo(NavigationScreen.DashboardScreen.route)
                        launchSingleTop = true
                    }
                }

            }
        }
    )

}