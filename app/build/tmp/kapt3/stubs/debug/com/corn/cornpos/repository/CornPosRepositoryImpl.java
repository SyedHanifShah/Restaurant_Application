package com.corn.cornpos.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0010H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00062\u0006\u0010\u0016\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J/\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ/\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/corn/cornpos/repository/CornPosRepositoryImpl;", "Lcom/corn/cornpos/repository/CornPosRepository;", "api", "Lcom/corn/cornpos/data/remote/CornPosApi;", "(Lcom/corn/cornpos/data/remote/CornPosApi;)V", "dashboard", "Lretrofit2/Response;", "Lcom/corn/cornpos/data/remote/dto/DashboardDto;", "xConn", "", "authorization", "payload", "Lcom/corn/cornpos/data/remote/dto/DashboardPayload;", "(Ljava/lang/String;Ljava/lang/String;Lcom/corn/cornpos/data/remote/dto/DashboardPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/corn/cornpos/data/remote/dto/LoginDto;", "Lcom/corn/cornpos/data/remote/dto/LoginPayload;", "(Ljava/lang/String;Lcom/corn/cornpos/data/remote/dto/LoginPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "masterData", "Lcom/corn/cornpos/data/remote/dto/MasterData;", "pinValidation", "Lcom/corn/cornpos/data/remote/dto/PinDto;", "Pin", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOrder", "Lcom/corn/cornpos/data/remote/dto/NewOrderDto;", "Lcom/corn/cornpos/data/remote/dto/Payload;", "(Ljava/lang/String;Ljava/lang/String;Lcom/corn/cornpos/data/remote/dto/Payload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrder", "Lcom/corn/cornpos/data/remote/dto/OrderUpdateDto;", "app_debug"})
public final class CornPosRepositoryImpl implements com.corn.cornpos.repository.CornPosRepository {
    private final com.corn.cornpos.data.remote.CornPosApi api = null;
    
    @javax.inject.Inject
    public CornPosRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.CornPosApi api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object pinValidation(@org.jetbrains.annotations.NotNull
    java.lang.String Pin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.PinDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.LoginPayload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.LoginDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object dashboard(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.DashboardPayload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.DashboardDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object masterData(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.DashboardPayload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.MasterData>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveOrder(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.Payload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.NewOrderDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateOrder(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.Payload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.OrderUpdateDto>> continuation) {
        return null;
    }
}