package com.mtma.criminal.city.fragments.gangBase;

import F3.e;
import R2.b;
import W0.u;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0281m;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.views.SquareView;
import d5.o;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.c  reason: case insensitive filesystem */
public final class C0423c extends C0286s {

    /* renamed from: d0  reason: collision with root package name */
    public final Context f7162d0;

    /* renamed from: e0  reason: collision with root package name */
    public View f7163e0;

    /* renamed from: f0  reason: collision with root package name */
    public TextView f7164f0;

    /* renamed from: g0  reason: collision with root package name */
    public TextView f7165g0;

    /* renamed from: h0  reason: collision with root package name */
    public TextView f7166h0;

    /* renamed from: i0  reason: collision with root package name */
    public TextView f7167i0;

    /* renamed from: j0  reason: collision with root package name */
    public SquareView f7168j0;

    /* renamed from: k0  reason: collision with root package name */
    public RelativeLayout f7169k0;

    /* renamed from: l0  reason: collision with root package name */
    public RelativeLayout f7170l0;

    /* renamed from: m0  reason: collision with root package name */
    public Bitmap f7171m0;

    /* renamed from: n0  reason: collision with root package name */
    public final C0281m f7172n0 = ((C0281m) O(new u(0), new e((Object) this, 9)));

    public C0423c(Context context) {
        this.f7162d0 = context;
    }

    public static void V(C0423c cVar) {
        cVar.getClass();
        C0429i iVar = new C0429i(cVar.f7162d0);
        C0269a aVar = new C0269a(cVar.p());
        aVar.i(R.id.activity_main_body_frame_layout, iVar);
        aVar.e(false);
        b.N0();
    }

    public final View C(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_create_gang, viewGroup, false);
        this.f7163e0 = inflate;
        this.f7164f0 = (TextView) inflate.findViewById(R.id.fragment_create_gang_requirement_level_value);
        this.f7165g0 = (TextView) this.f7163e0.findViewById(R.id.fragment_create_gang_requirement_cash_value);
        this.f7166h0 = (TextView) this.f7163e0.findViewById(R.id.fragment_create_gang_name_field);
        this.f7167i0 = (TextView) this.f7163e0.findViewById(R.id.fragment_create_gang_tag_field);
        this.f7168j0 = (SquareView) this.f7163e0.findViewById(R.id.fragment_create_gang_image);
        this.f7169k0 = (RelativeLayout) this.f7163e0.findViewById(R.id.fragment_create_gang_create_button);
        this.f7170l0 = (RelativeLayout) this.f7163e0.findViewById(R.id.fragment_create_gang_back_button);
        this.f7164f0.setText(String.valueOf(25));
        this.f7165g0.setText(U.a(10000000));
        int level = o.getMainStatesObject().getLevel();
        Context context = this.f7162d0;
        if (level < 25) {
            a.i(context, context.getResources(), R.color.red_rust, this.f7164f0);
        }
        if (o.getMoneyObject().getCash() < 10000000) {
            a.i(context, context.getResources(), R.color.red_rust, this.f7165g0);
        }
        SquareView squareView = this.f7168j0;
        squareView.setOnClickListener(new C0422b(this, squareView, 0));
        RelativeLayout relativeLayout = this.f7169k0;
        relativeLayout.setOnClickListener(new C0422b(this, relativeLayout, 1));
        RelativeLayout relativeLayout2 = this.f7170l0;
        relativeLayout2.setOnClickListener(new C0422b(this, relativeLayout2, 2));
        return this.f7163e0;
    }
}
