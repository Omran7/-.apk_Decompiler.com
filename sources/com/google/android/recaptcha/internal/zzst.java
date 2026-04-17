package com.google.android.recaptcha.internal;

public final class zzst extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzst zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzst zzst = new zzst();
        zzb = zzst;
        zznd.zzI(zzst.class, zzst);
    }

    private zzst() {
    }

    public final String zzg() {
        return this.zzf;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i5 == 3) {
            return new zzst();
        } else {
            if (i5 == 4) {
                return new zzss((zzsu) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzst.class) {
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

    public final String zzi() {
        return this.zzg;
    }
}
