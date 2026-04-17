package com.mtma.criminal.city.fragments.gangBase;

import R2.b;
import T1.A;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.d;
import e5.C0505b;
import e5.C0509f;

public final class t extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7272a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f7273b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ v f7274c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f7272a = i2;
        this.f7274c = vVar;
        this.f7273b = bVar;
    }

    public final void onClick(View view) {
        switch (this.f7272a) {
            case 0:
                super.onClick(view);
                this.f7273b.dismiss();
                this.f7274c.f7284H0 = false;
                return;
            default:
                super.onClick(view);
                v vVar = this.f7274c;
                vVar.getClass();
                b.w(true);
                d.V0(vVar.f7286e0, new A((Object) vVar, 27));
                this.f7273b.dismiss();
                vVar.f7284H0 = false;
                return;
        }
    }
}
