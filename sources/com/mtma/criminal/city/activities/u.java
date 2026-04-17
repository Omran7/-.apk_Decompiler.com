package com.mtma.criminal.city.activities;

import K1.e;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import e5.C0505b;
import e5.C0509f;

public final class u extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7082a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0505b f7083b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7084c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(RelativeLayout relativeLayout, C0505b bVar, StartActivity startActivity, int i2) {
        super(relativeLayout);
        this.f7082a = i2;
        this.f7083b = bVar;
        this.f7084c = startActivity;
    }

    public final void onClick(View view) {
        switch (this.f7082a) {
            case 0:
                super.onClick(view);
                this.f7083b.dismiss();
                StartActivity.f7025b0 = false;
                StartActivity startActivity = this.f7084c;
                startActivity.f7035P = false;
                startActivity.f7036Q = false;
                startActivity.f7037R = false;
                startActivity.f7038S = false;
                startActivity.f7042W = 0;
                startActivity.f7043X = true;
                startActivity.t();
                startActivity.f7030K.setText(R.string.check_updates);
                startActivity.p();
                return;
            case 1:
                super.onClick(view);
                this.f7083b.dismiss();
                StartActivity.f7025b0 = false;
                this.f7084c.finish();
                return;
            case 2:
                super.onClick(view);
                this.f7083b.dismiss();
                StartActivity.f7026c0 = false;
                this.f7084c.finish();
                return;
            case 3:
                super.onClick(view);
                C0505b bVar = this.f7083b;
                bVar.dismiss();
                c.f5740k = false;
                StartActivity startActivity2 = this.f7084c;
                startActivity2.finish();
                String F = e.F();
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + F));
                    intent.setFlags(268435456);
                    startActivity2.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                    startActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + F)));
                }
                bVar.dismiss();
                c.f5738i = false;
                startActivity2.finish();
                return;
            case 4:
                super.onClick(view);
                this.f7083b.dismiss();
                this.f7084c.finish();
                c.f5741l = false;
                return;
            default:
                super.onClick(view);
                this.f7083b.dismiss();
                this.f7084c.finish();
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(StartActivity startActivity, RelativeLayout relativeLayout, C0505b bVar, int i2) {
        super(relativeLayout);
        this.f7082a = i2;
        this.f7084c = startActivity;
        this.f7083b = bVar;
    }
}
