package com.google.android.recaptcha.internal;

public final class zzma extends zzna implements zzoj {
    /* access modifiers changed from: private */
    public static final zzma zzd;
    private static volatile zzoq zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private byte zzm = 2;

    static {
        zzma zzma = new zzma();
        zzd = zzma;
        zznd.zzI(zzma.class, zzma);
    }

    private zzma() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        byte b6;
        int i5 = i2 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i5 == 2) {
            return new zzou(zzd, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005", new Object[]{"zzf", "zzg", zzlv.zza, "zzh", zzlu.zza, "zzi", zzly.zza, "zzj", zzlz.zza, "zzk", zzlx.zza, "zzl", zzlw.zza});
        } else if (i5 == 3) {
            return new zzma();
        } else {
            if (i5 == 4) {
                return new zzlt((zzmh) null);
            }
            if (i5 == 5) {
                return zzd;
            }
            if (i5 != 6) {
                if (obj == null) {
                    b6 = 0;
                } else {
                    b6 = 1;
                }
                this.zzm = b6;
                return null;
            }
            zzoq zzoq = zze;
            if (zzoq == null) {
                synchronized (zzma.class) {
                    try {
                        zzoq = zze;
                        if (zzoq == null) {
                            zzoq = new zzmy(zzd);
                            zze = zzoq;
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
