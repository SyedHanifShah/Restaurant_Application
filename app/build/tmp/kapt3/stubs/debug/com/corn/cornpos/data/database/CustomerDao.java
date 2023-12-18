package com.corn.cornpos.data.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u001b\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/corn/cornpos/data/database/CustomerDao;", "", "deleteAllCustomer", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteCustomer", "customer", "Lcom/corn/cornpos/data/database/Customer;", "(Lcom/corn/cornpos/data/database/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCustomer", "Lkotlinx/coroutines/flow/Flow;", "", "getCustomerBYId", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertCustomer", "app_debug"})
public abstract interface CustomerDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertCustomer(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteCustomer(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.Customer customer, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM Customer WHERE CustomerID =:id")
    public abstract java.lang.Object getCustomerBYId(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.corn.cornpos.data.database.Customer> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM Customer")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.Customer>> getAllCustomer();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "Delete FROM Customer")
    public abstract java.lang.Object deleteAllCustomer(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}