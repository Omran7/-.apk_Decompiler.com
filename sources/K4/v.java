package K4;

import U3.c;
import Y4.D;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import j4.C0641q;
import j4.M0;
import java.util.ArrayList;
import java.util.Iterator;
import r3.b;
import v3.m;
import v3.q;
import x1.i;

public final class v extends C0286s {
    public static final /* synthetic */ int O0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f1613A0 = new ArrayList();

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f1614B0 = new ArrayList();

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f1615C0 = new ArrayList();

    /* renamed from: D0  reason: collision with root package name */
    public final ArrayList f1616D0 = new ArrayList();

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f1617E0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f1618F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f1619G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f1620H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f1621I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f1622J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f1623K0 = new ArrayList();
    public final ArrayList L0 = new ArrayList();

    /* renamed from: M0  reason: collision with root package name */
    public final ArrayList f1624M0 = new ArrayList();

    /* renamed from: N0  reason: collision with root package name */
    public boolean f1625N0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1626d0;

    /* renamed from: e0  reason: collision with root package name */
    public final String f1627e0;

    /* renamed from: f0  reason: collision with root package name */
    public final String f1628f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f1629g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f1630h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f1631i0;

    /* renamed from: j0  reason: collision with root package name */
    public GridView f1632j0;

    /* renamed from: k0  reason: collision with root package name */
    public LinearLayout f1633k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f1634l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f1635m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f1636n0;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f1637o0;

    /* renamed from: p0  reason: collision with root package name */
    public M0 f1638p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0641q f1639q0;

    /* renamed from: r0  reason: collision with root package name */
    public C0590f f1640r0;
    public i s0;

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f1641t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f1642u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f1643v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f1644w0 = new ArrayList();

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f1645x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f1646y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f1647z0 = new ArrayList();

    public v(Context context, String str, String str2) {
        this.f1626d0 = context;
        this.f1627e0 = str;
        this.f1628f0 = str2;
    }

    public static void V(v vVar, C0587c cVar, ArrayList arrayList) {
        vVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
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
            if (nVar.getType() != 7 || (nVar.getId() >= 2026 && nVar.getId() <= 2029)) {
                if (o.getLocationObject().getCurrentCity() != 0) {
                    nVar.setCount(nVar.getCountInBag());
                } else if (nVar.isUsedInArming()) {
                    nVar.setCount(nVar.getCount() - 1);
                }
                if (nVar.getCount() > 0) {
                    arrayList2.add(Integer.valueOf(nVar.getId()));
                    arrayList3.add(Integer.valueOf(nVar.getLevel()));
                    while (true) {
                        if (i2 < arrayList.size()) {
                            if (nVar.getId() == ((D) arrayList.get(i2)).f4293a && nVar.getLevel() == ((D) arrayList.get(i2)).f4298i) {
                                ((D) arrayList.get(i2)).h = nVar.getCount();
                                ((D) arrayList.get(i2)).f4302m = nVar.isLocked();
                                ((D) arrayList.get(i2)).f4304o = nVar.isUsedInArming();
                                break;
                            }
                            i2++;
                        } else {
                            arrayList.add(D.r(nVar));
                            arrayList.sort(new H.b(1));
                            break;
                        }
                    }
                }
            }
        }
        if (arrayList2.size() != arrayList.size()) {
            int i5 = 0;
            while (i5 < arrayList.size()) {
                int i6 = ((D) arrayList.get(i5)).f4293a;
                int i7 = ((D) arrayList.get(i5)).f4298i;
                int i8 = 0;
                while (true) {
                    if (i8 < arrayList2.size()) {
                        if (i6 == ((Integer) arrayList2.get(i8)).intValue() && i7 == ((Integer) arrayList3.get(i8)).intValue()) {
                            break;
                        }
                        i8++;
                    } else {
                        arrayList.remove(i5);
                        i5--;
                        break;
                    }
                }
                i5++;
            }
        }
        vVar.W();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stock, viewGroup, false);
        this.f1629g0 = inflate;
        this.f1630h0 = (TextView) inflate.findViewById(R.id.fragment_stock_empty_view);
        this.f1631i0 = (GridView) this.f1629g0.findViewById(R.id.fragment_stock_grid_view);
        this.f1634l0 = (RelativeLayout) this.f1629g0.findViewById(R.id.fragment_stock_lock_button);
        this.f1635m0 = (RelativeLayout) this.f1629g0.findViewById(R.id.fragment_stock_filter_button);
        this.f1633k0 = (LinearLayout) this.f1629g0.findViewById(R.id.fragment_stock_filter_layout);
        this.f1632j0 = (GridView) this.f1629g0.findViewById(R.id.fragment_stock_filter_grid_view);
        this.f1636n0 = (RelativeLayout) this.f1629g0.findViewById(R.id.fragment_stock_back_button);
        ((TextView) this.f1629g0.findViewById(R.id.fragment_stock_space_title)).setVisibility(4);
        TextView textView = (TextView) this.f1629g0.findViewById(R.id.fragment_stock_lock_button_text);
        textView.setText(R.string.button_send_cash);
        textView.setTextSize(14.0f);
        ((ImageView) this.f1629g0.findViewById(R.id.fragment_stock_lock_button_image)).setImageResource(R.drawable.button_cash);
        if (o.getLocationObject().getCurrentCity() == 0) {
            this.f1630h0.setText(R.string.empty_stock);
        } else {
            this.f1630h0.setText(R.string.empty_bag);
        }
        this.f1640r0 = a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock");
        R2.b.w(true);
        this.f1640r0.d(new c((Object) this, 17));
        this.f1637o0 = android.support.v4.media.session.a.K();
        C0641q qVar = new C0641q(this.f1626d0, this.f1637o0);
        this.f1639q0 = qVar;
        this.f1632j0.setAdapter(qVar);
        this.f1639q0.registerDataSetObserver(new r(this, 0));
        RelativeLayout relativeLayout = this.f1635m0;
        relativeLayout.setOnClickListener(new q(this, relativeLayout, 2));
        RelativeLayout relativeLayout2 = this.f1634l0;
        relativeLayout2.setOnClickListener(new q(this, relativeLayout2, 0));
        RelativeLayout relativeLayout3 = this.f1636n0;
        relativeLayout3.setOnClickListener(new q(this, relativeLayout3, 1));
        return this.f1629g0;
    }

    public final void W() {
        ArrayList arrayList = this.f1641t0;
        arrayList.clear();
        arrayList.addAll(this.f1642u0);
        arrayList.addAll(this.f1643v0);
        arrayList.addAll(this.f1644w0);
        arrayList.addAll(this.f1622J0);
        arrayList.addAll(this.f1623K0);
        arrayList.addAll(this.f1645x0);
        arrayList.addAll(this.f1646y0);
        arrayList.addAll(this.f1647z0);
        arrayList.addAll(this.f1613A0);
        arrayList.addAll(this.f1614B0);
        arrayList.addAll(this.f1615C0);
        arrayList.addAll(this.f1616D0);
        arrayList.addAll(this.f1617E0);
        arrayList.addAll(this.f1618F0);
        arrayList.addAll(this.f1619G0);
        arrayList.addAll(this.f1620H0);
        arrayList.addAll(this.f1621I0);
        arrayList.addAll(this.L0);
        arrayList.addAll(this.f1624M0);
        this.f1638p0.notifyDataSetChanged();
    }
}
