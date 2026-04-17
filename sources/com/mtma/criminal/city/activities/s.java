package com.mtma.criminal.city.activities;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;
import e5.C0509f;

public final class s extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7079b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(StartActivity startActivity, RelativeLayout relativeLayout, int i2) {
        super(relativeLayout);
        this.f7078a = i2;
        this.f7079b = startActivity;
    }

    public final void onClick(View view) {
        switch (this.f7078a) {
            case 0:
                super.onClick(view);
                StartActivity.f7027d0.dismiss();
                StartActivity.f7027d0 = null;
                this.f7079b.finish();
                return;
            default:
                StartActivity startActivity = this.f7079b;
                super.onClick(view);
                StartActivity.f7027d0.dismiss();
                StartActivity.f7027d0 = null;
                try {
                    Intent intent = new Intent("android.settings.DATE_SETTINGS");
                    intent.addFlags(268435456);
                    startActivity.f7028I.startActivity(intent);
                    return;
                } catch (Exception unused) {
                    startActivity.finish();
                    return;
                }
        }
    }
}
