package com.google.android.recaptcha.internal;

public final class zzsx extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsx zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzni zzh = zznd.zzy();
    private int zzi;
    private int zzj;

    static {
        zzsx zzsx = new zzsx();
        zzb = zzsx;
        zznd.zzI(zzsx.class, zzsx);
    }

    private zzsx() {
    }

    public static zzsv zzf() {
        return (zzsv) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsx zzsx, String str) {
        str.getClass();
        zzsx.zze |= 2;
        zzsx.zzg = str;
    }

    public static /* synthetic */ void zzj(zzsx zzsx, String str) {
        str.getClass();
        zzsx.zze |= 1;
        zzsx.zzf = str;
    }

    public static /* synthetic */ void zzk(zzsx zzsx, int i2) {
        zzsx.zzi = 2;
        zzsx.zze |= 4;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzsw.zza, "zzj"});
        } else if (i5 == 3) {
            return new zzsx();
        } else {
            if (i5 == 4) {
                return new zzsv((zzta) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsx.class) {
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
