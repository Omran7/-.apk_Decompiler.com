package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public final class zzae implements Iterable, zzap, zzal {
    final SortedMap zza;
    final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzae = (zzae) obj;
        if (zzc() != zzae.zzc()) {
            return false;
        }
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return zzae.zza.isEmpty();
        }
        for (int intValue = ((Integer) sortedMap.firstKey()).intValue(); intValue <= ((Integer) sortedMap.lastKey()).intValue(); intValue++) {
            if (!zze(intValue).equals(zzae.zze(intValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc() {
        SortedMap sortedMap = this.zza;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final zzap zzcz(String str, zzg zzg, List list) {
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) {
            return zzbb.zza(str, this, zzg, list);
        }
        return zzaj.zza(this, new zzat(str), zzg, list);
    }

    public final zzap zzd() {
        zzae zzae = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                zzae.zza.put((Integer) entry.getKey(), (zzap) entry.getValue());
            } else {
                zzae.zza.put((Integer) entry.getKey(), ((zzap) entry.getValue()).zzd());
            }
        }
        return zzae;
    }

    public final zzap zze(int i2) {
        zzap zzap;
        if (i2 >= zzc()) {
            throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
        } else if (!zzs(i2) || (zzap = (zzap) this.zza.get(Integer.valueOf(i2))) == null) {
            return zzap.zzf;
        } else {
            return zzap;
        }
    }

    public final zzap zzf(String str) {
        zzap zzap;
        if ("length".equals(str)) {
            return new zzah(Double.valueOf((double) zzc()));
        }
        if (!zzt(str) || (zzap = (zzap) this.zzb.get(str)) == null) {
            return zzap.zzf;
        }
        return zzap;
    }

    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    public final Double zzh() {
        SortedMap sortedMap = this.zza;
        if (sortedMap.size() == 1) {
            return zze(0).zzh();
        }
        if (sortedMap.size() <= 0) {
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.NaN);
    }

    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i2 = 0;
            while (true) {
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                if (i2 >= zzc()) {
                    break;
                }
                zzap zze = zze(i2);
                sb.append(str2);
                if (!(zze instanceof zzau) && !(zze instanceof zzan)) {
                    sb.append(zze.zzi());
                }
                i2++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    public final Iterator zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i2 = 0; i2 < zzc(); i2++) {
            arrayList.add(zze(i2));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i2, zzap zzap) {
        if (i2 < 0) {
            throw new IllegalArgumentException(a.f(i2, "Invalid value index: "));
        } else if (i2 >= zzc()) {
            zzq(i2, zzap);
        } else {
            SortedMap sortedMap = this.zza;
            for (int intValue = ((Integer) sortedMap.lastKey()).intValue(); intValue >= i2; intValue--) {
                Integer valueOf = Integer.valueOf(intValue);
                zzap zzap2 = (zzap) sortedMap.get(valueOf);
                if (zzap2 != null) {
                    zzq(intValue + 1, zzap2);
                    sortedMap.remove(valueOf);
                }
            }
            zzq(i2, zzap);
        }
    }

    public final void zzp(int i2) {
        SortedMap sortedMap = this.zza;
        int intValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i2 <= intValue && i2 >= 0) {
            sortedMap.remove(Integer.valueOf(i2));
            if (i2 == intValue) {
                int i5 = i2 - 1;
                Integer valueOf = Integer.valueOf(i5);
                if (!sortedMap.containsKey(valueOf) && i5 >= 0) {
                    sortedMap.put(valueOf, zzap.zzf);
                    return;
                }
                return;
            }
            while (true) {
                i2++;
                if (i2 <= ((Integer) sortedMap.lastKey()).intValue()) {
                    Integer valueOf2 = Integer.valueOf(i2);
                    zzap zzap = (zzap) sortedMap.get(valueOf2);
                    if (zzap != null) {
                        sortedMap.put(Integer.valueOf(i2 - 1), zzap);
                        sortedMap.remove(valueOf2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void zzq(int i2, zzap zzap) {
        if (i2 > 32468) {
            throw new IllegalStateException("Array too large");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException(a.f(i2, "Out of bounds index: "));
        } else if (zzap == null) {
            this.zza.remove(Integer.valueOf(i2));
        } else {
            this.zza.put(Integer.valueOf(i2), zzap);
        }
    }

    public final void zzr(String str, zzap zzap) {
        if (zzap == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzap);
        }
    }

    public final boolean zzs(int i2) {
        if (i2 >= 0) {
            SortedMap sortedMap = this.zza;
            if (i2 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i2));
            }
        }
        throw new IndexOutOfBoundsException(a.f(i2, "Out of bounds index: "));
    }

    public final boolean zzt(String str) {
        if ("length".equals(str) || this.zzb.containsKey(str)) {
            return true;
        }
        return false;
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzq(i2, (zzap) list.get(i2));
            }
        }
    }
}
