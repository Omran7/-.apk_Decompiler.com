package com.google.android.recaptcha.internal;

public final class zzqq extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzqq zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";
    /* access modifiers changed from: private */
    public int zzg;
    private String zzh = "";
    /* access modifiers changed from: private */
    public String zzi = "";
    private int zzj;
    /* access modifiers changed from: private */
    public int zzk;

    static {
        zzqq zzqq = new zzqq();
        zzb = zzqq;
        zznd.zzI(zzqq.class, zzqq);
    }

    private zzqq() {
    }

    public static /* synthetic */ void zzO(zzqq zzqq, String str) {
        str.getClass();
        zzqq.zze = str;
    }

    public static zzqo zzg() {
        return (zzqo) zzb.zzq();
    }

    public static zzqq zzj() {
        return zzb;
    }

    public final int zzf() {
        return this.zzg;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003Ȉ\u0004\u0004\u0005Ȉ\u0006Ȉ\u0007\u0004", new Object[]{"zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk"});
        } else if (i5 == 3) {
            return new zzqq();
        } else {
            if (i5 == 4) {
                return new zzqo((zzqp) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzqq.class) {
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

    public final String zzk() {
        return this.zze;
    }
}
