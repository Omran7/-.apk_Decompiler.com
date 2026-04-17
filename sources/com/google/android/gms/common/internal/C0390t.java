package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import z1.C1132b;

/* renamed from: com.google.android.gms.common.internal.t  reason: case insensitive filesystem */
public final class C0390t implements C0375d, C0373b, C0374c {

    /* renamed from: b  reason: collision with root package name */
    public static C0390t f6214b;

    /* renamed from: c  reason: collision with root package name */
    public static final C0391u f6215c = new C0391u(0, 0, 0, false, false);

    /* renamed from: a  reason: collision with root package name */
    public Object f6216a;

    public /* synthetic */ C0390t(Object obj) {
        this.f6216a = obj;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, com.google.android.gms.common.internal.t] */
    public static synchronized C0390t e() {
        C0390t tVar;
        synchronized (C0390t.class) {
            try {
                if (f6214b == null) {
                    f6214b = new Object();
                }
                tVar = f6214b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return tVar;
    }

    public void a(int i2) {
        ((C0353g) this.f6216a).a(i2);
    }

    public void b(C1132b bVar) {
        ((r) this.f6216a).b(bVar);
    }

    public void c(C1132b bVar) {
        boolean z3;
        if (bVar.f12801b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C0377f fVar = (C0377f) this.f6216a;
        if (z3) {
            fVar.getRemoteService((C0386o) null, fVar.getScopes());
        } else if (fVar.zzx != null) {
            fVar.zzx.b(bVar);
        }
    }

    public void d(Bundle bundle) {
        ((C0353g) this.f6216a).j();
    }
}
