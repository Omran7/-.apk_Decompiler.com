package com.bumptech.glide.manager;

import I0.w;
import U0.o;
import X4.d;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.emoji2.text.v;
import androidx.fragment.app.C0289v;
import androidx.fragment.app.D;
import androidx.fragment.app.I;
import androidx.lifecycle.C0309u;
import com.bumptech.glide.b;
import com.bumptech.glide.l;
import java.util.HashMap;

public final class k implements Handler.Callback {
    public static final v d = new v(10);

    /* renamed from: a  reason: collision with root package name */
    public volatile l f5835a;

    /* renamed from: b  reason: collision with root package name */
    public final f f5836b;

    /* renamed from: c  reason: collision with root package name */
    public final d f5837c = new d(d);

    public k() {
        f fVar;
        if (!w.f1139f || !w.f1138e) {
            fVar = new D(8);
        } else {
            fVar = new e();
        }
        this.f5836b = fVar;
    }

    public static Activity a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public final l b(Context context) {
        boolean z3;
        if (context != null) {
            char[] cArr = o.f3697a;
            if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
                if (context instanceof C0289v) {
                    C0289v vVar = (C0289v) context;
                    boolean z4 = false;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3) {
                        return b(vVar.getApplicationContext());
                    }
                    if (!vVar.isDestroyed()) {
                        this.f5836b.c(vVar);
                        Activity a6 = a(vVar);
                        if (a6 == null || !a6.isFinishing()) {
                            z4 = true;
                        }
                        b a7 = b.a(vVar.getApplicationContext());
                        I l6 = vVar.l();
                        d dVar = this.f5837c;
                        dVar.getClass();
                        o.a();
                        C0309u uVar = vVar.f12758a;
                        o.a();
                        l lVar = (l) ((HashMap) dVar.f4209b).get(uVar);
                        if (lVar != null) {
                            return lVar;
                        }
                        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(uVar);
                        D d6 = new D(dVar, l6);
                        ((v) dVar.f4210c).getClass();
                        l lVar2 = new l(a7, lifecycleLifecycle, d6, vVar);
                        ((HashMap) dVar.f4209b).put(uVar, lVar2);
                        lifecycleLifecycle.b(new i(dVar, uVar));
                        if (z4) {
                            lVar2.j();
                        }
                        return lVar2;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return b(contextWrapper.getBaseContext());
                    }
                }
            }
            if (this.f5835a == null) {
                synchronized (this) {
                    try {
                        if (this.f5835a == null) {
                            this.f5835a = new l(b.a(context.getApplicationContext()), new D(7), new v(9), context.getApplicationContext());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return this.f5835a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final boolean handleMessage(Message message) {
        return false;
    }
}
