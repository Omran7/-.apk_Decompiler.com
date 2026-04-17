package com.google.android.recaptcha.internal;

import G5.C0046s;
import G5.F;
import G5.I;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

public final class zzbx {
    public static final I zza(Task task) {
        C0046s a6 = F.a();
        task.addOnCompleteListener((Executor) zzbv.zza, new zzbu(a6));
        return new zzbw(a6);
    }
}
