package y2;

public final class g implements i {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f12704c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile h f12705a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f12706b;

    /* JADX WARNING: type inference failed for: r0v1, types: [y2.g, java.lang.Object] */
    public static g b(h hVar) {
        if (hVar instanceof g) {
            return (g) hVar;
        }
        ? obj = new Object();
        obj.f12706b = f12704c;
        obj.f12705a = hVar;
        return obj;
    }

    public final Object a() {
        Object obj = this.f12706b;
        Object obj2 = f12704c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f12706b;
                    if (obj == obj2) {
                        obj = this.f12705a.a();
                        Object obj3 = this.f12706b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f12706b = obj;
                        this.f12705a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
