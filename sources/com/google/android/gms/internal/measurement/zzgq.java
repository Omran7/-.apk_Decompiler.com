package com.google.android.gms.internal.measurement;

public final class zzgq extends zzmd implements zzni {
    /* access modifiers changed from: private */
    public static final zzgq zzb;
    private zzmj zzd = zzmd.zzcn();

    static {
        zzgq zzgq = new zzgq();
        zzb = zzgq;
        zzmd.zzct(zzgq.class, zzgq);
    }

    private zzgq() {
    }

    public final Object zzl(int i2, Object obj, Object obj2) {
        int i5 = i2 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        } else if (i5 == 3) {
            return new zzgq();
        } else {
            if (i5 == 4) {
                return new zzgp((zzgz) null);
            }
            if (i5 == 5) {
                return zzb;
            }
            throw null;
        }
    }
}
