package com.google.android.recaptcha.internal;

public final class zzth extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzth zzb;
    private static volatile zzoq zzd;
    private int zze = 0;
    private Object zzf;

    static {
        zzth zzth = new zzth();
        zzb = zzth;
        zznd.zzI(zzth.class, zzth);
    }

    private zzth() {
    }

    public static /* synthetic */ void zzM(zzth zzth, float f6) {
        zzth.zze = 9;
        zzth.zzf = Float.valueOf(f6);
    }

    public static /* synthetic */ void zzN(zzth zzth, int i2) {
        zzth.zze = 4;
        zzth.zzf = Integer.valueOf(i2);
    }

    public static /* synthetic */ void zzO(zzth zzth, int i2) {
        zzth.zze = 5;
        zzth.zzf = Integer.valueOf(i2);
    }

    public static /* synthetic */ void zzP(zzth zzth, long j6) {
        zzth.zze = 7;
        zzth.zzf = Long.valueOf(j6);
    }

    public static /* synthetic */ void zzQ(zzth zzth, String str) {
        str.getClass();
        zzth.zze = 11;
        zzth.zzf = str;
    }

    public static zztg zzf() {
        return (zztg) zzb.zzq();
    }

    public static /* synthetic */ void zzi(zzth zzth, boolean z3) {
        zzth.zze = 1;
        zzth.zzf = Boolean.valueOf(z3);
    }

    public static /* synthetic */ void zzj(zzth zzth, zzle zzle) {
        zzth.zze = 2;
        zzth.zzf = zzle;
    }

    public static /* synthetic */ void zzk(zzth zzth, String str) {
        str.getClass();
        zzth.zze = 3;
        zzth.zzf = str;
    }

    public static /* synthetic */ void zzl(zzth zzth, double d) {
        zzth.zze = 10;
        zzth.zzf = Double.valueOf(d);
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zzf", "zze"});
        } else if (i5 == 3) {
            return new zzth();
        } else {
            if (i5 == 4) {
                return new zztg((zztj) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzth.class) {
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
