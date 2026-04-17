package com.google.android.gms.internal.play_billing;

public final class zzlu extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlu zzb;
    private int zzd;
    private int zze;

    static {
        zzlu zzlu = new zzlu();
        zzb = zzlu;
        zzhk.zzx(zzlu.class, zzlu);
    }

    private zzlu() {
    }

    public static zzlu zzB() {
        return zzb;
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", zzls.zza});
        } else if (i5 == 3) {
            return new zzlu();
        } else {
            if (i5 == 4) {
                return new zzlr((zzlt) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
