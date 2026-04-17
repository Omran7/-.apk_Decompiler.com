package M4;

import A.h;
import B4.f;
import R2.b;
import U3.c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0592h;
import java.io.Serializable;
import java.util.ArrayList;

public final class e extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f1858d0;

    /* renamed from: e0  reason: collision with root package name */
    public final Context f1859e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1860f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f1861g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f1862h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f1863i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f1864j0;

    /* renamed from: k0  reason: collision with root package name */
    public Object f1865k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Serializable f1866l0;

    /* renamed from: m0  reason: collision with root package name */
    public Object f1867m0;

    /* renamed from: n0  reason: collision with root package name */
    public Object f1868n0;

    public e(Context context) {
        this.f1858d0 = 0;
        this.f1866l0 = new ArrayList();
        this.f1859e0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f1858d0) {
            case 0:
                View inflate = layoutInflater.inflate(R.layout.fragment_contacts, viewGroup, false);
                this.f1861g0 = inflate;
                this.f1862h0 = (TextView) inflate.findViewById(R.id.fragment_contacts_requests_button);
                this.f1863i0 = (TextView) this.f1861g0.findViewById(R.id.fragment_contacts_friends_button);
                this.f1865k0 = (TextView) this.f1861g0.findViewById(R.id.fragment_contacts_blocking_button);
                this.f1864j0 = (RelativeLayout) this.f1861g0.findViewById(R.id.fragment_contacts_back_button);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, K1.e.m(32.0d));
                this.f1867m0 = layoutParams;
                layoutParams.weight = 1.0f;
                layoutParams.gravity = 80;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, K1.e.m(36.0d));
                this.f1868n0 = layoutParams2;
                layoutParams2.weight = 1.0f;
                ArrayList arrayList = (ArrayList) this.f1866l0;
                arrayList.add((TextView) this.f1865k0);
                arrayList.add(this.f1863i0);
                arrayList.add(this.f1862h0);
                if (o.getNotificationObject().isHasUnSeenContactRequest()) {
                    a.d(a.c(C0592h.b().e(), "players"), "notificationObject", "hasUnSeenContactRequest").I(Boolean.FALSE);
                }
                this.f1860f0 = arrayList.indexOf(this.f1862h0);
                W();
                V(new c(this.f1859e0, 0), false);
                this.f1862h0.setOnClickListener(new d(this, 0));
                this.f1863i0.setOnClickListener(new d(this, 1));
                ((TextView) this.f1865k0).setOnClickListener(new d(this, 2));
                RelativeLayout relativeLayout = this.f1864j0;
                relativeLayout.setOnClickListener(new d(this, (View) relativeLayout));
                return this.f1861g0;
            default:
                View inflate2 = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
                this.f1861g0 = inflate2;
                this.f1862h0 = (TextView) inflate2.findViewById(R.id.fragment_basic_title);
                this.f1863i0 = (TextView) this.f1861g0.findViewById(R.id.fragment_basic_empty_view);
                this.f1868n0 = (ListView) this.f1861g0.findViewById(R.id.fragment_basic_list_view);
                this.f1864j0 = (RelativeLayout) this.f1861g0.findViewById(R.id.fragment_basic_back_button);
                this.f1862h0.setText(R.string.search_results_title);
                this.f1863i0.setText(R.string.empty_search_results);
                b.w(true);
                C0592h.b().e().E(b.Z()).E((String) this.f1865k0).q((String) this.f1866l0).x((String) this.f1867m0, (String) null).o(this.f1860f0).d(new c((Object) this, 22));
                RelativeLayout relativeLayout2 = this.f1864j0;
                relativeLayout2.setOnClickListener(new f(this, relativeLayout2, 15));
                return this.f1861g0;
        }
    }

    public void V(c cVar, boolean z3) {
        I m6 = m();
        m6.getClass();
        C0269a aVar = new C0269a(m6);
        aVar.i(R.id.fragment_contacts_frame_layout, cVar);
        aVar.e(false);
        if (z3) {
            b.N0();
        }
    }

    public void W() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f1866l0;
            if (i2 < arrayList.size()) {
                int i5 = this.f1860f0;
                Context context = this.f1859e0;
                if (i2 == i5) {
                    ((View) arrayList.get(i2)).setBackground(h.getDrawable(context, R.drawable.store_button_enabled));
                    ((View) arrayList.get(i2)).setLayoutParams((LinearLayout.LayoutParams) this.f1868n0);
                } else {
                    ((View) arrayList.get(i2)).setBackground(h.getDrawable(context, R.drawable.store_button_disabled));
                    ((View) arrayList.get(i2)).setLayoutParams((LinearLayout.LayoutParams) this.f1867m0);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public e(Context context, String str, String str2, String str3, int i2) {
        this.f1858d0 = 1;
        this.f1859e0 = context;
        this.f1865k0 = str;
        this.f1866l0 = str2;
        this.f1867m0 = str3;
        this.f1860f0 = i2;
    }
}
