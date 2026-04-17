package com.google.android.recaptcha.internal;

public final class zzsg extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";

    static {
        zzsg zzsg = new zzsg();
        zzb = zzsg;
        zznd.zzI(zzsg.class, zzsg);
    }

    private zzsg() {
    }

    public static zzsf zzf() {
        return (zzsf) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsg zzsg, String str) {
        zzsg.zze |= 1;
        zzsg.zzf = str;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        } else if (i5 == 3) {
            return new zzsg();
        } else {
            if (i5 == 4) {
                return new zzsf((zzsn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsg.class) {
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
