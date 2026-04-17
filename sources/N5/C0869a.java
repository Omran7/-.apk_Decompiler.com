package n5;

import h0.C0552a;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.a;

/* renamed from: n5.a  reason: case insensitive filesystem */
public final class C0869a extends a implements ListIterator {
    public final /* synthetic */ C0871c d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0869a(C0871c cVar, int i2) {
        super(cVar);
        this.d = cVar;
        int k6 = cVar.k();
        if (i2 < 0 || i2 > k6) {
            throw new IndexOutOfBoundsException(C0552a.l("index: ", i2, k6, ", size: "));
        }
        this.f9648b = i2;
    }

    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean hasPrevious() {
        if (this.f9648b > 0) {
            return true;
        }
        return false;
    }

    public final int nextIndex() {
        return this.f9648b;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.f9648b - 1;
            this.f9648b = i2;
            return this.d.get(i2);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f9648b - 1;
    }

    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
