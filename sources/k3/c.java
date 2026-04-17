package k3;

import I1.b;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import v3.C1048c;

public abstract class c implements Iterable {
    public abstract c A(Iterable iterable, Object obj);

    public abstract c B(Object obj);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!v().equals(cVar.v()) || size() != cVar.size()) {
            return false;
        }
        Iterator it2 = iterator();
        Iterator it3 = cVar.iterator();
        while (it2.hasNext()) {
            if (!((Map.Entry) it2.next()).equals(it3.next())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = v().hashCode();
        Iterator it2 = iterator();
        while (it2.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it2.next()).hashCode();
        }
        return hashCode;
    }

    public abstract boolean isEmpty();

    public abstract boolean k(Object obj);

    public abstract Iterator s();

    public abstract int size();

    public abstract Object t(C1048c cVar);

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it2 = iterator();
        boolean z3 = true;
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (z3) {
                z3 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    public abstract Comparator v();

    public abstract Object w();

    public abstract Object x();

    public abstract Object y(Object obj);

    public abstract void z(b bVar);
}
