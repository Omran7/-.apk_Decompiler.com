package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import v1.C1041b;
import z1.C1132b;

final class zzbm extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbm(zzbo zzbo, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(C1041b bVar) {
        c.n0(new Status(bVar.f12159a, (String) null, (PendingIntent) null, (C1132b) null), bVar, this.zza);
    }
}
