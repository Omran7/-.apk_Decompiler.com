package com.google.android.gms.internal.play_billing;

public final class zzlb extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlb zzb;
    private int zzd;
    private int zze;

    static {
        zzlb zzlb = new zzlb();
        zzb = zzlb;
        zzhk.zzx(zzlb.class, zzlb);
    }

    private zzlb() {
    }

    public static /* synthetic */ void zzC(zzlb zzlb, int i2) {
        zzlb.zze = i2 - 1;
        zzlb.zzd |= 1;
    }

    public static zzky zzc() {
        return (zzky) zzb.zzm();
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzkz.zza});
        } else if (i5 == 3) {
            return new zzlb();
        } else {
            if (i5 == 4) {
                return new zzky((zzla) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
