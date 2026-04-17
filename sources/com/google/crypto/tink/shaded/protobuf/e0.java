package com.google.crypto.tink.shaded.protobuf;

import I0.x;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Class f6799a;

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f6800b = A(false);

    /* renamed from: c  reason: collision with root package name */
    public static final h0 f6801c = A(true);
    public static final h0 d = new Object();

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, com.google.crypto.tink.shaded.protobuf.h0] */
    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f6799a = cls;
    }

    public static h0 A(boolean z3) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (h0) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z3)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static void B(h0 h0Var, Object obj, Object obj2) {
        h0Var.getClass();
        C0418x xVar = (C0418x) obj;
        g0 g0Var = xVar.unknownFields;
        g0 g0Var2 = ((C0418x) obj2).unknownFields;
        g0 g0Var3 = g0.f6805f;
        if (!g0Var3.equals(g0Var2)) {
            if (g0Var3.equals(g0Var)) {
                int i2 = g0Var.f6806a + g0Var2.f6806a;
                int[] copyOf = Arrays.copyOf(g0Var.f6807b, i2);
                System.arraycopy(g0Var2.f6807b, 0, copyOf, g0Var.f6806a, g0Var2.f6806a);
                Object[] copyOf2 = Arrays.copyOf(g0Var.f6808c, i2);
                System.arraycopy(g0Var2.f6808c, 0, copyOf2, g0Var.f6806a, g0Var2.f6806a);
                g0Var = new g0(i2, copyOf, copyOf2, true);
            } else {
                g0Var.getClass();
                if (!g0Var2.equals(g0Var3)) {
                    if (g0Var.f6809e) {
                        int i5 = g0Var.f6806a + g0Var2.f6806a;
                        g0Var.a(i5);
                        System.arraycopy(g0Var2.f6807b, 0, g0Var.f6807b, g0Var.f6806a, g0Var2.f6806a);
                        System.arraycopy(g0Var2.f6808c, 0, g0Var.f6808c, g0Var.f6806a, g0Var2.f6806a);
                        g0Var.f6806a = i5;
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }
        xVar.unknownFields = g0Var;
    }

    public static boolean C(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static void D(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            if (z3) {
                mVar.w1(i2, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    ((Boolean) list.get(i6)).getClass();
                    Logger logger = C0408m.f6832t;
                    i5++;
                }
                mVar.x1(i5);
                for (int i7 = 0; i7 < list.size(); i7++) {
                    mVar.p1(((Boolean) list.get(i7)).booleanValue() ? (byte) 1 : 0);
                }
                return;
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                boolean booleanValue = ((Boolean) list.get(i8)).booleanValue();
                mVar.w1(i2, 0);
                mVar.p1(booleanValue ? (byte) 1 : 0);
            }
        }
    }

    public static void E(int i2, List list, M m6) {
        if (list != null && !list.isEmpty()) {
            m6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                C0404i iVar = (C0404i) list.get(i5);
                C0408m mVar = (C0408m) m6.f6761a;
                mVar.w1(i2, 2);
                mVar.x1(iVar.size());
                C0403h hVar = (C0403h) iVar;
                mVar.q1(hVar.d, hVar.y(), hVar.size());
            }
        }
    }

    public static void F(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    ((Double) list.get(i7)).getClass();
                    Logger logger = C0408m.f6832t;
                    i6 += 8;
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.u1(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                double doubleValue = ((Double) list.get(i5)).doubleValue();
                mVar.getClass();
                mVar.t1(i2, Double.doubleToRawLongBits(doubleValue));
                i5++;
            }
        }
    }

    public static void G(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            if (z3) {
                mVar.w1(i2, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0408m.c1(((Integer) list.get(i6)).intValue());
                }
                mVar.x1(i5);
                for (int i7 = 0; i7 < list.size(); i7++) {
                    mVar.v1(((Integer) list.get(i7)).intValue());
                }
                return;
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                mVar.w1(i2, 0);
                mVar.v1(intValue);
            }
        }
    }

    public static void H(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    ((Integer) list.get(i7)).getClass();
                    Logger logger = C0408m.f6832t;
                    i6 += 4;
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.s1(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                mVar.r1(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void I(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    ((Long) list.get(i7)).getClass();
                    Logger logger = C0408m.f6832t;
                    i6 += 8;
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.u1(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                mVar.t1(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void J(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    ((Float) list.get(i7)).getClass();
                    Logger logger = C0408m.f6832t;
                    i6 += 4;
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.s1(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                float floatValue = ((Float) list.get(i5)).floatValue();
                mVar.getClass();
                mVar.r1(i2, Float.floatToRawIntBits(floatValue));
                i5++;
            }
        }
    }

    public static void K(int i2, List list, M m6, d0 d0Var) {
        if (list != null && !list.isEmpty()) {
            m6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                m6.h(i2, list.get(i5), d0Var);
            }
        }
    }

    public static void L(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            if (z3) {
                mVar.w1(i2, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0408m.c1(((Integer) list.get(i6)).intValue());
                }
                mVar.x1(i5);
                for (int i7 = 0; i7 < list.size(); i7++) {
                    mVar.v1(((Integer) list.get(i7)).intValue());
                }
                return;
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                mVar.w1(i2, 0);
                mVar.v1(intValue);
            }
        }
    }

    public static void M(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    i6 += C0408m.o1(((Long) list.get(i7)).longValue());
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.z1(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                mVar.y1(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void N(int i2, List list, M m6, d0 d0Var) {
        if (list != null && !list.isEmpty()) {
            m6.getClass();
            for (int i5 = 0; i5 < list.size(); i5++) {
                m6.k(i2, list.get(i5), d0Var);
            }
        }
    }

    public static void O(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    ((Integer) list.get(i7)).getClass();
                    Logger logger = C0408m.f6832t;
                    i6 += 4;
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.s1(((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                mVar.r1(i2, ((Integer) list.get(i5)).intValue());
                i5++;
            }
        }
    }

    public static void P(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    ((Long) list.get(i7)).getClass();
                    Logger logger = C0408m.f6832t;
                    i6 += 8;
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.u1(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                mVar.t1(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static void Q(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            if (z3) {
                mVar.w1(i2, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    int intValue = ((Integer) list.get(i6)).intValue();
                    i5 += C0408m.m1((intValue >> 31) ^ (intValue << 1));
                }
                mVar.x1(i5);
                for (int i7 = 0; i7 < list.size(); i7++) {
                    int intValue2 = ((Integer) list.get(i7)).intValue();
                    mVar.x1((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue3 = ((Integer) list.get(i8)).intValue();
                mVar.w1(i2, 0);
                mVar.x1((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void R(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    long longValue = ((Long) list.get(i7)).longValue();
                    i6 += C0408m.o1((longValue >> 63) ^ (longValue << 1));
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    long longValue2 = ((Long) list.get(i5)).longValue();
                    mVar.z1((longValue2 >> 63) ^ (longValue2 << 1));
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                long longValue3 = ((Long) list.get(i5)).longValue();
                mVar.y1(i2, (longValue3 >> 63) ^ (longValue3 << 1));
                i5++;
            }
        }
    }

    public static void S(int i2, List list, M m6) {
        if (list != null && !list.isEmpty()) {
            m6.getClass();
            boolean z3 = list instanceof G;
            C0408m mVar = (C0408m) m6.f6761a;
            if (z3) {
                G g = (G) list;
                for (int i5 = 0; i5 < list.size(); i5++) {
                    Object m7 = g.m(i5);
                    if (m7 instanceof String) {
                        String str = (String) m7;
                        mVar.w1(i2, 2);
                        int i6 = mVar.f6837s;
                        try {
                            int m12 = C0408m.m1(str.length() * 3);
                            int m13 = C0408m.m1(str.length());
                            byte[] bArr = mVar.f6835q;
                            int i7 = mVar.f6836r;
                            if (m13 == m12) {
                                int i8 = i6 + m13;
                                mVar.f6837s = i8;
                                int r6 = s0.f6855a.r(str, bArr, i8, i7 - i8);
                                mVar.f6837s = i6;
                                mVar.x1((r6 - i6) - m13);
                                mVar.f6837s = r6;
                            } else {
                                mVar.x1(s0.b(str));
                                int i9 = mVar.f6837s;
                                mVar.f6837s = s0.f6855a.r(str, bArr, i9, i7 - i9);
                            }
                        } catch (r0 e6) {
                            mVar.f6837s = i6;
                            C0408m.f6832t.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e6);
                            byte[] bytes = str.getBytes(B.f6742a);
                            try {
                                mVar.x1(bytes.length);
                                mVar.q1(bytes, 0, bytes.length);
                            } catch (IndexOutOfBoundsException e7) {
                                throw new x(e7);
                            }
                        } catch (IndexOutOfBoundsException e8) {
                            throw new x(e8);
                        }
                    } else {
                        C0404i iVar = (C0404i) m7;
                        mVar.w1(i2, 2);
                        mVar.x1(iVar.size());
                        C0403h hVar = (C0403h) iVar;
                        mVar.q1(hVar.d, hVar.y(), hVar.size());
                    }
                }
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                String str2 = (String) list.get(i10);
                mVar.w1(i2, 2);
                int i11 = mVar.f6837s;
                try {
                    int m14 = C0408m.m1(str2.length() * 3);
                    int m15 = C0408m.m1(str2.length());
                    byte[] bArr2 = mVar.f6835q;
                    int i12 = mVar.f6836r;
                    if (m15 == m14) {
                        int i13 = i11 + m15;
                        mVar.f6837s = i13;
                        int r7 = s0.f6855a.r(str2, bArr2, i13, i12 - i13);
                        mVar.f6837s = i11;
                        mVar.x1((r7 - i11) - m15);
                        mVar.f6837s = r7;
                    } else {
                        mVar.x1(s0.b(str2));
                        int i14 = mVar.f6837s;
                        mVar.f6837s = s0.f6855a.r(str2, bArr2, i14, i12 - i14);
                    }
                } catch (r0 e9) {
                    mVar.f6837s = i11;
                    C0408m.f6832t.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e9);
                    byte[] bytes2 = str2.getBytes(B.f6742a);
                    try {
                        mVar.x1(bytes2.length);
                        mVar.q1(bytes2, 0, bytes2.length);
                    } catch (IndexOutOfBoundsException e10) {
                        throw new x(e10);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    throw new x(e11);
                }
            }
        }
    }

    public static void T(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            if (z3) {
                mVar.w1(i2, 2);
                int i5 = 0;
                for (int i6 = 0; i6 < list.size(); i6++) {
                    i5 += C0408m.m1(((Integer) list.get(i6)).intValue());
                }
                mVar.x1(i5);
                for (int i7 = 0; i7 < list.size(); i7++) {
                    mVar.x1(((Integer) list.get(i7)).intValue());
                }
                return;
            }
            for (int i8 = 0; i8 < list.size(); i8++) {
                int intValue = ((Integer) list.get(i8)).intValue();
                mVar.w1(i2, 0);
                mVar.x1(intValue);
            }
        }
    }

    public static void U(int i2, List list, M m6, boolean z3) {
        if (list != null && !list.isEmpty()) {
            C0408m mVar = (C0408m) m6.f6761a;
            int i5 = 0;
            if (z3) {
                mVar.w1(i2, 2);
                int i6 = 0;
                for (int i7 = 0; i7 < list.size(); i7++) {
                    i6 += C0408m.o1(((Long) list.get(i7)).longValue());
                }
                mVar.x1(i6);
                while (i5 < list.size()) {
                    mVar.z1(((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            while (i5 < list.size()) {
                mVar.y1(i2, ((Long) list.get(i5)).longValue());
                i5++;
            }
        }
    }

    public static int a(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0408m.S0(i2) * size;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k12 = C0408m.k1(i2) * size;
        for (int i5 = 0; i5 < list.size(); i5++) {
            k12 += C0408m.U0((C0404i) list.get(i5));
        }
        return k12;
    }

    public static int d(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0408m.k1(i2) * size) + e(list);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0419y) {
            C0419y yVar = (C0419y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.w(0);
            throw null;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0408m.c1(((Integer) list.get(i5)).intValue());
        }
        return i2;
    }

    public static int f(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0408m.X0(i2) * size;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return C0408m.Y0(i2) * size;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i2, List list, d0 d0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            i5 += C0408m.a1(i2, (C0396a) list.get(i6), d0Var);
        }
        return i5;
    }

    public static int k(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0408m.k1(i2) * size) + l(list);
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0419y) {
            C0419y yVar = (C0419y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.w(0);
            throw null;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0408m.c1(((Integer) list.get(i5)).intValue());
        }
        return i2;
    }

    public static int m(int i2, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (C0408m.k1(i2) * list.size()) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof K) {
            K k6 = (K) list;
            if (size <= 0) {
                return 0;
            }
            k6.w(0);
            throw null;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0408m.o1(((Long) list.get(i5)).longValue());
        }
        return i2;
    }

    public static int o(int i2, Object obj, d0 d0Var) {
        int k12 = C0408m.k1(i2);
        int b6 = ((C0396a) obj).b(d0Var);
        return C0408m.m1(b6) + b6 + k12;
    }

    public static int p(int i2, List list, d0 d0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k12 = C0408m.k1(i2) * size;
        for (int i5 = 0; i5 < size; i5++) {
            int b6 = ((C0396a) list.get(i5)).b(d0Var);
            k12 += C0408m.m1(b6) + b6;
        }
        return k12;
    }

    public static int q(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0408m.k1(i2) * size) + r(list);
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0419y) {
            C0419y yVar = (C0419y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.w(0);
            throw null;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) list.get(i5)).intValue();
            i2 += C0408m.m1((intValue >> 31) ^ (intValue << 1));
        }
        return i2;
    }

    public static int s(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0408m.k1(i2) * size) + t(list);
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof K) {
            K k6 = (K) list;
            if (size <= 0) {
                return 0;
            }
            k6.w(0);
            throw null;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            long longValue = ((Long) list.get(i5)).longValue();
            i2 += C0408m.o1((longValue >> 63) ^ (longValue << 1));
        }
        return i2;
    }

    public static int u(int i2, List list) {
        int j12;
        int j13;
        int size = list.size();
        int i5 = 0;
        if (size == 0) {
            return 0;
        }
        int k12 = C0408m.k1(i2) * size;
        if (list instanceof G) {
            G g = (G) list;
            while (i5 < size) {
                Object m6 = g.m(i5);
                if (m6 instanceof C0404i) {
                    j13 = C0408m.U0((C0404i) m6);
                } else {
                    j13 = C0408m.j1((String) m6);
                }
                k12 = j13 + k12;
                i5++;
            }
        } else {
            while (i5 < size) {
                Object obj = list.get(i5);
                if (obj instanceof C0404i) {
                    j12 = C0408m.U0((C0404i) obj);
                } else {
                    j12 = C0408m.j1((String) obj);
                }
                k12 = j12 + k12;
                i5++;
            }
        }
        return k12;
    }

    public static int v(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0408m.k1(i2) * size) + w(list);
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0419y) {
            C0419y yVar = (C0419y) list;
            if (size <= 0) {
                return 0;
            }
            yVar.w(0);
            throw null;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0408m.m1(((Integer) list.get(i5)).intValue());
        }
        return i2;
    }

    public static int x(int i2, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (C0408m.k1(i2) * size) + y(list);
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof K) {
            K k6 = (K) list;
            if (size <= 0) {
                return 0;
            }
            k6.w(0);
            throw null;
        }
        int i2 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i2 += C0408m.o1(((Long) list.get(i5)).longValue());
        }
        return i2;
    }

    public static Object z(Object obj, int i2, List list, Object obj2, h0 h0Var) {
        return obj2;
    }
}
