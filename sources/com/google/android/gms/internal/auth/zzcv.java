package com.google.android.gms.internal.auth;

import android.util.Log;
import h0.C0552a;

final class zzcv extends zzdc {
    public zzcv(zzcz zzcz, String str, Long l6, boolean z3) {
        super(zzcz, str, l6, true, (zzdb) null);
    }

    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder t6 = C0552a.t("Invalid long value for ", zzc(), ": ");
            t6.append((String) obj);
            Log.e("PhenotypeFlag", t6.toString());
            return null;
        }
    }
}
