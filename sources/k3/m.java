package k3;

import I1.b;
import java.util.Comparator;
import java.util.Iterator;
import v3.C1048c;

public final class m extends c {

    /* renamed from: a  reason: collision with root package name */
    public final h f9479a;

    /* renamed from: b  reason: collision with root package name */
    public final Comparator f9480b;

    public m(h hVar, Comparator comparator) {
        this.f9479a = hVar;
        this.f9480b = comparator;
    }

    public final c A(Iterable iterable, Object obj) {
        h hVar = this.f9479a;
        Comparator comparator = this.f9480b;
        return new m(((j) hVar.a(obj, iterable, comparator)).g(2, (h) null, (h) null), comparator);
    }

    public final c B(Object obj) {
        if (!k(obj)) {
            return this;
        }
        h hVar = this.f9479a;
        Comparator comparator = this.f9480b;
        return new m(hVar.f(obj, comparator).g(2, (j) null, (j) null), comparator);
    }

    public final h C(Object obj) {
        h hVar = this.f9479a;
        while (!hVar.isEmpty()) {
            int compare = this.f9480b.compare(obj, hVar.getKey());
            if (compare < 0) {
                hVar = hVar.b();
            } else if (compare == 0) {
                return hVar;
            } else {
                hVar = hVar.e();
            }
        }
        return null;
    }

    public final boolean isEmpty() {
        return this.f9479a.isEmpty();
    }

    public final Iterator iterator() {
        return new d(this.f9479a, this.f9480b, false);
    }

    public final boolean k(Object obj) {
        if (C(obj) != null) {
            return true;
        }
        return false;
    }

    public final Iterator s() {
        return new d(this.f9479a, this.f9480b, true);
    }

    public final int size() {
        return this.f9479a.size();
    }

    public final Object t(C1048c cVar) {
        h C6 = C(cVar);
        if (C6 != null) {
            return C6.getValue();
        }
        return null;
    }

    public final Comparator v() {
        return this.f9480b;
    }

    public final Object w() {
        return this.f9479a.i().getKey();
    }

    public final Object x() {
        return this.f9479a.h().getKey();
    }

    public final Object y(Object obj) {
        h hVar = this.f9479a;
        h hVar2 = null;
        while (!hVar.isEmpty()) {
            int compare = this.f9480b.compare(obj, hVar.getKey());
            if (compare == 0) {
                if (!hVar.b().isEmpty()) {
                    h b6 = hVar.b();
                    while (!b6.e().isEmpty()) {
                        b6 = b6.e();
                    }
                    return b6.getKey();
                } else if (hVar2 != null) {
                    return hVar2.getKey();
                } else {
                    return null;
                }
            } else if (compare < 0) {
                hVar = hVar.b();
            } else {
                hVar2 = hVar;
                hVar = hVar.e();
            }
        }
        throw new IllegalArgumentException("Couldn't find predecessor key of non-present key: " + obj);
    }

    public final void z(b bVar) {
        this.f9479a.c(bVar);
    }
}
