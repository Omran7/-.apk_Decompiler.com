package com.mtma.criminal.city.fragments.gangBase;

import B4.f;
import G4.a;
import R2.b;
import Y4.C0246c;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.mtma.criminal.city.R;
import d5.o;
import j4.C0640p;
import java.util.ArrayList;

public final class D extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7109d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f7110e0;

    /* renamed from: f0  reason: collision with root package name */
    public final int f7111f0;

    /* renamed from: g0  reason: collision with root package name */
    public long f7112g0;

    /* renamed from: h0  reason: collision with root package name */
    public long f7113h0;

    /* renamed from: i0  reason: collision with root package name */
    public View f7114i0;

    /* renamed from: j0  reason: collision with root package name */
    public TextView f7115j0;

    /* renamed from: k0  reason: collision with root package name */
    public ListView f7116k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f7117l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f7118m0;

    /* renamed from: n0  reason: collision with root package name */
    public final ArrayList f7119n0 = new ArrayList();

    /* renamed from: o0  reason: collision with root package name */
    public boolean f7120o0 = false;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f7121p0 = false;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f7122q0 = false;

    public D(Context context) {
        this.f7109d0 = context;
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_basic, viewGroup, false);
        this.f7114i0 = inflate;
        this.f7115j0 = (TextView) inflate.findViewById(R.id.fragment_basic_title);
        this.f7116k0 = (ListView) this.f7114i0.findViewById(R.id.fragment_basic_list_view);
        this.f7117l0 = (RelativeLayout) this.f7114i0.findViewById(R.id.fragment_basic_back_button);
        this.f7115j0.setText(R.string.gang_management_title);
        this.f7118m0 = o.getGangObject().getPosition();
        ArrayList arrayList = new ArrayList();
        int position = o.getGangObject().getPosition();
        ArrayList arrayList2 = this.f7119n0;
        if (position <= 3) {
            arrayList.add(new C0246c(R.string.gang_management_join_requests_name, R.string.gang_management_join_requests_description, R.drawable.item_settings_icon));
            arrayList2.add(0);
        }
        if (o.getGangObject().getPosition() <= 2) {
            arrayList.add(new C0246c(R.string.gang_management_member_positions_name, R.string.gang_management_member_positions_description, R.drawable.item_settings_icon));
            arrayList2.add(1);
        }
        if (o.getGangObject().getPosition() <= 1) {
            arrayList.add(new C0246c(R.string.gang_management_instructions_name, R.string.gang_management_instructions_description, R.drawable.item_settings_icon));
            arrayList2.add(2);
        }
        if (o.getGangObject().getPosition() <= 0) {
            arrayList.add(new C0246c(R.string.gang_management_improvement_name, R.string.gang_management_improvement_description, R.drawable.item_settings_icon));
            arrayList2.add(3);
            arrayList.add(new C0246c(R.string.gang_management_transfer_boss_position_name, R.string.gang_management_transfer_boss_position_description, R.drawable.item_settings_icon));
            arrayList2.add(4);
            arrayList.add(new C0246c(R.string.gang_management_dissolution_gang_name, R.string.gang_management_dissolution_gang_description, R.drawable.item_settings_icon));
            arrayList2.add(5);
        }
        this.f7116k0.setAdapter(new C0640p(this.f7109d0, arrayList, 10, 0, (byte) 0));
        this.f7116k0.setOnItemClickListener(new a(this, 1));
        RelativeLayout relativeLayout = this.f7117l0;
        relativeLayout.setOnClickListener(new f(this, relativeLayout, 24));
        return this.f7114i0;
    }

    public final void V(C0286s sVar) {
        C0269a aVar = new C0269a(p());
        aVar.f(R.id.activity_main_body_frame_layout, sVar, (String) null, 1);
        aVar.c();
        aVar.e(false);
        b.N0();
    }

    public D(Context context, int i2, int i5, long j6, long j7) {
        this.f7109d0 = context;
        this.f7111f0 = i5;
        this.f7110e0 = i2;
        this.f7112g0 = j6;
        this.f7113h0 = j7;
    }
}
