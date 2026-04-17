package i3;

import android.support.v4.media.session.a;
import k.C0724m;
import n3.C0858C;
import n3.C0866g;
import q3.m;
import r3.b;
import v3.C1048c;
import v3.k;
import v3.s;

/* renamed from: i3.k  reason: case insensitive filesystem */
public final class C0595k {

    /* renamed from: a  reason: collision with root package name */
    public final C0724m f8289a;

    /* renamed from: b  reason: collision with root package name */
    public final C0866g f8290b;

    public C0595k(C0724m mVar, C0866g gVar) {
        this.f8289a = mVar;
        this.f8290b = gVar;
        new C0858C(gVar).g(b());
    }

    public final C0595k a(String str) {
        m.b(str);
        return new C0595k(this.f8289a, this.f8290b.t(new C0866g(str)));
    }

    public final Object b() {
        return ((s) this.f8289a.f9345b).f(this.f8290b).getValue();
    }

    public final Object c(Class cls) {
        return b.c(cls, ((s) this.f8289a.f9345b).f(this.f8290b).getValue());
    }

    public final void d(Object obj) {
        C0866g gVar = this.f8290b;
        new C0858C(gVar).g(obj);
        Object g = b.g(obj);
        m.d(g);
        s a6 = a.a(g, k.f12295e);
        C0724m mVar = this.f8289a;
        mVar.f9345b = ((s) mVar.f9345b).q(gVar, a6);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0595k) {
            C0595k kVar = (C0595k) obj;
            if (!this.f8289a.equals(kVar.f8289a) || !this.f8290b.equals(kVar.f8290b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        C1048c z3 = this.f8290b.z();
        StringBuilder sb = new StringBuilder("MutableData { key = ");
        if (z3 != null) {
            str = z3.f12280a;
        } else {
            str = "<none>";
        }
        sb.append(str);
        sb.append(", value = ");
        sb.append(((s) this.f8289a.f9345b).o(true));
        sb.append(" }");
        return sb.toString();
    }
}
