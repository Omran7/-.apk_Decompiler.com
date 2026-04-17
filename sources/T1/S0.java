package T1;

import B2.a;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import y4.C1118e;

public final /* synthetic */ class S0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3033a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f3034b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f3035c;
    public final /* synthetic */ Object d;

    public /* synthetic */ S0(C0157b1 b1Var, Bundle bundle, long j6) {
        this.f3033a = 0;
        this.f3035c = b1Var;
        this.d = bundle;
        this.f3034b = j6;
    }

    public final void run() {
        switch (this.f3033a) {
            case 0:
                C0157b1 b1Var = (C0157b1) this.f3035c;
                if (TextUtils.isEmpty(((C0212u0) b1Var.f398a).n().v())) {
                    b1Var.E((Bundle) this.d, 0, this.f3034b);
                    return;
                }
                Z z3 = ((C0212u0) b1Var.f398a).f3496r;
                C0212u0.k(z3);
                z3.f3177t.a("Using developer consent only; google app id found");
                return;
            case 1:
                long j6 = this.f3034b;
                C0190m1 m1Var = (C0190m1) this.d;
                m1Var.u((C0181j1) this.f3035c, false, j6);
                m1Var.f3381e = null;
                C0219w1 r6 = ((C0212u0) m1Var.f398a).r();
                r6.o();
                r6.p();
                r6.F(new a(r6, (Object) null, 17, false));
                return;
            default:
                TextView textView = (TextView) this.f3035c;
                if (textView.isShown()) {
                    long j7 = this.f3034b;
                    int i2 = (j7 > 0 ? 1 : (j7 == 0 ? 0 : -1));
                    C1118e eVar = (C1118e) this.d;
                    if (i2 == 0) {
                        C1118e.V(eVar);
                        return;
                    } else {
                        eVar.a0(textView, j7 - 1);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ S0(Object obj, Object obj2, long j6, int i2) {
        this.f3033a = i2;
        this.f3035c = obj2;
        this.f3034b = j6;
        this.d = obj;
    }
}
