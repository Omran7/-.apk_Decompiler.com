package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o3.d;

public final class zzh {
    public static double zza(double d) {
        int i2;
        int i5;
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || i2 == 0) {
            return d;
        }
        if (i2 > 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        return ((double) i5) * Math.floor(Math.abs(d));
    }

    public static int zzb(double d) {
        int i2;
        int i5;
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        if (i2 > 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        return (int) ((long) ((((double) i5) * Math.floor(Math.abs(d))) % 4.294967296E9d));
    }

    public static int zzc(zzg zzg) {
        int zzb = zzb(zzg.zzd("runtime.counter").zzh().doubleValue() + 1.0d);
        if (zzb <= 1000000) {
            zzg.zzg("runtime.counter", new zzah(Double.valueOf((double) zzb)));
            return zzb;
        }
        throw new IllegalStateException("Instructions allowed exceeded");
    }

    public static long zzd(double d) {
        return ((long) zzb(d)) & 4294967295L;
    }

    public static zzbl zze(String str) {
        zzbl zzbl = null;
        if (str != null && !str.isEmpty()) {
            zzbl = zzbl.zza(Integer.parseInt(str));
        }
        if (zzbl != null) {
            return zzbl;
        }
        throw new IllegalArgumentException(d.i("Unsupported commandId ", str));
    }

    public static Object zzf(zzap zzap) {
        if (zzap.zzg.equals(zzap)) {
            return null;
        }
        if (zzap.zzf.equals(zzap)) {
            return "";
        }
        if (zzap instanceof zzam) {
            return zzg((zzam) zzap);
        }
        if (zzap instanceof zzae) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((zzae) zzap).iterator();
            while (it2.hasNext()) {
                Object zzf = zzf((zzap) it2.next());
                if (zzf != null) {
                    arrayList.add(zzf);
                }
            }
            return arrayList;
        } else if (!zzap.zzh().isNaN()) {
            return zzap.zzh();
        } else {
            return zzap.zzi();
        }
    }

    public static Map zzg(zzam zzam) {
        HashMap hashMap = new HashMap();
        for (String str : zzam.zzb()) {
            Object zzf = zzf(zzam.zzf(str));
            if (zzf != null) {
                hashMap.put(str, zzf);
            }
        }
        return hashMap;
    }

    public static void zzh(String str, int i2, List list) {
        if (list.size() != i2) {
            int size = list.size();
            throw new IllegalArgumentException(str + " operation requires " + i2 + " parameters found " + size);
        }
    }

    public static void zzi(String str, int i2, List list) {
        if (list.size() < i2) {
            int size = list.size();
            throw new IllegalArgumentException(str + " operation requires at least " + i2 + " parameters found " + size);
        }
    }

    public static void zzj(String str, int i2, List list) {
        if (list.size() > i2) {
            int size = list.size();
            throw new IllegalArgumentException(str + " operation requires at most " + i2 + " parameters found " + size);
        }
    }

    public static boolean zzk(zzap zzap) {
        if (zzap == null) {
            return false;
        }
        Double zzh = zzap.zzh();
        if (zzh.isNaN() || zzh.doubleValue() < 0.0d || !zzh.equals(Double.valueOf(Math.floor(zzh.doubleValue())))) {
            return false;
        }
        return true;
    }

    public static boolean zzl(zzap zzap, zzap zzap2) {
        if (!zzap.getClass().equals(zzap2.getClass())) {
            return false;
        }
        if ((zzap instanceof zzau) || (zzap instanceof zzan)) {
            return true;
        }
        if (zzap instanceof zzah) {
            if (Double.isNaN(zzap.zzh().doubleValue()) || Double.isNaN(zzap2.zzh().doubleValue())) {
                return false;
            }
            return zzap.zzh().equals(zzap2.zzh());
        } else if (zzap instanceof zzat) {
            return zzap.zzi().equals(zzap2.zzi());
        } else {
            if (zzap instanceof zzaf) {
                return zzap.zzg().equals(zzap2.zzg());
            }
            if (zzap == zzap2) {
                return true;
            }
            return false;
        }
    }
}
