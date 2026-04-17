package com.google.android.recaptcha.internal;

public final class zzse extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzse zzb;
    private static volatile zzoq zzd;
    private zzle zze;
    private String zzf = "";
    private long zzg;
    private zzle zzh;
    private String zzi;
    private String zzj;

    static {
        zzse zzse = new zzse();
        zzb = zzse;
        zznd.zzI(zzse.class, zzse);
    }

    private zzse() {
        zzle zzle = zzle.zzb;
        this.zze = zzle;
        this.zzh = zzle;
        this.zzi = "";
        this.zzj = "";
    }

    public static zzse zzk() {
        return zzb;
    }

    public final long zzf() {
        return this.zzg;
    }

    public final zzle zzg() {
        return this.zzh;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i5 == 3) {
            return new zzse();
        } else {
            if (i5 == 4) {
                return new zzsd((zzsn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzse.class) {
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

    public final zzle zzi() {
        return this.zze;
    }

    public final String zzl() {
        return this.zzf;
    }
}
