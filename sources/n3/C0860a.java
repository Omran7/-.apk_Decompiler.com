package n3;

import S3.r;
import i3.C0585a;
import i3.C0587c;
import i3.C0588d;
import q.C0928e;
import s3.C0964b;
import s3.C0965c;
import s3.C0969g;
import v3.C1048c;

/* renamed from: n3.a  reason: case insensitive filesystem */
public final class C0860a extends C0865f {
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final C0585a f10255e;

    /* renamed from: f  reason: collision with root package name */
    public final C0969g f10256f;

    public C0860a(m mVar, C0585a aVar, C0969g gVar) {
        this.d = mVar;
        this.f10255e = aVar;
        this.f10256f = gVar;
    }

    public final C0865f a(C0969g gVar) {
        return new C0860a(this.d, this.f10255e, gVar);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [S3.r, i3.f] */
    public final C0965c b(C0964b bVar, C0969g gVar) {
        String str;
        C0587c cVar = new C0587c(new r(this.d, gVar.f11538a.v(bVar.d)), bVar.f11526b);
        C1048c cVar2 = bVar.f11528e;
        if (cVar2 != null) {
            str = cVar2.f12280a;
        } else {
            str = null;
        }
        return new C0965c(bVar.f11525a, this, cVar, str);
    }

    public final void c(C0588d dVar) {
        this.f10255e.getClass();
    }

    public final void d(C0965c cVar) {
        if (!this.f10273a.get()) {
            int c3 = C0928e.c(cVar.f11529a);
            C0587c cVar2 = cVar.f11531c;
            C0585a aVar = this.f10255e;
            if (c3 == 0) {
                aVar.i(cVar2);
            } else if (c3 == 1) {
                aVar.k(cVar2);
            } else if (c3 == 2) {
                aVar.getClass();
            } else if (c3 == 3) {
                aVar.q(cVar2);
            }
        }
    }

    public final C0969g e() {
        return this.f10256f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0860a) {
            C0860a aVar = (C0860a) obj;
            if (!aVar.f10255e.equals(this.f10255e) || !aVar.d.equals(this.d) || !aVar.f10256f.equals(this.f10256f)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean f(C0865f fVar) {
        if (!(fVar instanceof C0860a) || !((C0860a) fVar).f10255e.equals(this.f10255e)) {
            return false;
        }
        return true;
    }

    public final boolean g(int i2) {
        if (i2 != 5) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode();
        return this.f10256f.hashCode() + ((hashCode + (this.f10255e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ChildEventRegistration";
    }
}
