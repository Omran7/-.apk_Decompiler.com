package k3;

public final class f extends j {

    /* renamed from: e  reason: collision with root package name */
    public int f9469e = -1;

    public f(Object obj, Object obj2, h hVar, h hVar2) {
        super(obj, obj2, hVar, hVar2);
    }

    public final boolean d() {
        return false;
    }

    public final j l(Object obj, Object obj2, h hVar, h hVar2) {
        if (obj == null) {
            obj = this.f9471a;
        }
        if (obj2 == null) {
            obj2 = this.f9472b;
        }
        if (hVar == null) {
            hVar = this.f9473c;
        }
        if (hVar2 == null) {
            hVar2 = this.d;
        }
        return new f(obj, obj2, hVar, hVar2);
    }

    public final int n() {
        return 2;
    }

    public final void r(j jVar) {
        if (this.f9469e == -1) {
            this.f9473c = jVar;
            return;
        }
        throw new IllegalStateException("Can't set left after using size");
    }

    public final int size() {
        if (this.f9469e == -1) {
            this.f9469e = this.d.size() + this.f9473c.size() + 1;
        }
        return this.f9469e;
    }
}
