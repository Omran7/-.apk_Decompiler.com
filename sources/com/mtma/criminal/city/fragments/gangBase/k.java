package com.mtma.criminal.city.fragments.gangBase;

import R2.b;
import Z4.l;
import android.content.Context;
import androidx.fragment.app.C0286s;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.C0453x;
import com.mtma.criminal.city.utils.U;
import java.util.Iterator;

public final class k implements C0453x {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7218a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o f7219b;

    public /* synthetic */ k(o oVar, int i2) {
        this.f7218a = i2;
        this.f7219b = oVar;
    }

    public final void a(l lVar) {
        switch (this.f7218a) {
            case 0:
                o oVar = this.f7219b;
                oVar.f7240o0.setProgress(0);
                oVar.f7234i0.setText(R.string.zero);
                oVar.f7237l0.setText("");
                oVar.f7237l0.clearFocus();
                boolean z3 = lVar.isAllProcessSuccess;
                Context context = oVar.f7229d0;
                if (z3) {
                    Long valueOf = Long.valueOf(lVar.gangMoneyAfterChange);
                    oVar.f7246v0 = valueOf;
                    oVar.f7232g0.setText(U.a(valueOf.longValue()));
                    Iterator it2 = oVar.p().f5000c.v().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            C0286s sVar = (C0286s) it2.next();
                            if (sVar instanceof C0429i) {
                                ((C0429i) sVar).W(oVar.f7246v0.longValue());
                            }
                        }
                    }
                    b.w(false);
                    b.M0(R.raw.money_get);
                    a.k(MyApplication.f7090a, R.string.toast_successfully, context);
                    return;
                }
                b.w(false);
                if (!lVar.isPlayerMoneyChanged) {
                    c.x0(context);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.unknown_error_try_again, context, (String) null);
                    return;
                }
            default:
                o oVar2 = this.f7219b;
                oVar2.f7242q0.setProgress(0);
                oVar2.f7236k0.setText(R.string.zero);
                oVar2.f7239n0.setText("");
                oVar2.f7239n0.clearFocus();
                boolean z4 = lVar.isAllProcessSuccess;
                Context context2 = oVar2.f7229d0;
                if (z4) {
                    Long valueOf2 = Long.valueOf(lVar.gangMoneyAfterChange);
                    oVar2.f7246v0 = valueOf2;
                    oVar2.f7232g0.setText(U.a(valueOf2.longValue()));
                    Iterator it3 = oVar2.p().f5000c.v().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            C0286s sVar2 = (C0286s) it3.next();
                            if (sVar2 instanceof C0429i) {
                                ((C0429i) sVar2).W(oVar2.f7246v0.longValue());
                            }
                        }
                    }
                    b.w(false);
                    b.M0(R.raw.money_get);
                    a.k(MyApplication.f7090a, R.string.toast_successfully, context2);
                    return;
                }
                b.w(false);
                if (!lVar.isCurrentPlayerBoss) {
                    a.n(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_take_that_action, context2, (String) null);
                    return;
                } else if (!lVar.isGangMoneyChanged) {
                    a.n(MyApplication.f7090a, R.string.dialog_gang_not_has_enough_cash, context2, (String) null);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.unknown_error_try_again, context2, (String) null);
                    return;
                }
        }
    }
}
