package com.google.android.recaptcha.internal;

public final class zzrv extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzrv zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zzrt zzf;
    private zzrt zzg;

    static {
        zzrv zzrv = new zzrv();
        zzb = zzrv;
        zznd.zzI(zzrv.class, zzrv);
    }

    private zzrv() {
    }

    public static zzrv zzj(byte[] bArr) {
        return (zzrv) zznd.zzx(zzb, bArr);
    }

    public final zzrt zzf() {
        zzrt zzrt = this.zzf;
        if (zzrt == null) {
            return zzrt.zzg();
        }
        return zzrt;
    }

    public final zzrt zzg() {
        zzrt zzrt = this.zzg;
        if (zzrt == null) {
            return zzrt.zzg();
        }
        return zzrt;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i5 == 3) {
            return new zzrv();
        } else {
            if (i5 == 4) {
                return new zzru((zzrw) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzrv.class) {
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
