package com.google.android.recaptcha.internal;

import F5.i;
import I1.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.j;
import n5.C0875g;

public final class zzfu {
    private Set zza;
    private Set zzb;
    private Long zzc;
    private int zzd;

    private static final boolean zzc(String str, Set set) {
        List<String> list;
        j.e(str, "<this>");
        String valueOf = String.valueOf(new char[]{'.'}[0]);
        int S02 = i.S0(0, str, valueOf, false);
        if (S02 != -1) {
            ArrayList arrayList = new ArrayList(10);
            int i2 = 0;
            do {
                arrayList.add(str.subSequence(i2, S02).toString());
                i2 = valueOf.length() + S02;
                S02 = i.S0(i2, str, valueOf, false);
            } while (S02 != -1);
            arrayList.add(str.subSequence(i2, str.length()).toString());
            list = arrayList;
        } else {
            list = b.t0(str.toString());
        }
        String str2 = "";
        for (String valueOf2 : list) {
            String concat = str2.concat(String.valueOf(valueOf2));
            if (set.contains(concat)) {
                return true;
            }
            str2 = concat.concat(".");
        }
        return false;
    }

    public final void zza(zzrv zzrv) {
        this.zza = C0875g.b1(zzrv.zzf().zzi());
        this.zzb = C0875g.b1(zzrv.zzg().zzi());
    }

    public final boolean zzb(String str) {
        Set set = this.zza;
        if (set == null || this.zzb == null) {
            if (this.zzc == null) {
                this.zzc = Long.valueOf(System.currentTimeMillis());
            }
            this.zzd++;
            return true;
        } else if (set.isEmpty()) {
            return true;
        } else {
            Set set2 = this.zzb;
            j.c(set2, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            if (zzc(str, set2)) {
                return false;
            }
            return zzc(str, set);
        }
    }
}
