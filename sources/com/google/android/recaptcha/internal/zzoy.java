package com.google.android.recaptcha.internal;

import com.google.android.gms.internal.measurement.a;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class zzoy {
    public static final /* synthetic */ int zza = 0;
    private static final zzpl zzb = new zzpn();

    static {
        int i2 = zzos.zza;
    }

    public static void zzA(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzA(i2, list, z3);
        }
    }

    public static void zzB(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzC(i2, list, z3);
        }
    }

    public static void zzC(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzE(i2, list, z3);
        }
    }

    public static void zzD(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzJ(i2, list, z3);
        }
    }

    public static void zzE(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzL(i2, list, z3);
        }
    }

    public static boolean zzF(Object obj, Object obj2) {
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
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzln.zzB((long) zzne.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzln.zzB((long) ((Integer) list.get(i5)).intValue());
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
        return (zzln.zzA(i2 << 3) + 4) * size;
    }

    public static int zzc(List list) {
        return list.size() * 4;
    }

    public static int zzd(int i2, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzln.zzA(i2 << 3) + 8) * size;
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
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzln.zzB((long) zzne.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzln.zzB((long) ((Integer) list.get(i5)).intValue());
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
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzln.zzB(zznx.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzln.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzh(int i2, Object obj, zzow zzow) {
        int i5 = i2 << 3;
        if (obj instanceof zznt) {
            int zzA = zzln.zzA(i5);
            int zza2 = ((zznt) obj).zza();
            return a.w(zza2, zza2, zzA);
        }
        return zzln.zzy((zzoi) obj, zzow) + zzln.zzA(i5);
    }

    public static int zzi(List list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            i2 = 0;
            while (i5 < size) {
                int zze = zzne.zze(i5);
                i2 += zzln.zzA((zze >> 31) ^ (zze + zze));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                int intValue = ((Integer) list.get(i5)).intValue();
                i6 = i2 + zzln.zzA((intValue >> 31) ^ (intValue + intValue));
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
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            i2 = 0;
            while (i5 < size) {
                long zze = zznx.zze(i5);
                i2 += zzln.zzB((zze >> 63) ^ (zze + zze));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                long longValue = ((Long) list.get(i5)).longValue();
                i6 = i2 + zzln.zzB((longValue >> 63) ^ (longValue + longValue));
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
        if (list instanceof zzne) {
            zzne zzne = (zzne) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzln.zzA(zzne.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzln.zzA(((Integer) list.get(i5)).intValue());
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
        if (list instanceof zznx) {
            zznx zznx = (zznx) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzln.zzB(zznx.zze(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzln.zzB(((Long) list.get(i5)).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static zzpl zzm() {
        return zzb;
    }

    public static Object zzn(Object obj, int i2, List list, zznh zznh, Object obj2, zzpl zzpl) {
        if (zznh == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = (Integer) list.get(i6);
                int intValue = num.intValue();
                if (zznh.zza(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    obj2 = zzo(obj, i2, intValue, obj2, zzpl);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
                return obj2;
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = ((Integer) it2.next()).intValue();
                if (!zznh.zza(intValue2)) {
                    obj2 = zzo(obj, i2, intValue2, obj2, zzpl);
                    it2.remove();
                }
            }
        }
        return obj2;
    }

    public static Object zzo(Object obj, int i2, int i5, Object obj2, zzpl zzpl) {
        if (obj2 == null) {
            obj2 = zzpl.zza(obj);
        }
        zzpl.zzh(obj2, i2, (long) i5);
        return obj2;
    }

    public static void zzp(zzmp zzmp, Object obj, Object obj2) {
        zzmt zzmt = ((zzna) obj2).zzb;
        if (!zzmt.zza.isEmpty()) {
            ((zzna) obj).zzi().zzh(zzmt);
        }
    }

    public static void zzq(zzpl zzpl, Object obj, Object obj2) {
        zznd zznd = (zznd) obj;
        zzpm zzpm = zznd.zzc;
        zzpm zzpm2 = ((zznd) obj2).zzc;
        if (!zzpm.zzc().equals(zzpm2)) {
            if (zzpm.zzc().equals(zzpm)) {
                zzpm = zzpm.zze(zzpm, zzpm2);
            } else {
                zzpm.zzd(zzpm2);
            }
        }
        zznd.zzc = zzpm;
    }

    public static void zzr(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzc(i2, list, z3);
        }
    }

    public static void zzs(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzg(i2, list, z3);
        }
    }

    public static void zzt(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzj(i2, list, z3);
        }
    }

    public static void zzu(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzl(i2, list, z3);
        }
    }

    public static void zzv(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzn(i2, list, z3);
        }
    }

    public static void zzw(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzp(i2, list, z3);
        }
    }

    public static void zzx(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzs(i2, list, z3);
        }
    }

    public static void zzy(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzu(i2, list, z3);
        }
    }

    public static void zzz(int i2, List list, zzpy zzpy, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzpy.zzy(i2, list, z3);
        }
    }
}
