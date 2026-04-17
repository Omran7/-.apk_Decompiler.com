package kotlin.jvm.internal;

import m5.C0842a;
import o3.d;
import x5.a;
import x5.l;
import x5.q;

public abstract class p {
    public static void a(int i2, Object obj) {
        int i5;
        if (obj != null) {
            if (obj instanceof C0842a) {
                if (obj instanceof g) {
                    i5 = ((g) obj).getArity();
                } else if (obj instanceof a) {
                    i5 = 0;
                } else if (obj instanceof l) {
                    i5 = 1;
                } else if (obj instanceof x5.p) {
                    i5 = 2;
                } else if (obj instanceof q) {
                    i5 = 3;
                } else {
                    i5 = -1;
                }
                if (i5 == i2) {
                    return;
                }
            }
            b(obj, "kotlin.jvm.functions.Function" + i2);
            throw null;
        }
    }

    public static void b(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = "null";
        } else {
            str2 = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(d.g(str2, " cannot be cast to ", str));
        j.f(classCastException, p.class.getName());
        throw classCastException;
    }
}
