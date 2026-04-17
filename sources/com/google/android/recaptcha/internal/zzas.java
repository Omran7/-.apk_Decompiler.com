package com.google.android.recaptcha.internal;

import G5.I;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzas {
    public static final Task zza(I i2) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        i2.invokeOnCompletion(new zzar(taskCompletionSource, i2));
        return taskCompletionSource.getTask();
    }
}
