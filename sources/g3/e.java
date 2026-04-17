package g3;

import D2.l;
import E3.b;
import E3.c;
import R2.d;
import S3.n;
import T1.C;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import h3.m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class e implements C0550c {
    public static final n h = new n(1);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8018a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8019b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8020c = new HashMap();
    public final HashSet d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final j f8021e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference f8022f = new AtomicReference();
    public final C g;

    public e(ArrayList arrayList, ArrayList arrayList2, C c3) {
        m mVar = m.f8150a;
        j jVar = new j();
        this.f8021e = jVar;
        this.g = c3;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C0549b.c(jVar, j.class, c.class, b.class));
        arrayList3.add(C0549b.c(this, e.class, new Class[0]));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C0549b bVar = (C0549b) it2.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(it3.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((K3.b) it4.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.g.b(componentRegistrar));
                        it4.remove();
                    }
                } catch (k e6) {
                    it4.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e6);
                }
            }
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                Object[] array = ((C0549b) it5.next()).f8014b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Object obj = array[i2];
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.d.contains(obj.toString())) {
                            it5.remove();
                            break;
                        }
                        this.d.add(obj.toString());
                    }
                    i2++;
                }
            }
            if (this.f8018a.isEmpty()) {
                com.bumptech.glide.c.o(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f8018a.keySet());
                arrayList6.addAll(arrayList3);
                com.bumptech.glide.c.o(arrayList6);
            }
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                C0549b bVar2 = (C0549b) it6.next();
                this.f8018a.put(bVar2, new l(new d(this, bVar2, 1)));
            }
            arrayList5.addAll(k(arrayList3));
            arrayList5.addAll(l());
            j();
        }
        Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            ((Runnable) it7.next()).run();
        }
        Boolean bool = (Boolean) this.f8022f.get();
        if (bool != null) {
            i(this.f8018a, bool.booleanValue());
        }
    }

    public final synchronized K3.b b(p pVar) {
        com.bumptech.glide.d.g(pVar, "Null interface requested.");
        return (K3.b) this.f8019b.get(pVar);
    }

    public final synchronized K3.b f(p pVar) {
        m mVar = (m) this.f8020c.get(pVar);
        if (mVar != null) {
            return mVar;
        }
        return h;
    }

    public final n g(p pVar) {
        K3.b b6 = b(pVar);
        if (b6 == null) {
            return new n(n.f8039c, n.d);
        }
        if (b6 instanceof n) {
            return (n) b6;
        }
        return new n((l) null, b6);
    }

    public final void i(HashMap hashMap, boolean z3) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : hashMap.entrySet()) {
            K3.b bVar = (K3.b) entry.getValue();
            int i2 = ((C0549b) entry.getKey()).d;
            if (i2 == 1 || (i2 == 2 && z3)) {
                bVar.get();
            }
        }
        j jVar = this.f8021e;
        synchronized (jVar) {
            arrayDeque = jVar.f8032b;
            if (arrayDeque != null) {
                jVar.f8032b = null;
            } else {
                arrayDeque = null;
            }
        }
        if (arrayDeque != null) {
            Iterator it2 = arrayDeque.iterator();
            if (it2.hasNext()) {
                throw o3.d.e(it2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [g3.m, java.lang.Object] */
    public final void j() {
        boolean z3;
        for (C0549b bVar : this.f8018a.keySet()) {
            Iterator it2 = bVar.f8015c.iterator();
            while (true) {
                if (it2.hasNext()) {
                    h hVar = (h) it2.next();
                    if (hVar.f8029b == 2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    p pVar = hVar.f8028a;
                    if (z3) {
                        HashMap hashMap = this.f8020c;
                        if (!hashMap.containsKey(pVar)) {
                            Set emptySet = Collections.emptySet();
                            ? obj = new Object();
                            obj.f8038b = null;
                            obj.f8037a = Collections.newSetFromMap(new ConcurrentHashMap());
                            obj.f8037a.addAll(emptySet);
                            hashMap.put(pVar, obj);
                        }
                    }
                    HashMap hashMap2 = this.f8019b;
                    if (hashMap2.containsKey(pVar)) {
                        continue;
                    } else {
                        int i2 = hVar.f8029b;
                        if (i2 == 1) {
                            throw new RuntimeException("Unsatisfied dependency for component " + bVar + ": " + pVar);
                        } else if (i2 != 2) {
                            hashMap2.put(pVar, new n(n.f8039c, n.d));
                        }
                    }
                }
            }
        }
    }

    public final ArrayList k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0549b bVar = (C0549b) it2.next();
            if (bVar.f8016e == 0) {
                K3.b bVar2 = (K3.b) this.f8018a.get(bVar);
                for (p pVar : bVar.f8014b) {
                    HashMap hashMap = this.f8019b;
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, bVar2);
                    } else {
                        arrayList2.add(new B.m((n) ((K3.b) hashMap.get(pVar)), bVar2, 10));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [g3.m, java.lang.Object] */
    public final ArrayList l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f8018a.entrySet()) {
            C0549b bVar = (C0549b) entry.getKey();
            if (bVar.f8016e != 0) {
                K3.b bVar2 = (K3.b) entry.getValue();
                for (p pVar : bVar.f8014b) {
                    if (!hashMap.containsKey(pVar)) {
                        hashMap.put(pVar, new HashSet());
                    }
                    ((Set) hashMap.get(pVar)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.f8020c;
            if (!hashMap2.containsKey(key)) {
                ? obj = new Object();
                obj.f8038b = null;
                obj.f8037a = Collections.newSetFromMap(new ConcurrentHashMap());
                obj.f8037a.addAll((Set) ((Collection) entry2.getValue()));
                hashMap2.put((p) entry2.getKey(), obj);
            } else {
                m mVar = (m) hashMap2.get(entry2.getKey());
                for (K3.b mVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new B.m(mVar, mVar2, 11));
                }
            }
        }
        return arrayList;
    }
}
