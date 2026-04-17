package com.google.android.recaptcha.internal;

public final class zztq extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zztq zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zztq zztq = new zztq();
        zzb = zztq;
        zznd.zzI(zztq.class, zztq);
    }

    private zztq() {
    }

    public static zztp zzf() {
        return (zztp) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zztq zztq, String str) {
        str.getClass();
        zztq.zze = str;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zze", "zzf"});
        } else if (i5 == 3) {
            return new zztq();
        } else {
            if (i5 == 4) {
                return new zztp((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zztq.class) {
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
