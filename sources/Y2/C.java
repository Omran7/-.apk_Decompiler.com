package y2;

import K4.h;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class C extends C1109A {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12682p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C1109A f12683q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C1113d f12684r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C(C1113d dVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, C1109A a6) {
        super(taskCompletionSource);
        this.f12684r = dVar;
        this.f12682p = taskCompletionSource2;
        this.f12683q = a6;
    }

    public final void b() {
        synchronized (this.f12684r.f12696f) {
            try {
                C1113d dVar = this.f12684r;
                TaskCompletionSource taskCompletionSource = this.f12682p;
                dVar.f12695e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new h(dVar, taskCompletionSource, 12));
                if (this.f12684r.f12700l.getAndIncrement() > 0) {
                    this.f12684r.f12693b.b("Already connected to the service.", new Object[0]);
                }
                C1113d.b(this.f12684r, this.f12683q);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
