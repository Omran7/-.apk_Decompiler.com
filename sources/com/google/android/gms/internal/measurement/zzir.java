package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzir extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzir zzb;
    private zzmj zzd = zzmd.zzcn();

    static {
        zzir zzir = new zzir();
        zzb = zzir;
        zzmd.zzct(zzir.class, zzir);
    }

    private zzir() {
    }

    public static zzir zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final List zzd() {
        return this.zzd;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzit.class});
        } else if (i5 == 3) {
            return new zzir();
        } else {
            if (i5 == 4) {
                return new zziq((zzja) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
