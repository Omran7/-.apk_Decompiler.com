package com.google.android.gms.internal.fido;

import L1.b;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import z1.d;

public final class zzk extends C0383l {
    public zzk(Context context, Looper looper, C0380i iVar, m mVar, n nVar) {
        super(context, looper, 149, iVar, mVar, nVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        if (queryLocalInterface instanceof zzn) {
            return (zzn) queryLocalInterface;
        }
        return new zzn(iBinder);
    }

    public final d[] getApiFeatures() {
        return new d[]{b.f1707b, b.f1708c, b.d};
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    public final int getMinApkVersion() {
        return 13000000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
