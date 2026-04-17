package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzqb {
    private static final ThreadLocal zza = new zzqa();

    static {
        zzph zzi = zzpj.zzi();
        zzi.zzf(-62135596800L);
        zzi.zze(0);
        zzpj zzpj = (zzpj) zzi.zzk();
        zzph zzi2 = zzpj.zzi();
        zzi2.zzf(253402300799L);
        zzi2.zze(999999999);
        zzpj zzpj2 = (zzpj) zzi2.zzk();
        zzph zzi3 = zzpj.zzi();
        zzi3.zzf(0);
        zzi3.zze(0);
        zzpj zzpj3 = (zzpj) zzi3.zzk();
        zzd("now");
        zzd("getEpochSecond");
        zzd("getNano");
    }

    public static zzpj zza(zzpj zzpj) {
        long zzg = zzpj.zzg();
        boolean zze = zze(zzg);
        int zzf = zzpj.zzf();
        if (zze && zzf >= 0 && zzf < 1000000000) {
            return zzpj;
        }
        throw new IllegalArgumentException("Timestamp is not valid. See proto definition for valid values. Seconds (" + zzg + ") must be in range [-62,135,596,800, +253,402,300,799]. Nanos (" + zzf + ") must be in range [0, +999,999,999].");
    }

    public static zzpj zzb(long j6) {
        long j7 = j6 / 1000;
        if (zze(j7)) {
            int i2 = (int) ((j6 % 1000) * 1000000);
            if (i2 <= -1000000000 || i2 >= 1000000000) {
                j7 = zzkk.zza(j7, (long) (i2 / 1000000000));
                i2 %= 1000000000;
            }
            if (i2 < 0) {
                i2 += 1000000000;
                j7 = zzkk.zzb(j7, 1);
            }
            zzph zzi = zzpj.zzi();
            zzi.zzf(j7);
            zzi.zze(i2);
            zzpj zzpj = (zzpj) zzi.zzk();
            zza(zzpj);
            return zzpj;
        }
        throw new IllegalArgumentException("Timestamp is not valid. Input seconds is too large. Seconds (" + j7 + ") must be in range [-62,135,596,800, +253,402,300,799]. ");
    }

    public static String zzc(zzpj zzpj) {
        String str;
        zza(zzpj);
        long zzg = zzpj.zzg();
        int zzf = zzpj.zzf();
        StringBuilder sb = new StringBuilder();
        sb.append(((SimpleDateFormat) zza.get()).format(new Date(zzg * 1000)));
        if (zzf != 0) {
            sb.append(".");
            if (zzf % 1000000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$03d", new Object[]{Integer.valueOf(zzf / 1000000)});
            } else if (zzf % 1000 == 0) {
                str = String.format(Locale.ENGLISH, "%1$06d", new Object[]{Integer.valueOf(zzf / 1000)});
            } else {
                str = String.format(Locale.ENGLISH, "%1$09d", new Object[]{Integer.valueOf(zzf)});
            }
            sb.append(str);
        }
        sb.append("Z");
        return sb.toString();
    }

    private static Method zzd(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, (Class[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static boolean zze(long j6) {
        return j6 >= -62135596800L && j6 <= 253402300799L;
    }
}
