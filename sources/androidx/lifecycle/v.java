package androidx.lifecycle;

import F5.i;
import I1.b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.jvm.internal.j;

public abstract class v {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f5281a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f5282b = new HashMap();

    public static void a(Constructor constructor, r rVar) {
        try {
            j.d(constructor.newInstance(new Object[]{rVar}), "{\n            constructo…tance(`object`)\n        }");
            throw new ClassCastException();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException(e7);
        } catch (InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        HashMap hashMap = f5281a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package packageR = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (packageR != null) {
                    str = packageR.getName();
                } else {
                    str = "";
                }
                j.d(str, "fullPackage");
                if (str.length() != 0) {
                    j.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    j.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                j.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = i.V0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(new Class[]{cls});
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap hashMap2 = f5282b;
            if (constructor != null) {
                hashMap2.put(cls, b.t0(constructor));
            } else {
                C0293d dVar = C0293d.f5263c;
                HashMap hashMap3 = dVar.f5265b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z3 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length) {
                                hashMap3.put(cls, Boolean.FALSE);
                                z3 = false;
                                break;
                            } else if (((A) declaredMethods[i5].getAnnotation(A.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                z3 = true;
                                break;
                            } else {
                                i5++;
                            }
                        }
                    } catch (NoClassDefFoundError e7) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
                    }
                }
                if (!z3) {
                    Class superclass = cls.getSuperclass();
                    Class<r> cls2 = r.class;
                    if (superclass == null || !cls2.isAssignableFrom(superclass)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        j.d(superclass, "superclass");
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            j.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class[] interfaces = cls.getInterfaces();
                    j.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length2) {
                            Class cls3 = interfaces[i6];
                            if (cls3 == null || !cls2.isAssignableFrom(cls3)) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            if (z5) {
                                j.d(cls3, "intrface");
                                if (b(cls3) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls3);
                                j.b(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i6++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
