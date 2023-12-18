package com.corn.cornpos.ui.screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001aV\u0010\u0015\u001a\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0005H\u0007\u00a8\u0006\u001b"}, d2 = {"BottomBar", "", "navController", "Landroidx/navigation/NavHostController;", "isTableScreen", "", "viewModel", "Lcom/corn/cornpos/ui/screen/dashboard/DashboardViewModel;", "canDelivery", "canTakeAway", "canDineIn", "orderDetailsViewModel", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderDetailsViewModel;", "tableNo", "", "tableCover", "customer", "", "MainScreen", "activity", "Lcom/corn/cornpos/MainActivity;", "AddItem", "Landroidx/compose/foundation/layout/RowScope;", "screen", "Lcom/corn/cornpos/util/NavigationScreen;", "currentDestination", "Landroidx/navigation/NavDestination;", "app_debug"})
public final class MainScreenKt {
    
    @androidx.compose.runtime.Composable
    public static final void MainScreen(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.MainActivity activity) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void BottomBar(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, boolean isTableScreen, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.dashboard.DashboardViewModel viewModel, boolean canDelivery, boolean canTakeAway, boolean canDineIn, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.orderDetail.OrderDetailsViewModel orderDetailsViewModel, int tableNo, int tableCover, @org.jetbrains.annotations.NotNull
    java.lang.String customer) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AddItem(@org.jetbrains.annotations.NotNull
    androidx.compose.foundation.layout.RowScope $this$AddItem, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.util.NavigationScreen screen, @org.jetbrains.annotations.Nullable
    androidx.navigation.NavDestination currentDestination, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.dashboard.DashboardViewModel viewModel, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.orderDetail.OrderDetailsViewModel orderDetailsViewModel, int tableNo, int tableCover, @org.jetbrains.annotations.NotNull
    java.lang.String customer, boolean canDineIn) {
    }
}