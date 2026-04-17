package F0;

import B0.C0009h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class y {

    /* renamed from: e  reason: collision with root package name */
    public static final C f719e = new C(10);

    /* renamed from: f  reason: collision with root package name */
    public static final D f720f = new D(2);

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f721a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final C f722b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f723c = new HashSet();
    public final C0009h d;

    public y(C0009h hVar) {
        C c3 = f719e;
        this.d = hVar;
        this.f722b = c3;
    }

    public final synchronized s a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f721a.iterator();
            boolean z3 = false;
            while (it2.hasNext()) {
                x xVar = (x) it2.next();
                if (this.f723c.contains(xVar)) {
                    z3 = true;
                } else if (xVar.f716a.isAssignableFrom(cls) && xVar.f717b.isAssignableFrom(cls2)) {
                    this.f723c.add(xVar);
                    arrayList.add(xVar.f718c.e(this));
                    this.f723c.remove(xVar);
                }
            }
            if (arrayList.size() > 1) {
                C c3 = this.f722b;
                C0009h hVar = this.d;
                c3.getClass();
                return new C0012b(arrayList, hVar, 2);
            } else if (arrayList.size() == 1) {
                return (s) arrayList.get(0);
            } else if (z3) {
                return f720f;
            } else {
                throw new RuntimeException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
            }
        } catch (Throwable th) {
            this.f723c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it2 = this.f721a.iterator();
            while (it2.hasNext()) {
                x xVar = (x) it2.next();
                if (!this.f723c.contains(xVar)) {
                    if (xVar.f716a.isAssignableFrom(cls)) {
                        this.f723c.add(xVar);
                        arrayList.add(xVar.f718c.e(this));
                        this.f723c.remove(xVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f723c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it2 = this.f721a.iterator();
        while (it2.hasNext()) {
            x xVar = (x) it2.next();
            if (!arrayList.contains(xVar.f717b) && xVar.f716a.isAssignableFrom(cls)) {
                arrayList.add(xVar.f717b);
            }
        }
        return arrayList;
    }
}
