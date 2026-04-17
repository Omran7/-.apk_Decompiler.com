package E0;

import B2.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final b f579a;

    /* renamed from: b  reason: collision with root package name */
    public final String f580b;

    /* renamed from: c  reason: collision with root package name */
    public final d f581c;
    public final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicInteger f582e = new AtomicInteger();

    public c(b bVar, String str, boolean z3) {
        d dVar = d.f583a;
        this.f579a = bVar;
        this.f580b = str;
        this.f581c = dVar;
        this.d = z3;
    }

    public final Thread newThread(Runnable runnable) {
        a aVar = new a(this, runnable, 1, false);
        this.f579a.getClass();
        a aVar2 = new a((Runnable) aVar);
        aVar2.setName("glide-" + this.f580b + "-thread-" + this.f582e.getAndIncrement());
        return aVar2;
    }
}
