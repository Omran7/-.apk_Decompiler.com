package com.mtma.criminal.city.fragments.gangBase;

import B4.f;
import R2.b;
import T1.A;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;

public final class H extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7136d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f7137e0;

    /* renamed from: f0  reason: collision with root package name */
    public View f7138f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7139g0;

    /* renamed from: h0  reason: collision with root package name */
    public ListView f7140h0;

    /* renamed from: i0  reason: collision with root package name */
    public RelativeLayout f7141i0;

    public H(Context context, int i2) {
        this.f7136d0 = context;
        this.f7137e0 = i2;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f7138f0 = inflate;
        this.f7139g0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f7140h0 = (ListView) this.f7138f0.findViewById(R.id.fragment_basic_list_view);
        this.f7141i0 = (RelativeLayout) this.f7138f0.findViewById(R.id.fragment_basic_back_button);
        int i2 = this.f7137e0;
        if (i2 == 0) {
            this.f7139g0.setText(R.string.gang_positions_title);
        } else if (i2 == 1) {
            this.f7139g0.setText(R.string.gang_change_boss_position_title);
        }
        a.e(true).E(b.Z()).E("gangs").E("gangsData").E(o.getGangObject().getId()).E("membersWithPositions").d(new A((Object) this, 29));
        RelativeLayout relativeLayout = this.f7141i0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 26));
        return this.f7138f0;
    }
}
