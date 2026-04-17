package com.bumptech.glide.manager;

import U0.o;
import androidx.lifecycle.A;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0303n;
import androidx.lifecycle.C0307s;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.r;
import java.util.HashSet;
import java.util.Iterator;

final class LifecycleLifecycle implements g, r {

    /* renamed from: a  reason: collision with root package name */
    public final HashSet f5825a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final C0309u f5826b;

    public LifecycleLifecycle(C0309u uVar) {
        this.f5826b = uVar;
        uVar.a(this);
    }

    public final void b(h hVar) {
        this.f5825a.add(hVar);
        C0303n nVar = this.f5826b.f5278c;
        if (nVar == C0303n.f5268a) {
            hVar.k();
        } else if (nVar.compareTo(C0303n.d) >= 0) {
            hVar.j();
        } else {
            hVar.c();
        }
    }

    public final void e(h hVar) {
        this.f5825a.remove(hVar);
    }

    @A(C0302m.ON_DESTROY)
    public void onDestroy(C0307s sVar) {
        Iterator it2 = o.e(this.f5825a).iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).k();
        }
        sVar.h().f(this);
    }

    @A(C0302m.ON_START)
    public void onStart(C0307s sVar) {
        Iterator it2 = o.e(this.f5825a).iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).j();
        }
    }

    @A(C0302m.ON_STOP)
    public void onStop(C0307s sVar) {
        Iterator it2 = o.e(this.f5825a).iterator();
        while (it2.hasNext()) {
            ((h) it2.next()).c();
        }
    }
}
