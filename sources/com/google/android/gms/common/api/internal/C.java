package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

public final class C implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6015a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ D f6016b;

    public C(D d, TaskCompletionSource taskCompletionSource) {
        this.f6016b = d;
        this.f6015a = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        ((Map) this.f6016b.f6018b).remove(this.f6015a);
    }
}
