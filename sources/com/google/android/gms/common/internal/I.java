package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import h0.C0552a;

public abstract class I {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f6139a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f6140b;

    /* renamed from: c  reason: collision with root package name */
    public static int f6141c;

    public static void a(String str, boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void b(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            throw new IllegalStateException(C0552a.q("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", str, "."));
        }
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void e(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void f(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(String str, boolean z3) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static j k(Status status) {
        if (status.f6009c != null) {
            return new j(status);
        }
        return new j(status);
    }
}
