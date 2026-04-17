package H4;

import B0.C0004c;
import B0.H;
import Y4.s;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C0286s;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b5.j;
import b5.l;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.k;
import d5.o;
import e5.C0507d;
import e5.C0508e;
import i3.C0586b;
import i3.C0587c;
import i3.C0590f;
import i3.C0592h;
import j4.r;
import java.util.ArrayList;
import java.util.Iterator;
import r3.b;
import v3.m;
import v3.q;

public final class h extends C0286s implements C0507d {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f1033w0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1034d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1035e0;

    /* renamed from: f0  reason: collision with root package name */
    public SwipeRefreshLayout f1036f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f1037g0;

    /* renamed from: h0  reason: collision with root package name */
    public EditText f1038h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f1039i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f1040j0;

    /* renamed from: k0  reason: collision with root package name */
    public ConstraintLayout f1041k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f1042l0 = new ArrayList();

    /* renamed from: m0  reason: collision with root package name */
    public r f1043m0;

    /* renamed from: n0  reason: collision with root package name */
    public C0590f f1044n0;

    /* renamed from: o0  reason: collision with root package name */
    public b f1045o0;

    /* renamed from: p0  reason: collision with root package name */
    public final String f1046p0;

    /* renamed from: q0  reason: collision with root package name */
    public k f1047q0;

    /* renamed from: r0  reason: collision with root package name */
    public long f1048r0 = 0;
    public int s0 = 0;

    /* renamed from: t0  reason: collision with root package name */
    public String f1049t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f1050u0 = false;

    /* renamed from: v0  reason: collision with root package name */
    public C0508e f1051v0;

    public h(Context context, String str) {
        this.f1034d0 = context;
        this.f1046p0 = str;
    }

