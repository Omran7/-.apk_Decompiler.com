package G;

import G5.C0040l;
import I1.b;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final C0040l f800a;

    public f(C0040l lVar) {
        super(false);
        this.f800a = lVar;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f800a.resumeWith(b.r(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f800a.resumeWith(obj);
        }
    }

    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
