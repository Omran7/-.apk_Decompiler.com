package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.f;

final class zzgl extends zzgn {
    private int zzb = 0;
    private int zzc;
    private int zzd = f.API_PRIORITY_OTHER;

    public /* synthetic */ zzgl(byte[] bArr, int i2, int i5, boolean z3, zzgm zzgm) {
        super((zzgm) null);
    }

    public final int zza(int i2) {
        int i5 = this.zzd;
        this.zzd = 0;
        int i6 = this.zzb + this.zzc;
        this.zzb = i6;
        if (i6 > 0) {
            this.zzc = i6;
            this.zzb = 0;
        } else {
            this.zzc = 0;
        }
        return i5;
    }
}
