package R4;

import H4.i;
import K1.e;
import K4.r;
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
import com.mtma.criminal.city.activities.MainActivity;
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
import java.util.Objects;
import v3.m;
import v3.q;

public final class g extends C0286s {

    /* renamed from: M0  reason: collision with root package name */
    public static final /* synthetic */ int f2553M0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f2554A0 = new ArrayList();

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f2555B0 = new ArrayList();

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f2556C0 = new ArrayList();

    /* renamed from: D0  reason: collision with root package name */
    public final ArrayList f2557D0 = new ArrayList();

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f2558E0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f2559F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f2560G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f2561H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f2562I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f2563J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f2564K0 = new ArrayList();
    public final ArrayList L0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f2565d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2566e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2567f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2568g0;

    /* renamed from: h0  reason: collision with root package name */
    public GridView f2569h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f2570i0;

    /* renamed from: j0  reason: collision with root package name */
    public LinearLayout f2571j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f2572k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f2573l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f2574m0;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f2575n0;

    /* renamed from: o0  reason: collision with root package name */
    public A0 f2576o0;

    /* renamed from: p0  reason: collision with root package name */
    public C0641q f2577p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0590f f2578q0;

    /* renamed from: r0  reason: collision with root package name */
    public e f2579r0;
    public final ArrayList s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f2580t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f2581u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f2582v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f2583w0 = new ArrayList();

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f2584x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f2585y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f2586z0 = new ArrayList();

    public g(MainActivity mainActivity) {
        this.f2565d0 = mainActivity;
    }

    public static void V(g gVar) {
        gVar.getClass();
        A0 a02 = new A0(gVar.f2565d0, gVar.s0);
        gVar.f2576o0 = a02;
        gVar.f2569h0.setAdapter(a02);
        gVar.Y();
        b.w(false);
        gVar.f2569h0.setEmptyView(gVar.f2568g0);
        if (gVar.f2579r0 == null) {
            e eVar = new e(gVar);
            gVar.f2579r0 = eVar;
            gVar.f2578q0.b(eVar);
        }
    }

