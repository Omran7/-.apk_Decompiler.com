package n3;

import S3.r;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import s3.C0964b;
import s3.C0965c;
import s3.C0969g;

/* renamed from: n3.D  reason: case insensitive filesystem */
public final class C0859D extends C0865f {
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final q f10245e;

    /* renamed from: f  reason: collision with root package name */
    public final C0969g f10246f;

    public C0859D(m mVar, q qVar, C0969g gVar) {
        this.d = mVar;
        this.f10245e = qVar;
        this.f10246f = gVar;
    }

    public final C0865f a(C0969g gVar) {
        return new C0859D(this.d, this.f10245e, gVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [S3.r, i3.f] */
    public final C0965c b(C0964b bVar, C0969g gVar) {
        return new C0965c(5, this, new C0587c(new r(this.d, gVar.f11538a), bVar.f11526b), (String) null);
    }

    public final void c(C0588d dVar) {
        this.f10245e.B(dVar);
    }

    public final void d(C0965c cVar) {
        if (!this.f10273a.get()) {
            this.f10245e.u(cVar.f11531c);
        }
    }

    public final C0969g e() {
        return this.f10246f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0859D) {
            C0859D d6 = (C0859D) obj;
            if (!d6.f10245e.equals(this.f10245e) || !d6.d.equals(this.d) || !d6.f10246f.equals(this.f10246f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean f(C0865f fVar) {
        if (!(fVar instanceof C0859D) || !((C0859D) fVar).f10245e.equals(this.f10245e)) {
            return false;
        }
        return true;
    }

    public final boolean g(int i2) {
        if (i2 == 5) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return this.f10246f.hashCode() + ((hashCode + (this.f10245e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ValueEventRegistration";
    }
}
