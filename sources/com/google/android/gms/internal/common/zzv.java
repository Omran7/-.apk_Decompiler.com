package com.google.android.gms.internal.common;

import com.google.android.gms.internal.measurement.a;

public final class zzv {
    public static int zza(int i2, int i5, String str) {
        String str2;
        if (i2 >= 0 && i2 < i5) {
            return i2;
        }
        if (i2 < 0) {
            str2 = zzab.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i5 < 0) {
            throw new IllegalArgumentException(a.f(i5, "negative size: "));
        } else {
            str2 = zzab.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int zzb(int i2, int i5, String str) {
        if (i2 >= 0 && i2 <= i5) {
            return i2;
        }
        throw new IndexOutOfBoundsException(zzd(i2, i5, "index"));
    }

    public static void zzc(int i2, int i5, int i6) {
        String str;
        if (i2 < 0 || i5 < i2 || i5 > i6) {
            if (i2 < 0 || i2 > i6) {
                str = zzd(i2, i6, "start index");
            } else if (i5 < 0 || i5 > i6) {
                str = zzd(i5, i6, "end index");
            } else {
                str = zzab.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    private static String zzd(int i2, int i5, String str) {
        if (i2 < 0) {
            return zzab.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i5 >= 0) {
            return zzab.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(a.f(i5, "negative size: "));
    }
}
