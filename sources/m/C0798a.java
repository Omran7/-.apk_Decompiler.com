package m;

import java.util.HashMap;

/* renamed from: m.a  reason: case insensitive filesystem */
public final class C0798a extends f {

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f9828e = new HashMap();

    public final c k(Object obj) {
        return (c) this.f9828e.get(obj);
    }

    public final Object t(Object obj) {
        Object t6 = super.t(obj);
        this.f9828e.remove(obj);
        return t6;
    }
}
