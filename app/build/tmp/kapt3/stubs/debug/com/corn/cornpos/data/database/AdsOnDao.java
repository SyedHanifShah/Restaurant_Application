package com.corn.cornpos.data.database;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\'J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH\'J\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/corn/cornpos/data/database/AdsOnDao;", "", "deleteAdsOn", "", "adsOn", "Lcom/corn/cornpos/data/database/AdsOn;", "(Lcom/corn/cornpos/data/database/AdsOn;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllAdsOnData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdsOnByItemId", "Lkotlinx/coroutines/flow/Flow;", "", "id", "", "getAllAdsOnData", "insertAdsOn", "app_debug"})
public abstract interface AdsOnDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertAdsOn(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOn adsOn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteAdsOn(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.database.AdsOn adsOn, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM AdsOn WHERE ItemID =:id")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> getAdsOnByItemId(@org.jetbrains.annotations.NotNull
    java.lang.String id);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM AdsOn")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.corn.cornpos.data.database.AdsOn>> getAllAdsOnData();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM AdsOn")
    public abstract java.lang.Object deleteAllAdsOnData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}