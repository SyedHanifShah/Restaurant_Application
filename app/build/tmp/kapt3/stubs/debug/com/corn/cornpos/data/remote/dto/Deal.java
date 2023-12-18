package com.corn.cornpos.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b9\b\u0087\b\u0018\u00002\u00020\u0001B\u00bb\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0018J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000b\u00104\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010?\u001a\u00020\u000bH\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u00c6\u0003J\u00d2\u0001\u0010B\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u0003H\u00d6\u0001J\t\u0010G\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001aR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\b0\u0010)\u00a8\u0006H"}, d2 = {"Lcom/corn/cornpos/data/remote/dto/Deal;", "", "DealID", "", "DealName", "", "DealQty", "GSTPer", "IsFree", "IsModifiedItem", "IsUnGroup", "", "IsVoid", "Items", "", "Lcom/corn/cornpos/data/remote/dto/DealItem;", "KDSQty", "ModifierParentRowID", "OriginalQty", "Price", "ProductCategoryID", "SaleMUnitCode", "VoidBy", "intDealID", "(ILjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZILjava/util/List;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;)V", "getDealID", "()I", "getDealName", "()Ljava/lang/String;", "getDealQty", "getGSTPer", "()Ljava/lang/Object;", "getIsFree", "getIsModifiedItem", "getIsUnGroup", "()Z", "getIsVoid", "getItems", "()Ljava/util/List;", "getKDSQty", "getModifierParentRowID", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOriginalQty", "getPrice", "getProductCategoryID", "getSaleMUnitCode", "getVoidBy", "getIntDealID", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZILjava/util/List;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;)Lcom/corn/cornpos/data/remote/dto/Deal;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Deal {
    private final int DealID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DealName = null;
    private final int DealQty = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object GSTPer = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object IsFree = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object IsModifiedItem = null;
    private final boolean IsUnGroup = false;
    private final int IsVoid = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.corn.cornpos.data.remote.dto.DealItem> Items = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object KDSQty = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer ModifierParentRowID = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object OriginalQty = null;
    private final int Price = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object ProductCategoryID = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object SaleMUnitCode = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object VoidBy = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer intDealID = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.remote.dto.Deal copy(int DealID, @org.jetbrains.annotations.NotNull
    java.lang.String DealName, int DealQty, @org.jetbrains.annotations.Nullable
    java.lang.Object GSTPer, @org.jetbrains.annotations.Nullable
    java.lang.Object IsFree, @org.jetbrains.annotations.Nullable
    java.lang.Object IsModifiedItem, boolean IsUnGroup, int IsVoid, @org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.remote.dto.DealItem> Items, @org.jetbrains.annotations.Nullable
    java.lang.Object KDSQty, @org.jetbrains.annotations.Nullable
    java.lang.Integer ModifierParentRowID, @org.jetbrains.annotations.Nullable
    java.lang.Object OriginalQty, int Price, @org.jetbrains.annotations.Nullable
    java.lang.Object ProductCategoryID, @org.jetbrains.annotations.Nullable
    java.lang.Object SaleMUnitCode, @org.jetbrains.annotations.Nullable
    java.lang.Object VoidBy, @org.jetbrains.annotations.Nullable
    java.lang.Integer intDealID) {
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
    
    public Deal(int DealID, @org.jetbrains.annotations.NotNull
    java.lang.String DealName, int DealQty, @org.jetbrains.annotations.Nullable
    java.lang.Object GSTPer, @org.jetbrains.annotations.Nullable
    java.lang.Object IsFree, @org.jetbrains.annotations.Nullable
    java.lang.Object IsModifiedItem, boolean IsUnGroup, int IsVoid, @org.jetbrains.annotations.NotNull
    java.util.List<com.corn.cornpos.data.remote.dto.DealItem> Items, @org.jetbrains.annotations.Nullable
    java.lang.Object KDSQty, @org.jetbrains.annotations.Nullable
    java.lang.Integer ModifierParentRowID, @org.jetbrains.annotations.Nullable
    java.lang.Object OriginalQty, int Price, @org.jetbrains.annotations.Nullable
    java.lang.Object ProductCategoryID, @org.jetbrains.annotations.Nullable
    java.lang.Object SaleMUnitCode, @org.jetbrains.annotations.Nullable
    java.lang.Object VoidBy, @org.jetbrains.annotations.Nullable
    java.lang.Integer intDealID) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getDealID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDealName() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getDealQty() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getGSTPer() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getIsFree() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getIsModifiedItem() {
        return null;
    }
    
    public final boolean component7() {
        return false;
    }
    
    public final boolean getIsUnGroup() {
        return false;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getIsVoid() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.remote.dto.DealItem> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.corn.cornpos.data.remote.dto.DealItem> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getKDSQty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getModifierParentRowID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getOriginalQty() {
        return null;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getProductCategoryID() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSaleMUnitCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getVoidBy() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getIntDealID() {
        return null;
    }
}