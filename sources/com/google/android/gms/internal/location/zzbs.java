package com.google.android.gms.internal.location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {
    private static final zzbv<Object> zza = new zzbq(zzbt.zza, 0);

    public static <E> zzbs<E> zzi() {
        return zzbt.zza;
    }

    public static <E> zzbs<E> zzj(Collection<? extends E> collection) {
        if (collection instanceof zzbp) {
            zzbs<E> zze = ((zzbp) collection).zze();
            if (!zze.zzf()) {
                return zze;
            }
            Object[] array = zze.toArray();
            return zzk(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i2 = 0;
        while (i2 < length) {
            if (array2[i2] != null) {
                i2++;
            } else {
                StringBuilder sb = new StringBuilder(20);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
        return zzk(array2, length);
    }

    public static <E> zzbs<E> zzk(Object[] objArr, int i2) {
        if (i2 == 0) {
            return zzbt.zza;
        }
        return new zzbt(objArr, i2);
    }

    @Deprecated
    public final void add(int i2, E e6) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@NullableDecl Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(@NullableDecl Object obj) {
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
                        if (zzbl.zza(get(i2), list.get(i2))) {
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
                            if (!zzbl.zza(it2.next(), it3.next())) {
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

    public final int indexOf(@NullableDecl Object obj) {
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

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@NullableDecl Object obj) {
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

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i2, E e6) {
        throw new UnsupportedOperationException();
    }

    public final zzbu<E> zza() {
        return listIterator(0);
    }

    public final zzbs<E> zze() {
        return this;
    }

    public int zzg(Object[] objArr, int i2) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i5] = get(i5);
        }
        return size;
    }

    /* renamed from: zzh */
    public zzbs<E> subList(int i2, int i5) {
        zzbm.zzc(i2, i5, size());
        int i6 = i5 - i2;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return zzbt.zza;
        }
        return new zzbr(this, i2, i6);
    }

    /* renamed from: zzl */
    public final zzbv<E> listIterator(int i2) {
        zzbm.zzb(i2, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzbq(this, i2);
    }
}
