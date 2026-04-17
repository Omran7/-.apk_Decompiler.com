package A2;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import w5.a;

public final class b extends s implements ListIterator {

    /* renamed from: a  reason: collision with root package name */
    public final int f19a;

    /* renamed from: b  reason: collision with root package name */
    public int f20b;

    /* renamed from: c  reason: collision with root package name */
    public final d f21c;

    public b(d dVar, int i2) {
        int size = dVar.size();
        a.c(i2, size);
        this.f19a = size;
        this.f20b = i2;
        this.f21c = dVar;
    }

    public final Object a(int i2) {
        return this.f21c.get(i2);
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        if (this.f20b < this.f19a) {
            return true;
        }
        return false;
    }

    public final boolean hasPrevious() {
        if (this.f20b > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (hasNext()) {
            int i2 = this.f20b;
            this.f20b = i2 + 1;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f20b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.f20b - 1;
            this.f20b = i2;
            return a(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f20b - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
