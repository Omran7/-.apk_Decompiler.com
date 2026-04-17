package G5;

import R2.b;
import m5.C0847f;
import m5.C0849h;
import o5.d;
import o5.i;
import q5.a;
import x5.p;

/* renamed from: G5.a  reason: case insensitive filesystem */
public abstract class C0019a extends v0 implements d, C {

    /* renamed from: c  reason: collision with root package name */
    public final i f893c;

    public C0019a(i iVar, boolean z3) {
        super(z3);
        x((C0034h0) iVar.get(B.f856b));
        this.f893c = iVar.plus(this);
    }

    public final void F(Object obj) {
        if (obj instanceof C0048u) {
            C0048u uVar = (C0048u) obj;
            Throwable th = uVar.f950a;
            uVar.getClass();
            C0048u.f949b.get(uVar);
        }
    }

    public final void L(D d, C0019a aVar, p pVar) {
        i iVar;
        Object i2;
        int ordinal = d.ordinal();
        if (ordinal == 0) {
            com.bumptech.glide.d.d1(pVar, aVar, this);
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                b.h0(((a) pVar).create(aVar, this)).resumeWith(C0849h.f10203c);
            } else if (ordinal == 3) {
                try {
                    iVar = this.f893c;
                    i2 = I5.a.i(iVar, (Object) null);
                    kotlin.jvm.internal.p.a(2, pVar);
                    Object invoke = pVar.invoke(aVar, this);
                    I5.a.d(iVar, i2);
                    if (invoke != p5.a.f11033a) {
                        resumeWith(invoke);
                    }
                } catch (Throwable th) {
                    resumeWith(I1.b.r(th));
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    public final i b() {
        return this.f893c;
    }

    public final i getContext() {
        return this.f893c;
    }

    public final String k() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    public final void resumeWith(Object obj) {
        Throwable a6 = C0847f.a(obj);
        if (a6 != null) {
            obj = new C0048u(false, a6);
        }
        Object B6 = B(obj);
        if (B6 != F.f864e) {
            g(B6);
        }
    }

    public final void w(C0050w wVar) {
        F.k(this.f893c, wVar);
    }
}
