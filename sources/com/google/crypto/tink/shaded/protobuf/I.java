package com.google.crypto.tink.shaded.protobuf;

import java.util.List;

public final class I extends J {
    public final void a(Object obj, long j6) {
        ((C0397b) ((A) p0.f6845c.i(obj, j6))).f6788a = false;
    }

    public final void b(Object obj, long j6, Object obj2) {
        o0 o0Var = p0.f6845c;
        A a6 = (A) o0Var.i(obj, j6);
        A a7 = (A) o0Var.i(obj2, j6);
        int size = a6.size();
        int size2 = a7.size();
        if (size > 0 && size2 > 0) {
            if (!((C0397b) a6).f6788a) {
                a6 = a6.a(size2 + size);
            }
            a6.addAll(a7);
        }
        if (size > 0) {
            a7 = a6;
        }
        p0.v(obj, j6, a7);
    }

    public final List c(Object obj, long j6) {
        int i2;
        A a6 = (A) p0.f6845c.i(obj, j6);
        if (((C0397b) a6).f6788a) {
            return a6;
        }
        int size = a6.size();
        if (size == 0) {
            i2 = 10;
        } else {
            i2 = size * 2;
        }
        A a7 = a6.a(i2);
        p0.v(obj, j6, a7);
        return a7;
    }
}
