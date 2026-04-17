package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzdy;
import h0.C0552a;

final class zzez extends zzdy.zzi implements Runnable {
    private final Runnable zzc;

    public zzez(Runnable runnable) {
        runnable.getClass();
        this.zzc = runnable;
    }

    public final void run() {
        try {
            this.zzc.run();
        } catch (Throwable th) {
            zzo(th);
            throw th;
        }
    }

    public final String zzg() {
        return C0552a.o("task=[", this.zzc.toString(), "]");
    }
}
