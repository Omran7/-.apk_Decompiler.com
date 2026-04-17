package P4;

import B4.f;
import G4.b;
import U3.c;
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
import d5.o;
import i3.C0590f;
import i3.C0592h;
import j4.C0614b;
import java.util.ArrayList;

public final class j extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f2232d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f2233e0;

    /* renamed from: f0  reason: collision with root package name */
    public ListView f2234f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f2235g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f2236h0;

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList f2237i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0614b f2238j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f2239k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f2240l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f2241m0 = true;

    /* renamed from: n0  reason: collision with root package name */
    public int f2242n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f2243o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f2244p0;

    /* renamed from: q0  reason: collision with root package name */
    public C0590f f2245q0;

    public j(Context context) {
        this.f2232d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f2233e0 = inflate;
        this.f2234f0 = (ListView) inflate.findViewById(R.id.fragment_basic_list_view);
        this.f2235g0 = (TextView) this.f2233e0.findViewById(R.id.fragment_basic_empty_view);
        this.f2236h0 = (RelativeLayout) this.f2233e0.findViewById(R.id.fragment_basic_back_button);
        ((TextView) this.f2233e0.findViewById(R.id.fragment_basic_title)).setText(R.string.invite_players_title);
        this.f2245q0 = a.c(C0592h.b().e(), "players");
        this.f2237i0 = new ArrayList();
        C0614b bVar = new C0614b(this.f2232d0, this.f2237i0, 11);
        this.f2238j0 = bVar;
        this.f2234f0.setAdapter(bVar);
        this.f2234f0.setOnScrollListener(new B4.a(this, 6));
        this.f2234f0.setOnTouchListener(new b(this, 3));
        R2.b.w(true);
        this.f2245q0.E(o.getAccountObject().getId()).E("accountObject").E("invitedPlayers").r().p(10).d(new c((Object) this, 21));
        RelativeLayout relativeLayout = this.f2236h0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 13));
        return this.f2233e0;
    }
}
