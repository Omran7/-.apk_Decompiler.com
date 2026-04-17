package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmu  reason: invalid package */
public final class zzmu implements zzms {
    private static final byte[] zza = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] zzb = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    private final Provider zzc;

    private zzmu(Provider provider) {
        this.zzc = provider;
    }

    public static zzms zzb() {
        Provider zza2 = zzng.zza();
        if (zza2 != null) {
            KeyFactory.getInstance("XDH", zza2);
            KeyAgreement.getInstance("XDH", zza2);
            zzmu zzmu = new zzmu(zza2);
            zzmu.zza();
            return zzmu;
        }
        throw new GeneralSecurityException("Conscrypt is not available.");
    }

    public final zzmv zza() {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("XDH", this.zzc);
        instance.initialize(255);
        KeyPair generateKeyPair = instance.generateKeyPair();
        byte[] encoded = generateKeyPair.getPrivate().getEncoded();
        int length = encoded.length;
        byte[] bArr = zza;
        if (length != bArr.length + 32) {
            throw new GeneralSecurityException("Invalid encoded private key length");
        } else if (zzqq.zza(bArr, encoded)) {
            byte[] copyOfRange = Arrays.copyOfRange(encoded, bArr.length, encoded.length);
            byte[] encoded2 = generateKeyPair.getPublic().getEncoded();
            int length2 = encoded2.length;
            byte[] bArr2 = zzb;
            if (length2 != bArr2.length + 32) {
                throw new GeneralSecurityException("Invalid encoded public key length");
            } else if (zzqq.zza(bArr2, encoded2)) {
                return new zzmv(copyOfRange, Arrays.copyOfRange(encoded2, bArr2.length, encoded2.length));
            } else {
                throw new GeneralSecurityException("Invalid encoded public key prefix");
            }
        } else {
            throw new GeneralSecurityException("Invalid encoded private key prefix");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        KeyFactory instance = KeyFactory.getInstance("XDH", this.zzc);
        if (bArr.length == 32) {
            PrivateKey generatePrivate = instance.generatePrivate(new PKCS8EncodedKeySpec(zzyt.zza(zza, bArr)));
            if (bArr2.length == 32) {
                PublicKey generatePublic = instance.generatePublic(new X509EncodedKeySpec(zzyt.zza(zzb, bArr2)));
                KeyAgreement instance2 = KeyAgreement.getInstance("XDH", this.zzc);
                instance2.init(generatePrivate);
                instance2.doPhase(generatePublic, true);
                return instance2.generateSecret();
            }
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        throw new InvalidKeyException("Invalid X25519 private key");
    }
}
