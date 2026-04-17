package j4;

import I1.b;
import Y4.D;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import e5.C0509f;

public final class q0 extends C0509f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ D f9079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9080b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Z f9081c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q0(Z z3, RelativeLayout relativeLayout, D d, boolean z4) {
        super(relativeLayout);
        this.f9081c = z3;
        this.f9079a = d;
        this.f9080b = z4;
    }

    public final void onClick(View view) {
        super.onClick(view);
        Z z3 = this.f9081c;
        int i2 = z3.d;
        D d = this.f9079a;
        Context context = z3.f8965b;
        if (i2 == 0 && d.f4290B > ((long) o.getMoneyObject().getGold())) {
            c.y0(context);
        } else if (z3.d != 1 || d.f4291C <= ((long) o.getMoneyObject().getCheck())) {
            int i5 = z3.f8966c;
            if (i5 == 3 || i5 == 4 || i5 == 5) {
                if (this.f9080b) {
                    Z.c(z3, d.f4293a);
                } else if (o.getMainStatesObject().getLevel() < b.V(d.f4293a)) {
                    R2.b.w(false);
                    a.n(MyApplication.f7090a, R.string.level_below_package_required_level, context, (String) null);
                } else {
                    a.n(MyApplication.f7090a, R.string.can_not_buy_same_package_twice_wait_to_start_year, context, (String) null);
                }
            } else if (i5 == 6) {
                int i6 = d.f4293a;
                if (i6 == 2001 || i6 == 2002 || i6 == 2003 || i6 == 2004 || i6 == 2005 || i6 == 2006 || i6 == 2007 || i6 == 2009 || i6 == 2010 || i6 == 2012 || i6 == 2013 || i6 == 2014 || i6 == 2015 || i6 == 2016 || i6 == 2020 || i6 == 2018) {
                    Z.c(z3, i6);
                } else if (i6 != 2019) {
                    Z.d(z3, i6);
                } else if (o.getGangObject().getPosition() == 0) {
                    Z.c(z3, d.f4293a);
                } else {
                    a.n(MyApplication.f7090a, R.string.dialog_gang_only_boss_can_take_that_action, context, (String) null);
                }
            } else if (i5 == 7) {
                int i7 = d.f4293a;
                if (i7 == 2001 || i7 == 2002 || i7 == 2004 || i7 == 2005 || i7 == 2006 || i7 == 2007 || i7 == 2009 || i7 == 2010 || i7 == 2020 || i7 == 2018) {
                    Z.c(z3, i7);
                } else {
                    Z.d(z3, i7);
                }
            } else if (i5 == 11) {
                Z.c(z3, d.f4293a);
            } else {
                Z.d(z3, d.f4293a);
            }
        } else {
            a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context, (String) null);
        }
    }
}
