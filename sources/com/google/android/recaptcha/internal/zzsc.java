package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzsc extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsc zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zznj zzl = zznd.zzA();
    private zzle zzm = zzle.zzb;
    private String zzn = "";
    private zzse zzo;
    private zzsa zzp;

    static {
        zzsc zzsc = new zzsc();
        zzb = zzsc;
        zznd.zzI(zzsc.class, zzsc);
    }

    private zzsc() {
    }

    public static zzsc zzi() {
        return zzb;
    }

    public final String zzM() {
        return this.zzh;
    }

    public final String zzN() {
        return this.zzj;
    }

    public final String zzO() {
        return this.zzk;
    }

    public final List zzP() {
        return this.zzl;
    }

    public final boolean zzQ() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzR() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzS() {
        return (this.zze & 256) != 0;
    }

    public final boolean zzT() {
        return (this.zze & 64) != 0;
    }

    public final zzle zzf() {
        return this.zzm;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\tለ\u0007\u000bဉ\b\fဉ\t", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        } else if (i5 == 3) {
            return new zzsc();
        } else {
            if (i5 == 4) {
                return new zzsb((zzsn) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsc.class) {
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

    public final zzse zzj() {
        zzse zzse = this.zzo;
        if (zzse == null) {
            return zzse.zzk();
        }
        return zzse;
    }

    public final String zzk() {
        return this.zzg;
    }

    public final String zzl() {
        return this.zzi;
    }
}
