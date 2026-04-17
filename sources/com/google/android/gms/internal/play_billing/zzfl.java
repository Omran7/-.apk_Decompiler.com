package com.google.android.gms.internal.play_billing;

public final class zzfl extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzfl zzb;
    private int zzd;
    private zzfq zze;
    private zzfq zzf;
    private int zzg;

    static {
        zzfl zzfl = new zzfl();
        zzb = zzfl;
        zzhk.zzx(zzfl.class, zzfl);
    }

    private zzfl() {
    }

    public static zzfk zza() {
        return (zzfk) zzb.zzm();
    }

    public static /* synthetic */ void zzc(zzfl zzfl, zzfq zzfq) {
        zzfq.getClass();
        zzfl.zze = zzfq;
        zzfl.zzd |= 1;
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzft.zza()});
        } else if (i5 == 3) {
            return new zzfl();
        } else {
            if (i5 == 4) {
                return new zzfk((zzfo) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
