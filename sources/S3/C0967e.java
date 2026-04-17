package s3;

import java.util.Comparator;
import m0.a0;
import q3.l;
import v3.q;

/* renamed from: s3.e  reason: case insensitive filesystem */
public final class C0967e implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0 f11532a;

    public C0967e(a0 a0Var) {
        this.f11532a = a0Var;
    }

    public final int compare(Object obj, Object obj2) {
        boolean z3;
        C0964b bVar = (C0964b) obj;
        C0964b bVar2 = (C0964b) obj2;
        if (bVar.d == null || bVar2.d == null) {
            z3 = false;
        } else {
            z3 = true;
        }
        l.c(z3);
        return ((v3.l) this.f11532a.f9926c).compare(new q(bVar.d, bVar.f11526b.f12296a), new q(bVar2.d, bVar2.f11526b.f12296a));
    }
}
