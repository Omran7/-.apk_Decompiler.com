package com.google.android.gms.internal.play_billing;

public final class zzjz extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzjz zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private zzki zzh;

    static {
        zzjz zzjz = new zzjz();
        zzb = zzjz;
        zzhk.zzx(zzjz.class, zzjz);
    }

    private zzjz() {
    }

    public static zzjz zzC(byte[] bArr, zzgw zzgw) {
        return (zzjz) zzhk.zzq(zzb, bArr, zzgw);
    }

    public static /* synthetic */ void zzD(zzjz zzjz, zzki zzki) {
        zzki.getClass();
        zzjz.zzh = zzki;
        zzjz.zzd |= 2;
    }

    public static /* synthetic */ void zzE(zzjz zzjz, zzlb zzlb) {
        zzlb.getClass();
        zzjz.zzf = zzlb;
        zzjz.zze = 4;
    }

    public static /* synthetic */ void zzF(zzjz zzjz, int i2) {
        zzjz.zzg = i2 - 1;
        zzjz.zzd |= 1;
    }

    public static zzjx zzc() {
        return (zzjx) zzb.zzm();
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", zzka.zza, "zzh", zzlb.class});
        } else if (i5 == 3) {
            return new zzjz();
        } else {
            if (i5 == 4) {
                return new zzjx((zzjy) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
