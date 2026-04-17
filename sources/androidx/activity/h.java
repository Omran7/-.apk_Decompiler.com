package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import kotlin.jvm.internal.j;

public final /* synthetic */ class h implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ B f4624a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f4625b;

    public /* synthetic */ h(B b6, o oVar) {
        this.f4624a = b6;
        this.f4625b = oVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        B b6 = this.f4624a;
        o oVar = this.f4625b;
        if (mVar == C0302m.ON_CREATE) {
            OnBackInvokedDispatcher a6 = i.f4626a.a(oVar);
            j.e(a6, "invoker");
            b6.f4602e = a6;
            b6.e(b6.g);
        }
    }
}
