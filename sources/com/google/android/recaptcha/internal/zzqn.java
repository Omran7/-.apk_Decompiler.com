package com.google.android.recaptcha.internal;

public final class zzqn extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzqn zzb;
    private static volatile zzoq zzd;
    private zzle zze;
    private String zzf = "";
    private zzle zzg;
    private String zzh;
    private String zzi;
    private zzle zzj;
    private String zzk;
    private zzle zzl;

    static {
        zzqn zzqn = new zzqn();
        zzb = zzqn;
        zznd.zzI(zzqn.class, zzqn);
    }

    private zzqn() {
        zzle zzle = zzle.zzb;
        this.zze = zzle;
        this.zzg = zzle;
        this.zzh = "";
        this.zzi = "";
        this.zzj = zzle;
        this.zzk = "";
        this.zzl = zzle;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\n\u0004Ȉ\u0005Ȉ\u0006\n\u0007Ȉ\b\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i5 == 3) {
            return new zzqn();
        } else {
            if (i5 == 4) {
                return new zzql((zzqm) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzqn.class) {
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
