package com.google.android.recaptcha.internal;

public final class zzqg extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzqg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzml zzf;
    private int zzg;

    static {
        zzqg zzqg = new zzqg();
        zzb = zzqg;
        zznd.zzI(zzqg.class, zzqg);
    }

    private zzqg() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zze", "zzf", "zzg"});
        } else if (i5 == 3) {
            return new zzqg();
        } else {
            if (i5 == 4) {
                return new zzqe((zzqf) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzqg.class) {
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
