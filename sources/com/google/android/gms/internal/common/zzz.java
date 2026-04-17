package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.f;

abstract class zzz extends zzm {
    final CharSequence zzb;
    final zzr zzc;
    final boolean zzd;
    int zze = 0;
    int zzf;

    public zzz(zzaa zzaa, CharSequence charSequence) {
        this.zzc = zzaa.zza;
        this.zzd = zzaa.zzb;
        this.zzf = f.API_PRIORITY_OTHER;
        this.zzb = charSequence;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        int zzd2;
        int i2;
        int i5 = this.zze;
        while (true) {
            int i6 = this.zze;
            if (i6 != -1) {
                zzd2 = zzd(i6);
                if (zzd2 == -1) {
                    zzd2 = this.zzb.length();
                    this.zze = -1;
                    i2 = -1;
                } else {
                    i2 = zzc(zzd2);
                    this.zze = i2;
                }
                if (i2 == i5) {
                    int i7 = i2 + 1;
                    this.zze = i7;
                    if (i7 > this.zzb.length()) {
                        this.zze = -1;
                    }
                } else {
                    if (i5 < zzd2) {
                        this.zzb.charAt(i5);
                    }
                    if (i5 < zzd2) {
                        this.zzb.charAt(zzd2 - 1);
                    }
                    if (!this.zzd || i5 != zzd2) {
                        int i8 = this.zzf;
                    } else {
                        i5 = this.zze;
                    }
                }
            } else {
                zzb();
                return null;
            }
        }
        int i82 = this.zzf;
        if (i82 == 1) {
            zzd2 = this.zzb.length();
            this.zze = -1;
            if (zzd2 > i5) {
                this.zzb.charAt(zzd2 - 1);
            }
        } else {
            this.zzf = i82 - 1;
        }
        return this.zzb.subSequence(i5, zzd2).toString();
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}
