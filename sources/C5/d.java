package C5;

import R2.b;
import java.util.Iterator;
import y5.a;

public abstract class d implements Iterable, a {

    /* renamed from: a  reason: collision with root package name */
    public final int f480a;

    /* renamed from: b  reason: collision with root package name */
    public final int f481b;

    /* renamed from: c  reason: collision with root package name */
    public final int f482c;

    public d(int i2, int i5, int i6) {
        if (i6 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i6 != Integer.MIN_VALUE) {
            this.f480a = i2;
            this.f481b = b.U(i2, i5, i6);
            this.f482c = i6;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public final Iterator iterator() {
        return new e(this.f480a, this.f481b, this.f482c);
    }
}
