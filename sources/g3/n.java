package g3;

import A4.c;
import D2.l;
import K3.a;
import K3.b;

public final class n implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final l f8039c = new l(28);
    public static final S3.n d = new S3.n(2);

    /* renamed from: a  reason: collision with root package name */
    public a f8040a;

    /* renamed from: b  reason: collision with root package name */
    public volatile b f8041b;

    public n(l lVar, b bVar) {
        this.f8040a = lVar;
        this.f8041b = bVar;
    }

    public final void a(a aVar) {
        b bVar;
        b bVar2;
        b bVar3 = this.f8041b;
        S3.n nVar = d;
        if (bVar3 != nVar) {
            aVar.g(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f8041b;
            if (bVar != nVar) {
                bVar2 = bVar;
            } else {
                this.f8040a = new c((Object) this.f8040a, (Object) aVar, 6);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.g(bVar);
        }
    }

    public final Object get() {
        return this.f8041b.get();
    }
}
