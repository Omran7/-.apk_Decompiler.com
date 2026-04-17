package B0;

import Q0.f;
import U0.g;

public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f292a;

    /* renamed from: b  reason: collision with root package name */
    public final f f293b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ u f294c;

    public /* synthetic */ r(u uVar, f fVar, int i2) {
        this.f292a = i2;
        this.f294c = uVar;
        this.f293b = fVar;
    }

    public final void run() {
        switch (this.f292a) {
            case 0:
                f fVar = this.f293b;
                fVar.f2364b.a();
                synchronized (fVar.f2365c) {
                    synchronized (this.f294c) {
                        try {
                            t tVar = this.f294c.f303a;
                            f fVar2 = this.f293b;
                            tVar.getClass();
                            if (tVar.f297a.contains(new s(fVar2, g.f3684b))) {
                                u uVar = this.f294c;
                                f fVar3 = this.f293b;
                                uVar.getClass();
                                fVar3.j(uVar.f318z, 5);
                            }
                            this.f294c.c();
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                }
                return;
            default:
                f fVar4 = this.f293b;
                fVar4.f2364b.a();
                synchronized (fVar4.f2365c) {
                    synchronized (this.f294c) {
                        try {
                            t tVar2 = this.f294c.f303a;
                            f fVar5 = this.f293b;
                            tVar2.getClass();
                            if (tVar2.f297a.contains(new s(fVar5, g.f3684b))) {
                                this.f294c.f299B.a();
                                u uVar2 = this.f294c;
                                f fVar6 = this.f293b;
                                uVar2.getClass();
                                fVar6.l(uVar2.f299B, uVar2.f316x, uVar2.f302E);
                                this.f294c.g(this.f293b);
                            }
                            this.f294c.c();
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                }
                return;
        }
    }
}
