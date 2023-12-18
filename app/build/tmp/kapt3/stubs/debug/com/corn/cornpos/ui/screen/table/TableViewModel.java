package com.corn.cornpos.ui.screen.table;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u008d\u0001\u001a\u00030\u008e\u00012\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001J\u0013\u0010\u0091\u0001\u001a\u00030\u008e\u00012\u0007\u0010\u008f\u0001\u001a\u00020%H\u0002R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R&\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000f0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u000f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0012R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020\'0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0012R+\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00101\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b2\u00103\"\u0004\b4\u00105R7\u00108\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b=\u00100\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R \u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010E\u001a\u00020F\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR+\u0010I\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bL\u00100\u001a\u0004\bJ\u0010,\"\u0004\bK\u0010.R+\u0010M\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bQ\u00100\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR+\u0010R\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\u00148F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bU\u00100\u001a\u0004\bS\u0010N\"\u0004\bT\u0010PR/\u0010V\u001a\u0004\u0018\u00010\u00162\b\u0010)\u001a\u0004\u0018\u00010\u00168F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b[\u00100\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR/\u0010]\u001a\u0004\u0018\u00010\\2\b\u0010)\u001a\u0004\u0018\u00010\\8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bb\u00100\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR7\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u000f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bf\u00100\u001a\u0004\bd\u0010:\"\u0004\be\u0010<R&\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000f0hX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010m\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bp\u00107\u001a\u0004\bn\u00103\"\u0004\bo\u00105R7\u0010q\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bt\u00100\u001a\u0004\br\u0010:\"\u0004\bs\u0010<R+\u0010u\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bx\u00100\u001a\u0004\bv\u0010,\"\u0004\bw\u0010.R7\u0010y\u001a\b\u0012\u0004\u0012\u00020!0\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020!0\u000f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b|\u00100\u001a\u0004\bz\u0010:\"\u0004\b{\u0010<R8\u0010}\u001a\b\u0012\u0004\u0012\u00020@0\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020@0\u000f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0013\n\u0005\b\u0080\u0001\u00100\u001a\u0004\b~\u0010:\"\u0004\b\u007f\u0010<R$\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00020\u000b0\u0082\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010:\"\u0005\b\u0084\u0001\u0010<R\u0019\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020%0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010\u0012R5\u0010\u0087\u0001\u001a\u0004\u0018\u00010\'2\b\u0010)\u001a\u0004\u0018\u00010\'8F@FX\u0086\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u008c\u0001\u00100\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001\u00a8\u0006\u0092\u0001"}, d2 = {"Lcom/corn/cornpos/ui/screen/table/TableViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/corn/cornpos/repository/CornPosRepository;", "dataBaseRepository", "Lcom/corn/cornpos/repository/CornDataBaseRepository;", "application", "Landroid/content/Context;", "(Lcom/corn/cornpos/repository/CornPosRepository;Lcom/corn/cornpos/repository/CornDataBaseRepository;Landroid/content/Context;)V", "_clientConnString", "Lkotlinx/coroutines/flow/Flow;", "", "_coverTable", "", "_customerDatabaseData", "", "Lcom/corn/cornpos/data/database/Customer;", "get_customerDatabaseData", "()Lkotlinx/coroutines/flow/Flow;", "_isTableAlreadySelected", "", "_loginDatabaseData", "Lcom/corn/cornpos/data/database/LoginModel;", "get_loginDatabaseData", "_order", "Lcom/corn/cornpos/data/database/OrderDetails;", "get_order", "set_order", "(Lkotlinx/coroutines/flow/Flow;)V", "_selectedTable", "_selectedTableList", "_selectedTableName", "_tableDatabaseData", "Lcom/corn/cornpos/data/database/Table;", "get_tableDatabaseData", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/corn/cornpos/util/UiEvent;", "_userInfoDatabaseData", "Lcom/corn/cornpos/data/database/UserInfoModel;", "get_userInfoDatabaseData", "<set-?>", "clientConnString", "getClientConnString", "()Ljava/lang/String;", "setClientConnString", "(Ljava/lang/String;)V", "clientConnString$delegate", "Landroidx/compose/runtime/MutableState;", "coverTable", "getCoverTable", "()I", "setCoverTable", "(I)V", "coverTable$delegate", "Landroidx/compose/runtime/MutableIntState;", "customerDatabaseData", "getCustomerDatabaseData", "()Ljava/util/List;", "setCustomerDatabaseData", "(Ljava/util/List;)V", "customerDatabaseData$delegate", "customerNameList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/corn/cornpos/data/remote/dto/MasterRow;", "getCustomerNameList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "setCustomerNameList", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "dataStore", "Lcom/corn/cornpos/data/CornPosDataStore;", "getDataStore", "()Lcom/corn/cornpos/data/CornPosDataStore;", "editCoverTable", "getEditCoverTable", "setEditCoverTable", "editCoverTable$delegate", "isTableAlreadySelected", "()Z", "setTableAlreadySelected", "(Z)V", "isTableAlreadySelected$delegate", "loadingDataFromApi", "getLoadingDataFromApi", "setLoadingDataFromApi", "loadingDataFromApi$delegate", "loginDatabaseData", "getLoginDatabaseData", "()Lcom/corn/cornpos/data/database/LoginModel;", "setLoginDatabaseData", "(Lcom/corn/cornpos/data/database/LoginModel;)V", "loginDatabaseData$delegate", "Lcom/corn/cornpos/data/remote/dto/MasterData;", "masterDataFromApi", "getMasterDataFromApi", "()Lcom/corn/cornpos/data/remote/dto/MasterData;", "setMasterDataFromApi", "(Lcom/corn/cornpos/data/remote/dto/MasterData;)V", "masterDataFromApi$delegate", "orderList", "getOrderList", "setOrderList", "orderList$delegate", "pages", "Landroidx/compose/runtime/MutableState;", "getPages", "()Landroidx/compose/runtime/MutableState;", "setPages", "(Landroidx/compose/runtime/MutableState;)V", "selectedTable", "getSelectedTable", "setSelectedTable", "selectedTable$delegate", "selectedTableList", "getSelectedTableList", "setSelectedTableList", "selectedTableList$delegate", "selectedTableName", "getSelectedTableName", "setSelectedTableName", "selectedTableName$delegate", "tableDatabaseData", "getTableDatabaseData", "setTableDatabaseData", "tableDatabaseData$delegate", "tablesList", "getTablesList", "setTablesList", "tablesList$delegate", "tablist", "", "getTablist", "setTablist", "uiEvent", "getUiEvent", "userInfoDatabaseData", "getUserInfoDatabaseData", "()Lcom/corn/cornpos/data/database/UserInfoModel;", "setUserInfoDatabaseData", "(Lcom/corn/cornpos/data/database/UserInfoModel;)V", "userInfoDatabaseData$delegate", "onEvent", "", "event", "Lcom/corn/cornpos/ui/screen/table/TableEvents;", "sentUiEvent", "app_debug"})
public final class TableViewModel extends androidx.lifecycle.ViewModel {
    private final com.corn.cornpos.repository.CornPosRepository repository = null;
    private final com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.corn.cornpos.data.CornPosDataStore dataStore = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState loadingDataFromApi$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.LoginModel> _loginDatabaseData = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState loginDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Table>> _tableDatabaseData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tableDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Customer>> _customerDatabaseData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState customerDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.UserInfoModel> _userInfoDatabaseData = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState userInfoDatabaseData$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _clientConnString = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState clientConnString$delegate = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState masterDataFromApi$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _selectedTable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState selectedTable$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _selectedTableName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedTableName$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> _selectedTableList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedTableList$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _isTableAlreadySelected = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState isTableAlreadySelected$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _coverTable = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState coverTable$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState editCoverTable$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tablesList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.String> tablist;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.OrderDetails>> _order;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState orderList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> pages;
    private final kotlinx.coroutines.channels.Channel<com.corn.cornpos.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.remote.dto.MasterRow> customerNameList;
    
