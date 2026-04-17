package A2;

import java.util.Iterator;

public final class r extends g {
    public final transient Object d;

    public r(Object obj) {
        this.d = obj;
    }

    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final Iterator iterator() {
        return new h(this.d);
    }

    public final int k(Object[] objArr) {
        objArr[0] = this.d;
        return 1;
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2);
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
