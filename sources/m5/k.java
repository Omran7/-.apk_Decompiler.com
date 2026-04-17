package M5;

import I5.t;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class k extends t {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f1889e = new AtomicReferenceArray(j.f1888f);

    public k(long j6, k kVar, int i2) {
        super(j6, kVar, i2);
    }

    public final int e() {
        return j.f1888f;
    }

    public final void f(int i2) {
        this.f1889e.set(i2, j.f1887e);
        if (t.d.incrementAndGet(this) == j.f1888f) {
            c();
        }
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f1278c + ", hashCode=" + hashCode() + ']';
    }
}
