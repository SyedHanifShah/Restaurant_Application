package com.corn.cornpos.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\rH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00032\u0006\u0010\u0013\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J/\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001b"}, d2 = {"Lcom/corn/cornpos/repository/CornPosRepository;", "", "dashboard", "Lretrofit2/Response;", "Lcom/corn/cornpos/data/remote/dto/DashboardDto;", "xConn", "", "authorization", "payload", "Lcom/corn/cornpos/data/remote/dto/DashboardPayload;", "(Ljava/lang/String;Ljava/lang/String;Lcom/corn/cornpos/data/remote/dto/DashboardPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/corn/cornpos/data/remote/dto/LoginDto;", "Lcom/corn/cornpos/data/remote/dto/LoginPayload;", "(Ljava/lang/String;Lcom/corn/cornpos/data/remote/dto/LoginPayload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "masterData", "Lcom/corn/cornpos/data/remote/dto/MasterData;", "pinValidation", "Lcom/corn/cornpos/data/remote/dto/PinDto;", "Pin", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveOrder", "Lcom/corn/cornpos/data/remote/dto/NewOrderDto;", "Lcom/corn/cornpos/data/remote/dto/Payload;", "(Ljava/lang/String;Ljava/lang/String;Lcom/corn/cornpos/data/remote/dto/Payload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateOrder", "Lcom/corn/cornpos/data/remote/dto/OrderUpdateDto;", "app_debug"})
public abstract interface CornPosRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object pinValidation(@org.jetbrains.annotations.NotNull
    java.lang.String Pin, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.PinDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.LoginPayload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.LoginDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object dashboard(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.DashboardPayload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.DashboardDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object masterData(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.DashboardPayload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.MasterData>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object saveOrder(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.Payload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.NewOrderDto>> continuation);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object updateOrder(@org.jetbrains.annotations.NotNull
    java.lang.String xConn, @org.jetbrains.annotations.NotNull
    java.lang.String authorization, @org.jetbrains.annotations.NotNull
    com.corn.cornpos.data.remote.dto.Payload payload, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.corn.cornpos.data.remote.dto.OrderUpdateDto>> continuation);
}