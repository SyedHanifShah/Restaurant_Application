package com.corn.cornpos.ui.screen.menu;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001J.\u0010\u00a0\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00a1\u0001\u001a\u00020\'2\u001b\u0010\u00a2\u0001\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0005\u0012\u00030\u009f\u00010\u00a3\u0001J\u0016\u0010\u00a4\u0001\u001a\b\u0012\u0004\u0012\u00020\'0\u00102\u0007\u0010\u00a5\u0001\u001a\u00020\u001aJ.\u0010\u00a6\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00a7\u0001\u001a\u00020\u001a2\u001b\u0010\u00a2\u0001\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0010\u0012\u0005\u0012\u00030\u009f\u00010\u00a3\u0001J\u0011\u0010\u00a8\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00a9\u0001\u001a\u00020#J\u0012\u0010\u00aa\u0001\u001a\u00030\u009f\u00012\b\u0010\u00ab\u0001\u001a\u00030\u00ac\u0001J\u0013\u0010\u00ad\u0001\u001a\u00030\u009f\u00012\u0007\u0010\u00ab\u0001\u001a\u000202H\u0002R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010 R\u0016\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00100\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010 R\u0016\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\'0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020201X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u00103\u001a\b\u0012\u0004\u0012\u0002040\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\r\"\u0004\b6\u00107R7\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010@\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bE\u0010?\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR+\u0010F\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bK\u0010?\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR7\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bO\u0010?\u001a\u0004\bM\u0010;\"\u0004\bN\u0010=R+\u0010P\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bS\u0010?\u001a\u0004\bQ\u0010H\"\u0004\bR\u0010JR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010T\u001a\u00020U\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR \u0010X\u001a\b\u0012\u0004\u0012\u00020Y0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\r\"\u0004\b[\u00107R7\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b_\u0010?\u001a\u0004\b]\u0010;\"\u0004\b^\u0010=R\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010\rR \u0010b\u001a\b\u0012\u0004\u0012\u00020\'0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\r\"\u0004\bd\u00107R7\u0010e\u001a\b\u0012\u0004\u0012\u00020\'0\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\'0\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bh\u0010?\u001a\u0004\bf\u0010;\"\u0004\bg\u0010=R+\u0010i\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00188F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bl\u0010?\u001a\u0004\bj\u0010B\"\u0004\bk\u0010DR+\u0010m\u001a\u00020\'2\u0006\u00108\u001a\u00020\'8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR7\u0010t\u001a\b\u0012\u0004\u0012\u00020#0\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020#0\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bw\u0010?\u001a\u0004\bu\u0010;\"\u0004\bv\u0010=R+\u0010x\u001a\u00020\'2\u0006\u00108\u001a\u00020\'8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b{\u0010s\u001a\u0004\by\u0010o\"\u0004\bz\u0010qR+\u0010|\u001a\u00020\'2\u0006\u00108\u001a\u00020\'8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u007f\u0010s\u001a\u0004\b}\u0010o\"\u0004\b~\u0010qR;\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0083\u0001\u0010?\u001a\u0005\b\u0081\u0001\u0010;\"\u0005\b\u0082\u0001\u0010=R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u0084\u0001\u001a\u00030\u0085\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0088\u0001\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010\rR\u0019\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020\u00110\n\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010\rR/\u0010\u008c\u0001\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u008f\u0001\u0010?\u001a\u0005\b\u008d\u0001\u0010H\"\u0005\b\u008e\u0001\u0010JR/\u0010\u0090\u0001\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0093\u0001\u0010?\u001a\u0005\b\u0091\u0001\u0010H\"\u0005\b\u0092\u0001\u0010JR/\u0010\u0094\u0001\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u0097\u0001\u0010?\u001a\u0005\b\u0095\u0001\u0010H\"\u0005\b\u0096\u0001\u0010JR/\u0010\u0098\u0001\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u001a8F@FX\u0086\u008e\u0002\u00a2\u0006\u0015\n\u0005\b\u009b\u0001\u0010?\u001a\u0005\b\u0099\u0001\u0010H\"\u0005\b\u009a\u0001\u0010JR\u0019\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u0002020\u000f\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0013\u00a8\u0006\u00ae\u0001"}, d2 = {"Lcom/corn/cornpos/ui/screen/menu/MenuViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/corn/cornpos/repository/CornPosRepository;", "dataBaseRepository", "Lcom/corn/cornpos/repository/CornDataBaseRepository;", "application", "Landroid/content/Context;", "(Lcom/corn/cornpos/repository/CornPosRepository;Lcom/corn/cornpos/repository/CornDataBaseRepository;Landroid/content/Context;)V", "DealSelectedItem", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/corn/cornpos/data/database/Products;", "getDealSelectedItem", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_AdsOnList", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/corn/cornpos/data/database/AdsOn;", "get_AdsOnList", "()Lkotlinx/coroutines/flow/Flow;", "_Category", "Lcom/corn/cornpos/data/database/Category;", "get_Category", "_can_dineIn", "", "_can_takeAway", "", "_customerName", "_deals", "Lcom/corn/cornpos/data/database/Deals;", "get_deals", "set_deals", "(Lkotlinx/coroutines/flow/Flow;)V", "_edit_mode", "_order", "Lcom/corn/cornpos/data/database/OrderDetails;", "get_order", "set_order", "_orderNumber", "", "_parentRowId", "_productsDatabaseData", "get_productsDatabaseData", "set_productsDatabaseData", "_tableCover", "_tableFloor", "_tableId", "_tableName", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/corn/cornpos/util/UiEvent;", "aDealAllItems", "", "getADealAllItems", "setADealAllItems", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;)V", "<set-?>", "adsOnList", "getAdsOnList", "()Ljava/util/List;", "setAdsOnList", "(Ljava/util/List;)V", "adsOnList$delegate", "Landroidx/compose/runtime/MutableState;", "canDinein", "getCanDinein", "()Z", "setCanDinein", "(Z)V", "canDinein$delegate", "canTakwAway", "getCanTakwAway", "()Ljava/lang/String;", "setCanTakwAway", "(Ljava/lang/String;)V", "canTakwAway$delegate", "categoryDatabaseData", "getCategoryDatabaseData", "setCategoryDatabaseData", "categoryDatabaseData$delegate", "customerName", "getCustomerName", "setCustomerName", "customerName$delegate", "dataStore", "Lcom/corn/cornpos/data/CornPosDataStore;", "getDataStore", "()Lcom/corn/cornpos/data/CornPosDataStore;", "dealManager", "Lcom/corn/cornpos/util/DealManager;", "getDealManager", "setDealManager", "dealsList", "getDealsList", "setDealsList", "dealsList$delegate", "dealsProducts", "getDealsProducts", "dealsProductsIdList", "getDealsProductsIdList", "setDealsProductsIdList", "dealsProductsIdList2", "getDealsProductsIdList2", "setDealsProductsIdList2", "dealsProductsIdList2$delegate", "editMode", "getEditMode", "setEditMode", "editMode$delegate", "fakeOrderNumber", "getFakeOrderNumber", "()I", "setFakeOrderNumber", "(I)V", "fakeOrderNumber$delegate", "Landroidx/compose/runtime/MutableIntState;", "orderList", "getOrderList", "setOrderList", "orderList$delegate", "orderNumber", "getOrderNumber", "setOrderNumber", "orderNumber$delegate", "parentRowId", "getParentRowId", "setParentRowId", "parentRowId$delegate", "productsDatabaseData", "getProductsDatabaseData", "setProductsDatabaseData", "productsDatabaseData$delegate", "selectedCategoryrestriction", "Landroidx/compose/runtime/MutableIntState;", "getSelectedCategoryrestriction", "()Landroidx/compose/runtime/MutableIntState;", "selectedDealItems", "getSelectedDealItems", "selectedItems", "getSelectedItems", "tableCover", "getTableCover", "setTableCover", "tableCover$delegate", "tableFloor", "getTableFloor", "setTableFloor", "tableFloor$delegate", "tableId", "getTableId", "setTableId", "tableId$delegate", "tableName", "getTableName", "setTableName", "tableName$delegate", "uiEvent", "getUiEvent", "clearDealsSelectedItems", "", "getAdsOnByID", "itemId", "callBack", "Lkotlin/Function1;", "getDealId", "jsonString", "getProductsByID", "categoryId", "onDeleteOrder", "orderDetails", "onEvent", "event", "Lcom/corn/cornpos/ui/screen/menu/MenuEvents;", "sentUiEvent", "app_debug"})
public final class MenuViewModel extends androidx.lifecycle.ViewModel {
    private final com.corn.cornpos.repository.CornPosRepository repository = null;
    private final com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository = null;
    @org.jetbrains.annotations.NotNull
    private final com.corn.cornpos.data.CornPosDataStore dataStore = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.AdsOn> selectedItems = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.Products> selectedDealItems = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.util.DealManager> dealManager;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState selectedCategoryrestriction = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object> aDealAllItems;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.Products> DealSelectedItem = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Category>> _Category = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState categoryDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> _AdsOnList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState adsOnList$delegate = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.Products>> _productsDatabaseData;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState productsDatabaseData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.Deals>> _deals;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState dealsList$delegate = null;
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
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _tableName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tableName$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _parentRowId = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState parentRowId$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _tableCover = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState tableCover$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _can_dineIn = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState canDinein$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _can_takeAway = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState canTakwAway$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _edit_mode = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState editMode$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Integer> _orderNumber = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState orderNumber$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _customerName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState customerName$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState fakeOrderNumber$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.Products> dealsProducts = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Integer> dealsProductsIdList;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState dealsProductsIdList2$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.corn.cornpos.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> uiEvent = null;
    
