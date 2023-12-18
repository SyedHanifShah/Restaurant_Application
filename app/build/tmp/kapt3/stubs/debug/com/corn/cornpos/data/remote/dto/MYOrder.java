package com.corn.cornpos.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u000bH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u000bH\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0006H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0006H\u00c6\u0003J\t\u0010C\u001a\u00020\u0006H\u00c6\u0003J\t\u0010D\u001a\u00020\bH\u00c6\u0003J\t\u0010E\u001a\u00020\bH\u00c6\u0003J\t\u0010F\u001a\u00020\u000bH\u00c6\u0003J\t\u0010G\u001a\u00020\bH\u00c6\u0003J\t\u0010H\u001a\u00020\bH\u00c6\u0003J\t\u0010I\u001a\u00020\bH\u00c6\u0003J\u00db\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010K\u001a\u00020\u000b2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010M\u001a\u00020\u0003H\u00d6\u0001J\t\u0010N\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0019\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0011\u0010\u000e\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010.R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001dR\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001dR\u0011\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010.\u00a8\u0006O"}, d2 = {"Lcom/corn/cornpos/data/remote/dto/MYOrder;", "", "OrderID", "", "ID", "Name", "", "Price", "", "Amount", "IsVoid", "", "Qty", "Discount", "ItemWiseGST", "IsAddsOn", "IsDeal", "DealID", "DealQty", "IsHasAddsOn", "ModifierParentID", "ModifierParentRowID", "InvoiceDetailID", "SectionID", "SectionName", "IsFree", "OrderNotes", "(IILjava/lang/String;DDZDDDZIIDZIIIILjava/lang/String;ILjava/lang/String;)V", "getAmount", "()D", "getDealID", "()I", "getDealQty", "getDiscount", "getID", "getInvoiceDetailID", "getIsAddsOn", "()Z", "getIsDeal", "getIsFree", "getIsHasAddsOn", "getIsVoid", "getItemWiseGST", "getModifierParentID", "getModifierParentRowID", "getName", "()Ljava/lang/String;", "getOrderID", "getOrderNotes", "getPrice", "getQty", "getSectionID", "getSectionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MYOrder {
    private final int OrderID = 0;
    private final int ID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Name = null;
    private final double Price = 0.0;
    private final double Amount = 0.0;
    private final boolean IsVoid = false;
    private final double Qty = 0.0;
    private final double Discount = 0.0;
    private final double ItemWiseGST = 0.0;
    private final boolean IsAddsOn = false;
    private final int IsDeal = 0;
    private final int DealID = 0;
    private final double DealQty = 0.0;
    private final boolean IsHasAddsOn = false;
    private final int ModifierParentID = 0;
    private final int ModifierParentRowID = 0;
    private final int InvoiceDetailID = 0;
    private final int SectionID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SectionName = null;
    private final int IsFree = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OrderNotes = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.remote.dto.MYOrder copy(int OrderID, int ID, @org.jetbrains.annotations.NotNull
    java.lang.String Name, double Price, double Amount, boolean IsVoid, double Qty, double Discount, double ItemWiseGST, boolean IsAddsOn, int IsDeal, int DealID, double DealQty, boolean IsHasAddsOn, int ModifierParentID, int ModifierParentRowID, int InvoiceDetailID, int SectionID, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, int IsFree, @org.jetbrains.annotations.NotNull
    java.lang.String OrderNotes) {
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
    
    public MYOrder(int OrderID, int ID, @org.jetbrains.annotations.NotNull
    java.lang.String Name, double Price, double Amount, boolean IsVoid, double Qty, double Discount, double ItemWiseGST, boolean IsAddsOn, int IsDeal, int DealID, double DealQty, boolean IsHasAddsOn, int ModifierParentID, int ModifierParentRowID, int InvoiceDetailID, int SectionID, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, int IsFree, @org.jetbrains.annotations.NotNull
    java.lang.String OrderNotes) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getOrderID() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double getAmount() {
        return 0.0;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean getIsVoid() {
        return false;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double getQty() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double getDiscount() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double getItemWiseGST() {
        return 0.0;
    }
    
    public final boolean component10() {
        return false;
    }
    
    public final boolean getIsAddsOn() {
        return false;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getIsDeal() {
        return 0;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getDealID() {
        return 0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    public final double getDealQty() {
        return 0.0;
    }
    
    public final boolean component14() {
        return false;
    }
    
    public final boolean getIsHasAddsOn() {
        return false;
    }
    
    public final int component15() {
        return 0;
    }
    
    public final int getModifierParentID() {
        return 0;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getModifierParentRowID() {
        return 0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getInvoiceDetailID() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getSectionID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionName() {
        return null;
    }
    
    public final int component20() {
        return 0;
    }
    
    public final int getIsFree() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderNotes() {
        return null;
    }
}