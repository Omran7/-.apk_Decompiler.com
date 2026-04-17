package com.google.android.gms.internal.play_billing;

public final class zzln extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzln zzb;
    private int zzd;
    private zzho zze = zzhk.zzs();
    private int zzf;
    private String zzg = "";

    static {
        zzln zzln = new zzln();
        zzb = zzln;
        zzhk.zzx(zzln.class, zzln);
    }

    private zzln() {
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i5 == 3) {
            return new zzln();
        } else {
            if (i5 == 4) {
                return new zzll((zzlm) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
