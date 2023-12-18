package com.corn.cornpos.ui.screen.dashboard;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u001a\u0010\u000b\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\u000f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0016\u001a\u00020\u000f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u001a\u0010\u001a\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001c\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0006R\u001a\u0010\u001e\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0006R\u001a\u0010 \u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u001a\u0010\"\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0006R\u001a\u0010$\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u001a\u0010&\u001a\u00020\u000f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0011R\u001a\u0010(\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b)\u0010\u0006R\u001a\u0010*\u001a\u00020\u000f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b+\u0010\u0011R\u0011\u0010,\u001a\u00020-8G\u00a2\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\u00020\f8G\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\u001a\u0004\b1\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b!\u00a8\u00062"}, d2 = {"Lcom/corn/cornpos/ui/screen/dashboard/DashboardValues;", "", "()V", "columnHeight", "", "getColumnHeight", "()F", "doteSpacing", "getDoteSpacing", "dottedLineHeight", "getDottedLineHeight", "gridBottomPadding", "Landroidx/compose/ui/unit/Dp;", "getGridBottomPadding-D9Ej5fM", "logoutFontSize", "Landroidx/compose/ui/unit/TextUnit;", "getLogoutFontSize-XSAIIZE", "()J", "mainContentColumnTopPadding", "getMainContentColumnTopPadding-D9Ej5fM", "mainContentTopPadding", "getMainContentTopPadding-D9Ej5fM", "normalTextFontSize", "getNormalTextFontSize-XSAIIZE", "orderCardViewHeight", "getOrderCardViewHeight-D9Ej5fM", "orderCardViewHorizontalPadding", "getOrderCardViewHorizontalPadding-D9Ej5fM", "orderCardViewIconSize", "getOrderCardViewIconSize-D9Ej5fM", "orderCardViewVerticalPadding", "getOrderCardViewVerticalPadding-D9Ej5fM", "orderListViewHeight", "getOrderListViewHeight-D9Ej5fM", "orderListViewHorizontalPadding", "getOrderListViewHorizontalPadding-D9Ej5fM", "orderListViewIconSize", "getOrderListViewIconSize-D9Ej5fM", "orderListViewNormalTextFontSize", "getOrderListViewNormalTextFontSize-XSAIIZE", "orderListViewWidth", "getOrderListViewWidth-D9Ej5fM", "titleFontSize", "getTitleFontSize-XSAIIZE", "titleTextCount", "", "getTitleTextCount", "()I", "topRowTopPadding", "getTopRowTopPadding-D9Ej5fM", "app_debug"})
public final class DashboardValues {
    @org.jetbrains.annotations.NotNull
    public static final com.corn.cornpos.ui.screen.dashboard.DashboardValues INSTANCE = null;
    
    private DashboardValues() {
        super();
    }
    
    @androidx.compose.runtime.Composable
    public final int getTitleTextCount() {
        return 0;
    }
    
    @androidx.compose.runtime.Composable
    public final float getColumnHeight() {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable
    public final float getDottedLineHeight() {
        return 0.0F;
    }
    
    @androidx.compose.runtime.Composable
    public final float getDoteSpacing() {
        return 0.0F;
    }
}