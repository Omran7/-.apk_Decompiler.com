package com.bumptech.glide;

import B0.C0004c;
import M0.c;
import Q0.a;
import Q0.e;
import R0.d;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.g;
import com.bumptech.glide.manager.h;
import com.bumptech.glide.manager.o;
import com.bumptech.glide.manager.p;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final class l implements ComponentCallbacks2, h {

    /* renamed from: t  reason: collision with root package name */
    public static final e f5793t;

    /* renamed from: a  reason: collision with root package name */
    public final b f5794a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f5795b;

    /* renamed from: c  reason: collision with root package name */
    public final g f5796c;
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.manager.l f5797e;

    /* renamed from: f  reason: collision with root package name */
    public final p f5798f = new p();

    /* renamed from: p  reason: collision with root package name */
    public final C0004c f5799p;

    /* renamed from: q  reason: collision with root package name */
    public final b f5800q;

    /* renamed from: r  reason: collision with root package name */
    public final CopyOnWriteArrayList f5801r;

    /* renamed from: s  reason: collision with root package name */
    public final e f5802s;

    static {
        e eVar = (e) new a().c(Bitmap.class);
        eVar.f2352x = true;
        f5793t = eVar;
        ((e) new a().c(c.class)).f2352x = true;
        e eVar2 = (e) ((e) ((e) new a().d(B0.p.f285c)).l()).q();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.bumptech.glide.manager.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.bumptech.glide.manager.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.bumptech.glide.manager.c} */
    /* JADX WARNING: type inference failed for: r8v10, types: [Q0.e, Q0.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public l(com.bumptech.glide.b r7, com.bumptech.glide.manager.g r8, com.bumptech.glide.manager.l r9, android.content.Context r10) {
        /*
            r6 = this;
            com.bumptech.glide.manager.o r0 = new com.bumptech.glide.manager.o
            r0.<init>()
            androidx.emoji2.text.v r1 = r7.f5731f
            r6.<init>()
            com.bumptech.glide.manager.p r2 = new com.bumptech.glide.manager.p
            r2.<init>()
            r6.f5798f = r2
            B0.c r2 = new B0.c
            r3 = 20
            r2.<init>((java.lang.Object) r6, (int) r3)
            r6.f5799p = r2
            r6.f5794a = r7
            r6.f5796c = r8
            r6.f5797e = r9
            r6.d = r0
            r6.f5795b = r10
            android.content.Context r9 = r10.getApplicationContext()
            com.bumptech.glide.k r10 = new com.bumptech.glide.k
            r10.<init>(r6, r0)
            r1.getClass()
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = A.h.checkSelfPermission(r9, r0)
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L_0x003c
            r0 = r3
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            java.lang.String r4 = "ConnectivityMonitor"
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r4, r5)
            if (r5 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x004b
            java.lang.String r5 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"
            goto L_0x004d
        L_0x004b:
            java.lang.String r5 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"
        L_0x004d:
            android.util.Log.d(r4, r5)
        L_0x0050:
            if (r0 == 0) goto L_0x0058
            com.bumptech.glide.manager.c r0 = new com.bumptech.glide.manager.c
            r0.<init>(r9, r10)
            goto L_0x005d
        L_0x0058:
            com.bumptech.glide.manager.j r0 = new com.bumptech.glide.manager.j
            r0.<init>()
        L_0x005d:
            r6.f5800q = r0
            java.util.ArrayList r9 = r7.f5732p
            monitor-enter(r9)
            java.util.ArrayList r10 = r7.f5732p     // Catch:{ all -> 0x00d8 }
            boolean r10 = r10.contains(r6)     // Catch:{ all -> 0x00d8 }
            if (r10 != 0) goto L_0x00da
            java.util.ArrayList r10 = r7.f5732p     // Catch:{ all -> 0x00d8 }
            r10.add(r6)     // Catch:{ all -> 0x00d8 }
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            char[] r9 = U0.o.f3697a
            android.os.Looper r9 = android.os.Looper.myLooper()
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            if (r9 != r10) goto L_0x007d
            r1 = r3
        L_0x007d:
            if (r1 != 0) goto L_0x0087
            android.os.Handler r9 = U0.o.f()
            r9.post(r2)
            goto L_0x008a
        L_0x0087:
            r8.b(r6)
        L_0x008a:
            r8.b(r0)
            java.util.concurrent.CopyOnWriteArrayList r8 = new java.util.concurrent.CopyOnWriteArrayList
            com.bumptech.glide.e r9 = r7.f5729c
            java.util.List r9 = r9.f5762e
            r8.<init>(r9)
            r6.f5801r = r8
            com.bumptech.glide.e r7 = r7.f5729c
            monitor-enter(r7)
            Q0.e r8 = r7.f5765j     // Catch:{ all -> 0x00ae }
            if (r8 != 0) goto L_0x00b0
            androidx.fragment.app.D r8 = r7.d     // Catch:{ all -> 0x00ae }
            r8.getClass()     // Catch:{ all -> 0x00ae }
            Q0.e r8 = new Q0.e     // Catch:{ all -> 0x00ae }
            r8.<init>()     // Catch:{ all -> 0x00ae }
            r8.f2352x = r3     // Catch:{ all -> 0x00ae }
            r7.f5765j = r8     // Catch:{ all -> 0x00ae }
            goto L_0x00b0
        L_0x00ae:
            r8 = move-exception
            goto L_0x00d6
        L_0x00b0:
            Q0.e r8 = r7.f5765j     // Catch:{ all -> 0x00ae }
            monitor-exit(r7)
            monitor-enter(r6)
            Q0.a r7 = r8.clone()     // Catch:{ all -> 0x00d3 }
            Q0.e r7 = (Q0.e) r7     // Catch:{ all -> 0x00d3 }
            boolean r8 = r7.f2352x     // Catch:{ all -> 0x00d3 }
            if (r8 == 0) goto L_0x00cb
            boolean r8 = r7.f2353y     // Catch:{ all -> 0x00d3 }
            if (r8 == 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d3 }
            java.lang.String r8 = "You cannot auto lock an already locked options object, try clone() first"
            r7.<init>(r8)     // Catch:{ all -> 0x00d3 }
            throw r7     // Catch:{ all -> 0x00d3 }
        L_0x00cb:
            r7.f2353y = r3     // Catch:{ all -> 0x00d3 }
            r7.f2352x = r3     // Catch:{ all -> 0x00d3 }
            r6.f5802s = r7     // Catch:{ all -> 0x00d3 }
            monitor-exit(r6)
            return
        L_0x00d3:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00d3 }
            throw r7
        L_0x00d6:
            monitor-exit(r7)     // Catch:{ all -> 0x00ae }
            throw r8
        L_0x00d8:
            r7 = move-exception
            goto L_0x00e2
        L_0x00da:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d8 }
            java.lang.String r8 = "Cannot register already registered manager"
            r7.<init>(r8)     // Catch:{ all -> 0x00d8 }
            throw r7     // Catch:{ all -> 0x00d8 }
        L_0x00e2:
            monitor-exit(r9)     // Catch:{ all -> 0x00d8 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.<init>(com.bumptech.glide.b, com.bumptech.glide.manager.g, com.bumptech.glide.manager.l, android.content.Context):void");
    }

    public final synchronized void c() {
        this.f5798f.c();
        o();
    }

    public final synchronized void j() {
        p();
        this.f5798f.j();
    }

    public final synchronized void k() {
        this.f5798f.k();
        n();
        o oVar = this.d;
        Iterator it2 = U0.o.e((Set) oVar.f5844c).iterator();
        while (it2.hasNext()) {
            oVar.a((Q0.c) it2.next());
        }
        ((HashSet) oVar.d).clear();
        this.f5796c.e(this);
        this.f5796c.e(this.f5800q);
        U0.o.f().removeCallbacks(this.f5799p);
        b bVar = this.f5794a;
        synchronized (bVar.f5732p) {
            if (bVar.f5732p.contains(this)) {
                bVar.f5732p.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public final j l() {
        return new j(this.f5794a, this, Bitmap.class, this.f5795b).a(f5793t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        r5.d((Q0.c) null);
        r1.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(R0.d r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r4.q(r5)
            Q0.c r1 = r5.g()
            if (r0 != 0) goto L_0x003b
            com.bumptech.glide.b r0 = r4.f5794a
            java.util.ArrayList r2 = r0.f5732p
            monitor-enter(r2)
            java.util.ArrayList r0 = r0.f5732p     // Catch:{ all -> 0x002c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002c }
        L_0x0018:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x002c }
            com.bumptech.glide.l r3 = (com.bumptech.glide.l) r3     // Catch:{ all -> 0x002c }
            boolean r3 = r3.q(r5)     // Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0018
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            goto L_0x003b
        L_0x002c:
            r5 = move-exception
            goto L_0x0039
        L_0x002e:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x003b
            r0 = 0
            r5.d(r0)
            r1.clear()
            goto L_0x003b
        L_0x0039:
            monitor-exit(r2)     // Catch:{ all -> 0x002c }
            throw r5
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.l.m(R0.d):void");
    }

    public final synchronized void n() {
        try {
            Iterator it2 = U0.o.e(this.f5798f.f5845a).iterator();
            while (it2.hasNext()) {
                m((d) it2.next());
            }
            this.f5798f.f5845a.clear();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void o() {
        o oVar = this.d;
        oVar.f5843b = true;
        Iterator it2 = U0.o.e((Set) oVar.f5844c).iterator();
        while (it2.hasNext()) {
            Q0.c cVar = (Q0.c) it2.next();
            if (cVar.isRunning()) {
                cVar.g();
                ((HashSet) oVar.d).add(cVar);
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i2) {
    }

    public final synchronized void p() {
        o oVar = this.d;
        oVar.f5843b = false;
        Iterator it2 = U0.o.e((Set) oVar.f5844c).iterator();
        while (it2.hasNext()) {
            Q0.c cVar = (Q0.c) it2.next();
            if (!cVar.k() && !cVar.isRunning()) {
                cVar.h();
            }
        }
        ((HashSet) oVar.d).clear();
    }

    public final synchronized boolean q(d dVar) {
        Q0.c g = dVar.g();
        if (g == null) {
            return true;
        }
        if (!this.d.a(g)) {
            return false;
        }
        this.f5798f.f5845a.remove(dVar);
        dVar.d((Q0.c) null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.d + ", treeNode=" + this.f5797e + "}";
    }
}
