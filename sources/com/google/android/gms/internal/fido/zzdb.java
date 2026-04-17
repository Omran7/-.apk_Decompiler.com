package com.google.android.gms.internal.fido;

import com.google.android.gms.common.api.f;

final class zzdb extends zzdd {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze = f.API_PRIORITY_OTHER;

    public /* synthetic */ zzdb(byte[] bArr, int i2, int i5, boolean z3, zzda zzda) {
        super((zzdc) null);
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i2) {
        int i5 = this.zze;
        this.zze = 0;
        int i6 = this.zzc + this.zzd;
        this.zzc = i6;
        if (i6 > 0) {
            this.zzd = i6;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i5;
    }
}
