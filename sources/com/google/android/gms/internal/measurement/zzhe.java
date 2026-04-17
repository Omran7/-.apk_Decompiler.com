package com.google.android.gms.internal.measurement;

public final class zzhe extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzhe zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzhe zzhe = new zzhe();
        zzb = zzhe;
        zzmd.zzct(zzhe.class, zzhe);
    }

    private zzhe() {
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i5 == 3) {
            return new zzhe();
        } else {
            if (i5 == 4) {
                return new zzhd((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
