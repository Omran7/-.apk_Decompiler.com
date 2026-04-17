package k3;

import java.util.AbstractMap;
import java.util.Iterator;

/* renamed from: k3.a  reason: case insensitive filesystem */
public final class C0761a implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public int f9460a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9461b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0762b f9462c;

    public C0761a(C0762b bVar, int i2, boolean z3) {
        this.f9462c = bVar;
        this.f9461b = z3;
        this.f9460a = i2;
    }

    public final boolean hasNext() {
        if (this.f9461b) {
            if (this.f9460a < 0) {
                return false;
            }
        } else if (this.f9460a >= this.f9462c.f9463a.length) {
            return false;
        }
        return true;
    }

    public final Object next() {
        int i2;
        C0762b bVar = this.f9462c;
        Object[] objArr = bVar.f9463a;
        int i5 = this.f9460a;
        Object obj = objArr[i5];
        Object obj2 = bVar.f9464b[i5];
        if (this.f9461b) {
            i2 = i5 - 1;
        } else {
            i2 = i5 + 1;
        }
        this.f9460a = i2;
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
    }
}
