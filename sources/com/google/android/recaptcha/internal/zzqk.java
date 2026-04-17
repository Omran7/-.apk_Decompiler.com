package com.google.android.recaptcha.internal;

import java.util.Iterator;

public final class zzqk extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzqk zzb;
    private static volatile zzoq zzd;
    /* access modifiers changed from: private */
    public int zze;
    private String zzf = "";
    /* access modifiers changed from: private */
    public String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzni zzk = zznd.zzy();

    static {
        zzqk zzqk = new zzqk();
        zzb = zzqk;
        zznd.zzI(zzqk.class, zzqk);
    }

    private zzqk() {
    }

    public static /* synthetic */ void zzM(zzqk zzqk, String str) {
        str.getClass();
        zzqk.zzf = str;
    }

    public static /* synthetic */ void zzN(zzqk zzqk, String str) {
        str.getClass();
        zzqk.zzi = str;
    }

    public static zzqh zzf() {
        return (zzqh) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzqk zzqk, Iterable iterable) {
        zzni zzni = zzqk.zzk;
        if (!zzni.zzc()) {
            zzqk.zzk = zznd.zzz(zzni);
        }
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            zzqk.zzk.zzh(((zzqi) it2.next()).zza());
        }
    }

    public static /* synthetic */ void zzk(zzqk zzqk, String str) {
        str.getClass();
        zzqk.zzj = str;
    }

    public static /* synthetic */ void zzl(zzqk zzqk, String str) {
        str.getClass();
        zzqk.zzh = str;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i5 == 3) {
            return new zzqk();
        } else {
            if (i5 == 4) {
                return new zzqh((zzqj) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzqk.class) {
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
