package androidx.fragment.app;

import G.c;
import G.d;
import T1.A;
import android.util.Log;
import android.view.View;
import h0.C0552a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import q.C0928e;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    public int f5064a;

    /* renamed from: b  reason: collision with root package name */
    public int f5065b;

    /* renamed from: c  reason: collision with root package name */
    public final C0286s f5066c;
    public final ArrayList d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f5067e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public boolean f5068f = false;
    public boolean g = false;
    public final O h;

    public U(int i2, int i5, O o6, d dVar) {
        C0286s sVar = o6.f5048c;
        this.f5064a = i2;
        this.f5065b = i5;
        this.f5066c = sVar;
        dVar.a(new A((Object) this, 16));
        this.h = o6;
    }

    public final void a() {
        if (!this.f5068f) {
            this.f5068f = true;
            HashSet hashSet = this.f5067e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it2 = new ArrayList(hashSet).iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                synchronized (dVar) {
                    try {
                        if (!dVar.f797a) {
                            dVar.f797a = true;
                            dVar.f799c = true;
                            c cVar = dVar.f798b;
                            if (cVar != null) {
                                try {
                                    cVar.d();
                                } catch (Throwable th) {
                                    synchronized (dVar) {
                                        dVar.f799c = false;
                                        dVar.notifyAll();
                                        throw th;
                                    }
                                }
                            }
                            synchronized (dVar) {
                                dVar.f799c = false;
                                dVar.notifyAll();
                            }
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                ((Runnable) it2.next()).run();
            }
        }
        this.h.k();
    }

    public final void c(int i2, int i5) {
        int c3 = C0928e.c(i5);
        C0286s sVar = this.f5066c;
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 == 2) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + sVar + " mFinalState = " + C0552a.B(this.f5064a) + " -> REMOVED. mLifecycleImpact  = " + C0552a.A(this.f5065b) + " to REMOVING.");
                    }
                    this.f5064a = 1;
                    this.f5065b = 3;
                }
            } else if (this.f5064a == 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + sVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + C0552a.A(this.f5065b) + " to ADDING.");
                }
                this.f5064a = 2;
                this.f5065b = 2;
            }
        } else if (this.f5064a != 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: For fragment " + sVar + " mFinalState = " + C0552a.B(this.f5064a) + " -> " + C0552a.B(i2) + ". ");
            }
            this.f5064a = i2;
        }
    }

    public final void d() {
        float f6;
        int i2 = this.f5065b;
        O o6 = this.h;
        if (i2 == 2) {
            C0286s sVar = o6.f5048c;
            View findFocus = sVar.f5159N.findFocus();
            if (findFocus != null) {
                sVar.k().f5145k = findFocus;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + sVar);
                }
            }
            View R5 = this.f5066c.R();
            if (R5.getParent() == null) {
                o6.b();
                R5.setAlpha(0.0f);
            }
            if (R5.getAlpha() == 0.0f && R5.getVisibility() == 0) {
                R5.setVisibility(4);
            }
            C0285q qVar = sVar.f5162Q;
            if (qVar == null) {
                f6 = 1.0f;
            } else {
                f6 = qVar.f5144j;
            }
            R5.setAlpha(f6);
        } else if (i2 == 3) {
            C0286s sVar2 = o6.f5048c;
            View R6 = sVar2.R();
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Clearing focus " + R6.findFocus() + " on view " + R6 + " for Fragment " + sVar2);
            }
            R6.clearFocus();
        }
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + C0552a.B(this.f5064a) + "} {mLifecycleImpact = " + C0552a.A(this.f5065b) + "} {mFragment = " + this.f5066c + "}";
    }
}
