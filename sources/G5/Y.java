package G5;

import n5.C0873e;

public abstract class Y extends A {

    /* renamed from: c  reason: collision with root package name */
    public long f891c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public C0873e f892e;

    public final void l() {
        long j6 = this.f891c - 4294967296L;
        this.f891c = j6;
        if (j6 <= 0 && this.d) {
            shutdown();
        }
    }

    public abstract Thread m();

    public final void n(boolean z3) {
        long j6;
        long j7 = this.f891c;
        if (z3) {
            j6 = 4294967296L;
        } else {
            j6 = 1;
        }
        this.f891c = j6 + j7;
        if (!z3) {
            this.d = true;
        }
    }

    public final boolean o() {
        Object obj;
        C0873e eVar = this.f892e;
        if (eVar == null) {
            return false;
        }
        if (eVar.isEmpty()) {
            obj = null;
        } else {
            obj = eVar.removeFirst();
        }
        M m6 = (M) obj;
        if (m6 == null) {
            return false;
        }
        m6.run();
        return true;
    }

    public void p(long j6, V v6) {
        G.f869r.u(j6, v6);
    }

    public abstract void shutdown();
}
