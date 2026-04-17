package A2;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class q extends AbstractSet {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Set f59a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Set f60b;

    public q(Set set, Set set2) {
        this.f59a = set;
        this.f60b = set2;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(Object obj) {
        if (this.f59a.contains(obj) || this.f60b.contains(obj)) {
            return true;
        }
        return false;
    }

    public final boolean isEmpty() {
        if (!this.f59a.isEmpty() || !this.f60b.isEmpty()) {
            return false;
        }
        return true;
    }

    public final Iterator iterator() {
        return new p(this);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        Set set = this.f59a;
        int size = set.size();
        for (Object contains : this.f60b) {
            if (!set.contains(contains)) {
                size++;
            }
        }
        return size;
    }
}
