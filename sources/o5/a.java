package o5;

import R2.b;
import x5.p;

public abstract class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final h f10472a;

    public a(h hVar) {
        this.f10472a = hVar;
    }

    public final Object fold(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    public g get(h hVar) {
        return b.B(this, hVar);
    }

    public final h getKey() {
        return this.f10472a;
    }

    public i minusKey(h hVar) {
        return b.m0(this, hVar);
    }

    public final i plus(i iVar) {
        return b.v0(this, iVar);
    }
}
