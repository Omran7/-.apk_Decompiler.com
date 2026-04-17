package androidx.lifecycle;

import kotlin.jvm.internal.j;

/* renamed from: androidx.lifecycle.t  reason: case insensitive filesystem */
public final class C0308t {

    /* renamed from: a  reason: collision with root package name */
    public C0303n f5274a;

    /* renamed from: b  reason: collision with root package name */
    public C0306q f5275b;

    public final void a(C0307s sVar, C0302m mVar) {
        C0303n a6 = mVar.a();
        C0303n nVar = this.f5274a;
        j.e(nVar, "state1");
        if (a6.compareTo(nVar) < 0) {
            nVar = a6;
        }
        this.f5274a = nVar;
        this.f5275b.a(sVar, mVar);
        this.f5274a = a6;
    }
}
