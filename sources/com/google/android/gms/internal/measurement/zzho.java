package com.google.android.gms.internal.measurement;

public final class zzho extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzho zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        zzho zzho = new zzho();
        zzb = zzho;
        zzmd.zzct(zzho.class, zzho);
    }

    private zzho() {
    }

    public static zzhn zza() {
        return (zzhn) zzb.zzcg();
    }

    public static /* synthetic */ void zzc(zzho zzho, long j6) {
        zzho.zzd |= 2;
        zzho.zzf = j6;
    }

    public static /* synthetic */ void zzd(zzho zzho, String str) {
        str.getClass();
        zzho.zzd |= 1;
        zzho.zze = str;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i5 == 3) {
            return new zzho();
        } else {
            if (i5 == 4) {
                return new zzhn((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
