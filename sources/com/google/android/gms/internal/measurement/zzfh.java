package com.google.android.gms.internal.measurement;

import java.util.List;

public final class zzfh extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzfh zzb;
    private int zzd;
    private int zze;
    private zzmj zzf = zzmd.zzcn();
    private zzmj zzg = zzmd.zzcn();
    private boolean zzh;
    private boolean zzi;

    static {
        zzfh zzfh = new zzfh();
        zzb = zzfh;
        zzmd.zzct(zzfh.class, zzfh);
    }

    private zzfh() {
    }

    public static /* synthetic */ void zzi(zzfh zzfh, int i2, zzfj zzfj) {
        zzfj.getClass();
        zzmj zzmj = zzfh.zzg;
        if (!zzmj.zzc()) {
            zzfh.zzg = zzmd.zzco(zzmj);
        }
        zzfh.zzg.set(i2, zzfj);
    }

    public static /* synthetic */ void zzj(zzfh zzfh, int i2, zzfr zzfr) {
        zzfr.getClass();
        zzmj zzmj = zzfh.zzf;
        if (!zzmj.zzc()) {
            zzfh.zzf = zzmd.zzco(zzmj);
        }
        zzfh.zzf.set(i2, zzfr);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final zzfj zze(int i2) {
        return (zzfj) this.zzg.get(i2);
    }

    public final zzfr zzf(int i2) {
        return (zzfr) this.zzf.get(i2);
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
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
            return zzmd.zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzfr.class, "zzg", zzfj.class, "zzh", "zzi"});
        } else if (i5 == 3) {
            return new zzfh();
        } else {
            if (i5 == 4) {
                return new zzfg((zzfw) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
