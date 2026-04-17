package com.google.android.gms.internal.p001authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.tasks.TaskCompletionSource;
import t1.C0986a;

/* renamed from: com.google.android.gms.internal.auth-api.zbap  reason: invalid package */
final class zbap extends zby {
    final /* synthetic */ TaskCompletionSource zba;

    public zbap(zbaq zbaq, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    public final void zbb(Status status, C0986a aVar) {
        if (status.v()) {
            this.zba.setResult(aVar);
        } else {
            this.zba.setException(I.k(status));
        }
    }
}
