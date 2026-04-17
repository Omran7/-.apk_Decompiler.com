package androidx.lifecycle;

import android.app.Application;
import c0.C0337c;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.j;

public final class Q extends P {

    /* renamed from: e  reason: collision with root package name */
    public static Q f5251e;
    public final Application d;

    public Q(Application application) {
        this.d = application;
    }

    public final O a(Class cls) {
        Application application = this.d;
        if (application != null) {
            return c(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public final O b(Class cls, C0337c cVar) {
        if (this.d != null) {
            return a(cls);
        }
        Application application = (Application) cVar.f5577a.get(P.f5248a);
        if (application != null) {
            return c(cls, application);
        }
        if (!C0290a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final O c(Class cls, Application application) {
        if (!C0290a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            O o6 = (O) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
            j.d(o6, "{\n                try {\n…          }\n            }");
            return o6;
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        }
    }
}
