package com.google.android.recaptcha.internal;

public final class zzts extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzts zzb;
    private static volatile zzoq zzd;
    private int zze;

    static {
        zzts zzts = new zzts();
        zzb = zzts;
        zznd.zzI(zzts.class, zzts);
    }

    private zzts() {
    }

    public static zzts zzg(byte[] bArr) {
        return (zzts) zznd.zzx(zzb, bArr);
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        } else if (i5 == 3) {
            return new zzts();
        } else {
            if (i5 == 4) {
                return new zztr((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzts.class) {
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

    public final zztv zzi() {
        zztv zzb2 = zztv.zzb(this.zze);
        return zzb2 == null ? zztv.UNRECOGNIZED : zzb2;
    }
}