    @javax.inject.Inject
    public TableViewModel(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.repository.CornPosRepository repository, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.CornPosDataStore getDataStore() {
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
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Table>> get_tableDatabaseData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.database.Table> getTableDatabaseData() {
        return null;
    }
    
    public final void setTableDatabaseData(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Table> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Customer>> get_customerDatabaseData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.database.Customer> getCustomerDatabaseData() {
        return null;
    }
    
    public final void setCustomerDatabaseData(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Customer> p0) {
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
    public final java.lang.String getClientConnString() {
        return null;
    }
    
    public final void setClientConnString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.corn.cornpos.data.remote.dto.MasterData getMasterDataFromApi() {
        return null;
    }
    
    public final void setMasterDataFromApi(@org.jetbrains.annotations.Nullable
    com.corn.cornpos.data.remote.dto.MasterData p0) {
    }
    
    public final int getSelectedTable() {
        return 0;
    }
    
    public final void setSelectedTable(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedTableName() {
        return null;
    }
    
    public final void setSelectedTableName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getSelectedTableList() {
        return null;
    }
    
    public final void setSelectedTableList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean isTableAlreadySelected() {
        return false;
    }
    
    public final void setTableAlreadySelected(boolean p0) {
    }
    
    public final int getCoverTable() {
        return 0;
    }
    
    public final void setCoverTable(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEditCoverTable() {
        return null;
    }
    
    public final void setEditCoverTable(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.remote.dto.MasterRow> getTablesList() {
        return null;
    }
    
    public final void setTablesList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.remote.dto.MasterRow> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getTablist() {
        return null;
    }
    
    public final void setTablist(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> p0) {
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
    public final androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> getPages() {
        return null;
    }
    
    public final void setPages(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.util.List<java.lang.String>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> getUiEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.remote.dto.MasterRow> getCustomerNameList() {
        return null;
    }
    
    public final void setCustomerNameList(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.remote.dto.MasterRow> p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.table.TableEvents event) {
    }
    
    private final void sentUiEvent(com.corn.cornpos.util.UiEvent event) {
    }
}