package com.mtma.criminal.city.fragments.gangBase;

import R2.b;
import Y4.l;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d5.C0474g;
import d5.j;
import d5.k;
import j4.C0614b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class F implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HashMap f7126a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HashMap f7127b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HashMap f7128c;
    public final /* synthetic */ ArrayList d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ G f7129e;

    public F(G g, HashMap hashMap, HashMap hashMap2, HashMap hashMap3, ArrayList arrayList) {
        this.f7129e = g;
        this.f7126a = hashMap;
        this.f7127b = hashMap2;
        this.f7128c = hashMap3;
        this.d = arrayList;
    }

    public final void onComplete(Task task) {
        G g = this.f7129e;
        Iterator it2 = g.f7131e0.keySet().iterator();
        while (true) {
            boolean hasNext = it2.hasNext();
            ArrayList arrayList = this.d;
            if (hasNext) {
                String str = (String) it2.next();
                int intValue = ((Integer) g.f7131e0.get(str)).intValue();
                k kVar = (k) this.f7126a.get(str);
                j jVar = (j) this.f7127b.get(str);
                C0474g gVar = (C0474g) this.f7128c.get(str);
                l lVar = new l();
                lVar.f4385a = str;
                lVar.f4386b = kVar.getNickName();
                lVar.f4387c = kVar.getProfilePicUrl();
                lVar.d = kVar.getGender();
                lVar.f4388e = kVar.getLevel();
                lVar.f4394m = b.k0(kVar.getVipEndTime());
                lVar.f4395n = b.l0(kVar.getLastSeen());
                lVar.f4389f = jVar.getCurrentCity();
                lVar.g = jVar.getCurrentPlace();
                lVar.h = intValue;
                lVar.f4390i = gVar.getRespect();
                lVar.f4391j = gVar.getLoyalty();
                lVar.f4392k = gVar.getContribution();
                arrayList.add(lVar);
            } else {
                arrayList.sort(new H.b(2));
                g.f7134h0.setAdapter(new C0614b(g.f7130d0, arrayList, 4));
                b.w(false);
                return;
            }
        }
    }
}
