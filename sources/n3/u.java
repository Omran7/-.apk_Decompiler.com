package n3;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import o3.c;
import o3.e;
import q3.l;

public final class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f10335a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0866g f10336b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0861b f10337c;
    public final /* synthetic */ long d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C0861b f10338e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f10339f;

    public u(y yVar, boolean z3, C0866g gVar, C0861b bVar, long j6, C0861b bVar2) {
        this.f10339f = yVar;
        this.f10335a = z3;
        this.f10336b = gVar;
        this.f10337c = bVar;
        this.d = j6;
        this.f10338e = bVar2;
    }

    public final Object call() {
        boolean z3;
        boolean z4 = this.f10335a;
        long j6 = this.d;
        C0866g gVar = this.f10336b;
        y yVar = this.f10339f;
        if (z4) {
            yVar.f10351f.e();
        }
        G g = yVar.f10348b;
        Long valueOf = Long.valueOf(j6);
        g.getClass();
        if (j6 > ((Long) g.f10252c).longValue()) {
            z3 = true;
        } else {
            z3 = false;
        }
        l.c(z3);
        C0861b bVar = this.f10338e;
        ((ArrayList) g.f10251b).add(new C0857B(j6, gVar, bVar));
        g.f10250a = ((C0861b) g.f10250a).t(gVar, bVar);
        g.f10252c = valueOf;
        return y.a(yVar, new c(e.d, gVar, bVar));
    }
}
