package k3;

import java.util.Iterator;

public final class l implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public final long f9477a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9478b;

    public l(int i2) {
        int i5 = i2 + 1;
        int floor = (int) Math.floor(Math.log((double) i5) / Math.log(2.0d));
        this.f9478b = floor;
        this.f9477a = (((long) Math.pow(2.0d, (double) floor)) - 1) & ((long) i5);
    }

    public final Iterator iterator() {
        return new k(this);
    }
}
