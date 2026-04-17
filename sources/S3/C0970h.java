package s3;

import B0.A;
import S3.z;
import com.google.android.gms.common.api.internal.C0370y;
import i3.C0588d;
import j4.C;
import j4.p0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m0.a0;
import n3.C0865f;
import q.C0928e;
import t3.C1008b;
import v3.C1048c;
import v3.k;
import v3.l;
import v3.m;
import v3.q;
import v3.s;

/* renamed from: s3.h  reason: case insensitive filesystem */
public final class C0970h {

    /* renamed from: a  reason: collision with root package name */
    public final C0969g f11540a;

    /* renamed from: b  reason: collision with root package name */
    public final C0971i f11541b;

    /* renamed from: c  reason: collision with root package name */
    public a0 f11542c;
    public final ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final a0 f11543e;

    public C0970h(C0969g gVar, a0 a0Var) {
        C1008b bVar;
        this.f11540a = gVar;
        C0968f fVar = gVar.f11539b;
        p0 p0Var = new p0(fVar.g, 17);
        if (fVar.h()) {
            bVar = new p0(fVar.g, 17);
        } else if (fVar.d()) {
            bVar = new C0370y(fVar);
        } else {
            bVar = new z(fVar);
        }
        this.f11541b = new C0971i(bVar);
        C c3 = (C) a0Var.f9926c;
        m mVar = new m(k.f12295e, fVar.g);
        m mVar2 = (m) c3.f8851c;
        p0Var.A(mVar, mVar2, (A) null);
        C c6 = (C) a0Var.f9925b;
        m A6 = bVar.A(mVar, (m) c6.f8851c, (A) null);
        this.f11542c = new a0(new C(A6, c6.f8849a, bVar.m()), new C(mVar2, c3.f8849a, false), 14);
        this.d = new ArrayList();
        this.f11543e = new a0(gVar);
    }

    public final ArrayList a(ArrayList arrayList, m mVar, C0865f fVar) {
        List list;
        if (fVar == null) {
            list = this.d;
        } else {
            list = Arrays.asList(new C0865f[]{fVar});
        }
        a0 a0Var = this.f11543e;
        a0Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0964b bVar = (C0964b) it2.next();
            if (C0928e.a(bVar.f11525a, 4)) {
                s sVar = bVar.f11527c.f12296a;
                s sVar2 = bVar.f11526b.f12296a;
                C1048c cVar = C1048c.f12278b;
                if (((l) a0Var.f9926c).compare(new q(cVar, sVar), new q(cVar, sVar2)) != 0) {
                    arrayList3.add(new C0964b(3, bVar.f11526b, bVar.d, (C1048c) null, (m) null));
                }
            }
        }
        a0 a0Var2 = a0Var;
        ArrayList arrayList4 = arrayList2;
        ArrayList arrayList5 = arrayList;
        List list2 = list;
        m mVar2 = mVar;
        a0Var2.k(arrayList4, 1, arrayList5, list2, mVar2);
        a0Var2.k(arrayList4, 2, arrayList5, list2, mVar2);
        a0Var2.k(arrayList4, 3, arrayList3, list2, mVar2);
        ArrayList arrayList6 = arrayList;
        a0Var2.k(arrayList4, 4, arrayList6, list2, mVar2);
        a0Var2.k(arrayList4, 5, arrayList6, list2, mVar2);
        return arrayList2;
    }

    public final List b(C0865f fVar, C0588d dVar) {
        ArrayList arrayList;
        boolean z3;
        ArrayList arrayList2 = this.d;
        int i2 = 0;
        if (dVar != null) {
            ArrayList arrayList3 = new ArrayList();
            if (fVar == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            q3.l.b("A cancel should cancel all event registrations", z3);
            C0969g gVar = this.f11540a;
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new C0963a((C0865f) it2.next(), dVar, gVar.f11538a));
            }
            arrayList = arrayList3;
        } else {
            arrayList = Collections.emptyList();
        }
        if (fVar != null) {
            int i5 = -1;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    i2 = i5;
                    break;
                }
                C0865f fVar2 = (C0865f) arrayList2.get(i2);
                if (fVar2.f(fVar)) {
                    if (fVar2.f10273a.get()) {
                        break;
                    }
                    i5 = i2;
                }
                i2++;
            }
            if (i2 != -1) {
                arrayList2.remove(i2);
                ((C0865f) arrayList2.get(i2)).h();
            }
        } else {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ((C0865f) it3.next()).h();
            }
            arrayList2.clear();
        }
        return arrayList;
    }
}
