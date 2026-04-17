package s3;

import n3.C0866g;
import v3.u;

/* renamed from: s3.g  reason: case insensitive filesystem */
public final class C0969g {

    /* renamed from: a  reason: collision with root package name */
    public final C0866g f11538a;

    /* renamed from: b  reason: collision with root package name */
    public final C0968f f11539b;

    public C0969g(C0866g gVar, C0968f fVar) {
        this.f11538a = gVar;
        this.f11539b = fVar;
    }

    public static C0969g a(C0866g gVar) {
        return new C0969g(gVar, C0968f.h);
    }

    public final boolean b() {
        C0968f fVar = this.f11539b;
        if (!fVar.h() || !fVar.g.equals(u.f12308a)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0969g.class != obj.getClass()) {
            return false;
        }
        C0969g gVar = (C0969g) obj;
        if (this.f11538a.equals(gVar.f11538a) && this.f11539b.equals(gVar.f11539b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11539b.hashCode() + (this.f11538a.hashCode() * 31);
    }

    public final String toString() {
        return this.f11538a + ":" + this.f11539b;
    }
}
