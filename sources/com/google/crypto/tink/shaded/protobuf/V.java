package com.google.crypto.tink.shaded.protobuf;

import a1.C0258c;
import h0.C0552a;

public final class V implements d0 {

    /* renamed from: a  reason: collision with root package name */
    public final C0396a f6780a;

    /* renamed from: b  reason: collision with root package name */
    public final h0 f6781b;

    /* renamed from: c  reason: collision with root package name */
    public final C0412q f6782c;

    public V(h0 h0Var, C0412q qVar, C0396a aVar) {
        this.f6781b = h0Var;
        qVar.getClass();
        this.f6782c = qVar;
        this.f6780a = aVar;
    }

    public final int a(C0418x xVar) {
        this.f6781b.getClass();
        g0 g0Var = xVar.unknownFields;
        int i2 = g0Var.d;
        if (i2 != -1) {
            return i2;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < g0Var.f6806a; i6++) {
            i5 += C0408m.T0(3, (C0404i) g0Var.f6808c[i6]) + C0408m.l1(2, g0Var.f6807b[i6] >>> 3) + (C0408m.k1(1) * 2);
        }
        g0Var.d = i5;
        return i5;
    }

    public final void b(Object obj, byte[] bArr, int i2, int i5, C0258c cVar) {
        C0418x xVar = (C0418x) obj;
        if (xVar.unknownFields == g0.f6805f) {
            xVar.unknownFields = g0.c();
        }
        obj.getClass();
        throw new ClassCastException();
    }

    public final void c(Object obj, Object obj2) {
        e0.B(this.f6781b, obj, obj2);
    }

    public final void d(Object obj) {
        this.f6781b.getClass();
        h0.b(obj);
        this.f6782c.getClass();
        C0552a.y(obj);
        throw null;
    }

    public final boolean e(Object obj) {
        this.f6782c.getClass();
        C0552a.y(obj);
        throw null;
    }

    public final void f(Object obj, C0407l lVar, C0411p pVar) {
        this.f6781b.getClass();
        h0.a(obj);
        this.f6782c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    public final boolean g(C0418x xVar, Object obj) {
        this.f6781b.getClass();
        if (!xVar.unknownFields.equals(((C0418x) obj).unknownFields)) {
            return false;
        }
        return true;
    }

    public final void h(Object obj, M m6) {
        this.f6782c.getClass();
        C0552a.y(obj);
        throw null;
    }

    public final Object i() {
        C0396a aVar = this.f6780a;
        if (aVar instanceof C0418x) {
            return ((C0418x) aVar).s();
        }
        return aVar.d().c();
    }

    public final int j(C0418x xVar) {
        this.f6781b.getClass();
        return xVar.unknownFields.hashCode();
    }
}
