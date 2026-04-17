package com.mtma.criminal.city.fragments.profile.skills;

import K1.e;
import K4.r;
import R2.b;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.o;
import i3.C0587c;
import i3.C0588d;
import i3.q;
import j4.C0614b;
import java.util.Map;

public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ J4.a f7338a;

    public a(J4.a aVar) {
        this.f7338a = aVar;
    }

    public final void u(C0587c cVar) {
        Map map = (Map) cVar.e(new SkillsFragment$1$1(this));
        if (map != null) {
            o.getSkillsObject().setMeritsSkills(map);
        }
        J4.a aVar = this.f7338a;
        aVar.f1334g0.setText(MyApplication.f7090a.getApplicationContext().getString(R.string.slash_between_two_number, new Object[]{Integer.valueOf(e.q()), Integer.valueOf(o.getSkillsObject().getMeritsFromMedals() + o.getSkillsObject().getMeritsFromChecksOrItems())}));
        C0614b bVar = new C0614b(aVar.f1332e0, e.V(), 12);
        bVar.registerDataSetObserver(new r(this, 7));
        aVar.f1335h0.setAdapter(bVar);
        b.w(false);
    }

    public final void B(C0588d dVar) {
    }
}
