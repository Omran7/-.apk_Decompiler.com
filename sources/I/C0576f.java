package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* renamed from: i.f  reason: case insensitive filesystem */
public final class C0576f implements MenuItem.OnMenuItemClickListener {

    /* renamed from: c  reason: collision with root package name */
    public static final Class[] f8193c = {MenuItem.class};

    /* renamed from: a  reason: collision with root package name */
    public Object f8194a;

    /* renamed from: b  reason: collision with root package name */
    public Method f8195b;

    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f8195b;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f8194a;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, new Object[]{menuItem})).booleanValue();
            }
            method.invoke(obj, new Object[]{menuItem});
            return true;
        } catch (Exception e6) {
            throw new RuntimeException(e6);
        }
    }
}
