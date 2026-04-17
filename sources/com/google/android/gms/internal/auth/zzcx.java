package com.google.android.gms.internal.auth;

import android.util.Log;
import h0.C0552a;

final class zzcx extends zzdc {
    public zzcx(zzcz zzcz, String str, Double d, boolean z3) {
        super(zzcz, str, d, true, (zzdb) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder t6 = C0552a.t("Invalid double value for ", zzc(), ": ");
            t6.append((String) obj);
            Log.e("PhenotypeFlag", t6.toString());
            return null;
        }
    }
}
