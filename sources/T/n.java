package t;

import androidx.fragment.app.D;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import q.C0926c;
import q.C0928e;
import s.d;
import s.e;
import s.j;

public final class n {

    /* renamed from: f  reason: collision with root package name */
    public static int f11597f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f11598a;

    /* renamed from: b  reason: collision with root package name */
    public int f11599b;

    /* renamed from: c  reason: collision with root package name */
    public int f11600c;
    public ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public int f11601e;

    public final void a(ArrayList arrayList) {
        int size = this.f11598a.size();
        if (this.f11601e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                n nVar = (n) arrayList.get(i2);
                if (this.f11601e == nVar.f11599b) {
                    c(this.f11600c, nVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C0926c cVar, int i2) {
        int n2;
        int n6;
        ArrayList arrayList = this.f11598a;
        if (arrayList.size() == 0) {
            return 0;
        }
        e eVar = (e) ((d) arrayList.get(0)).f11307T;
        cVar.t();
        eVar.b(cVar, false);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((d) arrayList.get(i5)).b(cVar, false);
        }
        if (i2 == 0 && eVar.f11372z0 > 0) {
            j.a(eVar, cVar, arrayList, 0);
        }
        if (i2 == 1 && eVar.f11353A0 > 0) {
            j.a(eVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e6) {
            System.err.println(e6.toString() + "\n" + Arrays.toString(e6.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.d = new ArrayList();
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            d dVar = (d) arrayList.get(i6);
            D d6 = new D(25);
            new WeakReference(dVar);
            C0926c.n(dVar.f11296I);
            C0926c.n(dVar.f11297J);
            C0926c.n(dVar.f11298K);
            C0926c.n(dVar.f11299L);
            C0926c.n(dVar.f11300M);
            this.d.add(d6);
        }
        if (i2 == 0) {
            n2 = C0926c.n(eVar.f11296I);
            n6 = C0926c.n(eVar.f11298K);
            cVar.t();
        } else {
            n2 = C0926c.n(eVar.f11297J);
            n6 = C0926c.n(eVar.f11299L);
            cVar.t();
        }
        return n6 - n2;
    }

    public final void c(int i2, n nVar) {
        Iterator it2 = this.f11598a.iterator();
        while (it2.hasNext()) {
            d dVar = (d) it2.next();
            ArrayList arrayList = nVar.f11598a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i5 = nVar.f11599b;
            if (i2 == 0) {
                dVar.f11338n0 = i5;
            } else {
                dVar.f11340o0 = i5;
            }
        }
        this.f11601e = nVar.f11599b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i2 = this.f11600c;
        if (i2 == 0) {
            str = "Horizontal";
        } else if (i2 == 1) {
            str = "Vertical";
        } else if (i2 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.f11599b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it2 = this.f11598a.iterator();
        while (it2.hasNext()) {
            StringBuilder b6 = C0928e.b(sb2, " ");
            b6.append(((d) it2.next()).f11326h0);
            sb2 = b6.toString();
        }
        return o3.d.f(sb2, " >");
    }
}
