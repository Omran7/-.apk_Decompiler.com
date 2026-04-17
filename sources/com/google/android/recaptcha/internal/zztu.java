package com.google.android.recaptcha.internal;

import java.io.InputStream;

public final class zztu extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zztu zzb;
    private static volatile zzoq zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zztu zztu = new zztu();
        zzb = zztu;
        zznd.zzI(zztu.class, zztu);
    }

    private zztu() {
    }

    public static zztu zzg(InputStream inputStream) {
        return (zztu) zznd.zzw(zzb, inputStream);
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i5 == 3) {
            return new zztu();
        } else {
            if (i5 == 4) {
                return new zztt((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zztu.class) {
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

    public final zztv zzi() {
        zztv zzb2 = zztv.zzb(this.zzg);
        return zzb2 == null ? zztv.UNRECOGNIZED : zzb2;
    }
}
