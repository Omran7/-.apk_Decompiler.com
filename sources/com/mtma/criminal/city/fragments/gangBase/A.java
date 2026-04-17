package com.mtma.criminal.city.fragments.gangBase;

import B4.a;
import G4.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import i3.C0592h;
import j4.C0626h;
import java.util.ArrayList;

public final class A extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7093d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f7094e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f7095f0;

    /* renamed from: g0  reason: collision with root package name */
    public ListView f7096g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f7097h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f7098i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public C0626h f7099j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f7100k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f7101l0 = false;

    /* renamed from: m0  reason: collision with root package name */
    public int f7102m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f7103n0;

    /* renamed from: o0  reason: collision with root package name */
    public float f7104o0;

    public A(Context context, int i2) {
        this.f7093d0 = context;
        this.f7094e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_no_buttons, viewGroup, false);
        this.f7095f0 = inflate;
        this.f7096g0 = (ListView) inflate.findViewById(R.id.fragment_basic_list_view);
        this.f7097h0 = (TextView) this.f7095f0.findViewById(R.id.fragment_basic_empty_view);
        this.f7096g0.setOnScrollListener(new a(this, 8));
        this.f7096g0.setOnTouchListener(new b(this, 4));
        this.f7098i0.clear();
        int i2 = this.f7094e0;
        if (i2 == 0) {
            com.google.android.gms.internal.measurement.a.e(true).E(R2.b.Z()).E("gangs").E("gangsData").r().p(8).d(new T1.A((Object) this, 28));
        } else if (i2 == 1) {
            R2.b.w(true);
            com.google.android.gms.internal.measurement.a.x(C0592h.d().e(), "rank").E(android.support.v4.media.session.a.L(3)).E(android.support.v4.media.session.a.M(3, 0)).s().p(8).d(new z(this, 1));
        }
        return this.f7095f0;
    }
}
