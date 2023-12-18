package com.corn.cornpos.data.database;

import java.lang.System;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b.\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\fH\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0012H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\tH\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\tH\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\fH\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\u00a9\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\tH\u00c6\u0001J\u0013\u0010<\u001a\u00020\f2\b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010>\u001a\u00020\u0003H\u00d6\u0001J\t\u0010?\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001dR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018R\u0011\u0010\u0015\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001d\u00a8\u0006@"}, d2 = {"Lcom/corn/cornpos/data/database/Products;", "", "ItemID", "", "CategoryID", "DiscountPer", "DiscountPrice", "Favourite", "ImagePath", "", "IsAddsOn", "IsDeal", "", "IsHasAddsOn", "IsUnGroup", "ItemCode", "ItemName", "Price", "", "Rating", "SectionID", "SectionName", "(IIIIILjava/lang/String;IZIZLjava/lang/String;Ljava/lang/String;DIILjava/lang/String;)V", "getCategoryID", "()I", "getDiscountPer", "getDiscountPrice", "getFavourite", "getImagePath", "()Ljava/lang/String;", "getIsAddsOn", "getIsDeal", "()Z", "getIsHasAddsOn", "getIsUnGroup", "getItemCode", "getItemID", "getItemName", "getPrice", "()D", "getRating", "getSectionID", "getSectionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Products {
    @androidx.room.PrimaryKey
    private final int ItemID = 0;
    private final int CategoryID = 0;
    private final int DiscountPer = 0;
    private final int DiscountPrice = 0;
    private final int Favourite = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ImagePath = null;
    private final int IsAddsOn = 0;
    private final boolean IsDeal = false;
    private final int IsHasAddsOn = 0;
    private final boolean IsUnGroup = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ItemCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ItemName = null;
    private final double Price = 0.0;
    private final int Rating = 0;
    private final int SectionID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SectionName = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.database.Products copy(int ItemID, int CategoryID, int DiscountPer, int DiscountPrice, int Favourite, @org.jetbrains.annotations.NotNull
    java.lang.String ImagePath, int IsAddsOn, boolean IsDeal, int IsHasAddsOn, boolean IsUnGroup, @org.jetbrains.annotations.NotNull
    java.lang.String ItemCode, @org.jetbrains.annotations.NotNull
    java.lang.String ItemName, double Price, int Rating, int SectionID, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName) {
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
    
    public Products(int ItemID, int CategoryID, int DiscountPer, int DiscountPrice, int Favourite, @org.jetbrains.annotations.NotNull
    java.lang.String ImagePath, int IsAddsOn, boolean IsDeal, int IsHasAddsOn, boolean IsUnGroup, @org.jetbrains.annotations.NotNull
    java.lang.String ItemCode, @org.jetbrains.annotations.NotNull
    java.lang.String ItemName, double Price, int Rating, int SectionID, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getItemID() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getCategoryID() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getDiscountPer() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getDiscountPrice() {
        return 0;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getFavourite() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImagePath() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getIsAddsOn() {
        return 0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getIsDeal() {
        return false;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getIsHasAddsOn() {
        return 0;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getIsUnGroup() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItemCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItemName() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getRating() {
        return 0;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getSectionID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionName() {
        return null;
    }
}