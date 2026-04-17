package f;

import android.view.Window;
import j.k;
import j.v;
import k.C0719j0;

public final class q implements C0719j0, v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z f7800a;

    public /* synthetic */ q(z zVar) {
        this.f7800a = zVar;
    }

    public void a(k kVar, boolean z3) {
        boolean z4;
        int i2;
        y yVar;
        k k6 = kVar.k();
        int i5 = 0;
        if (k6 != kVar) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            kVar = k6;
        }
        z zVar = this.f7800a;
        y[] yVarArr = zVar.f7844U;
        if (yVarArr != null) {
            i2 = yVarArr.length;
        } else {
            i2 = 0;
        }
        while (true) {
            if (i5 < i2) {
                yVar = yVarArr[i5];
                if (yVar != null && yVar.h == kVar) {
                    break;
                }
                i5++;
            } else {
                yVar = null;
                break;
            }
        }
        if (yVar == null) {
            return;
        }
        if (z4) {
            zVar.n(yVar.f7810a, yVar, k6);
            zVar.p(yVar, true);
            return;
        }
        zVar.p(yVar, z3);
    }

    public boolean p(k kVar) {
        Window.Callback callback;
        if (kVar != kVar.k()) {
            return true;
        }
        z zVar = this.f7800a;
        if (!zVar.f7838O || (callback = zVar.f7868u.getCallback()) == null || zVar.f7849Z) {
            return true;
        }
        callback.onMenuOpened(108, kVar);
        return true;
    }
}
