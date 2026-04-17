package m;

import java.util.Iterator;

public final class b extends e implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public c f9829a;

    /* renamed from: b  reason: collision with root package name */
    public c f9830b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9831c;

    public b(c cVar, c cVar2, int i2) {
        this.f9831c = i2;
        this.f9829a = cVar2;
        this.f9830b = cVar;
    }

    public final void a(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.f9829a == cVar && cVar == this.f9830b) {
            this.f9830b = null;
            this.f9829a = null;
        }
        c cVar4 = this.f9829a;
        if (cVar4 == cVar) {
            switch (this.f9831c) {
                case 0:
                    cVar2 = cVar4.d;
                    break;
                default:
                    cVar2 = cVar4.f9834c;
                    break;
            }
            this.f9829a = cVar2;
        }
        c cVar5 = this.f9830b;
        if (cVar5 == cVar) {
            c cVar6 = this.f9829a;
            if (!(cVar5 == cVar6 || cVar6 == null)) {
                cVar3 = b(cVar5);
            }
            this.f9830b = cVar3;
        }
    }

    public final c b(c cVar) {
        switch (this.f9831c) {
            case 0:
                return cVar.f9834c;
            default:
                return cVar.d;
        }
    }

    public final boolean hasNext() {
        if (this.f9830b != null) {
            return true;
        }
        return false;
    }

    public final Object next() {
        c cVar;
        c cVar2 = this.f9830b;
        c cVar3 = this.f9829a;
        if (cVar2 == cVar3 || cVar3 == null) {
            cVar = null;
        } else {
            cVar = b(cVar2);
        }
        this.f9830b = cVar;
        return cVar2;
    }
}
