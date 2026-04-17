package com.google.android.gms.internal.play_billing;

public final class zzlq extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlq zzb;
    private int zzd;
    private zzki zze;

    static {
        zzlq zzlq = new zzlq();
        zzb = zzlq;
        zzhk.zzx(zzlq.class, zzlq);
    }

    private zzlq() {
    }

    public static /* synthetic */ void zzC(zzlq zzlq, zzki zzki) {
        zzki.getClass();
        zzlq.zze = zzki;
        zzlq.zzd |= 1;
    }

    public static zzlo zzc() {
        return (zzlo) zzb.zzm();
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        } else if (i5 == 3) {
            return new zzlq();
        } else {
            if (i5 == 4) {
                return new zzlo((zzlp) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
