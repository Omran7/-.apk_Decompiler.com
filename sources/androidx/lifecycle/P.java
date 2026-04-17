package androidx.lifecycle;

import kotlin.jvm.internal.j;

public class P implements S {

    /* renamed from: a  reason: collision with root package name */
    public static final P f5248a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final P f5249b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static P f5250c;

    public O a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
            j.d(newInstance, "{\n                modelC…wInstance()\n            }");
            return (O) newInstance;
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("Cannot create an instance of " + cls, e6);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Cannot create an instance of " + cls, e7);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Cannot create an instance of " + cls, e8);
        }
    }
}
