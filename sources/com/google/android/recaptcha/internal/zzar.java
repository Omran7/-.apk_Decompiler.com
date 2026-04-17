package com.google.android.recaptcha.internal;

import G5.I;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.k;
import m5.C0849h;
import x5.l;

final class zzar extends k implements l {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ I zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, I i2) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception exc;
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            if (completionExceptionOrNull == null) {
                this.zza.setResult(this.zzb.getCompleted());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                if (completionExceptionOrNull instanceof Exception) {
                    exc = (Exception) completionExceptionOrNull;
                } else {
                    exc = null;
                }
                if (exc == null) {
                    exc = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(exc);
            }
        }
        return C0849h.f10203c;
    }
}
