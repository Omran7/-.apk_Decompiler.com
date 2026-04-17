package com.google.android.recaptcha.internal;

public final class zzsi extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsi zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzsm zzk;
    private zzsg zzl;
    private zzsk zzm;
    private zzry zzn;

    static {
        zzsi zzsi = new zzsi();
        zzb = zzsi;
        zznd.zzI(zzsi.class, zzsi);
    }

    private zzsi() {
    }

    public static /* synthetic */ void zzN(zzsi zzsi, String str) {
        str.getClass();
        zzsi.zze |= 1;
        zzsi.zzf = str;
    }

    public static /* synthetic */ void zzO(zzsi zzsi, zzsg zzsg) {
        zzsg.getClass();
        zzsi.zzl = zzsg;
        zzsi.zze |= 64;
    }

    public static /* synthetic */ void zzP(zzsi zzsi, zzsm zzsm) {
        zzsm.getClass();
        zzsi.zzk = zzsm;
        zzsi.zze |= 32;
    }

    public static /* synthetic */ void zzQ(zzsi zzsi, zzsk zzsk) {
        zzsk.getClass();
        zzsi.zzm = zzsk;
        zzsi.zze |= 128;
    }

    public static zzsh zzf() {
        return (zzsh) zzb.zzq();
    }

    public static zzsi zzi(byte[] bArr) {
        return (zzsi) zznd.zzx(zzb, bArr);
    }

    @Deprecated
    public final String zzM() {
        return this.zzh;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        } else if (i5 == 3) {
            return new zzsi();
        } else {
            if (i5 == 4) {
                return new zzsh((zzsn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsi.class) {
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

    @Deprecated
    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zzf;
    }

    @Deprecated
    public final String zzl() {
        return this.zzg;
    }
}
