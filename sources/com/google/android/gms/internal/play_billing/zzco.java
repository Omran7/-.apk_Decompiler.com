package com.google.android.gms.internal.play_billing;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.stream.Collector;

public abstract class zzco extends zzcj implements List, RandomAccess {
    private static final zzdx zza = new zzcl(zzdk.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzco zzj(Object[] objArr, int i2) {
        if (i2 == 0) {
            return zzdk.zza;
        }
        return new zzdk(objArr, i2);
    }

    public static zzco zzk(Collection collection) {
        if (collection instanceof zzcj) {
            zzco zzd2 = ((zzcj) collection).zzd();
            if (!zzd2.zzf()) {
                return zzd2;
            }
            Object[] array = zzd2.toArray();
            return zzj(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzdd.zzb(array2, length);
        return zzj(array2, length);
    }

    public static zzco zzl() {
        return zzdk.zza;
    }

    public static zzco zzm(Object obj) {
        Object[] objArr = {obj};
        zzdd.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static Collector zzo() {
        return zzbv.zza();
    }

    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i2 = 0;
                    while (i2 < size) {
                        if (zzbd.zza(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
                Iterator it2 = iterator();
                Iterator it3 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it3.hasNext()) {
                            if (!zzbd.zza(it2.next(), it3.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it3.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i2 = (i2 * 31) + get(i5).hashCode();
        }
        return i2;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    public int zza(Object[] objArr, int i2) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    @Deprecated
    public final zzco zzd() {
        return this;
    }

    public final zzdw zze() {
        return listIterator(0);
    }

    public zzco zzh() {
        if (size() <= 1) {
            return this;
        }
        return new zzcm(this);
    }

    /* renamed from: zzi */
    public zzco subList(int i2, int i5) {
        zzbe.zze(i2, i5, size());
        int i6 = i5 - i2;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return zzdk.zza;
        }
        return new zzcn(this, i2, i6);
    }

    /* renamed from: zzn */
    public final zzdx listIterator(int i2) {
        zzbe.zzb(i2, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzcl(this, i2);
    }
}
