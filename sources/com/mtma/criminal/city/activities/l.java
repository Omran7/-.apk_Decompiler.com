package com.mtma.criminal.city.activities;

import android.view.View;
import android.widget.RelativeLayout;
import e5.C0505b;
import e5.C0509f;

public final class l extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7068a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f7069b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7070c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(RelativeLayout relativeLayout, C0505b bVar, MainActivity mainActivity, int i2) {
        super(relativeLayout);
        this.f7068a = i2;
        this.f7069b = bVar;
        this.f7070c = mainActivity;
    }

    public final void onClick(View view) {
        switch (this.f7068a) {
            case 0:
                super.onClick(view);
                this.f7069b.dismiss();
                this.f7070c.finish();
                return;
            case 1:
                super.onClick(view);
                this.f7069b.dismiss();
                this.f7070c.finish();
                return;
            default:
                super.onClick(view);
                this.f7069b.dismiss();
                this.f7070c.finish();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(MainActivity mainActivity, RelativeLayout relativeLayout, C0505b bVar) {
        super(relativeLayout);
        this.f7068a = 0;
        this.f7070c = mainActivity;
        this.f7069b = bVar;
    }
}
