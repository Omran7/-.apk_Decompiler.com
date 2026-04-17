package com.google.android.gms.internal.p002firebaseauthapi;

import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznd  reason: invalid package */
public final class zznd implements zzca {
    private static final Object zza = new Object();

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zznd$zza */
    public static final class zza {
        public zza() {
            zznd.zza();
        }
    }

    public zznd() {
        this(new zza());
    }

    public static /* synthetic */ boolean zza() {
        return true;
    }

    public static boolean zzc(String str) {
        synchronized (zza) {
            try {
                String zza2 = zzzz.zza("android-keystore://", str);
                if (zznc.zzb(zza2)) {
                    return false;
                }
                KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build();
                KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                instance.init(build);
                instance.generateKey();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(String str) {
        if (str.toLowerCase(Locale.US).startsWith("android-keystore://")) {
            return true;
        }
        return false;
    }

    private zznd(zza zza2) {
    }

    public final zzbe zza(String str) {
        zzne zzne;
        try {
            synchronized (zza) {
                zzne = new zzne(zzzz.zza("android-keystore://", str));
                byte[] zza2 = zzqg.zza(10);
                byte[] bArr = new byte[0];
                if (!Arrays.equals(zza2, zzne.zza(zzne.zzb(zza2, bArr), bArr))) {
                    throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
                }
            }
            return zzne;
        } catch (IOException e6) {
            throw new GeneralSecurityException(e6);
        } catch (Throwable th) {
            throw th;
        }
    }
}
