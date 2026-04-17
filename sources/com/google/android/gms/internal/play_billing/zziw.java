package com.google.android.gms.internal.play_billing;

final class zziw implements zzij {
    private final zzim zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zziw(zzim zzim, String str, Object[] objArr) {
        this.zza = zzim;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c3 = charAt & 8191;
        int i2 = 1;
        int i5 = 13;
        while (true) {
            int i6 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c3 |= (charAt2 & 8191) << i5;
                i5 += 13;
                i2 = i6;
            } else {
                this.zzd = c3 | (charAt2 << i5);
                return;
            }
        }
    }

    public final zzim zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final int zzc() {
        int i2 = this.zzd;
        if ((i2 & 1) != 0) {
            return 1;
        }
        return (i2 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
