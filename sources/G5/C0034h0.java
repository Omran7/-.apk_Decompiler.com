package G5;

import E5.d;
import java.util.concurrent.CancellationException;
import o5.g;
import x5.l;

/* renamed from: G5.h0  reason: case insensitive filesystem */
public interface C0034h0 extends g {
    C0043o attachChild(C0045q qVar);

    void cancel(CancellationException cancellationException);

    CancellationException getCancellationException();

    d getChildren();

    P invokeOnCompletion(l lVar);

    P invokeOnCompletion(boolean z3, boolean z4, l lVar);

    boolean isActive();

    Object join(o5.d dVar);

    boolean start();
}
