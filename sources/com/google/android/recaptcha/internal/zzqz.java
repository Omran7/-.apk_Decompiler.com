package com.google.android.recaptcha.internal;

public final class zzqz extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzqz zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private int zzg;
    private String zzh = "";
    private int zzi;
    private String zzj = "";
    private int zzk;

    static {
        zzqz zzqz = new zzqz();
        zzb = zzqz;
        zznd.zzI(zzqz.class, zzqz);
    }

    private zzqz() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0004\u0004Ȉ\u0005\u0004\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i5 == 3) {
            return new zzqz();
        } else {
            if (i5 == 4) {
                return new zzqx((zzqy) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzqz.class) {
                    try {
                        zzoq = zzd;
                        if (zzoq == null) {
                            zzoq = new zzmy(zzb);
                            zzd = zzoq;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zzoq;
        }
    }
}
