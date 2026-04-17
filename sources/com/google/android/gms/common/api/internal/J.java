package com.google.android.gms.common.api.internal;

import T1.C0165e0;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.internal.C0375d;
import m0.a0;
import q4.C0937a;
import z1.C1132b;

public final class J implements C0375d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6041a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6042b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6043c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f6044e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6045f;

    public J(C0354h hVar, g gVar, C0347a aVar) {
        this.f6045f = hVar;
        this.d = null;
        this.f6044e = null;
        this.f6041a = false;
        this.f6042b = gVar;
        this.f6043c = aVar;
    }

    public void a(C1132b bVar) {
        H h = (H) ((C0354h) this.f6045f).f6099j.get((C0347a) this.f6043c);
        if (h != null) {
            h.q(bVar);
        }
    }

    public void b(boolean z3) {
        int i2;
        IntentFilter intentFilter = new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED");
        IntentFilter intentFilter2 = new IntentFilter("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED");
        intentFilter2.addAction("com.android.vending.billing.ALTERNATIVE_BILLING");
        this.f6041a = z3;
        ((C0165e0) this.f6045f).a((Context) this.f6042b, intentFilter2);
        if (this.f6041a) {
            C0165e0 e0Var = (C0165e0) this.f6044e;
            Context context = (Context) this.f6042b;
            synchronized (e0Var) {
                try {
                    if (!e0Var.f3282b) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            if (true != e0Var.f3283c) {
                                i2 = 4;
                            } else {
                                i2 = 2;
                            }
                            context.registerReceiver(e0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", (Handler) null, i2);
                        } else {
                            context.registerReceiver(e0Var, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", (Handler) null);
                        }
                        e0Var.f3282b = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        ((C0165e0) this.f6044e).a((Context) this.f6042b, intentFilter);
    }

    public void c(C1132b bVar) {
        ((C0354h) this.f6045f).f6103n.post(new b0(this, bVar, 1));
    }

    public J(Context context, C0937a aVar, a0 a0Var) {
        this.f6042b = context;
        this.f6043c = aVar;
        this.d = a0Var;
        this.f6044e = new C0165e0(this, true);
        this.f6045f = new C0165e0(this, false);
    }
}
