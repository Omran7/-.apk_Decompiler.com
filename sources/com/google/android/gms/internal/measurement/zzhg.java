package com.google.android.gms.internal.measurement;

public final class zzhg extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzhg zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzhg zzhg = new zzhg();
        zzb = zzhg;
        zzmd.zzct(zzhg.class, zzhg);
    }

    private zzhg() {
    }

    public static zzhf zza() {
        return (zzhf) zzb.zzcg();
    }

    public static zzhg zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzhg zzhg, boolean z3) {
        zzhg.zzd |= 32;
        zzhg.zzj = z3;
    }

    public static /* synthetic */ void zze(zzhg zzhg, boolean z3) {
        zzhg.zzd |= 16;
        zzhg.zzi = z3;
    }

    public static /* synthetic */ void zzf(zzhg zzhg, boolean z3) {
        zzhg.zzd |= 1;
        zzhg.zze = z3;
    }

    public static /* synthetic */ void zzg(zzhg zzhg, boolean z3) {
        zzhg.zzd |= 64;
        zzhg.zzk = z3;
    }

    public static /* synthetic */ void zzh(zzhg zzhg, boolean z3) {
        zzhg.zzd |= 2;
        zzhg.zzf = z3;
    }

    public static /* synthetic */ void zzi(zzhg zzhg, boolean z3) {
        zzhg.zzd |= 4;
        zzhg.zzg = z3;
    }

    public static /* synthetic */ void zzj(zzhg zzhg, boolean z3) {
        zzhg.zzd |= 8;
        zzhg.zzh = z3;
    }

    public final boolean zzk() {
        return this.zzj;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i5 == 3) {
            return new zzhg();
        } else {
            if (i5 == 4) {
                return new zzhf((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }

    public final boolean zzm() {
        return this.zzi;
    }

    public final boolean zzn() {
        return this.zze;
    }

    public final boolean zzo() {
        return this.zzk;
    }

    public final boolean zzp() {
        return this.zzf;
    }

    public final boolean zzq() {
        return this.zzg;
    }

    public final boolean zzr() {
        return this.zzh;
    }
}
