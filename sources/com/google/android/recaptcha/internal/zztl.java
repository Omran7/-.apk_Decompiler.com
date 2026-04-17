package com.google.android.recaptcha.internal;

public final class zztl extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zztl zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zztl zztl = new zztl();
        zzb = zztl;
        zznd.zzI(zztl.class, zztl);
    }

    private zztl() {
    }

    public static zztl zzg() {
        return zzb;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000(\u0001\u0000\u0001((\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019?\u0000\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000'?\u0000(?\u0000", new Object[]{"zzf", "zze"});
        } else if (i5 == 3) {
            return new zztl();
        } else {
            if (i5 == 4) {
                return new zztk((zztm) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zztl.class) {
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
