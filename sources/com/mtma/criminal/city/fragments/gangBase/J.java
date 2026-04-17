package com.mtma.criminal.city.fragments.gangBase;

import B4.a;
import B4.b;
import B4.f;
import S3.t;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i3.C0592h;
import j4.C0615b0;
import java.util.ArrayList;

public final class J extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7144d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f7145e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f7146f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7147g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f7148h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f7149i0;

    /* renamed from: j0  reason: collision with root package name */
    public C0615b0 f7150j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList f7151k0 = new ArrayList();

    /* renamed from: l0  reason: collision with root package name */
    public Long f7152l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f7153m0 = false;

    /* renamed from: n0  reason: collision with root package name */
    public int f7154n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f7155o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f7156p0;

    public J(Context context) {
        this.f7144d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f7145e0 = inflate;
        this.f7146f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f7148h0 = (ListView) this.f7145e0.findViewById(R.id.fragment_basic_list_view);
        this.f7147g0 = (TextView) this.f7145e0.findViewById(R.id.fragment_basic_empty_view);
        this.f7149i0 = (RelativeLayout) this.f7145e0.findViewById(R.id.fragment_basic_back_button);
        this.f7148h0.setOnScrollListener(new a(this, 9));
        this.f7148h0.setOnTouchListener(new b(this, 4));
        this.f7146f0.setText(R.string.gang_join_request_title);
        this.f7147g0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.empty_view_gang_join_requests));
        R2.b.w(true);
        C0592h.b().e().E(R2.b.Z()).E("gangs").E("gangRequests").E(o.getGangObject().getId()).s().p(15).d(new t(this, 24));
        RelativeLayout relativeLayout = this.f7149i0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 27));
        return this.f7145e0;
    }
}
