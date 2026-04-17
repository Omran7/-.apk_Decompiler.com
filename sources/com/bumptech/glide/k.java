package com.bumptech.glide;

import Q0.c;
import com.bumptech.glide.manager.a;
import com.bumptech.glide.manager.o;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final o f5791a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f5792b;

    public k(l lVar, o oVar) {
        this.f5792b = lVar;
        this.f5791a = oVar;
    }

    public final void a(boolean z3) {
        if (z3) {
            synchronized (this.f5792b) {
                o oVar = this.f5791a;
                Iterator it2 = U0.o.e((Set) oVar.f5844c).iterator();
                while (it2.hasNext()) {
                    c cVar = (c) it2.next();
                    if (!cVar.k() && !cVar.d()) {
                        cVar.clear();
                        if (!oVar.f5843b) {
                            cVar.h();
                        } else {
                            ((HashSet) oVar.d).add(cVar);
                        }
                    }
                }
            }
        }
    }
}
