package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzkq extends AbstractList implements zzmj {
    private boolean zza;

    public zzkq(boolean z3) {
        this.zza = z3;
    }

    public void add(int i2, Object obj) {
        zzcE();
        super.add(i2, obj);
    }

    public final boolean addAll(int i2, Collection collection) {
        zzcE();
        return super.addAll(i2, collection);
    }

    public final void clear() {
        zzcE();
        super.clear();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!get(i2).equals(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i2 = (i2 * 31) + get(i5).hashCode();
        }
        return i2;
    }

    public Object remove(int i2) {
        zzcE();
        return super.remove(i2);
    }

    public final boolean removeAll(Collection collection) {
        zzcE();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zzcE();
        return super.retainAll(collection);
    }

    public Object set(int i2, Object obj) {
        zzcE();
        return super.set(i2, obj);
    }

    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public final void zzcE() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean add(Object obj) {
        zzcE();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zzcE();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zzcE();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
