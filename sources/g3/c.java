package G3;

import L5.b;

public final class c implements b, b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f840a;

    public /* synthetic */ c(Object obj) {
        this.f840a = obj;
    }

    public static c a(Object obj) {
        if (obj != null) {
            return new c(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    public Object get() {
        return this.f840a;
    }
}
