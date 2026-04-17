package E5;

import I1.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;
import n5.C0883o;

public abstract class f extends g {
    public static List I0(d dVar) {
        j.e(dVar, "<this>");
        Iterator it2 = dVar.iterator();
        if (!it2.hasNext()) {
            return C0883o.f10398a;
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return b.t0(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }
}
