package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfj extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzfj zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzmj zzg = zzmd.zzcn();
    private boolean zzh;
    private zzfp zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzfj zzfj = new zzfj();
        zzb = zzfj;
        zzmd.zzct(zzfj.class, zzfj);
    }

    private zzfj() {
    }

    public static zzfi zzc() {
        return (zzfi) zzb.zzcg();
    }

    public static /* synthetic */ void zzi(zzfj zzfj, String str) {
        zzfj.zzd |= 2;
        zzfj.zzf = str;
    }

    public static /* synthetic */ void zzj(zzfj zzfj, int i2, zzfl zzfl) {
        zzfl.getClass();
        zzmj zzmj = zzfj.zzg;
        if (!zzmj.zzc()) {
            zzfj.zzg = zzmd.zzco(zzmj);
        }
        zzfj.zzg.set(i2, zzfl);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzfl zze(int i2) {
        return (zzfl) this.zzg.get(i2);
    }

    public final zzfp zzf() {
        zzfp zzfp = this.zzi;
        if (zzfp == null) {
            return zzfp.zzb();
        }
        return zzfp;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzg;
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
            return zzmd.zzcq(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", zzfl.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i5 == 3) {
            return new zzfj();
        } else {
            if (i5 == 4) {
                return new zzfi((zzfw) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }

    public final boolean zzm() {
        return this.zzk;
    }

    public final boolean zzn() {
        return this.zzl;
    }

    public final boolean zzo() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 64) != 0;
    }
}
