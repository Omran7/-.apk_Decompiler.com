package G3;

import l5.C0797a;

public final class a implements C0797a {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f837c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile b f838a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f839b;

    public final Object get() {
        Object obj = this.f839b;
        Object obj2 = f837c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f839b;
                    if (obj == obj2) {
                        obj = this.f838a.get();
                        Object obj3 = this.f839b;
                        if (obj3 != obj2) {
                            if (obj3 != obj) {
                                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                            }
                        }
                        this.f839b = obj;
                        this.f838a = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return obj;
    }
}
