package h3;

import com.mtma.criminal.city.utils.K;

/* renamed from: h3.e  reason: case insensitive filesystem */
public final /* synthetic */ class C0561e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8132a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0563g f8133b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Runnable f8134c;
    public final /* synthetic */ K d;

    public /* synthetic */ C0561e(C0563g gVar, Runnable runnable, K k6, int i2) {
        this.f8132a = i2;
        this.f8133b = gVar;
        this.f8134c = runnable;
        this.d = k6;
    }

    public final void run() {
        switch (this.f8132a) {
            case 0:
                C0563g gVar = this.f8133b;
                gVar.getClass();
                gVar.f8138a.execute(new C0559c(this.f8134c, this.d, 0));
                return;
            case 1:
                C0563g gVar2 = this.f8133b;
                gVar2.getClass();
                gVar2.f8138a.execute(new C0559c(this.f8134c, this.d, 2));
                return;
            default:
                C0563g gVar3 = this.f8133b;
                gVar3.getClass();
                gVar3.f8138a.execute(new C0559c(this.f8134c, this.d, 1));
                return;
        }
    }
}
