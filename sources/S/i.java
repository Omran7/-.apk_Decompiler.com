package s;

import java.util.ArrayList;
import t.h;
import t.n;

public abstract class i extends d {

    /* renamed from: q0  reason: collision with root package name */
    public d[] f11425q0 = new d[4];

    /* renamed from: r0  reason: collision with root package name */
    public int f11426r0 = 0;

    public final void R(int i2, ArrayList arrayList, n nVar) {
        for (int i5 = 0; i5 < this.f11426r0; i5++) {
            d dVar = this.f11425q0[i5];
            ArrayList arrayList2 = nVar.f11598a;
            if (!arrayList2.contains(dVar)) {
                arrayList2.add(dVar);
            }
        }
        for (int i6 = 0; i6 < this.f11426r0; i6++) {
            h.b(this.f11425q0[i6], i2, arrayList, nVar);
        }
    }

    public void S() {
    }
}
