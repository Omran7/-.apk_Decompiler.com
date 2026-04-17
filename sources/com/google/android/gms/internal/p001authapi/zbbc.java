package com.google.android.gms.internal.p001authapi;

import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import t1.C0992g;

/* renamed from: com.google.android.gms.internal.auth-api.zbbc  reason: invalid package */
final class zbbc extends zbab {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbc(zbbg zbbg, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, C0992g gVar) {
        c.n0(status, gVar, this.zba);
    }
}
