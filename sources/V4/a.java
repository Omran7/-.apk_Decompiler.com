package V4;

import B4.f;
import S3.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import java.util.ArrayList;

public final class a extends C0286s {

    /* renamed from: m0  reason: collision with root package name */
    public static final /* synthetic */ int f3780m0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f3781d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f3782e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f3783f0;

    /* renamed from: g0  reason: collision with root package name */
    public GridView f3784g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f3785h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f3786i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f3787j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList f3788k0 = new ArrayList();

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f3789l0 = new ArrayList();

    public a(Context context) {
        this.f3781d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_specific_stock, viewGroup, false);
        this.f3782e0 = inflate;
        this.f3783f0 = (TextView) inflate.findViewById(R.id.fragment_specific_stock_empty_view);
        this.f3784g0 = (GridView) this.f3782e0.findViewById(R.id.fragment_specific_stock_grid_view);
        this.f3785h0 = (RelativeLayout) this.f3782e0.findViewById(R.id.fragment_specific_stock_back_button);
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(com.google.android.gms.internal.measurement.a.e(true), "players"), "stockObject", "itemsInStock").d(new t(this, 7));
        RelativeLayout relativeLayout = this.f3785h0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 19));
        return this.f3782e0;
    }
}
