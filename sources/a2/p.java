package A2;

import java.util.Iterator;
import java.util.NoSuchElementException;
import q.C0928e;

public final class p extends s {

    /* renamed from: a  reason: collision with root package name */
    public int f55a = 2;

    /* renamed from: b  reason: collision with root package name */
    public Object f56b;

    /* renamed from: c  reason: collision with root package name */
    public final Iterator f57c;
    public final Iterator d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f58e;

    public p(q qVar) {
        this.f58e = qVar;
        this.f57c = qVar.f59a.iterator();
        this.d = qVar.f60b.iterator();
    }

    public final boolean hasNext() {
        Object obj;
        int i2 = this.f55a;
        if (i2 != 4) {
            int c3 = C0928e.c(i2);
            if (c3 == 0) {
                return true;
            }
            if (c3 == 2) {
                return false;
            }
            this.f55a = 4;
            Iterator it2 = this.f57c;
            if (!it2.hasNext()) {
                while (true) {
                    Iterator it3 = this.d;
                    if (!it3.hasNext()) {
                        this.f55a = 3;
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    if (!this.f58e.f59a.contains(obj)) {
                        break;
                    }
                }
            } else {
                obj = it2.next();
            }
            this.f56b = obj;
            if (this.f55a == 3) {
                return false;
            }
            this.f55a = 1;
            return true;
        }
        throw new IllegalStateException();
    }

    public final Object next() {
        if (hasNext()) {
            this.f55a = 2;
            Object obj = this.f56b;
            this.f56b = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
