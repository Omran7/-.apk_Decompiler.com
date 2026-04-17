package com.google.android.gms.internal.location;

import android.os.Looper;
import com.google.android.gms.common.internal.I;

public final class zzbj {
    public static Looper zza(Looper looper) {
        if (looper != null) {
            return looper;
        }
        return zzb();
    }

    public static Looper zzb() {
        boolean z3;
        if (Looper.myLooper() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.i("Can't create handler inside thread that has not called Looper.prepare()", z3);
        return Looper.myLooper();
    }
}
