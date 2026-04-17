package k;

import androidx.appcompat.widget.Toolbar;
import j.m;

/* renamed from: k.T0  reason: case insensitive filesystem */
public final /* synthetic */ class C0688T0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9235a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Toolbar f9236b;

    public /* synthetic */ C0688T0(Toolbar toolbar, int i2) {
        this.f9235a = i2;
        this.f9236b = toolbar;
    }

    public final void run() {
        m mVar;
        switch (this.f9235a) {
            case 0:
                C0692V0 v02 = this.f9236b.f4809U;
                if (v02 == null) {
                    mVar = null;
                } else {
                    mVar = v02.f9238b;
                }
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            default:
                this.f9236b.n();
                return;
        }
    }
}
