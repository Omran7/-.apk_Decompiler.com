package com.google.android.recaptcha.internal;

public final class zzsa extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsa zzb;
    private static volatile zzoq zzd;
    private zzle zze = zzle.zzb;

    static {
        zzsa zzsa = new zzsa();
        zzb = zzsa;
        zznd.zzI(zzsa.class, zzsa);
    }

    private zzsa() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zze"});
        } else if (i5 == 3) {
            return new zzsa();
        } else {
            if (i5 == 4) {
                return new zzrz((zzsn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsa.class) {
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
