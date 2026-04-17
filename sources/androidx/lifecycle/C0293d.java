package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d  reason: case insensitive filesystem */
public final class C0293d {

    /* renamed from: c  reason: collision with root package name */
    public static final C0293d f5263c = new C0293d();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5264a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5265b = new HashMap();

    public static void b(HashMap hashMap, C0292c cVar, C0302m mVar, Class cls) {
        C0302m mVar2 = (C0302m) hashMap.get(cVar);
        if (mVar2 != null && mVar != mVar2) {
            Method method = cVar.f5262b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + mVar2 + ", new value " + mVar);
        } else if (mVar2 == null) {
            hashMap.put(cVar, mVar);
        }
    }

    public final C0291b a(Class cls, Method[] methodArr) {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f5264a;
        if (superclass != null) {
            C0291b bVar = (C0291b) hashMap2.get(superclass);
            if (bVar == null) {
                bVar = a(superclass, (Method[]) null);
            }
            hashMap.putAll(bVar.f5260b);
        }
        for (Class cls2 : cls.getInterfaces()) {
            C0291b bVar2 = (C0291b) hashMap2.get(cls2);
            if (bVar2 == null) {
                bVar2 = a(cls2, (Method[]) null);
            }
            for (Map.Entry entry : bVar2.f5260b.entrySet()) {
                b(hashMap, (C0292c) entry.getKey(), (C0302m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            A a6 = (A) method.getAnnotation(A.class);
            if (a6 != null) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else if (C0307s.class.isAssignableFrom(parameterTypes[0])) {
                    i2 = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                C0302m value = a6.value();
                if (parameterTypes.length > 1) {
                    if (!C0302m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (value == C0302m.ON_ANY) {
                        i2 = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new C0292c(i2, method), value, cls);
                    z3 = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0291b bVar3 = new C0291b(hashMap);
        hashMap2.put(cls, bVar3);
        this.f5265b.put(cls, Boolean.valueOf(z3));
        return bVar3;
    }
}
