package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

public final class M {

    /* renamed from: b  reason: collision with root package name */
    public static final C0415u f6760b = new C0415u(1);

    /* renamed from: a  reason: collision with root package name */
    public final Object f6761a;

    public M(C0408m mVar) {
        B.a(mVar, "output");
        this.f6761a = mVar;
        mVar.f6834p = this;
    }

    public void a(int i2, boolean z3) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 0);
        mVar.p1(z3 ? (byte) 1 : 0);
    }

    public void b(int i2, C0404i iVar) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 2);
        mVar.x1(iVar.size());
        C0403h hVar = (C0403h) iVar;
        mVar.q1(hVar.d, hVar.y(), hVar.size());
    }

    public void c(int i2, double d) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.getClass();
        mVar.t1(i2, Double.doubleToRawLongBits(d));
    }

    public void d(int i2, int i5) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 0);
        mVar.v1(i5);
    }

    public void e(int i2, int i5) {
        ((C0408m) this.f6761a).r1(i2, i5);
    }

    public void f(int i2, long j6) {
        ((C0408m) this.f6761a).t1(i2, j6);
    }

    public void g(int i2, float f6) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.getClass();
        mVar.r1(i2, Float.floatToRawIntBits(f6));
    }

    public void h(int i2, Object obj, d0 d0Var) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 3);
        d0Var.h((C0396a) obj, mVar.f6834p);
        mVar.w1(i2, 4);
    }

    public void i(int i2, int i5) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 0);
        mVar.v1(i5);
    }

    public void j(int i2, long j6) {
        ((C0408m) this.f6761a).y1(i2, j6);
    }

    public void k(int i2, Object obj, d0 d0Var) {
        C0396a aVar = (C0396a) obj;
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 2);
        mVar.x1(aVar.b(d0Var));
        d0Var.h(aVar, mVar.f6834p);
    }

    public void l(int i2, int i5) {
        ((C0408m) this.f6761a).r1(i2, i5);
    }

    public void m(int i2, long j6) {
        ((C0408m) this.f6761a).t1(i2, j6);
    }

    public void n(int i2, int i5) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 0);
        mVar.x1((i5 >> 31) ^ (i5 << 1));
    }

    public void o(int i2, long j6) {
        ((C0408m) this.f6761a).y1(i2, (j6 >> 63) ^ (j6 << 1));
    }

    public void p(int i2, int i5) {
        C0408m mVar = (C0408m) this.f6761a;
        mVar.w1(i2, 0);
        mVar.x1(i5);
    }

    public void q(int i2, long j6) {
        ((C0408m) this.f6761a).y1(i2, j6);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.crypto.tink.shaded.protobuf.L, java.lang.Object] */
    public M() {
        Q q6;
        try {
            q6 = (Q) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            q6 = f6760b;
        }
        Q[] qArr = {C0415u.f6856b, q6};
        ? obj = new Object();
        obj.f6759a = qArr;
        Charset charset = B.f6742a;
        this.f6761a = obj;
    }
}
