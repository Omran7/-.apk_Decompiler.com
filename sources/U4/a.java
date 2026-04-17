package U4;

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
import j4.M0;
import java.util.ArrayList;

public final class a extends C0286s {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f3714k0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f3715d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f3716e0;

    /* renamed from: f0  reason: collision with root package name */
    public GridView f3717f0;

    /* renamed from: g0  reason: collision with root package name */
    public RelativeLayout f3718g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f3719h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f3720i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public M0 f3721j0;

    public a(Context context) {
        this.f3715d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stall, viewGroup, false);
        this.f3716e0 = inflate;
        this.f3719h0 = (TextView) inflate.findViewById(R.id.fragment_stall_space);
        this.f3717f0 = (GridView) this.f3716e0.findViewById(R.id.fragment_stall_grid_view);
        this.f3718g0 = (RelativeLayout) this.f3716e0.findViewById(R.id.fragment_stall_back_button);
        com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(com.google.android.gms.internal.measurement.a.e(true), "players"), "stockObject", "stallDetails").d(new t(this, 6));
        RelativeLayout relativeLayout = this.f3718g0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 18));
        return this.f3716e0;
    }
}
