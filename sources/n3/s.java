package n3;

import I1.b;
import androidx.emoji2.text.g;
import java.util.ArrayList;
import m0.a0;
import q3.e;
import v3.C1048c;

public final class s extends b {

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ v3.s f10325p;

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ a0 f10326q;

    /* renamed from: r  reason: collision with root package name */
    public final /* synthetic */ g f10327r;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ ArrayList f10328s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ y f10329t;

    public s(y yVar, v3.s sVar, a0 a0Var, g gVar, ArrayList arrayList) {
        this.f10329t = yVar;
        this.f10325p = sVar;
        this.f10326q = a0Var;
        this.f10327r = gVar;
        this.f10328s = arrayList;
    }

    public final void P0(Object obj, Object obj2) {
        v3.s sVar;
        C1048c cVar = (C1048c) obj;
        e eVar = (e) obj2;
        v3.s sVar2 = this.f10325p;
        if (sVar2 != null) {
            sVar = sVar2.l(cVar);
        } else {
            sVar = null;
        }
        a0 a0Var = this.f10326q;
        a0 a0Var2 = new a0(((C0866g) a0Var.f9925b).v(cVar), (G) a0Var.f9926c, 7);
        g q6 = this.f10327r.q(cVar);
        if (q6 != null) {
            this.f10328s.addAll(this.f10329t.d(q6, eVar, sVar, a0Var2));
        }
    }
}
