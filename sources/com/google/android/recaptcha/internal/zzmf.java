package com.google.android.recaptcha.internal;

public final class zzmf extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzmf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private byte zzh = 2;

    static {
        zzmf zzmf = new zzmf();
        zzb = zzmf;
        zznd.zzI(zzmf.class, zzmf);
    }

    private zzmf() {
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        byte b6;
        int i5 = i2 - 1;
        if (i5 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i5 == 2) {
            return new zzou(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i5 == 3) {
            return new zzmf();
        } else {
            if (i5 == 4) {
                return new zzme((zzmh) null);
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
                this.zzh = b6;
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzmf.class) {
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
