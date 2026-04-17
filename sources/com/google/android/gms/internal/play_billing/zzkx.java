package com.google.android.gms.internal.play_billing;

public final class zzkx extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzkx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        zzkx zzkx = new zzkx();
        zzb = zzkx;
        zzhk.zzx(zzkx.class, zzkx);
    }

    private zzkx() {
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i5 == 3) {
            return new zzkx();
        } else {
            if (i5 == 4) {
                return new zzkv((zzkw) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