    public static void W(g gVar, C0587c cVar, ArrayList arrayList) {
        gVar.getClass();
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
                        if (nVar.isUsedInArming()) {
                            nVar.setCount(nVar.getCount() - 1);
                        }
                        if (nVar.getCount() > 0) {
                            if (Objects.equals(fVar.F(), e.y(0))) {
                                gVar.f2581u0.add(D.j(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(1))) {
                                gVar.f2582v0.add(D.b(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(10))) {
                                gVar.f2583w0.add(D.k(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(11))) {
                                gVar.f2584x0.add(D.d(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else if (fVar.F().equals(e.y(3))) {
                                gVar.f2585y0.add(D.l(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                            } else {
                                boolean equals = fVar.F().equals(e.y(9));
                                ArrayList arrayList2 = gVar.f2554A0;
                                if (equals) {
                                    arrayList2.add(D.q(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else if (fVar.F().equals(e.y(2))) {
                                    arrayList2.add(D.i(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                } else {
                                    boolean equals2 = fVar.F().equals(e.y(8));
                                    ArrayList arrayList3 = gVar.f2556C0;
                                    if (equals2) {
                                        arrayList3.add(D.w(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else if (fVar.F().equals(e.y(4))) {
                                        arrayList3.add(D.g(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                    } else {
                                        boolean equals3 = fVar.F().equals(e.y(5));
                                        ArrayList arrayList4 = gVar.f2557D0;
                                        if (equals3) {
                                            arrayList4.add(D.h(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(18))) {
                                            gVar.f2558E0.add(D.n(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(12))) {
                                            arrayList4.add(D.t(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(7))) {
                                            gVar.f2561H0.add(D.o(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(14))) {
                                            gVar.f2580t0.add(D.v(nVar.getId(), nVar.getCount(), nVar.getLevel(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(13))) {
                                            gVar.f2560G0.add(D.u(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(15))) {
                                            gVar.f2562I0.add(D.p(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(16))) {
                                            gVar.f2563J0.add(D.c(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(17))) {
                                            gVar.f2564K0.add(D.m(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        } else if (fVar.F().equals(e.y(6))) {
                                            gVar.L0.add(D.e(nVar.getId(), nVar.getCount(), nVar.isLocked()));
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception e6) {
                        a.q("Exception from try-catch block inside ", "g", " in addNewItemsType method.", e6, "g");
                    }
                } else {
                    gVar.Y();
                    return;
                }
            }
        }
    }

    public static void X(g gVar, C0587c cVar, ArrayList arrayList) {
        gVar.getClass();
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
            if (nVar.isUsedInArming()) {
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
                        arrayList.sort(new i(2));
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
        gVar.Y();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stock, viewGroup, false);
        this.f2566e0 = inflate;
        this.f2567f0 = (TextView) inflate.findViewById(R.id.fragment_stock_space);
        this.f2568g0 = (TextView) this.f2566e0.findViewById(R.id.fragment_stock_empty_view);
        this.f2569h0 = (GridView) this.f2566e0.findViewById(R.id.fragment_stock_grid_view);
        this.f2572k0 = (RelativeLayout) this.f2566e0.findViewById(R.id.fragment_stock_lock_button);
        this.f2573l0 = (RelativeLayout) this.f2566e0.findViewById(R.id.fragment_stock_filter_button);
        this.f2571j0 = (LinearLayout) this.f2566e0.findViewById(R.id.fragment_stock_filter_layout);
        this.f2570i0 = (GridView) this.f2566e0.findViewById(R.id.fragment_stock_filter_grid_view);
        this.f2574m0 = (RelativeLayout) this.f2566e0.findViewById(R.id.fragment_stock_back_button);
        this.f2578q0 = a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock");
        b.w(true);
        this.f2578q0.d(new e(this));
        this.f2575n0 = android.support.v4.media.session.a.K();
        C0641q qVar = new C0641q(this.f2565d0, this.f2575n0);
        this.f2577p0 = qVar;
        this.f2570i0.setAdapter(qVar);
        this.f2577p0.registerDataSetObserver(new r(this, 1));
        RelativeLayout relativeLayout = this.f2573l0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f2572k0;
        relativeLayout2.setOnClickListener(new f(this, relativeLayout2, 1));
        RelativeLayout relativeLayout3 = this.f2574m0;
        relativeLayout3.setOnClickListener(new f(this, relativeLayout3, 2));
        return this.f2566e0;
    }

    public final void Y() {
        int i2;
        ArrayList arrayList = this.s0;
        arrayList.clear();
        arrayList.addAll(this.f2580t0);
        arrayList.addAll(this.f2581u0);
        arrayList.addAll(this.f2582v0);
        arrayList.addAll(this.f2562I0);
        arrayList.addAll(this.f2563J0);
        arrayList.addAll(this.f2583w0);
        arrayList.addAll(this.f2584x0);
        arrayList.addAll(this.f2585y0);
        arrayList.addAll(this.f2586z0);
        arrayList.addAll(this.f2554A0);
        arrayList.addAll(this.f2555B0);
        arrayList.addAll(this.f2556C0);
        arrayList.addAll(this.f2557D0);
        arrayList.addAll(this.f2558E0);
        arrayList.addAll(this.f2559F0);
        arrayList.addAll(this.f2560G0);
        arrayList.addAll(this.f2561H0);
        arrayList.addAll(this.f2564K0);
        arrayList.addAll(this.L0);
        this.f2576o0.notifyDataSetChanged();
        Context applicationContext = MyApplication.f7090a.getApplicationContext();
        int i5 = 0;
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            i5 += ((D) arrayList.get(i6)).h;
        }
        String string = applicationContext.getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(i5), Integer.valueOf(o.getStockObject().getStockSpace())});
        int i7 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            i7 += ((D) arrayList.get(i8)).h;
        }
        if (i7 >= o.getStockObject().getStockSpace()) {
            i2 = R.color.red_rust;
        } else {
            i2 = R.color.text_gray_dark_white;
        }
        SpannableString spannableString = new SpannableString(string);
        MainActivity mainActivity = this.f2565d0;
        spannableString.setSpan(new ForegroundColorSpan(mainActivity.getResources().getColor(i2, mainActivity.getTheme())), 0, string.indexOf("/"), 33);
        this.f2567f0.setText(spannableString);
        b.c(this.f2567f0, 1);
    }
}
