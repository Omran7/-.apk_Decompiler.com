package p;

import B2.a;
import B2.b;
import G.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

public final class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference f10966a;

    /* renamed from: b  reason: collision with root package name */
    public final j f10967b = new j(this);

    public k(i iVar) {
        this.f10966a = new WeakReference(iVar);
    }

    public final void a(a aVar, g gVar) {
        this.f10967b.a(aVar, gVar);
    }

    public final boolean cancel(boolean z3) {
        i iVar = (i) this.f10966a.get();
        boolean cancel = this.f10967b.cancel(z3);
        if (cancel && iVar != null) {
            iVar.f10962a = null;
            iVar.f10963b = null;
            iVar.f10964c.x((Object) null);
        }
        return cancel;
    }

    public final Object get() {
        return this.f10967b.get();
    }

    public final boolean isCancelled() {
        return this.f10967b.f10959a instanceof C0898a;
    }

    public final boolean isDone() {
        return this.f10967b.isDone();
    }

    public final String toString() {
        return this.f10967b.toString();
    }

    public final Object get(long j6, TimeUnit timeUnit) {
        return this.f10967b.get(j6, timeUnit);
    }
}
