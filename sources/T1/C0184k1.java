package T1;

import android.os.Bundle;

/* renamed from: T1.k1  reason: case insensitive filesystem */
public final class C0184k1 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0181j1 f3366a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0181j1 f3367b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f3368c;
    public final /* synthetic */ boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0190m1 f3369e;

    public C0184k1(C0190m1 m1Var, C0181j1 j1Var, C0181j1 j1Var2, long j6, boolean z3) {
        this.f3366a = j1Var;
        this.f3367b = j1Var2;
        this.f3368c = j6;
        this.d = z3;
        this.f3369e = m1Var;
    }

    public final void run() {
        this.f3369e.t(this.f3366a, this.f3367b, this.f3368c, this.d, (Bundle) null);
    }
}
