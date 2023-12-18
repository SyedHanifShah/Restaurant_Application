package com.corn.cornpos.ui.screen.pin

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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.hilt.navigation.compose.hiltViewModel
import com.corn.cornpos.R
import com.corn.cornpos.util.UiEvent
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import java.util.Calendar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PINScreen(
    onNavigate: (UiEvent.Navigate) -> Unit,
    viewModel: PinViewModel = hiltViewModel()
){
    val pinScreenValues = PinScreenValues
    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current
    val titleFont = ResourcesCompat.getFont(context,R.font.poppins_semibold)
    val regularFont = ResourcesCompat.getFont(context,R.font.poppins)
    val lightFont = ResourcesCompat.getFont(context,R.font.poppins_light)
    val systemUiController = rememberSystemUiController()
    val configuration = LocalConfiguration.current
    var showPin by remember {
        mutableStateOf(false)
    }
    val screenWidth = configuration.screenWidthDp.dp
    val searchBarWidth = pinScreenValues.searchBarWidth
    val imageSize = pinScreenValues.imageSize
    val bellowImageColumnHeight = pinScreenValues.bellowImageColumnHeight
    val titleFontSize = pinScreenValues.titleFontSize
    val subTitleFontSize = pinScreenValues.subTitleFontSize
    val placeHolderFontSize = pinScreenValues.placeHolderFontSize
    val textFieldSymbleFontSize = pinScreenValues.textFieldSymbleFontSize
    val textFieldSymble2FontSize = pinScreenValues.textFieldSymble2FontSize
    val buttonHeightSize = pinScreenValues.buttonHeightSize
    val buttonTopSpacerHeight = pinScreenValues.buttonTopSpacerHeight
    val buttonTextSize = pinScreenValues.buttonTextSize



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



    DisposableEffect(systemUiController) {
        systemUiController.setSystemBarsColor(
            color = Color(0xFFFD923E)
        )
        systemUiController.setNavigationBarColor(color = Color(0xFFDB5734))
        onDispose {}
    }




    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState)}
    ) {
      Column(
          horizontalAlignment = Alignment.CenterHorizontally
          ,modifier = Modifier
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
          Column(horizontalAlignment = Alignment.CenterHorizontally,
              verticalArrangement = Arrangement.SpaceAround,
              modifier = Modifier.fillMaxHeight(1f)
          ) {
              val horizantelType = if (screenWidth > 600.dp) {
                  Arrangement.SpaceAround
              } else if (screenWidth < 360.dp) {
                  Arrangement.SpaceEvenly
              } else {
                  Arrangement.SpaceAround
              }
              Column(horizontalAlignment = Alignment.CenterHorizontally,
              verticalArrangement = horizantelType,
                  modifier = Modifier
                      .fillMaxHeight(0.97f)
                  ) {
            Box(contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxHeight(0.3f)
                ) {
                Image(
                    painter = painterResource(id = R.drawable.cornpos_logo),
                    contentDescription = "logo",
                    Modifier.size(imageSize)
                )

            }


                Column(horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxHeight(bellowImageColumnHeight)
                    ) {



                  Column(
                      horizontalAlignment = Alignment.Start,
                  ) {
                      Text(
                          text = "Account Log In",
                          fontSize = titleFontSize,
                          color = Color.White,
                          textAlign = TextAlign.Start,
                          fontFamily = FontFamily(titleFont!!)
                      )


                      Text(
                          text = "Welcome! Please Type PIN",
                          fontSize = subTitleFontSize,
                          color = Color.White,
                          textAlign = TextAlign.Start,
                          fontFamily = FontFamily(lightFont!!),
                          letterSpacing = 1.sp
                      )
                  }


                  Column(horizontalAlignment = Alignment.Start,
                      verticalArrangement = Arrangement.Center,
                            modifier = Modifier.fillMaxHeight(0.75f)
                      ) {
                      Row(
                          horizontalArrangement = Arrangement.Start,
                          modifier = Modifier
                              .background(Color.White, RoundedCornerShape(10.dp))
                              .fillMaxWidth(0.7f)
                      ) {
                          TextField(
                              value = viewModel.PIN,
                              onValueChange = { viewModel.onEvent(PinEvents.OnPinChange(it)) },
                              placeholder = {
                                  Text(
                                      text = "Enter PIN",
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
                              visualTransformation = if (showPin) {
                                  VisualTransformation.None
                              } else {
                                  PasswordVisualTransformation()
                              },
                              textStyle = androidx.compose.ui.text.TextStyle(fontSize = placeHolderFontSize),

                              keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                          )



                          Text(
                              text = "|",
                              color = Color(0xFFDB5734),
                              fontWeight = FontWeight.Bold,
                              fontSize = textFieldSymbleFontSize,
                              modifier = Modifier.padding(top = 13.dp)
                          )
                          Spacer(modifier = Modifier.width(20.dp))
                          Box(
                              contentAlignment = Alignment.Center, modifier = Modifier
                                  .height(55.dp)
                                  .padding(top = 9.dp)
                          ) {



                              Text(
                                  text = "****",
                                  color = Color(0xFFDB5734),
                                  fontWeight = FontWeight.Bold,
                                  fontSize = textFieldSymble2FontSize,
                                  modifier = Modifier.clickable {
                                      showPin = !showPin
                                  }
                              )
                          }
                          Spacer(modifier = Modifier.width(20.dp))

                      }

                        Spacer(modifier = Modifier.height(buttonTopSpacerHeight))





                      Button(
                          modifier = Modifier
                              .height(buttonHeightSize)
                              .fillMaxWidth(0.7f),
                          shape = RoundedCornerShape(10.dp),
                          colors = ButtonDefaults.buttonColors(
                              containerColor = Color(0XFFF39C12),
                              contentColor = Color.White
                          ), onClick = { viewModel.onEvent(PinEvents.OnNextClick) },
                          enabled = viewModel.PIN.isNotBlank()
                      ) {
                          Text(text = "Next", color = Color.White, fontSize = buttonTextSize)
                      }
                  }

              }
                  Box(contentAlignment = Alignment.Center,
                      modifier = Modifier.fillMaxHeight(0.01f)
                  ) {
                  if (viewModel.circleProgress){
                          CircularProgressIndicator(
                              color = Color(0XFFF39C12)
                          )

                      }

                  }
Spacer(modifier = Modifier.height(20.dp))

              }
              Text(text = "All Rights Are Reserved ${Calendar.getInstance().get(Calendar.YEAR)} - CORN POS", color = Color.White, fontSize = 8.sp,
              modifier = Modifier.padding(bottom = 0.dp)
                  )



          }

      }

    }
    

}


@Preview(showBackground = true, widthDp = 360, heightDp = 640)
@Composable
fun SmallScreenPreview() {
    PINScreen(onNavigate = {})
}

@Preview(showBackground = true, widthDp = 720, heightDp = 1280)
@Composable
fun LargeScreenPreview() {
    PINScreen(onNavigate = {})
}