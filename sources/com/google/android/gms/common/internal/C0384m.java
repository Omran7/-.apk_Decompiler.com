package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import z1.C1132b;

/* renamed from: com.google.android.gms.common.internal.m  reason: case insensitive filesystem */
public abstract class C0384m {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f6198a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static U f6199b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f6200c;

    public static U a(Context context) {
        synchronized (f6198a) {
            try {
                if (f6199b == null) {
                    f6199b = new U(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return f6199b;
    }

    public abstract C1132b b(Q q6, M m6, String str, Executor executor);

    public final void c(String str, String str2, ServiceConnection serviceConnection, boolean z3) {
        Q q6 = new Q(str, str2, z3);
        U u6 = (U) this;
        I.h(serviceConnection, "ServiceConnection must not be null");
        synchronized (u6.d) {
            try {
                S s6 = (S) u6.d.get(q6);
                if (s6 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(q6.toString()));
                } else if (s6.f6154a.containsKey(serviceConnection)) {
                    s6.f6154a.remove(serviceConnection);
                    if (s6.f6154a.isEmpty()) {
                        u6.f6161f.sendMessageDelayed(u6.f6161f.obtainMessage(0, q6), u6.h);
                    }
                } else {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(q6.toString()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
