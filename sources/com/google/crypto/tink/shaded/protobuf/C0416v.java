package com.google.crypto.tink.shaded.protobuf;

/* renamed from: com.google.crypto.tink.shaded.protobuf.v  reason: case insensitive filesystem */
public abstract class C0416v implements S, Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public final C0418x f6858a;

    /* renamed from: b  reason: collision with root package name */
    public C0418x f6859b;

    public C0416v(C0418x xVar) {
        this.f6858a = xVar;
        if (!xVar.p()) {
            this.f6859b = xVar.s();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    public static void f(Object obj, Object obj2) {
        a0 a0Var = a0.f6785c;
        a0Var.getClass();
        a0Var.a(obj.getClass()).c(obj, obj2);
    }

    public final C0418x b() {
        C0418x c3 = c();
        c3.getClass();
        if (C0418x.o(c3, true)) {
            return c3;
        }
        throw new f0();
    }

    public final C0418x c() {
        if (!this.f6859b.p()) {
            return this.f6859b;
        }
        C0418x xVar = this.f6859b;
        xVar.getClass();
        a0 a0Var = a0.f6785c;
        a0Var.getClass();
        a0Var.a(xVar.getClass()).d(xVar);
        xVar.q();
        return this.f6859b;
    }

    public final C0416v d() {
        C0416v r6 = this.f6858a.d();
        r6.f6859b = c();
        return r6;
    }

    public final void e() {
        if (!this.f6859b.p()) {
            C0418x s6 = this.f6858a.s();
            f(s6, this.f6859b);
            this.f6859b = s6;
        }
    }
}
