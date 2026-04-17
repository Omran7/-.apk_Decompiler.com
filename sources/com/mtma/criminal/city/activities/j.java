package com.mtma.criminal.city.activities;

import F4.b;
import P4.i;
import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.mtma.criminal.city.R;
import e5.C0509f;

public final class j extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7063a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7064b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(MainActivity mainActivity, View view, int i2) {
        super(view);
        this.f7063a = i2;
        this.f7064b = mainActivity;
    }

    public final void onClick(View view) {
        switch (this.f7063a) {
            case 0:
                super.onClick(view);
                MainActivity mainActivity = this.f7064b;
                mainActivity.r(new i((Context) mainActivity.f6979I, 2));
                return;
            case 1:
                super.onClick(view);
                MainActivity mainActivity2 = this.f7064b;
                if (mainActivity2.f6991R.getVisibility() == 8) {
                    Animation loadAnimation = AnimationUtils.loadAnimation(mainActivity2.f6979I, R.anim.herb_rotaion);
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(mainActivity2.f6979I, R.anim.from_end_to_position);
                    loadAnimation2.setDuration(500);
                    mainActivity2.f6988O.clearAnimation();
                    mainActivity2.f6988O.startAnimation(loadAnimation);
                    mainActivity2.f6991R.setVisibility(0);
                    mainActivity2.f6991R.clearAnimation();
                    mainActivity2.f6991R.setAnimation(loadAnimation2);
                    if (!mainActivity2.f6980I0) {
                        mainActivity2.f6980I0 = true;
                        mainActivity2.y();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                super.onClick(view);
                MainActivity mainActivity3 = this.f7064b;
                mainActivity3.r(new b(mainActivity3.f6979I));
                return;
            case 3:
                super.onClick(view);
                MainActivity mainActivity4 = this.f7064b;
                mainActivity4.r(new J4.b(mainActivity4.f6979I));
                return;
            default:
                super.onClick(view);
                MainActivity mainActivity5 = this.f7064b;
                mainActivity5.r(new i(mainActivity5.f6979I));
                return;
        }
    }

    public j(MainActivity mainActivity) {
        this.f7063a = 1;
        this.f7064b = mainActivity;
    }
}
