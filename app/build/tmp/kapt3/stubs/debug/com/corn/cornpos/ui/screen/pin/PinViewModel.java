package com.corn.cornpos.ui.screen.pin;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0016H\u0002R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013\u00a8\u0006\'"}, d2 = {"Lcom/corn/cornpos/ui/screen/pin/PinViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/corn/cornpos/repository/CornPosRepository;", "application", "Landroid/content/Context;", "(Lcom/corn/cornpos/repository/CornPosRepository;Landroid/content/Context;)V", "<set-?>", "", "PIN", "getPIN", "()Ljava/lang/String;", "setPIN", "(Ljava/lang/String;)V", "PIN$delegate", "Landroidx/compose/runtime/MutableState;", "_PIN", "Lkotlinx/coroutines/flow/Flow;", "get_PIN", "()Lkotlinx/coroutines/flow/Flow;", "_uiEvent", "Lkotlinx/coroutines/channels/Channel;", "Lcom/corn/cornpos/util/UiEvent;", "", "circleProgress", "getCircleProgress", "()Z", "setCircleProgress", "(Z)V", "circleProgress$delegate", "dataStore", "Lcom/corn/cornpos/data/CornPosDataStore;", "uiEvent", "getUiEvent", "onEvent", "", "event", "Lcom/corn/cornpos/ui/screen/pin/PinEvents;", "sentUiEvent", "app_debug"})
public final class PinViewModel extends androidx.lifecycle.ViewModel {
    private final com.corn.cornpos.repository.CornPosRepository repository = null;
    private final com.corn.cornpos.data.CornPosDataStore dataStore = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.lang.String> _PIN = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState PIN$delegate = null;
    private final kotlinx.coroutines.channels.Channel<com.corn.cornpos.util.UiEvent> _uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> uiEvent = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState circleProgress$delegate = null;
    
    @javax.inject.Inject
    public PinViewModel(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.repository.CornPosRepository repository, @org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.lang.String> get_PIN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPIN() {
        return null;
    }
    
    public final void setPIN(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.corn.cornpos.util.UiEvent> getUiEvent() {
        return null;
    }
    
    public final boolean getCircleProgress() {
        return false;
    }
    
    public final void setCircleProgress(boolean p0) {
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.ui.screen.pin.PinEvents event) {
    }
    
    private final void sentUiEvent(com.corn.cornpos.util.UiEvent event) {
    }
}