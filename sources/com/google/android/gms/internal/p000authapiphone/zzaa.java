package com.google.android.gms.internal.p000authapiphone;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzaa  reason: invalid package */
final class zzaa extends zzi {
    final /* synthetic */ TaskCompletionSource zza;

    public zzaa(zzab zzab, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzb(Status status) {
        c.n0(status, (Object) null, this.zza);
    }
}
