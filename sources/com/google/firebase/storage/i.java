package com.google.firebase.storage;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class i implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f6927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f6928b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6929c;

    public /* synthetic */ i(k kVar, Continuation continuation, TaskCompletionSource taskCompletionSource) {
        this.f6927a = kVar;
        this.f6928b = continuation;
        this.f6929c = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        Continuation continuation = this.f6928b;
        TaskCompletionSource taskCompletionSource = this.f6929c;
        k kVar = this.f6927a;
        kVar.getClass();
        try {
            Object then = continuation.then(kVar);
            if (!taskCompletionSource.getTask().isComplete()) {
                taskCompletionSource.setResult(then);
            }
        } catch (RuntimeExecutionException e6) {
            if (e6.getCause() instanceof Exception) {
                taskCompletionSource.setException((Exception) e6.getCause());
            } else {
                taskCompletionSource.setException(e6);
            }
        } catch (Exception e7) {
            taskCompletionSource.setException(e7);
        }
    }
}
