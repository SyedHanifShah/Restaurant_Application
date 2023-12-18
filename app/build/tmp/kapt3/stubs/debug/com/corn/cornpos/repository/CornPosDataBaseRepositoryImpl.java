package com.corn.cornpos.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0007\u0018\u00002\u00020\u0001BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010\u001d\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010\u001e\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010\u001f\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010 \u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010!\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u000200H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u0019\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u000204H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0019\u00106\u001a\u00020\u00162\u0006\u00107\u001a\u000208H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J\u0019\u0010:\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0019\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020@H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AJ\u001c\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180D0C2\u0006\u0010E\u001a\u00020FH\u0016J\u0014\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180D0CH\u0016J\u0014\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0D0CH\u0016J\u0014\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0D0CH\u0016J\u0014\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0D0CH\u0016J\u000e\u0010K\u001a\b\u0012\u0004\u0012\u0002000CH\u0016J\u0014\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040D0CH\u0016J\u0014\u0010M\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080D0CH\u0016J\u0014\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0D0CH\u0016J\u000e\u0010O\u001a\b\u0012\u0004\u0012\u00020@0CH\u0016J\u001b\u0010P\u001a\u0004\u0018\u00010$2\u0006\u0010E\u001a\u00020FH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001b\u0010R\u001a\u0004\u0018\u00010(2\u0006\u0010E\u001a\u00020FH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001b\u0010S\u001a\u0004\u0018\u00010,2\u0006\u0010E\u001a\u00020FH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001b\u0010T\u001a\u0004\u0018\u0001002\u0006\u0010E\u001a\u00020FH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u001c\u0010U\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040D0C2\u0006\u0010E\u001a\u00020FH\u0016J\u001c\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002080D0C2\u0006\u0010E\u001a\u00020FH\u0016J\u001c\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0D0C2\u0006\u0010E\u001a\u00020FH\u0016J\u001b\u0010X\u001a\u0004\u0018\u00010@2\u0006\u0010E\u001a\u00020FH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010QJ\u0019\u0010Y\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0019\u0010Z\u001a\u00020\u00162\u0006\u0010#\u001a\u00020$H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010[\u001a\u00020\u00162\u0006\u0010\'\u001a\u00020(H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010\\\u001a\u00020\u00162\u0006\u0010+\u001a\u00020,H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u0010]\u001a\u00020\u00162\u0006\u0010/\u001a\u000200H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u0019\u0010^\u001a\u00020\u00162\u0006\u00103\u001a\u000204H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u001f\u0010_\u001a\u00020\u00162\f\u00103\u001a\b\u0012\u0004\u0012\u0002040DH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010`J\u0019\u0010a\u001a\u00020\u00162\u0006\u00107\u001a\u000208H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J\u0019\u0010b\u001a\u00020\u00162\u0006\u0010;\u001a\u00020<H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0019\u0010c\u001a\u00020\u00162\u0006\u0010?\u001a\u00020@H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006d"}, d2 = {"Lcom/corn/cornpos/repository/CornPosDataBaseRepositoryImpl;", "Lcom/corn/cornpos/repository/CornDataBaseRepository;", "userInfoDao", "Lcom/corn/cornpos/data/database/UserInfoDao;", "loginDao", "Lcom/corn/cornpos/data/database/LoginDao;", "productsDao", "Lcom/corn/cornpos/data/database/ProductsDao;", "categoryDao", "Lcom/corn/cornpos/data/database/CategoryDao;", "dealsDao", "Lcom/corn/cornpos/data/database/DealsDao;", "tableDeo", "Lcom/corn/cornpos/data/database/TableDeo;", "customerDao", "Lcom/corn/cornpos/data/database/CustomerDao;", "adsOnDao", "Lcom/corn/cornpos/data/database/AdsOnDao;", "orderDetailsDao", "Lcom/corn/cornpos/data/database/OrderDetailsDao;", "(Lcom/corn/cornpos/data/database/UserInfoDao;Lcom/corn/cornpos/data/database/LoginDao;Lcom/corn/cornpos/data/database/ProductsDao;Lcom/corn/cornpos/data/database/CategoryDao;Lcom/corn/cornpos/data/database/DealsDao;Lcom/corn/cornpos/data/database/TableDeo;Lcom/corn/cornpos/data/database/CustomerDao;Lcom/corn/cornpos/data/database/AdsOnDao;Lcom/corn/cornpos/data/database/OrderDetailsDao;)V", "deleteAdsOn", "", "adsOn", "Lcom/corn/cornpos/data/database/AdsOn;", "(Lcom/corn/cornpos/data/database/AdsOn;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllAdsOnData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllCategoryData", "deleteAllCustomer", "deleteAllDeals", "deleteAllOrder", "deleteAllProductData", "deleteAllTableData", "deleteCategory", "category", "Lcom/corn/cornpos/data/database/Category;", "(Lcom/corn/cornpos/data/database/Category;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomer", "customer", "Lcom/corn/cornpos/data/database/Customer;", "(Lcom/corn/cornpos/data/database/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeals", "deals", "Lcom/corn/cornpos/data/database/Deals;", "(Lcom/corn/cornpos/data/database/Deals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLoginData", "loginModel", "Lcom/corn/cornpos/data/database/LoginModel;", "(Lcom/corn/cornpos/data/database/LoginModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOrder", "orderDetails", "Lcom/corn/cornpos/data/database/OrderDetails;", "(Lcom/corn/cornpos/data/database/OrderDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProduct", "products", "Lcom/corn/cornpos/data/database/Products;", "(Lcom/corn/cornpos/data/database/Products;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTable", "table", "Lcom/corn/cornpos/data/database/Table;", "(Lcom/corn/cornpos/data/database/Table;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserInfo", "userInfoModel", "Lcom/corn/cornpos/data/database/UserInfoModel;", "(Lcom/corn/cornpos/data/database/UserInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdsOnByItemId", "Lkotlinx/coroutines/flow/Flow;", "", "id", "", "getAllAdsOnData", "getAllCategoryData", "getAllCustomer", "getAllDeals", "getAllLoginData", "getAllOrder", "getAllProductData", "getAllTableData", "getAllUserInfo", "getCategoryId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerBYId", "getDealsBYId", "getLoginDataById", "getOrderByItemId", "getProductId", "getTableId", "getUserInfoById", "insertAdsOn", "insertCategory", "insertCustomer", "insertDeals", "insertLoginData", "insertOrder", "insertOrderList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProduct", "insertTable", "insertUserInfo", "app_debug"})
public final class CornPosDataBaseRepositoryImpl implements com.corn.cornpos.repository.CornDataBaseRepository {
    private final com.corn.cornpos.data.database.UserInfoDao userInfoDao = null;
    private final com.corn.cornpos.data.database.LoginDao loginDao = null;
    private final com.corn.cornpos.data.database.ProductsDao productsDao = null;
    private final com.corn.cornpos.data.database.CategoryDao categoryDao = null;
    private final com.corn.cornpos.data.database.DealsDao dealsDao = null;
    private final com.corn.cornpos.data.database.TableDeo tableDeo = null;
    private final com.corn.cornpos.data.database.CustomerDao customerDao = null;
    private final com.corn.cornpos.data.database.AdsOnDao adsOnDao = null;
    private final com.corn.cornpos.data.database.OrderDetailsDao orderDetailsDao = null;
    
    @javax.inject.Inject
    public CornPosDataBaseRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.UserInfoDao userInfoDao, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.LoginDao loginDao, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.ProductsDao productsDao, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.CategoryDao categoryDao, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.DealsDao dealsDao, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.TableDeo tableDeo, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.CustomerDao customerDao, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOnDao adsOnDao, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetailsDao orderDetailsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertLoginData(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.LoginModel loginModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteLoginData(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.LoginModel loginModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getLoginDataById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.LoginModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.LoginModel> getAllLoginData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertUserInfo(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.UserInfoModel userInfoModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteUserInfo(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.UserInfoModel userInfoModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getUserInfoById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.UserInfoModel> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.UserInfoModel> getAllUserInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Products products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Products products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Products>> getProductId(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Products>> getAllProductData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllProductData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertCategory(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Category category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteCategory(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Category category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCategoryId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.Category> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Category>> getAllCategoryData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllCategoryData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertDeals(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Deals deals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteDeals(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Deals deals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getDealsBYId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.Deals> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Deals>> getAllDeals() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllDeals(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertTable(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Table table, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTable(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Table table, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Table>> getTableId(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Table>> getAllTableData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllTableData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertCustomer(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteCustomer(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getCustomerBYId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.Customer> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Customer>> getAllCustomer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllCustomer(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertAdsOn(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOn adsOn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAdsOn(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOn adsOn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> getAdsOnByItemId(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> getAllAdsOnData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllAdsOnData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertOrder(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetails orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertOrderList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.OrderDetails> orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteOrder(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetails orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.OrderDetails>> getOrderByItemId(@org.jetbrains.annotations.NotNull
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.OrderDetails>> getAllOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteAllOrder(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}