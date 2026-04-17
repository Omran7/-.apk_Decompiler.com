package androidx.activity;

import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.T;

public final class ComponentActivity$4 implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f4608a;

    public ComponentActivity$4(o oVar) {
        this.f4608a = oVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        int i2 = o.f4641B;
        o oVar = this.f4608a;
        if (oVar.f4645e == null) {
            j jVar = (j) oVar.getLastNonConfigurationInstance();
            if (jVar != null) {
                oVar.f4645e = jVar.f4627a;
            }
            if (oVar.f4645e == null) {
                oVar.f4645e = new T();
            }
        }
        oVar.f12758a.f(this);
    }
}
