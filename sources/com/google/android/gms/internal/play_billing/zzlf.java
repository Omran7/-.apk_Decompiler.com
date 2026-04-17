package com.google.android.gms.internal.play_billing;

public final class zzlf extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzlf zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        zzlf zzlf = new zzlf();
        zzb = zzlf;
        zzhk.zzx(zzlf.class, zzlf);
    }

    private zzlf() {
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", zzle.zza, "zzf"});
        } else if (i5 == 3) {
            return new zzlf();
        } else {
            if (i5 == 4) {
                return new zzld((zzlg) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
