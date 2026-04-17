package com.google.android.recaptcha.internal;

import java.security.MessageDigest;
import java.util.Arrays;

final class zzka extends zzjr {
    private final MessageDigest zza;
    private final int zzb;
    private boolean zzc;

    public /* synthetic */ zzka(MessageDigest messageDigest, int i2, zzkb zzkb) {
        this.zza = messageDigest;
        this.zzb = i2;
    }

    private final void zzc() {
        zzjf.zze(!this.zzc, "Cannot re-use a Hasher after calling hash() on it");
    }

    public final void zza(byte[] bArr, int i2, int i5) {
        zzc();
        this.zza.update(bArr, 0, i5);
    }

    public final zzjv zzb() {
        zzc();
        this.zzc = true;
        int i2 = this.zzb;
        if (i2 == this.zza.getDigestLength()) {
            byte[] digest = this.zza.digest();
            int i5 = zzjv.zzb;
            return new zzju(digest);
        }
        byte[] copyOf = Arrays.copyOf(this.zza.digest(), i2);
        int i6 = zzjv.zzb;
        return new zzju(copyOf);
    }
}
