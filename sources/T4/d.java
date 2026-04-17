package T4;

import K4.e;
import R2.b;
import S3.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import i3.C0590f;
import i3.C0592h;
import it.sephiroth.android.library.widget.HListView;
import j4.C0621e0;
import j4.M0;
import java.util.ArrayList;

public final class d extends C0286s {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ int f3586t0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f3587d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f3588e0;

    /* renamed from: f0  reason: collision with root package name */
    public GridView f3589f0;

    /* renamed from: g0  reason: collision with root package name */
    public HListView f3590g0;

    /* renamed from: h0  reason: collision with root package name */
    public ImageView f3591h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f3592i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f3593j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f3594k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f3595l0 = new ArrayList();

    /* renamed from: m0  reason: collision with root package name */
    public final ArrayList f3596m0 = new ArrayList();

    /* renamed from: n0  reason: collision with root package name */
    public M0 f3597n0;

    /* renamed from: o0  reason: collision with root package name */
    public C0621e0 f3598o0;

    /* renamed from: p0  reason: collision with root package name */
    public C0590f f3599p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f3600q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f3601r0;
    public boolean s0 = false;

    public d(Context context) {
        this.f3587d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_museum, viewGroup, false);
        this.f3588e0 = inflate;
        this.f3592i0 = (TextView) inflate.findViewById(R.id.fragment_museum_space_value);
        this.f3589f0 = (GridView) this.f3588e0.findViewById(R.id.fragment_museum_grid_view);
        this.f3591h0 = (ImageView) this.f3588e0.findViewById(R.id.fragment_museum_background);
        this.f3590g0 = (HListView) this.f3588e0.findViewById(R.id.fragment_museum_horizontal_list_view);
        this.f3593j0 = (RelativeLayout) this.f3588e0.findViewById(R.id.fragment_museum_change_button);
        this.f3594k0 = (RelativeLayout) this.f3588e0.findViewById(R.id.fragment_museum_back_button);
        this.f3590g0.getViewTreeObserver().addOnGlobalLayoutListener(new e(this, 1));
        this.f3599p0 = a.v(a.c(C0592h.b().e(), "players"), "stockObject");
        b.w(true);
        this.f3599p0.E("itemsInStock").d(new t(this, 5));
        RelativeLayout relativeLayout = this.f3593j0;
        relativeLayout.setOnClickListener(new a(this, relativeLayout, 1));
        RelativeLayout relativeLayout2 = this.f3594k0;
        relativeLayout2.setOnClickListener(new a(this, relativeLayout2, 0));
        return this.f3588e0;
    }
}
