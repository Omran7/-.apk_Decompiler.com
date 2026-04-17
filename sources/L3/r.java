package l3;

import X4.d;
import c1.i;
import w3.C1083d;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9732a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t f9733b;

    public /* synthetic */ r(t tVar, int i2) {
        this.f9732a = i2;
        this.f9733b = tVar;
    }

    public final void run() {
        switch (this.f9732a) {
            case 0:
                t tVar = this.f9733b;
                if (!tVar.f9738b && !tVar.f9739c) {
                    i iVar = tVar.f9743j;
                    if (iVar.y()) {
                        iVar.d("timed out on connect", (Throwable) null, new Object[0]);
                    }
                    ((C1083d) tVar.f9737a.f4209b).a();
                    return;
                }
                return;
            default:
                t tVar2 = this.f9733b;
                d dVar = tVar2.f9737a;
                if (dVar != null) {
                    dVar.M("0");
                    tVar2.e();
                    return;
                }
                return;
        }
    }
}
