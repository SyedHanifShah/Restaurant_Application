package com.corn.cornpos.ui.screen.login;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0011\u0010I\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u0011\u0010K\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u0011\u0010L\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010JJ\u000e\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020#J\u000e\u0010P\u001a\u00020N2\u0006\u0010O\u001a\u00020#J\u0006\u0010Q\u001a\u00020NJ\u000e\u0010R\u001a\u00020N2\u0006\u0010S\u001a\u00020TJ\u0010\u0010U\u001a\u00020N2\u0006\u0010S\u001a\u00020\u0012H\u0002R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R+\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0019\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010(\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b+\u0010\u001a\u001a\u0004\b)\u0010\u0016\"\u0004\b*\u0010\u0018R+\u0010,\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b.\u0010\u001a\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R+\u0010/\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b2\u0010\u001a\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u00103\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b6\u0010\u001a\u001a\u0004\b4\u0010\u001d\"\u0004\b5\u0010\u001fR+\u00107\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b:\u0010\u001a\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u0017\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010=R/\u0010?\u001a\u0004\u0018\u00010>2\b\u0010\u0013\u001a\u0004\u0018\u00010>8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bD\u0010\u001a\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR+\u0010E\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bH\u0010\u001a\u001a\u0004\bF\u0010\u001d\"\u0004\bG\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006V"}, d2 = {"Lcom/corn/cornpos/ui/screen/login/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/corn/cornpos/repository/CornPosRepository;", "dataBaseRepository", "Lcom/corn/cornpos/repository/CornDataBaseRepository;", "application", "Landroid/content/Context;", "(Lcom/corn/cornpos/repository/CornPosRepository;Lcom/corn/cornpos/repository/CornDataBaseRepository;Landroid/content/Context;)V", "_clientConnString", "Lkotlinx/coroutines/flow/Flow;", "", "_firstLogin", "", "_savedPassword", "_saveduserName", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/corn/cornpos/util/UiEvent;", "<set-?>", "circleProgress", "getCircleProgress", "()Z", "setCircleProgress", "(Z)V", "circleProgress$delegate", "Landroidx/compose/runtime/MutableState;", "clientConnString", "getClientConnString", "()Ljava/lang/String;", "setClientConnString", "(Ljava/lang/String;)V", "clientConnString$delegate", "data", "Landroidx/compose/runtime/MutableState;", "Lcom/corn/cornpos/data/remote/dto/LoginDto;", "getData", "()Landroidx/compose/runtime/MutableState;", "dataStore", "Lcom/corn/cornpos/data/CornPosDataStore;", "getMatserData", "getGetMatserData", "setGetMatserData", "getMatserData$delegate", "isFirstLogin", "setFirstLogin", "isFirstLogin$delegate", "password", "getPassword", "setPassword", "password$delegate", "savedPassword", "getSavedPassword", "setSavedPassword", "savedPassword$delegate", "savedUserName", "getSavedUserName", "setSavedUserName", "savedUserName$delegate", "uiEvent", "getUiEvent", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/corn/cornpos/data/remote/dto/UerInfo;", "userData", "getUserData", "()Lcom/corn/cornpos/data/remote/dto/UerInfo;", "setUserData", "(Lcom/corn/cornpos/data/remote/dto/UerInfo;)V", "userData$delegate", "userName", "getUserName", "setUserName", "userName$delegate", "callApi1", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callApi2", "callApi3", "insertLoginDataToDataBase", "", "body", "insertUserInfoDataToDataBase", "loginFromBiometric", "onEvent", "event", "Lcom/corn/cornpos/ui/screen/login/LoginEvents;", "sentUiEvent", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    private final com.corn.cornpos.repository.CornPosRepository repository = null;
    private final com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository = null;
    private final kotlinx.coroutines.channels.Channel<com.corn.cornpos.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState password$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState userName$delegate = null;
    private final com.corn.cornpos.data.CornPosDataStore dataStore = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _clientConnString = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState clientConnString$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.Boolean> _firstLogin = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState isFirstLogin$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _saveduserName = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState savedUserName$delegate = null;
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _savedPassword = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState savedPassword$delegate = null;
    @org.jetbrains.annotations.Nullable
    private final androidx.compose.runtime.MutableState userData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState circleProgress$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState getMatserData$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.corn.cornpos.data.remote.dto.LoginDto> data = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.repository.CornPosRepository repository, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.repository.CornDataBaseRepository dataBaseRepository, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> getUiEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getClientConnString() {
        return null;
    }
    
    public final void setClientConnString(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final boolean isFirstLogin() {
        return false;
    }
    
    public final void setFirstLogin(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSavedUserName() {
        return null;
    }
    
    public final void setSavedUserName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSavedPassword() {
        return null;
    }
    
    public final void setSavedPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.corn.cornpos.data.remote.dto.UerInfo getUserData() {
        return null;
    }
    
    public final void setUserData(@org.jetbrains.annotations.Nullable
    com.corn.cornpos.data.remote.dto.UerInfo p0) {
    }
    
    public final boolean getCircleProgress() {
        return false;
    }
    
    public final void setCircleProgress(boolean p0) {
    }
    
    public final boolean getGetMatserData() {
        return false;
    }
    
    public final void setGetMatserData(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.corn.cornpos.data.remote.dto.LoginDto> getData() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.login.LoginEvents event) {
    }
    
    private final void sentUiEvent(com.corn.cornpos.util.UiEvent event) {
    }
    
    public final void insertLoginDataToDataBase(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.LoginDto body) {
    }
    
    public final void insertUserInfoDataToDataBase(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.LoginDto body) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object callApi1(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object callApi2(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    public final void loginFromBiometric() {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object callApi3(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
}