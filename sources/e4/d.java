package E4;

import B4.a;
import B4.b;
import B4.f;
import Y4.C0246c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import i3.C0590f;
import i3.C0592h;
import j4.n0;
import java.util.ArrayList;

public final class d extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f630d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f631e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f632f0;

    /* renamed from: g0  reason: collision with root package name */
    public View f633g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f634h0;

    /* renamed from: i0  reason: collision with root package name */
    public ListView f635i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f636j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f637k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f638l0 = new ArrayList();

    /* renamed from: m0  reason: collision with root package name */
    public n0 f639m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f640n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f641o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    public int f642p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f643q0;

    /* renamed from: r0  reason: collision with root package name */
    public float f644r0;
    public C0590f s0;

    public d(int i2, int i5, Context context) {
        this.f630d0 = context;
        this.f631e0 = i2;
        this.f632f0 = i5;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f633g0 = inflate;
        this.f634h0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f635i0 = (ListView) this.f633g0.findViewById(R.id.fragment_basic_list_view);
        this.f636j0 = (TextView) this.f633g0.findViewById(R.id.fragment_basic_empty_view);
        this.f637k0 = (RelativeLayout) this.f633g0.findViewById(R.id.fragment_basic_back_button);
        this.f635i0.setOnScrollListener(new a(this, 1));
        this.f635i0.setOnTouchListener(new b(this, 1));
        TextView textView = this.f634h0;
        int i2 = this.f631e0;
        ArrayList y6 = android.support.v4.media.session.a.y(i2);
        int i5 = this.f632f0;
        textView.setText(((C0246c) y6.get(i5)).f4333a);
        this.f636j0.setText(R.string.empty_rank);
        R2.b.w(true);
        if (i2 == 0 || i2 == 1) {
            C0590f E6 = com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "rank").E(android.support.v4.media.session.a.L(i2)).E(android.support.v4.media.session.a.M(i2, i5)).E(android.support.v4.media.session.a.b0(i2, c.f5744o));
            this.s0 = E6;
            E6.s().p(15).d(new c(this, 0));
        } else {
            C0590f E7 = com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "rank").E(android.support.v4.media.session.a.L(i2)).E(android.support.v4.media.session.a.M(i2, i5));
            this.s0 = E7;
            E7.s().p(15).d(new c(this, 0));
        }
        RelativeLayout relativeLayout = this.f637k0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 3));
        return this.f633g0;
    }
}
