package t;

import java.util.Iterator;

public class g extends f {

    /* renamed from: m  reason: collision with root package name */
    public int f11590m;

    public g(o oVar) {
        super(oVar);
        if (oVar instanceof k) {
            this.f11584e = 2;
        } else {
            this.f11584e = 3;
        }
    }

    public final void d(int i2) {
        if (!this.f11587j) {
            this.f11587j = true;
            this.g = i2;
            Iterator it2 = this.f11588k.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                dVar.a(dVar);
            }
        }
    }
}
