package com.google.android.gms.internal.common;

final class zzw extends zzz {
    final /* synthetic */ zzr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzw(zzx zzx, zzaa zzaa, CharSequence charSequence, zzr zzr) {
        super(zzaa, charSequence);
        this.zza = zzr;
    }

    public final int zzc(int i2) {
        return i2 + 1;
    }

    public final int zzd(int i2) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzv.zzb(i2, length, "index");
        while (i2 < length) {
            if (this.zza.zza(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }
}
