package com.mtma.criminal.city.utils;

import I1.b;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import d5.o;
import e5.C0505b;
import e5.C0509f;

public final class e0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0505b f7402a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f7403b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7404c;
    public final /* synthetic */ Context d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(RelativeLayout relativeLayout, C0505b bVar, String str, long j6, Context context) {
        super(relativeLayout);
        this.f7402a = bVar;
        this.f7403b = str;
        this.f7404c = j6;
        this.d = context;
    }

    public final void onClick(View view) {
        super.onClick(view);
        this.f7402a.dismiss();
        b.f1151e = false;
        R2.b.w(true);
        K k6 = new K(this, 7);
        U.g(o.getAccountObject().getId(), this.f7403b, -this.f7404c, k6);
    }
}
