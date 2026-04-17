package com.google.android.recaptcha.internal;

public final class zzrl extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzrl zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzml zzf;
    private zzpj zzg;
    private zzml zzh;
    private zzpj zzi;

    static {
        zzrl zzrl = new zzrl();
        zzb = zzrl;
        zznd.zzI(zzrl.class, zzrl);
    }

    private zzrl() {
    }

    public static zzrj zzf() {
        return (zzrj) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzrl zzrl, zzpj zzpj) {
        zzpj.getClass();
        zzrl.zzi = zzpj;
        zzrl.zze |= 8;
    }

    public static /* synthetic */ void zzj(zzrl zzrl, zzml zzml) {
        zzml.getClass();
        zzrl.zzh = zzml;
        zzrl.zze |= 4;
    }

    public static /* synthetic */ void zzk(zzrl zzrl, zzpj zzpj) {
        zzpj.getClass();
        zzrl.zzg = zzpj;
        zzrl.zze |= 2;
    }

    public static /* synthetic */ void zzl(zzrl zzrl, zzml zzml) {
        zzml.getClass();
        zzrl.zzf = zzml;
        zzrl.zze |= 1;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i5 == 3) {
            return new zzrl();
        } else {
            if (i5 == 4) {
                return new zzrj((zzrk) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzrl.class) {
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
