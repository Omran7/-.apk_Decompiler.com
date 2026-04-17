package com.bumptech.glide.manager;

import U0.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class m implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f5838a;

    public m(o oVar) {
        this.f5838a = oVar;
    }

    public final void a(boolean z3) {
        ArrayList arrayList;
        o.a();
        synchronized (this.f5838a) {
            arrayList = new ArrayList((HashSet) this.f5838a.d);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((a) it2.next()).a(z3);
        }
    }
}
