package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import javax.crypto.BadPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzne  reason: invalid package */
public final class zzne implements zzbe {
    private static final String zza = "zzne";
    private final zzbe zzb;

    public zzne(String str) {
        this.zzb = zznc.zza(str);
    }

    private static void zza() {
        try {
            Thread.sleep((long) ((int) (Math.random() * 100.0d)));
        } catch (InterruptedException unused) {
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        try {
            return this.zzb.zzb(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e6) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e6);
            zza();
            return this.zzb.zzb(bArr, bArr2);
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        try {
            return this.zzb.zza(bArr, bArr2);
        } catch (BadPaddingException e6) {
            throw e6;
        } catch (GeneralSecurityException | ProviderException e7) {
            Log.w(zza, "encountered a potentially transient KeyStore error, will wait and retry", e7);
            zza();
            return this.zzb.zza(bArr, bArr2);
        }
    }
}
