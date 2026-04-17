package n5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.a;

/* renamed from: n5.s  reason: case insensitive filesystem */
public final class C0887s implements Iterator, a {

    /* renamed from: a  reason: collision with root package name */
    public int f10401a;

    /* renamed from: b  reason: collision with root package name */
    public Object f10402b;

    /* renamed from: c  reason: collision with root package name */
    public int f10403c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0888t f10404e;

    public C0887s(C0888t tVar) {
        this.f10404e = tVar;
        this.f10403c = tVar.k();
        this.d = tVar.f10407c;
    }

    public final boolean a() {
        this.f10401a = 3;
        int i2 = this.f10403c;
        if (i2 == 0) {
            this.f10401a = 2;
        } else {
            C0888t tVar = this.f10404e;
            Object[] objArr = tVar.f10405a;
            int i5 = this.d;
            this.f10402b = objArr[i5];
            this.f10401a = 1;
            this.d = (i5 + 1) % tVar.f10406b;
            this.f10403c = i2 - 1;
        }
        if (this.f10401a == 1) {
            return true;
        }
        return false;
    }

    public final boolean hasNext() {
        int i2 = this.f10401a;
        if (i2 == 0) {
            return a();
        }
        if (i2 == 1) {
            return true;
        }
        if (i2 == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    public final Object next() {
        int i2 = this.f10401a;
        if (i2 == 1) {
            this.f10401a = 0;
            return this.f10402b;
        } else if (i2 == 2 || !a()) {
            throw new NoSuchElementException();
        } else {
            this.f10401a = 0;
            return this.f10402b;
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
