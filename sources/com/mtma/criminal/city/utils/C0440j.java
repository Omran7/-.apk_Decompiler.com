package com.mtma.criminal.city.utils;

import I1.b;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import d5.o;
import e5.C0505b;
import e5.C0509f;

/* renamed from: com.mtma.criminal.city.utils.j  reason: case insensitive filesystem */
public final class C0440j extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7425a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f7426b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f7427c;
    public final /* synthetic */ int d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0440j(RelativeLayout relativeLayout, int i2, Context context, C0505b bVar) {
        super(relativeLayout);
        this.d = i2;
        this.f7427c = context;
        this.f7426b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f7425a) {
            case 0:
                super.onClick(view);
                Context context = this.f7427c;
                int i2 = this.d;
                if (i2 == 2001) {
                    if (o.getMoneyObject().getGold() < 50) {
                        c.y0(context);
                    } else {
                        b.N0(context, "gold", 50);
                    }
                } else if (i2 == 2002) {
                    if (o.getMoneyObject().getGold() < 50) {
                        c.y0(context);
                    } else {
                        b.K0(context, "gold", 50);
                    }
                }
                this.f7426b.dismiss();
                c.h = false;
                return;
            default:
                super.onClick(view);
                this.f7426b.dismiss();
                b.f1152f = false;
                b.G0(this.f7427c, this.d);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0440j(RelativeLayout relativeLayout, C0505b bVar, Context context, int i2) {
        super(relativeLayout);
        this.f7426b = bVar;
        this.f7427c = context;
        this.d = i2;
    }
}
