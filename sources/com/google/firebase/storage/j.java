package com.google.firebase.storage;

import R.b;
import Z2.f;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class j implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f6930a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Continuation f6931b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f6932c;
    public final /* synthetic */ CancellationTokenSource d;

    public /* synthetic */ j(k kVar, Continuation continuation, TaskCompletionSource taskCompletionSource, CancellationTokenSource cancellationTokenSource) {
        this.f6930a = kVar;
        this.f6931b = continuation;
        this.f6932c = taskCompletionSource;
        this.d = cancellationTokenSource;
    }

    public final void onComplete(Task task) {
        Continuation continuation = this.f6931b;
        TaskCompletionSource taskCompletionSource = this.f6932c;
        k kVar = this.f6930a;
        kVar.getClass();
        try {
            Task task2 = (Task) continuation.then(kVar);
            if (taskCompletionSource.getTask().isComplete()) {
                return;
            }
            if (task2 == null) {
                taskCompletionSource.setException(new NullPointerException("Continuation returned null"));
                return;
            }
            task2.addOnSuccessListener(new b(taskCompletionSource, 4));
            task2.addOnFailureListener(new f(taskCompletionSource, 1));
            task2.addOnCanceledListener(new h(this.d));
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
