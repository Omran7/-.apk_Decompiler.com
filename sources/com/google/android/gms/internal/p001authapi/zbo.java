package com.google.android.gms.internal.p001authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import m0.a0;
import q1.C0931a;

/* renamed from: com.google.android.gms.internal.auth-api.zbo  reason: invalid package */
public final class zbo extends C0383l {
    private final C0931a zba;

    public zbo(Context context, Looper looper, C0380i iVar, C0931a aVar, m mVar, n nVar) {
        super(context, looper, 68, iVar, mVar, nVar);
        aVar = aVar == null ? C0931a.f11075c : aVar;
        a0 a0Var = new a0(9);
        a0Var.f9925b = Boolean.FALSE;
        C0931a aVar2 = C0931a.f11075c;
        aVar.getClass();
        a0Var.f9925b = Boolean.valueOf(aVar.f11076a);
        a0Var.f9926c = aVar.f11077b;
        a0Var.f9926c = zbbj.zba();
        this.zba = new C0931a(a0Var);
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        if (queryLocalInterface instanceof zbt) {
            return (zbt) queryLocalInterface;
        }
        return new zbt(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        C0931a aVar = this.zba;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", aVar.f11076a);
        bundle.putString("log_session_id", aVar.f11077b);
        return bundle;
    }

    public final int getMinApkVersion() {
        return 12800000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final C0931a zba() {
        return this.zba;
    }
}
