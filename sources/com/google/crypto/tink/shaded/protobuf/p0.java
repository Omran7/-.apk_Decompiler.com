package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

public abstract class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f6843a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f6844b = C0398c.f6791a;

    /* renamed from: c  reason: collision with root package name */
    public static final o0 f6845c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f6846e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f6847f = ((long) c(byte[].class));
    public static final boolean g;

    static {
        boolean z3;
        boolean z4;
        Unsafe m6 = m();
        f6843a = m6;
        boolean f6 = f(Long.TYPE);
        boolean f7 = f(Integer.TYPE);
        o0 o0Var = null;
        if (m6 != null) {
            if (!C0398c.a()) {
                o0Var = new o0(m6);
            } else if (f6) {
                o0Var = new m0(m6, 1);
            } else if (f7) {
                o0Var = new m0(m6, 0);
            }
        }
        f6845c = o0Var;
        boolean z5 = false;
        if (o0Var == null) {
            z3 = false;
        } else {
            z3 = o0Var.s();
        }
        d = z3;
        if (o0Var == null) {
            z4 = false;
        } else {
            z4 = o0Var.r();
        }
        f6846e = z4;
        Class<boolean[]> cls = boolean[].class;
        c(cls);
        d(cls);
        Class<int[]> cls2 = int[].class;
        c(cls2);
        d(cls2);
        Class<long[]> cls3 = long[].class;
        c(cls3);
        d(cls3);
        Class<float[]> cls4 = float[].class;
        c(cls4);
        d(cls4);
        Class<double[]> cls5 = double[].class;
        c(cls5);
        d(cls5);
        Class<Object[]> cls6 = Object[].class;
        c(cls6);
        d(cls6);
        Field e6 = e();
        if (!(e6 == null || o0Var == null)) {
            o0Var.j(e6);
        }
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z5 = true;
        }
        g = z5;
    }

    public static void a(Throwable th) {
        Logger logger = Logger.getLogger(p0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Object b(Class cls) {
        try {
            return f6843a.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    public static int c(Class cls) {
        if (f6846e) {
            return f6845c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f6846e) {
            f6845c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        Class<Buffer> cls = Buffer.class;
        if (C0398c.a()) {
            try {
                field2 = cls.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = cls.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C0398c.a()) {
            return false;
        }
        try {
            Class cls3 = f6844b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte g(byte[] bArr, long j6) {
        return f6845c.d(bArr, f6847f + j6);
    }

    public static byte h(Object obj, long j6) {
        return (byte) ((f6845c.g(obj, -4 & j6) >>> ((int) (((~j6) & 3) << 3))) & 255);
    }

    public static byte i(Object obj, long j6) {
        return (byte) ((f6845c.g(obj, -4 & j6) >>> ((int) ((j6 & 3) << 3))) & 255);
    }

    public static int j(C0418x xVar, long j6) {
        return f6845c.g(xVar, j6);
    }

    public static long k(C0418x xVar, long j6) {
        return f6845c.h(xVar, j6);
    }

    public static Object l(C0418x xVar, long j6) {
        return f6845c.i(xVar, j6);
    }

    public static Unsafe m() {
        try {
            return (Unsafe) AccessController.doPrivileged(new l0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void n(Object obj, long j6, boolean z3) {
        f6845c.k(obj, j6, z3);
    }

    public static void o(byte[] bArr, long j6, byte b6) {
        f6845c.l(bArr, f6847f + j6, b6);
    }

    public static void p(Object obj, long j6, byte b6) {
        long j7 = -4 & j6;
        int g5 = f6845c.g(obj, j7);
        int i2 = ((~((int) j6)) & 3) << 3;
        t(j7, obj, ((255 & b6) << i2) | (g5 & (~(255 << i2))));
    }

    public static void q(Object obj, long j6, byte b6) {
        long j7 = -4 & j6;
        int i2 = (((int) j6) & 3) << 3;
        t(j7, obj, ((255 & b6) << i2) | (f6845c.g(obj, j7) & (~(255 << i2))));
    }

    public static void r(Object obj, long j6, double d6) {
        f6845c.m(obj, j6, d6);
    }

    public static void s(Object obj, long j6, float f6) {
        f6845c.n(obj, j6, f6);
    }

    public static void t(long j6, Object obj, int i2) {
        f6845c.o(j6, obj, i2);
    }

    public static void u(Object obj, long j6, long j7) {
        f6845c.p(obj, j6, j7);
    }

    public static void v(Object obj, long j6, Object obj2) {
        f6845c.q(obj, j6, obj2);
    }
}
