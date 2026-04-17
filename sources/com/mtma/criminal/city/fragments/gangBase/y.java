package com.mtma.criminal.city.fragments.gangBase;

import A.h;
import K1.e;
import R2.b;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.mtma.criminal.city.R;
import java.util.ArrayList;

public final class y extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7324d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f7325e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f7326f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7327g0;

    /* renamed from: h0  reason: collision with root package name */
    public RelativeLayout f7328h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f7329i0;

    /* renamed from: j0  reason: collision with root package name */
    public RelativeLayout f7330j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f7331k0;

    /* renamed from: l0  reason: collision with root package name */
    public final ArrayList f7332l0 = new ArrayList();

    /* renamed from: m0  reason: collision with root package name */
    public LinearLayout.LayoutParams f7333m0;

    /* renamed from: n0  reason: collision with root package name */
    public LinearLayout.LayoutParams f7334n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f7335o0 = false;

    public y(Context context) {
        this.f7324d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_gangs, viewGroup, false);
        this.f7325e0 = inflate;
        this.f7326f0 = (TextView) inflate.findViewById(R.id.fragment_gangs_newest_button);
        this.f7327g0 = (TextView) this.f7325e0.findViewById(R.id.fragment_gangs_strongest_button);
        this.f7328h0 = (RelativeLayout) this.f7325e0.findViewById(R.id.fragment_gangs_create_button);
        this.f7329i0 = (RelativeLayout) this.f7325e0.findViewById(R.id.fragment_gangs_search_button);
        this.f7330j0 = (RelativeLayout) this.f7325e0.findViewById(R.id.fragment_gangs_back_button);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, e.m(32.0d));
        this.f7333m0 = layoutParams;
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 80;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, e.m(36.0d));
        this.f7334n0 = layoutParams2;
        layoutParams2.weight = 1.0f;
        ArrayList arrayList = this.f7332l0;
        arrayList.add(this.f7326f0);
        arrayList.add(this.f7327g0);
        this.f7331k0 = arrayList.indexOf(this.f7326f0);
        W();
        V(new A(this.f7324d0, 0), false);
        this.f7326f0.setOnClickListener(new x(this, 0));
        this.f7327g0.setOnClickListener(new x(this, 1));
        RelativeLayout relativeLayout = this.f7328h0;
        relativeLayout.setOnClickListener(new x(this, relativeLayout, 2));
        RelativeLayout relativeLayout2 = this.f7329i0;
        relativeLayout2.setOnClickListener(new x(this, relativeLayout2, 3));
        RelativeLayout relativeLayout3 = this.f7330j0;
        relativeLayout3.setOnClickListener(new x(this, relativeLayout3, 4));
        return this.f7325e0;
    }

    public final void V(A a6, boolean z3) {
        I m6 = m();
        m6.getClass();
        C0269a aVar = new C0269a(m6);
        aVar.i(R.id.fragment_gangs_frame_layout, a6);
        aVar.e(false);
        if (z3) {
            b.N0();
        }
    }

    public final void W() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.f7332l0;
            if (i2 < arrayList.size()) {
                int i5 = this.f7331k0;
                Context context = this.f7324d0;
                if (i2 == i5) {
                    ((View) arrayList.get(i2)).setBackground(h.getDrawable(context, R.drawable.store_button_enabled));
                    ((View) arrayList.get(i2)).setLayoutParams(this.f7334n0);
                } else {
                    ((View) arrayList.get(i2)).setBackground(h.getDrawable(context, R.drawable.store_button_disabled));
                    ((View) arrayList.get(i2)).setLayoutParams(this.f7333m0);
                }
                i2++;
            } else {
                return;
            }
        }
    }
}
