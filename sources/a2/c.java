package A2;

import java.util.Iterator;
import java.util.ListIterator;
import w5.a;

public final class c extends d {

    /* renamed from: c  reason: collision with root package name */
    public final transient int f22c;
    public final transient int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ d f23e;

    public c(d dVar, int i2, int i5) {
        this.f23e = dVar;
        this.f22c = i2;
        this.d = i5;
    }

    public final Object get(int i2) {
        a.b(i2, this.d);
        return this.f23e.get(i2 + this.f22c);
    }

    public final Iterator iterator() {
        return listIterator(0);
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final int size() {
        return this.d;
    }

    public final Object[] t() {
        return this.f23e.t();
    }

    public final int v() {
        return this.f23e.w() + this.f22c + this.d;
    }

    public final int w() {
        return this.f23e.w() + this.f22c;
    }

    /* renamed from: z */
    public final d subList(int i2, int i5) {
        a.d(i2, i5, this.d);
        int i6 = this.f22c;
        return this.f23e.subList(i2 + i6, i5 + i6);
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
        return listIterator(i2);
    }
}
