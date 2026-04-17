package y2;

import w0.C1067n;

/* renamed from: y2.c  reason: case insensitive filesystem */
public final class C1112c extends C1109A {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ int f12689p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ Object f12690q;

    public /* synthetic */ C1112c(Object obj, int i2) {
        this.f12689p = i2;
        this.f12690q = obj;
    }

    public final void b() {
        switch (this.f12689p) {
            case 0:
                C1067n nVar = (C1067n) this.f12690q;
                C1113d dVar = (C1113d) nVar.f12386b;
                dVar.f12693b.b("unlinkToDeath", new Object[0]);
                dVar.f12702n.asBinder().unlinkToDeath(dVar.f12699k, 0);
                C1113d dVar2 = (C1113d) nVar.f12386b;
                dVar2.f12702n = null;
                dVar2.g = false;
                return;
            default:
                synchronized (((C1113d) this.f12690q).f12696f) {
                    try {
                        if (((C1113d) this.f12690q).f12700l.get() <= 0 || ((C1113d) this.f12690q).f12700l.decrementAndGet() <= 0) {
                            C1113d dVar3 = (C1113d) this.f12690q;
                            if (dVar3.f12702n != null) {
                                dVar3.f12693b.b("Unbind from service.", new Object[0]);
                                C1113d dVar4 = (C1113d) this.f12690q;
                                dVar4.f12692a.unbindService(dVar4.f12701m);
                                C1113d dVar5 = (C1113d) this.f12690q;
                                dVar5.g = false;
                                dVar5.f12702n = null;
                                dVar5.f12701m = null;
                            }
                            ((C1113d) this.f12690q).e();
                            return;
                        }
                        ((C1113d) this.f12690q).f12693b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}
