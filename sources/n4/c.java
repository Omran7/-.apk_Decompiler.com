package n4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import p4.C0918a;

public final class c extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f10357d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f10358e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f10359f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f10360g0;

    /* renamed from: h0  reason: collision with root package name */
    public View f10361h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f10362i0;

    /* renamed from: j0  reason: collision with root package name */
    public View f10363j0;

    /* renamed from: k0  reason: collision with root package name */
    public View f10364k0;

    /* renamed from: l0  reason: collision with root package name */
    public View f10365l0;

    /* renamed from: m0  reason: collision with root package name */
    public View f10366m0;

    /* renamed from: n0  reason: collision with root package name */
    public View f10367n0;

    /* renamed from: o0  reason: collision with root package name */
    public View f10368o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f10369p0;

    /* renamed from: q0  reason: collision with root package name */
    public RelativeLayout f10370q0;

    public c(MainActivity mainActivity) {
        this.f10357d0 = mainActivity;
    }

    public static void V(c cVar, int i2) {
        C0269a aVar = new C0269a(cVar.p());
        aVar.f(R.id.activity_main_body_frame_layout, new C0918a(i2, 3, cVar.f10357d0), (String) null, 1);
        a.j(aVar, false);
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_map, viewGroup, false);
        this.f10358e0 = inflate;
        this.f10359f0 = inflate.findViewById(R.id.fragment_map_gang_city_button);
        this.f10360g0 = this.f10358e0.findViewById(R.id.fragment_map_dubai_city_button);
        this.f10361h0 = this.f10358e0.findViewById(R.id.fragment_map_gaza_city_button);
        this.f10362i0 = this.f10358e0.findViewById(R.id.fragment_map_riyadh_city_button);
        this.f10363j0 = this.f10358e0.findViewById(R.id.fragment_map_sanaa_city_button);
        this.f10364k0 = this.f10358e0.findViewById(R.id.fragment_map_cairo_city_button);
        this.f10365l0 = this.f10358e0.findViewById(R.id.fragment_map_doha_city_button);
        this.f10366m0 = this.f10358e0.findViewById(R.id.fragment_map_tehran_city_button);
        this.f10367n0 = this.f10358e0.findViewById(R.id.fragment_map_tripoli_city_button);
        this.f10368o0 = this.f10358e0.findViewById(R.id.fragment_map_idlib_city_button);
        this.f10369p0 = this.f10358e0.findViewById(R.id.fragment_map_rabat_city_button);
        this.f10370q0 = (RelativeLayout) this.f10358e0.findViewById(R.id.fragment_map_back_button);
        this.f10359f0.setOnClickListener(new b(this, 3));
        this.f10360g0.setOnClickListener(new b(this, 4));
        this.f10361h0.setOnClickListener(new b(this, 5));
        this.f10362i0.setOnClickListener(new b(this, 6));
        this.f10363j0.setOnClickListener(new b(this, 7));
        this.f10364k0.setOnClickListener(new b(this, 8));
        this.f10365l0.setOnClickListener(new b(this, 9));
        this.f10366m0.setOnClickListener(new b(this, 10));
        this.f10367n0.setOnClickListener(new b(this, 11));
        this.f10368o0.setOnClickListener(new b(this, 0));
        this.f10369p0.setOnClickListener(new b(this, 1));
        RelativeLayout relativeLayout = this.f10370q0;
        relativeLayout.setOnClickListener(new b(this, (View) relativeLayout));
        return this.f10358e0;
    }
}
