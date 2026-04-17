package com.google.android.gms.internal.p001authapi;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import t1.C0998m;

/* renamed from: com.google.android.gms.internal.auth-api.zbav  reason: invalid package */
final class zbav extends zbak {
    final /* synthetic */ TaskCompletionSource zba;

    public zbav(zbaw zbaw, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, C0998m mVar) {
        c.n0(status, mVar, this.zba);
    }
}
