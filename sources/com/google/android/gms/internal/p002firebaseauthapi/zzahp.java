package com.google.android.gms.internal.p002firebaseauthapi;

import android.util.Base64;
import com.google.android.gms.common.internal.I;
import java.io.UnsupportedEncodingException;
import java.util.List;
import o3.d;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahp  reason: invalid package */
public final class zzahp {
    public static long zza(String str) {
        zzaho zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzaho zzb(String str) {
        byte[] bArr;
        I.d(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            String str2 = zza.get(1);
            try {
                if (str2 == null) {
                    bArr = null;
                } else {
                    bArr = Base64.decode(str2, 11);
                }
                return zzaho.zza(new String(bArr, "UTF-8"));
            } catch (UnsupportedEncodingException e6) {
                throw new RuntimeException("Unable to decode token", e6);
            }
        } else {
            throw new RuntimeException(d.i("Invalid idToken ", str));
        }
    }
}
