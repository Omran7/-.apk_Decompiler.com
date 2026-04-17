package b4;

import X4.d;
import java.lang.reflect.Method;

public final class q extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5554b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f5555c;

    public q(Object obj, Method method) {
        this.f5554b = method;
        this.f5555c = obj;
    }

    public final Object a(Class cls) {
        String e6 = d.e(cls);
        if (e6 == null) {
            return this.f5554b.invoke(this.f5555c, new Object[]{cls});
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e6));
    }
}
