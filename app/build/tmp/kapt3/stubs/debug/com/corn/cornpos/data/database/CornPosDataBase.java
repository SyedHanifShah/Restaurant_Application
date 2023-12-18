package com.corn.cornpos.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.corn.cornpos.data.database.UserInfoModel.class, com.corn.cornpos.data.database.LoginModel.class, com.corn.cornpos.data.database.Products.class, com.corn.cornpos.data.database.Category.class, com.corn.cornpos.data.database.Deals.class, com.corn.cornpos.data.database.Table.class, com.corn.cornpos.data.database.Customer.class, com.corn.cornpos.data.database.AdsOn.class, com.corn.cornpos.data.database.OrderDetails.class}, version = 1)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u0018X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0012\u0010\u001b\u001a\u00020\u001cX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020 X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0012\u0010#\u001a\u00020$X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u0006\'"}, d2 = {"Lcom/corn/cornpos/data/database/CornPosDataBase;", "Landroidx/room/RoomDatabase;", "()V", "adsOnDao", "Lcom/corn/cornpos/data/database/AdsOnDao;", "getAdsOnDao", "()Lcom/corn/cornpos/data/database/AdsOnDao;", "categoryDao", "Lcom/corn/cornpos/data/database/CategoryDao;", "getCategoryDao", "()Lcom/corn/cornpos/data/database/CategoryDao;", "customerDao", "Lcom/corn/cornpos/data/database/CustomerDao;", "getCustomerDao", "()Lcom/corn/cornpos/data/database/CustomerDao;", "dealsDao", "Lcom/corn/cornpos/data/database/DealsDao;", "getDealsDao", "()Lcom/corn/cornpos/data/database/DealsDao;", "loginDao", "Lcom/corn/cornpos/data/database/LoginDao;", "getLoginDao", "()Lcom/corn/cornpos/data/database/LoginDao;", "orderDetailsDao", "Lcom/corn/cornpos/data/database/OrderDetailsDao;", "getOrderDetailsDao", "()Lcom/corn/cornpos/data/database/OrderDetailsDao;", "productsDao", "Lcom/corn/cornpos/data/database/ProductsDao;", "getProductsDao", "()Lcom/corn/cornpos/data/database/ProductsDao;", "tableDeo", "Lcom/corn/cornpos/data/database/TableDeo;", "getTableDeo", "()Lcom/corn/cornpos/data/database/TableDeo;", "userInfoDao", "Lcom/corn/cornpos/data/database/UserInfoDao;", "getUserInfoDao", "()Lcom/corn/cornpos/data/database/UserInfoDao;", "app_debug"})
public abstract class CornPosDataBase extends androidx.room.RoomDatabase {
    
    public CornPosDataBase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.UserInfoDao getUserInfoDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.LoginDao getLoginDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.ProductsDao getProductsDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.CategoryDao getCategoryDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.DealsDao getDealsDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.TableDeo getTableDeo();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.CustomerDao getCustomerDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.AdsOnDao getAdsOnDao();
    
    @org.jetbrains.annotations.NotNull
    public abstract com.corn.cornpos.data.database.OrderDetailsDao getOrderDetailsDao();
}