package T1;

import i3.C0586b;
import i3.C0587c;
import java.util.Iterator;
import java.util.Map;
import v3.C1048c;
import v3.m;
import v3.q;
import v3.s;

/* renamed from: T1.t  reason: case insensitive filesystem */
public final class C0208t implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3468a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f3469b;

    public /* synthetic */ C0208t(Object obj, int i2) {
        this.f3468a = i2;
        this.f3469b = obj;
    }

    public final boolean hasNext() {
        switch (this.f3468a) {
            case 0:
                return ((Iterator) this.f3469b).hasNext();
            case 1:
                return ((Iterator) this.f3469b).hasNext();
            case 2:
                return ((Iterator) this.f3469b).hasNext();
            default:
                return ((C0586b) this.f3469b).f8276a.hasNext();
        }
    }

    public final Object next() {
        switch (this.f3468a) {
            case 0:
                return (String) ((Iterator) this.f3469b).next();
            case 1:
                return ((Map.Entry) ((Iterator) this.f3469b).next()).getKey();
            case 2:
                Map.Entry entry = (Map.Entry) ((Iterator) this.f3469b).next();
                return new q((C1048c) entry.getKey(), (s) entry.getValue());
            default:
                C0586b bVar = (C0586b) this.f3469b;
                q qVar = (q) bVar.f8276a.next();
                return new C0587c(bVar.f8277b.f8279b.E(qVar.f12304a.f12280a), m.t(qVar.f12305b));
        }
    }

    public final void remove() {
        switch (this.f3468a) {
            case 0:
                throw new UnsupportedOperationException("Remove not supported");
            case 1:
                ((Iterator) this.f3469b).remove();
                return;
            case 2:
                ((Iterator) this.f3469b).remove();
                return;
            default:
                throw new UnsupportedOperationException("remove called on immutable collection");
        }
    }

    public C0208t(C0211u uVar) {
        this.f3468a = 0;
        this.f3469b = uVar.f3472a.keySet().iterator();
    }
}
