package k3;

import S3.z;
import T1.C0208t;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final c f9468a;

    public e(List list, Comparator comparator) {
        c cVar;
        Map emptyMap = Collections.emptyMap();
        if (list.size() < 25) {
            cVar = C0762b.C(list, emptyMap, comparator);
        } else {
            cVar = z.k(list, emptyMap, comparator);
        }
        this.f9468a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f9468a.equals(((e) obj).f9468a);
    }

    public final int hashCode() {
        return this.f9468a.hashCode();
    }

    public final Iterator iterator() {
        return new C0208t(this.f9468a.iterator(), 1);
    }

    public e(c cVar) {
        this.f9468a = cVar;
    }
}
