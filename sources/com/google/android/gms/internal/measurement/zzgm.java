package com.google.android.gms.internal.measurement;

public final class zzgm extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzgm zzb;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzgm zzgm = new zzgm();
        zzb = zzgm;
        zzmd.zzct(zzgm.class, zzgm);
    }

    private zzgm() {
    }

    public static /* synthetic */ void zzd(zzgm zzgm, String str) {
        str.getClass();
        zzgm.zzd |= 1;
        zzgm.zze = str;
    }

    public final int zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 8) != 0;
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i5 == 3) {
            return new zzgm();
        } else {
            if (i5 == 4) {
                return new zzgl((zzgz) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
