package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzw  reason: invalid package */
public final class zzw {
    public static int zza(int i2, int i5) {
        String str;
        if (i2 >= 0 && i2 < i5) {
            return i2;
        }
        if (i2 < 0) {
            str = zzae.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i5 < 0) {
            throw new IllegalArgumentException(a.f(i5, "negative size: "));
        } else {
            str = zzae.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static int zzb(int i2, int i5) {
        if (i2 >= 0 && i2 <= i5) {
            return i2;
        }
        throw new IndexOutOfBoundsException(zzb(i2, i5, "index"));
    }

    private static String zzb(int i2, int i5, String str) {
        if (i2 < 0) {
            return zzae.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i5 >= 0) {
            return zzae.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(a.f(i5, "negative size: "));
    }

    public static int zza(int i2, int i5, String str) {
        if (i2 >= 0 && i2 <= i5) {
            return i2;
        }
        throw new IndexOutOfBoundsException(zzb(i2, i5, str));
    }

    public static <T> T zza(T t6) {
        t6.getClass();
        return t6;
    }

    public static void zza(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(zzr.zza(obj));
        }
    }

    public static void zza(int i2, int i5, int i6) {
        String str;
        if (i2 < 0 || i5 < i2 || i5 > i6) {
            if (i2 < 0 || i2 > i6) {
                str = zzb(i2, i6, "start index");
            } else if (i5 < 0 || i5 > i6) {
                str = zzb(i5, i6, "end index");
            } else {
                str = zzae.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }
}
