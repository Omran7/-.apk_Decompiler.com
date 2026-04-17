package com.google.android.recaptcha.internal;

import java.util.List;

public final class zztz extends zznd implements zzoj {
    /* access modifiers changed from: private */
    public static final zztz zzb;
    private static volatile zzoq zzd;
    private zznk zze = zznd.zzB();

    static {
        zztz zztz = new zztz();
        zzb = zztz;
        zznd.zzI(zztz.class, zztz);
    }

    private zztz() {
    }

    public static zztz zzg(byte[] bArr) {
        return (zztz) zznd.zzx(zzb, bArr);
    }

    public final Object zzh(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzuf.class});
        } else if (i5 == 3) {
            return new zztz();
        } else {
            if (i5 == 4) {
                return new zzty((zzug) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            if (i5 != 6) {
                return null;
            }
            zzoq zzoq = zzd;
            if (zzoq == null) {
                synchronized (zztz.class) {
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
