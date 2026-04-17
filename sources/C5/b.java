package C5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.a;

public final class b implements Iterator, a {

    /* renamed from: a  reason: collision with root package name */
    public final int f477a;

    /* renamed from: b  reason: collision with root package name */
    public final int f478b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f479c;
    public int d;

    public b(char c3, char c6, int i2) {
        this.f477a = i2;
        this.f478b = c6;
        boolean z3 = false;
        if (i2 <= 0 ? c3 >= c6 : c3 < c6 || c3 == c6) {
            z3 = true;
        }
        this.f479c = z3;
        this.d = !z3 ? c6 : c3;
    }

    public final boolean hasNext() {
        return this.f479c;
    }

    public final Object next() {
        int i2 = this.d;
        if (i2 != this.f478b) {
            this.d = this.f477a + i2;
        } else if (this.f479c) {
            this.f479c = false;
        } else {
            throw new NoSuchElementException();
        }
        return Character.valueOf((char) i2);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
