package com.mtma.criminal.city.fragments.gangBase;

import K1.e;
import Y4.m;
import android.os.Handler;
import android.support.v4.media.session.a;
import com.mtma.criminal.city.R;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import j4.H;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class p implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f7249a;

    public p(r rVar) {
        this.f7249a = rVar;
    }

    public final void u(C0587c cVar) {
        Map map = (Map) cVar.e(new GangMilitiaFragment$1$1(this));
        if (map == null) {
            map = new HashMap();
        }
        r rVar = this.f7249a;
        int i2 = rVar.f7253e0;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m(1, R.string.gang_militia_one_name, R.drawable.gang_militia_one, 10, a.W(1), (String) map.getOrDefault(e.w(1), ""), a.v(1)));
        arrayList.add(new m(2, R.string.gang_militia_two_name, R.drawable.gang_militia_two, a.S(2), a.W(2), (String) map.getOrDefault(e.w(2), ""), a.v(2)));
        if (i2 > 1) {
            arrayList.add(new m(3, R.string.gang_militia_three_name, R.drawable.gang_militia_three, 30, a.W(3), (String) map.getOrDefault(e.w(3), ""), a.v(3)));
        }
        if (i2 > 2) {
            arrayList.add(new m(4, R.string.gang_militia_four_name, R.drawable.gang_militia_four, 40, a.W(4), (String) map.getOrDefault(e.w(4), ""), a.v(4)));
        }
        if (i2 > 3) {
            arrayList.add(new m(5, R.string.gang_militia_five_name, R.drawable.gang_militia_five, a.S(5), a.W(5), (String) map.getOrDefault(e.w(5), ""), a.v(5)));
        }
        if (i2 > 4) {
            arrayList.add(new m(6, R.string.gang_militia_six_name, R.drawable.gang_militia_six, a.S(6), a.W(6), (String) map.getOrDefault(e.w(6), ""), a.v(6)));
        }
        if (i2 > 5) {
            arrayList.add(new m(7, R.string.gang_militia_seven_name, R.drawable.gang_militia_seven, a.S(7), a.W(7), (String) map.getOrDefault(e.w(7), ""), a.v(7)));
        }
        rVar.f7262n0 = arrayList;
        H h = new H(rVar.f7252d0, rVar.f7262n0);
        rVar.f7261m0 = h;
        rVar.f7258j0.setAdapter(h);
        new Handler().postDelayed(new A4.a(rVar, 11), 100);
    }

    public final void B(C0588d dVar) {
    }
}
