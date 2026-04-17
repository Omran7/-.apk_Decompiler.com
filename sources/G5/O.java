package G5;

import java.util.concurrent.ScheduledFuture;

public final class O implements P {

    /* renamed from: a  reason: collision with root package name */
    public final ScheduledFuture f879a;

    public O(ScheduledFuture scheduledFuture) {
        this.f879a = scheduledFuture;
    }

    public final void e() {
        this.f879a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f879a + ']';
    }
}
