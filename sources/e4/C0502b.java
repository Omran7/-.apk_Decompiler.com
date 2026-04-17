package e4;

import com.bumptech.glide.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: e4.b  reason: case insensitive filesystem */
public final class C0502b extends c {

    /* renamed from: w  reason: collision with root package name */
    public final Method f7665w;

    /* renamed from: x  reason: collision with root package name */
    public final Method f7666x;

    /* renamed from: y  reason: collision with root package name */
    public final Method f7667y;

    /* renamed from: z  reason: collision with root package name */
    public final Method f7668z;

    public C0502b() {
        Class<Class> cls = Class.class;
        this.f7665w = cls.getMethod("isRecord", (Class[]) null);
        Method method = cls.getMethod("getRecordComponents", (Class[]) null);
        this.f7666x = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f7667y = componentType.getMethod("getName", (Class[]) null);
        this.f7668z = componentType.getMethod("getType", (Class[]) null);
    }

    public final String[] O(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f7666x.invoke(cls, (Object[]) null);
            String[] strArr = new String[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                strArr[i2] = (String) this.f7667y.invoke(objArr[i2], (Object[]) null);
            }
            return strArr;
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    public final boolean a0(Class cls) {
        try {
            return ((Boolean) this.f7665w.invoke(cls, (Object[]) null)).booleanValue();
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    public final Method t(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), (Class[]) null);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }

    public final Constructor u(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f7666x.invoke(cls, (Object[]) null);
            Class[] clsArr = new Class[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                clsArr[i2] = (Class) this.f7668z.invoke(objArr[i2], (Object[]) null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e6) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e6);
        }
    }
}
