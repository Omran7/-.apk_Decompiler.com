package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.fragment.app.D;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import z1.d;

public final class X extends M {

    /* renamed from: b  reason: collision with root package name */
    public final C0371z f6068b;

    /* renamed from: c  reason: collision with root package name */
    public final TaskCompletionSource f6069c;
    public final C0368w d;

    public X(int i2, C0371z zVar, TaskCompletionSource taskCompletionSource, C0368w wVar) {
        super(i2);
        this.f6069c = taskCompletionSource;
        this.f6068b = zVar;
        this.d = wVar;
        if (i2 == 2 && zVar.f6117b) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    public final void a(Status status) {
        ((D) this.d).getClass();
        this.f6069c.trySetException(I.k(status));
    }

    public final void b(RuntimeException runtimeException) {
        this.f6069c.trySetException(runtimeException);
    }

    public final void c(H h) {
        TaskCompletionSource taskCompletionSource = this.f6069c;
        try {
            C0371z zVar = this.f6068b;
            ((C0366u) ((S) zVar).d.d).accept(h.f6029b, taskCompletionSource);
        } catch (DeadObjectException e6) {
            throw e6;
        } catch (RemoteException e7) {
            a(Z.e(e7));
        } catch (RuntimeException e8) {
            taskCompletionSource.trySetException(e8);
        }
    }

    public final void d(D d6, boolean z3) {
        Boolean valueOf = Boolean.valueOf(z3);
        TaskCompletionSource taskCompletionSource = this.f6069c;
        ((Map) d6.f6018b).put(taskCompletionSource, valueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new C(d6, taskCompletionSource));
    }

    public final boolean f(H h) {
        return this.f6068b.f6117b;
    }

    public final d[] g(H h) {
        return this.f6068b.f6116a;
    }
}
