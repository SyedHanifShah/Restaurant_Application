package com.corn.cornpos.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\bF\b\u0087\b\u0018\u00002\u00020\u0001B\u00c9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u0019J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\tH\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\t\u0010?\u001a\u00020\tH\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u0010A\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010C\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010D\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\t\u0010E\u001a\u00020\u0007H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u00e8\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010JJ\u0013\u0010K\u001a\u00020\u00072\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010M\u001a\u00020\u0003H\u00d6\u0001J\t\u0010N\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\n\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b.\u0010\u001dR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b0\u0010\u001dR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001bR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010%R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010%\u00a8\u0006O"}, d2 = {"Lcom/corn/cornpos/data/remote/dto/OrderItems;", "", "Discount", "", "GSTPer", "ID", "IsFree", "", "IsModifiedItem", "", "IsUnGroup", "IsVoid", "IsDeal", "ItemWiseGST", "KDSQty", "ModifierParentRowID", "Name", "OrderNotes", "OriginalQty", "Price", "ProductCategoryID", "Qty", "SaleMUnitCode", "SectionName", "VoidBy", "(ILjava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/String;ZIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDiscount", "()I", "getGSTPer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getID", "getIsDeal", "getIsFree", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIsModifiedItem", "()Ljava/lang/String;", "getIsUnGroup", "()Z", "getIsVoid", "getItemWiseGST", "getKDSQty", "getModifierParentRowID", "getName", "getOrderNotes", "getOriginalQty", "getPrice", "getProductCategoryID", "getQty", "getSaleMUnitCode", "getSectionName", "getVoidBy", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;ILjava/lang/Boolean;Ljava/lang/String;ZIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/Integer;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/corn/cornpos/data/remote/dto/OrderItems;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class OrderItems {
    private final int Discount = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer GSTPer = null;
    private final int ID = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean IsFree = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String IsModifiedItem = null;
    private final boolean IsUnGroup = false;
    private final int IsVoid = 0;
    private final int IsDeal = 0;
    private final int ItemWiseGST = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String KDSQty = null;
    private final int ModifierParentRowID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String OrderNotes = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer OriginalQty = null;
    private final int Price = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer ProductCategoryID = null;
    private final int Qty = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer SaleMUnitCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SectionName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String VoidBy = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.remote.dto.OrderItems copy(int Discount, @org.jetbrains.annotations.Nullable
    java.lang.Integer GSTPer, int ID, @org.jetbrains.annotations.Nullable
    java.lang.Boolean IsFree, @org.jetbrains.annotations.Nullable
    java.lang.String IsModifiedItem, boolean IsUnGroup, int IsVoid, int IsDeal, int ItemWiseGST, @org.jetbrains.annotations.Nullable
    java.lang.String KDSQty, int ModifierParentRowID, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.Nullable
    java.lang.String OrderNotes, @org.jetbrains.annotations.Nullable
    java.lang.Integer OriginalQty, int Price, @org.jetbrains.annotations.Nullable
    java.lang.Integer ProductCategoryID, int Qty, @org.jetbrains.annotations.Nullable
    java.lang.Integer SaleMUnitCode, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, @org.jetbrains.annotations.Nullable
    java.lang.String VoidBy) {
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
    
    public OrderItems(int Discount, @org.jetbrains.annotations.Nullable
    java.lang.Integer GSTPer, int ID, @org.jetbrains.annotations.Nullable
    java.lang.Boolean IsFree, @org.jetbrains.annotations.Nullable
    java.lang.String IsModifiedItem, boolean IsUnGroup, int IsVoid, int IsDeal, int ItemWiseGST, @org.jetbrains.annotations.Nullable
    java.lang.String KDSQty, int ModifierParentRowID, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.Nullable
    java.lang.String OrderNotes, @org.jetbrains.annotations.Nullable
    java.lang.Integer OriginalQty, int Price, @org.jetbrains.annotations.Nullable
    java.lang.Integer ProductCategoryID, int Qty, @org.jetbrains.annotations.Nullable
    java.lang.Integer SaleMUnitCode, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, @org.jetbrains.annotations.Nullable
    java.lang.String VoidBy) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getDiscount() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getGSTPer() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getID() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getIsFree() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getIsModifiedItem() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getIsUnGroup() {
        return false;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getIsVoid() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getIsDeal() {
        return 0;
    }
    
    public final int component9() {
        return 0;
    }
    
    public final int getItemWiseGST() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getKDSQty() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getModifierParentRowID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getOrderNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getOriginalQty() {
        return null;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getPrice() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getProductCategoryID() {
        return null;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getQty() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSaleMUnitCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVoidBy() {
        return null;
    }
}