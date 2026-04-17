package com.google.android.recaptcha.internal;

public final class zzmg extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzmg zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zznk zzf = zzot.zze();
    private String zzg = "";
    private long zzh;
    private long zzi;
    private double zzj;
    private zzle zzk = zzle.zzb;
    private String zzl = "";
    private byte zzm = 2;

    static {
        zzmg zzmg = new zzmg();
        zzb = zzmg;
        zznd.zzI(zzmg.class, zzmg);
    }

    private zzmg() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        byte b6;
        int i5 = i2 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzm);
        }
        if (i5 == 2) {
            return new zzou(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zze", "zzf", zzmf.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i5 == 3) {
            return new zzmg();
        } else {
            if (i5 == 4) {
                return new zzmd((zzmh) null);
            }
            if (i5 == 5) {
                return zzb;
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
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzmg.class) {
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
