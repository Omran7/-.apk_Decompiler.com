package com.google.android.gms.internal.location;

import Q1.D;
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

public class zzi extends C0383l {
    protected final zzbg<zzam> zze = new zzh(this);
    private final String zzf;

    public zzi(Context context, Looper looper, m mVar, n nVar, String str, C0380i iVar) {
        super(context, looper, 23, iVar, mVar, nVar);
        this.zzf = str;
    }

    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzam) {
            return (zzam) queryLocalInterface;
        }
        return new zzal(iBinder);
    }

    public final d[] getApiFeatures() {
        return D.f2402b;
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.zzf);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 11717000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
