package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.measurement.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaj  reason: invalid package */
public abstract class zzaj<E> extends zzai<E> implements List<E>, RandomAccess {
    private static final zzaz<Object> zza = new zzal(zzar.zza, 0);

    public static <E> zzaj<E> zzb(Object[] objArr, int i2) {
        if (i2 == 0) {
            return zzar.zza;
        }
        return new zzar(objArr, i2);
    }

    public static <E> zzam<E> zzg() {
        return new zzam<>();
    }

    public static <E> zzaj<E> zzh() {
        return zzar.zza;
    }

    @Deprecated
    public final void add(int i2, E e6) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == zzw.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i2 = 0;
                    while (i2 < size) {
                        if (zzp.zza(get(i2), list.get(i2))) {
                            i2++;
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator it2 = list.iterator();
                int i5 = 0;
                while (true) {
                    if (i5 < size2) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object obj2 = get(i5);
                        i5++;
                        if (!zzp.zza(obj2, it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i2 = ~(~(get(i5).hashCode() + (i2 * 31)));
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

    public /* synthetic */ ListIterator listIterator() {
        return (zzaz) listIterator(0);
    }

    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i2, E e6) {
        throw new UnsupportedOperationException();
    }

    public int zza(Object[] objArr, int i2) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i2 + i5] = get(i5);
        }
        return i2 + size;
    }

    @Deprecated
    public final zzaj<E> zzc() {
        return this;
    }

    /* renamed from: zzd */
    public final zzba<E> iterator() {
        return (zzaz) listIterator();
    }

    public /* synthetic */ ListIterator listIterator(int i2) {
        zzw.zzb(i2, size());
        if (isEmpty()) {
            return zza;
        }
        return new zzal(this, i2);
    }

    public static <E> zzaj<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzaj<E> zzb(Object... objArr) {
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(a.f(i2, "at index "));
            }
        }
        return zzb(objArr, objArr.length);
    }

    public static <E> zzaj<E> zza(Collection<? extends E> collection) {
        if (!(collection instanceof zzai)) {
            return zzb(collection.toArray());
        }
        zzaj<E> zzc = ((zzai) collection).zzc();
        if (!zzc.zze()) {
            return zzc;
        }
        Object[] array = zzc.toArray();
        return zzb(array, array.length);
    }

    public static <E> zzaj<E> zza(E e6, E e7, E e8, E e9, E e10, E e11, E e12, E e13) {
        return zzb(e6, e7, e8, e9, e10, e11, e12, e13);
    }

    /* renamed from: zza */
    public zzaj<E> subList(int i2, int i5) {
        zzw.zza(i2, i5, size());
        int i6 = i5 - i2;
        if (i6 == size()) {
            return this;
        }
        if (i6 == 0) {
            return zzar.zza;
        }
        return new zzao(this, i2, i6);
    }
}
