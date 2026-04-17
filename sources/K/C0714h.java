package k;

import android.view.View;
import j.i;
import j.k;

/* renamed from: k.h  reason: case insensitive filesystem */
public final class C0714h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final C0710f f9300a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0718j f9301b;

    public C0714h(C0718j jVar, C0710f fVar) {
        this.f9301b = jVar;
        this.f9300a = fVar;
    }

    public final void run() {
        i iVar;
        C0718j jVar = this.f9301b;
        k kVar = jVar.f9325c;
        if (!(kVar == null || (iVar = kVar.f8729e) == null)) {
            iVar.r(kVar);
        }
        View view = (View) jVar.f9329q;
        if (!(view == null || view.getWindowToken() == null)) {
            C0710f fVar = this.f9300a;
            if (!fVar.b()) {
                if (fVar.f8786e != null) {
                    fVar.d(0, 0, false, false);
                }
            }
            jVar.f9319B = fVar;
        }
        jVar.f9321D = null;
    }
}
