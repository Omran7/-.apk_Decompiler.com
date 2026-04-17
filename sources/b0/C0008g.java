package B0;

import java.security.MessageDigest;
import z0.C1130f;

/* renamed from: B0.g  reason: case insensitive filesystem */
public final class C0008g implements C1130f {

    /* renamed from: b  reason: collision with root package name */
    public final C1130f f224b;

    /* renamed from: c  reason: collision with root package name */
    public final C1130f f225c;

    public C0008g(C1130f fVar, C1130f fVar2) {
        this.f224b = fVar;
        this.f225c = fVar2;
    }

    public final void a(MessageDigest messageDigest) {
        this.f224b.a(messageDigest);
        this.f225c.a(messageDigest);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0008g)) {
            return false;
        }
        C0008g gVar = (C0008g) obj;
        if (!this.f224b.equals(gVar.f224b) || !this.f225c.equals(gVar.f225c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f225c.hashCode() + (this.f224b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.f224b + ", signature=" + this.f225c + '}';
    }
}
