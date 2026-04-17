package androidx.activity;

import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0306q;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import kotlin.jvm.internal.j;

final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements C0306q, C0268c {

    /* renamed from: a  reason: collision with root package name */
    public final C0309u f4609a;

    /* renamed from: b  reason: collision with root package name */
    public final C f4610b;

    /* renamed from: c  reason: collision with root package name */
    public z f4611c;
    public final /* synthetic */ B d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(B b6, C0309u uVar, C c3) {
        j.e(c3, "onBackPressedCallback");
        this.d = b6;
        this.f4609a = uVar;
        this.f4610b = c3;
        uVar.a(this);
    }

    public final void a(C0307s sVar, C0302m mVar) {
        if (mVar == C0302m.ON_START) {
            this.f4611c = this.d.b(this.f4610b);
        } else if (mVar == C0302m.ON_STOP) {
            z zVar = this.f4611c;
            if (zVar != null) {
                zVar.cancel();
            }
        } else if (mVar == C0302m.ON_DESTROY) {
            cancel();
        }
    }

    public final void cancel() {
        this.f4609a.f(this);
        this.f4610b.f4605b.remove(this);
        z zVar = this.f4611c;
        if (zVar != null) {
            zVar.cancel();
        }
        this.f4611c = null;
    }
}
