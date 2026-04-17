package com.google.android.gms.internal.measurement;

import java.util.List;

final class zznu {
    public static final /* synthetic */ int zza = 0;
    private static final zzoe zzb = new zzog();

    static {
        int i2 = zznp.zza;
    }

    public static void zzA(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzC(i2, list, z3);
        }
    }

    public static void zzB(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzE(i2, list, z3);
        }
    }

    public static void zzC(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzJ(i2, list, z3);
        }
    }

    public static void zzD(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzL(i2, list, z3);
        }
    }

    public static boolean zzE(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int zza(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzlk.zzA((long) zzme.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzlk.zzA((long) ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzb(int i2, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzz(i2 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i2, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzlk.zzz(i2 << 3) + 8) * size;
    }

    public static int zze(List list) {
        return list.size() * 8;
    }

    public static int zzf(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzlk.zzA((long) zzme.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzlk.zzA((long) ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzg(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzlk.zzA(zzmw.zza(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzlk.zzA(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzh(int i2, Object obj, zzns zzns) {
        int i5 = i2 << 3;
        if (obj instanceof zzms) {
            int zzz = zzlk.zzz(i5);
            int zza2 = ((zzms) obj).zza();
            return a.a(zza2, zza2, zzz);
        }
        return zzlk.zzx((zznh) obj, zzns) + zzlk.zzz(i5);
    }

    public static int zzi(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            i2 = 0;
            while (i5 < size) {
                int zze = zzme.zze(i5);
                i2 += zzlk.zzz((zze >> 31) ^ (zze + zze));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i6 = i2 + zzlk.zzz((intValue >> 31) ^ (intValue + intValue));
                i5++;
            }
        }
        return i2;
    }

    public static int zzj(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            i2 = 0;
            while (i5 < size) {
                long zza2 = zzmw.zza(i5);
                i2 += zzlk.zzA((zza2 >> 63) ^ (zza2 + zza2));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i6 = i2 + zzlk.zzA((longValue >> 63) ^ (longValue + longValue));
                i5++;
            }
        }
        return i2;
    }

    public static int zzk(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzme) {
            zzme zzme = (zzme) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzlk.zzz(zzme.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzlk.zzz(((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzl(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzmw) {
            zzmw zzmw = (zzmw) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzlk.zzA(zzmw.zza(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzlk.zzA(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static zzoe zzm() {
        return zzb;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object zzn(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.measurement.zzoe r6) {
        /*
            if (r5 != 0) goto L_0x0012
            com.google.android.gms.internal.measurement.zzmd r2 = (com.google.android.gms.internal.measurement.zzmd) r2
            com.google.android.gms.internal.measurement.zzof r5 = r2.zzc
            com.google.android.gms.internal.measurement.zzof r6 = com.google.android.gms.internal.measurement.zzof.zzc()
            if (r5 != r6) goto L_0x0012
            com.google.android.gms.internal.measurement.zzof r5 = com.google.android.gms.internal.measurement.zzof.zzf()
            r2.zzc = r5
        L_0x0012:
            long r0 = (long) r4
            int r2 = r3 << 3
            r3 = r5
            com.google.android.gms.internal.measurement.zzof r3 = (com.google.android.gms.internal.measurement.zzof) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.zzj(r2, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznu.zzn(java.lang.Object, int, int, java.lang.Object, com.google.android.gms.internal.measurement.zzoe):java.lang.Object");
    }

    public static void zzo(zzlq zzlq, Object obj, Object obj2) {
        if (!((zzma) obj2).zzb.zza.isEmpty()) {
            zzma zzma = (zzma) obj;
            throw null;
        }
    }

    public static void zzp(zzoe zzoe, Object obj, Object obj2) {
        zzmd zzmd = (zzmd) obj;
        zzof zzof = zzmd.zzc;
        zzof zzof2 = ((zzmd) obj2).zzc;
        if (!zzof.zzc().equals(zzof2)) {
            if (zzof.zzc().equals(zzof)) {
                zzof = zzof.zze(zzof, zzof2);
            } else {
                zzof.zzd(zzof2);
            }
        }
        zzmd.zzc = zzof;
    }

    public static void zzq(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzc(i2, list, z3);
        }
    }

    public static void zzr(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzg(i2, list, z3);
        }
    }

    public static void zzs(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzj(i2, list, z3);
        }
    }

    public static void zzt(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzl(i2, list, z3);
        }
    }

    public static void zzu(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzn(i2, list, z3);
        }
    }

    public static void zzv(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzp(i2, list, z3);
        }
    }

    public static void zzw(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzs(i2, list, z3);
        }
    }

    public static void zzx(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzu(i2, list, z3);
        }
    }

    public static void zzy(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzy(i2, list, z3);
        }
    }

    public static void zzz(int i2, List list, zzor zzor, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzor.zzA(i2, list, z3);
        }
    }
}
