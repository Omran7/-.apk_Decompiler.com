package androidx.fragment.app;

import h0.C0552a;
import java.lang.reflect.InvocationTargetException;
import n.j;

public final class C {

    /* renamed from: b  reason: collision with root package name */
    public static final j f4974b = new j(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ I f4975a;

    public C(I i2) {
        this.f4975a = i2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        j jVar = f4974b;
        j jVar2 = (j) jVar.get(classLoader);
        if (jVar2 == null) {
            jVar2 = new j(0);
            jVar.put(classLoader, jVar2);
        }
        Class cls = (Class) jVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        jVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(C0552a.o("Unable to instantiate fragment ", str, ": make sure class name exists"), e6);
        } catch (ClassCastException e7) {
            throw new RuntimeException(C0552a.o("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e7);
        }
    }

    public final C0286s a(String str) {
        try {
            return (C0286s) c(this.f4975a.f5014t.f5193q.getClassLoader(), str).getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (InstantiationException e6) {
            throw new RuntimeException(C0552a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(C0552a.o("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e7);
        } catch (NoSuchMethodException e8) {
            throw new RuntimeException(C0552a.o("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(C0552a.o("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e9);
        }
    }
}
