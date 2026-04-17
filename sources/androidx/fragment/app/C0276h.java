package androidx.fragment.app;

import E2.f;
import H.j;
import K.O;
import S3.z;
import X4.d;
import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.mtma.criminal.city.R;
import h0.C0552a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import q.C0928e;

/* renamed from: androidx.fragment.app.h  reason: case insensitive filesystem */
public final class C0276h {

    /* renamed from: a  reason: collision with root package name */
    public final ViewGroup f5109a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f5110b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f5111c = new ArrayList();
    public boolean d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f5112e = false;

    public C0276h(ViewGroup viewGroup) {
        this.f5109a = viewGroup;
    }

    public static C0276h f(ViewGroup viewGroup, D d6) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0276h) {
            return (C0276h) tag;
        }
        d6.getClass();
        C0276h hVar = new C0276h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
        return hVar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, G.d] */
    public final void a(int i2, int i5, O o6) {
        synchronized (this.f5110b) {
            try {
                ? obj = new Object();
                U d6 = d(o6.f5048c);
                if (d6 != null) {
                    d6.c(i2, i5);
                    return;
                }
                U u6 = new U(i2, i5, o6, obj);
                this.f5110b.add(u6);
                u6.d.add(new T(this, u6, 0));
                u6.d.add(new T(this, u6, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r14v9, types: [E2.f, java.lang.Object, androidx.fragment.app.f] */
    public final void b(ArrayList arrayList, boolean z3) {
        ArrayList arrayList2;
        boolean z4;
        ArrayList arrayList3 = arrayList;
        boolean z5 = z3;
        Iterator it2 = arrayList.iterator();
        U u6 = null;
        U u7 = null;
        while (it2.hasNext()) {
            U u8 = (U) it2.next();
            int c3 = C0552a.c(u8.f5066c.f5159N);
            int c6 = C0928e.c(u8.f5064a);
            if (c6 != 0) {
                if (c6 != 1) {
                    if (!(c6 == 2 || c6 == 3)) {
                    }
                } else if (c3 != 2) {
                    u7 = u8;
                }
            }
            if (c3 == 2 && u6 == null) {
                u6 = u8;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + u6 + " to " + u7);
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList(arrayList3);
        C0286s sVar = ((U) arrayList3.get(arrayList.size() - 1)).f5066c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0285q qVar = ((U) it3.next()).f5066c.f5162Q;
            C0285q qVar2 = sVar.f5162Q;
            qVar.f5139b = qVar2.f5139b;
            qVar.f5140c = qVar2.f5140c;
            qVar.d = qVar2.d;
            qVar.f5141e = qVar2.f5141e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z6 = false;
            if (!it4.hasNext()) {
                break;
            }
            U u9 = (U) it4.next();
            Object obj = new Object();
            u9.d();
            HashSet hashSet = u9.f5067e;
            hashSet.add(obj);
            ? fVar = new f(u9, obj);
            fVar.d = false;
            fVar.f5107c = z5;
            arrayList4.add(fVar);
            Object obj2 = new Object();
            u9.d();
            hashSet.add(obj2);
            if (!z5 ? u9 == u7 : u9 == u6) {
                z6 = true;
            }
            f fVar2 = new f(u9, obj2);
            int i2 = u9.f5064a;
            C0286s sVar2 = u9.f5066c;
            if (i2 == 2) {
                if (z5) {
                    C0285q qVar3 = sVar2.f5162Q;
                } else {
                    sVar2.getClass();
                }
                if (z5) {
                    C0285q qVar4 = sVar2.f5162Q;
                } else {
                    C0285q qVar5 = sVar2.f5162Q;
                }
            } else if (z5) {
                C0285q qVar6 = sVar2.f5162Q;
            } else {
                sVar2.getClass();
            }
            if (z6) {
                if (z5) {
                    C0285q qVar7 = sVar2.f5162Q;
                } else {
                    sVar2.getClass();
                }
            }
            arrayList5.add(fVar2);
            j jVar = r11;
            j jVar2 = new j(this, arrayList6, u9, 12, false);
            u9.d.add(jVar);
            arrayList6 = arrayList6;
        }
        ArrayList arrayList7 = arrayList6;
        HashMap hashMap = new HashMap();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            U u10 = (U) ((C0275g) it5.next()).f620a;
            int c7 = C0552a.c(u10.f5066c.f5159N);
            int i5 = u10.f5064a;
        }
        Iterator it6 = arrayList5.iterator();
        while (it6.hasNext()) {
            C0275g gVar = (C0275g) it6.next();
            hashMap.put((U) gVar.f620a, Boolean.FALSE);
            gVar.d();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f5109a;
        Context context = viewGroup.getContext();
        ArrayList arrayList8 = new ArrayList();
        Iterator it7 = arrayList4.iterator();
        boolean z7 = false;
        while (it7.hasNext()) {
            C0274f fVar3 = (C0274f) it7.next();
            U u11 = (U) fVar3.f620a;
            int c8 = C0552a.c(u11.f5066c.f5159N);
            int i6 = u11.f5064a;
            Iterator it8 = it7;
            if (c8 == i6 || !(c8 == 2 || i6 == 2)) {
                arrayList2 = arrayList7;
                fVar3.d();
                it7 = it8;
                arrayList7 = arrayList2;
            } else {
                d o6 = fVar3.o(context);
                if (o6 == null) {
                    fVar3.d();
                } else {
                    Animator animator = (Animator) o6.f4210c;
                    if (animator == null) {
                        arrayList8.add(fVar3);
                    } else {
                        U u12 = (U) fVar3.f620a;
                        boolean equals = Boolean.TRUE.equals(hashMap.get(u12));
                        C0286s sVar3 = u12.f5066c;
                        if (equals) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + sVar3 + " as this Fragment was involved in a Transition.");
                            }
                            fVar3.d();
                        } else {
                            if (u12.f5064a == 3) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            ArrayList arrayList9 = arrayList7;
                            if (z4) {
                                arrayList9.remove(u12);
                            }
                            View view = sVar3.f5159N;
                            viewGroup.startViewTransition(view);
                            animator.addListener(new C0272d(viewGroup, view, z4, u12, fVar3));
                            animator.setTarget(view);
                            animator.start();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Animator from operation " + u12 + " has started.");
                            }
                            ((G.d) fVar3.f621b).a(new d(animator, u12, 2, false));
                            it7 = it8;
                            arrayList7 = arrayList9;
                            z7 = true;
                        }
                    }
                }
                arrayList2 = arrayList7;
                it7 = it8;
                arrayList7 = arrayList2;
            }
        }
        ArrayList arrayList10 = arrayList7;
        Iterator it9 = arrayList8.iterator();
        while (it9.hasNext()) {
            C0274f fVar4 = (C0274f) it9.next();
            U u13 = (U) fVar4.f620a;
            C0286s sVar4 = u13.f5066c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + sVar4 + " as Animations cannot run alongside Transitions.");
                }
                fVar4.d();
            } else if (z7) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + sVar4 + " as Animations cannot run alongside Animators.");
                }
                fVar4.d();
            } else {
                View view2 = sVar4.f5159N;
                d o7 = fVar4.o(context);
                o7.getClass();
                Animation animation = (Animation) o7.f4209b;
                animation.getClass();
                Iterator it10 = it9;
                if (u13.f5064a != 1) {
                    view2.startAnimation(animation);
                    fVar4.d();
                } else {
                    viewGroup.startViewTransition(view2);
                    w wVar = new w(animation, viewGroup, view2);
                    wVar.setAnimationListener(new C0273e(u13, viewGroup, view2, fVar4));
                    view2.startAnimation(wVar);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + u13 + " has started.");
                    }
                }
                ((G.d) fVar4.f621b).a(new z(view2, viewGroup, fVar4, u13, 8));
                it9 = it10;
            }
        }
        Iterator it11 = arrayList10.iterator();
        while (it11.hasNext()) {
            U u14 = (U) it11.next();
            C0552a.a(u14.f5066c.f5159N, u14.f5064a);
        }
        arrayList10.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + u6 + " to " + u7);
        }
    }

    public final void c() {
        if (!this.f5112e) {
            ViewGroup viewGroup = this.f5109a;
            WeakHashMap weakHashMap = O.f1352a;
            if (!viewGroup.isAttachedToWindow()) {
                e();
                this.d = false;
                return;
            }
            synchronized (this.f5110b) {
                try {
                    if (!this.f5110b.isEmpty()) {
                        ArrayList arrayList = new ArrayList(this.f5111c);
                        this.f5111c.clear();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            U u6 = (U) it2.next();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + u6);
                            }
                            u6.a();
                            if (!u6.g) {
                                this.f5111c.add(u6);
                            }
                        }
                        g();
                        ArrayList arrayList2 = new ArrayList(this.f5110b);
                        this.f5110b.clear();
                        this.f5111c.addAll(arrayList2);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            ((U) it3.next()).d();
                        }
                        b(arrayList2, this.d);
                        this.d = false;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final U d(C0286s sVar) {
        Iterator it2 = this.f5110b.iterator();
        while (it2.hasNext()) {
            U u6 = (U) it2.next();
            if (u6.f5066c.equals(sVar) && !u6.f5068f) {
                return u6;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f5109a;
        WeakHashMap weakHashMap = O.f1352a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f5110b) {
            try {
                g();
                Iterator it2 = this.f5110b.iterator();
                while (it2.hasNext()) {
                    ((U) it2.next()).d();
                }
                Iterator it3 = new ArrayList(this.f5111c).iterator();
                while (it3.hasNext()) {
                    U u6 = (U) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f5109a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(u6);
                        Log.v("FragmentManager", sb.toString());
                    }
                    u6.a();
                }
                Iterator it4 = new ArrayList(this.f5110b).iterator();
                while (it4.hasNext()) {
                    U u7 = (U) it4.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f5109a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(u7);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    u7.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        Iterator it2 = this.f5110b.iterator();
        while (it2.hasNext()) {
            U u6 = (U) it2.next();
            if (u6.f5065b == 2) {
                u6.c(C0552a.b(u6.f5066c.R().getVisibility()), 1);
            }
        }
    }
}
