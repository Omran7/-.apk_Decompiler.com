package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class zzfx extends AbstractList implements zzho {
    private boolean zza;

    public zzfx(boolean z3) {
        this.zza = z3;
    }

    public void add(int i2, Object obj) {
        zza();
        super.add(i2, obj);
    }

    public final boolean addAll(int i2, Collection collection) {
        zza();
        return super.addAll(i2, collection);
    }

    public final void clear() {
        zza();
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
        zza();
        return super.remove(i2);
    }

    public final boolean removeAll(Collection collection) {
        zza();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        zza();
        return super.retainAll(collection);
    }

    public Object set(int i2, Object obj) {
        zza();
        return super.set(i2, obj);
    }

    public final void zza() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    public final boolean zzc() {
        return this.zza;
    }

    public boolean add(Object obj) {
        zza();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        zza();
        return super.addAll(collection);
    }

    public final boolean remove(Object obj) {
        zza();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
