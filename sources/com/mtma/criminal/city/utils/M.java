package com.mtma.criminal.city.utils;

import A2.f;
import B0.l;
import R2.b;
import Y4.D;
import android.content.Context;
import android.support.v4.media.session.a;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import d5.o;
import i3.C0592h;
import java.util.ArrayList;

public final class M implements o0, T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7365b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f7366c;

    public /* synthetic */ M(int i2, int i5, Context context) {
        this.f7364a = i5;
        this.f7365b = i2;
        this.f7366c = context;
    }

    public void c(boolean z3) {
        switch (this.f7364a) {
            case 3:
                if (z3) {
                    a.E0("stallSpace", this.f7365b, new K(this, 12));
                    return;
                }
                b.w(false);
                c.y0(this.f7366c);
                return;
            default:
                if (z3) {
                    com.google.android.gms.internal.measurement.a.d(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "stockObject", "museumBackgroundAvailable").H(new l0(this.f7365b, new K(this, 14)));
                    return;
                }
                b.w(false);
                c.y0(this.f7366c);
                return;
        }
    }

    public void d(int i2, boolean z3) {
        D d;
        switch (this.f7364a) {
            case 0:
                if (z3) {
                    c.s(true, new l(this.f7365b, (Object) new I(this, 6), 10));
                    return;
                }
                b.w(false);
                c.s0(this.f7366c, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
                return;
            case 1:
                if (z3) {
                    com.google.android.gms.internal.measurement.a.v(com.google.android.gms.internal.measurement.a.c(C0592h.b().e(), "players"), "gymObject").H(new l(this.f7365b, (Object) new K(this, 10), 8));
                    return;
                }
                b.w(false);
                c.s0(this.f7366c, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
                return;
            default:
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        int i6 = this.f7365b;
                        if (i5 < I1.b.U(i6).size()) {
                            int intValue = ((Integer) I1.b.U(i6).get(i5)).intValue();
                            int intValue2 = ((Integer) I1.b.T(i6).get(i5)).intValue();
                            if (intValue == -100) {
                                if (intValue2 == 500000) {
                                    d = new D(R.string.money, R.string.five_hundred_thousand_cash, R.drawable.money_buy_cash_2);
                                } else if (intValue2 == 10000000) {
                                    d = new D(R.string.money, R.string.ten_million, R.drawable.money_buy_cash_3);
                                } else if (intValue2 == 25000000) {
                                    d = new D(R.string.money, R.string.twenty_five_million, R.drawable.money_buy_cash_3);
                                } else {
                                    d = new D(R.string.money, R.string.cash_description, R.drawable.money_buy_cash_2);
                                }
                                d.h = intValue2;
                                U.g(o.getAccountObject().getId(), "cash", (long) intValue2, (T) null);
                            } else {
                                d = D.s(intValue, 0, intValue2);
                                a.B0(d.f4293a, d.f4294b, d.f4298i, intValue2, new f((Object) this, i5, (Object) arrayList, 7), o.getAccountObject().getId(), a.z(), false);
                            }
                            arrayList.add(d);
                            i5++;
                        } else {
                            return;
                        }
                    }
                } else {
                    b.w(false);
                    c.s0(this.f7366c, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
                    return;
                }
        }
    }
}
