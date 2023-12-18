package com.corn.cornpos.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import com.corn.cornpos.R


sealed class NavigationScreen(
    val baseRoute: String,
    val route: String,
    val title: String,
    val icon: Int
) {
    object Splash : NavigationScreen(
        baseRoute= "splash",
        route = "splash",
        title = "Splash",
        icon = R.drawable.icon_material_dashboard
    )


    object Login : NavigationScreen(
        baseRoute= "login",
        route = "login",
        title = "login",
        icon = R.drawable.icon_material_dashboard
    )


    object PIN : NavigationScreen(
        baseRoute= "pin",
        route = "pin",
        title = "PIN",
        icon = R.drawable.icon_material_dashboard
    )

    object ForgotPassword : NavigationScreen(
        baseRoute= "forgotpassword",
        route = "forgotpassword",
        title = "ForgotPassword",
        icon = R.drawable.icon_material_dashboard
    )

    object DashboardScreen : NavigationScreen(
        baseRoute= "dashboardScreen",
        route = "dashboardScreen",
        title = "Dashboard",
        icon = R.drawable.icon_material_dashboard
    )

    object DeliveryScreen : NavigationScreen(
        baseRoute= "deliveryScreen",
        route = "deliveryScreen",
        title = "Delivery",
        icon = R.drawable.icon_material_directions_bike
    )
    object DineInScreen : NavigationScreen(
        baseRoute= "DineInScreen",
        route = "DineInScreen",
        title = "Dine In",
        icon = R.drawable.dine_in
    )

    object TakeAwayScreen : NavigationScreen(
        baseRoute= "TakeAwayScreen",
        route = "TakeAwayScreen",
        title = "TakeAway",
        icon = R.drawable.take_away
    )

    object TableScreen : NavigationScreen(
        baseRoute= "tableScreen",
        route = "tableScreen",
        title = "Selection",
        icon = R.drawable.selection
    )

    object OrderDetailScreen : NavigationScreen(
        baseRoute = "DetailScreen",
        route = "DetailScreen/order={0}",
        title = "Order Detail",
        icon =R.drawable.order_detail
    )

    object MenuScreen : NavigationScreen(
        baseRoute = "menuScreen",
        route = "menuScreen",
        title = "Menu",
        icon = R.drawable.menu
    )


}

