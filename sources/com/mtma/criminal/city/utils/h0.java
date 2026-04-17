package com.mtma.criminal.city.utils;

import H4.e;
import R2.b;
import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.C0592h;
import i3.q;

public final class h0 implements T, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7419a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7420b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7421c;

    public /* synthetic */ h0(int i2, Context context, String str) {
        this.f7419a = i2;
        this.f7420b = context;
        this.f7421c = str;
    }

    public void c(boolean z3) {
        switch (this.f7419a) {
            case 0:
                if (z3) {
                    d.U0(0, new K(this, 6));
                    return;
                }
                b.w(false);
                boolean equals = this.f7421c.equals("gold");
                Context context = this.f7420b;
                if (equals) {
                    c.y0(context);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context, (String) null);
                    return;
                }
            case 1:
                if (z3) {
                    d.U0(1, new I(this, 12));
                    return;
                }
                b.w(false);
                boolean equals2 = this.f7421c.equals("gold");
                Context context2 = this.f7420b;
                if (equals2) {
                    c.y0(context2);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context2, (String) null);
                    return;
                }
            default:
                if (z3) {
                    a.c(C0592h.b().e(), "players").E(o.getAccountObject().getId()).E("skillsObject").E("meritsSkills").I((Object) null).addOnSuccessListener(new e(this, 16)).addOnFailureListener(new C0452w(this, 1));
                    return;
                }
                b.w(false);
                boolean equals3 = this.f7421c.equals("gold");
                Context context3 = this.f7420b;
                if (equals3) {
                    c.y0(context3);
                    return;
                } else {
                    a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context3, (String) null);
                    return;
                }
        }
    }

    public void u(C0587c cVar) {
        int i2;
        long j6;
        try {
            i2 = ((Integer) cVar.f(Integer.class)).intValue();
        } catch (Exception unused) {
            i2 = 0;
        }
        String str = this.f7421c;
        if (str.equals("gold")) {
            j6 = I1.b.f0(i2, 200);
        } else {
            j6 = I1.b.f0(i2, 2000);
        }
        U.g(o.getAccountObject().getId(), str, -j6, new I(this, 15));
    }

    public h0(Context context, String str) {
        this.f7419a = 3;
        this.f7421c = str;
        this.f7420b = context;
    }

    public void B(C0588d dVar) {
    }
}
