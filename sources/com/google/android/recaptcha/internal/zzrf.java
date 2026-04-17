package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzrf extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzrf zzb;
    private static volatile zzoq zzd;
    private int zze;
    private zznk zzf = zznd.zzB();
    private zznk zzg = zznd.zzB();
    private zzqn zzh;

    static {
        zzrf zzrf = new zzrf();
        zzb = zzrf;
        zznd.zzI(zzrf.class, zzrf);
    }

    private zzrf() {
    }

    public static /* synthetic */ void zzM(zzrf zzrf, zzrc zzrc) {
        zzrc.getClass();
        zznk zznk = zzrf.zzf;
        if (!zznk.zzc()) {
            zzrf.zzf = zznd.zzC(zznk);
        }
        zzrf.zzf.add(zzrc);
    }

    public static /* synthetic */ void zzN(zzrf zzrf, zzrr zzrr) {
        zzrr.getClass();
        zznk zznk = zzrf.zzg;
        if (!zznk.zzc()) {
            zzrf.zzg = zznd.zzC(zznk);
        }
        zzrf.zzg.add(zzrr);
    }

    public static zzrd zzi() {
        return (zzrd) zzb.zzq();
    }

    public static zzrf zzk(byte[] bArr) {
        return (zzrf) zznd.zzx(zzb, bArr);
    }

    public final int zzf() {
        return this.zzf.size();
    }

    public final int zzg() {
        return this.zzg.size();
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"zze", "zzf", zzrc.class, "zzg", zzrr.class, "zzh"});
        } else if (i5 == 3) {
            return new zzrf();
        } else {
            if (i5 == 4) {
                return new zzrd((zzre) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzrf.class) {
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

    public final List zzl() {
        return this.zzf;
    }
}
