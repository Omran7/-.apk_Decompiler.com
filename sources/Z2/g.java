package Z2;

import A4.a;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final e f4501a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4502b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f4503c;
    public volatile ScheduledFuture d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f4504e = -1;

    public g(e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        I.g(eVar);
        this.f4501a = eVar;
        this.f4502b = executor;
        this.f4503c = scheduledExecutorService;
    }

    public final void a() {
        if (this.d != null && !this.d.isDone()) {
            this.d.cancel(false);
        }
    }

    public final void b(long j6) {
        a();
        this.f4504e = -1;
        this.d = this.f4503c.schedule(new a(this, 4), Math.max(0, j6), TimeUnit.MILLISECONDS);
    }
}
