package com.google.android.recaptcha.internal;

public final class zzto extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzto zzb;
    private static volatile zzoq zzd;
    private String zze = "";
    private String zzf = "";
    /* access modifiers changed from: private */
    public String zzg = "";
    /* access modifiers changed from: private */
    public int zzh;
    private String zzi = "";
    private String zzj = "";
    /* access modifiers changed from: private */
    public String zzk = "";

    static {
        zzto zzto = new zzto();
        zzb = zzto;
        zznd.zzI(zzto.class, zzto);
    }

    private zzto() {
    }

    public static /* synthetic */ void zzM(zzto zzto, String str) {
        str.getClass();
        zzto.zzi = str;
    }

    public static /* synthetic */ void zzN(zzto zzto, String str) {
        str.getClass();
        zzto.zze = str;
    }

    public static zztn zzf() {
        return (zztn) zzb.zzq();
    }

    public static /* synthetic */ void zzj(zzto zzto, String str) {
        str.getClass();
        zzto.zzj = str;
    }

    public static /* synthetic */ void zzk(zzto zzto, String str) {
        str.getClass();
        zzto.zzf = str;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i5 == 3) {
            return new zzto();
        } else {
            if (i5 == 4) {
                return new zztn((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzto.class) {
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
