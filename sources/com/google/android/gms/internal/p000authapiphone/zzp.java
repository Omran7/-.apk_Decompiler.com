package com.google.android.gms.internal.p000authapiphone;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzp  reason: invalid package */
final class zzp extends zzd {
    final /* synthetic */ TaskCompletionSource zza;

    public zzp(zzr zzr, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, int i2) {
        c.n0(status, Integer.valueOf(i2), this.zza);
    }
}
