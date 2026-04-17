package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamt  reason: invalid package */
final class zzamt implements zzama {
    private final zzamc zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zzamt(zzamc zzamc, String str, Object[] objArr) {
        this.zza = zzamc;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        char c3 = charAt & 8191;
        int i2 = 13;
        int i5 = 1;
        while (true) {
            int i6 = i5 + 1;
            char charAt2 = str.charAt(i5);
            if (charAt2 >= 55296) {
                c3 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i5 = i6;
            } else {
                this.zzd = c3 | (charAt2 << i2);
                return;
            }
        }
    }

    public final zzamc zza() {
        return this.zza;
    }

    public final zzamo zzb() {
        int i2 = this.zzd;
        if ((i2 & 1) != 0) {
            return zzamo.PROTO2;
        }
        if ((i2 & 4) == 4) {
            return zzamo.EDITIONS;
        }
        return zzamo.PROTO3;
    }

    public final boolean zzc() {
        if ((this.zzd & 2) == 2) {
            return true;
        }
        return false;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
