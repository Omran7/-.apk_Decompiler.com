package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzhm extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzhm zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public zzmj zze = zzmd.zzcn();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzhm zzhm = new zzhm();
        zzb = zzhm;
        zzmd.zzct(zzhm.class, zzhm);
    }

    private zzhm() {
    }

    public static zzhl zze() {
        return (zzhl) zzb.zzcg();
    }

    public static /* synthetic */ void zzj(zzhm zzhm, Iterable iterable) {
        zzhm.zzv();
        zzko.zzcc(iterable, zzhm.zze);
    }

    public static /* synthetic */ void zzk(zzhm zzhm, zzhq zzhq) {
        zzhq.getClass();
        zzhm.zzv();
        zzhm.zze.add(zzhq);
    }

    public static /* synthetic */ void zzn(zzhm zzhm, int i2) {
        zzhm.zzv();
        zzhm.zze.remove(i2);
    }

    public static /* synthetic */ void zzo(zzhm zzhm, String str) {
        str.getClass();
        zzhm.zzd |= 1;
        zzhm.zzf = str;
    }

    public static /* synthetic */ void zzp(zzhm zzhm, int i2, zzhq zzhq) {
        zzhq.getClass();
        zzhm.zzv();
        zzhm.zze.set(i2, zzhq);
    }

    public static /* synthetic */ void zzq(zzhm zzhm, long j6) {
        zzhm.zzd |= 4;
        zzhm.zzh = j6;
    }

    public static /* synthetic */ void zzr(zzhm zzhm, long j6) {
        zzhm.zzd |= 2;
        zzhm.zzg = j6;
    }

    private final void zzv() {
        zzmj zzmj = this.zze;
        if (!zzmj.zzc()) {
            this.zze = zzmd.zzco(zzmj);
        }
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final zzhq zzg(int i2) {
        return (zzhq) this.zze.get(i2);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzhq.class, "zzf", "zzg", "zzh", "zzi"});
        } else if (i5 == 3) {
            return new zzhm();
        } else {
            if (i5 == 4) {
                return new zzhl((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}
