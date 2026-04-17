package com.google.android.gms.internal.play_billing;

public final class zzkl extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzkl zzb;

    static {
        zzkl zzkl = new zzkl();
        zzb = zzkl;
        zzhk.zzx(zzkl.class, zzkl);
    }

    private zzkl() {
    }

    public static zzkl zzB() {
        return zzb;
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0000", (Object[]) null);
        }
        if (i5 == 3) {
            return new zzkl();
        }
        if (i5 == 4) {
            return new zzkj((zzkk) null);
        }
        if (i5 != 5) {
            return null;
        }
        return zzb;
    }
}
