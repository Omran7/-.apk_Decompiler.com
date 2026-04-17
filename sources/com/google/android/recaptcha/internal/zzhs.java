package com.google.android.recaptcha.internal;

public final class zzhs implements zzgx {
    public static final zzhs zza = new zzhs();

    private zzhs() {
    }

    public final void zza(int i2, zzgd zzgd, zzue... zzueArr) {
        int length = zzueArr.length;
        if (length == 2) {
            Object zza2 = zzgd.zzc().zza(zzueArr[0]);
            if (true != (zza2 instanceof String)) {
                zza2 = null;
            }
            String str = (String) zza2;
            if (str != null) {
                Object zza3 = zzgd.zzc().zza(zzueArr[1]);
                if (true != (zza3 instanceof zzbn)) {
                    zza3 = null;
                }
                zzbn zzbn = (zzbn) zza3;
                if (zzbn != null) {
                    byte[] zzd = zzev.zza(zzgd.zzb(), zzbn).zzd();
                    zzgd.zzi().zzb(str, zzkh.zzh().zzi(zzd, 0, zzd.length));
                    return;
                }
                throw new zzce(4, 5, (Throwable) null);
            }
            throw new zzce(4, 5, (Throwable) null);
        } else if (length == 0) {
            zzgd.zzc().zze(i2, new zzbn());
        } else {
            throw new zzce(4, 3, (Throwable) null);
        }
    }
}
