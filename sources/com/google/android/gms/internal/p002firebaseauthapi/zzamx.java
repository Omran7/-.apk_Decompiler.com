package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzamx  reason: invalid package */
final class zzamx {
    private static final zzano<?, ?> zza = new zzanq();

    public static int zza(int i2, List<?> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zza(i2, true) * size;
    }

    public static int zzb(int i2, List<Integer> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i2) * size) + zzb(list);
    }

    public static int zzc(int i2, List<?> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zzc(i2, 0) * size;
    }

    public static int zzd(int i2, List<?> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzakg.zza(i2, 0) * size;
    }

    public static int zze(int i2, List<Integer> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i2) * size) + zze(list);
    }

    public static int zzf(int i2, List<Long> list, boolean z3) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzakg.zzi(i2) * list.size()) + zzf(list);
    }

    public static int zzg(int i2, List<Integer> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i2) * size) + zzg(list);
    }

    public static int zzh(int i2, List<Long> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i2) * size) + zzh(list);
    }

    public static int zzi(int i2, List<Integer> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i2) * size) + zzi(list);
    }

    public static int zzj(int i2, List<Long> list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzakg.zzi(i2) * size) + zzj(list);
    }

    public static void zzk(int i2, List<Integer> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzk(i2, list, z3);
        }
    }

    public static void zzl(int i2, List<Long> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzl(i2, list, z3);
        }
    }

    public static void zzm(int i2, List<Integer> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzm(i2, list, z3);
        }
    }

    public static void zzn(int i2, List<Long> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzn(i2, list, z3);
        }
    }

    public static int zza(List<?> list) {
        return list.size();
    }

    public static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static int zza(int i2, List<zzajp> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzakg.zzi(i2) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            zzi += zzakg.zza(list.get(i5));
        }
        return zzi;
    }

    public static int zzb(List<Integer> list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzakg.zzc(zzakz.zzb(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzakg.zzc(list.get(i5).intValue());
                i5++;
            }
        }
        return i2;
    }

    public static void zzc(int i2, List<Integer> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzc(i2, list, z3);
        }
    }

    public static void zzd(int i2, List<Integer> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzd(i2, list, z3);
        }
    }

    public static int zze(List<Integer> list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzakg.zze(zzakz.zzb(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzakg.zze(list.get(i5).intValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzf(List<Long> list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzakg.zzd(zzalr.zzb(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzakg.zzd(list.get(i5).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzg(List<Integer> list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzakg.zzh(zzakz.zzb(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzakg.zzh(list.get(i5).intValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzh(List<Long> list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzakg.zzf(zzalr.zzb(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzakg.zzf(list.get(i5).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzi(List<Integer> list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakz) {
            zzakz zzakz = (zzakz) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzakg.zzj(zzakz.zzb(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzakg.zzj(list.get(i5).intValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zzj(List<Long> list) {
        int i2;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzalr) {
            zzalr zzalr = (zzalr) list;
            i2 = 0;
            while (i5 < size) {
                i2 += zzakg.zzg(zzalr.zzb(i5));
                i5++;
            }
        } else {
            int i6 = 0;
            while (i5 < size) {
                i6 = i2 + zzakg.zzg(list.get(i5).longValue());
                i5++;
            }
        }
        return i2;
    }

    public static int zza(int i2, List<zzamc> list, zzamv<?> zzamv) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += zzakg.zza(i2, list.get(i6), zzamv);
        }
        return i5;
    }

    public static int zzb(int i2, List<?> list, zzamv<?> zzamv) {
        int zza2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzi = zzakg.zzi(i2) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            if (obj instanceof zzalk) {
                zza2 = zzakg.zza((zzalk) obj);
            } else {
                zza2 = zzakg.zza((zzamc) obj, (zzamv) zzamv);
            }
            zzi = zza2 + zzi;
        }
        return zzi;
    }

    public static void zze(int i2, List<Long> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zze(i2, list, z3);
        }
    }

    public static void zzf(int i2, List<Float> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzf(i2, list, z3);
        }
    }

    public static void zzg(int i2, List<Integer> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzg(i2, list, z3);
        }
    }

    public static void zzh(int i2, List<Long> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzh(i2, list, z3);
        }
    }

    public static void zzi(int i2, List<Integer> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzi(i2, list, z3);
        }
    }

    public static void zzj(int i2, List<Long> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzj(i2, list, z3);
        }
    }

    public static int zza(int i2, Object obj, zzamv<?> zzamv) {
        if (obj instanceof zzalk) {
            return zzakg.zzb(i2, (zzalk) obj);
        }
        return zzakg.zzb(i2, (zzamc) obj, (zzamv) zzamv);
    }

    public static zzano<?, ?> zza() {
        return zza;
    }

    public static <UT, UB> UB zza(Object obj, int i2, List<Integer> list, zzald zzald, UB ub, zzano<UT, UB> zzano) {
        if (zzald == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size; i6++) {
                Integer num = list.get(i6);
                int intValue = num.intValue();
                if (zzald.zza(intValue)) {
                    if (i6 != i5) {
                        list.set(i5, num);
                    }
                    i5++;
                } else {
                    ub = zza(obj, i2, intValue, ub, zzano);
                }
            }
            if (i5 != size) {
                list.subList(i5, size).clear();
            }
        } else {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int intValue2 = it2.next().intValue();
                if (!zzald.zza(intValue2)) {
                    ub = zza(obj, i2, intValue2, ub, zzano);
                    it2.remove();
                }
            }
        }
        return ub;
    }

    public static int zzb(int i2, List<?> list) {
        int zza2;
        int zza3;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int zzi = zzakg.zzi(i2) * size;
        if (list instanceof zzaln) {
            zzaln zzaln = (zzaln) list;
            while (i5 < size) {
                Object zza4 = zzaln.zza(i5);
                if (zza4 instanceof zzajp) {
                    zza3 = zzakg.zza((zzajp) zza4);
                } else {
                    zza3 = zzakg.zza((String) zza4);
                }
                zzi = zza3 + zzi;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof zzajp) {
                    zza2 = zzakg.zza((zzajp) obj);
                } else {
                    zza2 = zzakg.zza((String) obj);
                }
                zzi = zza2 + zzi;
                i5++;
            }
        }
        return zzi;
    }

    public static <UT, UB> UB zza(Object obj, int i2, int i5, UB ub, zzano<UT, UB> zzano) {
        if (ub == null) {
            ub = zzano.zzc(obj);
        }
        zzano.zzb(ub, i2, (long) i5);
        return ub;
    }

    public static void zzb(int i2, List<Double> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzb(i2, list, z3);
        }
    }

    public static <T, FT extends zzakt<FT>> void zza(zzakm<FT> zzakm, T t6, T t7) {
        zzakr<FT> zza2 = zzakm.zza((Object) t7);
        if (!zza2.zza.isEmpty()) {
            zzakm.zzb(t6).zza(zza2);
        }
    }

    public static void zzb(int i2, List<?> list, zzaof zzaof, zzamv<?> zzamv) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzb(i2, list, (zzamv) zzamv);
        }
    }

    public static void zzb(int i2, List<String> list, zzaof zzaof) {
        if (list != null && !list.isEmpty()) {
            zzaof.zzb(i2, list);
        }
    }

    public static <T> void zza(zzalz zzalz, T t6, T t7, long j6) {
        zzanp.zza((Object) t6, j6, zzalz.zza(zzanp.zze(t6, j6), zzanp.zze(t7, j6)));
    }

    public static <T, UT, UB> void zza(zzano<UT, UB> zzano, T t6, T t7) {
        zzano.zzc(t6, zzano.zza(zzano.zzd(t6), zzano.zzd(t7)));
    }

    public static void zza(Class<?> cls) {
        zzaky.class.isAssignableFrom(cls);
    }

    public static void zza(int i2, List<Boolean> list, zzaof zzaof, boolean z3) {
        if (list != null && !list.isEmpty()) {
            zzaof.zza(i2, list, z3);
        }
    }

    public static void zza(int i2, List<zzajp> list, zzaof zzaof) {
        if (list != null && !list.isEmpty()) {
            zzaof.zza(i2, list);
        }
    }

    public static void zza(int i2, List<?> list, zzaof zzaof, zzamv<?> zzamv) {
        if (list != null && !list.isEmpty()) {
            zzaof.zza(i2, list, (zzamv) zzamv);
        }
    }

    public static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
