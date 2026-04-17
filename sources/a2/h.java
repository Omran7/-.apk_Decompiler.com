package A2;

import java.util.NoSuchElementException;

public final class h extends s {

    /* renamed from: a  reason: collision with root package name */
    public boolean f33a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f34b;

    public h(Object obj) {
        this.f34b = obj;
    }

    public final boolean hasNext() {
        return !this.f33a;
    }

    public final Object next() {
        if (!this.f33a) {
            this.f33a = true;
            return this.f34b;
        }
        throw new NoSuchElementException();
    }
}
