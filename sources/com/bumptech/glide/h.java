package com.bumptech.glide;

import B0.C0009h;
import F0.s;
import F0.u;
import F0.v;
import N0.c;
import P0.a;
import P0.b;
import P0.d;
import T1.B;
import T1.C;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import x1.i;
import z0.C1126b;
import z0.k;
import z0.l;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final v f5770a;

    /* renamed from: b  reason: collision with root package name */
    public final c f5771b;

    /* renamed from: c  reason: collision with root package name */
    public final I3.h f5772c;
    public final c d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.load.data.h f5773e;

    /* renamed from: f  reason: collision with root package name */
    public final c f5774f;
    public final i g;
    public final I3.h h = new I3.h(20);

    /* renamed from: i  reason: collision with root package name */
    public final b f5775i = new b();

    /* renamed from: j  reason: collision with root package name */
    public final C0009h f5776j;

    public h() {
        C0009h hVar = new C0009h(new J.c(20), new C(24), new B(25), 26, false);
        this.f5776j = hVar;
        this.f5770a = new v(hVar);
        this.f5771b = new c(1);
        this.f5772c = new I3.h(21);
        this.d = new c(2);
        this.f5773e = new com.bumptech.glide.load.data.h();
        this.f5774f = new c(0);
        this.g = new i(26);
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        I3.h hVar2 = this.f5772c;
        synchronized (hVar2) {
            try {
                ArrayList arrayList2 = new ArrayList((ArrayList) hVar2.f1179b);
                ((ArrayList) hVar2.f1179b).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) hVar2.f1179b).add((String) it2.next());
                }
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String str = (String) it3.next();
                    if (!arrayList.contains(str)) {
                        ((ArrayList) hVar2.f1179b).add(str);
                    }
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 123 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Class r4, java.lang.Class r5, F0.t r6) {
        /*
            r3 = this;
            F0.v r0 = r3.f5770a
            monitor-enter(r0)
            F0.y r1 = r0.f708a     // Catch:{ all -> 0x001e }
            monitor-enter(r1)     // Catch:{ all -> 0x001e }
            F0.x r2 = new F0.x     // Catch:{ all -> 0x0022 }
            r2.<init>(r4, r5, r6)     // Catch:{ all -> 0x0022 }
            java.util.ArrayList r4 = r1.f721a     // Catch:{ all -> 0x0022 }
            int r5 = r4.size()     // Catch:{ all -> 0x0022 }
            r4.add(r5, r2)     // Catch:{ all -> 0x0022 }
            monitor-exit(r1)     // Catch:{ all -> 0x001e }
            B0.A r4 = r0.f709b     // Catch:{ all -> 0x001e }
            java.util.HashMap r4 = r4.f175a     // Catch:{ all -> 0x001e }
            r4.clear()     // Catch:{ all -> 0x001e }
            monitor-exit(r0)
            return
        L_0x001e:
            r4 = move-exception
            goto L_0x0024
        L_0x0020:
            monitor-exit(r1)     // Catch:{ all -> 0x0022 }
            throw r4     // Catch:{ all -> 0x001e }
        L_0x0022:
            r4 = move-exception
            goto L_0x0020
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x001e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.h.a(java.lang.Class, java.lang.Class, F0.t):void");
    }

    public final void b(Class cls, C1126b bVar) {
        c cVar = this.f5771b;
        synchronized (cVar) {
            cVar.f1893a.add(new a(cls, bVar));
        }
    }

    public final void c(Class cls, l lVar) {
        c cVar = this.d;
        synchronized (cVar) {
            cVar.f1893a.add(new d(cls, lVar));
        }
    }

    public final void d(String str, Class cls, Class cls2, k kVar) {
        I3.h hVar = this.f5772c;
        synchronized (hVar) {
            hVar.m(str).add(new P0.c(cls, cls2, kVar));
        }
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 116 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList e() {
        /*
            r2 = this;
            x1.i r0 = r2.g
            monitor-enter(r0)
            java.lang.Object r1 = r0.f12553b     // Catch:{ all -> 0x0019 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0019 }
            monitor-exit(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000f
            return r1
        L_0x000f:
            com.bumptech.glide.g r0 = new com.bumptech.glide.g
            java.lang.String r1 = "Failed to find image header parser."
            r0.<init>(r1)
            throw r0
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r1
        L_0x0019:
            r1 = move-exception
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.h.e():java.util.ArrayList");
    }

    public final List f(Object obj) {
        List list;
        v vVar = this.f5770a;
        vVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (vVar) {
            u uVar = (u) vVar.f709b.f175a.get(cls);
            if (uVar == null) {
                list = null;
            } else {
                list = uVar.f707a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(vVar.f708a.b(cls));
                if (((u) vVar.f709b.f175a.put(cls, new u(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z3 = true;
            for (int i2 = 0; i2 < size; i2++) {
                s sVar = (s) list.get(i2);
                if (sVar.b(obj)) {
                    if (z3) {
                        emptyList = new ArrayList(size - i2);
                        z3 = false;
                    }
                    emptyList.add(sVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new RuntimeException("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }
        throw new RuntimeException("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
    }

    public final g g(Object obj) {
        g a6;
        com.bumptech.glide.load.data.h hVar = this.f5773e;
        synchronized (hVar) {
            try {
                U0.g.b(obj);
                f fVar = (f) ((HashMap) hVar.f5814b).get(obj.getClass());
                if (fVar == null) {
                    Iterator it2 = ((HashMap) hVar.f5814b).values().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        f fVar2 = (f) it2.next();
                        if (fVar2.b().isAssignableFrom(obj.getClass())) {
                            fVar = fVar2;
                            break;
                        }
                    }
                }
                if (fVar == null) {
                    fVar = com.bumptech.glide.load.data.h.f5812c;
                }
                a6 = fVar.a(obj);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return a6;
    }

    public final void h(f fVar) {
        com.bumptech.glide.load.data.h hVar = this.f5773e;
        synchronized (hVar) {
            ((HashMap) hVar.f5814b).put(fVar.b(), fVar);
        }
    }

    public final void i(Class cls, Class cls2, N0.a aVar) {
        c cVar = this.f5774f;
        synchronized (cVar) {
            cVar.f1893a.add(new N0.b(cls, cls2, aVar));
        }
    }
}
