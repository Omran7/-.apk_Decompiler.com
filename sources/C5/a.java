package C5;

import R2.b;
import java.util.Iterator;

public abstract class a implements Iterable, y5.a {

    /* renamed from: a  reason: collision with root package name */
    public final char f474a;

    /* renamed from: b  reason: collision with root package name */
    public final char f475b;

    /* renamed from: c  reason: collision with root package name */
    public final int f476c = 1;

    public a(char c3, char c6) {
        this.f474a = c3;
        this.f475b = (char) b.U(c3, c6, 1);
    }

    public final Iterator iterator() {
        return new b(this.f474a, this.f475b, this.f476c);
    }
}
