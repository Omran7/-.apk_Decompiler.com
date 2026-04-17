package com.google.android.recaptcha.internal;

public final class zzro extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzro zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private zzqt zzg;
    private zzqk zzh;
    private zzqw zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        zzro zzro = new zzro();
        zzb = zzro;
        zznd.zzI(zzro.class, zzro);
    }

    private zzro() {
    }

    public static zzrm zzf() {
        return (zzrm) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzro zzro, zzqk zzqk) {
        zzqk.getClass();
        zzro.zzh = zzqk;
        zzro.zze |= 2;
    }

    public static /* synthetic */ void zzj(zzro zzro, String str) {
        str.getClass();
        zzro.zzk = str;
    }

    public static /* synthetic */ void zzk(zzro zzro, String str) {
        str.getClass();
        zzro.zzj = str;
    }

    public static /* synthetic */ void zzl(zzro zzro, String str) {
        str.getClass();
        zzro.zzf = str;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i5 == 3) {
            return new zzro();
        } else {
            if (i5 == 4) {
                return new zzrm((zzrn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzro.class) {
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
