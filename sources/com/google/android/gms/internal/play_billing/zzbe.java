package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.measurement.a;

public final class zzbe {
    public static int zza(int i2, int i5, String str) {
        String str2;
        if (i2 >= 0 && i2 < i5) {
            return i2;
        }
        if (i2 < 0) {
            str2 = zzbf.zza("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        } else if (i5 < 0) {
            throw new IllegalArgumentException(a.f(i5, "negative size: "));
        } else {
            str2 = zzbf.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i5));
        }
        throw new IndexOutOfBoundsException(str2);
    }

    public static int zzb(int i2, int i5, String str) {
        if (i2 >= 0 && i2 <= i5) {
            return i2;
        }
        throw new IndexOutOfBoundsException(zzf(i2, i5, "index"));
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z3, String str, Object obj, Object obj2) {
        if (!z3) {
            throw new IllegalArgumentException(zzbf.zza(str, obj, obj2));
        }
    }

    public static void zze(int i2, int i5, int i6) {
        String str;
        if (i2 < 0 || i5 < i2 || i5 > i6) {
            if (i2 < 0 || i2 > i6) {
                str = zzf(i2, i6, "start index");
            } else if (i5 < 0 || i5 > i6) {
                str = zzf(i5, i6, "end index");
            } else {
                str = zzbf.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    private static String zzf(int i2, int i5, String str) {
        if (i2 < 0) {
            return zzbf.zza("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i5 >= 0) {
            return zzbf.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i5));
        }
        throw new IllegalArgumentException(a.f(i5, "negative size: "));
    }
}
