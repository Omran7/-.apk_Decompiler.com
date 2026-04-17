package com.google.android.gms.internal.p002firebaseauthapi;

import h0.C0552a;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaoe  reason: invalid package */
public final class zzaoe {
    private static final ThreadLocal<SimpleDateFormat> zza = new zzaog();

    static {
        zzani zzani = (zzani) ((zzaky) zzani.zzc().zza(-62135596800L).zza(0).zze());
        zzani zzani2 = (zzani) ((zzaky) zzani.zzc().zza(253402300799L).zza(999999999).zze());
        zzani zzani3 = (zzani) ((zzaky) zzani.zzc().zza(0).zza(0).zze());
        zzc("now");
        zzc("getEpochSecond");
        zzc("getNano");
    }

    private static boolean zza(long j6) {
        return j6 >= -62135596800L && j6 <= 253402300799L;
    }

    private static long zzb(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return ((Long.parseLong(str.substring(0, indexOf)) * 60) + Long.parseLong(str.substring(indexOf + 1))) * 60;
            } catch (NumberFormatException e6) {
                ParseException parseException = new ParseException("Invalid offset value: ".concat(str), 0);
                parseException.initCause(e6);
                throw parseException;
            }
        } else {
            throw new ParseException("Invalid offset value: ".concat(str), 0);
        }
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, (Class[]) null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long zza(zzani zzani) {
        return zzb(zzani).zzb();
    }

    public static zzani zza(String str) {
        String str2;
        int i2;
        int indexOf = str.indexOf(84);
        if (indexOf != -1) {
            int indexOf2 = str.indexOf(90, indexOf);
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(43, indexOf);
            }
            if (indexOf2 == -1) {
                indexOf2 = str.indexOf(45, indexOf);
            }
            if (indexOf2 != -1) {
                String substring = str.substring(0, indexOf2);
                int indexOf3 = substring.indexOf(46);
                if (indexOf3 != -1) {
                    String substring2 = substring.substring(0, indexOf3);
                    str2 = substring.substring(indexOf3 + 1);
                    substring = substring2;
                } else {
                    str2 = "";
                }
                long time = zza.get().parse(substring).getTime() / 1000;
                if (str2.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (int i5 = 0; i5 < 9; i5++) {
                        i2 *= 10;
                        if (i5 < str2.length()) {
                            if (str2.charAt(i5) < '0' || str2.charAt(i5) > '9') {
                                throw new ParseException("Invalid nanoseconds.", 0);
                            }
                            i2 = (str2.charAt(i5) - '0') + i2;
                        }
                    }
                }
                if (str.charAt(indexOf2) != 'Z') {
                    long zzb = zzb(str.substring(indexOf2 + 1));
                    time = str.charAt(indexOf2) == '+' ? time - zzb : time + zzb;
                } else if (str.length() != indexOf2 + 1) {
                    throw new ParseException(C0552a.o("Failed to parse timestamp: invalid trailing data \"", str.substring(indexOf2), "\""), 0);
                }
                try {
                    if (zza(time)) {
                        if (i2 <= -1000000000 || i2 >= 1000000000) {
                            time = zzbc.zza(time, (long) (i2 / 1000000000));
                            i2 %= 1000000000;
                        }
                        if (i2 < 0) {
                            i2 += 1000000000;
                            time = zzbc.zzb(time, 1);
                        }
                        return zzb((zzani) ((zzaky) zzani.zzc().zza(time).zza(i2).zze()));
                    }
                    throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(time)));
                } catch (IllegalArgumentException e6) {
                    ParseException parseException = new ParseException(C0552a.o("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
                    parseException.initCause(e6);
                    throw parseException;
                }
            } else {
                throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
            }
        } else {
            throw new ParseException(C0552a.o("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
        }
    }

    private static zzani zzb(zzani zzani) {
        long zzb = zzani.zzb();
        int zza2 = zzani.zza();
        if (zza(zzb) && zza2 >= 0 && zza2 < 1000000000) {
            return zzani;
        }
        throw new IllegalArgumentException(zzae.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(zzb), Integer.valueOf(zza2)));
    }

    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}
