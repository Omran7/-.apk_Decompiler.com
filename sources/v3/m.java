package v3;

import com.google.android.gms.common.internal.I;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import k3.c;
import k3.e;

public final class m implements Iterable {
    public static final e d = new e(Collections.emptyList(), (Comparator) null);

    /* renamed from: a  reason: collision with root package name */
    public final s f12296a;

    /* renamed from: b  reason: collision with root package name */
    public e f12297b;

    /* renamed from: c  reason: collision with root package name */
    public final l f12298c;

    public m(s sVar, l lVar) {
        this.f12298c = lVar;
        this.f12296a = sVar;
        this.f12297b = null;
    }

    public static m t(s sVar) {
        return new m(sVar, u.f12308a);
    }

    public final Iterator iterator() {
        k();
        if (I.j(this.f12297b, d)) {
            return this.f12296a.iterator();
        }
        return this.f12297b.iterator();
    }

    public final void k() {
        if (this.f12297b == null) {
            n nVar = n.f12299a;
            l lVar = this.f12298c;
            boolean equals = lVar.equals(nVar);
            e eVar = d;
            if (equals) {
                this.f12297b = eVar;
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z3 = false;
            for (q qVar : this.f12296a) {
                if (z3 || lVar.b(qVar.f12305b)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                arrayList.add(new q(qVar.f12304a, qVar.f12305b));
            }
            if (z3) {
                this.f12297b = new e(arrayList, lVar);
            } else {
                this.f12297b = eVar;
            }
        }
    }

    public final m v(C1048c cVar, s sVar) {
        s sVar2 = this.f12296a;
        s r6 = sVar2.r(cVar, sVar);
        e eVar = this.f12297b;
        e eVar2 = d;
        boolean j6 = I.j(eVar, eVar2);
        l lVar = this.f12298c;
        if (j6 && !lVar.b(sVar)) {
            return new m(r6, lVar, eVar2);
        }
        e eVar3 = this.f12297b;
        if (eVar3 == null || I.j(eVar3, eVar2)) {
            return new m(r6, lVar, (e) null);
        }
        s l6 = sVar2.l(cVar);
        e eVar4 = this.f12297b;
        q qVar = new q(cVar, l6);
        c cVar2 = eVar4.f9468a;
        c B6 = cVar2.B(qVar);
        if (B6 != cVar2) {
            eVar4 = new e(B6);
        }
        if (!sVar.isEmpty()) {
            eVar4 = new e(eVar4.f9468a.A((Iterable) null, new q(cVar, sVar)));
        }
        return new m(r6, lVar, eVar4);
    }

    public m(s sVar, l lVar, e eVar) {
        this.f12298c = lVar;
        this.f12296a = sVar;
        this.f12297b = eVar;
    }
}
