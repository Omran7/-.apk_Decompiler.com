package n3;

import i3.C0587c;
import i3.C0588d;
import i3.p;
import k.C0724m;
import s3.C0969g;
import v3.s;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10283a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10284b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10285c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, C0588d dVar, C0587c cVar, int i2) {
        this.f10283a = i2;
        this.d = obj;
        this.f10284b = dVar;
        this.f10285c = cVar;
    }

    public final void run() {
        switch (this.f10283a) {
            case 0:
                ((p) this.d).l((C0588d) this.f10284b, false, (C0587c) this.f10285c);
                return;
            case 1:
                ((l) this.d).f10289b.l((C0588d) this.f10284b, false, (C0587c) this.f10285c);
                return;
            default:
                k kVar = (k) this.f10285c;
                C0724m mVar = kVar.f10287a.d;
                C0866g gVar = ((C0969g) this.d).f11538a;
                s f6 = ((s) mVar.f9345b).f(gVar);
                if (!f6.isEmpty()) {
                    m mVar2 = kVar.f10287a;
                    mVar2.k(mVar2.f10308m.f(gVar, f6));
                    ((G) this.f10284b).c((C0588d) null);
                    return;
                }
                return;
        }
    }

    public i(k kVar, C0969g gVar, G g) {
        this.f10283a = 2;
        this.f10285c = kVar;
        this.d = gVar;
        this.f10284b = g;
    }
}
