package com.google.crypto.tink.shaded.protobuf;

import E2.d;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x  reason: case insensitive filesystem */
public abstract class C0418x extends C0396a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C0418x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected g0 unknownFields = g0.f6805f;

    public C0418x() {
        this.memoizedHashCode = 0;
    }

    public static void g(C0418x xVar) {
        if (!o(xVar, true)) {
            throw new IOException(new f0().getMessage());
        }
    }

    public static C0418x l(Class cls) {
        C0418x xVar = defaultInstanceMap.get(cls);
        if (xVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException("Class initialization cannot fail.", e6);
            }
        }
        if (xVar == null) {
            xVar = ((C0418x) p0.b(cls)).a();
            if (xVar != null) {
                defaultInstanceMap.put(cls, xVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return xVar;
    }

    public static Object n(Method method, C0396a aVar, Object... objArr) {
        try {
            return method.invoke(aVar, objArr);
        } catch (IllegalAccessException e6) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e6);
        } catch (InvocationTargetException e7) {
            Throwable cause = e7.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final boolean o(C0418x xVar, boolean z3) {
        byte byteValue = ((Byte) xVar.k(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        a0 a0Var = a0.f6785c;
        a0Var.getClass();
        boolean e6 = a0Var.a(xVar.getClass()).e(xVar);
        if (z3) {
            xVar.k(2);
        }
        return e6;
    }

    public static C0418x t(C0418x xVar, C0404i iVar, C0411p pVar) {
        C0403h hVar = (C0403h) iVar;
        C0405j h = d.h(hVar.d, hVar.y(), hVar.size(), true);
        C0418x u6 = u(xVar, h, pVar);
        h.b(0);
        g(u6);
        return u6;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.IOException] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.crypto.tink.shaded.protobuf.C0418x u(com.google.crypto.tink.shaded.protobuf.C0418x r2, E2.d r3, com.google.crypto.tink.shaded.protobuf.C0411p r4) {
        /*
            com.google.crypto.tink.shaded.protobuf.x r2 = r2.s()
            com.google.crypto.tink.shaded.protobuf.a0 r0 = com.google.crypto.tink.shaded.protobuf.a0.f6785c     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            r0.getClass()     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            java.lang.Class r1 = r2.getClass()     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            com.google.crypto.tink.shaded.protobuf.d0 r0 = r0.a(r1)     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            java.lang.Object r1 = r3.f618b     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            com.google.crypto.tink.shaded.protobuf.l r1 = (com.google.crypto.tink.shaded.protobuf.C0407l) r1     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            if (r1 == 0) goto L_0x0018
            goto L_0x001d
        L_0x0018:
            com.google.crypto.tink.shaded.protobuf.l r1 = new com.google.crypto.tink.shaded.protobuf.l     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            r1.<init>(r3)     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
        L_0x001d:
            r0.f(r2, r1, r4)     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            r0.d(r2)     // Catch:{ D -> 0x002a, f0 -> 0x0028, IOException -> 0x0026, RuntimeException -> 0x0024 }
            return r2
        L_0x0024:
            r2 = move-exception
            goto L_0x002c
        L_0x0026:
            r2 = move-exception
            goto L_0x003c
        L_0x0028:
            r2 = move-exception
            goto L_0x0055
        L_0x002a:
            r2 = move-exception
            goto L_0x005f
        L_0x002c:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof com.google.crypto.tink.shaded.protobuf.D
            if (r3 == 0) goto L_0x003b
            java.lang.Throwable r2 = r2.getCause()
            com.google.crypto.tink.shaded.protobuf.D r2 = (com.google.crypto.tink.shaded.protobuf.D) r2
            throw r2
        L_0x003b:
            throw r2
        L_0x003c:
            java.lang.Throwable r3 = r2.getCause()
            boolean r3 = r3 instanceof com.google.crypto.tink.shaded.protobuf.D
            if (r3 == 0) goto L_0x004b
            java.lang.Throwable r2 = r2.getCause()
            com.google.crypto.tink.shaded.protobuf.D r2 = (com.google.crypto.tink.shaded.protobuf.D) r2
            throw r2
        L_0x004b:
            com.google.crypto.tink.shaded.protobuf.D r3 = new com.google.crypto.tink.shaded.protobuf.D
            java.lang.String r4 = r2.getMessage()
            r3.<init>(r4, r2)
            throw r3
        L_0x0055:
            com.google.crypto.tink.shaded.protobuf.D r3 = new com.google.crypto.tink.shaded.protobuf.D
            java.lang.String r2 = r2.getMessage()
            r3.<init>(r2)
            throw r3
        L_0x005f:
            boolean r3 = r2.f6744a
            if (r3 == 0) goto L_0x006d
            com.google.crypto.tink.shaded.protobuf.D r3 = new com.google.crypto.tink.shaded.protobuf.D
            java.lang.String r4 = r2.getMessage()
            r3.<init>(r4, r2)
            r2 = r3
        L_0x006d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C0418x.u(com.google.crypto.tink.shaded.protobuf.x, E2.d, com.google.crypto.tink.shaded.protobuf.p):com.google.crypto.tink.shaded.protobuf.x");
    }

    public static void v(Class cls, C0418x xVar) {
        xVar.q();
        defaultInstanceMap.put(cls, xVar);
    }

    public final int b(d0 d0Var) {
        int i2;
        int i5;
        if (p()) {
            if (d0Var == null) {
                a0 a0Var = a0.f6785c;
                a0Var.getClass();
                i5 = a0Var.a(getClass()).a(this);
            } else {
                i5 = d0Var.a(this);
            }
            if (i5 >= 0) {
                return i5;
            }
            throw new IllegalStateException(a.f(i5, "serialized size must be non-negative, was "));
        }
        int i6 = this.memoizedSerializedSize;
        if ((i6 & f.API_PRIORITY_OTHER) != Integer.MAX_VALUE) {
            return i6 & f.API_PRIORITY_OTHER;
        }
        if (d0Var == null) {
            a0 a0Var2 = a0.f6785c;
            a0Var2.getClass();
            i2 = a0Var2.a(getClass()).a(this);
        } else {
            i2 = d0Var.a(this);
        }
        w(i2);
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a0 a0Var = a0.f6785c;
        a0Var.getClass();
        return a0Var.a(getClass()).g(this, (C0418x) obj);
    }

    public final void f(C0408m mVar) {
        a0 a0Var = a0.f6785c;
        a0Var.getClass();
        d0 a6 = a0Var.a(getClass());
        M m6 = mVar.f6834p;
        if (m6 == null) {
            m6 = new M(mVar);
        }
        a6.h(this, m6);
    }

    public final void h() {
        this.memoizedHashCode = 0;
    }

    public final int hashCode() {
        if (p()) {
            a0 a0Var = a0.f6785c;
            a0Var.getClass();
            return a0Var.a(getClass()).j(this);
        }
        if (this.memoizedHashCode == 0) {
            a0 a0Var2 = a0.f6785c;
            a0Var2.getClass();
            this.memoizedHashCode = a0Var2.a(getClass()).j(this);
        }
        return this.memoizedHashCode;
    }

    public final void i() {
        w(f.API_PRIORITY_OTHER);
    }

    public final C0416v j() {
        return (C0416v) k(5);
    }

    public abstract Object k(int i2);

    /* renamed from: m */
    public final C0418x a() {
        return (C0418x) k(6);
    }

    public final boolean p() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public final void q() {
        this.memoizedSerializedSize &= f.API_PRIORITY_OTHER;
    }

    /* renamed from: r */
    public final C0416v d() {
        return (C0416v) k(5);
    }

    public final C0418x s() {
        return (C0418x) k(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = T.f6766a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        T.c(this, sb, 0);
        return sb.toString();
    }

    public final void w(int i2) {
        if (i2 >= 0) {
            this.memoizedSerializedSize = (i2 & f.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(a.f(i2, "serialized size must be non-negative, was "));
    }

    public final C0416v x() {
        C0416v vVar = (C0416v) k(5);
        if (!vVar.f6858a.equals(this)) {
            vVar.e();
            C0416v.f(vVar.f6859b, this);
        }
        return vVar;
    }
}
