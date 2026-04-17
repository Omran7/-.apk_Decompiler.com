package com.mtma.criminal.city.utils;

import R2.b;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import d5.o;
import e5.C0505b;
import e5.C0509f;
import f.C0518i;
import o3.d;
import q4.e;

/* renamed from: com.mtma.criminal.city.utils.i  reason: case insensitive filesystem */
public final class C0439i extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7422a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7423b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0505b f7424c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0439i(RelativeLayout relativeLayout, int i2, Context context, C0505b bVar) {
        super(relativeLayout);
        this.f7422a = i2;
        this.f7423b = context;
        this.f7424c = bVar;
    }

    public final void onClick(View view) {
        switch (this.f7422a) {
            case 0:
                super.onClick(view);
                Context context = this.f7423b;
                e eVar = new e(context, 0);
                I l6 = ((C0518i) context).l();
                C0269a b6 = d.b(l6, l6);
                b6.f(R.id.activity_main_body_frame_layout, eVar, (String) null, 1);
                a.j(b6, false);
                this.f7424c.dismiss();
                c.f5737f = false;
                return;
            case 1:
                super.onClick(view);
                Context context2 = this.f7423b;
                e eVar2 = new e(context2, 1);
                I l7 = ((C0518i) context2).l();
                C0269a b7 = d.b(l7, l7);
                b7.f(R.id.activity_main_body_frame_layout, eVar2, (String) null, 1);
                a.j(b7, false);
                this.f7424c.dismiss();
                c.g = false;
                return;
            default:
                super.onClick(view);
                this.f7424c.dismiss();
                K1.e.h = false;
                b.w(true);
                android.support.v4.media.session.a.B0(2020, 7, 0, -1, new K(this, 4), o.getAccountObject().getId(), android.support.v4.media.session.a.z(), false);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0439i(RelativeLayout relativeLayout, C0505b bVar, Context context) {
        super(relativeLayout);
        this.f7422a = 2;
        this.f7424c = bVar;
        this.f7423b = context;
    }
}
