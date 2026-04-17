package Z2;

import T1.B;
import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.C0349c;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final g f4511a;

    /* renamed from: b  reason: collision with root package name */
    public final B f4512b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f4513c;
    public volatile int d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f4514e = -1;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f4515f;

    public k(Context context, e eVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        I.g(context);
        I.g(eVar);
        g gVar = new g(eVar, executor, scheduledExecutorService);
        B b6 = new B(28);
        this.f4511a = gVar;
        this.f4512b = b6;
        C0349c.b((Application) context.getApplicationContext());
        C0349c.f6081e.a(new j(this, gVar, b6));
    }

    public final boolean a() {
        if (!this.f4515f || this.f4513c || this.d <= 0 || this.f4514e == -1) {
            return false;
        }
        return true;
    }
}
