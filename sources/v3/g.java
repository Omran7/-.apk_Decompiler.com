package v3;

import java.util.Stack;
import m0.a0;
import q3.l;

public final class g extends C1050e {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ h f12287p;

    public g(h hVar) {
        this.f12287p = hVar;
    }

    public final void S0(C1048c cVar, s sVar) {
        h hVar = this.f12287p;
        hVar.c();
        if (hVar.f12291e) {
            hVar.f12288a.append(",");
        }
        hVar.f12288a.append(l.f(cVar.f12280a));
        hVar.f12288a.append(":(");
        int i2 = hVar.d;
        Stack stack = hVar.f12289b;
        if (i2 == stack.size()) {
            stack.add(cVar);
        } else {
            stack.set(hVar.d, cVar);
        }
        hVar.d++;
        hVar.f12291e = false;
        a0.t(sVar, hVar);
        hVar.d--;
        StringBuilder sb = hVar.f12288a;
        if (sb != null) {
            sb.append(")");
        }
        hVar.f12291e = true;
    }
}
