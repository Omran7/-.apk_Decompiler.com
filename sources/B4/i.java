package b4;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class i implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    public k f5530a;

    /* renamed from: b  reason: collision with root package name */
    public k f5531b = null;

    /* renamed from: c  reason: collision with root package name */
    public int f5532c;
    public final /* synthetic */ l d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f5533e;

    public i(l lVar, int i2) {
        this.f5533e = i2;
        this.d = lVar;
        this.f5530a = lVar.f5549f.d;
        this.f5532c = lVar.f5548e;
    }

    public final Object a() {
        return b();
    }

    public final k b() {
        k kVar = this.f5530a;
        l lVar = this.d;
        if (kVar == lVar.f5549f) {
            throw new NoSuchElementException();
        } else if (lVar.f5548e == this.f5532c) {
            this.f5530a = kVar.d;
            this.f5531b = kVar;
            return kVar;
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean hasNext() {
        if (this.f5530a != this.d.f5549f) {
            return true;
        }
        return false;
    }

    public Object next() {
        switch (this.f5533e) {
            case 1:
                return b().f5540f;
            default:
                return a();
        }
    }

    public final void remove() {
        k kVar = this.f5531b;
        if (kVar != null) {
            l lVar = this.d;
            lVar.c(kVar, true);
            this.f5531b = null;
            this.f5532c = lVar.f5548e;
            return;
        }
        throw new IllegalStateException();
    }
}
