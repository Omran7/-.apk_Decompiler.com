package S4;

import H4.i;
import K1.e;
import R2.b;
import Y4.D;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import b5.n;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import i3.C0590f;
import i3.C0592h;
import j4.A0;
import j4.C0641q;
import java.util.ArrayList;
import java.util.Iterator;
import v3.m;
import v3.q;

public final class d extends C0286s {

    /* renamed from: P0  reason: collision with root package name */
    public static final /* synthetic */ int f2719P0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f2720A0 = new ArrayList();

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f2721B0 = new ArrayList();

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f2722C0 = new ArrayList();

    /* renamed from: D0  reason: collision with root package name */
    public final ArrayList f2723D0 = new ArrayList();

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f2724E0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f2725F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f2726G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f2727H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f2728I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f2729J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f2730K0 = new ArrayList();
    public final ArrayList L0 = new ArrayList();

    /* renamed from: M0  reason: collision with root package name */
    public int f2731M0;

    /* renamed from: N0  reason: collision with root package name */
    public int f2732N0;
    public int O0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2733d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2734e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2735f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2736g0;

    /* renamed from: h0  reason: collision with root package name */
    public GridView f2737h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f2738i0;

    /* renamed from: j0  reason: collision with root package name */
    public LinearLayout f2739j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f2740k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f2741l0;

    /* renamed from: m0  reason: collision with root package name */
    public ArrayList f2742m0;

    /* renamed from: n0  reason: collision with root package name */
    public A0 f2743n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0641q f2744o0;

    /* renamed from: p0  reason: collision with root package name */
    public C0590f f2745p0;

    /* renamed from: q0  reason: collision with root package name */
    public a f2746q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f2747r0 = new ArrayList();
    public final ArrayList s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f2748t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f2749u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f2750v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f2751w0 = new ArrayList();

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f2752x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f2753y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f2754z0 = new ArrayList();

    public d(Context context) {
        this.f2733d0 = context;
    }

    public static void V(d dVar) {
        dVar.getClass();
        A0 a02 = new A0(dVar.f2733d0, dVar.f2747r0, dVar.f2731M0);
        dVar.f2743n0 = a02;
        dVar.f2737h0.setAdapter(a02);
        dVar.a0();
        dVar.f2743n0.notifyDataSetChanged();
        dVar.f2737h0.setEmptyView(dVar.f2736g0);
        dVar.Y();
        dVar.f2743n0.registerDataSetObserver(new b(dVar, 0));
        if (o.getLocationObject().getCurrentCity() != 0 && dVar.f2746q0 == null) {
            a aVar = new a(dVar);
            dVar.f2746q0 = aVar;
            dVar.f2745p0.b(aVar);
        }
        b.w(false);
    }

