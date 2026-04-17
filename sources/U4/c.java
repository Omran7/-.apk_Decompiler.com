package U4;

import K4.r;
import R2.b;
import T1.A;
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

public final class c extends C0286s {
    public static final /* synthetic */ int L0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f3724A0 = new ArrayList();

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f3725B0 = new ArrayList();

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f3726C0 = new ArrayList();

    /* renamed from: D0  reason: collision with root package name */
    public final ArrayList f3727D0 = new ArrayList();

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f3728E0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f3729F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f3730G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f3731H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f3732I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f3733J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f3734K0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final Context f3735d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f3736e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f3737f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f3738g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f3739h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f3740i0;

    /* renamed from: j0  reason: collision with root package name */
    public GridView f3741j0;

    /* renamed from: k0  reason: collision with root package name */
    public LinearLayout f3742k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f3743l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f3744m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f3745n0;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f3746o0;

    /* renamed from: p0  reason: collision with root package name */
    public M0 f3747p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0641q f3748q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ArrayList f3749r0 = new ArrayList();
    public final ArrayList s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f3750t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f3751u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f3752v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f3753w0 = new ArrayList();

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f3754x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f3755y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f3756z0 = new ArrayList();

    public c(Context context, int i2) {
        this.f3735d0 = context;
        this.f3736e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stock, viewGroup, false);
        this.f3737f0 = inflate;
        this.f3738g0 = (TextView) inflate.findViewById(R.id.fragment_stock_space_title);
        this.f3739h0 = (TextView) this.f3737f0.findViewById(R.id.fragment_stock_empty_view);
        this.f3740i0 = (GridView) this.f3737f0.findViewById(R.id.fragment_stock_grid_view);
        this.f3743l0 = (RelativeLayout) this.f3737f0.findViewById(R.id.fragment_stock_lock_button);
        this.f3744m0 = (RelativeLayout) this.f3737f0.findViewById(R.id.fragment_stock_filter_button);
        this.f3742k0 = (LinearLayout) this.f3737f0.findViewById(R.id.fragment_stock_filter_layout);
        this.f3741j0 = (GridView) this.f3737f0.findViewById(R.id.fragment_stock_filter_grid_view);
        this.f3745n0 = (RelativeLayout) this.f3737f0.findViewById(R.id.fragment_stock_back_button);
        this.f3743l0.setVisibility(4);
        this.f3738g0.setVisibility(4);
        b.w(true);
        a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock").d(new A((Object) this, 6));
        this.f3746o0 = android.support.v4.media.session.a.K();
        C0641q qVar = new C0641q(this.f3735d0, this.f3746o0);
        this.f3748q0 = qVar;
        this.f3741j0.setAdapter(qVar);
        this.f3748q0.registerDataSetObserver(new r(this, 6));
        RelativeLayout relativeLayout = this.f3744m0;
        relativeLayout.setOnClickListener(new b(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f3745n0;
        relativeLayout2.setOnClickListener(new b(this, relativeLayout2, 1));
        return this.f3737f0;
    }
}
