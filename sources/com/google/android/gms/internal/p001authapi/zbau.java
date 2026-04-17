package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import t1.C0996k;

/* renamed from: com.google.android.gms.internal.auth-api.zbau  reason: invalid package */
final class zbau extends zbai {
    final /* synthetic */ TaskCompletionSource zba;

    public zbau(zbaw zbaw, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, C0996k kVar) {
        if (status.v()) {
            this.zba.setResult(kVar);
        } else {
            this.zba.setException(I.k(status));
        }
    }
}
