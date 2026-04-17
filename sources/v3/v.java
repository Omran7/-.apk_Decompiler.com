package v3;

import android.support.v4.media.session.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import l3.p;
import n3.C0866g;
import q3.l;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final C0866g f12309a;

    /* renamed from: b  reason: collision with root package name */
    public final C0866g f12310b;

    /* renamed from: c  reason: collision with root package name */
    public final s f12311c;

    public v(p pVar) {
        C0866g gVar;
        ArrayList arrayList = pVar.f9729a;
        C0866g gVar2 = null;
        if (arrayList != null) {
            gVar = new C0866g(arrayList);
        } else {
            gVar = null;
        }
        this.f12309a = gVar;
        ArrayList arrayList2 = pVar.f9730b;
        this.f12310b = arrayList2 != null ? new C0866g(arrayList2) : gVar2;
        this.f12311c = a.a(pVar.f9731c, k.f12295e);
    }

    public final s a(C0866g gVar, s sVar, s sVar2) {
        int i2;
        int i5;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        C0866g gVar2 = this.f12309a;
        if (gVar2 == null) {
            i2 = 1;
        } else {
            i2 = gVar.compareTo(gVar2);
        }
        C0866g gVar3 = this.f12310b;
        if (gVar3 == null) {
            i5 = -1;
        } else {
            i5 = gVar.compareTo(gVar3);
        }
        if (gVar2 == null || !gVar.x(gVar2)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (gVar3 == null || !gVar.x(gVar3)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (i2 > 0 && i5 < 0 && !z4) {
            return sVar2;
        }
        if (i2 > 0 && z4 && sVar2.h()) {
            return sVar2;
        }
        if (i2 > 0 && i5 == 0) {
            l.c(z4);
            l.c(!sVar2.h());
            if (sVar.h()) {
                return k.f12295e;
            }
            return sVar;
        } else if (z3 || z4) {
            HashSet hashSet = new HashSet();
            Iterator it2 = sVar.iterator();
            while (it2.hasNext()) {
                hashSet.add(((q) it2.next()).f12304a);
            }
            Iterator it3 = sVar2.iterator();
            while (it3.hasNext()) {
                hashSet.add(((q) it3.next()).f12304a);
            }
            ArrayList arrayList = new ArrayList(hashSet.size() + 1);
            arrayList.addAll(hashSet);
            if (!sVar2.c().isEmpty() || !sVar.c().isEmpty()) {
                arrayList.add(C1048c.d);
            }
            Iterator it4 = arrayList.iterator();
            s sVar3 = sVar;
            while (it4.hasNext()) {
                C1048c cVar = (C1048c) it4.next();
                s l6 = sVar.l(cVar);
                s a6 = a(gVar.v(cVar), sVar.l(cVar), sVar2.l(cVar));
                if (a6 != l6) {
                    sVar3 = sVar3.r(cVar, a6);
                }
            }
            return sVar3;
        } else {
            if (i5 <= 0 && i2 > 0) {
                z5 = false;
            }
            l.c(z5);
            return sVar;
        }
    }

    public final String toString() {
        return "RangeMerge{optExclusiveStart=" + this.f12309a + ", optInclusiveEnd=" + this.f12310b + ", snap=" + this.f12311c + '}';
    }
}
