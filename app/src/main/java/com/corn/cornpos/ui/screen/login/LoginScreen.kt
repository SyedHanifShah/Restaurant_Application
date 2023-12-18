package com.corn.cornpos.ui.screen.login

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.widget.Toast
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.corn.cornpos.MainActivity
import com.corn.cornpos.R
import com.corn.cornpos.util.Biometric
import com.corn.cornpos.util.UiEvent
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import java.util.Calendar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(
    viewModel: LoginViewModel = hiltViewModel(),
    onNavigate: (UiEvent.Navigate) -> Unit,
    navController: NavController,
    activity: MainActivity
) {

    val loginScreenValues = LoginScreenValues
    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current
    val titleFont = ResourcesCompat.getFont(context, R.font.poppins_semibold)
    val regularFont = ResourcesCompat.getFont(context, R.font.poppins)
    val lightFont = ResourcesCompat.getFont(context, R.font.poppins_light)
    val systemUiController = rememberSystemUiController()
    val isBioAvailable = Biometric.status(context)

    var showPassword by remember {
        mutableStateOf(false)
    }
    val configuration = LocalConfiguration.current

    val searchBarWidth = loginScreenValues.searchBarWidth
    val imageSize = loginScreenValues.imageSize
    val logoBellowSpacerHeight =  loginScreenValues.logoBellowSpacerHeight
    val titleFontSize = loginScreenValues.titleFontSize
    val subTitleFontSize = loginScreenValues.subTitleFontSize
    val placeHolderFontSize = loginScreenValues.placeHolderFontSize
    val textFieldSymbleOneFontSize = loginScreenValues.textFieldSymbleOneFontSize
    val buttonTextSize = loginScreenValues.buttonTextSize
    val buttonHeight = loginScreenValues.buttonHeight


    DisposableEffect(systemUiController) {
        systemUiController.setSystemBarsColor(
            color = Color(0xFFFD923E)
        )
        systemUiController.setNavigationBarColor(color = Color(0xFFDB5734))
        onDispose {}
    }




    LaunchedEffect(key1 = true) {

        viewModel.uiEvent.collect { uiEvent ->
            when (uiEvent) {
                is UiEvent.ShowSnackBar -> {
                    snackbarHostState.showSnackbar(
                        message = uiEvent.message
                    )
                }

                is UiEvent.Navigate -> onNavigate(uiEvent)

                else -> {}
            }
        }
    }


    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(Color(0xFFFD923E), Color(0xFFDB5734)),
                        start = Offset(0f, 1f),
                        end = Offset(0f, 2500f)
                    )
                )
                .padding(it)
                .fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxHeight(1f)

            ) {

                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxHeight(0.9f)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxHeight(0.2f)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.cornpos_logo),
                            contentDescription = "logo",
                            Modifier.size(imageSize)
                        )

                    }



                    Spacer(modifier = Modifier.height(logoBellowSpacerHeight))

                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Bottom,
                        modifier = Modifier
                            .fillMaxHeight(0.9f)
                            .fillMaxWidth()
                    ) {

                        Column(horizontalAlignment = Alignment.Start,
                        ) {

                            Column(
                                horizontalAlignment = Alignment.Start, modifier = Modifier
                            ) {




                                Text(
                                    text = "Account Log In",
                                    fontSize = titleFontSize,
                                    color = Color.White,
                                    textAlign = TextAlign.Start,
                                    fontFamily = FontFamily(titleFont!!)
                                )



                                Text(
                                    text = "Welcome! Please Login Your Account",
                                    fontSize = subTitleFontSize,
                                    color = Color.White,
                                    textAlign = TextAlign.Start,
                                    fontFamily = FontFamily(lightFont!!),
                                    letterSpacing = 1.sp
                                )
                            }

                            Spacer(modifier = Modifier.height(0.dp))

                            Column(
                                horizontalAlignment = Alignment.Start,
                                verticalArrangement = Arrangement.SpaceEvenly,
                                modifier = Modifier
                                    .fillMaxHeight(0.99f)
                            ) {

                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Bottom,
                                    modifier = Modifier.fillMaxHeight(0.52f)
                                ) {


                                    Row(
                                        horizontalArrangement = Arrangement.Start,
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .background(
                                                Color.White,
                                                RoundedCornerShape(10.dp)
                                            )
                                            .fillMaxWidth(0.7f)
                                    ) {
                                        TextField(
                                            value = viewModel.userName,
                                            onValueChange = {
                                                viewModel.onEvent(
                                                    LoginEvents.OnUserNameChange(
                                                        it
                                                    )
                                                )
                                            },
                                            placeholder = {
                                                Text(
                                                    text = "Username",
                                                    fontSize = placeHolderFontSize,
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
                                            modifier = Modifier.fillMaxWidth(searchBarWidth),
                                            textStyle = TextStyle(fontSize = placeHolderFontSize)
                                        )


                                        Text(
                                            text = "|",
                                            color = Color(0xFFDB5734),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = textFieldSymbleOneFontSize,
                                            modifier = Modifier
                                        )


                                        Spacer(modifier = Modifier.width(20.dp))
                                        Box(
                                            contentAlignment = Alignment.Center, modifier = Modifier
                                                .height(55.dp)
                                        ) {
                                            Icon(
                                                painter = painterResource(id = R.drawable.icon_feather_user),
                                                contentDescription = "Finger Print",
                                                tint = Color(0XFFF39C12),
                                                modifier = Modifier.size(13.dp)
                                            )
                                        }
                                        Spacer(modifier = Modifier.width(20.dp))

                                    }
                                        Spacer(modifier = Modifier.height(30.dp))
                                    Row(
                                        horizontalArrangement = Arrangement.Start,
                                        verticalAlignment = Alignment.CenterVertically,
                                        modifier = Modifier
                                            .background(
                                                Color.White,
                                                RoundedCornerShape(10.dp)
                                            )
                                            .fillMaxWidth(0.7f)
                                    ) {
                                        TextField(
                                            value = viewModel.password,
                                            onValueChange = {
                                                viewModel.onEvent(
                                                    LoginEvents.OnPasswordChange(
                                                        it
                                                    )
                                                )
                                            },
                                            placeholder = {
                                                Text(
                                                    text = "Password",
                                                    fontSize =placeHolderFontSize,
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
                                            modifier = Modifier.fillMaxWidth(searchBarWidth),
                                            visualTransformation = if (showPassword) {
                                                VisualTransformation.None
                                            } else {
                                                PasswordVisualTransformation()
                                            },

                                            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                                            textStyle = TextStyle(fontSize = placeHolderFontSize)
                                        )




                                        Text(
                                            text = "|",
                                            color = Color(0xFFDB5734),
                                            fontWeight = FontWeight.Bold,
                                            fontSize = textFieldSymbleOneFontSize,
                                            modifier = Modifier
                                        )
                                        Spacer(modifier = Modifier.width(20.dp))
                                        Box(
                                            contentAlignment = Alignment.Center, modifier = Modifier
                                                .height(50.dp)
                                        ) {
                                            Icon(painter = painterResource(id = R.drawable.icon_ionic_md_key),
                                                contentDescription = "Finger Print",
                                                tint = Color(0XFFF39C12),
                                                modifier = Modifier
                                                    .size(15.dp)
                                                    .clickable {
                                                        showPassword = !showPassword
                                                    }
                                            )
                                        }
                                        Spacer(modifier = Modifier.width(20.dp))

                                    }
                                    Box(
                                        contentAlignment = Alignment.TopStart,
                                        modifier = Modifier
                                            .padding(top = 10.dp)
                                            .fillMaxWidth(0.7f)
                                    ) {
                                        Text(
                                            text = "Forgot Password",
                                            fontSize = placeHolderFontSize,
                                            color = Color.White,
                                            fontFamily = FontFamily(regularFont!!),
                                            modifier = Modifier.clickable {
                                                viewModel.onEvent(LoginEvents.OnForgotPasswordClick)
                                            }
                                        )

                                    }

                                }
                                Row(
                                    horizontalArrangement = Arrangement.Start,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth(0.71f)
                                ) {




                                    Button(
                                        modifier = Modifier
                                            .height(buttonHeight)
                                            .fillMaxWidth(0.65f),
                                        shape = RoundedCornerShape(10.dp),
                                        colors = ButtonDefaults.buttonColors(
                                            containerColor = Color(0XFFF39C12),
                                            contentColor = Color.White
                                        ),
                                        onClick = { viewModel.onEvent(LoginEvents.OnLoginClick) },
                                        enabled = viewModel.password.isNotBlank() && viewModel.userName.isNotBlank()
                                    ) {
                                        Text(text = "Continue", color = Color.White, fontSize = buttonTextSize)
                                    }

                                    Spacer(modifier = Modifier.width(5.dp))
                                    Box(
                                        Modifier
                                            .clickable {
                                                viewModel.onEvent(LoginEvents.OnFingerPrentClick)
                                            }
                                            .height(buttonHeight)
                                            .fillMaxWidth(0.9f)
                                            .background(color = Color.White),
                                        contentAlignment = Alignment.Center
                                    ) {
                                        Icon(painter = painterResource(id = R.drawable.icon_awesome_fingerprint),
                                            contentDescription = "Finger Print",
                                            tint = Color(0XFFF39C12),
                                            modifier = Modifier.clickable {
                                                if (viewModel.isFirstLogin) {
                                                    if (isBioAvailable) {
                                                        Biometric.authenticate(
                                                            activity,
                                                            title = "Biometric Authentication",
                                                            subtitle = "Authenticate to proceed",
                                                            description = "",
                                                            negativeText = "Cancel",
                                                            onSuccess = {
                                                                Toast.makeText(
                                                                    context,
                                                                    "Authenticated successfully",
                                                                    Toast.LENGTH_SHORT
                                                                )
                                                                    .show()
                                                                viewModel.loginFromBiometric()
                                                            },
                                                            onError = { errorCode, errorString ->
                                                                Toast.makeText(
                                                                    context,
                                                                    "Authentication error: $errorCode, $errorString",
                                                                    Toast.LENGTH_SHORT
                                                                )
                                                                    .show()
                                                            }
                                                        ) {
                                                            Toast.makeText(
                                                                context,
                                                                "Authentication failed",
                                                                Toast.LENGTH_SHORT
                                                            )
                                                                .show()
                                                        }


                                                    } else {
                                                        Toast.makeText(
                                                            context,
                                                            "Biometric Not Available",
                                                            Toast.LENGTH_SHORT
                                                        ).show()
                                                    }


                                                } else {
                                                    Toast.makeText(
                                                        context,
                                                        "Use Password Login",
                                                        Toast.LENGTH_SHORT
                                                    ).show()

                                                }
                                            }
                                        )
                                    }

                                }
                            }
                        }

                }

                    Box(contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxHeight(0.05f)
                    ) {
                        if (viewModel.circleProgress){
                            CircularProgressIndicator(
                                color = Color(0XFFF39C12)
                            )

                        }

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                }


                Text(
                    text = "All Rights Are Reserved ${
                        Calendar.getInstance().get(Calendar.YEAR)
                    } - CORN POS", color = Color.White, fontSize = 8.sp,
                    modifier = Modifier.padding(bottom = 10.dp)
                )
            }

        }

    }

}