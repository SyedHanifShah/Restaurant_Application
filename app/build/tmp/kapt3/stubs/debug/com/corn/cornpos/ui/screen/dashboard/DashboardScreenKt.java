package com.corn.cornpos.ui.screen.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0007\u001a.\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u001a \u0010\r\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\u0006\u0010\u0015\u001a\u00020\u0016\u001a\u0006\u0010\u0017\u001a\u00020\u0016\u001a\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u0016\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"DashboardPreview", "", "DashboardScreen", "navController", "Landroidx/navigation/NavController;", "onNavigate", "Lkotlin/Function1;", "Lcom/corn/cornpos/util/UiEvent$Navigate;", "viewModel", "Lcom/corn/cornpos/ui/screen/dashboard/DashboardViewModel;", "OrderCardView", "order", "Lcom/corn/cornpos/data/remote/dto/Row;", "OrderListView", "ResponsiveDottedLine", "myColor", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "ResponsiveDottedLine-DxMtmZc", "(JLandroidx/compose/ui/Modifier;)V", "getCurrentDateFormat", "", "getCurrentTimeFormatted", "getOrderReamingTime", "dateString", "app_debug"})
public final class DashboardScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void DashboardScreen(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.corn.cornpos.util.UiEvent.Navigate, kotlin.Unit> onNavigate, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.dashboard.DashboardViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void OrderCardView(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.Row order, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.dashboard.DashboardViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void OrderListView(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.Row order, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.dashboard.DashboardViewModel viewModel) {
    }
    
    @org.jetbrains.annotations.Nullable
    public static final java.lang.String getOrderReamingTime(@org.jetbrains.annotations.NotNull
    java.lang.String dateString) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCurrentTimeFormatted() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getCurrentDateFormat() {
        return null;
    }
    
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.tooling.preview.Preview
    public static final void DashboardPreview() {
    }
}