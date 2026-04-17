package j1;

import c1.h;
import c1.j;

/* renamed from: j1.b  reason: case insensitive filesystem */
public final class C0606b {

    /* renamed from: a  reason: collision with root package name */
    public final long f8800a;

    /* renamed from: b  reason: collision with root package name */
    public final j f8801b;

    /* renamed from: c  reason: collision with root package name */
    public final h f8802c;

    public C0606b(long j6, j jVar, h hVar) {
        this.f8800a = j6;
        this.f8801b = jVar;
        this.f8802c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0606b)) {
            return false;
        }
        C0606b bVar = (C0606b) obj;
        if (this.f8800a != bVar.f8800a || !this.f8801b.equals(bVar.f8801b) || !this.f8802c.equals(bVar.f8802c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j6 = this.f8800a;
        return ((((((int) ((j6 >>> 32) ^ j6)) ^ 1000003) * 1000003) ^ this.f8801b.hashCode()) * 1000003) ^ this.f8802c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f8800a + ", transportContext=" + this.f8801b + ", event=" + this.f8802c + "}";
    }
}
