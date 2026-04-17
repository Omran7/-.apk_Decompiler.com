package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzhp {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;

    static {
        Charset.forName("US-ASCII");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzgl(bArr, 0, 0, false, (zzgm) null).zza(0);
        } catch (zzhr e6) {
            throw new IllegalArgumentException(e6);
        }
    }

    public static int zza(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int zzb(int i2, byte[] bArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = (i2 * 31) + bArr[i7];
        }
        return i2;
    }

    public static Object zzc(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
