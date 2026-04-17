package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import t1.C1003r;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api.zbx  reason: invalid package */
public final class zbx extends C0383l {
    private final Bundle zba = new Bundle();

    public zbx(Context context, Looper looper, C1003r rVar, C0380i iVar, C0353g gVar, r rVar2) {
        super(context, looper, 223, iVar, gVar, rVar2);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        if (queryLocalInterface instanceof zbad) {
            return (zbad) queryLocalInterface;
        }
        return new zbad(iBinder);
    }

    public final d[] getApiFeatures() {
        return zbbi.zbi;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    public final int getMinApkVersion() {
        return 17895000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
