package com.google.android.recaptcha.internal;

public final class zzti extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzti zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzti zzti = new zzti();
        zzb = zzti;
        zznd.zzI(zzti.class, zzti);
    }

    private zzti() {
    }

    public static zztf zzf() {
        return (zztf) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzti zzti, Iterable iterable) {
        zzti.zzl();
        zzko.zzc(iterable, zzti.zze);
    }

    public static /* synthetic */ void zzj(zzti zzti, zzth zzth) {
        zzth.getClass();
        zzti.zzl();
        zzti.zze.add(zzth);
    }

    private final void zzl() {
        zznk zznk = this.zze;
        if (!zznk.zzc()) {
            this.zze = zznd.zzC(zznk);
        }
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u000b", new Object[]{"zze", zzth.class, "zzf"});
        } else if (i5 == 3) {
            return new zzti();
        } else {
            if (i5 == 4) {
                return new zztf((zztj) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzti.class) {
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
