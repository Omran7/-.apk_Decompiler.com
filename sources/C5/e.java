package C5;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.a;

public final class e implements Iterator, a {

    /* renamed from: a  reason: collision with root package name */
    public final int f483a;

    /* renamed from: b  reason: collision with root package name */
    public final int f484b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f485c;
    public int d;

    public e(int i2, int i5, int i6) {
        this.f483a = i6;
        this.f484b = i5;
        boolean z3 = false;
        if (i6 <= 0 ? i2 >= i5 : i2 <= i5) {
            z3 = true;
        }
        this.f485c = z3;
        this.d = !z3 ? i5 : i2;
    }

    public final int a() {
        int i2 = this.d;
        if (i2 != this.f484b) {
            this.d = this.f483a + i2;
        } else if (this.f485c) {
            this.f485c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i2;
    }

    public final boolean hasNext() {
        return this.f485c;
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
