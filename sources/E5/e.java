package E5;

import I1.b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import m5.C0849h;
import o5.d;
import o5.i;
import o5.j;
import q5.g;
import y5.a;

public final class e implements Iterator, d, a {

    /* renamed from: a  reason: collision with root package name */
    public int f659a;

    /* renamed from: b  reason: collision with root package name */
    public Object f660b;

    /* renamed from: c  reason: collision with root package name */
    public d f661c;

    public final RuntimeException b() {
        int i2 = this.f659a;
        if (i2 == 4) {
            return new NoSuchElementException();
        }
        if (i2 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f659a);
    }

    public final void e(Object obj, g gVar) {
        this.f660b = obj;
        this.f659a = 3;
        this.f661c = gVar;
        p5.a aVar = p5.a.f11033a;
    }

    public final i getContext() {
        return j.f10479a;
    }

    public final boolean hasNext() {
        int i2;
        while (true) {
            i2 = this.f659a;
            if (i2 != 0) {
                break;
            }
            this.f659a = 5;
            d dVar = this.f661c;
            kotlin.jvm.internal.j.b(dVar);
            this.f661c = null;
            dVar.resumeWith(C0849h.f10203c);
        }
        if (i2 == 1) {
            kotlin.jvm.internal.j.b((Object) null);
            throw null;
        } else if (i2 == 2 || i2 == 3) {
            return true;
        } else {
            if (i2 == 4) {
                return false;
            }
            throw b();
        }
    }

    public final Object next() {
        int i2 = this.f659a;
        if (i2 == 0 || i2 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        } else if (i2 == 2) {
            this.f659a = 1;
            kotlin.jvm.internal.j.b((Object) null);
            throw null;
        } else if (i2 == 3) {
            this.f659a = 0;
            Object obj = this.f660b;
            this.f660b = null;
            return obj;
        } else {
            throw b();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void resumeWith(Object obj) {
        b.I0(obj);
        this.f659a = 4;
    }
}
