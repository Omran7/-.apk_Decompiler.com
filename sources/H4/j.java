package H4;

import B4.a;
import B4.b;
import B4.f;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import b5.l;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0592h;
import j4.C0626h;
import java.util.ArrayList;
import x1.i;

public final class j extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f1053d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f1054e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f1055f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f1056g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f1057h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f1058i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f1059j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public C0626h f1060k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f1061l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f1062m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public int f1063n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f1064o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f1065p0;

    public j(Context context) {
        this.f1053d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f1054e0 = inflate;
        this.f1055f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f1056g0 = (ListView) this.f1054e0.findViewById(R.id.fragment_basic_list_view);
        this.f1057h0 = (TextView) this.f1054e0.findViewById(R.id.fragment_basic_empty_view);
        this.f1058i0 = (RelativeLayout) this.f1054e0.findViewById(R.id.fragment_basic_back_button);
        C0626h hVar = new C0626h(this.f1053d0, this.f1059j0, 4);
        this.f1060k0 = hVar;
        this.f1056g0.setAdapter(hVar);
        this.f1056g0.setOnScrollListener(new a(this, 3));
        this.f1056g0.setOnTouchListener(new b(this, 2));
        this.f1055f0.setText(R.string.private_message_title);
        this.f1057h0.setText(R.string.empty_private_message);
        R2.b.w(true);
        com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "messages").E(o.getAccountObject().getId()).E("chatData").q("lastMessageTimeInMilli").p(15).d(new i((Object) this, 12));
        RelativeLayout relativeLayout = this.f1058i0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 7));
        return this.f1054e0;
    }

    public final void V() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f1059j0;
            if (i2 >= arrayList.size()) {
                com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "notificationObject", "hasUnReadPrivateMessage").I(Boolean.FALSE);
                return;
            } else if (((l) arrayList.get(i2)).isRead()) {
                i2++;
            } else {
                return;
            }
        }
    }
}
