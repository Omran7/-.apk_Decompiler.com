package k3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n3.C0866g;
import v3.C1048c;

public final class k implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9474a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f9475b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Iterable f9476c;

    public k(C0866g gVar) {
        this.f9476c = gVar;
        this.f9475b = gVar.f10277b;
    }

    public final boolean hasNext() {
        switch (this.f9474a) {
            case 0:
                if (this.f9475b >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.f9475b < ((C0866g) this.f9476c).f10278c) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        switch (this.f9474a) {
            case 0:
                long j6 = ((l) this.f9476c).f9477a;
                int i2 = this.f9475b;
                Object obj = new Object();
                Math.pow(2.0d, (double) i2);
                this.f9475b--;
                return obj;
            default:
                if (hasNext()) {
                    C1048c[] cVarArr = ((C0866g) this.f9476c).f10276a;
                    int i5 = this.f9475b;
                    C1048c cVar = cVarArr[i5];
                    this.f9475b = i5 + 1;
                    return cVar;
                }
                throw new NoSuchElementException("No more elements.");
        }
    }

    public final void remove() {
        switch (this.f9474a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException("Can't remove component from immutable Path!");
        }
    }

    public k(l lVar) {
        this.f9476c = lVar;
        this.f9475b = lVar.f9478b - 1;
    }

    private final void a() {
    }
}
