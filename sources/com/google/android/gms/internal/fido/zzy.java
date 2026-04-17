package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;

public final class zzy extends C0383l {
    public zzy(Context context, Looper looper, C0380i iVar, m mVar, n nVar) {
        super(context, looper, 117, iVar, mVar, nVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.regular.IU2fAppService");
        if (queryLocalInterface instanceof zzw) {
            return (zzw) queryLocalInterface;
        }
        return new zzw(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.thirdparty.START");
        return bundle;
    }

    public final int getMinApkVersion() {
        return 13000000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.regular.IU2fAppService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.thirdparty.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
