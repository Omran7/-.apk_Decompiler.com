package R2;

import G5.C0020a0;
import J2.o;
import V2.a;
import V2.b;
import V2.c;
import g3.d;
import g3.p;
import java.util.concurrent.Executor;

public final class j implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final j f2496b = new j(0);

    /* renamed from: c  reason: collision with root package name */
    public static final j f2497c = new j(1);
    public static final j d = new j(2);

    /* renamed from: e  reason: collision with root package name */
    public static final j f2498e = new j(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2499a;

    public /* synthetic */ j(int i2) {
        this.f2499a = i2;
    }

    public final Object f(o oVar) {
        switch (this.f2499a) {
            case 0:
                Object e6 = oVar.e(new p(a.class, Executor.class));
                kotlin.jvm.internal.j.d(e6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e6);
            case 1:
                Object e7 = oVar.e(new p(c.class, Executor.class));
                kotlin.jvm.internal.j.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e7);
            case 2:
                Object e8 = oVar.e(new p(b.class, Executor.class));
                kotlin.jvm.internal.j.d(e8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e8);
            default:
                Object e9 = oVar.e(new p(V2.d.class, Executor.class));
                kotlin.jvm.internal.j.d(e9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e9);
        }
    }
}
