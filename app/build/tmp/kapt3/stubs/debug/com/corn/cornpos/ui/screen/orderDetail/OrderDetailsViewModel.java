package com.corn.cornpos.ui.screen.orderDetail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u00a5\u0001\u001a\u00020\u00132\u0007\u0010\u00a6\u0001\u001a\u00020\u0013J\u0012\u0010\u00a7\u0001\u001a\u00030\u00a8\u00012\b\u0010\u00a9\u0001\u001a\u00030\u00aa\u0001J\u0013\u0010\u00ab\u0001\u001a\u00030\u00a8\u00012\u0007\u0010\u00a9\u0001\u001a\u00020.H\u0002R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\rR&\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00180\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u001cR\u0016\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u0002000\n\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\rR+\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010:\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b;\u00105\"\u0004\b<\u00107R+\u0010>\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\b?\u00105\"\u0004\b@\u00107R+\u0010B\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bG\u00109\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR+\u0010H\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR+\u0010O\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bR\u00109\u001a\u0004\bP\u0010D\"\u0004\bQ\u0010FR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010U\u001a\u00020V\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010XR \u0010Y\u001a\b\u0012\u0004\u0012\u00020[0ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R7\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bc\u00109\u001a\u0004\ba\u0010]\"\u0004\bb\u0010_R+\u0010d\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bg\u00109\u001a\u0004\be\u00105\"\u0004\bf\u00107R+\u0010h\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bk\u0010N\u001a\u0004\bi\u0010J\"\u0004\bj\u0010LR \u0010l\u001a\b\u0012\u0004\u0012\u00020m0ZX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010]\"\u0004\bo\u0010_R+\u0010p\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\br\u00109\u001a\u0004\bp\u00105\"\u0004\bq\u00107R/\u0010s\u001a\u0004\u0018\u00010\u001f2\b\u00102\u001a\u0004\u0018\u00010\u001f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bx\u00109\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR+\u0010y\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b|\u00109\u001a\u0004\bz\u0010D\"\u0004\b{\u0010FR!\u0010}\u001a\b\u0012\u0004\u0012\u00020~0ZX\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010]\"\u0005\b\u0080\u0001\u0010_R;\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\"0\u00182\f\u00102\u001a\b\u0012\u0004\u0012\u00020\"0\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0084\u0001\u00109\u001a\u0005\b\u0082\u0001\u0010]\"\u0005\b\u0083\u0001\u0010_R/\u0010\u0085\u0001\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0088\u0001\u0010N\u001a\u0005\b\u0086\u0001\u0010J\"\u0005\b\u0087\u0001\u0010LR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R/\u0010\u0089\u0001\u001a\u00020\u00152\u0006\u00102\u001a\u00020\u00158F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u008c\u0001\u0010N\u001a\u0005\b\u008a\u0001\u0010J\"\u0005\b\u008b\u0001\u0010LR/\u0010\u008d\u0001\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0090\u0001\u00109\u001a\u0005\b\u008e\u0001\u0010D\"\u0005\b\u008f\u0001\u0010FR/\u0010\u0091\u0001\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0094\u0001\u00109\u001a\u0005\b\u0092\u0001\u0010D\"\u0005\b\u0093\u0001\u0010FR/\u0010\u0095\u0001\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0098\u0001\u00109\u001a\u0005\b\u0096\u0001\u0010D\"\u0005\b\u0097\u0001\u0010FR/\u0010\u0099\u0001\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00138F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u009c\u0001\u00109\u001a\u0005\b\u009a\u0001\u0010D\"\u0005\b\u009b\u0001\u0010FR\u0019\u0010\u009d\u0001\u001a\b\u0012\u0004\u0012\u00020.0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010\rR5\u0010\u009f\u0001\u001a\u0004\u0018\u0001002\b\u00102\u001a\u0004\u0018\u0001008F@FX\u0086\u008e\u0002\u00a2\u0006\u0017\n\u0005\b\u00a4\u0001\u00109\u001a\u0006\b\u00a0\u0001\u0010\u00a1\u0001\"\u0006\b\u00a2\u0001\u0010\u00a3\u0001\u00a8\u0006\u00ac\u0001"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/corn/cornpos/repository/CornPosRepository;", "dataBaseRepository", "Lcom/corn/cornpos/repository/CornDataBaseRepository;", "application", "Landroid/content/Context;", "(Lcom/corn/cornpos/repository/CornPosRepository;Lcom/corn/cornpos/repository/CornDataBaseRepository;Landroid/content/Context;)V", "_canDelivery", "Lkotlinx/coroutines/flow/Flow;", "", "get_canDelivery", "()Lkotlinx/coroutines/flow/Flow;", "_canDineIn", "get_canDineIn", "_canTakeAway", "get_canTakeAway", "_clientConnString", "", "_customerID", "", "_customerName", "_deals", "", "Lcom/corn/cornpos/data/database/Deals;", "get_deals", "set_deals", "(Lkotlinx/coroutines/flow/Flow;)V", "_editMode", "_loginData", "Lcom/corn/cornpos/data/database/LoginModel;", "get_loginData", "_order", "Lcom/corn/cornpos/data/database/OrderDetails;", "get_order", "set_order", "_orderDate", "_orderNumber", "_serviceTypeID", "_tableCover", "_tableFloor", "_tableId", "_tablename", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/corn/cornpos/util/UiEvent;", "_userInfoDatabaseData", "Lcom/corn/cornpos/data/database/UserInfoModel;", "get_userInfoDatabaseData", "<set-?>", "canDelivery", "getCanDelivery", "()Z", "setCanDelivery", "(Z)V", "canDelivery$delegate", "Landroidx/compose/runtime/MutableState;", "canDineIn", "getCanDineIn", "setCanDineIn", "canDineIn$delegate", "canTakeAway", "getCanTakeAway", "setCanTakeAway", "canTakeAway$delegate", "clientConnString", "getClientConnString", "()Ljava/lang/String;", "setClientConnString", "(Ljava/lang/String;)V", "clientConnString$delegate", "customerID", "getCustomerID", "()I", "setCustomerID", "(I)V", "customerID$delegate", "Landroidx/compose/runtime/MutableIntState;", "customerName", "getCustomerName", "setCustomerName", "customerName$delegate", "getDataBaseRepository", "()Lcom/corn/cornpos/repository/CornDataBaseRepository;", "dataStore", "Lcom/corn/cornpos/data/CornPosDataStore;", "getDataStore", "()Lcom/corn/cornpos/data/CornPosDataStore;", "dealOrderList", "", "Lcom/corn/cornpos/data/remote/dto/Deal;", "getDealOrderList", "()Ljava/util/List;", "setDealOrderList", "(Ljava/util/List;)V", "dealsList", "getDealsList", "setDealsList", "dealsList$delegate", "editMode", "getEditMode", "setEditMode", "editMode$delegate", "fakeOrderNumber", "getFakeOrderNumber", "setFakeOrderNumber", "fakeOrderNumber$delegate", "finalOrderItemsList", "Lcom/corn/cornpos/data/remote/dto/DealAndItems;", "getFinalOrderItemsList", "setFinalOrderItemsList", "isOrderPlaced", "setOrderPlaced", "isOrderPlaced$delegate", "loginDatabaseData", "getLoginDatabaseData", "()Lcom/corn/cornpos/data/database/LoginModel;", "setLoginDatabaseData", "(Lcom/corn/cornpos/data/database/LoginModel;)V", "loginDatabaseData$delegate", "orderDate", "getOrderDate", "setOrderDate", "orderDate$delegate", "orderItemsList", "", "getOrderItemsList", "setOrderItemsList", "orderList", "getOrderList", "setOrderList", "orderList$delegate", "orderNumber", "getOrderNumber", "setOrderNumber", "orderNumber$delegate", "serviceTypeID", "getServiceTypeID", "setServiceTypeID", "serviceTypeID$delegate", "tableCover", "getTableCover", "setTableCover", "tableCover$delegate", "tableFloor", "getTableFloor", "setTableFloor", "tableFloor$delegate", "tableId", "getTableId", "setTableId", "tableId$delegate", "tableName", "getTableName", "setTableName", "tableName$delegate", "uiEvent", "getUiEvent", "userInfoDatabaseData", "getUserInfoDatabaseData", "()Lcom/corn/cornpos/data/database/UserInfoModel;", "setUserInfoDatabaseData", "(Lcom/corn/cornpos/data/database/UserInfoModel;)V", "userInfoDatabaseData$delegate", "getTableDetailsFromJson", "jsonString", "onEvent", "", "event", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "sentUiEvent", "app_debug"})
public final class OrderDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.corn.cornpos.repository.CornPosRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.corn.cornpos.data.CornPosDataStore dataStore = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.OrderDetails>> _order;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState orderList$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _tableFloor = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tableFloor$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _tableId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tableId$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _tablename = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tableName$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _tableCover = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tableCover$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _customerID = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState customerID$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _serviceTypeID = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState serviceTypeID$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _customerName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState customerName$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _editMode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState editMode$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState isOrderPlaced$delegate = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.Deals>> _deals;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState dealsList$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _clientConnString = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState clientConnString$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.UserInfoModel> _userInfoDatabaseData = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState userInfoDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.LoginModel> _loginData = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState loginDatabaseData$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _orderNumber = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState orderNumber$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState fakeOrderNumber$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<java.lang.Object> orderItemsList;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.corn.cornpos.data.remote.dto.DealAndItems> finalOrderItemsList;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.corn.cornpos.data.remote.dto.Deal> dealOrderList;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _orderDate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState orderDate$delegate = null;
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
    private final kotlinx.coroutines.channels.Channel<com.corn.cornpos.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject
    public OrderDetailsViewModel(@org.jetbrains.annotations.NotNull
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
    public final com.corn.cornpos.data.CornPosDataStore getDataStore() {
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
    public final java.lang.String getTableFloor() {
        return null;
    }
    
    public final void setTableFloor(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableId() {
        return null;
    }
    
    public final void setTableId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableName() {
        return null;
    }
    
    public final void setTableName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableCover() {
        return null;
    }
    
    public final void setTableCover(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getCustomerID() {
        return 0;
    }
    
    public final void setCustomerID(int p0) {
    }
    
    public final int getServiceTypeID() {
        return 0;
    }
    
    public final void setServiceTypeID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    public final void setCustomerName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getEditMode() {
        return false;
    }
    
    public final void setEditMode(boolean p0) {
    }
    
    public final boolean isOrderPlaced() {
        return false;
    }
    
    public final void setOrderPlaced(boolean p0) {
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClientConnString() {
        return null;
    }
    
    public final void setClientConnString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
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
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.LoginModel> get_loginData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.corn.cornpos.data.database.LoginModel getLoginDatabaseData() {
        return null;
    }
    
    public final void setLoginDatabaseData(@org.jetbrains.annotations.Nullable
    com.corn.cornpos.data.database.LoginModel p0) {
    }
    
    public final int getOrderNumber() {
        return 0;
    }
    
    public final void setOrderNumber(int p0) {
    }
    
    public final int getFakeOrderNumber() {
        return 0;
    }
    
    public final void setFakeOrderNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> getOrderItemsList() {
        return null;
    }
    
    public final void setOrderItemsList(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.remote.dto.DealAndItems> getFinalOrderItemsList() {
        return null;
    }
    
    public final void setFinalOrderItemsList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.remote.dto.DealAndItems> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.remote.dto.Deal> getDealOrderList() {
        return null;
    }
    
    public final void setDealOrderList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.remote.dto.Deal> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderDate() {
        return null;
    }
    
    public final void setOrderDate(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
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
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.orderDetail.OrderEvents event) {
    }
    
    private final void sentUiEvent(com.corn.cornpos.util.UiEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableDetailsFromJson(@org.jetbrains.annotations.NotNull
    java.lang.String jsonString) {
        return null;
    }
}