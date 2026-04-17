package androidx.lifecycle;

import android.os.Looper;
import h0.C0552a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.j;
import l.C0777a;
import m.C0798a;
import m.b;
import m.c;
import m.d;

/* renamed from: androidx.lifecycle.u  reason: case insensitive filesystem */
public final class C0309u {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5276a = true;

    /* renamed from: b  reason: collision with root package name */
    public C0798a f5277b = new C0798a();

    /* renamed from: c  reason: collision with root package name */
    public C0303n f5278c = C0303n.f5269b;
    public final WeakReference d;

    /* renamed from: e  reason: collision with root package name */
    public int f5279e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5280f;
    public boolean g;
    public final ArrayList h = new ArrayList();

    public C0309u(C0307s sVar) {
        new AtomicReference();
        this.d = new WeakReference(sVar);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.lifecycle.t, java.lang.Object] */
    public final void a(r rVar) {
        C0306q qVar;
        C0307s sVar;
        ArrayList arrayList = this.h;
        Object obj = null;
        c("addObserver");
        C0303n nVar = this.f5278c;
        C0303n nVar2 = C0303n.f5268a;
        if (nVar != nVar2) {
            nVar2 = C0303n.f5269b;
        }
        ? obj2 = new Object();
        HashMap hashMap = v.f5281a;
        boolean z3 = rVar instanceof C0306q;
        boolean z4 = rVar instanceof C0294e;
        boolean z5 = false;
        if (z3 && z4) {
            qVar = new DefaultLifecycleObserverAdapter((C0294e) rVar, (C0306q) rVar);
        } else if (z4) {
            qVar = new DefaultLifecycleObserverAdapter((C0294e) rVar, (C0306q) null);
        } else if (z3) {
            qVar = (C0306q) rVar;
        } else {
            Class<?> cls = rVar.getClass();
            if (v.b(cls) == 2) {
                Object obj3 = v.f5282b.get(cls);
                j.b(obj3);
                List list = (List) obj3;
                if (list.size() != 1) {
                    int size = list.size();
                    C0297h[] hVarArr = new C0297h[size];
                    if (size <= 0) {
                        qVar = new CompositeGeneratedAdaptersObserver(hVarArr);
                    } else {
                        v.a((Constructor) list.get(0), rVar);
                        throw null;
                    }
                } else {
                    v.a((Constructor) list.get(0), rVar);
                    throw null;
                }
            } else {
                qVar = new ReflectiveGenericLifecycleObserver(rVar);
            }
        }
        obj2.f5275b = qVar;
        obj2.f5274a = nVar2;
        C0798a aVar = this.f5277b;
        c k6 = aVar.k(rVar);
        if (k6 != null) {
            obj = k6.f9833b;
        } else {
            HashMap hashMap2 = aVar.f9828e;
            c cVar = new c(rVar, obj2);
            aVar.d++;
            c cVar2 = aVar.f9839b;
            if (cVar2 == null) {
                aVar.f9838a = cVar;
                aVar.f9839b = cVar;
            } else {
                cVar2.f9834c = cVar;
                cVar.d = cVar2;
                aVar.f9839b = cVar;
            }
            hashMap2.put(rVar, cVar);
        }
        if (((C0308t) obj) == null && (sVar = (C0307s) this.d.get()) != null) {
            if (this.f5279e != 0 || this.f5280f) {
                z5 = true;
            }
            C0303n b6 = b(rVar);
            this.f5279e++;
            while (obj2.f5274a.compareTo(b6) < 0 && this.f5277b.f9828e.containsKey(rVar)) {
                arrayList.add(obj2.f5274a);
                C0300k kVar = C0302m.Companion;
                C0303n nVar3 = obj2.f5274a;
                kVar.getClass();
                C0302m a6 = C0300k.a(nVar3);
                if (a6 != null) {
                    obj2.a(sVar, a6);
                    arrayList.remove(arrayList.size() - 1);
                    b6 = b(rVar);
                } else {
                    throw new IllegalStateException("no event up from " + obj2.f5274a);
                }
            }
            if (!z5) {
                h();
            }
            this.f5279e--;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: androidx.lifecycle.n} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.lifecycle.C0303n b(androidx.lifecycle.r r4) {
        /*
            r3 = this;
            m.a r0 = r3.f5277b
            java.util.HashMap r0 = r0.f9828e
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L_0x0014
            java.lang.Object r4 = r0.get(r4)
            m.c r4 = (m.c) r4
            m.c r4 = r4.d
            goto L_0x0015
        L_0x0014:
            r4 = r2
        L_0x0015:
            if (r4 == 0) goto L_0x0020
            java.lang.Object r4 = r4.f9833b
            androidx.lifecycle.t r4 = (androidx.lifecycle.C0308t) r4
            if (r4 == 0) goto L_0x0020
            androidx.lifecycle.n r4 = r4.f5274a
            goto L_0x0021
        L_0x0020:
            r4 = r2
        L_0x0021:
            java.util.ArrayList r0 = r3.h
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0036
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            androidx.lifecycle.n r2 = (androidx.lifecycle.C0303n) r2
        L_0x0036:
            androidx.lifecycle.n r0 = r3.f5278c
            java.lang.String r1 = "state1"
            kotlin.jvm.internal.j.e(r0, r1)
            if (r4 == 0) goto L_0x0046
            int r1 = r4.compareTo(r0)
            if (r1 >= 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r4 = r0
        L_0x0047:
            if (r2 == 0) goto L_0x0050
            int r0 = r2.compareTo(r4)
            if (r0 >= 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r2 = r4
        L_0x0051:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0309u.b(androidx.lifecycle.r):androidx.lifecycle.n");
    }

    public final void c(String str) {
        if (this.f5276a) {
            C0777a.z0().f9659i.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(C0552a.o("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(C0302m mVar) {
        j.e(mVar, "event");
        c("handleLifecycleEvent");
        e(mVar.a());
    }

    public final void e(C0303n nVar) {
        C0303n nVar2 = this.f5278c;
        if (nVar2 != nVar) {
            C0303n nVar3 = C0303n.f5269b;
            C0303n nVar4 = C0303n.f5268a;
            if (nVar2 == nVar3 && nVar == nVar4) {
                throw new IllegalStateException(("no event down from " + this.f5278c + " in component " + this.d.get()).toString());
            }
            this.f5278c = nVar;
            if (this.f5280f || this.f5279e != 0) {
                this.g = true;
                return;
            }
            this.f5280f = true;
            h();
            this.f5280f = false;
            if (this.f5278c == nVar4) {
                this.f5277b = new C0798a();
            }
        }
    }

    public final void f(r rVar) {
        j.e(rVar, "observer");
        c("removeObserver");
        this.f5277b.t(rVar);
    }

    public final void g() {
        C0303n nVar = C0303n.f5270c;
        c("setCurrentState");
        e(nVar);
    }

    public final void h() {
        C0302m mVar;
        C0307s sVar = (C0307s) this.d.get();
        if (sVar != null) {
            while (true) {
                C0798a aVar = this.f5277b;
                if (aVar.d != 0) {
                    c cVar = aVar.f9838a;
                    j.b(cVar);
                    C0303n nVar = ((C0308t) cVar.f9833b).f5274a;
                    c cVar2 = this.f5277b.f9839b;
                    j.b(cVar2);
                    C0303n nVar2 = ((C0308t) cVar2.f9833b).f5274a;
                    if (nVar == nVar2 && this.f5278c == nVar2) {
                        break;
                    }
                    this.g = false;
                    C0303n nVar3 = this.f5278c;
                    c cVar3 = this.f5277b.f9838a;
                    j.b(cVar3);
                    if (nVar3.compareTo(((C0308t) cVar3.f9833b).f5274a) < 0) {
                        C0798a aVar2 = this.f5277b;
                        b bVar = new b(aVar2.f9839b, aVar2.f9838a, 1);
                        aVar2.f9840c.put(bVar, Boolean.FALSE);
                        while (bVar.hasNext() && !this.g) {
                            Map.Entry entry = (Map.Entry) bVar.next();
                            j.d(entry, "next()");
                            r rVar = (r) entry.getKey();
                            C0308t tVar = (C0308t) entry.getValue();
                            while (tVar.f5274a.compareTo(this.f5278c) > 0 && !this.g && this.f5277b.f9828e.containsKey(rVar)) {
                                C0300k kVar = C0302m.Companion;
                                C0303n nVar4 = tVar.f5274a;
                                kVar.getClass();
                                j.e(nVar4, "state");
                                int ordinal = nVar4.ordinal();
                                if (ordinal == 2) {
                                    mVar = C0302m.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    mVar = C0302m.ON_STOP;
                                } else if (ordinal != 4) {
                                    mVar = null;
                                } else {
                                    mVar = C0302m.ON_PAUSE;
                                }
                                if (mVar != null) {
                                    this.h.add(mVar.a());
                                    tVar.a(sVar, mVar);
                                    ArrayList arrayList = this.h;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event down from " + tVar.f5274a);
                                }
                            }
                        }
                    }
                    c cVar4 = this.f5277b.f9839b;
                    if (!this.g && cVar4 != null && this.f5278c.compareTo(((C0308t) cVar4.f9833b).f5274a) > 0) {
                        C0798a aVar3 = this.f5277b;
                        aVar3.getClass();
                        d dVar = new d(aVar3);
                        aVar3.f9840c.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.g) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            r rVar2 = (r) entry2.getKey();
                            C0308t tVar2 = (C0308t) entry2.getValue();
                            while (tVar2.f5274a.compareTo(this.f5278c) < 0 && !this.g && this.f5277b.f9828e.containsKey(rVar2)) {
                                this.h.add(tVar2.f5274a);
                                C0300k kVar2 = C0302m.Companion;
                                C0303n nVar5 = tVar2.f5274a;
                                kVar2.getClass();
                                C0302m a6 = C0300k.a(nVar5);
                                if (a6 != null) {
                                    tVar2.a(sVar, a6);
                                    ArrayList arrayList2 = this.h;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    throw new IllegalStateException("no event up from " + tVar2.f5274a);
                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
            this.g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }
}
