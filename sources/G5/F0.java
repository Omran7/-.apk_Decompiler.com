package G5;

import I5.s;
import q5.c;

public final class F0 extends s implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    public final long f868e;

    public F0(long j6, c cVar) {
        super(cVar.getContext(), cVar);
        this.f868e = j6;
    }

    public final String C() {
        return super.C() + "(timeMillis=" + this.f868e + ')';
    }

    public final void run() {
        F.i(this.f893c);
        i(new E0("Timed out waiting for " + this.f868e + " ms", this));
    }
}
