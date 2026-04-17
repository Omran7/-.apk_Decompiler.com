package com.google.android.gms.internal.p001authapi;

import android.app.PendingIntent;
import com.bumptech.glide.c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.auth-api.zbbf  reason: invalid package */
final class zbbf extends zbae {
    final /* synthetic */ TaskCompletionSource zba;

    public zbbf(zbbg zbbg, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, PendingIntent pendingIntent) {
        c.n0(status, pendingIntent, this.zba);
    }
}
