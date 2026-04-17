package com.google.android.recaptcha.internal;

public final class zzqw extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzqw zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqw zzqw = new zzqw();
        zzb = zzqw;
        zznd.zzI(zzqw.class, zzqw);
    }

    private zzqw() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        } else if (i5 == 3) {
            return new zzqw();
        } else {
            if (i5 == 4) {
                return new zzqu((zzqv) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzqw.class) {
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
