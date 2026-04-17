package com.google.android.recaptcha.internal;

public final class zztx extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zztx zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zztx zztx = new zztx();
        zzb = zztx;
        zznd.zzI(zztx.class, zztx);
    }

    private zztx() {
    }

    public static /* synthetic */ void zzM(zztx zztx, zzrr zzrr) {
        zzrr.getClass();
        zztx.zzf = zzrr;
        zztx.zze = 2;
    }

    public static zztw zzi() {
        return (zztw) zzb.zzq();
    }

    public static zztx zzk(byte[] bArr) {
        return (zztx) zznd.zzx(zzb, bArr);
    }

    public static /* synthetic */ void zzl(zztx zztx, zzrc zzrc) {
        zzrc.getClass();
        zztx.zzf = zzrc;
        zztx.zze = 1;
    }

    public final int zzN() {
        int i2 = this.zze;
        if (i2 == 0) {
            return 3;
        }
        int i5 = 1;
        if (i2 != 1) {
            i5 = 2;
            if (i2 != 2) {
                return 0;
            }
        }
        return i5;
    }

    public final zzrc zzf() {
        if (this.zze == 1) {
            return (zzrc) this.zzf;
        }
        return zzrc.zzk();
    }

    public final zzrr zzg() {
        if (this.zze == 2) {
            return (zzrr) this.zzf;
        }
        return zzrr.zzg();
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zzf", "zze", zzrc.class, zzrr.class});
        } else if (i5 == 3) {
            return new zztx();
        } else {
            if (i5 == 4) {
                return new zztw((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zztx.class) {
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
