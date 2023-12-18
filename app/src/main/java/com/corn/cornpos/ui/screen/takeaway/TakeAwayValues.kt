package com.corn.cornpos.ui.screen.takeaway

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

object TakeAwayValues {

        val titleFontSize: TextUnit
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    20.sp
                } else if (screenWidth <= 360.dp) {
                    13.sp
                } else if (screenWidth <= 420.dp) {
                    15.sp
                } else {
                    17.sp
                }
            }

        val logoutFontSize: TextUnit
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    17.sp
                } else if (screenWidth <= 360.dp) {
                    10.sp
                } else if (screenWidth <= 420.dp) {
                    10.sp
                } else {
                    12.sp
                }
            }

        val mainContentTopPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    60.dp
                } else if (screenWidth <= 360.dp) {
                    55.dp
                } else if (screenWidth <= 420.dp) {
                    60.dp
                } else {
                    60.dp
                }
            }

        val normalTextFontSize: TextUnit
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    16.sp
                } else if (screenWidth <= 360.dp) {
                    9.sp
                } else if (screenWidth <= 420.dp) {
                    11.sp
                } else {
                    13.sp
                }
            }


    val titleTextCount: Int
        @Composable
        get() {
            val screenWidth = LocalConfiguration.current.screenWidthDp.dp
            return if (screenWidth > 600.dp) {
                30
            } else if (screenWidth <= 360.dp) {
                18
            } else if (screenWidth <= 420.dp) {
                18
            } else {
                25
            }
        }

        val topRowTopPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    30.dp
                } else if (screenWidth <= 360.dp) {
                    10.dp
                } else if (screenWidth <= 420.dp) {
                    10.dp
                } else {
                    30.dp
                }
            }


        val mainContentColumnTopPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    10.dp
                } else if (screenWidth <= 360.dp) {
                    5.dp
                } else if (screenWidth <= 420.dp) {
                    15.dp
                } else {
                    30.dp
                }
            }





        val columnHeight:Float
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    0.75f
                } else if (screenWidth <= 360.dp) {
                    0.62f
                } else if (screenWidth <= 420.dp) {
                    0.65f
                } else {
                    0.55f
                }
            }


            val buttonColumnHeight:Float
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    0.5f
                } else if (screenWidth <= 360.dp) {
                    0.3f
                } else if (screenWidth <= 420.dp) {
                    0.5f
                } else {
                    0.5f
                }
            }


        val gridBottomPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    20.dp
                } else if (screenWidth <= 360.dp) {
                    0.dp
                } else if (screenWidth <= 420.dp) {
                    0.dp
                } else {
                    20.dp
                }
            }



    val buttonColumnPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    30.dp
                } else if (screenWidth <= 360.dp) {
                    5.dp
                } else if (screenWidth <= 420.dp) {
                    5.dp
                } else {
                    30.dp
                }
            }


    val buttonColumnVerticalArrangement: Arrangement.Vertical
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    Arrangement.Center
                } else if (screenWidth <= 360.dp) {
                    Arrangement.Center
                } else if (screenWidth <= 420.dp) {
                    Arrangement.Center
                } else {
                    Arrangement.Center
                }
            }



        val orderCardViewHorizontalPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    52.dp
                } else if (screenWidth <= 360.dp) {
                    16.dp
                } else if (screenWidth <= 420.dp) {
                    16.dp
                } else {
                    16.dp
                }
            }

        val orderCardViewVerticalPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    32.dp
                } else if (screenWidth <= 360.dp) {
                    16.dp
                } else if (screenWidth <= 420.dp) {
                    16.dp
                } else {
                    16.dp
                }
            }

        val orderCardViewHeight: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    180.dp
                } else if (screenWidth <= 360.dp) {
                    100.dp
                } else if (screenWidth <= 420.dp) {
                    110.dp
                } else {
                    125.dp
                }
            }


        val orderCardViewIconSize: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    20.dp
                } else if (screenWidth <= 360.dp) {
                    17.dp
                } else if (screenWidth <= 420.dp) {
                    17.dp
                } else {
                    17.dp
                }
            }

        val orderListViewHorizontalPadding: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    42.dp
                } else if (screenWidth <= 360.dp) {
                    16.dp
                } else if (screenWidth <= 420.dp) {
                    16.dp
                } else {
                    16.dp
                }
            }

        val orderListViewHeight: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    90.dp
                } else if (screenWidth <= 360.dp) {
                    40.dp
                } else if (screenWidth <= 420.dp) {
                    50.dp
                } else {
                    50.dp
                }
            }




        val orderListViewWidth: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    600.dp
                } else if (screenWidth <= 360.dp) {
                    350.dp
                } else if (screenWidth <= 420.dp) {
                    350.dp
                } else {
                    350.dp
                }
            }


        val orderListViewIconSize: Dp
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    18.dp
                } else if (screenWidth <= 360.dp) {
                    12.dp
                } else if (screenWidth <= 420.dp) {
                    12.dp
                } else {
                    15.dp
                }
            }

        val orderListViewNormalTextFontSize: TextUnit
            @Composable
            get() {
                val screenWidth = LocalConfiguration.current.screenWidthDp.dp
                return if (screenWidth > 600.dp) {
                    15.sp
                } else if (screenWidth <= 360.dp) {
                    9.sp
                } else if (screenWidth <= 420.dp) {
                    10.sp
                } else {
                    12.sp
                }
            }






}