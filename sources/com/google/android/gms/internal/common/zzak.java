package com.google.android.gms.internal.common;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class zzak extends zzag implements List, RandomAccess {
    private static final zzao zza = new zzai(zzam.zza, 0);

    public static zzak zzi(Object[] objArr, int i2) {
        if (i2 == 0) {
            return zzam.zza;
        }
        return new zzam(objArr, i2);
    }

    public static zzak zzj(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return zzk((Collection) iterable);
        }
        Iterator it2 = iterable.iterator();
        if (!it2.hasNext()) {
            return zzam.zza;
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return zzm(next);
        }
        zzah zzah = new zzah(4);
        zzah.zzb(next);
        zzah.zzc(it2);
        zzah.zzc = true;
        return zzi(zzah.zza, zzah.zzb);
    }

    public static zzak zzk(Collection collection) {
        if (collection instanceof zzag) {
            zzak zzd = ((zzag) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzi(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzal.zza(array2, length);
        return zzi(array2, length);
    }

    public static zzak zzl() {
        return zzam.zza;
    }

    public static zzak zzm(Object obj) {
        Object[] objArr = {obj};
        zzal.zza(objArr, 1);
        return zzi(objArr, 1);
    }

    public static zzak zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzal.zza(objArr, 2);
        return zzi(objArr, 2);
    }

    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
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
                        if (zzu.zza(get(i2), list.get(i2))) {
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
                            if (!zzu.zza(it2.next(), it3.next())) {
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

    public final int indexOf(Object obj) {
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

    public final int lastIndexOf(Object obj) {
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
    public final zzak zzd() {
        return this;
    }

    public final zzan zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzak subList(int i2, int i5) {
        zzv.zzc(i2, i5, size());
        int i6 = i5 - i2;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return zzam.zza;
        }
        return new zzaj(this, i2, i6);
    }

    /* renamed from: zzo */
    public final zzao listIterator(int i2) {
        zzv.zzb(i2, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzai(this, i2);
    }
}
