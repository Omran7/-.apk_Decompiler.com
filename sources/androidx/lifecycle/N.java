package androidx.lifecycle;

import I1.b;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j;
import n5.C0874f;
import n5.C0876h;

public abstract class N {

    /* renamed from: a  reason: collision with root package name */
    public static final List f5243a;

    /* renamed from: b  reason: collision with root package name */
    public static final List f5244b;

    static {
        Class<H> cls = H.class;
        f5243a = C0876h.S0(Application.class, cls);
        f5244b = b.t0(cls);
    }

    public static final Constructor a(Class cls, List list) {
        j.e(list, "signature");
        Constructor[] constructors = cls.getConstructors();
        j.d(constructors, "modelClass.constructors");
        int length = constructors.length;
        int i2 = 0;
        while (i2 < length) {
            Constructor constructor = constructors[i2];
            Class[] parameterTypes = constructor.getParameterTypes();
            j.d(parameterTypes, "constructor.parameterTypes");
            List A12 = C0874f.A1(parameterTypes);
            if (list.equals(A12)) {
                return constructor;
            }
            if (list.size() != A12.size() || !A12.containsAll(list)) {
                i2++;
            } else {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final O b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (O) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Failed to access " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e8.getCause());
        }
    }
}
