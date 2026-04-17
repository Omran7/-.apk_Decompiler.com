package t4;

import R2.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import i3.C0590f;
import i3.C0592h;
import j4.C0646w;
import j4.G;
import j4.p0;
import k.C0724m;

/* renamed from: t4.a  reason: case insensitive filesystem */
public final class C1009a extends C0286s {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f11748n0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f11749d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f11750e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f11751f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f11752g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f11753h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f11754i0;

    /* renamed from: j0  reason: collision with root package name */
    public G f11755j0;

    /* renamed from: k0  reason: collision with root package name */
    public C0590f f11756k0;

    /* renamed from: l0  reason: collision with root package name */
    public p0 f11757l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f11758m0;

    public C1009a(Context context) {
        this.f11749d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f11750e0 = inflate;
        this.f11752g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f11751f0 = (TextView) this.f11750e0.findViewById(R.id.fragment_basic_bottom_text_view);
        this.f11753h0 = (ListView) this.f11750e0.findViewById(R.id.fragment_basic_list_view);
        this.f11754i0 = (RelativeLayout) this.f11750e0.findViewById(R.id.fragment_basic_back_button);
        this.f11756k0 = a.d(a.c(C0592h.b().e(), "players"), "estateObject", "allOwnEstates");
        this.f11752g0.setText(R.string.estate_own_name);
        b.w(true);
        this.f11756k0.q("id").d(new C0724m(this, 12));
        RelativeLayout relativeLayout = this.f11754i0;
        relativeLayout.setOnClickListener(new C0646w(this, relativeLayout, 13));
        return this.f11750e0;
    }

    public final void H() {
        p0 p0Var;
        this.f5157L = true;
        C0590f fVar = this.f11756k0;
        if (fVar != null && (p0Var = this.f11757l0) != null) {
            fVar.u(p0Var);
            this.f11757l0 = null;
        }
    }

    public final void I() {
        this.f5157L = true;
        if (this.f11757l0 == null) {
            p0 p0Var = new p0(this, 18);
            this.f11757l0 = p0Var;
            this.f11756k0.b(p0Var);
        }
    }
}
