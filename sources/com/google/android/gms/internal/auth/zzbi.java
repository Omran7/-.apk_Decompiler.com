package com.google.android.gms.internal.auth;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.C0350d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import q1.C0933c;

abstract class zzbi extends C0350d {
    public zzbi(o oVar) {
        super(C0933c.f11080a, oVar);
    }

    public final /* synthetic */ s createFailedResult(Status status) {
        return new zzbu(status);
    }

    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        zzbe zzbe = (zzbe) bVar;
        zza(zzbe.getContext(), (zzbh) zzbe.getService());
    }

    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((s) obj);
    }

    public abstract void zza(Context context, zzbh zzbh);
}
