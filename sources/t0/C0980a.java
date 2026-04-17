package t0;

import S3.z;
import android.animation.TimeInterpolator;
import android.support.v4.media.session.a;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.emoji2.text.v;
import java.util.ArrayList;
import java.util.Iterator;
import q.C0928e;

/* renamed from: t0.a  reason: case insensitive filesystem */
public final class C0980a extends m {

    /* renamed from: J  reason: collision with root package name */
    public ArrayList f11627J;

    /* renamed from: K  reason: collision with root package name */
    public boolean f11628K;

    /* renamed from: L  reason: collision with root package name */
    public int f11629L;

    /* renamed from: M  reason: collision with root package name */
    public boolean f11630M;

    /* renamed from: N  reason: collision with root package name */
    public int f11631N;

    public final void A() {
        if (this.f11627J.isEmpty()) {
            H();
            n();
            return;
        }
        r rVar = new r();
        rVar.f11692b = this;
        Iterator it2 = this.f11627J.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).a(rVar);
        }
        this.f11629L = this.f11627J.size();
        if (!this.f11628K) {
            for (int i2 = 1; i2 < this.f11627J.size(); i2++) {
                ((m) this.f11627J.get(i2 - 1)).a(new r((m) this.f11627J.get(i2)));
            }
            m mVar = (m) this.f11627J.get(0);
            if (mVar != null) {
                mVar.A();
                return;
            }
            return;
        }
        Iterator it3 = this.f11627J.iterator();
        while (it3.hasNext()) {
            ((m) it3.next()).A();
        }
    }

    public final void B(long j6) {
        ArrayList arrayList;
        this.f11670c = j6;
        if (j6 >= 0 && (arrayList = this.f11627J) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((m) this.f11627J.get(i2)).B(j6);
            }
        }
    }

    public final void C(a aVar) {
        this.f11631N |= 8;
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f11627J.get(i2)).C(aVar);
        }
    }

    public final void D(TimeInterpolator timeInterpolator) {
        this.f11631N |= 1;
        ArrayList arrayList = this.f11627J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((m) this.f11627J.get(i2)).D(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    public final void E(v vVar) {
        super.E(vVar);
        this.f11631N |= 4;
        if (this.f11627J != null) {
            for (int i2 = 0; i2 < this.f11627J.size(); i2++) {
                ((m) this.f11627J.get(i2)).E(vVar);
            }
        }
    }

    public final void F() {
        this.f11631N |= 2;
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f11627J.get(i2)).F();
        }
    }

    public final void G(long j6) {
        this.f11669b = j6;
    }

    public final String I(String str) {
        String I6 = super.I(str);
        for (int i2 = 0; i2 < this.f11627J.size(); i2++) {
            StringBuilder b6 = C0928e.b(I6, "\n");
            b6.append(((m) this.f11627J.get(i2)).I(str + "  "));
            I6 = b6.toString();
        }
        return I6;
    }

    public final void J(m mVar) {
        this.f11627J.add(mVar);
        mVar.f11675r = this;
        long j6 = this.f11670c;
        if (j6 >= 0) {
            mVar.B(j6);
        }
        if ((this.f11631N & 1) != 0) {
            mVar.D(this.d);
        }
        if ((this.f11631N & 2) != 0) {
            mVar.F();
        }
        if ((this.f11631N & 4) != 0) {
            mVar.E(this.f11667E);
        }
        if ((this.f11631N & 8) != 0) {
            mVar.C((a) null);
        }
    }

    public final void c() {
        super.c();
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f11627J.get(i2)).c();
        }
    }

    public final void d(u uVar) {
        if (u(uVar.f11695b)) {
            Iterator it2 = this.f11627J.iterator();
            while (it2.hasNext()) {
                m mVar = (m) it2.next();
                if (mVar.u(uVar.f11695b)) {
                    mVar.d(uVar);
                    uVar.f11696c.add(mVar);
                }
            }
        }
    }

    public final void f(u uVar) {
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f11627J.get(i2)).f(uVar);
        }
    }

    public final void g(u uVar) {
        if (u(uVar.f11695b)) {
            Iterator it2 = this.f11627J.iterator();
            while (it2.hasNext()) {
                m mVar = (m) it2.next();
                if (mVar.u(uVar.f11695b)) {
                    mVar.g(uVar);
                    uVar.f11696c.add(mVar);
                }
            }
        }
    }

    /* renamed from: j */
    public final m clone() {
        C0980a aVar = (C0980a) super.clone();
        aVar.f11627J = new ArrayList();
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            m j6 = ((m) this.f11627J.get(i2)).clone();
            aVar.f11627J.add(j6);
            j6.f11675r = aVar;
        }
        return aVar;
    }

    public final void m(FrameLayout frameLayout, z zVar, z zVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j6 = this.f11669b;
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = (m) this.f11627J.get(i2);
            if (j6 > 0 && (this.f11628K || i2 == 0)) {
                long j7 = mVar.f11669b;
                if (j7 > 0) {
                    mVar.G(j7 + j6);
                } else {
                    mVar.G(j6);
                }
            }
            mVar.m(frameLayout, zVar, zVar2, arrayList, arrayList2);
        }
    }

    public final void x(ViewGroup viewGroup) {
        super.x(viewGroup);
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f11627J.get(i2)).x(viewGroup);
        }
    }

    public final m y(k kVar) {
        super.y(kVar);
        return this;
    }

    public final void z(FrameLayout frameLayout) {
        super.z(frameLayout);
        int size = this.f11627J.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((m) this.f11627J.get(i2)).z(frameLayout);
        }
    }
}
