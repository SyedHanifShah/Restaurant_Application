package com.corn.cornpos.data.database;

import java.lang.System;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0006H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0006H\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u000eH\u00c6\u0003Jj\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010+J\u0013\u0010,\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f\u00a8\u00060"}, d2 = {"Lcom/corn/cornpos/data/database/AdsOn;", "", "id", "", "AdsOnCategoryID", "AdsOnCategoryName", "", "AdsOnID", "AdsOnName", "ItemID", "ItemName", "IsMultiSelectModifier", "", "Price", "", "(Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ZD)V", "getAdsOnCategoryID", "()I", "getAdsOnCategoryName", "()Ljava/lang/String;", "getAdsOnID", "getAdsOnName", "getIsMultiSelectModifier", "()Z", "getItemID", "setItemID", "(I)V", "getItemName", "getPrice", "()D", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;ZD)Lcom/corn/cornpos/data/database/AdsOn;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class AdsOn {
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Integer id = null;
    private final int AdsOnCategoryID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String AdsOnCategoryName = null;
    private final int AdsOnID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String AdsOnName = null;
    private int ItemID;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ItemName = null;
    private final boolean IsMultiSelectModifier = false;
    private final double Price = 0.0;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.database.AdsOn copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, int AdsOnCategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnCategoryName, int AdsOnID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnName, int ItemID, @org.jetbrains.annotations.NotNull
    java.lang.String ItemName, boolean IsMultiSelectModifier, double Price) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public AdsOn(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, int AdsOnCategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnCategoryName, int AdsOnID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnName, int ItemID, @org.jetbrains.annotations.NotNull
    java.lang.String ItemName, boolean IsMultiSelectModifier, double Price) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAdsOnCategoryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdsOnCategoryName() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getAdsOnID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdsOnName() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getItemID() {
        return 0;
    }
    
    public final void setItemID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItemName() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getIsMultiSelectModifier() {
        return false;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getPrice() {
        return 0.0;
    }
}