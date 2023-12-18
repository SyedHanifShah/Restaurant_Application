package com.corn.cornpos.ui.screen.table

import android.util.Log
import androidx.activity.compose.BackHandler
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
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
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
import androidx.compose.runtime.saveable.rememberSaveable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.ResourcesCompat
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.corn.cornpos.R
import com.corn.cornpos.data.database.Table
import com.corn.cornpos.util.NavigationScreen
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.pagerTabIndicatorOffset
import com.google.accompanist.pager.rememberPagerState
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class,
    ExperimentalComposeUiApi::class
)
@Composable
fun TableScreen(
    viewModel: TableViewModel = hiltViewModel(),
    navController: NavController
) {
    val snackbarHostState = remember { SnackbarHostState() }
    val context = LocalContext.current
    val regularFont = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins)
    val fontMedium = ResourcesCompat.getFont(context, com.corn.cornpos.R.font.poppins_medium)
    val systemUiController = rememberSystemUiController()
    var text by rememberSaveable { mutableStateOf("Select Customer") }
    var active by rememberSaveable { mutableStateOf(false) }
    val keyboardController = LocalSoftwareKeyboardController.current
    val focusManager = LocalFocusManager.current
    var localSelected by remember {
        mutableStateOf(0)
    }

    val configuration = LocalConfiguration.current
    val screenWidth = configuration.screenWidthDp.dp
    val font = if (screenWidth > 600.dp) {
        17.sp
    } else if (screenWidth <= 360.dp) {
        9.sp
    } else if (screenWidth <= 420.dp) {
        11.sp
    }else {
        13.sp
    }
    val searchBarWidth = if (screenWidth > 600.dp) {
        0.9f
    }else if (screenWidth <= 360.dp) {
        0.7f
    } else if (screenWidth <= 420.dp) {
        0.75f
    }else {
        0.8f
    }

    LaunchedEffect(
        key1 = viewModel.coverTable,
        key2 = viewModel.selectedTableName,
        key3 = text,
        block = {
            if (viewModel.coverTable != 0 && viewModel.selectedTableName != "" && viewModel.isTableAlreadySelected) {
                navController.navigate(NavigationScreen.MenuScreen.route)
                viewModel.dataStore.savesTableAlreadySelected(false)
            }

        })

    BackHandler(viewModel.orderList.isNotEmpty()) {
        navController.navigate(NavigationScreen.OrderDetailScreen.route){
            popUpTo(NavigationScreen.DashboardScreen.route)
            launchSingleTop
        }
    }


    val titleFontSize = if (screenWidth > 600.dp) {
        20.sp
    } else if (screenWidth <= 360.dp) {
        13.sp
    } else if (screenWidth <= 420.dp) {
        13.sp
    } else {
        17.sp
    }
    val titlePadding = if (screenWidth > 600.dp) {
        10.dp
    } else if (screenWidth <= 360.dp) {
        0.dp
    }else if (screenWidth <= 420.dp) {
        0.dp
    } else {
        10.dp
    }

    DisposableEffect(systemUiController) {
        systemUiController.setSystemBarsColor(
            color = Color(0xFFDB5734)
        )
        systemUiController.setNavigationBarColor(color = Color.White)
        onDispose {}
    }



    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) },
        containerColor = Color(0XFFF4F8FD),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Selection", fontFamily = FontFamily(regularFont!!),
                        color = Color.White,
                        fontSize = titleFontSize,
                        modifier = Modifier
                            .padding(top = titlePadding)
                            .fillMaxWidth()
                            .wrapContentWidth(align = Alignment.CenterHorizontally)
                    )
                },
                colors = TopAppBarDefaults.largeTopAppBarColors(
                    containerColor = Color(0XFFDB5734)
                )

            )


        },
    ) { padding ->
        padding


        val topPadding = if (screenWidth > 600.dp) {
            95.dp
        } else if (screenWidth <= 360.dp) {
            70.dp
        } else if (screenWidth <= 420.dp) {
            70.dp
        } else {
            85.dp
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = topPadding)
                .fillMaxWidth()
        ) {
            val searchBarFont = if (screenWidth > 600.dp) {
                17.sp
            }else if (screenWidth <= 360.dp) {
                9.sp
            } else if (screenWidth <= 420.dp) {
                11.sp
            } else {
                15.sp
            }
            val searchBoxHeight = if (screenWidth > 600.dp) {
                55.dp
            } else if (screenWidth <= 360.dp) {
                40.dp
            } else if (screenWidth <= 420.dp) {
                40.dp
            } else {
                50.dp
            }
            Row(
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .background(Color.White, RoundedCornerShape(10.dp))
                    .fillMaxWidth(0.9f)
            ) {

                SearchBar(
                    query = text,
                    onQueryChange = {
                        text = it
                    },
                    onSearch = {
                        viewModel.onEvent(TableEvents.OnNameSearched("Walk In Customer", 0))
                        text = "Select Customer"
                        CoroutineScope(Dispatchers.IO).launch {
                            viewModel.dataStore.savesTableAlreadySelected(true)
                        }
                        active = false
                    },
                    active = active,
                    onActiveChange = {
                        active = it
                        if (!it && text == "") {
                            text = "Select Customer"
                        } else {
                            text = ""
                        }
                    },
                    shape = RoundedCornerShape(10.dp),
                    placeholder = {
                        Text(
                            text = "Select Customer",
                            fontSize = searchBarFont,
                            color = Color(0XFF576574),
                            fontFamily = FontFamily(regularFont!!)
                        )
                    },
                    colors = SearchBarDefaults.colors(
                        containerColor = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth(searchBarWidth)

                ) {
                    Log.d("TAG", "TableScreen: ${text}")
                    val ite = viewModel.customerNameList.filter { item ->
                        item.CustomerName.contains(text, true)
                    }
                    Log.d("TAG", "TableScreen: ${ite}")

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                    ) {
                        LazyColumn(content = {
                            items(items = ite) {
                                Box(
                                    contentAlignment = Alignment.CenterStart,
                                    modifier = Modifier
                                        .padding(
                                            start = 20.dp,
                                            top = 5.dp,
                                            end = 5.dp
                                        )
                                        .clickable {
                                            text = it.CustomerName
                                            viewModel.onEvent(
                                                TableEvents.OnNameSearched(
                                                    text,
                                                    it.CustomerID
                                                )
                                            )
                                            CoroutineScope(Dispatchers.IO).launch {
                                                viewModel.dataStore.savesTableAlreadySelected(true)
                                            }

                                            active = false
                                        },
                                ) {
                                    Text(
                                        text = it.CustomerName,
                                        fontSize = searchBarFont,
                                        color = Color(0XFF576574),
                                        fontFamily = FontFamily(regularFont!!)
                                    )
                                }
                            }
                        })
                    }

                }
                val icon = if (screenWidth > 600.dp) {
                    22.dp
                }else if (screenWidth <= 360.dp) {
                    18.dp
                } else if (screenWidth <= 420.dp) {
                    18.dp
                } else {
                    22.dp
                }
                if (!active) {
                    Text(
                        text = "|",
                        color = Color(0XFF576574),
                        fontWeight = FontWeight.Bold,
                        fontSize = 23.sp,
                        modifier = Modifier.padding()
                    )
                    Spacer(modifier = Modifier.width(30.dp))
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier
                            .height(searchBoxHeight)
                            .padding()
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = "Search",
                            tint = Color(0XFF576574),
                            modifier = Modifier.size(icon)
                        )
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                }
            }
            val searchBottomSpace = if (screenWidth > 600.dp) {
                20.dp
            } else if (screenWidth <= 360.dp) {
                10.dp
            } else if (screenWidth <= 420.dp) {
                10.dp
            } else {
                20.dp
            }

            Spacer(modifier = Modifier.height(searchBottomSpace))
            val rowHeight = if (screenWidth > 600.dp) {
                50.dp
            } else if (screenWidth <= 360.dp) {
                47.dp
            } else if (screenWidth <= 420.dp) {
                47.dp
            } else {
                50.dp
            }
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .background(Color.White, RoundedCornerShape(10.dp))
                    .height(rowHeight)
                    .fillMaxWidth(0.9f)
            ) {

                Icon(painter = painterResource(id = R.drawable.minus), contentDescription = "Add",
                    tint = Color(0XFF576574),
                    modifier = Modifier
                        .size(16.dp)
                        .clickable {
                            if (viewModel.coverTable > 0) {
                                viewModel.coverTable--
                                viewModel.editCoverTable = viewModel.coverTable.toString()
                                viewModel.onEvent(TableEvents.OnCoverTableChange(viewModel.coverTable))
                            }
                            if (viewModel.editCoverTable == "0") {
                                viewModel.editCoverTable = ""
                            }
                        }
                )

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.width(150.dp)
                ) {
                    TextField(
                        value = viewModel.editCoverTable, onValueChange = {
                            viewModel.editCoverTable = it
                            if (it.isNotBlank()) {
                                viewModel.coverTable = convertStringToInt(it)
                                viewModel.onEvent(TableEvents.OnCoverTableChange(viewModel.coverTable))
                            }
                            if (it == "0") {
                                viewModel.editCoverTable = ""
                            }

                        },
                        placeholder = {

                            Text(
                                text = "Cover Table",
                                fontSize = searchBarFont,
                                color = Color(0XFF576574),
                                fontFamily = FontFamily(regularFont!!),
                                textAlign = TextAlign.Center
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.White,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Done),
                        keyboardActions = KeyboardActions(onDone = {
                            keyboardController?.hide()
                            focusManager.clearFocus()
                        }),
                        textStyle = TextStyle(
                            textAlign = TextAlign.Center
                        )

                    )
                }


                Icon(painter = painterResource(id = R.drawable.add), contentDescription = "Minus",
                    tint = Color(0XFF576574),
                    modifier = Modifier
                        .size(16.dp)
                        .clickable {
                            viewModel.coverTable++
                            viewModel.editCoverTable = viewModel.coverTable.toString()
                            viewModel.onEvent(TableEvents.OnCoverTableChange(viewModel.coverTable))
                        }
                )


            }


            val scope = rememberCoroutineScope()
            val pagerState = rememberPagerState()

            val topTabPadding = if (screenWidth > 600.dp) {
                30.dp
            } else if (screenWidth <= 360.dp) {
                20.dp
            } else if (screenWidth <= 420.dp) {
                20.dp
            } else {
                30.dp
            }
            val tabBarHeight = if (screenWidth > 600.dp) {
                30.dp
            }else if (screenWidth <= 360.dp) {
                20.dp
            } else if (screenWidth <= 420.dp) {
                25.dp
            } else {
                25.dp
            }

            val tabBarLineHeight = if (screenWidth > 600.dp) {
                4.dp
            }else if (screenWidth <= 360.dp) {
                1.dp
            } else if (screenWidth <= 420.dp) {
                2.dp
            } else {
                3.dp
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(top = topTabPadding)
            ) {
                TabRow(
                    selectedTabIndex = pagerState.currentPage,
                    indicator = { tabPositions ->
                        TabRowDefaults.Indicator(
                            Modifier
                                .pagerTabIndicatorOffset(pagerState, tabPositions)
                                .background(color = Color(0xFFDB5734))
                                .size(tabBarLineHeight),
                            color = Color(0xFFF67C3F)
                        )
                    }, backgroundColor = Color(0XFFF4F8FD),
                    divider = {},
                    modifier = Modifier.height(tabBarHeight)
                ) {
                    viewModel.pages.value.forEachIndexed { index, icon ->
                        Tab(
                            icon = {
                                Text(
                                    text = icon,
                                    fontSize = 12.sp,
                                    color = if (pagerState.currentPage == index) Color(0xFFF67C3F) else Color.Black,
                                    textAlign = TextAlign.Start,
                                    fontFamily = FontFamily(fontMedium!!),
                                    modifier =Modifier.padding(horizontal = 5.dp)
                                )
                            },
                            selected = pagerState.currentPage == index,
                            onClick = {
                                scope.launch {
                                    pagerState.animateScrollToPage(index)
                                }
                            },
                            modifier = Modifier.width(90.dp)
                        )
                    }
                }
                val list = viewModel.tableDatabaseData
                val selectedTableList = viewModel.selectedTableList

                val filteredList = list.filterNot { item ->
                    selectedTableList.contains(item.TableNo)
                }

                val pagerPage = viewModel.pages.value


                val topPadding1 = if (screenWidth > 600.dp) {
                    35.dp
                }else if (screenWidth <= 360.dp) {
                    5.dp
                } else if (screenWidth <= 420.dp) {
                    5.dp
                } else {
                    35.dp
                }
                val bottomPadding1 = if (screenWidth > 600.dp) {
                    115.dp
                }else if (screenWidth <= 360.dp) {
                    80.dp
                }else if (screenWidth <= 420.dp) {
                    80.dp
                }  else {
                    115.dp
                }

                 val cardHeight = if (screenWidth > 600.dp) {
                   95.dp
                }else if (screenWidth <= 360.dp) {
                     75.dp
                } else if (screenWidth <= 420.dp) {
                     75.dp
                 } else {
                     95.dp
                }


                HorizontalPager(
                    count = viewModel.pages.value.size,
                    modifier = Modifier,
                    state = pagerState
                ) { page ->
                    when (page) {
                        0 -> {
                            if (filteredList != null) {
                                filteredList.sortedBy { it.TableID }
                                LazyVerticalGrid(
                                    columns = GridCells.Fixed(4),
                                    modifier = Modifier
                                        .padding(top = topPadding1, bottom = bottomPadding1)
                                        .fillMaxHeight(),
                                    content = {
                                        items(items = filteredList) {
                                            Card(
                                                modifier = Modifier
                                                    .clickable {
                                                        if (viewModel.selectedTable == it.TableID) {
                                                            viewModel.onEvent(TableEvents.OnTableUnSelection)
                                                        } else {
                                                            viewModel.onEvent(
                                                                TableEvents.OnTableSelection(
                                                                    table = it.TableID,
                                                                    floorName = it.FloorName,
                                                                    tableName = it.TableNo,
                                                                )
                                                            )
                                                            localSelected = it.TableID

                                                        }
                                                    }
                                                    .height(cardHeight)
                                                    .padding(8.dp),
                                                elevation = 5.dp,
                                                shape = RoundedCornerShape(10.dp),
                                            ) {
                                                Box(
                                                    contentAlignment = Alignment.Center,
                                                    modifier = Modifier.background(
                                                        if (viewModel.selectedTable == it.TableID) {
                                                            Color(0XFFF39C12)
                                                        } else {
                                                            Color.White
                                                        }

                                                    )
                                                ) {
                                                    Text(
                                                        text = "${it.TableNo}",
                                                        fontSize = font,
                                                        textAlign = TextAlign.Center
                                                    )


                                                }
                                            }

                                        }
                                    })
                            } else {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {

                                    CircularProgressIndicator(
                                        color = Color(0XFFF39C12)
                                    )
                                }
                            }
                        }

                        else ->{
                            if (filteredList != null) {
                                filteredList.sortedBy { it.TableID }
                                if (pagerPage.size >= 2) {
                                    val secondTab = filteredList?.filter { table ->
                                        table.FloorName == pagerPage[page]
                                    }
                                    if (secondTab != null) {

                                        LazyVerticalGrid(
                                            columns = GridCells.Fixed(4),
                                            modifier = Modifier
                                                .padding(top = topPadding1, bottom = bottomPadding1)
                                                .fillMaxHeight(),
                                            content = {
                                                items(items = secondTab) {
                                                    Card(
                                                        modifier = Modifier
                                                            .clickable {
                                                                if (viewModel.selectedTable == it.TableID) {
                                                                    viewModel.onEvent(TableEvents.OnTableUnSelection)
                                                                } else {
                                                                    viewModel.onEvent(
                                                                        TableEvents.OnTableSelection(
                                                                            table = it.TableID,
                                                                            floorName = it.FloorName,
                                                                            tableName = it.TableNo,
                                                                        )
                                                                    )
                                                                    localSelected = it.TableID

                                                                }
                                                            }
                                                            .height(cardHeight)
                                                            .padding(8.dp),
                                                        elevation = 5.dp,
                                                        shape = RoundedCornerShape(10.dp),
                                                    ) {
                                                        Box(
                                                            contentAlignment = Alignment.Center,
                                                            modifier = Modifier.background(
                                                                if (viewModel.selectedTable == it.TableID) {
                                                                    Color(0XFFF39C12)
                                                                } else {
                                                                    Color.White
                                                                }

                                                            )
                                                        ) {
                                                            Text(
                                                                text = "${it.TableNo}",
                                                                fontSize = font,
                                                                textAlign = TextAlign.Center
                                                            )


                                                        }
                                                    }
                                                }
                                            })
                                    }
                                }
                            } else {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier.fillMaxSize()
                                ) {

                                    CircularProgressIndicator(
                                        color = Color(0XFFF39C12)
                                    )
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}

fun convertStringToInt(input: String): Int {
    val newString = input.replace("\\D".toRegex(), "")
    return newString.toInt()
}
