package com.corn.cornpos.ui.screen.pin

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


object PinScreenValues {


    val searchBarWidth: Float
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                0.85f
            } else if (screenWidth <= 360.dp) {
                0.65f
            } else if (screenWidth <= 420.dp) {
                0.75f
            } else {
                0.7f
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


    val bellowImageColumnHeight: Float
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                0.5f
            } else if (screenWidth <= 360.dp) {
                0.65f
            } else if (screenWidth <= 420.dp) {
                0.55f
            } else {
                0.5f
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
                12.sp
            } else if (screenWidth <= 420.dp) {
                13.sp
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

    val textFieldSymbleFontSize: TextUnit
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

        val textFieldSymble2FontSize: TextUnit
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                20.sp
            } else if (screenWidth <= 360.dp) {
                12.sp
            } else if (screenWidth <= 420.dp) {
                15.sp
            } else {
                20.sp
            }
        }

    val buttonHeightSize: Dp
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                75.dp
            } else if (screenWidth <= 360.dp) {
                50.dp
            } else if (screenWidth <= 420.dp) {
                55.dp
            } else {
                65.dp
            }
        }

    val buttonTopSpacerHeight: Dp
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                40.dp
            } else if (screenWidth <= 360.dp) {
                20.dp
            } else if (screenWidth <= 420.dp) {
                20.dp
            } else {
                40.dp
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
                12.sp
            } else {
                14.sp
            }
        }


}




