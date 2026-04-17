package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzafg  reason: invalid package */
public class zzafg {
    zzaef zza;
    Executor zzb;

    public final <ResultT> Task<ResultT> zza(zzafi<ResultT> zzafi) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new zzafj(this, zzafi, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
