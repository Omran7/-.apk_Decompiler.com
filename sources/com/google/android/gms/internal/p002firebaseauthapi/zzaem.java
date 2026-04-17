package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaem  reason: invalid package */
public final /* synthetic */ class zzaem {
    public static String zza(zzaej zzaej, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                if (zzg.zza(str2.charAt(i2))) {
                    char[] charArray = str2.toCharArray();
                    while (i2 < length) {
                        char c3 = charArray[i2];
                        if (zzg.zza(c3)) {
                            charArray[i2] = (char) (c3 ^ ' ');
                        }
                        i2++;
                    }
                    return String.valueOf(charArray);
                }
                i2++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzaej.zza.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzaej zzaej, String str) {
        zzaej.zza(str, (Status) null);
    }
}
