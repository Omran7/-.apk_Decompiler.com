package com.google.android.gms.internal.measurement;

final class zzmz implements zznt {
    private static final zznf zza = new zzmx();
    private final zznf zzb;

    public zzmz() {
        zzly zza2 = zzly.zza();
        int i2 = zznp.zza;
        zzmy zzmy = new zzmy(zza2, zza);
        byte[] bArr = zzmk.zzb;
        this.zzb = zzmy;
    }

    public final zzns zza(Class cls) {
        zzlq zzlq;
        int i2 = zznu.zza;
        if (!zzmd.class.isAssignableFrom(cls)) {
            int i5 = zznp.zza;
        }
        zzne zzb2 = this.zzb.zzb(cls);
        if (!zzb2.zzb()) {
            int i6 = zznp.zza;
            zznm zza2 = zznn.zza();
            zzmu zza3 = zzmv.zza();
            zzoe zzm = zznu.zzm();
            if (zzb2.zzc() - 1 != 1) {
                zzlq = zzls.zza();
            } else {
                zzlq = null;
            }
            return zznk.zzl(cls, zzb2, zza2, zza3, zzm, zzlq, zznd.zza());
        }
        int i7 = zznp.zza;
        return zznl.zzc(zznu.zzm(), zzls.zza(), zzb2.zza());
    }
}
