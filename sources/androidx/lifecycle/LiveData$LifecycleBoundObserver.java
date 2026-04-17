package androidx.lifecycle;

class LiveData$LifecycleBoundObserver extends x implements C0306q {

    /* renamed from: e  reason: collision with root package name */
    public final C0307s f5237e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ y f5238f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(y yVar, C0307s sVar, z zVar) {
        super(yVar, zVar);
        this.f5238f = yVar;
        this.f5237e = sVar;
    }

    public final void a(C0307s sVar, C0302m mVar) {
        C0307s sVar2 = this.f5237e;
        C0303n nVar = sVar2.h().f5278c;
        if (nVar == C0303n.f5268a) {
            this.f5238f.h(this.f5283a);
            return;
        }
        C0303n nVar2 = null;
        while (nVar2 != nVar) {
            b(f());
            nVar2 = nVar;
            nVar = sVar2.h().f5278c;
        }
    }

    public final void d() {
        this.f5237e.h().f(this);
    }

    public final boolean e(C0307s sVar) {
        if (this.f5237e == sVar) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f5237e.h().f5278c.compareTo(C0303n.d) >= 0) {
            return true;
        }
        return false;
    }
}
