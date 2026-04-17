package b4;

import X4.d;
import java.lang.reflect.Method;

public final class s extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5558b;

    public s(Method method) {
        this.f5558b = method;
    }

    public final Object a(Class cls) {
        String e6 = d.e(cls);
        if (e6 == null) {
            return this.f5558b.invoke((Object) null, new Object[]{cls, Object.class});
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e6));
    }
}
