package com.corn.cornpos.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001B\u00b1\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010\u0016J\u000b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010/\u001a\u00020\u0004H\u00c6\u0003J\t\u00100\u001a\u00020\u000fH\u00c6\u0003J\t\u00101\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u00105\u001a\u00020\u000fH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u00107\u001a\u00020\u0004H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\u0004H\u00c6\u0003J\t\u0010<\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010(J\u00ca\u0001\u0010?\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\b2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0004H\u00d6\u0001J\t\u0010D\u001a\u00020\u000fH\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\n\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010)\u001a\u0004\b\'\u0010(R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0018R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010$R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0018\u00a8\u0006E"}, d2 = {"Lcom/corn/cornpos/data/remote/dto/DealItem;", "", "GSTPer", "ID", "", "IsFree", "IsModifiedItem", "IsUnGroup", "", "IsVoid", "ItemWiseGST", "KDSQty", "Price", "ModifierParentRowID", "Name", "", "OrderNotes", "OriginalQty", "ProductCategoryID", "SaleMUnitCode", "SectionName", "VoidBy", "(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ZIILjava/lang/Object;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V", "getGSTPer", "()Ljava/lang/Object;", "getID", "()I", "getIsFree", "getIsModifiedItem", "getIsUnGroup", "()Z", "getIsVoid", "getItemWiseGST", "getKDSQty", "getModifierParentRowID", "getName", "()Ljava/lang/String;", "getOrderNotes", "getOriginalQty", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProductCategoryID", "getSaleMUnitCode", "getSectionName", "getVoidBy", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ZIILjava/lang/Object;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lcom/corn/cornpos/data/remote/dto/DealItem;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class DealItem {
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object GSTPer = null;
    private final int ID = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object IsFree = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object IsModifiedItem = null;
    private final boolean IsUnGroup = false;
    private final int IsVoid = 0;
    private final int ItemWiseGST = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object KDSQty = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer Price = null;
    private final int ModifierParentRowID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OrderNotes = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object OriginalQty = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object ProductCategoryID = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object SaleMUnitCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SectionName = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object VoidBy = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.remote.dto.DealItem copy(@org.jetbrains.annotations.Nullable
    java.lang.Object GSTPer, int ID, @org.jetbrains.annotations.Nullable
    java.lang.Object IsFree, @org.jetbrains.annotations.Nullable
    java.lang.Object IsModifiedItem, boolean IsUnGroup, int IsVoid, int ItemWiseGST, @org.jetbrains.annotations.Nullable
    java.lang.Object KDSQty, @org.jetbrains.annotations.Nullable
    java.lang.Integer Price, int ModifierParentRowID, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.NotNull
    java.lang.String OrderNotes, @org.jetbrains.annotations.Nullable
    java.lang.Object OriginalQty, @org.jetbrains.annotations.Nullable
    java.lang.Object ProductCategoryID, @org.jetbrains.annotations.Nullable
    java.lang.Object SaleMUnitCode, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, @org.jetbrains.annotations.Nullable
    java.lang.Object VoidBy) {
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
    
    public DealItem(@org.jetbrains.annotations.Nullable
    java.lang.Object GSTPer, int ID, @org.jetbrains.annotations.Nullable
    java.lang.Object IsFree, @org.jetbrains.annotations.Nullable
    java.lang.Object IsModifiedItem, boolean IsUnGroup, int IsVoid, int ItemWiseGST, @org.jetbrains.annotations.Nullable
    java.lang.Object KDSQty, @org.jetbrains.annotations.Nullable
    java.lang.Integer Price, int ModifierParentRowID, @org.jetbrains.annotations.NotNull
    java.lang.String Name, @org.jetbrains.annotations.NotNull
    java.lang.String OrderNotes, @org.jetbrains.annotations.Nullable
    java.lang.Object OriginalQty, @org.jetbrains.annotations.Nullable
    java.lang.Object ProductCategoryID, @org.jetbrains.annotations.Nullable
    java.lang.Object SaleMUnitCode, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, @org.jetbrains.annotations.Nullable
    java.lang.Object VoidBy) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getGSTPer() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getID() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getIsFree() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getIsModifiedItem() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final boolean getIsUnGroup() {
        return false;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getIsVoid() {
        return 0;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getItemWiseGST() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getKDSQty() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getPrice() {
        return null;
    }
    
    public final int component10() {
        return 0;
    }
    
    public final int getModifierParentRowID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderNotes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getOriginalQty() {
        return null;
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getVoidBy() {
        return null;
    }
}