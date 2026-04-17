package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzrt extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zzrt zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    static {
        zzrt zzrt = new zzrt();
        zzb = zzrt;
        zznd.zzI(zzrt.class, zzrt);
    }

    private zzrt() {
    }

    public static zzrt zzg() {
        return zzb;
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zze"});
        } else if (i5 == 3) {
            return new zzrt();
        } else {
            if (i5 == 4) {
                return new zzrs((zzrw) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zzrt.class) {
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

    public final List zzi() {
        return this.zze;
    }
}
