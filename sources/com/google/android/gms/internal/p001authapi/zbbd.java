package com.google.android.gms.internal.p001authapi;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0355i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbbd  reason: invalid package */
final class zbbd extends C0355i {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbd(zbbg zbbg, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void onResult(Status status) {
        c.n0(status, (Object) null, this.zba);
    }
}
