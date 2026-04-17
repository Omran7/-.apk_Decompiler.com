package com.mtma.criminal.city.fragments.gangBase;

import B4.a;
import B4.b;
import B4.f;
import P4.m;
import T1.A;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;

public final class s extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7263d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f7264e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f7265f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f7266g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f7267h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f7268i0;

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f7269j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public float f7270k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7271l0;

    public s(Context context) {
        this.f7263d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f7264e0 = inflate;
        this.f7265f0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f7266g0 = (ListView) this.f7264e0.findViewById(R.id.fragment_basic_list_view);
        this.f7267h0 = (TextView) this.f7264e0.findViewById(R.id.fragment_basic_empty_view);
        this.f7268i0 = (RelativeLayout) this.f7264e0.findViewById(R.id.fragment_basic_back_button);
        this.f7266g0.setOnItemClickListener(new m(this, 1));
        this.f7266g0.setOnScrollListener(new a(this, 7));
        this.f7266g0.setOnTouchListener(new b(this, 3));
        this.f7265f0.setText(R.string.notification_title);
        this.f7267h0.setText(R.string.empty_gang_notifications);
        R2.b.w(true);
        C0592h.d().e().E(R2.b.a0()).E("gangs").E("gangNotifications").E(o.getGangObject().getId()).q("unixTimeInMilli").p(15).d(new A((Object) this, 26));
        RelativeLayout relativeLayout = this.f7268i0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 22));
        return this.f7264e0;
    }
}
