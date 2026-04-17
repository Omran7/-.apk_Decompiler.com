package com.google.crypto.tink.shaded.protobuf;

import h0.C0552a;
import java.util.Iterator;
import java.util.Map;

public final class O {
    public static void a(Object obj) {
        C0552a.y(obj);
        throw null;
    }

    public static void b(Object obj, Object obj2) {
        N n2 = (N) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        } else if (!n2.isEmpty()) {
            Iterator it2 = n2.entrySet().iterator();
            if (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public static boolean c(Object obj) {
        return !((N) obj).f6763a;
    }

    public static N d(Object obj, Object obj2) {
        N n2 = (N) obj;
        N n6 = (N) obj2;
        if (!n6.isEmpty()) {
            if (!n2.f6763a) {
                n2 = n2.c();
            }
            n2.b();
            if (!n6.isEmpty()) {
                n2.putAll(n6);
            }
        }
        return n2;
    }

    public static N e() {
        return N.f6762b.c();
    }

    public static void f(Object obj) {
        ((N) obj).f6763a = false;
    }
}
