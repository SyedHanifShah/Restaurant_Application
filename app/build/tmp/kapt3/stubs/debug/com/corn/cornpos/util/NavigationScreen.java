package com.corn.cornpos.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\'\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n\u0082\u0001\u000b\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u00a8\u0006%"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen;", "", "baseRoute", "", "route", "title", "icon", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBaseRoute", "()Ljava/lang/String;", "getIcon", "()I", "getRoute", "getTitle", "DashboardScreen", "DeliveryScreen", "DineInScreen", "ForgotPassword", "Login", "MenuScreen", "OrderDetailScreen", "PIN", "Splash", "TableScreen", "TakeAwayScreen", "Lcom/corn/cornpos/util/NavigationScreen$DashboardScreen;", "Lcom/corn/cornpos/util/NavigationScreen$DeliveryScreen;", "Lcom/corn/cornpos/util/NavigationScreen$DineInScreen;", "Lcom/corn/cornpos/util/NavigationScreen$ForgotPassword;", "Lcom/corn/cornpos/util/NavigationScreen$Login;", "Lcom/corn/cornpos/util/NavigationScreen$MenuScreen;", "Lcom/corn/cornpos/util/NavigationScreen$OrderDetailScreen;", "Lcom/corn/cornpos/util/NavigationScreen$PIN;", "Lcom/corn/cornpos/util/NavigationScreen$Splash;", "Lcom/corn/cornpos/util/NavigationScreen$TableScreen;", "Lcom/corn/cornpos/util/NavigationScreen$TakeAwayScreen;", "app_debug"})
public abstract class NavigationScreen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String baseRoute = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    private final int icon = 0;
    
    private NavigationScreen(java.lang.String baseRoute, java.lang.String route, java.lang.String title, int icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBaseRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final int getIcon() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$Splash;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class Splash extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.Splash INSTANCE = null;
        
        private Splash() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$Login;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class Login extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.Login INSTANCE = null;
        
        private Login() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$PIN;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class PIN extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.PIN INSTANCE = null;
        
        private PIN() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$ForgotPassword;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class ForgotPassword extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.ForgotPassword INSTANCE = null;
        
        private ForgotPassword() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$DashboardScreen;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class DashboardScreen extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.DashboardScreen INSTANCE = null;
        
        private DashboardScreen() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$DeliveryScreen;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class DeliveryScreen extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.DeliveryScreen INSTANCE = null;
        
        private DeliveryScreen() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$DineInScreen;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class DineInScreen extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.DineInScreen INSTANCE = null;
        
        private DineInScreen() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$TakeAwayScreen;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class TakeAwayScreen extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.TakeAwayScreen INSTANCE = null;
        
        private TakeAwayScreen() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$TableScreen;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class TableScreen extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.TableScreen INSTANCE = null;
        
        private TableScreen() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$OrderDetailScreen;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class OrderDetailScreen extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.OrderDetailScreen INSTANCE = null;
        
        private OrderDetailScreen() {
            super(null, null, null, 0);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/corn/cornpos/util/NavigationScreen$MenuScreen;", "Lcom/corn/cornpos/util/NavigationScreen;", "()V", "app_debug"})
    public static final class MenuScreen extends com.corn.cornpos.util.NavigationScreen {
        @org.jetbrains.annotations.NotNull
        public static final com.corn.cornpos.util.NavigationScreen.MenuScreen INSTANCE = null;
        
        private MenuScreen() {
            super(null, null, null, 0);
        }
    }
}