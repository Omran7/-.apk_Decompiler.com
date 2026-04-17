package k3;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque f9466a = new ArrayDeque();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9467b;

    public d(h hVar, Comparator comparator, boolean z3) {
        this.f9467b = z3;
        while (!hVar.isEmpty()) {
            this.f9466a.push((j) hVar);
            if (z3) {
                hVar = hVar.e();
            } else {
                hVar = hVar.b();
            }
        }
    }

    public final boolean hasNext() {
        if (this.f9466a.size() > 0) {
            return true;
        }
        return false;
    }

    public final Object next() {
        ArrayDeque arrayDeque = this.f9466a;
        try {
            j jVar = (j) arrayDeque.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(jVar.f9471a, jVar.f9472b);
            if (this.f9467b) {
                for (h hVar = jVar.f9473c; !hVar.isEmpty(); hVar = hVar.e()) {
                    arrayDeque.push((j) hVar);
                }
            } else {
                for (h hVar2 = jVar.d; !hVar2.isEmpty(); hVar2 = hVar2.b()) {
                    arrayDeque.push((j) hVar2);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
