package N0;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import n3.C0866g;
import q3.d;
import z0.l;

public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1893a;

    public c(int i2) {
        switch (i2) {
            case 1:
                this.f1893a = new ArrayList();
                return;
            case 2:
                this.f1893a = new ArrayList();
                return;
            default:
                this.f1893a = new ArrayList();
                return;
        }
    }

    public synchronized l a(Class cls) {
        int size = this.f1893a.size();
        for (int i2 = 0; i2 < size; i2++) {
            P0.d dVar = (P0.d) this.f1893a.get(i2);
            if (dVar.f2134a.isAssignableFrom(cls)) {
                return dVar.f2135b;
            }
        }
        return null;
    }

    public synchronized ArrayList b(Class cls, Class cls2) {
        boolean z3;
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it2 = this.f1893a.iterator();
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            if (!bVar.f1890a.isAssignableFrom(cls) || !cls2.isAssignableFrom(bVar.f1891b)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3 && !arrayList.contains(bVar.f1891b)) {
                arrayList.add(bVar.f1891b);
            }
        }
        return arrayList;
    }

    public Object z(C0866g gVar, Object obj, Object obj2) {
        Void voidR = (Void) obj2;
        this.f1893a.add(new AbstractMap.SimpleImmutableEntry(gVar, obj));
        return null;
    }

    public c(ArrayList arrayList) {
        this.f1893a = arrayList;
    }
}
