package com.google.android.gms.internal.play_billing;

public final class zzku extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzku zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        zzku zzku = new zzku();
        zzb = zzku;
        zzhk.zzx(zzku.class, zzku);
    }

    private zzku() {
    }

    public static /* synthetic */ void zzC(zzku zzku, int i2) {
        zzku.zzd |= 4;
        zzku.zzg = i2;
    }

    public static /* synthetic */ void zzD(zzku zzku, long j6) {
        zzku.zzd |= 8;
        zzku.zzh = j6;
    }

    public static /* synthetic */ void zzE(zzku zzku, String str) {
        str.getClass();
        zzku.zzd |= 2;
        zzku.zzf = str;
    }

    public static /* synthetic */ void zzF(zzku zzku, String str) {
        str.getClass();
        zzku.zzd |= 1;
        zzku.zze = str;
    }

    public static zzks zzc() {
        return (zzks) zzb.zzm();
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i5 == 3) {
            return new zzku();
        } else {
            if (i5 == 4) {
                return new zzks((zzkt) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
