package com.google.android.gms.internal.play_billing;

public final class zzkd extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzkd zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        zzkd zzkd = new zzkd();
        zzb = zzkd;
        zzhk.zzx(zzkd.class, zzkd);
    }

    private zzkd() {
    }

    public static /* synthetic */ void zzC(zzkd zzkd, zzlb zzlb) {
        zzlb.getClass();
        zzkd.zzf = zzlb;
        zzkd.zze = 2;
    }

    public static /* synthetic */ void zzD(zzkd zzkd, zzlx zzlx) {
        zzlx.getClass();
        zzkd.zzf = zzlx;
        zzkd.zze = 3;
    }

    public static /* synthetic */ void zzE(zzkd zzkd, int i2) {
        zzkd.zzg = i2 - 1;
        zzkd.zzd |= 1;
    }

    public static zzkb zzc() {
        return (zzkb) zzb.zzm();
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, zzlb.class, zzlx.class, zzlh.class});
        } else if (i5 == 3) {
            return new zzkd();
        } else {
            if (i5 == 4) {
                return new zzkb((zzkc) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
