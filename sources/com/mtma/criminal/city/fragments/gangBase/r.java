package com.mtma.criminal.city.fragments.gangBase;

import R2.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i3.C0592h;
import j4.H;
import java.util.ArrayList;

public final class r extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7252d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f7253e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f7254f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7255g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f7256h0;

    /* renamed from: i0  reason: collision with root package name */
    public ImageView f7257i0;

    /* renamed from: j0  reason: collision with root package name */
    public ListView f7258j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f7259k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f7260l0;

    /* renamed from: m0  reason: collision with root package name */
    public H f7261m0;

    /* renamed from: n0  reason: collision with root package name */
    public ArrayList f7262n0;

    public r(Context context, int i2) {
        this.f7252d0 = context;
        this.f7253e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic_with_button, viewGroup, false);
        this.f7254f0 = inflate;
        this.f7255g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f7256h0 = (TextView) this.f7254f0.findViewById(R.id.fragment_basic_second_button_text);
        this.f7257i0 = (ImageView) this.f7254f0.findViewById(R.id.fragment_basic_second_button_image);
        this.f7258j0 = (ListView) this.f7254f0.findViewById(R.id.fragment_basic_list_view);
        this.f7259k0 = (RelativeLayout) this.f7254f0.findViewById(R.id.fragment_basic_second_button);
        this.f7260l0 = (RelativeLayout) this.f7254f0.findViewById(R.id.fragment_basic_back_button);
        b.w(true);
        a.o(MyApplication.f7090a, R.string.gang_militia_title, this.f7255g0);
        this.f7258j0.setVisibility(4);
        C0592h.b().e().E(b.Z()).E("gangs").E("gangMilitia").E(o.getGangObject().getId()).d(new p(this));
        RelativeLayout relativeLayout = this.f7259k0;
        relativeLayout.setOnClickListener(new q(this, relativeLayout, 0));
        this.f7259k0.setVisibility(0);
        this.f7257i0.setImageResource(R.drawable.button_help);
        this.f7256h0.setText(R.string.button_help);
        RelativeLayout relativeLayout2 = this.f7260l0;
        relativeLayout2.setOnClickListener(new q(this, relativeLayout2, 1));
        return this.f7254f0;
    }
}
