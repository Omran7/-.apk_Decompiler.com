package T1;

import java.lang.Thread;

/* renamed from: T1.o0  reason: case insensitive filesystem */
public final class C0195o0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public final String f3416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0203r0 f3417b;

    public C0195o0(C0203r0 r0Var, String str) {
        this.f3417b = r0Var;
        this.f3416a = str;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        Z z3 = ((C0212u0) this.f3417b.f398a).f3496r;
        C0212u0.k(z3);
        z3.f3172f.b(th, this.f3416a);
    }
}
