package T1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: T1.p0  reason: case insensitive filesystem */
public final class C0198p0 extends FutureTask implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public final long f3429a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3430b;

    /* renamed from: c  reason: collision with root package name */
    public final String f3431c;
    public final /* synthetic */ C0203r0 d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0198p0(C0203r0 r0Var, Runnable runnable, boolean z3, String str) {
        super(runnable, (Object) null);
        this.d = r0Var;
        long andIncrement = C0203r0.f3444t.getAndIncrement();
        this.f3429a = andIncrement;
        this.f3431c = str;
        this.f3430b = z3;
        if (andIncrement == Long.MAX_VALUE) {
            Z z4 = ((C0212u0) r0Var.f398a).f3496r;
            C0212u0.k(z4);
            z4.f3172f.a("Tasks index overflow");
        }
    }

    public final int compareTo(Object obj) {
        C0198p0 p0Var = (C0198p0) obj;
        boolean z3 = p0Var.f3430b;
        boolean z4 = this.f3430b;
        if (z4 == z3) {
            long j6 = this.f3429a;
            int i2 = (j6 > p0Var.f3429a ? 1 : (j6 == p0Var.f3429a ? 0 : -1));
            if (i2 < 0) {
                return -1;
            }
            if (i2 <= 0) {
                Z z5 = ((C0212u0) this.d.f398a).f3496r;
                C0212u0.k(z5);
                z5.f3173p.b(Long.valueOf(j6), "Two tasks share the same index. index");
                return 0;
            }
        } else if (z4) {
            return -1;
        }
        return 1;
    }

    public final void setException(Throwable th) {
        Z z3 = ((C0212u0) this.d.f398a).f3496r;
        C0212u0.k(z3);
        z3.f3172f.b(th, this.f3431c);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0198p0(C0203r0 r0Var, Callable callable, boolean z3) {
        super(callable);
        this.d = r0Var;
        long andIncrement = C0203r0.f3444t.getAndIncrement();
        this.f3429a = andIncrement;
        this.f3431c = "Task exception on worker thread";
        this.f3430b = z3;
        if (andIncrement == Long.MAX_VALUE) {
            Z z4 = ((C0212u0) r0Var.f398a).f3496r;
            C0212u0.k(z4);
            z4.f3172f.a("Tasks index overflow");
        }
    }
}
