package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class k0 extends AbstractList implements G, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final F f6828a;

    public k0(F f6) {
        this.f6828a = f6;
    }

    public final void e(C0404i iVar) {
        throw new UnsupportedOperationException();
    }

    public final Object get(int i2) {
        return (String) this.f6828a.get(i2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, com.google.crypto.tink.shaded.protobuf.j0] */
    public final Iterator iterator() {
        ? obj = new Object();
        obj.f6820a = this.f6828a.iterator();
        return obj;
    }

    public final G j() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.ListIterator, java.lang.Object, com.google.crypto.tink.shaded.protobuf.i0] */
    public final ListIterator listIterator(int i2) {
        ? obj = new Object();
        obj.f6813a = this.f6828a.listIterator(i2);
        return obj;
    }

    public final Object m(int i2) {
        return this.f6828a.f6755b.get(i2);
    }

    public final List n() {
        return Collections.unmodifiableList(this.f6828a.f6755b);
    }

    public final int size() {
        return this.f6828a.size();
    }
}
