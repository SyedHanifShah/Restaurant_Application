package com.corn.cornpos.ui.screen.orderDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "", "()V", "OnCancelOrderClick", "OnDecreaseItem", "OnDelete", "OnIncreaseItem", "OnPLaceOrder", "OnUpdateOrder", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnCancelOrderClick;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnDecreaseItem;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnDelete;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnIncreaseItem;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnPLaceOrder;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnUpdateOrder;", "app_debug"})
public abstract class OrderEvents {
    
    private OrderEvents() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnIncreaseItem;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "item", "Lcom/corn/cornpos/data/database/OrderDetails;", "(Lcom/corn/cornpos/data/database/OrderDetails;)V", "getItem", "()Lcom/corn/cornpos/data/database/OrderDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnIncreaseItem extends com.corn.cornpos.ui.screen.orderDetail.OrderEvents {
        @org.jetbrains.annotations.NotNull
        private final com.corn.cornpos.data.database.OrderDetails item = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.ui.screen.orderDetail.OrderEvents.OnIncreaseItem copy(@org.jetbrains.annotations.NotNull
        com.corn.cornpos.data.database.OrderDetails item) {
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
        
        public OnIncreaseItem(@org.jetbrains.annotations.NotNull
        com.corn.cornpos.data.database.OrderDetails item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.data.database.OrderDetails component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.data.database.OrderDetails getItem() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnDecreaseItem;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "item", "Lcom/corn/cornpos/data/database/OrderDetails;", "(Lcom/corn/cornpos/data/database/OrderDetails;)V", "getItem", "()Lcom/corn/cornpos/data/database/OrderDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnDecreaseItem extends com.corn.cornpos.ui.screen.orderDetail.OrderEvents {
        @org.jetbrains.annotations.NotNull
        private final com.corn.cornpos.data.database.OrderDetails item = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.ui.screen.orderDetail.OrderEvents.OnDecreaseItem copy(@org.jetbrains.annotations.NotNull
        com.corn.cornpos.data.database.OrderDetails item) {
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
        
        public OnDecreaseItem(@org.jetbrains.annotations.NotNull
        com.corn.cornpos.data.database.OrderDetails item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.data.database.OrderDetails component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.data.database.OrderDetails getItem() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnDelete;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "item", "Lcom/corn/cornpos/data/database/OrderDetails;", "(Lcom/corn/cornpos/data/database/OrderDetails;)V", "getItem", "()Lcom/corn/cornpos/data/database/OrderDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class OnDelete extends com.corn.cornpos.ui.screen.orderDetail.OrderEvents {
        @org.jetbrains.annotations.NotNull
        private final com.corn.cornpos.data.database.OrderDetails item = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.ui.screen.orderDetail.OrderEvents.OnDelete copy(@org.jetbrains.annotations.NotNull
        com.corn.cornpos.data.database.OrderDetails item) {
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
        
        public OnDelete(@org.jetbrains.annotations.NotNull
        com.corn.cornpos.data.database.OrderDetails item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.data.database.OrderDetails component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.data.database.OrderDetails getItem() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnCancelOrderClick;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "()V", "app_debug"})
    public static final class OnCancelOrderClick extends com.corn.cornpos.ui.screen.orderDetail.OrderEvents {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.ui.screen.orderDetail.OrderEvents.OnCancelOrderClick INSTANCE = null;
        
        private OnCancelOrderClick() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnPLaceOrder;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "grossAmount", "", "GSTAmount", "(II)V", "getGSTAmount", "()I", "getGrossAmount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class OnPLaceOrder extends com.corn.cornpos.ui.screen.orderDetail.OrderEvents {
        private final int grossAmount = 0;
        private final int GSTAmount = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.ui.screen.orderDetail.OrderEvents.OnPLaceOrder copy(int grossAmount, int GSTAmount) {
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
        
        public OnPLaceOrder(int grossAmount, int GSTAmount) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getGrossAmount() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getGSTAmount() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents$OnUpdateOrder;", "Lcom/corn/cornpos/ui/screen/orderDetail/OrderEvents;", "grossAmount", "", "GSTAmount", "(II)V", "getGSTAmount", "()I", "getGrossAmount", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class OnUpdateOrder extends com.corn.cornpos.ui.screen.orderDetail.OrderEvents {
        private final int grossAmount = 0;
        private final int GSTAmount = 0;
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.ui.screen.orderDetail.OrderEvents.OnUpdateOrder copy(int grossAmount, int GSTAmount) {
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
        
        public OnUpdateOrder(int grossAmount, int GSTAmount) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getGrossAmount() {
            return 0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final int getGSTAmount() {
            return 0;
        }
    }
}