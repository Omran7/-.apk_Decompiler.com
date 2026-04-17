package com.bumptech.glide.manager;

import R0.d;
import U0.o;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

public final class p implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Set f5845a = Collections.newSetFromMap(new WeakHashMap());

    public final void c() {
        Iterator it2 = o.e(this.f5845a).iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).c();
        }
    }

    public final void j() {
        Iterator it2 = o.e(this.f5845a).iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).j();
        }
    }

    public final void k() {
        Iterator it2 = o.e(this.f5845a).iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).k();
        }
    }
}
