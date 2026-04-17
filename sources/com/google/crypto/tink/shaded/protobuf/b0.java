package com.google.crypto.tink.shaded.protobuf;

import h0.C0552a;
import java.util.Arrays;
import java.util.RandomAccess;

public final class b0 extends C0397b implements RandomAccess {
    public static final b0 d;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f6789b;

    /* renamed from: c  reason: collision with root package name */
    public int f6790c;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        d = b0Var;
        b0Var.f6788a = false;
    }

    public b0(Object[] objArr, int i2) {
        this.f6789b = objArr;
        this.f6790c = i2;
    }

    public final A a(int i2) {
        if (i2 >= this.f6790c) {
            return new b0(Arrays.copyOf(this.f6789b, i2), this.f6790c);
        }
        throw new IllegalArgumentException();
    }

    public final boolean add(Object obj) {
        k();
        int i2 = this.f6790c;
        Object[] objArr = this.f6789b;
        if (i2 == objArr.length) {
            this.f6789b = Arrays.copyOf(objArr, ((i2 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f6789b;
        int i5 = this.f6790c;
        this.f6790c = i5 + 1;
        objArr2[i5] = obj;
        this.modCount++;
        return true;
    }

    public final Object get(int i2) {
        v(i2);
        return this.f6789b[i2];
    }

    public final Object remove(int i2) {
        k();
        v(i2);
        Object[] objArr = this.f6789b;
        Object obj = objArr[i2];
        int i5 = this.f6790c;
        if (i2 < i5 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i5 - i2) - 1);
        }
        this.f6790c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i2, Object obj) {
        k();
        v(i2);
        Object[] objArr = this.f6789b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f6790c;
    }

    public final void v(int i2) {
        if (i2 < 0 || i2 >= this.f6790c) {
            StringBuilder s6 = C0552a.s(i2, "Index:", ", Size:");
            s6.append(this.f6790c);
            throw new IndexOutOfBoundsException(s6.toString());
        }
    }

    public final void add(int i2, Object obj) {
        int i5;
        k();
        if (i2 < 0 || i2 > (i5 = this.f6790c)) {
            StringBuilder s6 = C0552a.s(i2, "Index:", ", Size:");
            s6.append(this.f6790c);
            throw new IndexOutOfBoundsException(s6.toString());
        }
        Object[] objArr = this.f6789b;
        if (i5 < objArr.length) {
            System.arraycopy(objArr, i2, objArr, i2 + 1, i5 - i2);
        } else {
            Object[] objArr2 = new Object[C0552a.h(i5, 3, 2, 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i2);
            System.arraycopy(this.f6789b, i2, objArr2, i2 + 1, this.f6790c - i2);
            this.f6789b = objArr2;
        }
        this.f6789b[i2] = obj;
        this.f6790c++;
        this.modCount++;
    }
}
