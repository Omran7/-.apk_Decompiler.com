package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzac  reason: invalid package */
abstract class zzac extends zzd<String> {
    final CharSequence zza;
    private final zzf zzb;
    private final boolean zzc;
    private int zzd = 0;
    private int zze;

    public zzac(zzv zzv, CharSequence charSequence) {
        this.zzb = zzv.zza;
        this.zzc = false;
        this.zze = zzv.zzc;
        this.zza = charSequence;
    }

    public abstract int zza(int i2);

    public final /* synthetic */ Object zza() {
        int i2;
        int i5 = this.zzd;
        while (true) {
            int i6 = this.zzd;
            if (i6 != -1) {
                int zzb2 = zzb(i6);
                if (zzb2 == -1) {
                    zzb2 = this.zza.length();
                    this.zzd = -1;
                } else {
                    this.zzd = zza(zzb2);
                }
                int i7 = this.zzd;
                if (i7 == i5) {
                    int i8 = i7 + 1;
                    this.zzd = i8;
                    if (i8 > this.zza.length()) {
                        this.zzd = -1;
                    }
                } else {
                    while (i5 < zzb2 && this.zzb.zza(this.zza.charAt(i5))) {
                        i5++;
                    }
                    while (i2 > i5 && this.zzb.zza(this.zza.charAt(i2 - 1))) {
                        zzb2 = i2 - 1;
                    }
                    int i9 = this.zze;
                    if (i9 == 1) {
                        i2 = this.zza.length();
                        this.zzd = -1;
                        while (i2 > i5 && this.zzb.zza(this.zza.charAt(i2 - 1))) {
                            i2--;
                        }
                    } else {
                        this.zze = i9 - 1;
                    }
                    return this.zza.subSequence(i5, i2).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzb(int i2);
}
