package com.corn.cornpos.ui.screen.dashboard;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0082\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010w\u001a\u00020\u00102\u0006\u0010x\u001a\u00020yJ\u000e\u0010z\u001a\u00020\u00172\u0006\u0010{\u001a\u00020\u0017J\u000e\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020\u007fJ\u0007\u0010\u0080\u0001\u001a\u00020}J\u0011\u0010\u0081\u0001\u001a\u00020}2\u0006\u0010~\u001a\u00020\'H\u0002R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000eR&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u001cR\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000eR7\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"04X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R+\u00109\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b>\u00102\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010?\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bB\u00102\u001a\u0004\b@\u0010;\"\u0004\bA\u0010=R+\u0010C\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bF\u00102\u001a\u0004\bD\u0010;\"\u0004\bE\u0010=R+\u0010G\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bL\u00102\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR/\u0010N\u001a\u0004\u0018\u00010M2\b\u0010+\u001a\u0004\u0018\u00010M8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bS\u00102\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010V\u001a\u00020W\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010YR7\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b]\u00102\u001a\u0004\b[\u0010.\"\u0004\b\\\u00100R+\u0010^\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b`\u00102\u001a\u0004\b^\u0010;\"\u0004\b_\u0010=R+\u0010a\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bd\u00102\u001a\u0004\bb\u0010;\"\u0004\bc\u0010=R/\u0010e\u001a\u0004\u0018\u00010\u001f2\b\u0010+\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bj\u00102\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR7\u0010k\u001a\b\u0012\u0004\u0012\u00020\"0\u000b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\"0\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bn\u00102\u001a\u0004\bl\u0010.\"\u0004\bm\u00100R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010o\u001a\b\u0012\u0004\u0012\u00020\'0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010\u000eR/\u0010q\u001a\u0004\u0018\u00010)2\b\u0010+\u001a\u0004\u0018\u00010)8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bv\u00102\u001a\u0004\br\u0010s\"\u0004\bt\u0010u\u00a8\u0006\u0083\u0001"}, d2 = {"Lcom/corn/cornpos/ui/screen/dashboard/DashboardViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/corn/cornpos/repository/CornPosRepository;", "dataBaseRepository", "Lcom/corn/cornpos/repository/CornDataBaseRepository;", "application", "Landroid/content/Context;", "(Lcom/corn/cornpos/repository/CornPosRepository;Lcom/corn/cornpos/repository/CornDataBaseRepository;Landroid/content/Context;)V", "_AdsOnList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/corn/cornpos/data/database/AdsOn;", "get_AdsOnList", "()Lkotlinx/coroutines/flow/Flow;", "_canDelivery", "", "get_canDelivery", "_canDineIn", "get_canDineIn", "_canTakeAway", "get_canTakeAway", "_clientConnString", "", "_deals", "Lcom/corn/cornpos/data/database/Deals;", "get_deals", "set_deals", "(Lkotlinx/coroutines/flow/Flow;)V", "_isTableScreen", "_loginDatabaseData", "Lcom/corn/cornpos/data/database/LoginModel;", "get_loginDatabaseData", "_order", "Lcom/corn/cornpos/data/database/OrderDetails;", "get_order", "set_order", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/corn/cornpos/util/UiEvent;", "_userInfoDatabaseData", "Lcom/corn/cornpos/data/database/UserInfoModel;", "get_userInfoDatabaseData", "<set-?>", "adsOnList", "getAdsOnList", "()Ljava/util/List;", "setAdsOnList", "(Ljava/util/List;)V", "adsOnList$delegate", "Landroidx/compose/runtime/MutableState;", "alreadyAddedOrder", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "getAlreadyAddedOrder", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setAlreadyAddedOrder", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "canDelivery", "getCanDelivery", "()Z", "setCanDelivery", "(Z)V", "canDelivery$delegate", "canDineIn", "getCanDineIn", "setCanDineIn", "canDineIn$delegate", "canTakeAway", "getCanTakeAway", "setCanTakeAway", "canTakeAway$delegate", "clientConnString", "getClientConnString", "()Ljava/lang/String;", "setClientConnString", "(Ljava/lang/String;)V", "clientConnString$delegate", "Lcom/corn/cornpos/data/remote/dto/DashboardDto;", "dashboardDataFromApi", "getDashboardDataFromApi", "()Lcom/corn/cornpos/data/remote/dto/DashboardDto;", "setDashboardDataFromApi", "(Lcom/corn/cornpos/data/remote/dto/DashboardDto;)V", "dashboardDataFromApi$delegate", "getDataBaseRepository", "()Lcom/corn/cornpos/repository/CornDataBaseRepository;", "dataStore", "Lcom/corn/cornpos/data/CornPosDataStore;", "getDataStore", "()Lcom/corn/cornpos/data/CornPosDataStore;", "dealsList", "getDealsList", "setDealsList", "dealsList$delegate", "isTableScreen", "setTableScreen", "isTableScreen$delegate", "loadingDataFromApi", "getLoadingDataFromApi", "setLoadingDataFromApi", "loadingDataFromApi$delegate", "loginDatabaseData", "getLoginDatabaseData", "()Lcom/corn/cornpos/data/database/LoginModel;", "setLoginDatabaseData", "(Lcom/corn/cornpos/data/database/LoginModel;)V", "loginDatabaseData$delegate", "orderList", "getOrderList", "setOrderList", "orderList$delegate", "uiEvent", "getUiEvent", "userInfoDatabaseData", "getUserInfoDatabaseData", "()Lcom/corn/cornpos/data/database/UserInfoModel;", "setUserInfoDatabaseData", "(Lcom/corn/cornpos/data/database/UserInfoModel;)V", "userInfoDatabaseData$delegate", "checkOrderList", "dealIdL", "", "getTableDetailsFromJson", "jsonString", "onEvent", "", "event", "Lcom/corn/cornpos/ui/screen/dashboard/DashboardEvents;", "refreshData", "sentUiEvent", "TableDetailsDtoDeserializer", "app_debug"})
public final class DashboardViewModel extends androidx.lifecycle.ViewModel {
    private final com.corn.cornpos.repository.CornPosRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository = null;
    private final kotlinx.coroutines.channels.Channel<com.corn.cornpos.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState loadingDataFromApi$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.LoginModel> _loginDatabaseData = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState loginDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.UserInfoModel> _userInfoDatabaseData = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState userInfoDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final com.corn.cornpos.data.CornPosDataStore dataStore = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _clientConnString = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState clientConnString$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _isTableScreen = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState isTableScreen$delegate = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState dashboardDataFromApi$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _canDineIn = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.OrderDetails>> _order;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState orderList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.OrderDetails> alreadyAddedOrder;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.Deals>> _deals;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState dealsList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState canDineIn$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> _AdsOnList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState adsOnList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _canDelivery = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState canDelivery$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _canTakeAway = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState canTakeAway$delegate = null;
    
