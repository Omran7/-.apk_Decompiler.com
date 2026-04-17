package com.google.android.recaptcha.internal;

public final class zzpz {
    static {
        zzmj zzi = zzml.zzi();
        zzi.zzf(-315576000000L);
        zzi.zze(-999999999);
        zzml zzml = (zzml) zzi.zzk();
        zzmj zzi2 = zzml.zzi();
        zzi2.zzf(315576000000L);
        zzi2.zze(999999999);
        zzml zzml2 = (zzml) zzi2.zzk();
        zzmj zzi3 = zzml.zzi();
        zzi3.zzf(0);
        zzi3.zze(0);
        zzml zzml3 = (zzml) zzi3.zzk();
    }

    public static zzml zza(long j6) {
        int i2;
        int i5 = (int) (j6 % 1000000000);
        long j7 = j6 / 1000000000;
        if (i5 <= -1000000000 || i5 >= 1000000000) {
            j7 = zzkk.zza(j7, (long) (i5 / 1000000000));
            i5 %= 1000000000;
        }
        if (j7 > 0 && i5 < 0) {
            i5 += 1000000000;
            j7--;
        }
        if (j7 < 0 && i5 > 0) {
            i5 -= 1000000000;
            j7++;
        }
        zzmj zzi = zzml.zzi();
        zzi.zzf(j7);
        zzi.zze(i5);
        zzml zzml = (zzml) zzi.zzk();
        long zzg = zzml.zzg();
        int zzf = zzml.zzf();
        if (zzg >= -315576000000L && zzg <= 315576000000L && ((long) zzf) >= -999999999 && zzf < 1000000000 && ((zzg >= 0 && zzf >= 0) || (i2 <= 0 && zzf <= 0))) {
            return zzml;
        }
        throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + zzf + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
    }
}
