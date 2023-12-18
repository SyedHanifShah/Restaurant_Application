package com.corn.cornpos.data.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\n2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/corn/cornpos/data/database/OrderDetailsDao;", "", "deleteAllOrder", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteOrder", "orderDetails", "Lcom/corn/cornpos/data/database/OrderDetails;", "(Lcom/corn/cornpos/data/database/OrderDetails;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllOrder", "Lkotlinx/coroutines/flow/Flow;", "", "getOrderByItemId", "id", "", "insertOrder", "insertOrderList", "order", "app_debug"})
public abstract interface OrderDetailsDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertOrder(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetails orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteOrder(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.OrderDetails orderDetails, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM orderdetails WHERE orderNumber =:id")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.OrderDetails>> getOrderByItemId(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM OrderDetails")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.OrderDetails>> getAllOrder();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "Delete FROM OrderDetails")
    public abstract java.lang.Object deleteAllOrder(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertOrderList(@org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.database.OrderDetails> order);
}