package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznh  reason: invalid package */
public final class zznh {
    public static BigInteger zza(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] zza(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] zza(BigInteger bigInteger, int i2) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length == i2) {
                return byteArray;
            }
            int i5 = i2 + 1;
            if (byteArray.length > i5) {
                throw new GeneralSecurityException("integer too large");
            } else if (byteArray.length != i5) {
                byte[] bArr = new byte[i2];
                System.arraycopy(byteArray, 0, bArr, i2 - byteArray.length, byteArray.length);
                return bArr;
            } else if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        } else {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
    }
}
