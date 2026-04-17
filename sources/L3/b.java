package L3;

import M3.c;
import R2.i;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import h0.C0552a;
import java.lang.reflect.InvocationTargetException;
import o3.d;

public final /* synthetic */ class b implements K3.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1712a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1713b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f1712a = i2;
        this.f1713b = obj;
    }

    public final Object get() {
        switch (this.f1712a) {
            case 0:
                return new c((i) this.f1713b);
            case 1:
                String str = (String) this.f1713b;
                try {
                    Class<?> cls = Class.forName(str);
                    if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                        return (ComponentRegistrar) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
                    }
                    throw new RuntimeException("Class " + str + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                } catch (ClassNotFoundException unused) {
                    Log.w("ComponentDiscovery", "Class " + str + " is not an found.");
                    return null;
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(C0552a.o("Could not instantiate ", str, "."), e6);
                } catch (InstantiationException e7) {
                    throw new RuntimeException(C0552a.o("Could not instantiate ", str, "."), e7);
                } catch (NoSuchMethodException e8) {
                    throw new RuntimeException(d.i("Could not instantiate ", str), e8);
                } catch (InvocationTargetException e9) {
                    throw new RuntimeException(d.i("Could not instantiate ", str), e9);
                }
            default:
                return (ComponentRegistrar) this.f1713b;
        }
    }
}
