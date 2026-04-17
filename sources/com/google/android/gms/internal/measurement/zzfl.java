package com.google.android.gms.internal.measurement;

public final class zzfl extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzfl zzb;
    private int zzd;
    private zzfv zze;
    private zzfp zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        zzfl zzfl = new zzfl();
        zzb = zzfl;
        zzmd.zzct(zzfl.class, zzfl);
    }

    private zzfl() {
    }

    public static zzfl zzb() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzfl zzfl, String str) {
        zzfl.zzd |= 8;
        zzfl.zzh = str;
    }

    public final zzfp zzc() {
        zzfp zzfp = this.zzf;
        if (zzfp == null) {
            return zzfp.zzb();
        }
        return zzfp;
    }

    public final zzfv zzd() {
        zzfv zzfv = this.zze;
        if (zzfv == null) {
            return zzfv.zzc();
        }
        return zzfv;
    }

    public final String zze() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i5 == 3) {
            return new zzfl();
        } else {
            if (i5 == 4) {
                return new zzfk((zzfw) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
