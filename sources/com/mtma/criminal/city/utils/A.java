package com.mtma.criminal.city.utils;

import B0.l;
import R2.b;
import Y4.D;
import a1.C0258c;
import android.content.Context;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import d5.o;
import i3.C0590f;
import i3.C0592h;
import java.util.ArrayList;

public final class A implements r0, o0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7339a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7340b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ D f7341c;

    public /* synthetic */ A(D d, Context context, int i2) {
        this.f7339a = i2;
        this.f7341c = d;
        this.f7340b = context;
    }

    public void d(int i2, boolean z3) {
        String str = null;
        if (z3) {
            int i5 = this.f7341c.f4293a;
            I i6 = new I(this, 17);
            C0590f v6 = a.v(a.c(C0592h.b().e(), "players"), "skillsObject");
            if (i5 == 703) {
                str = "strengthCards";
            } else if (i5 == 701) {
                str = "defenseCards";
            } else if (i5 == 702) {
                str = "speedCards";
            } else if (i5 == 704) {
                str = "dexterityCards";
            }
            v6.E(str).H(new l(i5, (Object) i6, 15));
            return;
        }
        b.w(false);
        c.s0(this.f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_not_enough_items), (String) null);
    }

    public void j(long j6) {
        switch (this.f7339a) {
            case 0:
                if (o.getHerbObject().getHerbTypesList().contains(1)) {
                    ArrayList<Integer> herbTypesList = o.getHerbObject().getHerbTypesList();
                    ArrayList<Integer> herbIdsList = o.getHerbObject().getHerbIdsList();
                    ArrayList<Long> herbUsingStartTimeList = o.getHerbObject().getHerbUsingStartTimeList();
                    int indexOf = herbTypesList.indexOf(1);
                    if (j6 < b.T(herbIdsList.get(indexOf).intValue()) + herbUsingStartTimeList.get(indexOf).longValue()) {
                        b.w(false);
                        c.s0(this.f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.can_not_use_herb), (String) null);
                        return;
                    }
                }
                int i2 = this.f7341c.f4293a;
                android.support.v4.media.session.a.B0(i2, 10, 0, -1, new C0258c((r0) this, i2, j6, 3), o.getAccountObject().getId(), android.support.v4.media.session.a.z(), false);
                return;
            case 1:
                if (o.getHerbObject().getHerbTypesList().contains(2)) {
                    ArrayList<Integer> herbTypesList2 = o.getHerbObject().getHerbTypesList();
                    ArrayList<Integer> herbIdsList2 = o.getHerbObject().getHerbIdsList();
                    ArrayList<Long> herbUsingStartTimeList2 = o.getHerbObject().getHerbUsingStartTimeList();
                    int indexOf2 = herbTypesList2.indexOf(2);
                    if (j6 < b.T(herbIdsList2.get(indexOf2).intValue()) + herbUsingStartTimeList2.get(indexOf2).longValue()) {
                        b.w(false);
                        c.s0(this.f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.can_not_use_plate), (String) null);
                        return;
                    }
                }
                int i5 = this.f7341c.f4293a;
                android.support.v4.media.session.a.B0(i5, 18, 0, -1, new C0258c((r0) this, i5, j6, 4), o.getAccountObject().getId(), android.support.v4.media.session.a.z(), false);
                return;
            default:
                int i6 = this.f7341c.f4293a;
                if (o.getHerbObject().getHerbIdsList().contains(Integer.valueOf(i6))) {
                    ArrayList<Integer> herbIdsList3 = o.getHerbObject().getHerbIdsList();
                    ArrayList<Long> herbUsingStartTimeList3 = o.getHerbObject().getHerbUsingStartTimeList();
                    int indexOf3 = herbIdsList3.indexOf(Integer.valueOf(i6));
                    if (j6 < b.T(herbIdsList3.get(indexOf3).intValue()) + herbUsingStartTimeList3.get(indexOf3).longValue()) {
                        b.w(false);
                        c.s0(this.f7340b, MyApplication.f7090a.getApplicationContext().getString(R.string.can_not_use_herb_material), (String) null);
                        return;
                    }
                }
                android.support.v4.media.session.a.B0(i6, 7, 0, -1, new C0258c((r0) this, i6, j6, 5), o.getAccountObject().getId(), android.support.v4.media.session.a.z(), false);
                return;
        }
    }

    public /* synthetic */ A(Context context, D d, int i2) {
        this.f7339a = i2;
        this.f7340b = context;
        this.f7341c = d;
    }
}
