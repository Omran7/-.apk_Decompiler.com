package i3;

import com.google.firebase.database.GenericTypeIndicator;
import n3.C0866g;
import r3.b;
import v3.m;

/* renamed from: i3.c  reason: case insensitive filesystem */
public final class C0587c {

    /* renamed from: a  reason: collision with root package name */
    public final m f8278a;

    /* renamed from: b  reason: collision with root package name */
    public final C0590f f8279b;

    public C0587c(C0590f fVar, m mVar) {
        this.f8278a = mVar;
        this.f8279b = fVar;
    }

    public final C0587c a(String str) {
        return new C0587c(this.f8279b.E(str), m.t(this.f8278a.f12296a.f(new C0866g(str))));
    }

    public final boolean b() {
        return !this.f8278a.f12296a.isEmpty();
    }

    public final C0586b c() {
        return new C0586b(this, this.f8278a.iterator());
    }

    public final long d() {
        return (long) this.f8278a.f12296a.i();
    }

    public final Object e(GenericTypeIndicator genericTypeIndicator) {
        return b.b(this.f8278a.f12296a.getValue(), genericTypeIndicator);
    }

    public final Object f(Class cls) {
        return b.c(cls, this.f8278a.f12296a.getValue());
    }

    public final boolean g() {
        if (this.f8278a.f12296a.i() > 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "DataSnapshot { key = " + this.f8279b.F() + ", value = " + this.f8278a.f12296a.o(true) + " }";
    }
}
