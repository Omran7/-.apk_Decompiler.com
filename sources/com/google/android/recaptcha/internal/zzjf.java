package com.google.android.recaptcha.internal;

public final class zzjf {
    public static void zza(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z3, String str, char c3) {
        if (!z3) {
            throw new IllegalArgumentException(zzji.zza(str, Character.valueOf(c3)));
        }
    }

    public static void zzd(int i2, int i5, int i6) {
        String str;
        if (i2 < 0 || i5 < i2 || i5 > i6) {
            if (i2 < 0 || i2 > i6) {
                str = zzf(i2, i6, "start index");
            } else if (i5 < 0 || i5 > i6) {
                str = zzf(i5, i6, "end index");
            } else {
                str = zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void zze(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalStateException((String) obj);
        }
    }

    private static String zzf(int i2, int i5, String str) {
        if (i2 < 0) {
            return zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        return zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i5));
    }
}
