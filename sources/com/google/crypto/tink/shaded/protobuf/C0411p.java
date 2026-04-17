package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p  reason: case insensitive filesystem */
public final class C0411p {

    /* renamed from: a  reason: collision with root package name */
    public static volatile C0411p f6841a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0411p f6842b;

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.p, java.lang.Object] */
    static {
        ? obj = new Object();
        Collections.emptyMap();
        f6842b = obj;
    }

    public static C0411p a() {
        C0411p pVar = f6841a;
        if (pVar == null) {
            synchronized (C0411p.class) {
                try {
                    pVar = f6841a;
                    if (pVar == null) {
                        Class cls = C0410o.f6839a;
                        C0411p pVar2 = null;
                        if (cls != null) {
                            try {
                                pVar2 = (C0411p) cls.getDeclaredMethod("getEmptyRegistry", (Class[]) null).invoke((Object) null, (Object[]) null);
                            } catch (Exception unused) {
                            }
                        }
                        if (pVar2 == null) {
                            pVar2 = f6842b;
                        }
                        f6841a = pVar2;
                        pVar = pVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return pVar;
    }
}
