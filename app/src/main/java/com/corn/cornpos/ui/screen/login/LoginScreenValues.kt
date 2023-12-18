package com.corn.cornpos.ui.screen.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object LoginScreenValues {

    val searchBarWidth: Float
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                0.9f
            } else if (screenWidth <= 360.dp) {
                0.7f
            } else if (screenWidth <= 420.dp) {
                0.75f
            } else {
                0.75f
            }
        }


    val imageSize: Dp
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                160.dp
            } else if (screenWidth <= 360.dp) {
                90.dp
            } else if (screenWidth <= 420.dp) {
                120.dp
            } else {
                160.dp
            }
        }

    val logoBellowSpacerHeight: Dp
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                70.dp
            } else if (screenWidth <= 360.dp) {
                10.dp
            } else if (screenWidth <= 420.dp) {
                80.dp
            } else {
                80.dp
            }
        }

    val titleFontSize: TextUnit
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                30.sp
            } else if (screenWidth <= 360.dp) {
                16.sp
            } else if (screenWidth <= 420.dp) {
                22.sp
            } else {
                26.sp
            }
        }

    val subTitleFontSize: TextUnit
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                18.sp
            } else if (screenWidth <= 360.dp) {
                9.sp
            } else if (screenWidth <= 420.dp) {
                12.sp
            } else {
                14.sp
            }
        }

    val placeHolderFontSize: TextUnit
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                18.sp
            } else if (screenWidth <= 360.dp) {
                10.sp
            } else if (screenWidth <= 420.dp) {
                12.sp
            } else {
                12.sp
            }
        }

    val textFieldSymbleOneFontSize: TextUnit
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                22.sp
            } else if (screenWidth <= 360.dp) {
                20.sp
            } else if (screenWidth <= 420.dp) {
                20.sp
            } else {
                22.sp
            }
        }

    val buttonTextSize: TextUnit
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                18.sp
            } else if (screenWidth <= 360.dp) {
                11.sp
            } else if (screenWidth <= 420.dp) {
                13.sp
            } else {
                14.sp
            }
        }


    val buttonHeight: Dp
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                75.dp
            } else if (screenWidth <= 360.dp) {
                50.dp
            } else if (screenWidth <= 420.dp) {
                60.dp
            } else {
                65.dp
            }
        }





}