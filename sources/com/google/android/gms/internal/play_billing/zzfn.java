package com.google.android.gms.internal.play_billing;

public final class zzfn extends zzhk implements zzin {
    /* access modifiers changed from: private */
    public static final zzfn zzb;
    private zzho zzd = zzhk.zzs();

    static {
        zzfn zzfn = new zzfn();
        zzb = zzfn;
        zzhk.zzx(zzfn.class, zzfn);
    }

    private zzfn() {
    }

    public static zzfm zza() {
        return (zzfm) zzb.zzm();
    }

    public static /* synthetic */ void zzc(zzfn zzfn, Iterable iterable) {
        zzho zzho = zzfn.zzd;
        if (!zzho.zzc()) {
            int size = zzho.size();
            zzfn.zzd = zzho.zzd(size + size);
        }
        zzfv.zzg(iterable, zzfn.zzd);
    }

    public final Object zzd(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzhk.zzu(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfl.class});
        } else if (i5 == 3) {
            return new zzfn();
        } else {
            if (i5 == 4) {
                return new zzfm((zzfo) null);
            }
            if (i5 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
