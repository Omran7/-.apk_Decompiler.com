package E5;

import c.C0332g;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.j;
import y5.a;

public final class b implements Iterator, a {

    /* renamed from: a  reason: collision with root package name */
    public Object f654a;

    /* renamed from: b  reason: collision with root package name */
    public int f655b = -2;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f656c;

    public b(c cVar) {
        this.f656c = cVar;
    }

    public final void a() {
        Object obj;
        int i2 = this.f655b;
        c cVar = this.f656c;
        if (i2 == -2) {
            cVar.getClass();
            obj = C0332g.f5569a.invoke();
        } else {
            Object obj2 = this.f654a;
            j.b(obj2);
            obj = ((h) cVar.f658b).invoke(obj2);
        }
        this.f654a = obj;
        this.f655b = 1;
    }

    public final boolean hasNext() {
        if (this.f655b < 0) {
            a();
        }
        if (this.f655b == 1) {
            return true;
        }
        return false;
    }

    public final Object next() {
        if (this.f655b < 0) {
            a();
        }
        if (this.f655b != 0) {
            Object obj = this.f654a;
            j.c(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f655b = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