    @javax.inject.Inject
    public DashboardViewModel(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.repository.CornPosRepository repository, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.repository.CornDataBaseRepository getDataBaseRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final boolean getLoadingDataFromApi() {
        return false;
    }
    
    public final void setLoadingDataFromApi(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.LoginModel> get_loginDatabaseData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.corn.cornpos.data.database.LoginModel getLoginDatabaseData() {
        return null;
    }
    
    public final void setLoginDatabaseData(@org.jetbrains.annotations.Nullable
    com.corn.cornpos.data.database.LoginModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.UserInfoModel> get_userInfoDatabaseData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.corn.cornpos.data.database.UserInfoModel getUserInfoDatabaseData() {
        return null;
    }
    
    public final void setUserInfoDatabaseData(@org.jetbrains.annotations.Nullable
    com.corn.cornpos.data.database.UserInfoModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.CornPosDataStore getDataStore() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClientConnString() {
        return null;
    }
    
    public final void setClientConnString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean isTableScreen() {
        return false;
    }
    
    public final void setTableScreen(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.corn.cornpos.data.remote.dto.DashboardDto getDashboardDataFromApi() {
        return null;
    }
    
    public final void setDashboardDataFromApi(@org.jetbrains.annotations.Nullable
    com.corn.cornpos.data.remote.dto.DashboardDto p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> get_canDineIn() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.OrderDetails>> get_order() {
        return null;
    }
    
    public final void set_order(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.OrderDetails>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.database.OrderDetails> getOrderList() {
        return null;
    }
    
    public final void setOrderList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.OrderDetails> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.OrderDetails> getAlreadyAddedOrder() {
        return null;
    }
    
    public final void setAlreadyAddedOrder(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.OrderDetails> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Deals>> get_deals() {
        return null;
    }
    
    public final void set_deals(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.Deals>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.database.Deals> getDealsList() {
        return null;
    }
    
    public final void setDealsList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Deals> p0) {
    }
    
    public final boolean getCanDineIn() {
        return false;
    }
    
    public final void setCanDineIn(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> get_AdsOnList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.database.AdsOn> getAdsOnList() {
        return null;
    }
    
    public final void setAdsOnList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.AdsOn> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> get_canDelivery() {
        return null;
    }
    
    public final boolean getCanDelivery() {
        return false;
    }
    
    public final void setCanDelivery(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> get_canTakeAway() {
        return null;
    }
    
    public final boolean getCanTakeAway() {
        return false;
    }
    
    public final void setCanTakeAway(boolean p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.dashboard.DashboardEvents event) {
    }
    
    private final void sentUiEvent(com.corn.cornpos.util.UiEvent event) {
    }
    
    public final void refreshData() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableDetailsFromJson(@org.jetbrains.annotations.NotNull
    java.lang.String jsonString) {
        return null;
    }
    
    public final boolean checkOrderList(int dealIdL) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/corn/cornpos/ui/screen/dashboard/DashboardViewModel$TableDetailsDtoDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/corn/cornpos/data/remote/dto/TableDetailsDto;", "()V", "deserialize", "json", "Lcom/google/gson/JsonElement;", "typeOfT", "Ljava/lang/reflect/Type;", "context", "Lcom/google/gson/JsonDeserializationContext;", "app_debug"})
    public static final class TableDetailsDtoDeserializer implements com.google.gson.JsonDeserializer<com.corn.cornpos.data.remote.dto.TableDetailsDto> {
        
        public TableDetailsDtoDeserializer() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public com.corn.cornpos.data.remote.dto.TableDetailsDto deserialize(@org.jetbrains.annotations.NotNull
        com.google.gson.JsonElement json, @org.jetbrains.annotations.NotNull
        java.lang.reflect.Type typeOfT, @org.jetbrains.annotations.NotNull
        com.google.gson.JsonDeserializationContext context) {
            return null;
        }
    }
}