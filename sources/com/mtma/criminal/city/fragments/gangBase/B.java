package com.mtma.criminal.city.fragments.gangBase;

import K1.e;
import R2.b;
import Z4.n;
import Z4.p;
import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import f.C0518i;

public final /* synthetic */ class B {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f7105a;

    public /* synthetic */ B(D d) {
        this.f7105a = d;
    }

    public void a(n nVar) {
        MyApplication myApplication;
        int i2;
        D d = this.f7105a;
        d.getClass();
        boolean z3 = nVar.isAllProcessSuccess;
        Context context = d.f7109d0;
        if (z3) {
            d.f7110e0 = nVar.newLevel;
            d.f7112g0 = nVar.newGangAvailableRespect;
            d.f7113h0 = nVar.newGangCash;
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, context, R.raw.add_new_item);
            for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                if (sVar instanceof C0429i) {
                    C0429i iVar = (C0429i) sVar;
                    int i5 = d.f7110e0;
                    long j6 = d.f7112g0;
                    long j7 = d.f7113h0;
                    iVar.f7186C0.setLevel(i5);
                    iVar.f7186C0.setAvailableRespect(j6);
                    iVar.W(j7);
                    iVar.X(0, (String) null);
                    for (int childCount = iVar.f7202l0.getChildCount(); childCount < iVar.f7186C0.getLevel(); childCount++) {
                        ImageView imageView = new ImageView(iVar.f7194d0);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams.setMarginStart(e.m(2.0d));
                        layoutParams.setMarginEnd(e.m(2.0d));
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageResource(R.drawable.gang_level_star_icon);
                        iVar.f7202l0.addView(imageView);
                    }
                }
            }
            return;
        }
        b.w(false);
        if (nVar.isReachToMaximumLevel) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_reach_maximum_level;
        } else if (!nVar.isCurrentPlayerBoss) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_only_boss_can_take_that_action;
        } else if (!nVar.isMemberNumberEnough) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_has_not_members_number_improvement_requirements;
        } else if (!nVar.isGangRespectEnough) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_has_not_respect_improvement_requirements;
        } else if (!nVar.isGangCashEnough) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_not_has_enough_cash;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.n(myApplication, i2, context, (String) null);
    }

    public void b(p pVar) {
        MyApplication myApplication;
        int i2;
        D d = this.f7105a;
        d.getClass();
        boolean z3 = pVar.isAllProcessSuccess;
        Context context = d.f7109d0;
        if (z3) {
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, context, R.raw.add_new_item);
            for (C0286s sVar : ((C0518i) context).l().f5000c.v()) {
                if ((sVar instanceof C0429i) || (sVar instanceof D)) {
                    C0269a aVar = new C0269a(d.p());
                    aVar.h(sVar);
                    aVar.e(false);
                }
            }
            return;
        }
        b.w(false);
        if (!pVar.isCurrentPlayerBoss) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_only_gang_boss_can_dissolution_gang;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error;
        }
        a.n(myApplication, i2, context, (String) null);
    }

    public void c(boolean z3, boolean z4) {
        MyApplication myApplication;
        int i2;
        Context context = this.f7105a.f7109d0;
        if (z3) {
            b.w(false);
            a.l(MyApplication.f7090a, R.string.toast_successfully, context, R.raw.add_new_item);
            return;
        }
        b.w(false);
        if (!z4) {
            myApplication = MyApplication.f7090a;
            i2 = R.string.dialog_gang_position_not_allowed_to_take_action;
        } else {
            myApplication = MyApplication.f7090a;
            i2 = R.string.unknown_error_try_again;
        }
        a.n(myApplication, i2, context, (String) null);
    }
}
