package com.google.android.recaptcha.internal;

public final class zzsz extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzsz zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = "";
    private zznk zzg = zznd.zzB();

    static {
        zzsz zzsz = new zzsz();
        zzb = zzsz;
        zznd.zzI(zzsz.class, zzsz);
    }

    private zzsz() {
    }

    public static zzsy zzf() {
        return (zzsy) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzsz zzsz, Iterable iterable) {
        zzsz.zzl();
        zzko.zzc(iterable, zzsz.zzg);
    }

    public static /* synthetic */ void zzj(zzsz zzsz, zzsx zzsx) {
        zzsx.getClass();
        zzsz.zzl();
        zzsz.zzg.add(zzsx);
    }

    public static /* synthetic */ void zzk(zzsz zzsz, String str) {
        str.getClass();
        zzsz.zze |= 1;
        zzsz.zzf = str;
    }

    private final void zzl() {
        zznk zznk = this.zzg;
        if (!zznk.zzc()) {
            this.zzg = zznd.zzC(zznk);
        }
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"zze", "zzg", zzsx.class, "zzf"});
        } else if (i5 == 3) {
            return new zzsz();
        } else {
            if (i5 == 4) {
                return new zzsy((zzta) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzsz.class) {
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