    public static void V(h hVar, C0587c cVar) {
        ArrayList arrayList = hVar.f1042l0;
        arrayList.clear();
        hVar.s0 = 0;
        C0586b c3 = cVar.c();
        boolean z3 = false;
        while (true) {
            Iterator it2 = c3.f8276a;
            if (!it2.hasNext()) {
                break;
            }
            q qVar = (q) it2.next();
            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
            m t6 = m.t(qVar.f12305b);
            if (!z3) {
                try {
                    hVar.f1049t0 = E6.F();
                    z3 = true;
                } catch (Exception e6) {
                    a.r("Exception from try-catch inside ", "h", " class in displayFirstLoadingMessages method.", "h", e6);
                }
            }
            j jVar = (j) b.c(j.class, t6.f12296a.getValue());
            if (jVar.isFromSystem()) {
                hVar.Y(jVar, arrayList.size());
            } else {
                hVar.X(jVar, arrayList.size());
            }
        }
        r rVar = new r(hVar.f1034d0, arrayList, 0);
        hVar.f1043m0 = rVar;
        hVar.f1037g0.setAdapter(rVar);
        hVar.f1037g0.setSelection(arrayList.size() - 1);
        hVar.b0();
        hVar.f1048r0 = cVar.d();
        if (hVar.f1045o0 == null) {
            hVar.f1045o0 = new b(hVar);
            hVar.f1044n0.p(15).b(hVar.f1045o0);
        }
        if (cVar.d() == 15) {
            hVar.f1050u0 = true;
        }
        R2.b.w(false);
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_private_message, viewGroup, false);
        this.f1035e0 = inflate;
        this.f1036f0 = (SwipeRefreshLayout) inflate.findViewById(R.id.fragment_private_message_swipe_refresh);
        this.f1037g0 = (ListView) this.f1035e0.findViewById(R.id.fragment_private_message_list_view);
        this.f1041k0 = (ConstraintLayout) this.f1035e0.findViewById(R.id.fragment_private_message_edit_text_layout);
        this.f1038h0 = (EditText) this.f1035e0.findViewById(R.id.fragment_private_message_edit_text);
        this.f1039i0 = (ImageView) this.f1035e0.findViewById(R.id.fragment_private_message_send_button);
        this.f1040j0 = (RelativeLayout) this.f1035e0.findViewById(R.id.fragment_private_message_back_button);
        a0();
        this.f1038h0.setMaxLines(20);
        this.f1038h0.addTextChangedListener(new a(0, this));
        this.f1036f0.setOnRefreshListener(new b(this));
        Z();
        ImageView imageView = this.f1039i0;
        imageView.setOnClickListener(new c(this, imageView, 0));
        RelativeLayout relativeLayout = this.f1040j0;
        relativeLayout.setOnClickListener(new c(this, relativeLayout, 1));
        this.f1051v0 = new C0508e(l());
        this.f1035e0.post(new C0004c((Object) this, 1));
        return this.f1035e0;
    }

    public final void D() {
        this.f5157L = true;
        C0508e eVar = this.f1051v0;
        eVar.f7696a = null;
        eVar.dismiss();
    }

    public final void H() {
        this.f5157L = true;
        b bVar = this.f1045o0;
        if (bVar != null) {
            this.f1044n0.u(bVar);
            this.f1044n0 = null;
            this.f1045o0 = null;
        }
        this.f1051v0.f7696a = null;
    }

    public final void I() {
        this.f5157L = true;
        this.f1051v0.f7696a = this;
    }

    public final void W(String str, k kVar, j jVar, int i2) {
        String nickName = kVar.getNickName();
        String profilePicUrl = kVar.getProfilePicUrl();
        boolean k02 = R2.b.k0(kVar.getVipEndTime());
        this.f1042l0.add(i2, new s(str, nickName, (String) null, jVar.getContent(), profilePicUrl, a.t(str) ^ true ? 1 : 0, k02, jVar.isFromSystem(), jVar.isFromAdmin(), jVar.getUnixTimeInMilli()));
    }

    public final void X(j jVar, int i2) {
        if (a.t(jVar.getPlayerId())) {
            W(jVar.getPlayerId(), o.getMainStatesObject(), jVar, i2);
        } else {
            W(jVar.getPlayerId(), this.f1047q0, jVar, i2);
        }
    }

    public final void Y(j jVar, int i2) {
        String string;
        if (jVar.getPlayerId().equals("@gang")) {
            string = MyApplication.f7090a.getApplicationContext().getString(R.string.chat_gang_name);
        } else if (jVar.getPlayerId().equals("@System_Administration")) {
            string = MyApplication.f7090a.getApplicationContext().getString(R.string.system_administration);
        } else {
            string = MyApplication.f7090a.getApplicationContext().getString(R.string.system);
        }
        this.f1042l0.add(i2, new s(jVar.getPlayerId(), string, (String) null, jVar.getContent(), "no_profile_pic", 1, true, true, false, jVar.getUnixTimeInMilli()));
    }

    public final void Z() {
        boolean z3;
        String str = this.f1046p0;
        if (str.equals("@System") || str.equals("@System_Administration") || str.equals("@gang")) {
            this.f1041k0.setVisibility(8);
            z3 = true;
        } else {
            z3 = false;
        }
        R2.b.w(true);
        this.f1044n0.p(15).d(new H(this, z3, 1));
    }

    public final void a0() {
        this.f1044n0 = a.v(a.x(C0592h.d().e(), "messages"), "chatMessages").E(this.f1046p0);
    }

    public final void b0() {
        C0590f v6 = a.v(a.x(C0592h.d().e(), "messages"), "chatData");
        String str = this.f1046p0;
        v6.E(str).E("read").I(Boolean.TRUE);
        for (C0286s sVar : p().f5000c.v()) {
            if (sVar instanceof j) {
                j jVar = (j) sVar;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = jVar.f1059j0;
                    if (i2 >= arrayList.size()) {
                        return;
                    }
                    if (((l) arrayList.get(i2)).getPlayerId().equals(str)) {
                        ((l) arrayList.get(i2)).setRead(true);
                        jVar.f1060k0.notifyDataSetChanged();
                        jVar.V();
                        return;
                    }
                    i2++;
                }
            }
        }
    }

    public final void f(int i2) {
        this.f1041k0.setPadding(0, 0, 0, i2);
        this.f1035e0.requestLayout();
    }
}
