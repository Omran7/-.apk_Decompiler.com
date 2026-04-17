package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e  reason: case insensitive filesystem */
public final class C0400e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f6796a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final int f6797b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0403h f6798c;

    public C0400e(C0403h hVar) {
        this.f6798c = hVar;
        this.f6797b = hVar.size();
    }

    public final boolean hasNext() {
        if (this.f6796a < this.f6797b) {
            return true;
        }
        return false;
    }

    public final Object next() {
        int i2 = this.f6796a;
        if (i2 < this.f6797b) {
            this.f6796a = i2 + 1;
            return Byte.valueOf(this.f6798c.z(i2));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
