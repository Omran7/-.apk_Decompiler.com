package com.google.android.recaptcha.internal;

import G5.C0046s;
import G5.r;
import G5.v0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;

public final /* synthetic */ class zzbu implements OnCompleteListener {
    public final /* synthetic */ r zza;

    public /* synthetic */ zzbu(r rVar) {
        this.zza = rVar;
    }

    public final void onComplete(Task task) {
        r rVar = this.zza;
        Exception exception = task.getException();
        if (exception != null) {
            ((C0046s) rVar).L(exception);
        } else if (task.isCanceled()) {
            ((v0) rVar).cancel((CancellationException) null);
        } else {
            ((C0046s) rVar).A(task.getResult());
        }
    }
}
