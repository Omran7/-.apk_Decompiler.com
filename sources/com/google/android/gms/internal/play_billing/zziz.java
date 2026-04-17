package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.measurement.a;
import java.util.List;

final class zziz {
    public static final /* synthetic */ int zza = 0;
    private static final zzjj zzb = new zzjl();

    static {
        int i2 = zziu.zza;
    }

    public static void zzA(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzC(i2, list, z3);
        }
    }

    public static void zzB(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzE(i2, list, z3);
        }
    }

    public static void zzC(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzJ(i2, list, z3);
        }
    }

    public static void zzD(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzL(i2, list, z3);
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
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzgr.zzA((long) zzhl.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzgr.zzA((long) ((Integer) list.get(i5)).intValue());
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
        return (zzgr.zzz(i2 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i2, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgr.zzz(i2 << 3) + 8) * size;
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
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzgr.zzA((long) zzhl.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzgr.zzA((long) ((Integer) list.get(i5)).intValue());
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
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzgr.zzA(zzib.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzgr.zzA(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzh(int i2, Object obj, zzix zzix) {
        int i5 = i2 << 3;
        if (obj instanceof zzhx) {
            int zzz = zzgr.zzz(i5);
            int zza2 = ((zzhx) obj).zza();
            return a.u(zza2, zza2, zzz);
        }
        return zzgr.zzx((zzim) obj, zzix) + zzgr.zzz(i5);
    }

    public static int zzi(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i2 = 0;
            while (i5 < size) {
                int zze = zzhl.zze(i5);
                i2 += zzgr.zzz((zze >> 31) ^ (zze + zze));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i6 = i2 + zzgr.zzz((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            i2 = 0;
            while (i5 < size) {
                long zze = zzib.zze(i5);
                i2 += zzgr.zzA((zze >> 63) ^ (zze + zze));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i6 = i2 + zzgr.zzA((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zzhl) {
            zzhl zzhl = (zzhl) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzgr.zzz(zzhl.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzgr.zzz(((Integer) list.get(i5)).intValue());
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
        if (list instanceof zzib) {
            zzib zzib = (zzib) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzgr.zzA(zzib.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzgr.zzA(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static zzjj zzm() {
        return zzb;
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object zzn(java.lang.Object r2, int r3, int r4, java.lang.Object r5, com.google.android.gms.internal.play_billing.zzjj r6) {
        /*
            if (r5 != 0) goto L_0x0012
            com.google.android.gms.internal.play_billing.zzhk r2 = (com.google.android.gms.internal.play_billing.zzhk) r2
            com.google.android.gms.internal.play_billing.zzjk r5 = r2.zzc
            com.google.android.gms.internal.play_billing.zzjk r6 = com.google.android.gms.internal.play_billing.zzjk.zzc()
            if (r5 != r6) goto L_0x0012
            com.google.android.gms.internal.play_billing.zzjk r5 = com.google.android.gms.internal.play_billing.zzjk.zzf()
            r2.zzc = r5
        L_0x0012:
            long r0 = (long) r4
            int r2 = r3 << 3
            r3 = r5
            com.google.android.gms.internal.play_billing.zzjk r3 = (com.google.android.gms.internal.play_billing.zzjk) r3
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            r3.zzj(r2, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zziz.zzn(java.lang.Object, int, int, java.lang.Object, com.google.android.gms.internal.play_billing.zzjj):java.lang.Object");
    }

    public static void zzo(zzgx zzgx, Object obj, Object obj2) {
        if (!((zzhh) obj2).zzb.zza.isEmpty()) {
            zzhh zzhh = (zzhh) obj;
            throw null;
        }
    }

    public static void zzp(zzjj zzjj, Object obj, Object obj2) {
        zzhk zzhk = (zzhk) obj;
        zzjk zzjk = zzhk.zzc;
        zzjk zzjk2 = ((zzhk) obj2).zzc;
        if (!zzjk.zzc().equals(zzjk2)) {
            if (zzjk.zzc().equals(zzjk)) {
                zzjk = zzjk.zze(zzjk, zzjk2);
            } else {
                zzjk.zzd(zzjk2);
            }
        }
        zzhk.zzc = zzjk;
    }

    public static void zzq(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzc(i2, list, z3);
        }
    }

    public static void zzr(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzg(i2, list, z3);
        }
    }

    public static void zzs(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzj(i2, list, z3);
        }
    }

    public static void zzt(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzl(i2, list, z3);
        }
    }

    public static void zzu(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzn(i2, list, z3);
        }
    }

    public static void zzv(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzp(i2, list, z3);
        }
    }

    public static void zzw(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzs(i2, list, z3);
        }
    }

    public static void zzx(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzu(i2, list, z3);
        }
    }

    public static void zzy(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzy(i2, list, z3);
        }
    }

    public static void zzz(int i2, List list, zzjw zzjw, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzjw.zzA(i2, list, z3);
        }
    }
}
