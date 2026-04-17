package l3;

import X4.d;

public final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9734a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f9735b;

    public /* synthetic */ s(d dVar, int i2) {
        this.f9734a = i2;
        this.f9735b = dVar;
    }

    public final void run() {
        switch (this.f9734a) {
            case 0:
                d dVar = this.f9735b;
                ((t) dVar.f4210c).h.cancel(false);
                t tVar = (t) dVar.f4210c;
                tVar.f9738b = true;
                if (tVar.f9743j.y()) {
                    ((t) dVar.f4210c).f9743j.d("websocket opened", (Throwable) null, new Object[0]);
                }
                ((t) dVar.f4210c).e();
                return;
            default:
                d dVar2 = this.f9735b;
                if (((t) dVar2.f4210c).f9743j.y()) {
                    ((t) dVar2.f4210c).f9743j.d("closed", (Throwable) null, new Object[0]);
                }
                t.a((t) dVar2.f4210c);
                return;
        }
    }
}