    @javax.inject.Inject
    public MenuViewModel(@org.jetbrains.annotations.NotNull
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
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.AdsOn> getSelectedItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.Products> getSelectedDealItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.util.DealManager> getDealManager() {
        return null;
    }
    
    public final void setDealManager(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.util.DealManager> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableIntState getSelectedCategoryrestriction() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object> getADealAllItems() {
        return null;
    }
    
    public final void setADealAllItems(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Object> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.Products> getDealSelectedItem() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Category>> get_Category() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.database.Category> getCategoryDatabaseData() {
        return null;
    }
    
    public final void setCategoryDatabaseData(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Category> p0) {
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
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Products>> get_productsDatabaseData() {
        return null;
    }
    
    public final void set_productsDatabaseData(@org.jetbrains.annotations.NotNull
    kotlinx.coroutines.flow.Flow<? extends java.util.List<com.corn.cornpos.data.database.Products>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.database.Products> getProductsDatabaseData() {
        return null;
    }
    
    public final void setProductsDatabaseData(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.Products> p0) {
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
    
    public final int getParentRowId() {
        return 0;
    }
    
    public final void setParentRowId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableCover() {
        return null;
    }
    
    public final void setTableCover(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getCanDinein() {
        return false;
    }
    
    public final void setCanDinein(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCanTakwAway() {
        return null;
    }
    
    public final void setCanTakwAway(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean getEditMode() {
        return false;
    }
    
    public final void setEditMode(boolean p0) {
    }
    
    public final int getOrderNumber() {
        return 0;
    }
    
    public final void setOrderNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    public final void setCustomerName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getFakeOrderNumber() {
        return 0;
    }
    
    public final void setFakeOrderNumber(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<com.corn.cornpos.data.database.Products> getDealsProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Integer> getDealsProductsIdList() {
        return null;
    }
    
    public final void setDealsProductsIdList(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getDealsProductsIdList2() {
        return null;
    }
    
    public final void setDealsProductsIdList2(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.menu.MenuEvents event) {
    }
    
    public final void getProductsByID(@org.jetbrains.annotations.NotNull
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<com.corn.cornpos.data.database.Products>, kotlin.Unit> callBack) {
    }
    
    public final void getAdsOnByID(int itemId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.util.List<com.corn.cornpos.data.database.AdsOn>, kotlin.Unit> callBack) {
    }
    
    private final void sentUiEvent(com.corn.cornpos.util.UiEvent event) {
    }
    
    public final void onDeleteOrder(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetails orderDetails) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getDealId(@org.jetbrains.annotations.NotNull
    java.lang.String jsonString) {
        return null;
    }
    
    public final void clearDealsSelectedItems() {
    }
}