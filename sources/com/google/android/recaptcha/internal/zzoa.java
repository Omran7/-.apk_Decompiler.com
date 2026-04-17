package com.google.android.recaptcha.internal;

final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzmw zza2 = zzmw.zza();
        int i2 = zzos.zza;
        zznz zznz = new zznz(zza2, zza);
        byte[] bArr = zznl.zzb;
        this.zzb = zznz;
    }

    public final zzow zza(Class cls) {
        zzmp zzmp;
        int i2 = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i5 = zzos.zza;
        }
        zzof zzb2 = this.zzb.zzb(cls);
        if (!zzb2.zzb()) {
            int i6 = zzos.zza;
            zzoo zza2 = zzop.zza();
            zznv zza3 = zznw.zza();
            zzpl zzm = zzoy.zzm();
            if (zzb2.zzc() - 1 != 1) {
                zzmp = zzmr.zza();
            } else {
                zzmp = null;
            }
            return zzol.zzm(cls, zzb2, zza2, zza3, zzm, zzmp, zzoe.zza());
        }
        int i7 = zzos.zza;
        return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzb2.zza());
    }
}
