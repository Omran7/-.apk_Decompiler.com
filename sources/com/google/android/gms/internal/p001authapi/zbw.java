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
import t1.C1002q;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api.zbw  reason: invalid package */
public final class zbw extends C0383l {
    private final Bundle zba;

    public zbw(Context context, Looper looper, C1002q qVar, C0380i iVar, C0353g gVar, r rVar) {
        super(context, looper, 219, iVar, gVar, rVar);
        qVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("session_id", qVar.f11744a);
        this.zba = bundle;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        if (queryLocalInterface instanceof zbaa) {
            return (zbaa) queryLocalInterface;
        }
        return new zbaa(iBinder);
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
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    public final boolean getUseDynamicLookup() {
        return true;
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
