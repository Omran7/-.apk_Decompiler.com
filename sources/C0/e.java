package C0;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f f403a;

    /* renamed from: b  reason: collision with root package name */
    public int f404b;

    /* renamed from: c  reason: collision with root package name */
    public Class f405c;

    public e(f fVar) {
        this.f403a = fVar;
    }

    public final void a() {
        this.f403a.l(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f404b == eVar.f404b && this.f405c == eVar.f405c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i5 = this.f404b * 31;
        Class cls = this.f405c;
        if (cls != null) {
            i2 = cls.hashCode();
        } else {
            i2 = 0;
        }
        return i5 + i2;
    }

    public final String toString() {
        return "Key{size=" + this.f404b + "array=" + this.f405c + '}';
    }
}
