package com.corn.cornpos.data.remote.dto;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000)\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0006\n\u0003\b\u00ce\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0005\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010\'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0019\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0019\u0012\u0006\u0010,\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0005\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0019\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0005\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0005\u0012\u0006\u0010>\u001a\u00020\u0010\u0012\u0006\u0010?\u001a\u00020\u0010\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0005\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\u0003\u0012\u0006\u0010D\u001a\u00020\u0010\u0012\u0006\u0010E\u001a\u00020\u0003\u0012\u0006\u0010F\u001a\u00020\u0010\u0012\u0006\u0010G\u001a\u00020\u0010\u0012\u0006\u0010H\u001a\u00020\u0010\u0012\u0006\u0010I\u001a\u00020\u0003\u0012\u0006\u0010J\u001a\u00020\u0005\u0012\u0006\u0010K\u001a\u00020\u0003\u0012\u0006\u0010L\u001a\u00020\u0010\u0012\u0006\u0010M\u001a\u00020\u0003\u0012\u0006\u0010N\u001a\u00020\u0003\u0012\u0006\u0010O\u001a\u00020\u0005\u0012\u0006\u0010P\u001a\u00020\u0019\u0012\u0006\u0010Q\u001a\u00020\u0003\u0012\u0006\u0010R\u001a\u00020\u0003\u0012\u0006\u0010S\u001a\u00020\u0003\u0012\u0006\u0010T\u001a\u00020\u0003\u0012\u0006\u0010U\u001a\u00020\u0003\u0012\u0006\u0010V\u001a\u00020\u0003\u0012\u0006\u0010W\u001a\u00020\u0005\u0012\u0006\u0010X\u001a\u00020\u0003\u0012\u0006\u0010Y\u001a\u00020\u0005\u0012\u0006\u0010Z\u001a\u00020\u0005\u0012\u0006\u0010[\u001a\u00020\u0003\u0012\u0006\u0010\\\u001a\u00020\u0003\u0012\u0006\u0010]\u001a\u00020\u0005\u0012\u0006\u0010^\u001a\u00020\u0003\u0012\u0006\u0010_\u001a\u00020\u0019\u0012\u0006\u0010`\u001a\u00020\u0019\u0012\u0006\u0010a\u001a\u00020\u0003\u0012\u0006\u0010b\u001a\u00020\u0003\u0012\u0006\u0010c\u001a\u00020\u0005\u0012\u0006\u0010d\u001a\u00020\u0005\u0012\u0006\u0010e\u001a\u00020\u0003\u0012\u0006\u0010f\u001a\u00020\u0005\u0012\u0006\u0010g\u001a\u00020\u0005\u0012\u0006\u0010h\u001a\u00020\u0003\u0012\u0006\u0010i\u001a\u00020\u0003\u0012\u0006\u0010j\u001a\u00020\u0005\u0012\u0006\u0010k\u001a\u00020\u0019\u0012\u0006\u0010l\u001a\u00020\u0003\u0012\u0006\u0010m\u001a\u00020\u0003\u0012\u0006\u0010n\u001a\u00020\u0005\u0012\u0006\u0010o\u001a\u00020\u0003\u0012\u0006\u0010p\u001a\u00020\u0003\u0012\u0006\u0010q\u001a\u00020\u0003\u0012\u0006\u0010r\u001a\u00020\u0005\u0012\u0006\u0010s\u001a\u00020\u0005\u0012\u0006\u0010t\u001a\u00020\u0005\u0012\u0006\u0010u\u001a\u00020\u0003\u0012\u0006\u0010v\u001a\u00020\u0003\u0012\u0006\u0010w\u001a\u00020\u0005\u00a2\u0006\u0002\u0010xJ\n\u0010\u00f0\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f1\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00f2\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f3\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00f4\u0001\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00f5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f6\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f7\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00f8\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00f9\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00fa\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00fb\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00fc\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00fd\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00fe\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ff\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0080\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0081\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0082\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u0083\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u0084\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0085\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0086\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u0087\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0088\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0089\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008b\u0002\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u008c\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008d\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008e\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u008f\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0090\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0091\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0092\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0093\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0094\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0095\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0096\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0097\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0098\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0099\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009a\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009b\u0002\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u009c\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009d\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u009e\u0002\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u009f\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a0\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a1\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a2\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a3\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a4\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a5\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a6\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a7\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a8\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00a9\u0002\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00aa\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ab\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ac\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ad\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ae\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00af\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b0\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b1\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b2\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b3\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b4\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00b5\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b6\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b7\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b8\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b9\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ba\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bb\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00bc\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bd\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00be\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00bf\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c0\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00c1\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00c2\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c3\u0002\u001a\u00020\u0010H\u00c6\u0003J\n\u0010\u00c4\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c5\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c6\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00c7\u0002\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00c8\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00c9\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ca\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cb\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cc\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cd\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00ce\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00cf\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d0\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d1\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d2\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d3\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d4\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d5\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00d6\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00d7\u0002\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00d8\u0002\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00d9\u0002\u001a\u00020\u0019H\u00c6\u0003J\n\u0010\u00da\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00db\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00dc\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00dd\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00de\u0002\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00df\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00e0\u0002\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00e1\u0002\u001a\u00020\u0003H\u00c6\u0003J\u00fe\b\u0010\u00e2\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00052\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00052\b\b\u0002\u0010%\u001a\u00020\u00052\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00192\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00192\b\b\u0002\u0010,\u001a\u00020\u00052\b\b\u0002\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00052\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00032\b\b\u0002\u00104\u001a\u00020\u00032\b\b\u0002\u00105\u001a\u00020\u00192\b\b\u0002\u00106\u001a\u00020\u00032\b\b\u0002\u00107\u001a\u00020\u00032\b\b\u0002\u00108\u001a\u00020\u00052\b\b\u0002\u00109\u001a\u00020\u00032\b\b\u0002\u0010:\u001a\u00020\u00032\b\b\u0002\u0010;\u001a\u00020\u00052\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\u00052\b\b\u0002\u0010>\u001a\u00020\u00102\b\b\u0002\u0010?\u001a\u00020\u00102\b\b\u0002\u0010@\u001a\u00020\u00032\b\b\u0002\u0010A\u001a\u00020\u00052\b\b\u0002\u0010B\u001a\u00020\u00032\b\b\u0002\u0010C\u001a\u00020\u00032\b\b\u0002\u0010D\u001a\u00020\u00102\b\b\u0002\u0010E\u001a\u00020\u00032\b\b\u0002\u0010F\u001a\u00020\u00102\b\b\u0002\u0010G\u001a\u00020\u00102\b\b\u0002\u0010H\u001a\u00020\u00102\b\b\u0002\u0010I\u001a\u00020\u00032\b\b\u0002\u0010J\u001a\u00020\u00052\b\b\u0002\u0010K\u001a\u00020\u00032\b\b\u0002\u0010L\u001a\u00020\u00102\b\b\u0002\u0010M\u001a\u00020\u00032\b\b\u0002\u0010N\u001a\u00020\u00032\b\b\u0002\u0010O\u001a\u00020\u00052\b\b\u0002\u0010P\u001a\u00020\u00192\b\b\u0002\u0010Q\u001a\u00020\u00032\b\b\u0002\u0010R\u001a\u00020\u00032\b\b\u0002\u0010S\u001a\u00020\u00032\b\b\u0002\u0010T\u001a\u00020\u00032\b\b\u0002\u0010U\u001a\u00020\u00032\b\b\u0002\u0010V\u001a\u00020\u00032\b\b\u0002\u0010W\u001a\u00020\u00052\b\b\u0002\u0010X\u001a\u00020\u00032\b\b\u0002\u0010Y\u001a\u00020\u00052\b\b\u0002\u0010Z\u001a\u00020\u00052\b\b\u0002\u0010[\u001a\u00020\u00032\b\b\u0002\u0010\\\u001a\u00020\u00032\b\b\u0002\u0010]\u001a\u00020\u00052\b\b\u0002\u0010^\u001a\u00020\u00032\b\b\u0002\u0010_\u001a\u00020\u00192\b\b\u0002\u0010`\u001a\u00020\u00192\b\b\u0002\u0010a\u001a\u00020\u00032\b\b\u0002\u0010b\u001a\u00020\u00032\b\b\u0002\u0010c\u001a\u00020\u00052\b\b\u0002\u0010d\u001a\u00020\u00052\b\b\u0002\u0010e\u001a\u00020\u00032\b\b\u0002\u0010f\u001a\u00020\u00052\b\b\u0002\u0010g\u001a\u00020\u00052\b\b\u0002\u0010h\u001a\u00020\u00032\b\b\u0002\u0010i\u001a\u00020\u00032\b\b\u0002\u0010j\u001a\u00020\u00052\b\b\u0002\u0010k\u001a\u00020\u00192\b\b\u0002\u0010l\u001a\u00020\u00032\b\b\u0002\u0010m\u001a\u00020\u00032\b\b\u0002\u0010n\u001a\u00020\u00052\b\b\u0002\u0010o\u001a\u00020\u00032\b\b\u0002\u0010p\u001a\u00020\u00032\b\b\u0002\u0010q\u001a\u00020\u00032\b\b\u0002\u0010r\u001a\u00020\u00052\b\b\u0002\u0010s\u001a\u00020\u00052\b\b\u0002\u0010t\u001a\u00020\u00052\b\b\u0002\u0010u\u001a\u00020\u00032\b\b\u0002\u0010v\u001a\u00020\u00032\b\b\u0002\u0010w\u001a\u00020\u0005H\u00c6\u0001J\u0015\u0010\u00e3\u0002\u001a\u00020\u00102\t\u0010\u00e4\u0002\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00e5\u0002\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u00e6\u0002\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010zR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010|R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010zR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010|R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010zR\u0012\u0010\t\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010zR\u0012\u0010\n\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010|R\u0012\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010zR\u0013\u0010\f\u001a\u00020\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0013\u0010\r\u001a\u00020\u0001\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0084\u0001R\u0012\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010zR\u0013\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0013\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0089\u0001\u0010\u0088\u0001R\u0012\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010zR\u0012\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010zR\u0013\u0010\u0014\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u008c\u0001\u0010\u0088\u0001R\u0012\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010zR\u0012\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010|R\u0012\u0010\u0017\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010zR\u0013\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0012\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010zR\u0012\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010zR\u0012\u0010\u001c\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010|R\u0012\u0010\u001d\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010zR\u0012\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010zR\u0012\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010zR\u0012\u0010 \u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010|R\u0012\u0010!\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010zR\u0012\u0010\"\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010|R\u0012\u0010#\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009b\u0001\u0010zR\u0012\u0010$\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009c\u0001\u0010|R\u0012\u0010%\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010|R\u0012\u0010&\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010zR\u0012\u0010\'\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010zR\u0013\u0010(\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00a0\u0001\u0010\u0091\u0001R\u0012\u0010)\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a1\u0001\u0010zR\u0012\u0010*\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a2\u0001\u0010zR\u0013\u0010+\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00a3\u0001\u0010\u0091\u0001R\u0012\u0010,\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a4\u0001\u0010|R\u0012\u0010-\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a5\u0001\u0010|R\u0012\u0010.\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a6\u0001\u0010zR\u0012\u0010/\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a7\u0001\u0010|R\u0012\u00100\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a8\u0001\u0010zR\u0012\u00101\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00a9\u0001\u0010|R\u0012\u00102\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00aa\u0001\u0010|R\u0012\u00103\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ab\u0001\u0010zR\u0012\u00104\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ac\u0001\u0010zR\u0013\u00105\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00ad\u0001\u0010\u0091\u0001R\u0012\u00106\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ae\u0001\u0010zR\u0012\u00107\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00af\u0001\u0010zR\u0012\u00108\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b0\u0001\u0010|R\u0012\u00109\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b1\u0001\u0010zR\u0012\u0010:\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b2\u0001\u0010zR\u0012\u0010;\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b3\u0001\u0010|R\u0012\u0010<\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b4\u0001\u0010zR\u0012\u0010=\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b5\u0001\u0010|R\u0013\u0010>\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00b6\u0001\u0010\u0088\u0001R\u0013\u0010?\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00b7\u0001\u0010\u0088\u0001R\u0012\u0010@\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b8\u0001\u0010zR\u0012\u0010A\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00b9\u0001\u0010|R\u0012\u0010B\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ba\u0001\u0010zR\u0012\u0010C\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00bb\u0001\u0010zR\u0013\u0010D\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00bc\u0001\u0010\u0088\u0001R\u0013\u0010L\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00bd\u0001\u0010\u0088\u0001R\u0012\u0010E\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00be\u0001\u0010zR\u0013\u0010F\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00bf\u0001\u0010\u0088\u0001R\u0013\u0010G\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00c0\u0001\u0010\u0088\u0001R\u0013\u0010H\u001a\u00020\u0010\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00c1\u0001\u0010\u0088\u0001R\u0012\u0010I\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c2\u0001\u0010zR\u0012\u0010J\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c3\u0001\u0010|R\u0012\u0010K\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c4\u0001\u0010zR\u0012\u0010M\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c5\u0001\u0010zR\u0012\u0010N\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c6\u0001\u0010zR\u0012\u0010O\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c7\u0001\u0010|R\u0013\u0010P\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00c8\u0001\u0010\u0091\u0001R\u0012\u0010Q\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00c9\u0001\u0010zR\u0012\u0010R\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ca\u0001\u0010zR\u0012\u0010S\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cb\u0001\u0010zR\u0012\u0010T\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cc\u0001\u0010zR\u0012\u0010U\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cd\u0001\u0010zR\u0012\u0010V\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ce\u0001\u0010zR\u0012\u0010W\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00cf\u0001\u0010|R\u0012\u0010X\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d0\u0001\u0010zR\u0012\u0010Y\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d1\u0001\u0010|R\u0012\u0010Z\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d2\u0001\u0010|R\u0012\u0010[\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d3\u0001\u0010zR\u0012\u0010\\\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d4\u0001\u0010zR\u0012\u0010]\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d5\u0001\u0010|R\u0012\u0010^\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d6\u0001\u0010zR\u0013\u0010_\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00d7\u0001\u0010\u0091\u0001R\u0013\u0010`\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00d8\u0001\u0010\u0091\u0001R\u0012\u0010a\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00d9\u0001\u0010zR\u0012\u0010b\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00da\u0001\u0010zR\u0012\u0010c\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00db\u0001\u0010|R\u0012\u0010d\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00dc\u0001\u0010|R\u0012\u0010e\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00dd\u0001\u0010zR\u0012\u0010f\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00de\u0001\u0010|R\u0012\u0010g\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00df\u0001\u0010|R\u0012\u0010h\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e0\u0001\u0010zR\u0012\u0010i\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e1\u0001\u0010zR\u0012\u0010j\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e2\u0001\u0010|R\u0013\u0010k\u001a\u00020\u0019\u00a2\u0006\n\n\u0000\u001a\u0006\b\u00e3\u0001\u0010\u0091\u0001R\u0012\u0010l\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e4\u0001\u0010zR\u0012\u0010m\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e5\u0001\u0010zR\u0012\u0010n\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e6\u0001\u0010|R\u0012\u0010o\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e7\u0001\u0010zR\u0012\u0010p\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e8\u0001\u0010zR\u0012\u0010q\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00e9\u0001\u0010zR\u0012\u0010r\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ea\u0001\u0010|R\u0012\u0010s\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00eb\u0001\u0010|R\u0012\u0010t\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ec\u0001\u0010|R\u0012\u0010u\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ed\u0001\u0010zR\u0012\u0010v\u001a\u00020\u0003\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ee\u0001\u0010zR\u0012\u0010w\u001a\u00020\u0005\u00a2\u0006\t\n\u0000\u001a\u0005\b\u00ef\u0001\u0010|\u00a8\u0006\u00e7\u0002"}, d2 = {"Lcom/corn/cornpos/data/remote/dto/MasterRow;", "", "Address", "", "AdsOnCategoryID", "", "AdsOnCategoryName", "AdsOnID", "AdsOnName", "AutoPromotion", "BankDiscountID", "BillFormat", "BookingFrom", "BookingTo", "CNIC", "CanComplimentaryItem", "", "CanGiveDiscount", "CardID", "CardNo", "CashImpact", "Category", "CategoryID", "CategoryName", "CreditCardGSTPer", "", "CustomerCode", "CustomerEngagement", "CustomerID", "CustomerImage", "CustomerInfoOnBill", "CustomerName", "DCID", "DCName", "DMID", "DMName", "DealID", "DealItemQuantity", "DealItems", "DealName", "DealPrice", "DiscountAuthentication", "DiscountName", "DiscountPer", "DiscountPrice", "DiscountTypeID", "DiscountTypeName", "DistributorID", "EmailAddress", "Favourite", "FloorID", "FloorName", "GSTCalculation", "GSTPer", "Gender", "HideOrderInvoieNo", "ID", "ImageName", "ImagePath", "InvocieCommentID", "InvoiceComment", "IsAddsOn", "IsDeal", "IsDelRight", "IsFullKOT", "IsHasAddsOn", "IsKOTMandatory", "IsKOTUniquePerDay", "IsLessRight", "IsPriceOpenOnPOS", "IsPrintKOT", "IsServiceCharges", "IsUnGroup", "ItemCode", "ItemID", "ItemName", "IsMultiSelectModifier", "ItemWiseDiscount", "LessCancelReason", "LessCancelReasonID", "Limit", "LocationAddress", "LocationNameOnKOT", "Logo", "NTN", "NTNLabelText", "Nature", "OccupationID", "OccupationName", "OrderCount", "OrderTakeID", "OrderTakeName", "OtherContactNo", "ParentCategoryID", "PhoneNo", "Points", "Price", "PrimaryContact", "PrintCustomerOnDelivery", "ProductCount", "ProfessionID", "ProvisionalBillHeaderFormat", "Rating", "SectionID", "SectionName", "ServerUrl", "ServiceChargesType", "ServiceChargesValue", "ServiceType", "ShowNTNOnProvissionalBill", "TableID", "TableNo", "TaxAuthority", "TaxAuthorityName", "TypeID", "USER_TYPE_ID", "UserID", "UserLogin", "UserPasswrd", "intDealID", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;DIILjava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;IZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;ILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;DDLjava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;I)V", "getAddress", "()Ljava/lang/String;", "getAdsOnCategoryID", "()I", "getAdsOnCategoryName", "getAdsOnID", "getAdsOnName", "getAutoPromotion", "getBankDiscountID", "getBillFormat", "getBookingFrom", "()Ljava/lang/Object;", "getBookingTo", "getCNIC", "getCanComplimentaryItem", "()Z", "getCanGiveDiscount", "getCardID", "getCardNo", "getCashImpact", "getCategory", "getCategoryID", "getCategoryName", "getCreditCardGSTPer", "()D", "getCustomerCode", "getCustomerEngagement", "getCustomerID", "getCustomerImage", "getCustomerInfoOnBill", "getCustomerName", "getDCID", "getDCName", "getDMID", "getDMName", "getDealID", "getDealItemQuantity", "getDealItems", "getDealName", "getDealPrice", "getDiscountAuthentication", "getDiscountName", "getDiscountPer", "getDiscountPrice", "getDiscountTypeID", "getDiscountTypeName", "getDistributorID", "getEmailAddress", "getFavourite", "getFloorID", "getFloorName", "getGSTCalculation", "getGSTPer", "getGender", "getHideOrderInvoieNo", "getID", "getImageName", "getImagePath", "getInvocieCommentID", "getInvoiceComment", "getIsAddsOn", "getIsDeal", "getIsDelRight", "getIsFullKOT", "getIsHasAddsOn", "getIsKOTMandatory", "getIsKOTUniquePerDay", "getIsLessRight", "getIsMultiSelectModifier", "getIsPriceOpenOnPOS", "getIsPrintKOT", "getIsServiceCharges", "getIsUnGroup", "getItemCode", "getItemID", "getItemName", "getItemWiseDiscount", "getLessCancelReason", "getLessCancelReasonID", "getLimit", "getLocationAddress", "getLocationNameOnKOT", "getLogo", "getNTN", "getNTNLabelText", "getNature", "getOccupationID", "getOccupationName", "getOrderCount", "getOrderTakeID", "getOrderTakeName", "getOtherContactNo", "getParentCategoryID", "getPhoneNo", "getPoints", "getPrice", "getPrimaryContact", "getPrintCustomerOnDelivery", "getProductCount", "getProfessionID", "getProvisionalBillHeaderFormat", "getRating", "getSectionID", "getSectionName", "getServerUrl", "getServiceChargesType", "getServiceChargesValue", "getServiceType", "getShowNTNOnProvissionalBill", "getTableID", "getTableNo", "getTaxAuthority", "getTaxAuthorityName", "getTypeID", "getUSER_TYPE_ID", "getUserID", "getUserLogin", "getUserPasswrd", "getIntDealID", "component1", "component10", "component100", "component101", "component102", "component103", "component104", "component105", "component106", "component107", "component108", "component109", "component11", "component110", "component111", "component112", "component113", "component114", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "component98", "component99", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class MasterRow {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Address = null;
    private final int AdsOnCategoryID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String AdsOnCategoryName = null;
    private final int AdsOnID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String AdsOnName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String AutoPromotion = null;
    private final int BankDiscountID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BillFormat = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object BookingFrom = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object BookingTo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CNIC = null;
    private final boolean CanComplimentaryItem = false;
    private final boolean CanGiveDiscount = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CardID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CardNo = null;
    private final boolean CashImpact = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Category = null;
    private final int CategoryID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CategoryName = null;
    private final double CreditCardGSTPer = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CustomerCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CustomerEngagement = null;
    private final int CustomerID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CustomerImage = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CustomerInfoOnBill = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CustomerName = null;
    private final int DCID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DCName = null;
    private final int DMID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DMName = null;
    private final int DealID = 0;
    private final int DealItemQuantity = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DealItems = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DealName = null;
    private final double DealPrice = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DiscountAuthentication = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DiscountName = null;
    private final double DiscountPer = 0.0;
    private final int DiscountPrice = 0;
    private final int DiscountTypeID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String DiscountTypeName = null;
    private final int DistributorID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String EmailAddress = null;
    private final int Favourite = 0;
    private final int FloorID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String FloorName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String GSTCalculation = null;
    private final double GSTPer = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Gender = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String HideOrderInvoieNo = null;
    private final int ID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ImageName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ImagePath = null;
    private final int InvocieCommentID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String InvoiceComment = null;
    private final int IsAddsOn = 0;
    private final boolean IsDeal = false;
    private final boolean IsDelRight = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String IsFullKOT = null;
    private final int IsHasAddsOn = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String IsKOTMandatory = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String IsKOTUniquePerDay = null;
    private final boolean IsLessRight = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String IsPriceOpenOnPOS = null;
    private final boolean IsPrintKOT = false;
    private final boolean IsServiceCharges = false;
    private final boolean IsUnGroup = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ItemCode = null;
    private final int ItemID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ItemName = null;
    private final boolean IsMultiSelectModifier = false;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ItemWiseDiscount = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String LessCancelReason = null;
    private final int LessCancelReasonID = 0;
    private final double Limit = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String LocationAddress = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String LocationNameOnKOT = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Logo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String NTN = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String NTNLabelText = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String Nature = null;
    private final int OccupationID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OccupationName = null;
    private final int OrderCount = 0;
    private final int OrderTakeID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OrderTakeName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String OtherContactNo = null;
    private final int ParentCategoryID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PhoneNo = null;
    private final double Points = 0.0;
    private final double Price = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PrimaryContact = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PrintCustomerOnDelivery = null;
    private final int ProductCount = 0;
    private final int ProfessionID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ProvisionalBillHeaderFormat = null;
    private final int Rating = 0;
    private final int SectionID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String SectionName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ServerUrl = null;
    private final int ServiceChargesType = 0;
    private final double ServiceChargesValue = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ServiceType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ShowNTNOnProvissionalBill = null;
    private final int TableID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TableNo = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TaxAuthority = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TaxAuthorityName = null;
    private final int TypeID = 0;
    private final int USER_TYPE_ID = 0;
    private final int UserID = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String UserLogin = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String UserPasswrd = null;
    private final int intDealID = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.corn.cornpos.data.remote.dto.MasterRow copy(@org.jetbrains.annotations.NotNull
    java.lang.String Address, int AdsOnCategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnCategoryName, int AdsOnID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnName, @org.jetbrains.annotations.NotNull
    java.lang.String AutoPromotion, int BankDiscountID, @org.jetbrains.annotations.NotNull
    java.lang.String BillFormat, @org.jetbrains.annotations.NotNull
    java.lang.Object BookingFrom, @org.jetbrains.annotations.NotNull
    java.lang.Object BookingTo, @org.jetbrains.annotations.NotNull
    java.lang.String CNIC, boolean CanComplimentaryItem, boolean CanGiveDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String CardID, @org.jetbrains.annotations.NotNull
    java.lang.String CardNo, boolean CashImpact, @org.jetbrains.annotations.NotNull
    java.lang.String Category, int CategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String CategoryName, double CreditCardGSTPer, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerCode, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerEngagement, int CustomerID, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerImage, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerInfoOnBill, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerName, int DCID, @org.jetbrains.annotations.NotNull
    java.lang.String DCName, int DMID, @org.jetbrains.annotations.NotNull
    java.lang.String DMName, int DealID, int DealItemQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String DealItems, @org.jetbrains.annotations.NotNull
    java.lang.String DealName, double DealPrice, @org.jetbrains.annotations.NotNull
    java.lang.String DiscountAuthentication, @org.jetbrains.annotations.NotNull
    java.lang.String DiscountName, double DiscountPer, int DiscountPrice, int DiscountTypeID, @org.jetbrains.annotations.NotNull
    java.lang.String DiscountTypeName, int DistributorID, @org.jetbrains.annotations.NotNull
    java.lang.String EmailAddress, int Favourite, int FloorID, @org.jetbrains.annotations.NotNull
    java.lang.String FloorName, @org.jetbrains.annotations.NotNull
    java.lang.String GSTCalculation, double GSTPer, @org.jetbrains.annotations.NotNull
    java.lang.String Gender, @org.jetbrains.annotations.NotNull
    java.lang.String HideOrderInvoieNo, int ID, @org.jetbrains.annotations.NotNull
    java.lang.String ImageName, @org.jetbrains.annotations.NotNull
    java.lang.String ImagePath, int InvocieCommentID, @org.jetbrains.annotations.NotNull
    java.lang.String InvoiceComment, int IsAddsOn, boolean IsDeal, boolean IsDelRight, @org.jetbrains.annotations.NotNull
    java.lang.String IsFullKOT, int IsHasAddsOn, @org.jetbrains.annotations.NotNull
    java.lang.String IsKOTMandatory, @org.jetbrains.annotations.NotNull
    java.lang.String IsKOTUniquePerDay, boolean IsLessRight, @org.jetbrains.annotations.NotNull
    java.lang.String IsPriceOpenOnPOS, boolean IsPrintKOT, boolean IsServiceCharges, boolean IsUnGroup, @org.jetbrains.annotations.NotNull
    java.lang.String ItemCode, int ItemID, @org.jetbrains.annotations.NotNull
    java.lang.String ItemName, boolean IsMultiSelectModifier, @org.jetbrains.annotations.NotNull
    java.lang.String ItemWiseDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String LessCancelReason, int LessCancelReasonID, double Limit, @org.jetbrains.annotations.NotNull
    java.lang.String LocationAddress, @org.jetbrains.annotations.NotNull
    java.lang.String LocationNameOnKOT, @org.jetbrains.annotations.NotNull
    java.lang.String Logo, @org.jetbrains.annotations.NotNull
    java.lang.String NTN, @org.jetbrains.annotations.NotNull
    java.lang.String NTNLabelText, @org.jetbrains.annotations.NotNull
    java.lang.String Nature, int OccupationID, @org.jetbrains.annotations.NotNull
    java.lang.String OccupationName, int OrderCount, int OrderTakeID, @org.jetbrains.annotations.NotNull
    java.lang.String OrderTakeName, @org.jetbrains.annotations.NotNull
    java.lang.String OtherContactNo, int ParentCategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String PhoneNo, double Points, double Price, @org.jetbrains.annotations.NotNull
    java.lang.String PrimaryContact, @org.jetbrains.annotations.NotNull
    java.lang.String PrintCustomerOnDelivery, int ProductCount, int ProfessionID, @org.jetbrains.annotations.NotNull
    java.lang.String ProvisionalBillHeaderFormat, int Rating, int SectionID, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, @org.jetbrains.annotations.NotNull
    java.lang.String ServerUrl, int ServiceChargesType, double ServiceChargesValue, @org.jetbrains.annotations.NotNull
    java.lang.String ServiceType, @org.jetbrains.annotations.NotNull
    java.lang.String ShowNTNOnProvissionalBill, int TableID, @org.jetbrains.annotations.NotNull
    java.lang.String TableNo, @org.jetbrains.annotations.NotNull
    java.lang.String TaxAuthority, @org.jetbrains.annotations.NotNull
    java.lang.String TaxAuthorityName, int TypeID, int USER_TYPE_ID, int UserID, @org.jetbrains.annotations.NotNull
    java.lang.String UserLogin, @org.jetbrains.annotations.NotNull
    java.lang.String UserPasswrd, int intDealID) {
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
    
    public MasterRow(@org.jetbrains.annotations.NotNull
    java.lang.String Address, int AdsOnCategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnCategoryName, int AdsOnID, @org.jetbrains.annotations.NotNull
    java.lang.String AdsOnName, @org.jetbrains.annotations.NotNull
    java.lang.String AutoPromotion, int BankDiscountID, @org.jetbrains.annotations.NotNull
    java.lang.String BillFormat, @org.jetbrains.annotations.NotNull
    java.lang.Object BookingFrom, @org.jetbrains.annotations.NotNull
    java.lang.Object BookingTo, @org.jetbrains.annotations.NotNull
    java.lang.String CNIC, boolean CanComplimentaryItem, boolean CanGiveDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String CardID, @org.jetbrains.annotations.NotNull
    java.lang.String CardNo, boolean CashImpact, @org.jetbrains.annotations.NotNull
    java.lang.String Category, int CategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String CategoryName, double CreditCardGSTPer, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerCode, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerEngagement, int CustomerID, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerImage, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerInfoOnBill, @org.jetbrains.annotations.NotNull
    java.lang.String CustomerName, int DCID, @org.jetbrains.annotations.NotNull
    java.lang.String DCName, int DMID, @org.jetbrains.annotations.NotNull
    java.lang.String DMName, int DealID, int DealItemQuantity, @org.jetbrains.annotations.NotNull
    java.lang.String DealItems, @org.jetbrains.annotations.NotNull
    java.lang.String DealName, double DealPrice, @org.jetbrains.annotations.NotNull
    java.lang.String DiscountAuthentication, @org.jetbrains.annotations.NotNull
    java.lang.String DiscountName, double DiscountPer, int DiscountPrice, int DiscountTypeID, @org.jetbrains.annotations.NotNull
    java.lang.String DiscountTypeName, int DistributorID, @org.jetbrains.annotations.NotNull
    java.lang.String EmailAddress, int Favourite, int FloorID, @org.jetbrains.annotations.NotNull
    java.lang.String FloorName, @org.jetbrains.annotations.NotNull
    java.lang.String GSTCalculation, double GSTPer, @org.jetbrains.annotations.NotNull
    java.lang.String Gender, @org.jetbrains.annotations.NotNull
    java.lang.String HideOrderInvoieNo, int ID, @org.jetbrains.annotations.NotNull
    java.lang.String ImageName, @org.jetbrains.annotations.NotNull
    java.lang.String ImagePath, int InvocieCommentID, @org.jetbrains.annotations.NotNull
    java.lang.String InvoiceComment, int IsAddsOn, boolean IsDeal, boolean IsDelRight, @org.jetbrains.annotations.NotNull
    java.lang.String IsFullKOT, int IsHasAddsOn, @org.jetbrains.annotations.NotNull
    java.lang.String IsKOTMandatory, @org.jetbrains.annotations.NotNull
    java.lang.String IsKOTUniquePerDay, boolean IsLessRight, @org.jetbrains.annotations.NotNull
    java.lang.String IsPriceOpenOnPOS, boolean IsPrintKOT, boolean IsServiceCharges, boolean IsUnGroup, @org.jetbrains.annotations.NotNull
    java.lang.String ItemCode, int ItemID, @org.jetbrains.annotations.NotNull
    java.lang.String ItemName, boolean IsMultiSelectModifier, @org.jetbrains.annotations.NotNull
    java.lang.String ItemWiseDiscount, @org.jetbrains.annotations.NotNull
    java.lang.String LessCancelReason, int LessCancelReasonID, double Limit, @org.jetbrains.annotations.NotNull
    java.lang.String LocationAddress, @org.jetbrains.annotations.NotNull
    java.lang.String LocationNameOnKOT, @org.jetbrains.annotations.NotNull
    java.lang.String Logo, @org.jetbrains.annotations.NotNull
    java.lang.String NTN, @org.jetbrains.annotations.NotNull
    java.lang.String NTNLabelText, @org.jetbrains.annotations.NotNull
    java.lang.String Nature, int OccupationID, @org.jetbrains.annotations.NotNull
    java.lang.String OccupationName, int OrderCount, int OrderTakeID, @org.jetbrains.annotations.NotNull
    java.lang.String OrderTakeName, @org.jetbrains.annotations.NotNull
    java.lang.String OtherContactNo, int ParentCategoryID, @org.jetbrains.annotations.NotNull
    java.lang.String PhoneNo, double Points, double Price, @org.jetbrains.annotations.NotNull
    java.lang.String PrimaryContact, @org.jetbrains.annotations.NotNull
    java.lang.String PrintCustomerOnDelivery, int ProductCount, int ProfessionID, @org.jetbrains.annotations.NotNull
    java.lang.String ProvisionalBillHeaderFormat, int Rating, int SectionID, @org.jetbrains.annotations.NotNull
    java.lang.String SectionName, @org.jetbrains.annotations.NotNull
    java.lang.String ServerUrl, int ServiceChargesType, double ServiceChargesValue, @org.jetbrains.annotations.NotNull
    java.lang.String ServiceType, @org.jetbrains.annotations.NotNull
    java.lang.String ShowNTNOnProvissionalBill, int TableID, @org.jetbrains.annotations.NotNull
    java.lang.String TableNo, @org.jetbrains.annotations.NotNull
    java.lang.String TaxAuthority, @org.jetbrains.annotations.NotNull
    java.lang.String TaxAuthorityName, int TypeID, int USER_TYPE_ID, int UserID, @org.jetbrains.annotations.NotNull
    java.lang.String UserLogin, @org.jetbrains.annotations.NotNull
    java.lang.String UserPasswrd, int intDealID) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAdsOnCategoryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdsOnCategoryName() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getAdsOnID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAdsOnName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAutoPromotion() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final int getBankDiscountID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBillFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBookingFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBookingTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCNIC() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean getCanComplimentaryItem() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    public final boolean getCanGiveDiscount() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCardNo() {
        return null;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean getCashImpact() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategory() {
        return null;
    }
    
    public final int component18() {
        return 0;
    }
    
    public final int getCategoryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    public final double component20() {
        return 0.0;
    }
    
    public final double getCreditCardGSTPer() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerEngagement() {
        return null;
    }
    
    public final int component23() {
        return 0;
    }
    
    public final int getCustomerID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerInfoOnBill() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCustomerName() {
        return null;
    }
    
    public final int component27() {
        return 0;
    }
    
    public final int getDCID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDCName() {
        return null;
    }
    
    public final int component29() {
        return 0;
    }
    
    public final int getDMID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDMName() {
        return null;
    }
    
    public final int component31() {
        return 0;
    }
    
    public final int getDealID() {
        return 0;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int getDealItemQuantity() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDealItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component34() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDealName() {
        return null;
    }
    
    public final double component35() {
        return 0.0;
    }
    
    public final double getDealPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component36() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDiscountAuthentication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDiscountName() {
        return null;
    }
    
    public final double component38() {
        return 0.0;
    }
    
    public final double getDiscountPer() {
        return 0.0;
    }
    
    public final int component39() {
        return 0;
    }
    
    public final int getDiscountPrice() {
        return 0;
    }
    
    public final int component40() {
        return 0;
    }
    
    public final int getDiscountTypeID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component41() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDiscountTypeName() {
        return null;
    }
    
    public final int component42() {
        return 0;
    }
    
    public final int getDistributorID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmailAddress() {
        return null;
    }
    
    public final int component44() {
        return 0;
    }
    
    public final int getFavourite() {
        return 0;
    }
    
    public final int component45() {
        return 0;
    }
    
    public final int getFloorID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFloorName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGSTCalculation() {
        return null;
    }
    
    public final double component48() {
        return 0.0;
    }
    
    public final double getGSTPer() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component50() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getHideOrderInvoieNo() {
        return null;
    }
    
    public final int component51() {
        return 0;
    }
    
    public final int getID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component52() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImageName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getImagePath() {
        return null;
    }
    
    public final int component54() {
        return 0;
    }
    
    public final int getInvocieCommentID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getInvoiceComment() {
        return null;
    }
    
    public final int component56() {
        return 0;
    }
    
    public final int getIsAddsOn() {
        return 0;
    }
    
    public final boolean component57() {
        return false;
    }
    
    public final boolean getIsDeal() {
        return false;
    }
    
    public final boolean component58() {
        return false;
    }
    
    public final boolean getIsDelRight() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component59() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIsFullKOT() {
        return null;
    }
    
    public final int component60() {
        return 0;
    }
    
    public final int getIsHasAddsOn() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component61() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIsKOTMandatory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component62() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIsKOTUniquePerDay() {
        return null;
    }
    
    public final boolean component63() {
        return false;
    }
    
    public final boolean getIsLessRight() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component64() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIsPriceOpenOnPOS() {
        return null;
    }
    
    public final boolean component65() {
        return false;
    }
    
    public final boolean getIsPrintKOT() {
        return false;
    }
    
    public final boolean component66() {
        return false;
    }
    
    public final boolean getIsServiceCharges() {
        return false;
    }
    
    public final boolean component67() {
        return false;
    }
    
    public final boolean getIsUnGroup() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component68() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItemCode() {
        return null;
    }
    
    public final int component69() {
        return 0;
    }
    
    public final int getItemID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component70() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItemName() {
        return null;
    }
    
    public final boolean component71() {
        return false;
    }
    
    public final boolean getIsMultiSelectModifier() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component72() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getItemWiseDiscount() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component73() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLessCancelReason() {
        return null;
    }
    
    public final int component74() {
        return 0;
    }
    
    public final int getLessCancelReasonID() {
        return 0;
    }
    
    public final double component75() {
        return 0.0;
    }
    
    public final double getLimit() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component76() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocationAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component77() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocationNameOnKOT() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component78() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component79() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNTN() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component80() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNTNLabelText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component81() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNature() {
        return null;
    }
    
    public final int component82() {
        return 0;
    }
    
    public final int getOccupationID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component83() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOccupationName() {
        return null;
    }
    
    public final int component84() {
        return 0;
    }
    
    public final int getOrderCount() {
        return 0;
    }
    
    public final int component85() {
        return 0;
    }
    
    public final int getOrderTakeID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component86() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOrderTakeName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component87() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOtherContactNo() {
        return null;
    }
    
    public final int component88() {
        return 0;
    }
    
    public final int getParentCategoryID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component89() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNo() {
        return null;
    }
    
    public final double component90() {
        return 0.0;
    }
    
    public final double getPoints() {
        return 0.0;
    }
    
    public final double component91() {
        return 0.0;
    }
    
    public final double getPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component92() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrimaryContact() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component93() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPrintCustomerOnDelivery() {
        return null;
    }
    
    public final int component94() {
        return 0;
    }
    
    public final int getProductCount() {
        return 0;
    }
    
    public final int component95() {
        return 0;
    }
    
    public final int getProfessionID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component96() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getProvisionalBillHeaderFormat() {
        return null;
    }
    
    public final int component97() {
        return 0;
    }
    
    public final int getRating() {
        return 0;
    }
    
    public final int component98() {
        return 0;
    }
    
    public final int getSectionID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component99() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSectionName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component100() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getServerUrl() {
        return null;
    }
    
    public final int component101() {
        return 0;
    }
    
    public final int getServiceChargesType() {
        return 0;
    }
    
    public final double component102() {
        return 0.0;
    }
    
    public final double getServiceChargesValue() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component103() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getServiceType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component104() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getShowNTNOnProvissionalBill() {
        return null;
    }
    
    public final int component105() {
        return 0;
    }
    
    public final int getTableID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component106() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTableNo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component107() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTaxAuthority() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component108() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTaxAuthorityName() {
        return null;
    }
    
    public final int component109() {
        return 0;
    }
    
    public final int getTypeID() {
        return 0;
    }
    
    public final int component110() {
        return 0;
    }
    
    public final int getUSER_TYPE_ID() {
        return 0;
    }
    
    public final int component111() {
        return 0;
    }
    
    public final int getUserID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component112() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component113() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserPasswrd() {
        return null;
    }
    
    public final int component114() {
        return 0;
    }
    
    public final int getIntDealID() {
        return 0;
    }
}