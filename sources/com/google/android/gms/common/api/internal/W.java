package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import java.util.Map;
import o3.d;
import z1.C1132b;

public final class W extends Z {

    /* renamed from: b  reason: collision with root package name */
    public final C0350d f6067b;

    public W(int i2, C0350d dVar) {
        super(i2);
        I.h(dVar, "Null methods are not runnable.");
        this.f6067b = dVar;
    }

    public final void a(Status status) {
        try {
            this.f6067b.setFailedResult(status);
        } catch (IllegalStateException e6) {
            Log.w("ApiCallRunner", "Exception reporting failure", e6);
        }
    }

    public final void b(RuntimeException runtimeException) {
        try {
            this.f6067b.setFailedResult(new Status(10, d.g(runtimeException.getClass().getSimpleName(), ": ", runtimeException.getLocalizedMessage()), (PendingIntent) null, (C1132b) null));
        } catch (IllegalStateException e6) {
            Log.w("ApiCallRunner", "Exception reporting failure", e6);
        }
    }

    public final void c(H h) {
        try {
            this.f6067b.run(h.f6029b);
        } catch (RuntimeException e6) {
            b(e6);
        }
    }

    public final void d(D d, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        C0350d dVar = this.f6067b;
        ((Map) d.f6017a).put(dVar, valueOf);
        dVar.addStatusListener(new B(d, dVar));
    }
}
