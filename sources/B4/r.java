package b4;

import X4.d;
import java.lang.reflect.Method;

public final class r extends u {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5556b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f5557c;

    public r(int i2, Method method) {
        this.f5556b = method;
        this.f5557c = i2;
    }

    public final Object a(Class cls) {
        String e6 = d.e(cls);
        if (e6 == null) {
            return this.f5556b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f5557c)});
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(e6));
    }
}
