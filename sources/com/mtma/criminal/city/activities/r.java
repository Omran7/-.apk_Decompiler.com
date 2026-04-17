package com.mtma.criminal.city.activities;

import F3.h;
import T1.A;
import X4.j;
import com.bumptech.glide.d;
import com.mtma.criminal.city.utils.r0;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.q;
import java.util.HashMap;
import java.util.Iterator;
import n3.C0866g;
import v3.m;

public final class r implements r0, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StartActivity f7077a;

    public /* synthetic */ r(StartActivity startActivity) {
        this.f7077a = startActivity;
    }

    public void j(long j6) {
        this.f7077a.f7037R = true;
        d.b(j6, new A((Object) this, 23));
    }

    public void u(C0587c cVar) {
        boolean z3;
        String str;
        boolean g = cVar.g();
        StartActivity startActivity = this.f7077a;
        if (g) {
            C0586b c3 = cVar.c();
            while (true) {
                Iterator it2 = c3.f8276a;
                if (!it2.hasNext()) {
                    z3 = false;
                    str = null;
                    break;
                }
                v3.q qVar = (v3.q) it2.next();
                C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                m t6 = m.t(qVar.f12305b);
                String str2 = (String) new C0587c(E6.E("userName"), m.t(t6.f12296a.f(new C0866g("userName")))).f(String.class);
                if (str2 != null && str2.equals("player_still_guest")) {
                    str = E6.F();
                    z3 = true;
                    break;
                }
            }
            if (z3) {
                HashMap hashMap = new HashMap();
                hashMap.put("userAuthId", str);
                h.b().a("getCustomTokenForAnonymousAccount").q(hashMap).addOnCompleteListener(new H4.d((Object) this, 14));
                return;
            }
            startActivity.s(new j(startActivity.f7028I));
            return;
        }
        startActivity.s(new j(startActivity.f7028I));
    }

    public void B(C0588d dVar) {
    }
}
