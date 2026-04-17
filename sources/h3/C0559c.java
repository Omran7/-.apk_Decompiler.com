package h3;

import com.mtma.criminal.city.utils.K;

/* renamed from: h3.c  reason: case insensitive filesystem */
public final /* synthetic */ class C0559c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f8125b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K f8126c;

    public /* synthetic */ C0559c(Runnable runnable, K k6, int i2) {
        this.f8124a = i2;
        this.f8125b = runnable;
        this.f8126c = k6;
    }

    public final void run() {
        switch (this.f8124a) {
            case 0:
                try {
                    this.f8125b.run();
                    return;
                } catch (Exception e6) {
                    ((C0565i) this.f8126c.f7360b).y(e6);
                    throw e6;
                }
            case 1:
                try {
                    this.f8125b.run();
                    return;
                } catch (Exception e7) {
                    ((C0565i) this.f8126c.f7360b).y(e7);
                    return;
                }
            default:
                Runnable runnable = this.f8125b;
                C0565i iVar = (C0565i) this.f8126c.f7360b;
                try {
                    runnable.run();
                    iVar.x((Object) null);
                    return;
                } catch (Exception e8) {
                    iVar.y(e8);
                    return;
                }
        }
    }
}
