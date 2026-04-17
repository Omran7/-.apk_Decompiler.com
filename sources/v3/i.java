package v3;

import java.util.Map;
import q3.l;
import z0.C1129e;

public final class i extends o {

    /* renamed from: c  reason: collision with root package name */
    public final Map f12293c;

    public i(Map map, s sVar) {
        super(sVar);
        this.f12293c = map;
    }

    public final s b(s sVar) {
        l.c(C1129e.d(sVar));
        return new i(this.f12293c, sVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f12293c.equals(iVar.f12293c) || !this.f12300a.equals(iVar.f12300a)) {
            return false;
        }
        return true;
    }

    public final String g(int i2) {
        return v(i2) + "deferredValue:" + this.f12293c;
    }

    public final Object getValue() {
        return this.f12293c;
    }

    public final int hashCode() {
        return this.f12300a.hashCode() + this.f12293c.hashCode();
    }

    public final /* bridge */ /* synthetic */ int k(o oVar) {
        i iVar = (i) oVar;
        return 0;
    }

    public final int t() {
        return 1;
    }
}
