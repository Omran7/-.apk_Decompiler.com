package v2;

import android.view.View;

/* renamed from: v2.a  reason: case insensitive filesystem */
public final /* synthetic */ class C1042a implements View.OnFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12164a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f12165b;

    public /* synthetic */ C1042a(m mVar, int i2) {
        this.f12164a = i2;
        this.f12165b = mVar;
    }

    public final void onFocusChange(View view, boolean z3) {
        switch (this.f12164a) {
            case 0:
                C1045d dVar = (C1045d) this.f12165b;
                dVar.t(dVar.u());
                return;
            default:
                i iVar = (i) this.f12165b;
                iVar.f12187l = z3;
                iVar.q();
                if (!z3) {
                    iVar.t(false);
                    iVar.f12188m = false;
                    return;
                }
                return;
        }
    }
}
