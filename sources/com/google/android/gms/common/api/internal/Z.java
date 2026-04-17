package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import z1.C1132b;

public abstract class Z {

    /* renamed from: a  reason: collision with root package name */
    public final int f6072a;

    public Z(int i2) {
        this.f6072a = i2;
    }

    public static Status e(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), (PendingIntent) null, (C1132b) null);
    }

    public abstract void a(Status status);

    public abstract void b(RuntimeException runtimeException);

    public abstract void c(H h);

    public abstract void d(D d, boolean z3);
}
