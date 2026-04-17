package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.tasks.TaskCompletionSource;
import h0.C0552a;
import z1.d;

public final class Y extends M {

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource f6070b;

    /* renamed from: c  reason: collision with root package name */
    public final C0360n f6071c;

    public Y(C0360n nVar, TaskCompletionSource taskCompletionSource) {
        super(4);
        this.f6070b = taskCompletionSource;
        this.f6071c = nVar;
    }

    public final void a(Status status) {
        this.f6070b.trySetException(new j(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f6070b.trySetException(runtimeException);
    }

    public final void c(H h) {
        try {
            h(h);
        } catch (DeadObjectException e6) {
            a(Z.e(e6));
            throw e6;
        } catch (RemoteException e7) {
            a(Z.e(e7));
        } catch (RuntimeException e8) {
            this.f6070b.trySetException(e8);
        }
    }

    public final /* bridge */ /* synthetic */ void d(D d, boolean z3) {
    }

    public final boolean f(H h) {
        C0552a.y(h.f6032f.get(this.f6071c));
        return false;
    }

    public final d[] g(H h) {
        C0552a.y(h.f6032f.get(this.f6071c));
        return null;
    }

    public final void h(H h) {
        C0552a.y(h.f6032f.remove(this.f6071c));
        this.f6070b.trySetResult(Boolean.FALSE);
    }
}
