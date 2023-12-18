package com.corn.cornpos.ui.screen.forgotPassword

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import com.corn.cornpos.R
import com.corn.cornpos.ui.screen.pin.PinEvents
import com.corn.cornpos.util.NavigationScreen
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ForgotPasswordScreen(){

    val context = LocalContext.current
    val regularFont = ResourcesCompat.getFont(context,R.font.poppins)
    val systemUiController = rememberSystemUiController()

    val forgotPassword by remember {
        mutableStateOf("")
    }


    DisposableEffect(systemUiController) {
        systemUiController.setSystemBarsColor(
            color = Color(0XFFF4F8FD)
        )
        systemUiController.setNavigationBarColor(color = Color(0XFFF4F8FD))
        onDispose {}
    }


    Scaffold(
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally

            ,modifier = Modifier
                .background(
                    color = Color(0XFFF4F8FD)
                )
                .padding(it)
                .fillMaxSize()
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxHeight()
            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally) {


                    Spacer(modifier = Modifier.height(70.dp))
                    Image(
                        painter = painterResource(id = R.drawable.forgot_password_logo),
                        contentDescription = "logo",
                        Modifier.size(160.dp)
                    )
                    Spacer(modifier = Modifier.height(30.dp))

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "Reset Your Password",
                            fontSize = 26.sp,
                            color = Color(0XFFDF752B),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily(regularFont!!)
                        )
                        Text(
                            text = "Please Enter Your Email",
                            fontSize = 12.sp,
                            color = Color(0xFF7B7B82),
                            textAlign = TextAlign.Center,
                            fontFamily = FontFamily(regularFont!!),
                            letterSpacing = 1.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(65.dp))
                    Row(
                        horizontalArrangement = Arrangement.Start,
                        modifier = Modifier.background(Color.White, RoundedCornerShape(10.dp))
                    ) {
                        TextField(
                            value = forgotPassword, onValueChange = { },
                            placeholder = {
                                Text(
                                    text = "Email",
                                    fontSize = 12.sp,
                                    color = Color(0XFF576574),
                                    fontFamily = FontFamily(regularFont!!)
                                )
                            },
                            shape = RoundedCornerShape(10.dp),
                            singleLine = true,
                            colors = TextFieldDefaults.textFieldColors(
                                cursorColor = Color(0xFFDB5734),
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                containerColor = Color.White
                            ),
                            modifier = Modifier.width(280.dp)
                        )

                    }

                    Spacer(modifier = Modifier.height(150.dp))
                    Box(
                        Modifier
                            .clickable {

                            }
                            .height(45.dp)
                            .width(160.dp)
                            .background(color = Color(0XFFDB5734)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Send", color = Color.White)
                    }
                }
                Text(text = "All Rights Are Reserved 2022 - CORN POS", color = Color(0XFF4B4B4B), fontSize = 8.sp,
                    fontFamily = FontFamily(regularFont!!)
                    ,modifier = Modifier.padding(bottom = 10.dp)
                )
            }

        }

    }


}