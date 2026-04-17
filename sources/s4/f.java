package S4;

import K4.r;
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
import i3.C0592h;
import j4.C0641q;
import j4.M0;
import java.util.ArrayList;

public final class f extends C0286s {
    public static final /* synthetic */ int L0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f2757A0 = new ArrayList();

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f2758B0 = new ArrayList();

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f2759C0 = new ArrayList();

    /* renamed from: D0  reason: collision with root package name */
    public final ArrayList f2760D0 = new ArrayList();

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f2761E0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f2762F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f2763G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f2764H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f2765I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f2766J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f2767K0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2768d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2769e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f2770f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2771g0;

    /* renamed from: h0  reason: collision with root package name */
    public GridView f2772h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f2773i0;

    /* renamed from: j0  reason: collision with root package name */
    public LinearLayout f2774j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f2775k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f2776l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f2777m0;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f2778n0;

    /* renamed from: o0  reason: collision with root package name */
    public M0 f2779o0;

    /* renamed from: p0  reason: collision with root package name */
    public C0641q f2780p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f2781q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f2782r0 = new ArrayList();
    public final ArrayList s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f2783t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f2784u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f2785v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f2786w0 = new ArrayList();

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f2787x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f2788y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f2789z0 = new ArrayList();

    public f(Context context) {
        this.f2768d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stock, viewGroup, false);
        this.f2769e0 = inflate;
        this.f2770f0 = (TextView) inflate.findViewById(R.id.fragment_stock_space_title);
        this.f2771g0 = (TextView) this.f2769e0.findViewById(R.id.fragment_stock_empty_view);
        this.f2772h0 = (GridView) this.f2769e0.findViewById(R.id.fragment_stock_grid_view);
        this.f2775k0 = (RelativeLayout) this.f2769e0.findViewById(R.id.fragment_stock_lock_button);
        this.f2776l0 = (RelativeLayout) this.f2769e0.findViewById(R.id.fragment_stock_filter_button);
        this.f2774j0 = (LinearLayout) this.f2769e0.findViewById(R.id.fragment_stock_filter_layout);
        this.f2773i0 = (GridView) this.f2769e0.findViewById(R.id.fragment_stock_filter_grid_view);
        this.f2777m0 = (RelativeLayout) this.f2769e0.findViewById(R.id.fragment_stock_back_button);
        this.f2775k0.setVisibility(4);
        this.f2770f0.setVisibility(4);
        b.w(true);
        a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock").d(new c((Object) this, 29));
        this.f2778n0 = android.support.v4.media.session.a.K();
        C0641q qVar = new C0641q(this.f2768d0, this.f2778n0);
        this.f2780p0 = qVar;
        this.f2773i0.setAdapter(qVar);
        this.f2780p0.registerDataSetObserver(new r(this, 2));
        RelativeLayout relativeLayout = this.f2776l0;
        relativeLayout.setOnClickListener(new e(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f2777m0;
        relativeLayout2.setOnClickListener(new e(this, relativeLayout2, 1));
        return this.f2769e0;
    }
}
