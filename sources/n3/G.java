package n3;

import T1.C0224y0;
import androidx.fragment.app.D;
import c1.i;
import com.bumptech.glide.manager.o;
import i3.C0588d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import q3.h;
import s3.C0969g;
import s3.C0970h;
import v3.k;
import v3.s;

public final class G {
    public static final D d = new D(23);

    /* renamed from: a  reason: collision with root package name */
    public Object f10250a;

    /* renamed from: b  reason: collision with root package name */
    public Object f10251b;

    /* renamed from: c  reason: collision with root package name */
    public Object f10252c;

    public G(y yVar, C0970h hVar) {
        this.f10252c = yVar;
        this.f10250a = hVar;
        this.f10251b = yVar.l(hVar.f11540a);
    }

    public static C0861b b(ArrayList arrayList, h hVar, C0866g gVar) {
        C0861b bVar = C0861b.f10257b;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0857B b6 = (C0857B) it2.next();
            if (hVar.f(b6)) {
                C0866g gVar2 = b6.f10240b;
                if (b6.c()) {
                    if (gVar.x(gVar2)) {
                        bVar = bVar.k(C0866g.B(gVar, gVar2), b6.b());
                    } else if (gVar2.x(gVar)) {
                        bVar = bVar.k(C0866g.d, b6.b().f(C0866g.B(gVar2, gVar)));
                    }
                } else if (gVar.x(gVar2)) {
                    bVar = bVar.t(C0866g.B(gVar, gVar2), b6.a());
                } else if (gVar2.x(gVar)) {
                    C0866g B6 = C0866g.B(gVar2, gVar);
                    if (B6.isEmpty()) {
                        bVar = bVar.t(C0866g.d, b6.a());
                    } else {
                        s z3 = b6.a().z(B6);
                        if (z3 != null) {
                            bVar = bVar.k(C0866g.d, z3);
                        }
                    }
                }
            }
        }
        return bVar;
    }

    public s a(C0866g gVar, s sVar, List list, boolean z3) {
        if (!list.isEmpty() || z3) {
            C0861b x6 = ((C0861b) this.f10250a).x(gVar);
            if (!z3 && x6.f10258a.isEmpty()) {
                return sVar;
            }
            if (!z3 && sVar == null && x6.z(C0866g.d) == null) {
                return null;
            }
            C0861b b6 = b((ArrayList) this.f10251b, new o(z3, list, gVar), gVar);
            if (sVar == null) {
                sVar = k.f12295e;
            }
            return b6.v(sVar);
        }
        s z4 = ((C0861b) this.f10250a).z(gVar);
        if (z4 != null) {
            return z4;
        }
        C0861b x7 = ((C0861b) this.f10250a).x(gVar);
        if (x7.f10258a.isEmpty()) {
            return sVar;
        }
        if (sVar == null && x7.z(C0866g.d) == null) {
            return null;
        }
        if (sVar == null) {
            sVar = k.f12295e;
        }
        return x7.v(sVar);
    }

    public List c(C0588d dVar) {
        C0970h hVar = (C0970h) this.f10250a;
        y yVar = (y) this.f10252c;
        if (dVar == null) {
            C0969g gVar = hVar.f11540a;
            z zVar = (z) this.f10251b;
            if (zVar != null) {
                yVar.getClass();
                return (List) yVar.f10351f.a(new C0224y0(yVar, zVar, 5));
            }
            yVar.getClass();
            return (List) yVar.f10351f.a(new C0224y0(yVar, gVar.f11538a, 4));
        }
        i iVar = yVar.g;
        iVar.Q("Listen at " + hVar.f11540a.f11538a + " failed: " + dVar.toString());
        return yVar.k(hVar.f11540a, (C0865f) null, dVar);
    }
}
