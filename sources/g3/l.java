package g3;

import K3.b;

public final class l implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f8034c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f8035a = f8034c;

    /* renamed from: b  reason: collision with root package name */
    public volatile b f8036b;

    public l(b bVar) {
        this.f8036b = bVar;
    }

    public final Object get() {
        Object obj = this.f8035a;
        Object obj2 = f8034c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f8035a;
                    if (obj == obj2) {
                        obj = this.f8036b.get();
                        this.f8035a = obj;
                        this.f8036b = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
