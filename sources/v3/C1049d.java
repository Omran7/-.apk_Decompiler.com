package v3;

import I1.b;

/* renamed from: v3.d  reason: case insensitive filesystem */
public final class C1049d extends b {

    /* renamed from: p  reason: collision with root package name */
    public boolean f12281p = false;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ C1050e f12282q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ C1051f f12283r;

    public C1049d(C1051f fVar, C1050e eVar) {
        this.f12283r = fVar;
        this.f12282q = eVar;
    }

    public final void P0(Object obj, Object obj2) {
        C1048c cVar = (C1048c) obj;
        s sVar = (s) obj2;
        boolean z3 = this.f12281p;
        C1050e eVar = this.f12282q;
        if (!z3) {
            C1048c cVar2 = C1048c.d;
            if (cVar.compareTo(cVar2) > 0) {
                this.f12281p = true;
                eVar.S0(cVar2, this.f12283r.c());
            }
        }
        eVar.S0(cVar, sVar);
    }
}
