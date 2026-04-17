package j4;

import B0.l;
import H4.e;
import R2.b;
import Y4.g;
import Y4.h;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.U;
import d5.C0473f;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.q;
import java.util.ArrayList;
import java.util.Iterator;
import v3.m;

public final class F implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8869a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f8870b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ G f8871c;

    public /* synthetic */ F(G g, h hVar, int i2) {
        this.f8869a = i2;
        this.f8871c = g;
        this.f8870b = hVar;
    }

    public void B(C0588d dVar) {
        switch (this.f8869a) {
            case 0:
                return;
            default:
                c.s0(this.f8871c.f8875b, (String) null, (String) null);
                b.w(false);
                return;
        }
    }

    public void b(boolean z3, C0473f fVar) {
        h hVar = this.f8870b;
        if (z3) {
            U.g(o.getAccountObject().getId(), "cash", hVar.h / 2, new K(this, 22));
            return;
        }
        b.w(false);
        G g = this.f8871c;
        if (fVar == null) {
            a.n(MyApplication.f7090a, R.string.estate_already_sold, g.f8875b, (String) null);
            g.remove(hVar);
            g.notifyDataSetChanged();
        } else if (fVar.isUsed()) {
            a.n(MyApplication.f7090a, R.string.can_not_sell_house_lived_in, g.f8875b, (String) null);
            ((h) g.getItem(g.getPosition(hVar))).f4360j = true;
            g.notifyDataSetChanged();
        } else if (fVar.getFirebaseKeyNode().equals("--defaultEstate")) {
            a.n(MyApplication.f7090a, R.string.can_not_sell_default_estate, g.f8875b, (String) null);
        } else {
            a.n(MyApplication.f7090a, R.string.unknown_error_try_again, g.f8875b, (String) null);
        }
    }

    public void u(C0587c cVar) {
        switch (this.f8869a) {
            case 0:
                int d = (int) cVar.d();
                if (d < 50) {
                    U.g(o.getAccountObject().getId(), "cash", -this.f8870b.h, new l((Object) this, d, 21));
                    return;
                }
                b.w(false);
                a.n(MyApplication.f7090a, R.string.can_not_have_more_than_fifty_estate, this.f8871c.f8875b, (String) null);
                return;
            default:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                h hVar = this.f8870b;
                ArrayList arrayList3 = hVar.f4364n;
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    if (!((g) arrayList3.get(i2)).g) {
                        arrayList.add(Boolean.valueOf(((g) arrayList3.get(i2)).f4353f));
                    } else if (d.M0(((g) arrayList3.get(i2)).h, c.f5744o)) {
                        arrayList2.add(Long.valueOf(((g) arrayList3.get(i2)).h));
                    } else {
                        arrayList2.add(-1L);
                    }
                }
                G g = this.f8871c;
                ((C0590f) g.f8878f).E("id").I(Integer.valueOf(hVar.f4356c));
                ((C0590f) g.f8878f).E("estateOwnerId").I(hVar.f4355b);
                ((C0590f) g.f8878f).E("firebaseKeyNode").I(hVar.f4354a);
                ((C0590f) g.f8878f).E("used").I(Boolean.TRUE);
                ((C0590f) g.f8878f).E("spouseUsed").I(Boolean.valueOf(hVar.f4361k));
                ((C0590f) g.f8878f).E("fixedModificationList").I(arrayList);
                ((C0590f) g.f8878f).E("servantContractsStartTimeInMilliList").I(arrayList2);
                ((C0590f) g.f8878f).E("lastTimeDailyTaxPaidInMilli").I(Long.valueOf(hVar.f4363m));
                o.setEstateObject(new C0473f(hVar.f4356c, hVar.f4354a, hVar.f4355b, true, hVar.f4361k, arrayList, arrayList2, hVar.f4363m));
                C0586b c3 = cVar.c();
                while (true) {
                    Iterator it2 = c3.f8276a;
                    if (it2.hasNext()) {
                        v3.q qVar = (v3.q) it2.next();
                        C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                        m.t(qVar.f12305b);
                        E6.E("used").I(Boolean.FALSE);
                    } else {
                        ((C0590f) g.f8878f).E("allOwnEstates").E(hVar.f4354a).E("used").I(Boolean.TRUE).addOnSuccessListener(new e(this, 23));
                        return;
                    }
                }
        }
    }

    private final void a(C0588d dVar) {
    }
}
