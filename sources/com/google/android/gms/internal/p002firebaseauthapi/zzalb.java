package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzalb  reason: invalid package */
public final class zzalb {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        zzakb.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j6) {
        return (int) (j6 ^ (j6 >>> 32));
    }

    public static int zza(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public static int zza(int i2, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    public static <T> T zza(T t6) {
        t6.getClass();
        return t6;
    }

    public static <T> T zza(T t6, String str) {
        if (t6 != null) {
            return t6;
        }
        throw new NullPointerException(str);
    }

    public static boolean zza(zzamc zzamc) {
        boolean z3 = zzamc instanceof zzajh;
        return false;
    }
}
