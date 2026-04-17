package com.google.android.gms.common.internal;

import androidx.emoji2.text.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.p;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public final class z implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f6230a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6231b;

    public z(BasePendingResult basePendingResult, TaskCompletionSource taskCompletionSource, v vVar) {
        this.f6230a = basePendingResult;
        this.f6231b = taskCompletionSource;
    }

    public final void a(Status status) {
        boolean v6 = status.v();
        TaskCompletionSource taskCompletionSource = this.f6231b;
        if (v6) {
            this.f6230a.await(0, TimeUnit.MILLISECONDS);
            taskCompletionSource.setResult(null);
            return;
        }
        taskCompletionSource.setException(I.k(status));
    }
}
