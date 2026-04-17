package kotlin.jvm.internal;

import h0.C0552a;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f9654a = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }

    public static void b(Object obj) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException();
            f(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str);
            f(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
            f(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            Class<j> cls = j.class;
            String name = cls.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            StringBuilder u6 = C0552a.u("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            u6.append(str);
            NullPointerException nullPointerException = new NullPointerException(u6.toString());
            f(nullPointerException, cls.getName());
            throw nullPointerException;
        }
    }

    public static void f(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i2 = -1;
        for (int i5 = 0; i5 < length; i5++) {
            if (str.equals(stackTrace[i5].getClassName())) {
                i2 = i5;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i2 + 1, length));
    }

    public static void g(String str) {
        RuntimeException runtimeException = new RuntimeException(C0552a.o("lateinit property ", str, " has not been initialized"));
        f(runtimeException, j.class.getName());
        throw runtimeException;
    }

    public static final Object[] h(Collection collection) {
        int size = collection.size();
        Object[] objArr = f9654a;
        if (size == 0) {
            return objArr;
        }
        Iterator it2 = collection.iterator();
        if (!it2.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i5 = i2 + 1;
            objArr2[i2] = it2.next();
            if (i5 >= objArr2.length) {
                if (!it2.hasNext()) {
                    return objArr2;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    i6 = 2147483645;
                    if (i5 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i6);
                d(objArr2, "copyOf(...)");
            } else if (!it2.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i5);
                d(copyOf, "copyOf(...)");
                return copyOf;
            }
            i2 = i5;
        }
    }

    public static final Object[] i(Collection collection, Object[] objArr) {
        Object[] objArr2;
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it2 = collection.iterator();
            if (it2.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    c(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i5 = i2 + 1;
                    objArr2[i2] = it2.next();
                    if (i5 >= objArr2.length) {
                        if (!it2.hasNext()) {
                            return objArr2;
                        }
                        int i6 = ((i5 * 3) + 1) >>> 1;
                        if (i6 <= i5) {
                            i6 = 2147483645;
                            if (i5 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i6);
                        d(objArr2, "copyOf(...)");
                    } else if (!it2.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i5] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i5);
                        d(copyOf, "copyOf(...)");
                        return copyOf;
                    }
                    i2 = i5;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }
}
