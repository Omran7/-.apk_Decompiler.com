package com.google.android.gms.internal.measurement;

import android.util.Log;

final class zzkb extends zzki {
    public zzkb(zzkf zzkf, String str, Long l6, boolean z3) {
        super(zzkf, str, l6, true, (zzkh) null);
    }

    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String obj2 = obj.toString();
        Log.e("PhenotypeFlag", "Invalid long value for " + str + ": " + obj2);
        return null;
    }
}
