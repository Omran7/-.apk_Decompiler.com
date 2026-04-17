package r4;

import K4.h;
import R2.b;
import Y4.s;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b5.j;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.k;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import j4.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* renamed from: r4.f  reason: case insensitive filesystem */
public final class C0956f extends C0286s {

    /* renamed from: t0  reason: collision with root package name */
    public static final /* synthetic */ int f11220t0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public final Context f11221d0;

    /* renamed from: e0  reason: collision with root package name */
    public final String f11222e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f11223f0;

    /* renamed from: g0  reason: collision with root package name */
    public SwipeRefreshLayout f11224g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f11225h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f11226i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f11227j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public r f11228k0;

    /* renamed from: l0  reason: collision with root package name */
    public C0590f f11229l0;

    /* renamed from: m0  reason: collision with root package name */
    public C0953c f11230m0;

    /* renamed from: n0  reason: collision with root package name */
    public long f11231n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public int f11232o0 = 0;

    /* renamed from: p0  reason: collision with root package name */
    public String f11233p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f11234q0 = false;

    /* renamed from: r0  reason: collision with root package name */
    public final HashMap f11235r0 = new HashMap();
    public final HashMap s0 = new HashMap();

    public C0956f(Context context, String str) {
        this.f11221d0 = context;
        this.f11222e0 = str;
    }

    public static void V(C0956f fVar, j jVar, int i2) {
        String string;
        fVar.getClass();
        if (jVar.getPlayerId().equals("@System_Administration")) {
            string = MyApplication.f7090a.getApplicationContext().getString(R.string.system_administration);
        } else {
            string = MyApplication.f7090a.getApplicationContext().getString(R.string.system);
        }
        fVar.f11227j0.add(i2, new s(jVar.getPlayerId(), string, (String) null, jVar.getContent(), "no_profile_pic", 1, true, true, false, jVar.getUnixTimeInMilli()));
    }

    public static void W(C0956f fVar, j jVar) {
        if (fVar.f11235r0.containsKey(jVar.getPlayerId())) {
            fVar.X(jVar, fVar.f11227j0.size());
            fVar.f11228k0.notifyDataSetChanged();
            return;
        }
        ArrayList arrayList = new ArrayList();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
        a.c(C0592h.b().e(), "players").E(jVar.getPlayerId()).E("mainStatesObject").d(new C0955e(fVar, jVar, taskCompletionSource, 0));
        arrayList.add(taskCompletionSource.getTask());
        a.c(C0592h.b().e(), "players").E(jVar.getPlayerId()).E("gangObject").E("tag").d(new C0955e(fVar, jVar, taskCompletionSource2, 1));
        arrayList.add(taskCompletionSource2.getTask());
        Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new h(fVar, jVar, 11));
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_chat_details, viewGroup, false);
        this.f11223f0 = inflate;
        this.f11224g0 = (SwipeRefreshLayout) inflate.findViewById(R.id.fragment_chat_details_swipe_refresh);
        this.f11225h0 = (ListView) this.f11223f0.findViewById(R.id.fragment_chat_details_list_view);
        this.f11226i0 = (TextView) this.f11223f0.findViewById(R.id.fragment_chat_details_empty_view);
        this.f11229l0 = a.x(C0592h.d().e(), "chats").E(this.f11222e0);
        this.f11224g0.setOnRefreshListener(new C0951a(this));
        Y();
        return this.f11223f0;
    }

    public final void H() {
        C0953c cVar;
        this.f5157L = true;
        C0590f fVar = this.f11229l0;
        if (fVar != null && (cVar = this.f11230m0) != null) {
            fVar.u(cVar);
            this.f11229l0 = null;
            this.f11230m0 = null;
        }
    }

    public final void X(j jVar, int i2) {
        k kVar;
        String str;
        int i5;
        if (a.t(jVar.getPlayerId())) {
            kVar = o.getMainStatesObject();
            str = o.getGangObject().getTag();
            i5 = 0;
        } else {
            kVar = (k) this.f11235r0.get(jVar.getPlayerId());
            str = (String) this.s0.get(jVar.getPlayerId());
            i5 = 1;
        }
        String str2 = str;
        int i6 = i5;
        this.f11227j0.add(i2, new s(jVar.getPlayerId(), kVar.getNickName(), str2, jVar.getContent(), kVar.getProfilePicUrl(), i6, b.k0(kVar.getVipEndTime()), jVar.isFromSystem(), jVar.isFromAdmin(), jVar.getUnixTimeInMilli()));
    }

    public final void Y() {
        this.f11228k0 = new r(this.f11221d0, this.f11227j0, 0);
        b.w(true);
        this.f11229l0.p(15).d(new C0953c(this));
    }
}
