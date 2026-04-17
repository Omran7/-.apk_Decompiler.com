package n;

import java.util.Iterator;
import java.util.NoSuchElementException;
import y5.a;

/* renamed from: n.a  reason: case insensitive filesystem */
public final class C0850a implements Iterator, a {

    /* renamed from: a  reason: collision with root package name */
    public int f10205a;

    /* renamed from: b  reason: collision with root package name */
    public int f10206b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10207c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f10208e;

    public C0850a(int i2) {
        this.f10205a = i2;
    }

    public final boolean hasNext() {
        if (this.f10206b < this.f10205a) {
            return true;
        }
        return false;
    }

    public final Object next() {
        Object obj;
        if (hasNext()) {
            int i2 = this.f10206b;
            switch (this.d) {
                case 0:
                    obj = ((e) this.f10208e).f(i2);
                    break;
                case 1:
                    obj = ((e) this.f10208e).j(i2);
                    break;
                default:
                    obj = ((f) this.f10208e).f10217b[i2];
                    break;
            }
            this.f10206b++;
            this.f10207c = true;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f10207c) {
            int i2 = this.f10206b - 1;
            this.f10206b = i2;
            switch (this.d) {
                case 0:
                    ((e) this.f10208e).h(i2);
                    break;
                case 1:
                    ((e) this.f10208e).h(i2);
                    break;
                default:
                    ((f) this.f10208e).k(i2);
                    break;
            }
            this.f10205a--;
            this.f10207c = false;
            return;
        }
        throw new IllegalStateException("Call next() before removing an element.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0850a(f fVar) {
        this(fVar.f10218c);
        this.d = 2;
        this.f10208e = fVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C0850a(e eVar, int i2) {
        this(eVar.f10226c);
        this.d = i2;
        switch (i2) {
            case 1:
                this.f10208e = eVar;
                this(eVar.f10226c);
                return;
            default:
                this.f10208e = eVar;
                return;
        }
    }
}
