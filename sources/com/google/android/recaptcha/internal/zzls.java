package com.google.android.recaptcha.internal;

public final class zzls extends zzna implements zzoj {
    /* access modifiers changed from: private */
    public static final zzls zzd;
    private static volatile zzoq zze;
    private int zzf;
    private boolean zzg;
    private zzma zzh;
    private boolean zzi;
    private zzmc zzj;
    private zznk zzk = zzot.zze();
    private byte zzl = 2;

    static {
        zzls zzls = new zzls();
        zzd = zzls;
        zznd.zzI(zzls.class, zzls);
    }

    private zzls() {
    }

    public static zzls zzg() {
        return zzd;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        byte b6;
        int i5 = i2 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i5 == 2) {
            return new zzou(zzd, "\u0001\u0005\u0000\u0001\u0001ϧ\u0005\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဉ\u0003ϧЛ", new Object[]{"zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzmg.class});
        } else if (i5 == 3) {
            return new zzls();
        } else {
            if (i5 == 4) {
                return new zzlr((zzmh) null);
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
                this.zzl = b6;
                return null;
            }
            zzoq zzoq = zze;
            if (zzoq == null) {
                synchronized (zzls.class) {
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
