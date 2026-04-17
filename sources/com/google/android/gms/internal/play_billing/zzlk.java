package com.google.android.gms.internal.play_billing;

public final class zzlk extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlk zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzku zzg;
    private zzkx zzh;

    static {
        zzlk zzlk = new zzlk();
        zzb = zzlk;
        zzhk.zzx(zzlk.class, zzlk);
    }

    private zzlk() {
    }

    public static /* synthetic */ void zzC(zzlk zzlk, zzjz zzjz) {
        zzlk.zzf = zzjz;
        zzlk.zze = 2;
    }

    public static /* synthetic */ void zzD(zzlk zzlk, zzkd zzkd) {
        zzlk.zzf = zzkd;
        zzlk.zze = 3;
    }

    public static /* synthetic */ void zzE(zzlk zzlk, zzkl zzkl) {
        zzkl.getClass();
        zzlk.zzf = zzkl;
        zzlk.zze = 7;
    }

    public static /* synthetic */ void zzF(zzlk zzlk, zzku zzku) {
        zzku.getClass();
        zzlk.zzg = zzku;
        zzlk.zzd |= 1;
    }

    public static /* synthetic */ void zzG(zzlk zzlk, zzlq zzlq) {
        zzlq.getClass();
        zzlk.zzf = zzlq;
        zzlk.zze = 8;
    }

    public static /* synthetic */ void zzH(zzlk zzlk, zzlu zzlu) {
        zzlk.zzf = zzlu;
        zzlk.zze = 4;
    }

    public static zzli zzc() {
        return (zzli) zzb.zzm();
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzjz.class, zzkd.class, zzlu.class, zzkr.class, "zzh", zzkl.class, zzlq.class});
        } else if (i5 == 3) {
            return new zzlk();
        } else {
            if (i5 == 4) {
                return new zzli((zzlj) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
