package com.mtma.criminal.city.fragments.gangBase;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.C0269a;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;

/* renamed from: com.mtma.criminal.city.fragments.gangBase.j  reason: case insensitive filesystem */
public final class C0430j extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7216a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f7217b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0430j(o oVar, View view, int i2) {
        super(view);
        this.f7216a = i2;
        this.f7217b = oVar;
    }

    public final void onClick(View view) {
        switch (this.f7216a) {
            case 0:
                super.onClick(view);
                o oVar = this.f7217b;
                String replace = oVar.f7235j0.getText().toString().trim().replace(",", "");
                int parseInt = Integer.parseInt(replace);
                boolean isEmpty = replace.isEmpty();
                Context context = oVar.f7229d0;
                if (isEmpty || parseInt == 0) {
                    a.k(MyApplication.f7090a, R.string.toast_select_cash_value_first, context);
                    return;
                } else if (replace.length() > 9) {
                    a.k(MyApplication.f7090a, R.string.toast_number_too_long, context);
                    return;
                } else {
                    int parseInt2 = Integer.parseInt(replace);
                    if (parseInt2 > o.getMoneyObject().getGold()) {
                        a.k(MyApplication.f7090a, R.string.toast_not_enough_gold, context);
                        return;
                    } else {
                        o.V(oVar, 1, (long) parseInt2);
                        return;
                    }
                }
            case 1:
                super.onClick(view);
                o oVar2 = this.f7217b;
                String replace2 = oVar2.f7236k0.getText().toString().trim().replace(",", "");
                long parseLong = Long.parseLong(replace2);
                boolean isEmpty2 = replace2.isEmpty();
                Context context2 = oVar2.f7229d0;
                if (isEmpty2 || parseLong == 0) {
                    a.k(MyApplication.f7090a, R.string.toast_select_cash_value_first, context2);
                    return;
                } else if (replace2.length() > 17) {
                    a.k(MyApplication.f7090a, R.string.toast_number_too_long, context2);
                    return;
                } else {
                    long parseLong2 = Long.parseLong(replace2);
                    if (parseLong2 > oVar2.f7246v0.longValue()) {
                        a.k(MyApplication.f7090a, R.string.toast_gang_not_has_enough_cash, context2);
                        return;
                    } else if (o.getGangObject().getPosition() != 0) {
                        a.n(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_take_that_action, context2, (String) null);
                        return;
                    } else {
                        o.V(oVar2, 2, parseLong2);
                        return;
                    }
                }
            case 2:
                super.onClick(view);
                o oVar3 = this.f7217b;
                C0269a aVar = new C0269a(oVar3.p());
                aVar.h(oVar3);
                aVar.e(false);
                return;
            default:
                super.onClick(view);
                o oVar4 = this.f7217b;
                String replace3 = oVar4.f7234i0.getText().toString().trim().replace(",", "");
                long parseLong3 = Long.parseLong(replace3);
                boolean isEmpty3 = replace3.isEmpty();
                Context context3 = oVar4.f7229d0;
                if (isEmpty3 || parseLong3 == 0) {
                    a.k(MyApplication.f7090a, R.string.toast_select_cash_value_first, context3);
                    return;
                } else if (replace3.length() > 17) {
                    a.k(MyApplication.f7090a, R.string.toast_number_too_long, context3);
                    return;
                } else {
                    long parseLong4 = Long.parseLong(replace3);
                    if (parseLong4 > o.getMoneyObject().getCash()) {
                        a.k(MyApplication.f7090a, R.string.toast_not_enough_cash, context3);
                        return;
                    } else {
                        o.V(oVar4, 0, parseLong4);
                        return;
                    }
                }
        }
    }
}
