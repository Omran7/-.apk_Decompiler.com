package com.mtma.criminal.city.utils;

import K4.u;
import R2.b;
import android.content.Context;
import com.bumptech.glide.c;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import java.util.ArrayList;

public final class g0 implements r0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7413a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7414b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7415c;
    public final /* synthetic */ long d;

    public g0(int i2, long j6, Context context, String str) {
        this.f7413a = i2;
        this.f7414b = context;
        this.f7415c = str;
        this.d = j6;
    }

    public final void j(long j6) {
        ArrayList<Integer> herbIdsList = o.getHerbObject().getHerbIdsList();
        int i2 = this.f7413a;
        if (herbIdsList.contains(Integer.valueOf(i2))) {
            ArrayList<Integer> herbIdsList2 = o.getHerbObject().getHerbIdsList();
            ArrayList<Long> herbUsingStartTimeList = o.getHerbObject().getHerbUsingStartTimeList();
            int indexOf = herbIdsList2.indexOf(Integer.valueOf(i2));
            if (j6 < b.T(herbIdsList2.get(indexOf).intValue()) + herbUsingStartTimeList.get(indexOf).longValue()) {
                b.w(false);
                c.s0(this.f7414b, MyApplication.f7090a.getApplicationContext().getString(R.string.can_not_use_herb_material), (String) null);
                return;
            }
        }
        u uVar = new u((Object) this, j6, 10);
        U.g(o.getAccountObject().getId(), this.f7415c, -this.d, uVar);
    }
}
