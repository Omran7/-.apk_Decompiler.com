package n3;

import v3.s;

/* renamed from: n3.B  reason: case insensitive filesystem */
public final class C0857B {

    /* renamed from: a  reason: collision with root package name */
    public final long f10239a;

    /* renamed from: b  reason: collision with root package name */
    public final C0866g f10240b;

    /* renamed from: c  reason: collision with root package name */
    public final s f10241c;
    public final C0861b d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10242e;

    public C0857B(long j6, C0866g gVar, s sVar, boolean z3) {
        this.f10239a = j6;
        this.f10240b = gVar;
        this.f10241c = sVar;
        this.d = null;
        this.f10242e = z3;
    }

    public final C0861b a() {
        C0861b bVar = this.d;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final s b() {
        s sVar = this.f10241c;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        if (this.f10241c != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0857B.class != obj.getClass()) {
            return false;
        }
        C0857B b6 = (C0857B) obj;
        if (this.f10239a != b6.f10239a || !this.f10240b.equals(b6.f10240b) || this.f10242e != b6.f10242e) {
            return false;
        }
        s sVar = b6.f10241c;
        s sVar2 = this.f10241c;
        if (sVar2 == null ? sVar != null : !sVar2.equals(sVar)) {
            return false;
        }
        C0861b bVar = b6.d;
        C0861b bVar2 = this.d;
        if (bVar2 == null ? bVar == null : bVar2.equals(bVar)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f10240b.hashCode() + ((Boolean.valueOf(this.f10242e).hashCode() + (Long.valueOf(this.f10239a).hashCode() * 31)) * 31)) * 31;
        int i5 = 0;
        s sVar = this.f10241c;
        if (sVar != null) {
            i2 = sVar.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (hashCode + i2) * 31;
        C0861b bVar = this.d;
        if (bVar != null) {
            i5 = bVar.hashCode();
        }
        return i6 + i5;
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f10239a + " path=" + this.f10240b + " visible=" + this.f10242e + " overwrite=" + this.f10241c + " merge=" + this.d + "}";
    }

    public C0857B(long j6, C0866g gVar, C0861b bVar) {
        this.f10239a = j6;
        this.f10240b = gVar;
        this.f10241c = null;
        this.d = bVar;
        this.f10242e = true;
    }
}
