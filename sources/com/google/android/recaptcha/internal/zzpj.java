package com.google.android.recaptcha.internal;

public final class zzpj extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzpj zzb;
    private static volatile zzoq zzd;
    /* access modifiers changed from: private */
    public long zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzpj zzpj = new zzpj();
        zzb = zzpj;
        zznd.zzI(zzpj.class, zzpj);
    }

    private zzpj() {
    }

    public static zzph zzi() {
        return (zzph) zzb.zzq();
    }

    public final int zzf() {
        return this.zzf;
    }

    public final long zzg() {
        return this.zze;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return new zzou(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
        } else if (i5 == 3) {
            return new zzpj();
        } else {
            if (i5 == 4) {
                return new zzph((zzpi) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzpj.class) {
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
