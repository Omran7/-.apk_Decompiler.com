package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C0353g;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.C0380i;
import com.google.android.gms.common.internal.C0383l;
import q1.C0933c;
import q1.C0934d;

public final class zzbe extends C0383l {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C0380i iVar, C0934d dVar, C0353g gVar, r rVar) {
        super(context, looper, 16, iVar, gVar, rVar);
        Bundle bundle;
        if (dVar == null) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle(dVar.f11082a);
        }
        this.zze = bundle;
    }

    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        if (queryLocalInterface instanceof zzbh) {
            return (zzbh) queryLocalInterface;
        }
        return new zzbh(iBinder);
    }

    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    public final int getMinApkVersion() {
        return 12451000;
    }

    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean requiresSignIn() {
        C0380i clientSettings = getClientSettings();
        clientSettings.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            return false;
        }
        if (clientSettings.f6175c.get(C0933c.f11080a) != null) {
            throw new ClassCastException();
        } else if (!clientSettings.f6173a.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean usesClientTelemetry() {
        return true;
    }
}
