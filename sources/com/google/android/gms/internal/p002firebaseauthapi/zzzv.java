package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzix;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzv  reason: invalid package */
public final class zzzv implements zzso {
    private static final zzix.zza zza = zzix.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private final ThreadLocal<Mac> zzb;
    /* access modifiers changed from: private */
    public final String zzc;
    /* access modifiers changed from: private */
    public final Key zzd;
    private final int zze;

    public zzzv(String str, Key key) {
        zzzy zzzy = new zzzy(this);
        this.zzb = zzzy;
        if (zza.zza()) {
            this.zzc = str;
            this.zzd = key;
            if (key.getEncoded().length >= 16) {
                str.getClass();
                char c3 = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c3 = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c3 = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c3 = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c3 = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c3 = 4;
                            break;
                        }
                        break;
                }
                switch (c3) {
                    case 0:
                        this.zze = 20;
                        break;
                    case 1:
                        this.zze = 28;
                        break;
                    case 2:
                        this.zze = 32;
                        break;
                    case 3:
                        this.zze = 48;
                        break;
                    case 4:
                        this.zze = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
                }
                zzzy.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    public final byte[] zza(byte[] bArr, int i2) {
        if (i2 <= this.zze) {
            this.zzb.get().update(bArr);
            return Arrays.copyOf(this.zzb.get().doFinal(), i2);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
