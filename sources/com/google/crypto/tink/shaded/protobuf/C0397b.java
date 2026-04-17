package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.b  reason: case insensitive filesystem */
public abstract class C0397b extends AbstractList implements A {

    /* renamed from: a  reason: collision with root package name */
    public boolean f6788a = true;

    public boolean add(Object obj) {
        k();
        return super.add(obj);
    }

    public boolean addAll(Collection collection) {
        k();
        return super.addAll(collection);
    }

    public void clear() {
        k();
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

    public final void k() {
        if (!this.f6788a) {
            throw new UnsupportedOperationException();
        }
    }

    public abstract Object remove(int i2);

    public final boolean remove(Object obj) {
        k();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        k();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        k();
        return super.retainAll(collection);
    }

    public final boolean t() {
        return this.f6788a;
    }

    public boolean addAll(int i2, Collection collection) {
        k();
        return super.addAll(i2, collection);
    }
}
