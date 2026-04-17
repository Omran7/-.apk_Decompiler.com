package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class n0 extends o0 {
    public final boolean c(Object obj, long j6) {
        return this.f6840a.getBoolean(obj, j6);
    }

    public final byte d(Object obj, long j6) {
        return this.f6840a.getByte(obj, j6);
    }

    public final double e(Object obj, long j6) {
        return this.f6840a.getDouble(obj, j6);
    }

    public final float f(Object obj, long j6) {
        return this.f6840a.getFloat(obj, j6);
    }

    public final void k(Object obj, long j6, boolean z3) {
        this.f6840a.putBoolean(obj, j6, z3);
    }

    public final void l(Object obj, long j6, byte b6) {
        this.f6840a.putByte(obj, j6, b6);
    }

    public final void m(Object obj, long j6, double d) {
        this.f6840a.putDouble(obj, j6, d);
    }

    public final void n(Object obj, long j6, float f6) {
        this.f6840a.putFloat(obj, j6, f6);
    }

    public final boolean r() {
        Class<Object> cls = Object.class;
        if (!super.r()) {
            return false;
        }
        try {
            Class<?> cls2 = this.f6840a.getClass();
            Class cls3 = Long.TYPE;
            cls2.getMethod("getByte", new Class[]{cls, cls3});
            cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
            cls2.getMethod("getBoolean", new Class[]{cls, cls3});
            cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
            cls2.getMethod("getFloat", new Class[]{cls, cls3});
            cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
            cls2.getMethod("getDouble", new Class[]{cls, cls3});
            cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
            return true;
        } catch (Throwable th) {
            p0.a(th);
            return false;
        }
    }

    public final boolean s() {
        Class<Object> cls = Object.class;
        Unsafe unsafe = this.f6840a;
        if (unsafe != null) {
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                if (p0.e() != null) {
                    try {
                        Class<?> cls4 = this.f6840a.getClass();
                        cls4.getMethod("getByte", new Class[]{cls3});
                        cls4.getMethod("putByte", new Class[]{cls3, Byte.TYPE});
                        cls4.getMethod("getInt", new Class[]{cls3});
                        cls4.getMethod("putInt", new Class[]{cls3, Integer.TYPE});
                        cls4.getMethod("getLong", new Class[]{cls3});
                        cls4.getMethod("putLong", new Class[]{cls3, cls3});
                        cls4.getMethod("copyMemory", new Class[]{cls3, cls3, cls3});
                        cls4.getMethod("copyMemory", new Class[]{cls, cls3, cls, cls3, cls3});
                        return true;
                    } catch (Throwable th) {
                        p0.a(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                p0.a(th2);
            }
        }
        return false;
    }
}
