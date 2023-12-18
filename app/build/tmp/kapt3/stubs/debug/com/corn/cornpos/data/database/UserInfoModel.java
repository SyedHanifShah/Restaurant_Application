package com.corn.cornpos.data.database;

import java.lang.System;

@androidx.room.Entity
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\bC\b\u0087\b\u0018\u00002\u00020\u0001B\u00a9\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u00a2\u0006\u0002\u0010\u0019J\u0010\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\t\u00104\u001a\u00020\nH\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\nH\u00c6\u0003J\t\u0010>\u001a\u00020\u0005H\u00c6\u0003J\t\u0010?\u001a\u00020\nH\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\nH\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\nH\u00c6\u0003J\u00d8\u0001\u0010G\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\u00052\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\t\u0010L\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001bR\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0011\u0010\u0018\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101\u00a8\u0006M"}, d2 = {"Lcom/corn/cornpos/data/database/UserInfoModel;", "", "id", "", "Can_Delivery", "", "Can_DineIn", "Can_TakeAway", "DealColumn", "DefaultServiceType", "", "DefaultServiceTypeID", "DistributionID", "DistributionName", "DistributorName", "DistributorTypeID", "EncryptKey", "IS_CanGiveDiscount", "IsDistributorRegister", "IsEncrypted", "OTPicturesManadatory", "RoleID", "UserId", "UserName", "WorkingDate", "(Ljava/lang/Integer;ZZZILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIZZIILjava/lang/String;Ljava/lang/String;)V", "getCan_Delivery", "()Z", "getCan_DineIn", "getCan_TakeAway", "getDealColumn", "()I", "getDefaultServiceType", "()Ljava/lang/String;", "getDefaultServiceTypeID", "getDistributionID", "getDistributionName", "getDistributorName", "getDistributorTypeID", "getEncryptKey", "getIS_CanGiveDiscount", "getIsDistributorRegister", "getIsEncrypted", "getOTPicturesManadatory", "getRoleID", "getUserId", "getUserName", "getWorkingDate", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;ZZZILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIZZIILjava/lang/String;Ljava/lang/String;)Lcom/corn/cornpos/data/database/UserInfoModel;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class UserInfoModel {
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Integer id = null;
    private final boolean Can_Delivery = false;
    private final boolean Can_DineIn = false;
    private final boolean Can_TakeAway = false;
    private final int DealColumn = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DefaultServiceType = null;
    private final int DefaultServiceTypeID = 0;
    private final int DistributionID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DistributionName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DistributorName = null;
    private final int DistributorTypeID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String EncryptKey = null;
    private final boolean IS_CanGiveDiscount = false;
    private final int IsDistributorRegister = 0;
    private final boolean IsEncrypted = false;
    private final boolean OTPicturesManadatory = false;
    private final int RoleID = 0;
    private final int UserId = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String UserName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String WorkingDate = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.database.UserInfoModel copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, boolean Can_Delivery, boolean Can_DineIn, boolean Can_TakeAway, int DealColumn, @org.jetbrains.annotations.NotNull
    java.lang.String DefaultServiceType, int DefaultServiceTypeID, int DistributionID, @org.jetbrains.annotations.NotNull
    java.lang.String DistributionName, @org.jetbrains.annotations.NotNull
    java.lang.String DistributorName, int DistributorTypeID, @org.jetbrains.annotations.NotNull
    java.lang.String EncryptKey, boolean IS_CanGiveDiscount, int IsDistributorRegister, boolean IsEncrypted, boolean OTPicturesManadatory, int RoleID, int UserId, @org.jetbrains.annotations.NotNull
    java.lang.String UserName, @org.jetbrains.annotations.NotNull
    java.lang.String WorkingDate) {
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
    
    public UserInfoModel(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, boolean Can_Delivery, boolean Can_DineIn, boolean Can_TakeAway, int DealColumn, @org.jetbrains.annotations.NotNull
    java.lang.String DefaultServiceType, int DefaultServiceTypeID, int DistributionID, @org.jetbrains.annotations.NotNull
    java.lang.String DistributionName, @org.jetbrains.annotations.NotNull
    java.lang.String DistributorName, int DistributorTypeID, @org.jetbrains.annotations.NotNull
    java.lang.String EncryptKey, boolean IS_CanGiveDiscount, int IsDistributorRegister, boolean IsEncrypted, boolean OTPicturesManadatory, int RoleID, int UserId, @org.jetbrains.annotations.NotNull
    java.lang.String UserName, @org.jetbrains.annotations.NotNull
    java.lang.String WorkingDate) {
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
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getCan_Delivery() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final boolean getCan_DineIn() {
        return false;
    }
    
    public final boolean component4() {
        return false;
    }
    
    public final boolean getCan_TakeAway() {
        return false;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getDealColumn() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDefaultServiceType() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getDefaultServiceTypeID() {
        return 0;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getDistributionID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDistributionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDistributorName() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getDistributorTypeID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEncryptKey() {
        return null;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getIS_CanGiveDiscount() {
        return false;
    }
    
    public final int component14() {
        return 0;
    }
    
    public final int getIsDistributorRegister() {
        return 0;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getIsEncrypted() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean getOTPicturesManadatory() {
        return false;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getRoleID() {
        return 0;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getUserId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWorkingDate() {
        return null;
    }
}