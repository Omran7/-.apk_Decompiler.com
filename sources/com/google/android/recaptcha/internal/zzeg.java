package com.google.android.recaptcha.internal;

import F5.i;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

public final class zzeg {
    private zzeg() {
        throw null;
    }

    /* access modifiers changed from: private */
    public static final int zzc(String str) {
        String V02 = i.V0("18.6.1", ".", "");
        int T02 = i.T0(6, V02, "-", false);
        if (T02 != -1) {
            V02 = V02.substring(0, T02);
            j.d(V02, "substring(...)");
        }
        return Integer.parseInt(V02);
    }

    /* access modifiers changed from: private */
    public static final String zzd(String str) {
        return "cesdb".concat(i.X0("18.6.1", "-", ""));
    }

    public /* synthetic */ zzeg(f fVar) {
    }
}
