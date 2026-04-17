package b4;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

public final class n extends p {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f5552b;

    public n(Method method) {
        this.f5552b = method;
    }

    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f5552b.invoke(accessibleObject, new Object[]{obj})).booleanValue();
        } catch (Exception e6) {
            throw new RuntimeException("Failed invoking canAccess", e6);
        }
    }
}
