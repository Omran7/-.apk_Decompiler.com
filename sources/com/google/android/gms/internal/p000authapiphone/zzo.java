package com.google.android.gms.internal.p000authapiphone;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0355i;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzo  reason: invalid package */
final class zzo extends C0355i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzr zzr, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onResult(Status status) {
        if (status.f6007a == 6) {
            this.zza.trySetException(I.k(status));
        } else {
            c.n0(status, (Object) null, this.zza);
        }
    }
}
