package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzr  reason: invalid package */
public final class zzzr {
    public static String zza(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b6 : bArr) {
            byte b7 = b6 & 255;
            sb.append("0123456789abcdef".charAt(b7 / 16));
            sb.append("0123456789abcdef".charAt(b7 % 16));
        }
        return sb.toString();
    }

    public static byte[] zza(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i5 = i2 * 2;
                int digit = Character.digit(str.charAt(i5), 16);
                int digit2 = Character.digit(str.charAt(i5 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[i2] = (byte) ((digit << 4) + digit2);
            }
            return bArr;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
}
