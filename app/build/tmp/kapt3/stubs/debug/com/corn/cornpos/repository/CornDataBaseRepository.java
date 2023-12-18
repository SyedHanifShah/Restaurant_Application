package com.corn.cornpos.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001e\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\t\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\n\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u000b\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\f\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\r\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0011\u0010\u000e\u001a\u00020\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0019\u0010+\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u001c\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000501002\u0006\u00102\u001a\u000203H&J\u0014\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050100H&J\u0014\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110100H&J\u0014\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150100H&J\u0014\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190100H&J\u000e\u00108\u001a\b\u0012\u0004\u0012\u00020\u001d00H&J\u0014\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0100H&J\u0014\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0100H&J\u0014\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0100H&J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020-00H&J\u001b\u0010=\u001a\u0004\u0018\u00010\u00112\u0006\u00102\u001a\u000203H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u001b\u0010?\u001a\u0004\u0018\u00010\u00152\u0006\u00102\u001a\u000203H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u001b\u0010@\u001a\u0004\u0018\u00010\u00192\u0006\u00102\u001a\u000203H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u001b\u0010A\u001a\u0004\u0018\u00010\u001d2\u0006\u00102\u001a\u000203H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u001c\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!01002\u0006\u00102\u001a\u000203H&J\u001c\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%01002\u0006\u00102\u001a\u000203H&J\u001c\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)01002\u0006\u00102\u001a\u000203H&J\u001b\u0010E\u001a\u0004\u0018\u00010-2\u0006\u00102\u001a\u000203H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010>J\u0019\u0010F\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010G\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010H\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010I\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0019\u0010J\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001eJ\u0019\u0010K\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\"J\u001f\u0010L\u001a\u00020\u00032\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!01H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010MJ\u0019\u0010N\u001a\u00020\u00032\u0006\u0010$\u001a\u00020%H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010&J\u0019\u0010O\u001a\u00020\u00032\u0006\u0010(\u001a\u00020)H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010*J\u0019\u0010P\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006Q"}, d2 = {"Lcom/corn/cornpos/repository/CornDataBaseRepository;", "", "deleteAdsOn", "", "adsOn", "Lcom/corn/cornpos/data/database/AdsOn;", "(Lcom/corn/cornpos/data/database/AdsOn;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllAdsOnData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllCategoryData", "deleteAllCustomer", "deleteAllDeals", "deleteAllOrder", "deleteAllProductData", "deleteAllTableData", "deleteCategory", "category", "Lcom/corn/cornpos/data/database/Category;", "(Lcom/corn/cornpos/data/database/Category;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomer", "customer", "Lcom/corn/cornpos/data/database/Customer;", "(Lcom/corn/cornpos/data/database/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteDeals", "deals", "Lcom/corn/cornpos/data/database/Deals;", "(Lcom/corn/cornpos/data/database/Deals;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteLoginData", "loginModel", "Lcom/corn/cornpos/data/database/LoginModel;", "(Lcom/corn/cornpos/data/database/LoginModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOrder", "orderDetails", "Lcom/corn/cornpos/data/database/OrderDetails;", "(Lcom/corn/cornpos/data/database/OrderDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProduct", "products", "Lcom/corn/cornpos/data/database/Products;", "(Lcom/corn/cornpos/data/database/Products;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteTable", "table", "Lcom/corn/cornpos/data/database/Table;", "(Lcom/corn/cornpos/data/database/Table;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteUserInfo", "userInfoModel", "Lcom/corn/cornpos/data/database/UserInfoModel;", "(Lcom/corn/cornpos/data/database/UserInfoModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdsOnByItemId", "Lkotlinx/coroutines/flow/Flow;", "", "id", "", "getAllAdsOnData", "getAllCategoryData", "getAllCustomer", "getAllDeals", "getAllLoginData", "getAllOrder", "getAllProductData", "getAllTableData", "getAllUserInfo", "getCategoryId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomerBYId", "getDealsBYId", "getLoginDataById", "getOrderByItemId", "getProductId", "getTableId", "getUserInfoById", "insertAdsOn", "insertCategory", "insertCustomer", "insertDeals", "insertLoginData", "insertOrder", "insertOrderList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertProduct", "insertTable", "insertUserInfo", "app_debug"})
public abstract interface CornDataBaseRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertLoginData(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.LoginModel loginModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteLoginData(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.LoginModel loginModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getLoginDataById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.LoginModel> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.LoginModel> getAllLoginData();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertUserInfo(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.UserInfoModel userInfoModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteUserInfo(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.UserInfoModel userInfoModel, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUserInfoById(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.UserInfoModel> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.corn.cornpos.data.database.UserInfoModel> getAllUserInfo();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertProduct(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Products products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Products products, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Products>> getProductId(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Products>> getAllProductData();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllProductData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertCategory(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Category category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteCategory(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Category category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCategoryId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.Category> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Category>> getAllCategoryData();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllCategoryData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertDeals(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Deals deals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteDeals(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Deals deals, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDealsBYId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.Deals> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Deals>> getAllDeals();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllDeals(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertTable(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Table table, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteTable(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Table table, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Table>> getTableId(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Table>> getAllTableData();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllTableData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertCustomer(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteCustomer(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCustomerBYId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.Customer> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Customer>> getAllCustomer();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllCustomer(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertAdsOn(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOn adsOn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAdsOn(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOn adsOn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> getAdsOnByItemId(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> getAllAdsOnData();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllAdsOnData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertOrder(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetails orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertOrderList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.OrderDetails> orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteOrder(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetails orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.OrderDetails>> getOrderByItemId(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.OrderDetails>> getAllOrder();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteAllOrder(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}