package h3;

import com.mtma.criminal.city.utils.K;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p.C0898a;
import p.h;

/* renamed from: h3.i  reason: case insensitive filesystem */
public final class C0565i extends h implements ScheduledFuture {

    /* renamed from: q  reason: collision with root package name */
    public final ScheduledFuture f8140q;

    public C0565i(C0564h hVar) {
        this.f8140q = hVar.a(new K(this, 20));
    }

    public final int compareTo(Object obj) {
        return this.f8140q.compareTo((Delayed) obj);
    }

    public final long getDelay(TimeUnit timeUnit) {
        return this.f8140q.getDelay(timeUnit);
    }

    public final void j() {
        boolean z3;
        ScheduledFuture scheduledFuture = this.f8140q;
        Object obj = this.f10959a;
        if (!(obj instanceof C0898a) || !((C0898a) obj).f10942a) {
            z3 = false;
        } else {
            z3 = true;
        }
        scheduledFuture.cancel(z3);
    }
}
