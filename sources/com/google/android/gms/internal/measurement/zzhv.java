package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzhv extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzhv zzb;
    private int zzd;
    /* access modifiers changed from: private */
    public zzmj zze = zzmd.zzcn();
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzhv zzhv = new zzhv();
        zzb = zzhv;
        zzmd.zzct(zzhv.class, zzhv);
    }

    private zzhv() {
    }

    public static zzht zzb() {
        return (zzht) zzb.zzcg();
    }

    public static zzht zzc(zzhv zzhv) {
        zzlz zzcg = zzb.zzcg();
        zzcg.zzaY(zzhv);
        return (zzht) zzcg;
    }

    public static /* synthetic */ void zzi(zzhv zzhv, Iterable iterable) {
        zzhv.zzr();
        zzko.zzcc(iterable, zzhv.zze);
    }

    public static /* synthetic */ void zzj(zzhv zzhv, zzhx zzhx) {
        zzhx.getClass();
        zzhv.zzr();
        zzhv.zze.add(zzhx);
    }

    public static /* synthetic */ void zzm(zzhv zzhv, int i2, zzhx zzhx) {
        zzhx.getClass();
        zzhv.zzr();
        zzhv.zze.set(i2, zzhx);
    }

    public static /* synthetic */ void zzn(zzhv zzhv, String str) {
        str.getClass();
        zzhv.zzd |= 1;
        zzhv.zzf = str;
    }

    public static /* synthetic */ void zzo(zzhv zzhv, String str) {
        str.getClass();
        zzhv.zzd |= 2;
        zzhv.zzg = str;
    }

    private final void zzr() {
        zzmj zzmj = this.zze;
        if (!zzmj.zzc()) {
            this.zze = zzmd.zzco(zzmj);
        }
    }

    public final int zza() {
        return this.zze.size();
    }

    public final zzhx zze(int i2) {
        return (zzhx) this.zze.get(i2);
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zze;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzd", "zze", zzhx.class, "zzf", "zzg", "zzh", zzhu.zza});
        } else if (i5 == 3) {
            return new zzhv();
        } else {
            if (i5 == 4) {
                return new zzht((zzip) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 2) != 0;
    }
}
