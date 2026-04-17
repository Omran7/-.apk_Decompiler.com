package androidx.lifecycle;

import k.C0738t;
import kotlin.jvm.internal.j;

public final class SavedStateHandleController implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final String f5255a;

    /* renamed from: b  reason: collision with root package name */
    public final H f5256b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5257c;

    public SavedStateHandleController(String str, H h) {
        this.f5255a = str;
        this.f5256b = h;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        if (mVar == C0302m.ON_DESTROY) {
            this.f5257c = false;
            sVar.h().f(this);
        }
    }

    public final void b(C0309u uVar, C0738t tVar) {
        j.e(tVar, "registry");
        j.e(uVar, "lifecycle");
        if (!this.f5257c) {
            this.f5257c = true;
            uVar.a(this);
            tVar.f(this.f5255a, this.f5256b.f5227e);
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }
}
