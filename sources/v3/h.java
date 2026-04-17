package v3;

import com.mtma.criminal.city.utils.C0442l;
import java.util.ArrayList;
import java.util.Stack;
import k3.k;
import n3.C0866g;
import q3.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public StringBuilder f12288a = null;

    /* renamed from: b  reason: collision with root package name */
    public final Stack f12289b = new Stack();

    /* renamed from: c  reason: collision with root package name */
    public int f12290c = -1;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12291e = true;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f12292f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final C0442l h;

    public h(C0442l lVar) {
        this.h = lVar;
    }

    public final C0866g a(int i2) {
        C1048c[] cVarArr = new C1048c[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            cVarArr[i5] = (C1048c) this.f12289b.get(i5);
        }
        return new C0866g(cVarArr);
    }

    public final void b() {
        boolean z3;
        if (this.f12288a != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        l.b("Can't end range without starting a range!", z3);
        for (int i2 = 0; i2 < this.d; i2++) {
            this.f12288a.append(")");
        }
        this.f12288a.append(")");
        C0866g a6 = a(this.f12290c);
        this.g.add(l.e(this.f12288a.toString()));
        this.f12292f.add(a6);
        this.f12288a = null;
    }

    public final void c() {
        if (this.f12288a == null) {
            StringBuilder sb = new StringBuilder();
            this.f12288a = sb;
            sb.append("(");
            k kVar = new k(a(this.d));
            while (kVar.hasNext()) {
                this.f12288a.append(l.f(((C1048c) kVar.next()).f12280a));
                this.f12288a.append(":(");
            }
            this.f12291e = false;
        }
    }
}
