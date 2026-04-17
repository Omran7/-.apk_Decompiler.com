package com.google.android.gms.internal.measurement;

public final class zzfr extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzfr zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzfl zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzfr zzfr = new zzfr();
        zzb = zzfr;
        zzmd.zzct(zzfr.class, zzfr);
    }

    private zzfr() {
    }

    public static zzfq zzc() {
        return (zzfq) zzb.zzcg();
    }

    public static /* synthetic */ void zzf(zzfr zzfr, String str) {
        zzfr.zzd |= 2;
        zzfr.zzf = str;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfl zzb() {
        zzfl zzfl = this.zzg;
        if (zzfl == null) {
            return zzfl.zzb();
        }
        return zzfl;
    }

    public final String zze() {
        return this.zzf;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 32) != 0;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i5 == 3) {
            return new zzfr();
        } else {
            if (i5 == 4) {
                return new zzfq((zzfw) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
