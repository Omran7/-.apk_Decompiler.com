package R4;

import R2.b;
import U3.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import j4.C0641q;
import java.util.ArrayList;

public final class d extends C0286s {

    /* renamed from: N0  reason: collision with root package name */
    public static final /* synthetic */ int f2515N0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f2516A0 = new ArrayList();

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f2517B0 = new ArrayList();

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f2518C0 = new ArrayList();

    /* renamed from: D0  reason: collision with root package name */
    public final ArrayList f2519D0 = new ArrayList();

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f2520E0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f2521F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f2522G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f2523H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f2524I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f2525J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f2526K0 = new ArrayList();
    public final ArrayList L0 = new ArrayList();

    /* renamed from: M0  reason: collision with root package name */
    public final ArrayList f2527M0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2528d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2529e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2530f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2531g0;

    /* renamed from: h0  reason: collision with root package name */
    public GridView f2532h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f2533i0;

    /* renamed from: j0  reason: collision with root package name */
    public LinearLayout f2534j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f2535k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f2536l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f2537m0;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f2538n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0641q f2539o0;

    /* renamed from: p0  reason: collision with root package name */
    public C0641q f2540p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0590f f2541q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f2542r0 = 0;
    public final ArrayList s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f2543t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f2544u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f2545v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f2546w0 = new ArrayList();

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f2547x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f2548y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f2549z0 = new ArrayList();

    public d(Context context) {
        this.f2528d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_lock, viewGroup, false);
        this.f2529e0 = inflate;
        this.f2530f0 = (TextView) inflate.findViewById(R.id.fragment_lock_space);
        this.f2531g0 = (TextView) this.f2529e0.findViewById(R.id.fragment_lock_empty_view);
        this.f2532h0 = (GridView) this.f2529e0.findViewById(R.id.fragment_lock_grid_view);
        this.f2535k0 = (RelativeLayout) this.f2529e0.findViewById(R.id.fragment_lock_help_button);
        this.f2536l0 = (RelativeLayout) this.f2529e0.findViewById(R.id.fragment_lock_filter_button);
        this.f2534j0 = (LinearLayout) this.f2529e0.findViewById(R.id.fragment_lock_filter_layout);
        this.f2533i0 = (GridView) this.f2529e0.findViewById(R.id.fragment_lock_filter_grid_view);
        this.f2537m0 = (RelativeLayout) this.f2529e0.findViewById(R.id.fragment_lock_save_button);
        this.f2541q0 = a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock");
        b.w(true);
        this.f2541q0.d(new c((Object) this, 24));
        this.f2538n0 = android.support.v4.media.session.a.K();
        C0641q qVar = new C0641q(this.f2528d0, this.f2538n0);
        this.f2540p0 = qVar;
        this.f2533i0.setAdapter(qVar);
        this.f2540p0.registerDataSetObserver(new a(this, 1));
        RelativeLayout relativeLayout = this.f2536l0;
        relativeLayout.setOnClickListener(new b(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f2535k0;
        relativeLayout2.setOnClickListener(new b(this, relativeLayout2, 1));
        RelativeLayout relativeLayout3 = this.f2537m0;
        relativeLayout3.setOnClickListener(new b(this, relativeLayout3, 2));
        return this.f2529e0;
    }

    public final void V() {
        ArrayList arrayList = this.f2543t0;
        arrayList.clear();
        arrayList.addAll(this.f2544u0);
        arrayList.addAll(this.f2545v0);
        arrayList.addAll(this.f2546w0);
        arrayList.addAll(this.f2525J0);
        arrayList.addAll(this.f2526K0);
        arrayList.addAll(this.f2547x0);
        arrayList.addAll(this.f2548y0);
        arrayList.addAll(this.f2549z0);
        arrayList.addAll(this.f2516A0);
        arrayList.addAll(this.f2517B0);
        arrayList.addAll(this.f2518C0);
        arrayList.addAll(this.f2519D0);
        arrayList.addAll(this.f2520E0);
        arrayList.addAll(this.f2521F0);
        arrayList.addAll(this.f2522G0);
        arrayList.addAll(this.f2523H0);
        arrayList.addAll(this.f2524I0);
        arrayList.addAll(this.L0);
        arrayList.addAll(this.f2527M0);
        this.f2539o0.notifyDataSetChanged();
        this.f2530f0.setText(s(R.string.slash_between_two_number, Integer.valueOf(this.f2542r0), Integer.valueOf(o.getStockObject().getLockerSpace())));
    }
}
