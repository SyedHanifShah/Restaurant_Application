package com.corn.cornpos.ui.screen.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001at\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\u000e\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0007\u001a;\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u00142!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\u0017\u001a\u00020\u0005H\u0007\u001a\u001a\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u001aO\u0010\u001d\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0004\u001a\u00020\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u000e\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aO\u0010\u001f\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\'\u0010\"\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001aO\u0010$\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020&2\'\u0010\"\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a8\u0006\'"}, d2 = {"AdsOnCategoryIemView", "", "adsOnCategory", "Lcom/corn/cornpos/data/database/AdsOn;", "selectedItem", "", "onItemClick", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "item", "DealsCard", "list", "", "Lcom/corn/cornpos/data/database/Products;", "onOrderRemove", "selectedDealCategoryAllProducts", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/corn/cornpos/data/database/OrderDetails;", "selectedDealItem", "Lcom/corn/cornpos/data/database/Deals;", "DealsCategoryThirdTab", "deal", "selectedName", "MenuScreen", "viewModel", "Lcom/corn/cornpos/ui/screen/menu/MenuViewModel;", "navController", "Landroidx/navigation/NavController;", "RecipeCard", "orderList", "SimpleCheckboxComponent", "multiModifier", "", "onselection", "adsOn", "SimpleCheckboxDeals", "itemSelectionRestrictions", "", "app_debug"})
public final class MenuScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, com.google.accompanist.pager.ExperimentalPagerApi.class, androidx.compose.material.ExperimentalMaterialApi.class})
    public static final void MenuScreen(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.menu.MenuViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DealsCategoryThirdTab(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Deals deal, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.corn.cornpos.data.database.Deals, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull
    java.lang.String selectedName) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void AdsOnCategoryIemView(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOn adsOnCategory, @org.jetbrains.annotations.NotNull
    java.lang.String selectedItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.corn.cornpos.data.database.AdsOn, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void RecipeCard(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Products> list, @org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.OrderDetails> orderList, @org.jetbrains.annotations.NotNull
    java.lang.String selectedItem, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.corn.cornpos.data.database.Products, kotlin.Unit> onItemClick) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void DealsCard(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Products> list, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.corn.cornpos.data.database.Products, kotlin.Unit> onItemClick, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.corn.cornpos.data.database.Products, kotlin.Unit> onOrderRemove, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.OrderDetails> selectedDealCategoryAllProducts, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Deals selectedDealItem) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SimpleCheckboxComponent(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.AdsOn> list, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.menu.MenuViewModel viewModel, boolean multiModifier, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<com.corn.cornpos.data.database.AdsOn>, kotlin.Unit> onselection) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void SimpleCheckboxDeals(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Products> list, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.menu.MenuViewModel viewModel, int itemSelectionRestrictions, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<com.corn.cornpos.data.database.Products>, kotlin.Unit> onselection) {
    }
}