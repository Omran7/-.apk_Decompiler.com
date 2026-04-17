package T4;

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

public final class f extends C0286s {

    /* renamed from: M0  reason: collision with root package name */
    public static final /* synthetic */ int f3604M0 = 0;

    /* renamed from: A0  reason: collision with root package name */
    public final ArrayList f3605A0 = new ArrayList();

    /* renamed from: B0  reason: collision with root package name */
    public final ArrayList f3606B0 = new ArrayList();

    /* renamed from: C0  reason: collision with root package name */
    public final ArrayList f3607C0 = new ArrayList();

    /* renamed from: D0  reason: collision with root package name */
    public final ArrayList f3608D0 = new ArrayList();

    /* renamed from: E0  reason: collision with root package name */
    public final ArrayList f3609E0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public final ArrayList f3610F0 = new ArrayList();

    /* renamed from: G0  reason: collision with root package name */
    public final ArrayList f3611G0 = new ArrayList();

    /* renamed from: H0  reason: collision with root package name */
    public final ArrayList f3612H0 = new ArrayList();

    /* renamed from: I0  reason: collision with root package name */
    public final ArrayList f3613I0 = new ArrayList();

    /* renamed from: J0  reason: collision with root package name */
    public final ArrayList f3614J0 = new ArrayList();

    /* renamed from: K0  reason: collision with root package name */
    public final ArrayList f3615K0 = new ArrayList();
    public final ArrayList L0 = new ArrayList();

    /* renamed from: d0  reason: collision with root package name */
    public final Context f3616d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f3617e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f3618f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f3619g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f3620h0;

    /* renamed from: i0  reason: collision with root package name */
    public GridView f3621i0;

    /* renamed from: j0  reason: collision with root package name */
    public GridView f3622j0;

    /* renamed from: k0  reason: collision with root package name */
    public LinearLayout f3623k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f3624l0;

    /* renamed from: m0  reason: collision with root package name */
    public RelativeLayout f3625m0;

    /* renamed from: n0  reason: collision with root package name */
    public RelativeLayout f3626n0;

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList f3627o0;

    /* renamed from: p0  reason: collision with root package name */
    public M0 f3628p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0641q f3629q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f3630r0;
    public final ArrayList s0 = new ArrayList();

    /* renamed from: t0  reason: collision with root package name */
    public final ArrayList f3631t0 = new ArrayList();

    /* renamed from: u0  reason: collision with root package name */
    public final ArrayList f3632u0 = new ArrayList();

    /* renamed from: v0  reason: collision with root package name */
    public final ArrayList f3633v0 = new ArrayList();

    /* renamed from: w0  reason: collision with root package name */
    public final ArrayList f3634w0 = new ArrayList();

    /* renamed from: x0  reason: collision with root package name */
    public final ArrayList f3635x0 = new ArrayList();

    /* renamed from: y0  reason: collision with root package name */
    public final ArrayList f3636y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public final ArrayList f3637z0 = new ArrayList();

    public f(Context context, int i2) {
        this.f3616d0 = context;
        this.f3617e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stock, viewGroup, false);
        this.f3618f0 = inflate;
        this.f3619g0 = (TextView) inflate.findViewById(R.id.fragment_stock_space_title);
        this.f3620h0 = (TextView) this.f3618f0.findViewById(R.id.fragment_stock_empty_view);
        this.f3621i0 = (GridView) this.f3618f0.findViewById(R.id.fragment_stock_grid_view);
        this.f3624l0 = (RelativeLayout) this.f3618f0.findViewById(R.id.fragment_stock_lock_button);
        this.f3625m0 = (RelativeLayout) this.f3618f0.findViewById(R.id.fragment_stock_filter_button);
        this.f3623k0 = (LinearLayout) this.f3618f0.findViewById(R.id.fragment_stock_filter_layout);
        this.f3622j0 = (GridView) this.f3618f0.findViewById(R.id.fragment_stock_filter_grid_view);
        this.f3626n0 = (RelativeLayout) this.f3618f0.findViewById(R.id.fragment_stock_back_button);
        this.f3624l0.setVisibility(4);
        this.f3619g0.setVisibility(4);
        b.w(true);
        a.d(a.c(C0592h.b().e(), "players"), "stockObject", "itemsInStock").d(new A((Object) this, 5));
        this.f3627o0 = android.support.v4.media.session.a.K();
        C0641q qVar = new C0641q(this.f3616d0, this.f3627o0);
        this.f3629q0 = qVar;
        this.f3622j0.setAdapter(qVar);
        this.f3629q0.registerDataSetObserver(new r(this, 4));
        RelativeLayout relativeLayout = this.f3625m0;
        relativeLayout.setOnClickListener(new e(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f3626n0;
        relativeLayout2.setOnClickListener(new e(this, relativeLayout2, 1));
        return this.f3618f0;
    }
}
