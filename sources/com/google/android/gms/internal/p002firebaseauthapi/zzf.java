package com.google.android.gms.internal.p002firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzf  reason: invalid package */
public abstract class zzf {
    public int zza(CharSequence charSequence, int i2) {
        int length = charSequence.length();
        zzw.zza(i2, length, "index");
        while (i2 < length) {
            if (zza(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public abstract boolean zza(char c3);
}
