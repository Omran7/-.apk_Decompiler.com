package e1;

import l5.C0797a;

/* renamed from: e1.a  reason: case insensitive filesystem */
public final class C0482a implements C0797a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f7569c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile C0483b f7570a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f7571b;

    /* JADX WARNING: type inference failed for: r0v1, types: [e1.a, java.lang.Object, l5.a] */
    public static C0797a a(C0483b bVar) {
        if (bVar instanceof C0482a) {
            return bVar;
        }
        ? obj = new Object();
        obj.f7571b = f7569c;
        obj.f7570a = bVar;
        return obj;
    }

    public final Object get() {
        Object obj = this.f7571b;
        Object obj2 = f7569c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f7571b;
                    if (obj == obj2) {
                        obj = this.f7570a.get();
                        Object obj3 = this.f7571b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f7571b = obj;
                        this.f7570a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
