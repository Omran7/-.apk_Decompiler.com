package androidx.fragment.app;

import B0.C0009h;
import K.B;
import S3.z;
import X4.d;
import Z.a;
import Z.c;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.C0302m;
import androidx.lifecycle.C0303n;
import androidx.lifecycle.C0309u;
import androidx.lifecycle.S;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import d0.C0456a;
import d0.C0457b;
import h0.C0552a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import n.k;

public final class O {

    /* renamed from: a  reason: collision with root package name */
    public final d f5046a;

    /* renamed from: b  reason: collision with root package name */
    public final z f5047b;

    /* renamed from: c  reason: collision with root package name */
    public final C0286s f5048c;
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f5049e = -1;

    public O(d dVar, z zVar, C0286s sVar) {
        this.f5046a = dVar;
        this.f5047b = zVar;
        this.f5048c = sVar;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + sVar);
        }
        Bundle bundle = sVar.f5174b;
        sVar.f5149C.K();
        sVar.f5172a = 3;
        sVar.f5157L = false;
        sVar.y();
        if (sVar.f5157L) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + sVar);
            }
            View view = sVar.f5159N;
            if (view != null) {
                Bundle bundle2 = sVar.f5174b;
                SparseArray sparseArray = sVar.f5176c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    sVar.f5176c = null;
                }
                if (sVar.f5159N != null) {
                    Q q6 = sVar.f5168W;
                    q6.d.e(sVar.d);
                    sVar.d = null;
                }
                sVar.f5157L = false;
                sVar.M(bundle2);
                if (!sVar.f5157L) {
                    throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onViewStateRestored()"));
                } else if (sVar.f5159N != null) {
                    sVar.f5168W.b(C0302m.ON_CREATE);
                }
            }
            sVar.f5174b = null;
            I i2 = sVar.f5149C;
            i2.f4990E = false;
            i2.F = false;
            i2.f4996L.f5031i = false;
            i2.t(4);
            this.f5046a.f(false);
            return;
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        View view;
        View view2;
        z zVar = this.f5047b;
        zVar.getClass();
        C0286s sVar = this.f5048c;
        ViewGroup viewGroup = sVar.f5158M;
        int i2 = -1;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) zVar.f2711b;
            int indexOf = arrayList.indexOf(sVar);
            int i5 = indexOf - 1;
            while (true) {
                if (i5 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        C0286s sVar2 = (C0286s) arrayList.get(indexOf);
                        if (sVar2.f5158M == viewGroup && (view = sVar2.f5159N) != null) {
                            i2 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    C0286s sVar3 = (C0286s) arrayList.get(i5);
                    if (sVar3.f5158M == viewGroup && (view2 = sVar3.f5159N) != null) {
                        i2 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i5--;
                }
            }
        }
        sVar.f5158M.addView(sVar.f5159N, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.fragment.app.O} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            r0 = 3
            java.lang.String r1 = "FragmentManager"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            androidx.fragment.app.s r2 = r7.f5048c
            if (r0 == 0) goto L_0x001c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto ATTACHED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L_0x001c:
            androidx.fragment.app.s r0 = r2.f5179p
            r1 = 0
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            S3.z r5 = r7.f5047b
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = r0.f5177e
            java.lang.Object r5 = r5.f2712c
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.O r0 = (androidx.fragment.app.O) r0
            if (r0 == 0) goto L_0x0041
            androidx.fragment.app.s r3 = r2.f5179p
            java.lang.String r3 = r3.f5177e
            r2.f5180q = r3
            r2.f5179p = r1
            r1 = r0
            goto L_0x0087
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r2)
            r1.append(r4)
            androidx.fragment.app.s r2 = r2.f5179p
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005e:
            java.lang.String r0 = r2.f5180q
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r5.f2712c
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            r1 = r0
            androidx.fragment.app.O r1 = (androidx.fragment.app.O) r1
            if (r1 == 0) goto L_0x0070
            goto L_0x0087
        L_0x0070:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = r2.f5180q
            java.lang.String r1 = h0.C0552a.r(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        L_0x0087:
            if (r1 == 0) goto L_0x008c
            r1.k()
        L_0x008c:
            androidx.fragment.app.I r0 = r2.f5147A
            androidx.fragment.app.u r1 = r0.f5014t
            r2.f5148B = r1
            androidx.fragment.app.s r0 = r0.f5016v
            r2.f5150D = r0
            X4.d r0 = r7.f5046a
            r1 = 0
            r0.n(r1)
            java.util.ArrayList r3 = r2.f5173a0
            java.util.Iterator r4 = r3.iterator()
        L_0x00a2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00b2
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.r r5 = (androidx.fragment.app.r) r5
            r5.a()
            goto L_0x00a2
        L_0x00b2:
            r3.clear()
            androidx.fragment.app.I r3 = r2.f5149C
            androidx.fragment.app.u r4 = r2.f5148B
            I1.b r5 = r2.i()
            r3.b(r4, r5, r2)
            r2.f5172a = r1
            r2.f5157L = r1
            androidx.fragment.app.u r3 = r2.f5148B
            androidx.fragment.app.v r3 = r3.f5193q
            r2.A(r3)
            boolean r3 = r2.f5157L
            if (r3 == 0) goto L_0x00f8
            androidx.fragment.app.I r3 = r2.f5147A
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.f5007m
            java.util.Iterator r3 = r3.iterator()
        L_0x00d7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00e7
            java.lang.Object r4 = r3.next()
            androidx.fragment.app.L r4 = (androidx.fragment.app.L) r4
            r4.b()
            goto L_0x00d7
        L_0x00e7:
            androidx.fragment.app.I r2 = r2.f5149C
            r2.f4990E = r1
            r2.F = r1
            androidx.fragment.app.K r3 = r2.f4996L
            r3.f5031i = r1
            r2.t(r1)
            r0.g(r1)
            return
        L_0x00f8:
            androidx.fragment.app.V r0 = new androidx.fragment.app.V
            java.lang.String r1 = " did not call through to super.onAttach()"
            java.lang.String r1 = h0.C0552a.n(r6, r2, r1)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.O.c():void");
    }

    public final int d() {
        U u6;
        C0286s sVar = this.f5048c;
        if (sVar.f5147A == null) {
            return sVar.f5172a;
        }
        int i2 = this.f5049e;
        int ordinal = sVar.f5166U.ordinal();
        int i5 = 0;
        if (ordinal == 1) {
            i2 = Math.min(i2, 0);
        } else if (ordinal == 2) {
            i2 = Math.min(i2, 1);
        } else if (ordinal == 3) {
            i2 = Math.min(i2, 5);
        } else if (ordinal != 4) {
            i2 = Math.min(i2, -1);
        }
        if (sVar.f5185v) {
            if (sVar.f5186w) {
                i2 = Math.max(this.f5049e, 2);
                View view = sVar.f5159N;
                if (view != null && view.getParent() == null) {
                    i2 = Math.min(i2, 2);
                }
            } else {
                i2 = this.f5049e < 4 ? Math.min(i2, sVar.f5172a) : Math.min(i2, 1);
            }
        }
        if (!sVar.f5183t) {
            i2 = Math.min(i2, 1);
        }
        ViewGroup viewGroup = sVar.f5158M;
        if (viewGroup != null) {
            C0276h f6 = C0276h.f(viewGroup, sVar.p().D());
            f6.getClass();
            U d6 = f6.d(sVar);
            if (d6 != null) {
                i5 = d6.f5065b;
            }
            Iterator it2 = f6.f5111c.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    u6 = null;
                    break;
                }
                u6 = (U) it2.next();
                if (u6.f5066c.equals(sVar) && !u6.f5068f) {
                    break;
                }
            }
            if (u6 != null && (i5 == 0 || i5 == 1)) {
                i5 = u6.f5065b;
            }
        }
        if (i5 == 2) {
            i2 = Math.min(i2, 6);
        } else if (i5 == 3) {
            i2 = Math.max(i2, 3);
        } else if (sVar.f5184u) {
            if (sVar.x()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, -1);
            }
        }
        if (sVar.f5160O && sVar.f5172a < 5) {
            i2 = Math.min(i2, 4);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i2 + " for " + sVar);
        }
        return i2;
    }

    public final void e() {
        Parcelable parcelable;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto CREATED: " + sVar);
        }
        if (!sVar.f5164S) {
            d dVar = this.f5046a;
            dVar.o(false);
            Bundle bundle = sVar.f5174b;
            sVar.f5149C.K();
            sVar.f5172a = 1;
            sVar.f5157L = false;
            sVar.f5167V.a(new Fragment$6(sVar));
            sVar.f5170Y.e(bundle);
            sVar.B(bundle);
            sVar.f5164S = true;
            if (sVar.f5157L) {
                sVar.f5167V.d(C0302m.ON_CREATE);
                dVar.h(false);
                return;
            }
            throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onCreate()"));
        }
        Bundle bundle2 = sVar.f5174b;
        if (!(bundle2 == null || (parcelable = bundle2.getParcelable("android:support:fragments")) == null)) {
            sVar.f5149C.Q(parcelable);
            I i2 = sVar.f5149C;
            i2.f4990E = false;
            i2.F = false;
            i2.f4996L.f5031i = false;
            i2.t(1);
        }
        sVar.f5172a = 1;
    }

    public final void f() {
        String str;
        C0286s sVar = this.f5048c;
        if (!sVar.f5185v) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
            }
            LayoutInflater G6 = sVar.G(sVar.f5174b);
            ViewGroup viewGroup = sVar.f5158M;
            if (viewGroup == null) {
                int i2 = sVar.F;
                if (i2 == 0) {
                    viewGroup = null;
                } else if (i2 != -1) {
                    viewGroup = (ViewGroup) sVar.f5147A.f5015u.v0(i2);
                    if (viewGroup == null) {
                        if (!sVar.f5187x) {
                            try {
                                str = sVar.q().getResourceName(sVar.F);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(sVar.F) + " (" + str + ") for fragment " + sVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        c cVar = Z.d.f4461a;
                        Z.d.b(new a(sVar, "Attempting to add fragment " + sVar + " to container " + viewGroup + " which is not a FragmentContainerView"));
                        Z.d.a(sVar).getClass();
                    }
                } else {
                    throw new IllegalArgumentException(C0552a.n("Cannot create fragment ", sVar, " for a container view with no id"));
                }
            }
            sVar.f5158M = viewGroup;
            sVar.N(G6, viewGroup, sVar.f5174b);
            View view = sVar.f5159N;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                sVar.f5159N.setTag(R.id.fragment_container_view_tag, sVar);
                if (viewGroup != null) {
                    b();
                }
                if (sVar.f5153H) {
                    sVar.f5159N.setVisibility(8);
                }
                View view2 = sVar.f5159N;
                WeakHashMap weakHashMap = K.O.f1352a;
                if (view2.isAttachedToWindow()) {
                    B.c(sVar.f5159N);
                } else {
                    View view3 = sVar.f5159N;
                    view3.addOnAttachStateChangeListener(new N(view3, 0));
                }
                sVar.f5149C.t(2);
                this.f5046a.v(false);
                int visibility = sVar.f5159N.getVisibility();
                sVar.k().f5144j = sVar.f5159N.getAlpha();
                if (sVar.f5158M != null && visibility == 0) {
                    View findFocus = sVar.f5159N.findFocus();
                    if (findFocus != null) {
                        sVar.k().f5145k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + sVar);
                        }
                    }
                    sVar.f5159N.setAlpha(0.0f);
                }
            }
            sVar.f5172a = 2;
        }
    }

    public final void g() {
        boolean z3;
        boolean z4;
        C0286s q6;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATED: " + sVar);
        }
        boolean z5 = true;
        if (!sVar.f5184u || sVar.x()) {
            z3 = false;
        } else {
            z3 = true;
        }
        z zVar = this.f5047b;
        if (z3) {
            M m6 = (M) ((HashMap) zVar.d).remove(sVar.f5177e);
        }
        if (!z3) {
            K k6 = (K) zVar.f2713e;
            if (k6.d.containsKey(sVar.f5177e) && k6.g) {
                z4 = k6.h;
            } else {
                z4 = true;
            }
            if (!z4) {
                String str = sVar.f5180q;
                if (!(str == null || (q6 = zVar.q(str)) == null || !q6.f5155J)) {
                    sVar.f5179p = q6;
                }
                sVar.f5172a = 0;
                return;
            }
        }
        C0288u uVar = sVar.f5148B;
        if (uVar != null) {
            z5 = ((K) zVar.f2713e).h;
        } else {
            C0289v vVar = uVar.f5193q;
            if (vVar != null) {
                z5 = true ^ vVar.isChangingConfigurations();
            }
        }
        if (z3 || z5) {
            ((K) zVar.f2713e).c(sVar);
        }
        sVar.f5149C.k();
        sVar.f5167V.d(C0302m.ON_DESTROY);
        sVar.f5172a = 0;
        sVar.f5157L = false;
        sVar.f5164S = false;
        sVar.D();
        if (sVar.f5157L) {
            this.f5046a.j(false);
            Iterator it2 = zVar.t().iterator();
            while (it2.hasNext()) {
                O o6 = (O) it2.next();
                if (o6 != null) {
                    String str2 = sVar.f5177e;
                    C0286s sVar2 = o6.f5048c;
                    if (str2.equals(sVar2.f5180q)) {
                        sVar2.f5179p = sVar;
                        sVar2.f5180q = null;
                    }
                }
            }
            String str3 = sVar.f5180q;
            if (str3 != null) {
                sVar.f5179p = zVar.q(str3);
            }
            zVar.B(this);
            return;
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + sVar);
        }
        ViewGroup viewGroup = sVar.f5158M;
        if (!(viewGroup == null || (view = sVar.f5159N) == null)) {
            viewGroup.removeView(view);
        }
        sVar.f5149C.t(1);
        if (sVar.f5159N != null) {
            Q q6 = sVar.f5168W;
            q6.d();
            if (q6.f5058c.f5278c.compareTo(C0303n.f5270c) >= 0) {
                sVar.f5168W.b(C0302m.ON_DESTROY);
            }
        }
        sVar.f5172a = 1;
        sVar.f5157L = false;
        sVar.E();
        if (sVar.f5157L) {
            C0009h hVar = new C0009h(sVar.e(), (S) C0457b.f7500f);
            Class<C0457b> cls = C0457b.class;
            String canonicalName = cls.getCanonicalName();
            if (canonicalName != null) {
                k kVar = ((C0457b) hVar.v(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName))).d;
                int h = kVar.h();
                for (int i2 = 0; i2 < h; i2++) {
                    ((C0456a) kVar.i(i2)).j();
                }
                sVar.f5188y = false;
                this.f5046a.w(false);
                sVar.f5158M = null;
                sVar.f5159N = null;
                sVar.f5168W = null;
                sVar.f5169X.i((Object) null);
                sVar.f5186w = false;
                return;
            }
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + sVar);
        }
        sVar.f5172a = -1;
        sVar.f5157L = false;
        sVar.F();
        if (sVar.f5157L) {
            I i2 = sVar.f5149C;
            if (!i2.f4991G) {
                i2.k();
                sVar.f5149C = new I();
            }
            this.f5046a.l(false);
            sVar.f5172a = -1;
            sVar.f5148B = null;
            sVar.f5150D = null;
            sVar.f5147A = null;
            if (!sVar.f5184u || sVar.x()) {
                K k6 = (K) this.f5047b.f2713e;
                boolean z3 = true;
                if (k6.d.containsKey(sVar.f5177e) && k6.g) {
                    z3 = k6.h;
                }
                if (!z3) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "initState called for fragment: " + sVar);
            }
            sVar.u();
            return;
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        C0286s sVar = this.f5048c;
        if (sVar.f5185v && sVar.f5186w && !sVar.f5188y) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + sVar);
            }
            sVar.N(sVar.G(sVar.f5174b), (ViewGroup) null, sVar.f5174b);
            View view = sVar.f5159N;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                sVar.f5159N.setTag(R.id.fragment_container_view_tag, sVar);
                if (sVar.f5153H) {
                    sVar.f5159N.setVisibility(8);
                }
                sVar.f5149C.t(2);
                this.f5046a.v(false);
                sVar.f5172a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        z zVar = this.f5047b;
        boolean z3 = this.d;
        C0286s sVar = this.f5048c;
        if (!z3) {
            try {
                this.d = true;
                boolean z4 = false;
                while (true) {
                    int d6 = d();
                    int i2 = sVar.f5172a;
                    if (d6 != i2) {
                        if (d6 <= i2) {
                            switch (i2 - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    sVar.f5172a = 1;
                                    break;
                                case 2:
                                    sVar.f5186w = false;
                                    sVar.f5172a = 2;
                                    break;
                                case 3:
                                    if (Log.isLoggable("FragmentManager", 3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + sVar);
                                    }
                                    if (sVar.f5159N != null && sVar.f5176c == null) {
                                        o();
                                    }
                                    if (!(sVar.f5159N == null || (viewGroup2 = sVar.f5158M) == null)) {
                                        C0276h f6 = C0276h.f(viewGroup2, sVar.p().D());
                                        f6.getClass();
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + sVar);
                                        }
                                        f6.a(1, 3, this);
                                    }
                                    sVar.f5172a = 3;
                                    break;
                                case 4:
                                    q();
                                    break;
                                case 5:
                                    sVar.f5172a = 5;
                                    break;
                                case zzaky.zzf.zzf /*6*/:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i2 + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(sVar.f5159N == null || (viewGroup3 = sVar.f5158M) == null)) {
                                        C0276h f7 = C0276h.f(viewGroup3, sVar.p().D());
                                        int b6 = C0552a.b(sVar.f5159N.getVisibility());
                                        f7.getClass();
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + sVar);
                                        }
                                        f7.a(b6, 2, this);
                                    }
                                    sVar.f5172a = 4;
                                    break;
                                case 5:
                                    p();
                                    break;
                                case zzaky.zzf.zzf /*6*/:
                                    sVar.f5172a = 6;
                                    break;
                                case zzaky.zzf.zzg /*7*/:
                                    n();
                                    break;
                            }
                        }
                        z4 = true;
                    } else {
                        if (!z4 && i2 == -1 && sVar.f5184u && !sVar.x()) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + sVar);
                            }
                            ((K) zVar.f2713e).c(sVar);
                            zVar.B(this);
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + sVar);
                            }
                            sVar.u();
                        }
                        if (sVar.f5163R) {
                            if (!(sVar.f5159N == null || (viewGroup = sVar.f5158M) == null)) {
                                C0276h f8 = C0276h.f(viewGroup, sVar.p().D());
                                if (sVar.f5153H) {
                                    f8.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + sVar);
                                    }
                                    f8.a(3, 1, this);
                                } else {
                                    f8.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + sVar);
                                    }
                                    f8.a(2, 1, this);
                                }
                            }
                            I i5 = sVar.f5147A;
                            if (i5 != null && sVar.f5183t && I.F(sVar)) {
                                i5.f4989D = true;
                            }
                            sVar.f5163R = false;
                            sVar.f5149C.n();
                        }
                        this.d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + sVar);
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom RESUMED: " + sVar);
        }
        sVar.f5149C.t(5);
        if (sVar.f5159N != null) {
            sVar.f5168W.b(C0302m.ON_PAUSE);
        }
        sVar.f5167V.d(C0302m.ON_PAUSE);
        sVar.f5172a = 6;
        sVar.f5157L = false;
        sVar.H();
        if (sVar.f5157L) {
            this.f5046a.m(false);
            return;
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        C0286s sVar = this.f5048c;
        Bundle bundle = sVar.f5174b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            sVar.f5176c = sVar.f5174b.getSparseParcelableArray("android:view_state");
            sVar.d = sVar.f5174b.getBundle("android:view_registry_state");
            String string = sVar.f5174b.getString("android:target_state");
            sVar.f5180q = string;
            if (string != null) {
                sVar.f5181r = sVar.f5174b.getInt("android:target_req_state", 0);
            }
            boolean z3 = sVar.f5174b.getBoolean("android:user_visible_hint", true);
            sVar.f5161P = z3;
            if (!z3) {
                sVar.f5160O = true;
            }
        }
    }

    public final void n() {
        View view;
        String str;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto RESUMED: " + sVar);
        }
        C0285q qVar = sVar.f5162Q;
        if (qVar == null) {
            view = null;
        } else {
            view = qVar.f5145k;
        }
        if (view != null) {
            if (view != sVar.f5159N) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == sVar.f5159N) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            boolean requestFocus = view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                StringBuilder sb = new StringBuilder("requestFocus: Restoring focused view ");
                sb.append(view);
                sb.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb.append(str);
                sb.append(" on Fragment ");
                sb.append(sVar);
                sb.append(" resulting in focused view ");
                sb.append(sVar.f5159N.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        sVar.k().f5145k = null;
        sVar.f5149C.K();
        sVar.f5149C.x(true);
        sVar.f5172a = 7;
        sVar.f5157L = false;
        sVar.I();
        if (sVar.f5157L) {
            C0309u uVar = sVar.f5167V;
            C0302m mVar = C0302m.ON_RESUME;
            uVar.d(mVar);
            if (sVar.f5159N != null) {
                sVar.f5168W.f5058c.d(mVar);
            }
            I i2 = sVar.f5149C;
            i2.f4990E = false;
            i2.F = false;
            i2.f4996L.f5031i = false;
            i2.t(7);
            this.f5046a.p(false);
            sVar.f5174b = null;
            sVar.f5176c = null;
            sVar.d = null;
            return;
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onResume()"));
    }

    public final void o() {
        C0286s sVar = this.f5048c;
        if (sVar.f5159N != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + sVar + " with view " + sVar.f5159N);
            }
            SparseArray sparseArray = new SparseArray();
            sVar.f5159N.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                sVar.f5176c = sparseArray;
            }
            Bundle bundle = new Bundle();
            sVar.f5168W.d.g(bundle);
            if (!bundle.isEmpty()) {
                sVar.d = bundle;
            }
        }
    }

    public final void p() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "moveto STARTED: " + sVar);
        }
        sVar.f5149C.K();
        sVar.f5149C.x(true);
        sVar.f5172a = 5;
        sVar.f5157L = false;
        sVar.K();
        if (sVar.f5157L) {
            C0309u uVar = sVar.f5167V;
            C0302m mVar = C0302m.ON_START;
            uVar.d(mVar);
            if (sVar.f5159N != null) {
                sVar.f5168W.f5058c.d(mVar);
            }
            I i2 = sVar.f5149C;
            i2.f4990E = false;
            i2.F = false;
            i2.f4996L.f5031i = false;
            i2.t(5);
            this.f5046a.s(false);
            return;
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onStart()"));
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        C0286s sVar = this.f5048c;
        if (isLoggable) {
            Log.d("FragmentManager", "movefrom STARTED: " + sVar);
        }
        I i2 = sVar.f5149C;
        i2.F = true;
        i2.f4996L.f5031i = true;
        i2.t(4);
        if (sVar.f5159N != null) {
            sVar.f5168W.b(C0302m.ON_STOP);
        }
        sVar.f5167V.d(C0302m.ON_STOP);
        sVar.f5172a = 4;
        sVar.f5157L = false;
        sVar.L();
        if (sVar.f5157L) {
            this.f5046a.t(false);
            return;
        }
        throw new AndroidRuntimeException(C0552a.n("Fragment ", sVar, " did not call through to super.onStop()"));
    }

    public O(d dVar, z zVar, ClassLoader classLoader, C c3, M m6) {
        this.f5046a = dVar;
        this.f5047b = zVar;
        C0286s a6 = c3.a(m6.f5032a);
        Bundle bundle = m6.f5040s;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a6.T(bundle);
        a6.f5177e = m6.f5033b;
        a6.f5185v = m6.f5034c;
        a6.f5187x = true;
        a6.f5151E = m6.d;
        a6.F = m6.f5035e;
        a6.f5152G = m6.f5036f;
        a6.f5155J = m6.f5037p;
        a6.f5184u = m6.f5038q;
        a6.f5154I = m6.f5039r;
        a6.f5153H = m6.f5041t;
        a6.f5166U = C0303n.values()[m6.f5042u];
        Bundle bundle2 = m6.f5043v;
        if (bundle2 != null) {
            a6.f5174b = bundle2;
        } else {
            a6.f5174b = new Bundle();
        }
        this.f5048c = a6;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a6);
        }
    }

    public O(d dVar, z zVar, C0286s sVar, M m6) {
        this.f5046a = dVar;
        this.f5047b = zVar;
        this.f5048c = sVar;
        sVar.f5176c = null;
        sVar.d = null;
        sVar.f5189z = 0;
        sVar.f5186w = false;
        sVar.f5183t = false;
        C0286s sVar2 = sVar.f5179p;
        sVar.f5180q = sVar2 != null ? sVar2.f5177e : null;
        sVar.f5179p = null;
        Bundle bundle = m6.f5043v;
        if (bundle != null) {
            sVar.f5174b = bundle;
        } else {
            sVar.f5174b = new Bundle();
        }
    }
}
