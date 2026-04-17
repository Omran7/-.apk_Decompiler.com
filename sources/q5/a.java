package q5;

import I1.b;
import c1.i;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.j;
import o5.d;

public abstract class a implements d, d, Serializable {
    private final d completion;

    public a(d dVar) {
        this.completion = dVar;
    }

    public d create(d dVar) {
        j.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        d dVar = this.completion;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    public final d getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int i2;
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        Integer num;
        int i5;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        int v6 = eVar.v();
        if (v6 <= 1) {
            int i6 = -1;
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj4 = declaredField.get(this);
                if (obj4 instanceof Integer) {
                    num = (Integer) obj4;
                } else {
                    num = null;
                }
                if (num != null) {
                    i5 = num.intValue();
                } else {
                    i5 = 0;
                }
                i2 = i5 - 1;
            } catch (Exception unused) {
                i2 = -1;
            }
            if (i2 >= 0) {
                i6 = eVar.l()[i2];
            }
            i iVar = f.f11124b;
            i iVar2 = f.f11123a;
            if (iVar == null) {
                try {
                    i iVar3 = new i((Object) Class.class.getDeclaredMethod("getModule", (Class[]) null), (Object) getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class[]) null), (Object) getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class[]) null), 15);
                    f.f11124b = iVar3;
                    iVar = iVar3;
                } catch (Exception unused2) {
                    f.f11124b = iVar2;
                    iVar = iVar2;
                }
            }
            if (iVar != iVar2) {
                Method method = (Method) iVar.f5605b;
                if (method != null) {
                    obj = method.invoke(getClass(), (Object[]) null);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    Method method2 = (Method) iVar.f5606c;
                    if (method2 != null) {
                        obj2 = method2.invoke(obj, (Object[]) null);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 != null) {
                        Method method3 = (Method) iVar.d;
                        if (method3 != null) {
                            obj3 = method3.invoke(obj2, (Object[]) null);
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof String) {
                            str2 = (String) obj3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = eVar.c();
            } else {
                str = str2 + '/' + eVar.c();
            }
            return new StackTraceElement(str, eVar.m(), eVar.f(), i6);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v6 + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public final void resumeWith(Object obj) {
        d dVar = this;
        while (true) {
            a aVar = (a) dVar;
            d dVar2 = aVar.completion;
            j.b(dVar2);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == p5.a.f11033a) {
                    return;
                }
            } catch (Throwable th) {
                obj = b.r(th);
            }
            aVar.releaseIntercepted();
            if (dVar2 instanceof a) {
                dVar = dVar2;
            } else {
                dVar2.resumeWith(obj);
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public d create(Object obj, d dVar) {
        j.e(dVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
