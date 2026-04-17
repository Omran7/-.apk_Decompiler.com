package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0355i;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzx extends C0355i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzab, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        zzab.zzf(status, (Object) null, this.zza);
    }
}
