package com.corn.cornpos.ui.screen.menu;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/corn/cornpos/ui/screen/menu/MenuEvents;", "", "()V", "OnItemClick", "Lcom/corn/cornpos/ui/screen/menu/MenuEvents$OnItemClick;", "app_debug"})
public abstract class MenuEvents {
    
    private MenuEvents() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jx\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013\u00a8\u00060"}, d2 = {"Lcom/corn/cornpos/ui/screen/menu/MenuEvents$OnItemClick;", "Lcom/corn/cornpos/ui/screen/menu/MenuEvents;", "ItemId", "", "name", "", "quantity", "price", "", "sectionName", "parentRowId", "adsOnCategory", "isDeal", "parentDeal", "intDealId", "(ILjava/lang/String;IDLjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)V", "getItemId", "()I", "getAdsOnCategory", "()Ljava/lang/String;", "getIntDealId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getName", "getParentDeal", "getParentRowId", "getPrice", "()D", "getQuantity", "getSectionName", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;IDLjava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/Integer;)Lcom/corn/cornpos/ui/screen/menu/MenuEvents$OnItemClick;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
    public static final class OnItemClick extends com.corn.cornpos.ui.screen.menu.MenuEvents {
        private final int ItemId = 0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String name = null;
        private final int quantity = 0;
        private final double price = 0.0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String sectionName = null;
        private final int parentRowId = 0;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String adsOnCategory = null;
        private final int isDeal = 0;
        @org.jetbrains.annotations.Nullable
        private final java.lang.String parentDeal = null;
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer intDealId = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.corn.cornpos.ui.screen.menu.MenuEvents.OnItemClick copy(int ItemId, @org.jetbrains.annotations.NotNull
        java.lang.String name, int quantity, double price, @org.jetbrains.annotations.NotNull
        java.lang.String sectionName, int parentRowId, @org.jetbrains.annotations.Nullable
        java.lang.String adsOnCategory, int isDeal, @org.jetbrains.annotations.Nullable
        java.lang.String parentDeal, @org.jetbrains.annotations.Nullable
        java.lang.Integer intDealId) {
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
        
        public OnItemClick(int ItemId, @org.jetbrains.annotations.NotNull
        java.lang.String name, int quantity, double price, @org.jetbrains.annotations.NotNull
        java.lang.String sectionName, int parentRowId, @org.jetbrains.annotations.Nullable
        java.lang.String adsOnCategory, int isDeal, @org.jetbrains.annotations.Nullable
        java.lang.String parentDeal, @org.jetbrains.annotations.Nullable
        java.lang.Integer intDealId) {
            super();
        }
        
        public final int component1() {
            return 0;
        }
        
        public final int getItemId() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getName() {
            return null;
        }
        
        public final int component3() {
            return 0;
        }
        
        public final int getQuantity() {
            return 0;
        }
        
        public final double component4() {
            return 0.0;
        }
        
        public final double getPrice() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getSectionName() {
            return null;
        }
        
        public final int component6() {
            return 0;
        }
        
        public final int getParentRowId() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAdsOnCategory() {
            return null;
        }
        
        public final int component8() {
            return 0;
        }
        
        public final int isDeal() {
            return 0;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getParentDeal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getIntDealId() {
            return null;
        }
    }
}