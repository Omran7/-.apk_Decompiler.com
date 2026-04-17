package com.google.android.gms.internal.measurement;

public final class zzgh extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzgh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzgh zzgh = new zzgh();
        zzb = zzgh;
        zzmd.zzct(zzgh.class, zzgh);
    }

    private zzgh() {
    }

    public final String zzb() {
        return this.zze;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i5 == 3) {
            return new zzgh();
        } else {
            if (i5 == 4) {
                return new zzgg((zzgz) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
