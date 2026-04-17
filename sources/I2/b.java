package I2;

import C2.a;
import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import o3.d;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final SecretKey f1157a;

    public b(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, (char[]) null);
        this.f1157a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException(d.i("Keystore cannot load the key with ID: ", str));
        }
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e6) {
            Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e6);
            try {
                Thread.sleep((long) ((int) (Math.random() * 100.0d)));
            } catch (InterruptedException unused) {
            }
            return d(bArr, bArr2);
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            try {
                return c(bArr, bArr2);
            } catch (AEADBadTagException e6) {
                throw e6;
            } catch (GeneralSecurityException | ProviderException e7) {
                Log.w("b", "encountered a potentially transient KeyStore error, will wait and retry", e7);
                try {
                    Thread.sleep((long) ((int) (Math.random() * 100.0d)));
                } catch (InterruptedException unused) {
                }
                return c(bArr, bArr2);
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
        instance.init(2, this.f1157a, gCMParameterSpec);
        instance.updateAAD(bArr2);
        return instance.doFinal(bArr, 12, bArr.length - 12);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[(bArr.length + 28)];
            Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
            instance.init(1, this.f1157a);
            instance.updateAAD(bArr2);
            instance.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(instance.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
