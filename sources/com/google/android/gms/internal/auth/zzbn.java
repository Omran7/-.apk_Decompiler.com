package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import z1.C1132b;

final class zzbn extends zzbd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzbn(zzbo zzbo, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzc(String str) {
        Status status;
        if (str != null) {
            status = Status.f6002e;
        } else {
            status = new Status(3006, (String) null, (PendingIntent) null, (C1132b) null);
        }
        c.n0(status, str, this.zza);
    }
}
