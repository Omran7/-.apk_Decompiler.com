package R3;

import G5.C0020a0;
import J2.o;
import V2.b;
import V2.c;
import g3.d;
import g3.p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;

public final class a implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f2505b = new a(0);

    /* renamed from: c  reason: collision with root package name */
    public static final a f2506c = new a(1);
    public static final a d = new a(2);

    /* renamed from: e  reason: collision with root package name */
    public static final a f2507e = new a(3);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2508a;

    public /* synthetic */ a(int i2) {
        this.f2508a = i2;
    }

    public final Object f(o oVar) {
        switch (this.f2508a) {
            case 0:
                Object e6 = oVar.e(new p(V2.a.class, Executor.class));
                j.d(e6, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e6);
            case 1:
                Object e7 = oVar.e(new p(c.class, Executor.class));
                j.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e7);
            case 2:
                Object e8 = oVar.e(new p(b.class, Executor.class));
                j.d(e8, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e8);
            default:
                Object e9 = oVar.e(new p(V2.d.class, Executor.class));
                j.d(e9, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new C0020a0((Executor) e9);
        }
    }
}
