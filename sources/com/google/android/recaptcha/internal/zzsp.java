package com.google.android.recaptcha.internal;

public final class zzsp extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsp zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";
    private zzsi zzm;

    static {
        zzsp zzsp = new zzsp();
        zzb = zzsp;
        zznd.zzI(zzsp.class, zzsp);
    }

    private zzsp() {
    }

    public static /* synthetic */ void zzM(zzsp zzsp, String str) {
        str.getClass();
        zzsp.zze |= 4;
        zzsp.zzh = str;
    }

    public static zzso zzf() {
        return (zzso) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsp zzsp, String str) {
        str.getClass();
        zzsp.zze |= 8;
        zzsp.zzi = str;
    }

    public static /* synthetic */ void zzj(zzsp zzsp, String str) {
        str.getClass();
        zzsp.zze |= 2;
        zzsp.zzg = str;
    }

    public static /* synthetic */ void zzk(zzsp zzsp, String str) {
        str.getClass();
        zzsp.zze |= 1;
        zzsp.zzf = str;
    }

    public static /* synthetic */ void zzl(zzsp zzsp, zzsi zzsi) {
        zzsi.getClass();
        zzsp.zzm = zzsi;
        zzsp.zze |= 128;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        } else if (i5 == 3) {
            return new zzsp();
        } else {
            if (i5 == 4) {
                return new zzso((zzsu) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsp.class) {
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
