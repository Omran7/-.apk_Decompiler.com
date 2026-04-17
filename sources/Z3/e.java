package Z3;

import java.util.ArrayList;
import java.util.Iterator;

public final class e extends f implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f4526a = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof e) && ((e) obj).f4526a.equals(this.f4526a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4526a.hashCode();
    }

    public final Iterator iterator() {
        return this.f4526a.iterator();
    }
}
