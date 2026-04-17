package I2;

import P2.o;
import P2.p;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f1158b = new Object();

    /* renamed from: a  reason: collision with root package name */
    public KeyStore f1159a;

    public c() {
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load((KeyStore.LoadStoreParameter) null);
            this.f1159a = instance;
        } catch (IOException | GeneralSecurityException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static boolean a(String str) {
        c cVar = new c();
        synchronized (f1158b) {
            try {
                if (cVar.d(str)) {
                    return false;
                }
                b(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void b(String str) {
        String b6 = p.b(str);
        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        instance.init(new KeyGenParameterSpec.Builder(b6, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
        instance.generateKey();
    }

    public final synchronized b c(String str) {
        b bVar;
        bVar = new b(p.b(str), this.f1159a);
        byte[] a6 = o.a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a6, bVar.b(bVar.a(a6, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    public final synchronized boolean d(String str) {
        String b6;
        b6 = p.b(str);
        try {
        } catch (IOException e6) {
            throw new GeneralSecurityException(e6);
        } catch (NullPointerException unused) {
            Log.w("c", "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                Thread.sleep((long) ((int) (Math.random() * 40.0d)));
            } catch (InterruptedException unused2) {
            }
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            this.f1159a = instance;
            instance.load((KeyStore.LoadStoreParameter) null);
            return this.f1159a.containsAlias(b6);
        }
        return this.f1159a.containsAlias(b6);
    }
}
