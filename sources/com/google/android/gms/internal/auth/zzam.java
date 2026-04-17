package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import o1.C0894d;
import p1.C0911e;
import p1.C0912f;
import z1.d;

public final class zzam extends C0383l {
    public zzam(Context context, Looper looper, C0380i iVar, m mVar, n nVar) {
        super(context, looper, 120, iVar, mVar, nVar);
    }

    public final IInterface createServiceInterface(IBinder iBinder) {
        int i2 = C0911e.f10973a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        if (queryLocalInterface instanceof C0912f) {
            return (C0912f) queryLocalInterface;
        }
        return new zza(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    public final d[] getApiFeatures() {
        return new d[]{C0894d.d};
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
