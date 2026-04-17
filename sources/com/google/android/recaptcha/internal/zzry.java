package com.google.android.recaptcha.internal;

public final class zzry extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzry zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzry zzry = new zzry();
        zzb = zzry;
        zznd.zzI(zzry.class, zzry);
    }

    private zzry() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        } else if (i5 == 3) {
            return new zzry();
        } else {
            if (i5 == 4) {
                return new zzrx((zzsn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzry.class) {
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
