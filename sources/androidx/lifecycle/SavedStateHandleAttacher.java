package androidx.lifecycle;

public final class SavedStateHandleAttacher implements C0306q {

    /* renamed from: a  reason: collision with root package name */
    public final K f5254a;

    public SavedStateHandleAttacher(K k6) {
        this.f5254a = k6;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        if (mVar == C0302m.ON_CREATE) {
            sVar.h().f(this);
            this.f5254a.b();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
    }
}
