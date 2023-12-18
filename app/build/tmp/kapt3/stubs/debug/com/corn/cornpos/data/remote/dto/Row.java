package com.corn.cornpos.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b[\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0010\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010$\u001a\u00020\u0006\u00a2\u0006\u0002\u0010%J\t\u0010J\u001a\u00020\u0003H\u00c6\u0003J\t\u0010K\u001a\u00020\u0001H\u00c6\u0003J\t\u0010L\u001a\u00020\u0003H\u00c6\u0003J\t\u0010M\u001a\u00020\u0010H\u00c6\u0003J\t\u0010N\u001a\u00020\u0003H\u00c6\u0003J\t\u0010O\u001a\u00020\u0010H\u00c6\u0003J\t\u0010P\u001a\u00020\u0010H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0010H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0010H\u00c6\u0003J\t\u0010T\u001a\u00020\u0006H\u00c6\u0003J\t\u0010U\u001a\u00020\u0001H\u00c6\u0003J\t\u0010V\u001a\u00020\u0010H\u00c6\u0003J\t\u0010W\u001a\u00020\u0006H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\t\u0010[\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\\\u001a\u00020\u0010H\u00c6\u0003J\t\u0010]\u001a\u00020\u0006H\u00c6\u0003J\t\u0010^\u001a\u00020\u0010H\u00c6\u0003J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0006H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010d\u001a\u00020\u0006H\u00c6\u0003J\t\u0010e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010f\u001a\u00020\u0006H\u00c6\u0003J\t\u0010g\u001a\u00020\u0006H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u0001H\u00c6\u0003J\u00cb\u0002\u0010j\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010$\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010k\u001a\u00020l2\b\u0010m\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010n\u001a\u00020\u0003H\u00d6\u0001J\t\u0010o\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010+R\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010+R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\'R\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0011\u0010\r\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\'R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\'R\u0011\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00105R\u0011\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00105R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010\'R\u0011\u0010\u0016\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0011\u0010\u0017\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010+R\u0011\u0010\u0018\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00105R\u0011\u0010\u0019\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010+R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010\'R\u0011\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010+R\u0011\u0010\u001c\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010\'R\u0011\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\'R\u0011\u0010\u001e\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00105R\u0011\u0010\u001f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010+R\u0011\u0010 \u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u0011\u0010!\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\'R\u0011\u0010\"\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010\'R\u0013\u0010#\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u0010+R\u0011\u0010$\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010+\u00a8\u0006p"}, d2 = {"Lcom/corn/cornpos/data/remote/dto/Row;", "", "BankDiscountID", "", "BankID", "CoverTable", "", "Covers", "CreateDateTime", "CreditCardAccountTile", "CreditCardNo", "CustomerID", "CustomerID1", "CustomerName", "DeliveryChannel", "Discount", "", "DiscountType", "GSTAmount", "GSTPer", "GrossAmount", "InvoiceNo", "ItemWiseDiscount", "ManualOrderNo", "NetAmount", "OrderDetail", "OrderID", "OrderNO", "OrderTakeId", "PaymentMode", "PaymentReceived", "Remarks", "ServiceCharges", "ServiceChargesType", "ServiceTypeID", "TableDetail", "TableID", "(ILjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;Ljava/lang/Object;IDIDDDIDLjava/lang/String;DLjava/lang/String;ILjava/lang/String;IIDLjava/lang/String;DIILjava/lang/String;Ljava/lang/String;)V", "getBankDiscountID", "()I", "getBankID", "()Ljava/lang/Object;", "getCoverTable", "()Ljava/lang/String;", "getCovers", "getCreateDateTime", "getCreditCardAccountTile", "getCreditCardNo", "getCustomerID", "getCustomerID1", "getCustomerName", "getDeliveryChannel", "getDiscount", "()D", "getDiscountType", "getGSTAmount", "getGSTPer", "getGrossAmount", "getInvoiceNo", "getItemWiseDiscount", "getManualOrderNo", "getNetAmount", "getOrderDetail", "getOrderID", "getOrderNO", "getOrderTakeId", "getPaymentMode", "getPaymentReceived", "getRemarks", "getServiceCharges", "getServiceChargesType", "getServiceTypeID", "getTableDetail", "getTableID", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class Row {
    private final int BankDiscountID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object BankID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CoverTable = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Covers = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CreateDateTime = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CreditCardAccountTile = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CreditCardNo = null;
    private final int CustomerID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object CustomerID1 = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object CustomerName = null;
    private final int DeliveryChannel = 0;
    private final double Discount = 0.0;
    private final int DiscountType = 0;
    private final double GSTAmount = 0.0;
    private final double GSTPer = 0.0;
    private final double GrossAmount = 0.0;
    private final int InvoiceNo = 0;
    private final double ItemWiseDiscount = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ManualOrderNo = null;
    private final double NetAmount = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OrderDetail = null;
    private final int OrderID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OrderNO = null;
    private final int OrderTakeId = 0;
    private final int PaymentMode = 0;
    private final double PaymentReceived = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Remarks = null;
    private final double ServiceCharges = 0.0;
    private final int ServiceChargesType = 0;
    private final int ServiceTypeID = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String TableDetail = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TableID = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.remote.dto.Row copy(int BankDiscountID, @org.jetbrains.annotations.NotNull
    java.lang.Object BankID, @org.jetbrains.annotations.NotNull
    java.lang.String CoverTable, @org.jetbrains.annotations.NotNull
    java.lang.String Covers, @org.jetbrains.annotations.NotNull
    java.lang.String CreateDateTime, @org.jetbrains.annotations.NotNull
    java.lang.String CreditCardAccountTile, @org.jetbrains.annotations.NotNull
    java.lang.String CreditCardNo, int CustomerID, @org.jetbrains.annotations.NotNull
    java.lang.Object CustomerID1, @org.jetbrains.annotations.NotNull
    java.lang.Object CustomerName, int DeliveryChannel, double Discount, int DiscountType, double GSTAmount, double GSTPer, double GrossAmount, int InvoiceNo, double ItemWiseDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String ManualOrderNo, double NetAmount, @org.jetbrains.annotations.NotNull
    java.lang.String OrderDetail, int OrderID, @org.jetbrains.annotations.NotNull
    java.lang.String OrderNO, int OrderTakeId, int PaymentMode, double PaymentReceived, @org.jetbrains.annotations.NotNull
    java.lang.String Remarks, double ServiceCharges, int ServiceChargesType, int ServiceTypeID, @org.jetbrains.annotations.Nullable
    java.lang.String TableDetail, @org.jetbrains.annotations.NotNull
    java.lang.String TableID) {
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
    
    public Row(int BankDiscountID, @org.jetbrains.annotations.NotNull
    java.lang.Object BankID, @org.jetbrains.annotations.NotNull
    java.lang.String CoverTable, @org.jetbrains.annotations.NotNull
    java.lang.String Covers, @org.jetbrains.annotations.NotNull
    java.lang.String CreateDateTime, @org.jetbrains.annotations.NotNull
    java.lang.String CreditCardAccountTile, @org.jetbrains.annotations.NotNull
    java.lang.String CreditCardNo, int CustomerID, @org.jetbrains.annotations.NotNull
    java.lang.Object CustomerID1, @org.jetbrains.annotations.NotNull
    java.lang.Object CustomerName, int DeliveryChannel, double Discount, int DiscountType, double GSTAmount, double GSTPer, double GrossAmount, int InvoiceNo, double ItemWiseDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String ManualOrderNo, double NetAmount, @org.jetbrains.annotations.NotNull
    java.lang.String OrderDetail, int OrderID, @org.jetbrains.annotations.NotNull
    java.lang.String OrderNO, int OrderTakeId, int PaymentMode, double PaymentReceived, @org.jetbrains.annotations.NotNull
    java.lang.String Remarks, double ServiceCharges, int ServiceChargesType, int ServiceTypeID, @org.jetbrains.annotations.Nullable
    java.lang.String TableDetail, @org.jetbrains.annotations.NotNull
    java.lang.String TableID) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getBankDiscountID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBankID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCoverTable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCovers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreateDateTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreditCardAccountTile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCreditCardNo() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    public final int getCustomerID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getCustomerID1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getCustomerName() {
        return null;
    }
    
    public final int component11() {
        return 0;
    }
    
    public final int getDeliveryChannel() {
        return 0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getDiscount() {
        return 0.0;
    }
    
    public final int component13() {
        return 0;
    }
    
    public final int getDiscountType() {
        return 0;
    }
    
    public final double component14() {
        return 0.0;
    }
    
    public final double getGSTAmount() {
        return 0.0;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double getGSTPer() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final double getGrossAmount() {
        return 0.0;
    }
    
    public final int component17() {
        return 0;
    }
    
    public final int getInvoiceNo() {
        return 0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final double getItemWiseDiscount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getManualOrderNo() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double getNetAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderDetail() {
        return null;
    }
    
    public final int component22() {
        return 0;
    }
    
    public final int getOrderID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderNO() {
        return null;
    }
    
    public final int component24() {
        return 0;
    }
    
    public final int getOrderTakeId() {
        return 0;
    }
    
    public final int component25() {
        return 0;
    }
    
    public final int getPaymentMode() {
        return 0;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    public final double getPaymentReceived() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRemarks() {
        return null;
    }
    
    public final double component28() {
        return 0.0;
    }
    
    public final double getServiceCharges() {
        return 0.0;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final int getServiceChargesType() {
        return 0;
    }
    
    public final int component30() {
        return 0;
    }
    
    public final int getServiceTypeID() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTableDetail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableID() {
        return null;
    }
}