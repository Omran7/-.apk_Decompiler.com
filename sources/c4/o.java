package c4;

import Z3.d;
import Z3.p;
import Z3.q;
import g4.C0551a;

public final class o implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f5666b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p f5667c;

    public /* synthetic */ o(Class cls, p pVar, int i2) {
        this.f5665a = i2;
        this.f5666b = cls;
        this.f5667c = pVar;
    }

    public final p a(d dVar, C0551a aVar) {
        switch (this.f5665a) {
            case 0:
                if (aVar.f8044a == this.f5666b) {
                    return this.f5667c;
                }
                return null;
            default:
                Class cls = this.f5666b;
                Class cls2 = aVar.f8044a;
                if (!cls.isAssignableFrom(cls2)) {
                    return null;
                }
                return new b(this, cls2);
        }
    }

    public final String toString() {
        switch (this.f5665a) {
            case 0:
                return "Factory[type=" + this.f5666b.getName() + ",adapter=" + this.f5667c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f5666b.getName() + ",adapter=" + this.f5667c + "]";
        }
    }
}