    public static void W(d dVar, C0587c cVar, ArrayList arrayList) {
        dVar.getClass();
        if (arrayList.size() == 0) {
            C0586b c3 = cVar.c();
            C0590f fVar = cVar.f8279b;
            while (true) {
                Iterator it2 = c3.f8276a;
                if (it2.hasNext()) {
                    q qVar = (q) it2.next();
                    c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                    try {
                        n nVar = (n) r3.b.c(n.class, m.t(qVar.f12305b).f12296a.getValue());
                        if (nVar.getCountInBag() > 0) {
                            nVar.setCount(nVar.getCountInBag());
                            if (fVar.F().equals(e.y(0))) {
                                dVar.f2748t0.add(D.j(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(1))) {
                                dVar.f2749u0.add(D.b(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(10))) {
                                dVar.f2750v0.add(D.k(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(11))) {
                                dVar.f2751w0.add(D.d(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(3))) {
                                dVar.f2752x0.add(D.l(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else {
                                boolean equals = fVar.F().equals(e.y(9));
                                ArrayList arrayList2 = dVar.f2754z0;
                                if (equals) {
                                    arrayList2.add(D.q(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (fVar.F().equals(e.y(2))) {
                                    arrayList2.add(D.i(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else {
                                    boolean equals2 = fVar.F().equals(e.y(8));
                                    ArrayList arrayList3 = dVar.f2721B0;
                                    if (equals2) {
                                        arrayList3.add(D.w(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (fVar.F().equals(e.y(4))) {
                                        arrayList3.add(D.g(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else {
                                        boolean equals3 = fVar.F().equals(e.y(5));
                                        ArrayList arrayList4 = dVar.f2722C0;
                                        if (equals3) {
                                            arrayList4.add(D.h(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(18))) {
                                            dVar.f2723D0.add(D.n(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(12))) {
                                            arrayList4.add(D.t(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(7))) {
                                            dVar.f2726G0.add(D.o(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(14))) {
                                            dVar.s0.add(D.v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(13))) {
                                            dVar.f2725F0.add(D.u(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(15))) {
                                            dVar.f2727H0.add(D.p(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(16))) {
                                            dVar.f2728I0.add(D.c(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(17))) {
                                            dVar.f2729J0.add(D.m(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(6))) {
                                            dVar.f2730K0.add(D.e(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e6) {
                        a.q("Exception from try-catch block inside ", "d", " in addNewItemsType method.", e6, "d");
                    }
                } else {
                    dVar.a0();
                    dVar.f2743n0.notifyDataSetChanged();
                    return;
                }
            }
        }
    }

    public static void X(d dVar, C0587c cVar, ArrayList arrayList) {
        dVar.getClass();
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
            n nVar = (n) r3.b.c(n.class, m.t(qVar.f12305b).f12296a.getValue());
            if (nVar.getCountInBag() > 0) {
                arrayList2.add(Integer.valueOf(nVar.getId()));
                arrayList3.add(Integer.valueOf(nVar.getLevel()));
                while (true) {
                    if (i2 < arrayList.size()) {
                        if (nVar.getId() == ((D) arrayList.get(i2)).f4293a && nVar.getLevel() == ((D) arrayList.get(i2)).f4298i) {
                            ((D) arrayList.get(i2)).h = nVar.getCountInBag();
                            ((D) arrayList.get(i2)).f4302m = nVar.isLocked();
                            ((D) arrayList.get(i2)).f4304o = nVar.isUsedInArming();
                            break;
                        }
                        i2++;
                    } else {
                        nVar.setCount(nVar.getCountInBag());
                        arrayList.add(D.r(nVar));
                        arrayList.sort(new i(3));
                        break;
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
        dVar.a0();
        dVar.f2743n0.notifyDataSetChanged();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_bag, viewGroup, false);
        this.f2734e0 = inflate;
        this.f2735f0 = (TextView) inflate.findViewById(R.id.fragment_bag_space);
        this.f2737h0 = (GridView) this.f2734e0.findViewById(R.id.fragment_bag_grid_view);
        this.f2736g0 = (TextView) this.f2734e0.findViewById(R.id.fragment_bag_empty_view);
        this.f2740k0 = (RelativeLayout) this.f2734e0.findViewById(R.id.fragment_bag_filter_button);
        this.f2739j0 = (LinearLayout) this.f2734e0.findViewById(R.id.fragment_bag_filter_layout);
        this.f2738i0 = (GridView) this.f2734e0.findViewById(R.id.fragment_bag_filter_grid_view);
        this.f2741l0 = (RelativeLayout) this.f2734e0.findViewById(R.id.fragment_bag_back_button);
        this.f2732N0 = e.X(0);
        if (o.getLocationObject().getCurrentCity() != 0) {
            this.f2731M0 = 0;
        } else {
            this.f2731M0 = 2;
        }
        ArrayList arrayList = this.L0;
        arrayList.add(this.s0);
        arrayList.add(this.f2748t0);
        arrayList.add(this.f2749u0);
        arrayList.add(this.f2750v0);
        arrayList.add(this.f2751w0);
        arrayList.add(this.f2752x0);
        arrayList.add(this.f2753y0);
        arrayList.add(this.f2754z0);
        arrayList.add(this.f2720A0);
        arrayList.add(this.f2721B0);
        arrayList.add(this.f2722C0);
        arrayList.add(this.f2723D0);
        arrayList.add(this.f2724E0);
        arrayList.add(this.f2725F0);
        arrayList.add(this.f2726G0);
        arrayList.add(this.f2727H0);
        arrayList.add(this.f2728I0);
        arrayList.add(this.f2729J0);
        arrayList.add(this.f2730K0);
        this.f2745p0 = a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock");
        if (o.getLocationObject().isNeedFreeBag()) {
            a.d(a.c(C0592h.b().e(), "players"), "locationObject", "needFreeBag").I(Boolean.FALSE);
        }
        b.w(true);
        this.f2745p0.d(new a(this));
        this.f2742m0 = android.support.v4.media.session.a.K();
        C0641q qVar = new C0641q(this.f2733d0, this.f2742m0);
        this.f2744o0 = qVar;
        this.f2738i0.setAdapter(qVar);
        this.f2744o0.registerDataSetObserver(new b(this, 1));
        RelativeLayout relativeLayout = this.f2740k0;
        relativeLayout.setOnClickListener(new c(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f2741l0;
        relativeLayout2.setOnClickListener(new c(this, relativeLayout2, 1));
        return this.f2734e0;
    }

    public final void Y() {
        int i2;
        this.f2732N0 = e.X(0);
        String string = MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(Z()), Integer.valueOf(this.f2732N0)});
        if (Z() > this.f2732N0) {
            i2 = R.color.red_rust;
        } else {
            i2 = R.color.text_gray_dark_white;
        }
        SpannableString spannableString = new SpannableString(string);
        Context context = this.f2733d0;
        spannableString.setSpan(new ForegroundColorSpan(context.getResources().getColor(i2, context.getTheme())), 0, string.indexOf("/"), 33);
        this.f2735f0.setText(spannableString);
        b.c(this.f2735f0, 1);
    }

    public final int Z() {
        int i2 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f2747r0;
            if (i2 >= arrayList.size()) {
                return i5;
            }
            i5 += ((D) arrayList.get(i2)).h;
            i2++;
        }
    }

    public final void a0() {
        ArrayList arrayList = this.f2747r0;
        arrayList.clear();
        arrayList.addAll(this.s0);
        arrayList.addAll(this.f2748t0);
        arrayList.addAll(this.f2749u0);
        arrayList.addAll(this.f2727H0);
        arrayList.addAll(this.f2728I0);
        arrayList.addAll(this.f2750v0);
        arrayList.addAll(this.f2751w0);
        arrayList.addAll(this.f2752x0);
        arrayList.addAll(this.f2753y0);
        arrayList.addAll(this.f2754z0);
        arrayList.addAll(this.f2720A0);
        arrayList.addAll(this.f2721B0);
        arrayList.addAll(this.f2722C0);
        arrayList.addAll(this.f2723D0);
        arrayList.addAll(this.f2724E0);
        arrayList.addAll(this.f2725F0);
        arrayList.addAll(this.f2726G0);
        arrayList.addAll(this.f2729J0);
        arrayList.addAll(this.f2730K0);
        if (o.getLocationObject().getCurrentCity() != 0) {
            return;
        }
        if (arrayList.isEmpty() || (Z() < this.f2732N0 && !((D) arrayList.get(arrayList.size() - 1)).equals(D.a()))) {
            arrayList.add(D.a());
        }
    }
}
