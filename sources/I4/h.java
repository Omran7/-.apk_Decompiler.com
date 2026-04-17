package I4;

import A4.a;
import G4.b;
import U3.c;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.d;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.activities.MainActivity;
import j4.C0637m0;
import java.util.ArrayList;

public final class h extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final MainActivity f1218d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1219e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f1220f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f1221g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f1222h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f1223i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f1224j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public C0637m0 f1225k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f1226l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1227m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public int f1228n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f1229o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f1230p0;

    /* renamed from: q0  reason: collision with root package name */
    public Handler f1231q0;

    /* renamed from: r0  reason: collision with root package name */
    public a f1232r0;

    public h(MainActivity mainActivity) {
        this.f1218d0 = mainActivity;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_button, viewGroup, false);
        this.f1219e0 = inflate;
        this.f1221g0 = (ListView) inflate.findViewById(R.id.fragment_basic_list_view);
        this.f1220f0 = (TextView) this.f1219e0.findViewById(R.id.fragment_basic_empty_view);
        this.f1222h0 = (RelativeLayout) this.f1219e0.findViewById(R.id.fragment_basic_back_button);
        this.f1223i0 = (RelativeLayout) this.f1219e0.findViewById(R.id.fragment_basic_second_button);
        ((TextView) this.f1219e0.findViewById(R.id.fragment_basic_title)).setText(R.string.prison_title);
        this.f1220f0.setText(R.string.empty_prison);
        this.f1223i0.setVisibility(0);
        ((ImageView) this.f1219e0.findViewById(R.id.fragment_basic_second_button_image)).setImageResource(R.drawable.button_refresh);
        ((TextView) this.f1219e0.findViewById(R.id.fragment_basic_second_button_text)).setText(R.string.button_update);
        this.f1231q0 = new Handler();
        this.f1232r0 = new a(this, 1);
        C0637m0 m0Var = new C0637m0(this.f1218d0, this.f1224j0);
        this.f1225k0 = m0Var;
        this.f1221g0.setAdapter(m0Var);
        this.f1221g0.setOnScrollListener(new B4.a(this, 4));
        this.f1221g0.setOnTouchListener(new b(this, 1));
        V();
        RelativeLayout relativeLayout = this.f1223i0;
        relativeLayout.setOnClickListener(new g(this, relativeLayout, 0));
        RelativeLayout relativeLayout2 = this.f1222h0;
        relativeLayout2.setOnClickListener(new g(this, relativeLayout2, 1));
        return this.f1219e0;
    }

    public final void H() {
        this.f5157L = true;
        this.f1231q0.removeCallbacks(this.f1232r0);
    }

    public final void I() {
        this.f5157L = true;
        if (this.f1225k0 != null) {
            this.f1231q0.postDelayed(this.f1232r0, 3000);
        }
    }

    public final void V() {
        com.google.android.gms.internal.measurement.a.e(true).E(R2.b.Z()).E("players").q("locationObject/sortByCityPlaceLastSeen").x(d.C0(), (String) null).o(15).d(new c((Object) this, 13));
    }
}
