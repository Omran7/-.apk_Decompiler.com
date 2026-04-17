package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final Unsafe f6840a;

    public o0(Unsafe unsafe) {
        this.f6840a = unsafe;
    }

    public final int a(Class cls) {
        return this.f6840a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f6840a.arrayIndexScale(cls);
    }

    public abstract boolean c(Object obj, long j6);

    public abstract byte d(Object obj, long j6);

    public abstract double e(Object obj, long j6);

    public abstract float f(Object obj, long j6);

    public final int g(Object obj, long j6) {
        return this.f6840a.getInt(obj, j6);
    }

    public final long h(Object obj, long j6) {
        return this.f6840a.getLong(obj, j6);
    }

    public final Object i(Object obj, long j6) {
        return this.f6840a.getObject(obj, j6);
    }

    public final long j(Field field) {
        return this.f6840a.objectFieldOffset(field);
    }

    public abstract void k(Object obj, long j6, boolean z3);

    public abstract void l(Object obj, long j6, byte b6);

    public abstract void m(Object obj, long j6, double d);

    public abstract void n(Object obj, long j6, float f6);

    public final void o(long j6, Object obj, int i2) {
        this.f6840a.putInt(obj, j6, i2);
    }

    public final void p(Object obj, long j6, long j7) {
        this.f6840a.putLong(obj, j6, j7);
    }

    public final void q(Object obj, long j6, Object obj2) {
        this.f6840a.putObject(obj, j6, obj2);
    }

    public boolean r() {
        Class<Class> cls = Class.class;
        Class<Object> cls2 = Object.class;
        Unsafe unsafe = this.f6840a;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls3 = unsafe.getClass();
            cls3.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls3.getMethod("arrayBaseOffset", new Class[]{cls});
            cls3.getMethod("arrayIndexScale", new Class[]{cls});
            Class cls4 = Long.TYPE;
            cls3.getMethod("getInt", new Class[]{cls2, cls4});
            cls3.getMethod("putInt", new Class[]{cls2, cls4, Integer.TYPE});
            cls3.getMethod("getLong", new Class[]{cls2, cls4});
            cls3.getMethod("putLong", new Class[]{cls2, cls4, cls4});
            cls3.getMethod("getObject", new Class[]{cls2, cls4});
            cls3.getMethod("putObject", new Class[]{cls2, cls4, cls2});
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    public abstract boolean s();
}
