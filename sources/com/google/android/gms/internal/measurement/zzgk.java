package com.google.android.gms.internal.measurement;

public final class zzgk extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzgk zzb;
    private int zzd;
    private String zze = "";
    private zzmj zzf = zzmd.zzcn();
    private boolean zzg;

    static {
        zzgk zzgk = new zzgk();
        zzb = zzgk;
        zzmd.zzct(zzgk.class, zzgk);
    }

    private zzgk() {
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
            return zzmd.zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", zzgu.class, "zzg"});
        } else if (i5 == 3) {
            return new zzgk();
        } else {
            if (i5 == 4) {
                return new zzgj((zzgz) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
