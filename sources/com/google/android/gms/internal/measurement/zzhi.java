package com.google.android.gms.internal.measurement;

public final class zzhi extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzhi zzb;
    private int zzd;
    private int zze;
    private zzic zzf;
    private zzic zzg;
    private boolean zzh;

    static {
        zzhi zzhi = new zzhi();
        zzb = zzhi;
        zzmd.zzct(zzhi.class, zzhi);
    }

    private zzhi() {
    }

    public static zzhh zzb() {
        return (zzhh) zzb.zzcg();
    }

    public static /* synthetic */ void zzf(zzhi zzhi, int i2) {
        zzhi.zzd |= 1;
        zzhi.zze = i2;
    }

    public static /* synthetic */ void zzg(zzhi zzhi, zzic zzic) {
        zzic.getClass();
        zzhi.zzf = zzic;
        zzhi.zzd |= 2;
    }

    public static /* synthetic */ void zzh(zzhi zzhi, boolean z3) {
        zzhi.zzd |= 8;
        zzhi.zzh = z3;
    }

    public static /* synthetic */ void zzi(zzhi zzhi, zzic zzic) {
        zzhi.zzg = zzic;
        zzhi.zzd |= 4;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzic zzd() {
        zzic zzic = this.zzf;
        if (zzic == null) {
            return zzic.zzg();
        }
        return zzic;
    }

    public final zzic zze() {
        zzic zzic = this.zzg;
        if (zzic == null) {
            return zzic.zzg();
        }
        return zzic;
    }

    public final boolean zzj() {
        return this.zzh;
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
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i5 == 3) {
            return new zzhi();
        } else {
            if (i5 == 4) {
                return new zzhh((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }

    public final boolean zzm() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zzd & 4) != 0;
    }
}
