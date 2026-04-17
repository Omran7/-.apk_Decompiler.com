package com.google.android.gms.internal.p000authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import z1.d;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzw  reason: invalid package */
public final class zzw extends C0383l {
    public zzw(Context context, Looper looper, C0380i iVar, C0353g gVar, r rVar) {
        super(context, looper, 126, iVar, gVar, rVar);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof zzh) {
            return (zzh) queryLocalInterface;
        }
        return new zzh(iBinder);
    }

    public final d[] getApiFeatures() {
        return zzac.zze;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
