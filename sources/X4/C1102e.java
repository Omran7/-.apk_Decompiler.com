package x4;

import Y4.D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import b5.n;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import i3.C0590f;
import i3.C0592h;
import j4.A0;
import j4.C0646w;
import j4.p0;
import java.util.ArrayList;
import java.util.Iterator;
import k.C0724m;
import r3.b;
import v3.m;
import v3.q;

/* renamed from: x4.e  reason: case insensitive filesystem */
public final class C1102e extends C0286s {

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ int f12577o0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f12578d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f12579e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f12580f0;

    /* renamed from: g0  reason: collision with root package name */
    public GridView f12581g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f12582h0;

    /* renamed from: i0  reason: collision with root package name */
    public A0 f12583i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0590f f12584j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0724m f12585k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f12586l0 = new ArrayList();

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f12587m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f12588n0 = new ArrayList();

    public C1102e(Context context) {
        this.f12578d0 = context;
    }

    public static void V(C1102e eVar, C0587c cVar, ArrayList arrayList) {
        eVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        C0586b c3 = cVar.c();
        while (true) {
            Iterator it2 = c3.f8276a;
            int i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            q qVar = (q) it2.next();
            c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
            n nVar = (n) b.c(n.class, m.t(qVar.f12305b).f12296a.getValue());
            if (o.getLocationObject().getCurrentCity() != 0) {
                nVar.setCount(nVar.getCountInBag());
            }
            arrayList2.add(Integer.valueOf(nVar.getId()));
            while (true) {
                if (i2 < arrayList.size()) {
                    if (nVar.getId() == ((D) arrayList.get(i2)).f4293a && nVar.getLevel() == ((D) arrayList.get(i2)).f4298i) {
                        ((D) arrayList.get(i2)).h = nVar.getCount();
                        ((D) arrayList.get(i2)).f4302m = nVar.isLocked();
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        if (arrayList2.size() != arrayList.size()) {
            int i5 = 0;
            while (i5 < arrayList.size()) {
                int i6 = ((D) arrayList.get(i5)).f4293a;
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList2.size()) {
                        arrayList.remove(i5);
                        i5--;
                        break;
                    } else if (i6 == ((Integer) arrayList2.get(i7)).intValue()) {
                        break;
                    } else {
                        i7++;
                    }
                }
                i5++;
            }
        }
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_specific_stock, viewGroup, false);
        this.f12579e0 = inflate;
        this.f12580f0 = (TextView) inflate.findViewById(R.id.fragment_specific_stock_empty_view);
        this.f12581g0 = (GridView) this.f12579e0.findViewById(R.id.fragment_specific_stock_grid_view);
        this.f12582h0 = (RelativeLayout) this.f12579e0.findViewById(R.id.fragment_specific_stock_back_button);
        this.f12584j0 = a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock");
        RelativeLayout relativeLayout = this.f12582h0;
        relativeLayout.setOnClickListener(new C0646w(this, relativeLayout, 17));
        return this.f12579e0;
    }

    public final void H() {
        C0724m mVar;
        this.f5157L = true;
        C0590f fVar = this.f12584j0;
        if (!(fVar == null || (mVar = this.f12585k0) == null)) {
            fVar.u(mVar);
        }
        this.f12585k0 = null;
    }

    public final void I() {
        this.f5157L = true;
        R2.b.w(true);
        this.f12584j0.d(new p0(this, 28));
    }
}
