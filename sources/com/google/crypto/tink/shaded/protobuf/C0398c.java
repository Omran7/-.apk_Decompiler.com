package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.c  reason: case insensitive filesystem */
public abstract class C0398c {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f6791a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f6792b;

    static {
        Class<?> cls;
        boolean z3;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f6791a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        f6792b = z3;
    }

    public static boolean a() {
        if (f6791a == null || f6792b) {
            return false;
        }
        return true;
    }
}
