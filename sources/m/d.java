package m;

import java.util.Iterator;

public final class d extends e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public c f9835a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f9836b = true;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f9837c;

    public d(f fVar) {
        this.f9837c = fVar;
    }

    public final void a(c cVar) {
        boolean z3;
        c cVar2 = this.f9835a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.d;
            this.f9835a = cVar3;
            if (cVar3 == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f9836b = z3;
        }
    }

    public final boolean hasNext() {
        if (!this.f9836b) {
            c cVar = this.f9835a;
            if (cVar == null || cVar.f9834c == null) {
                return false;
            }
            return true;
        } else if (this.f9837c.f9838a != null) {
            return true;
        } else {
            return false;
        }
    }

    public final Object next() {
        c cVar;
        if (this.f9836b) {
            this.f9836b = false;
            this.f9835a = this.f9837c.f9838a;
        } else {
            c cVar2 = this.f9835a;
            if (cVar2 != null) {
                cVar = cVar2.f9834c;
            } else {
                cVar = null;
            }
            this.f9835a = cVar;
        }
        return this.f9835a;
    }
}
