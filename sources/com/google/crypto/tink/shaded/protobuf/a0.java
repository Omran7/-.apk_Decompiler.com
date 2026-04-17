package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f6785c = new a0();

    /* renamed from: a  reason: collision with root package name */
    public final M f6786a = new M();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f6787b = new ConcurrentHashMap();

    public final d0 a(Class cls) {
        d0 d0Var;
        V v6;
        Class cls2;
        B.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f6787b;
        d0 d0Var2 = (d0) concurrentHashMap.get(cls);
        if (d0Var2 != null) {
            return d0Var2;
        }
        M m6 = this.f6786a;
        m6.getClass();
        Class cls3 = e0.f6799a;
        Class<C0418x> cls4 = C0418x.class;
        if (cls4.isAssignableFrom(cls) || (cls2 = e0.f6799a) == null || cls2.isAssignableFrom(cls)) {
            c0 a6 = ((L) m6.f6761a).a(cls);
            if ((a6.d & 2) == 2) {
                boolean isAssignableFrom = cls4.isAssignableFrom(cls);
                C0396a aVar = a6.f6793a;
                if (isAssignableFrom) {
                    v6 = new V(e0.d, r.f6849a, aVar);
                } else {
                    h0 h0Var = e0.f6800b;
                    C0412q qVar = r.f6850b;
                    if (qVar != null) {
                        v6 = new V(h0Var, qVar, aVar);
                    } else {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                }
                d0Var = v6;
            } else if (cls4.isAssignableFrom(cls)) {
                if (a6.d() == 1) {
                    d0Var = U.C(a6, X.f6784b, J.f6758b, e0.d, r.f6849a, P.f6765b);
                } else {
                    d0Var = U.C(a6, X.f6784b, J.f6758b, e0.d, (C0412q) null, P.f6765b);
                }
            } else if (a6.d() == 1) {
                W w6 = X.f6783a;
                H h = J.f6757a;
                h0 h0Var2 = e0.f6800b;
                C0412q qVar2 = r.f6850b;
                if (qVar2 != null) {
                    d0Var = U.C(a6, w6, h, h0Var2, qVar2, P.f6764a);
                } else {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
            } else {
                d0Var = U.C(a6, X.f6783a, J.f6757a, e0.f6801c, (C0412q) null, P.f6764a);
            }
            d0 d0Var3 = (d0) concurrentHashMap.putIfAbsent(cls, d0Var);
            if (d0Var3 != null) {
                return d0Var3;
            }
            return d0Var;
        }
        throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
    }
}
