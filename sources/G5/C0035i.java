package G5;

import H5.d;
import java.util.concurrent.ScheduledFuture;

/* renamed from: G5.i  reason: case insensitive filesystem */
public final class C0035i implements C0037j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f916a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f917b;

    public /* synthetic */ C0035i(Object obj, int i2) {
        this.f916a = i2;
        this.f917b = obj;
    }

    public final void a(Throwable th) {
        switch (this.f916a) {
            case 0:
                if (th != null) {
                    ((ScheduledFuture) this.f917b).cancel(false);
                    return;
                }
                return;
            case 1:
                ((d) this.f917b).invoke(th);
                return;
            default:
                ((P) this.f917b).e();
                return;
        }
    }

    public final String toString() {
        switch (this.f916a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.f917b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + d.class.getSimpleName() + '@' + F.j(this) + ']';
            default:
                return "DisposeOnCancel[" + ((P) this.f917b) + ']';
        }
    }
}
