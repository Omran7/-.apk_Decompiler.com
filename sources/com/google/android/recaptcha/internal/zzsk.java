package com.google.android.recaptcha.internal;

public final class zzsk extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsk zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzsk zzsk = new zzsk();
        zzb = zzsk;
        zznd.zzI(zzsk.class, zzsk);
    }

    private zzsk() {
    }

    public static zzsj zzf() {
        return (zzsj) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsk zzsk, String str) {
        str.getClass();
        zzsk.zze |= 2;
        zzsk.zzg = str;
    }

    public static /* synthetic */ void zzj(zzsk zzsk, String str) {
        str.getClass();
        zzsk.zze |= 1;
        zzsk.zzf = str;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i5 == 3) {
            return new zzsk();
        } else {
            if (i5 == 4) {
                return new zzsj((zzsn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsk.class) {
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
