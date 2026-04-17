package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import n5.C0871c;

public class a implements Iterator, y5.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9647a = 1;

    /* renamed from: b  reason: collision with root package name */
    public int f9648b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9649c;

    public a(Object[] objArr) {
        j.e(objArr, "array");
        this.f9649c = objArr;
    }

    public final boolean hasNext() {
        switch (this.f9647a) {
            case 0:
                if (this.f9648b < ((Object[]) this.f9649c).length) {
                    return true;
                }
                return false;
            default:
                if (this.f9648b < ((C0871c) this.f9649c).k()) {
                    return true;
                }
                return false;
        }
    }

    public final Object next() {
        switch (this.f9647a) {
            case 0:
                try {
                    int i2 = this.f9648b;
                    this.f9648b = i2 + 1;
                    return ((Object[]) this.f9649c)[i2];
                } catch (ArrayIndexOutOfBoundsException e6) {
                    this.f9648b--;
                    throw new NoSuchElementException(e6.getMessage());
                }
            default:
                if (hasNext()) {
                    int i5 = this.f9648b;
                    this.f9648b = i5 + 1;
                    return ((C0871c) this.f9649c).get(i5);
                }
                throw new NoSuchElementException();
        }
    }

    public final void remove() {
        switch (this.f9647a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public a(C0871c cVar) {
        this.f9649c = cVar;
    }
}
