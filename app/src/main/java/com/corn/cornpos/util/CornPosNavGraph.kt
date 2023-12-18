package com.corn.cornpos.util

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.corn.cornpos.MainActivity
import com.corn.cornpos.data.remote.dto.Row
import com.corn.cornpos.ui.screen.dashboard.DashboardScreen
import com.corn.cornpos.ui.screen.delivery.DeliveryScreen
import com.corn.cornpos.ui.screen.dinein.DineInScreen
import com.corn.cornpos.ui.screen.forgotPassword.ForgotPasswordScreen
import com.corn.cornpos.ui.screen.login.LoginScreen
import com.corn.cornpos.ui.screen.menu.MenuScreen
import com.corn.cornpos.ui.screen.orderDetail.OrderDetailScreen
import com.corn.cornpos.ui.screen.pin.PINScreen
import com.corn.cornpos.ui.screen.splash.SplashScreen
import com.corn.cornpos.ui.screen.table.TableScreen
import com.corn.cornpos.ui.screen.takeaway.TakeAwayScreen
import com.google.gson.Gson


@Composable
fun CornPosNavGraph(navController: NavHostController,
activity: MainActivity
                    ) {

    NavHost(
        navController = navController,
        startDestination =  NavigationScreen.Splash.route
    ) {
        composable(route = NavigationScreen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = NavigationScreen.Login.route) {
            LoginScreen(onNavigate = {
                navController.popBackStack()
                navController.navigate(it.route)
            }, navController = navController,
            activity = activity
                )
        }
        composable(route = NavigationScreen.PIN.route) {
            PINScreen(onNavigate = {
                navController.popBackStack()
                navController.navigate(it.route)

            })
        }
        composable(route = NavigationScreen.ForgotPassword.route) {
            ForgotPasswordScreen()
        }

        composable(route = NavigationScreen.DashboardScreen.route) {
            DashboardScreen(navController,  { navController.navigate(it.route)})
        }

        composable(route = NavigationScreen.TableScreen.route) {
            TableScreen(navController = navController)
        }

        composable(route = "DetailScreen/order={order}") { backStackEntry ->
            val userJson =  backStackEntry.arguments?.getString("order")
            if (userJson != "{0}"){
                var userObject = Gson().fromJson(userJson, Row::class.java)
                OrderDetailScreen(userObject, navController = navController, onNavigate = {
                    navController.popBackStack()
                })
            }else{
                OrderDetailScreen(editOrder = null, navController = navController, onNavigate = {
                    navController.popBackStack()
                })
            }
        }

        composable(route = NavigationScreen.MenuScreen.route) {
        MenuScreen(navController = navController)
        }


        composable(route = NavigationScreen.DeliveryScreen.route) {
            DeliveryScreen(navController,  { navController.navigate(it.route)})
        }

        composable(route = NavigationScreen.TakeAwayScreen.route) {
            TakeAwayScreen(navController,  { navController.navigate(it.route)})
        }

        composable(route = NavigationScreen.DineInScreen.route) {
            DineInScreen(navController,  { navController.navigate(it.route)})
        }



    }
}