package com.corn.cornpos.ui.screen.delivery;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020WJ\u0010\u0010[\u001a\u00020W2\u0006\u0010X\u001a\u00020\u001aH\u0002R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\rR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\rR+\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R+\u0010&\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b)\u0010%\u001a\u0004\b\'\u0010!\"\u0004\b(\u0010#R+\u0010*\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b-\u0010%\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R+\u0010.\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b3\u0010%\u001a\u0004\b/\u00100\"\u0004\b1\u00102R/\u00105\u001a\u0004\u0018\u0001042\b\u0010\u001e\u001a\u0004\u0018\u0001048F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010%\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020>\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010@R+\u0010A\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bC\u0010%\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R+\u0010D\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bG\u0010%\u001a\u0004\bE\u0010!\"\u0004\bF\u0010#R/\u0010H\u001a\u0004\u0018\u00010\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bM\u0010%\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010N\u001a\b\u0012\u0004\u0012\u00020\u001a0\n\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010\rR/\u0010P\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001c8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bU\u0010%\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T\u00a8\u0006\\"}, d2 = {"Lcom/corn/cornpos/ui/screen/delivery/DeliveryViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/corn/cornpos/repository/CornPosRepository;", "dataBaseRepository", "Lcom/corn/cornpos/repository/CornDataBaseRepository;", "application", "Landroid/content/Context;", "(Lcom/corn/cornpos/repository/CornPosRepository;Lcom/corn/cornpos/repository/CornDataBaseRepository;Landroid/content/Context;)V", "_canDelivery", "Lkotlinx/coroutines/flow/Flow;", "", "get_canDelivery", "()Lkotlinx/coroutines/flow/Flow;", "_canDineIn", "get_canDineIn", "_canTakeAway", "get_canTakeAway", "_clientConnString", "", "_isTableScreen", "_loginDatabaseData", "Lcom/corn/cornpos/data/database/LoginModel;", "get_loginDatabaseData", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/corn/cornpos/util/UiEvent;", "_userInfoDatabaseData", "Lcom/corn/cornpos/data/database/UserInfoModel;", "get_userInfoDatabaseData", "<set-?>", "canDelivery", "getCanDelivery", "()Z", "setCanDelivery", "(Z)V", "canDelivery$delegate", "Landroidx/compose/runtime/MutableState;", "canDineIn", "getCanDineIn", "setCanDineIn", "canDineIn$delegate", "canTakeAway", "getCanTakeAway", "setCanTakeAway", "canTakeAway$delegate", "clientConnString", "getClientConnString", "()Ljava/lang/String;", "setClientConnString", "(Ljava/lang/String;)V", "clientConnString$delegate", "Lcom/corn/cornpos/data/remote/dto/DashboardDto;", "dashboardDataFromApi", "getDashboardDataFromApi", "()Lcom/corn/cornpos/data/remote/dto/DashboardDto;", "setDashboardDataFromApi", "(Lcom/corn/cornpos/data/remote/dto/DashboardDto;)V", "dashboardDataFromApi$delegate", "getDataBaseRepository", "()Lcom/corn/cornpos/repository/CornDataBaseRepository;", "dataStore", "Lcom/corn/cornpos/data/CornPosDataStore;", "getDataStore", "()Lcom/corn/cornpos/data/CornPosDataStore;", "isTableScreen", "setTableScreen", "isTableScreen$delegate", "loadingDataFromApi", "getLoadingDataFromApi", "setLoadingDataFromApi", "loadingDataFromApi$delegate", "loginDatabaseData", "getLoginDatabaseData", "()Lcom/corn/cornpos/data/database/LoginModel;", "setLoginDatabaseData", "(Lcom/corn/cornpos/data/database/LoginModel;)V", "loginDatabaseData$delegate", "uiEvent", "getUiEvent", "userInfoDatabaseData", "getUserInfoDatabaseData", "()Lcom/corn/cornpos/data/database/UserInfoModel;", "setUserInfoDatabaseData", "(Lcom/corn/cornpos/data/database/UserInfoModel;)V", "userInfoDatabaseData$delegate", "onEvent", "", "event", "Lcom/corn/cornpos/ui/screen/delivery/DeliveryEvents;", "refreshData", "sentUiEvent", "app_debug"})
public final class DeliveryViewModel extends androidx.lifecycle.ViewModel {
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
    private final androidx.compose.runtime.MutableState canDineIn$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _canDelivery = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState canDelivery$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _canTakeAway = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState canTakeAway$delegate = null;
    
    @javax.inject.Inject
    public DeliveryViewModel(@org.jetbrains.annotations.NotNull
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
    
    public final boolean getCanDineIn() {
        return false;
    }
    
    public final void setCanDineIn(boolean p0) {
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
    com.corn.cornpos.ui.screen.delivery.DeliveryEvents event) {
    }
    
    private final void sentUiEvent(com.corn.cornpos.util.UiEvent event) {
    }
    
    public final void refreshData() {
    }
}