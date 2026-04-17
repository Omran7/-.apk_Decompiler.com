package com.google.android.gms.internal.auth;

final class zzgg implements zzft {
    private final zzfw zza;
    private final String zzb = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a";
    private final Object[] zzc;
    private final int zzd;

    public zzgg(zzfw zzfw, String str, Object[] objArr) {
        this.zza = zzfw;
        this.zzc = objArr;
        char charAt = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c3 = charAt & 8191;
        int i2 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char charAt2 = "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a".charAt(i5);
            if (charAt2 >= 55296) {
                c3 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i5 = i6;
            } else {
                this.zzd = (charAt2 << i2) | c3;
                return;
            }
        }
    }

    public final zzfw zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    public final int zzc() {
        return (this.zzd & 1) == 1 ? 1 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
