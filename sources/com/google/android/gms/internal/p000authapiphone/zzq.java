package com.google.android.gms.internal.p000authapiphone;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzq  reason: invalid package */
final class zzq extends zzf {
    final /* synthetic */ TaskCompletionSource zza;

    public zzq(zzr zzr, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status, boolean z3) {
        c.n0(status, Boolean.valueOf(z3), this.zza);
    }
}
