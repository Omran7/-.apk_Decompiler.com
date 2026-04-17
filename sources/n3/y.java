package n3;

import androidx.emoji2.text.g;
import c1.i;
import i3.C0588d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import m0.a0;
import p3.C0917a;
import q3.C0936a;
import q3.e;
import q3.l;
import s3.C0969g;
import v3.C1048c;
import v3.s;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public e f10347a = e.d;

    /* renamed from: b  reason: collision with root package name */
    public final G f10348b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f10349c;
    public final HashMap d;

    /* renamed from: e  reason: collision with root package name */
    public final x f10350e;

    /* renamed from: f  reason: collision with root package name */
    public final C0917a f10351f;
    public final i g;
    public long h = 1;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, n3.G] */
    public y(C0864e eVar, C0917a aVar, x xVar) {
        ? obj = new Object();
        obj.f10250a = C0861b.f10257b;
        obj.f10251b = new ArrayList();
        obj.f10252c = -1L;
        this.f10348b = obj;
        this.f10349c = new HashMap();
        this.d = new HashMap();
        new HashSet();
        this.f10350e = xVar;
        this.f10351f = aVar;
        this.g = eVar.b("SyncTree");
    }

    public static ArrayList a(y yVar, g gVar) {
        e eVar = yVar.f10347a;
        C0866g gVar2 = C0866g.d;
        G g5 = yVar.f10348b;
        g5.getClass();
        return yVar.e(gVar, eVar, (s) null, new a0(gVar2, g5, 7));
    }

    public static ArrayList b(y yVar, C0969g gVar, g gVar2) {
        boolean z3;
        yVar.getClass();
        e eVar = yVar.f10347a;
        C0866g gVar3 = gVar.f11538a;
        q qVar = (q) eVar.v(gVar3);
        if (qVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        l.b("Missing sync point for query tag that we're tracking", z3);
        G g5 = yVar.f10348b;
        g5.getClass();
        return qVar.a(gVar2, new a0(gVar3, g5, 7), (s) null);
    }

    public static void i(e eVar, ArrayList arrayList) {
        q qVar = (q) eVar.f11088a;
        if (qVar == null || !qVar.f()) {
            if (qVar != null) {
                arrayList.addAll(qVar.e());
            }
            for (Map.Entry value : eVar.f11089b) {
                i((e) value.getValue(), arrayList);
            }
            return;
        }
        arrayList.add(qVar.d());
    }

    public static C0969g j(C0969g gVar) {
        if (!gVar.f11539b.h() || gVar.b()) {
            return gVar;
        }
        return C0969g.a(gVar.f11538a);
    }

    public final List c(long j6, boolean z3, boolean z4, C0936a aVar) {
        return (List) this.f10351f.a(new v(this, z4, j6, z3, aVar));
    }

    public final ArrayList d(g gVar, e eVar, s sVar, a0 a0Var) {
        q qVar = (q) eVar.f11088a;
        if (sVar == null && qVar != null) {
            sVar = qVar.c(C0866g.d);
        }
        ArrayList arrayList = new ArrayList();
        eVar.f11089b.z(new s(this, sVar, a0Var, gVar, arrayList));
        if (qVar != null) {
            arrayList.addAll(qVar.a(gVar, a0Var, sVar));
        }
        return arrayList;
    }

    public final ArrayList e(g gVar, e eVar, s sVar, a0 a0Var) {
        s sVar2;
        C0866g gVar2 = (C0866g) gVar.f4931c;
        if (gVar2.isEmpty()) {
            return d(gVar, eVar, sVar, a0Var);
        }
        q qVar = (q) eVar.f11088a;
        if (sVar == null && qVar != null) {
            sVar = qVar.c(C0866g.d);
        }
        ArrayList arrayList = new ArrayList();
        C1048c z3 = gVar2.z();
        g q6 = gVar.q(z3);
        e eVar2 = (e) eVar.f11089b.t(z3);
        if (!(eVar2 == null || q6 == null)) {
            if (sVar != null) {
                sVar2 = sVar.l(z3);
            } else {
                sVar2 = null;
            }
            arrayList.addAll(e(q6, eVar2, sVar2, new a0(((C0866g) a0Var.f9925b).v(z3), (G) a0Var.f9926c, 7)));
        }
        if (qVar != null) {
            arrayList.addAll(qVar.a(gVar, a0Var, sVar));
        }
        return arrayList;
    }

    public final List f(C0866g gVar, s sVar) {
        return (List) this.f10351f.a(new w(this, gVar, sVar));
    }

    public final List g(C0866g gVar, s sVar, s sVar2, long j6, boolean z3, boolean z4) {
        boolean z5;
        if (z3 || !z4) {
            z5 = true;
        } else {
            z5 = false;
        }
        l.b("We shouldn't be persisting non-visible writes.", z5);
        return (List) this.f10351f.a(new t(this, z4, gVar, sVar, j6, sVar2, z3));
    }

    public final s h(C0866g gVar, ArrayList arrayList) {
        e eVar = this.f10347a;
        q qVar = (q) eVar.f11088a;
        C0866g gVar2 = C0866g.d;
        s sVar = null;
        C0866g gVar3 = gVar;
        do {
            C1048c z3 = gVar3.z();
            gVar3 = gVar3.C();
            gVar2 = gVar2.v(z3);
            C0866g B6 = C0866g.B(gVar2, gVar);
            if (z3 != null) {
                eVar = eVar.w(z3);
            } else {
                eVar = e.d;
            }
            q qVar2 = (q) eVar.f11088a;
            if (qVar2 != null) {
                sVar = qVar2.c(B6);
            }
            if (gVar3.isEmpty()) {
                break;
            }
        } while (sVar == null);
        return this.f10348b.a(gVar, sVar, arrayList, true);
    }

    public final List k(C0969g gVar, C0865f fVar, C0588d dVar) {
        return (List) this.f10351f.a(new r(this, gVar, fVar, dVar, 1));
    }

    public final z l(C0969g gVar) {
        return (z) this.d.get(gVar);
    }
}
