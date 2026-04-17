package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import z1.C1132b;

final class zzbr extends zzbd {
    final /* synthetic */ zzbs zza;

    public zzbr(zzbs zzbs) {
        this.zza = zzbs;
    }

    public final void zzc(String str) {
        if (str != null) {
            this.zza.setResult(new zzbv(str));
        } else {
            this.zza.setResult(new zzbv(new Status(3006, (String) null, (PendingIntent) null, (C1132b) null)));
        }
    }
}
