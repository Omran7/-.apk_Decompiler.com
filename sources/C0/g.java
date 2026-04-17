package C0;

import I3.h;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final h f407a = new h(3);

    /* renamed from: b  reason: collision with root package name */
    public final f f408b = new f(0);

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f409c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f410e;

    /* renamed from: f  reason: collision with root package name */
    public int f411f;

    public g(int i2) {
        this.f410e = i2;
    }

    public final void a(int i2, Class cls) {
        NavigableMap f6 = f(cls);
        Integer num = (Integer) f6.get(Integer.valueOf(i2));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i2 + ", this: " + this);
        } else if (num.intValue() == 1) {
            f6.remove(Integer.valueOf(i2));
        } else {
            f6.put(Integer.valueOf(i2), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void b(int i2) {
        while (this.f411f > i2) {
            Object K6 = this.f407a.K();
            U0.g.b(K6);
            c d6 = d(K6.getClass());
            this.f411f -= d6.b() * d6.a(K6);
            a(d6.a(K6), K6.getClass());
            if (Log.isLoggable(d6.c(), 2)) {
                Log.v(d6.c(), "evicted: " + d6.a(K6));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.intValue() <= (r4 * 8)) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Object c(int r4, java.lang.Class r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.NavigableMap r0 = r3.f(r5)     // Catch:{ all -> 0x0041 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0041 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0041 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0043
            int r1 = r3.f411f     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0024
            int r2 = r3.f410e     // Catch:{ all -> 0x0041 }
            int r2 = r2 / r1
            r1 = 2
            if (r2 < r1) goto L_0x001c
            goto L_0x0024
        L_0x001c:
            int r1 = r0.intValue()     // Catch:{ all -> 0x0041 }
            int r2 = r4 * 8
            if (r1 > r2) goto L_0x0043
        L_0x0024:
            C0.f r4 = r3.f408b     // Catch:{ all -> 0x0041 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r4.f398a     // Catch:{ all -> 0x0041 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0041 }
            C0.j r1 = (C0.j) r1     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x003a
            C0.j r1 = r4.p()     // Catch:{ all -> 0x0041 }
        L_0x003a:
            C0.e r1 = (C0.e) r1     // Catch:{ all -> 0x0041 }
            r1.f404b = r0     // Catch:{ all -> 0x0041 }
            r1.f405c = r5     // Catch:{ all -> 0x0041 }
            goto L_0x005b
        L_0x0041:
            r4 = move-exception
            goto L_0x0061
        L_0x0043:
            C0.f r0 = r3.f408b     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r0.f398a     // Catch:{ all -> 0x0041 }
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0041 }
            C0.j r1 = (C0.j) r1     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x0055
            C0.j r1 = r0.p()     // Catch:{ all -> 0x0041 }
        L_0x0055:
            C0.e r1 = (C0.e) r1     // Catch:{ all -> 0x0041 }
            r1.f404b = r4     // Catch:{ all -> 0x0041 }
            r1.f405c = r5     // Catch:{ all -> 0x0041 }
        L_0x005b:
            java.lang.Object r4 = r3.e(r1, r5)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)
            return r4
        L_0x0061:
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: C0.g.c(int, java.lang.Class):java.lang.Object");
    }

    public final c d(Class cls) {
        HashMap hashMap = this.d;
        c cVar = (c) hashMap.get(cls);
        if (cVar == null) {
            if (cls.equals(int[].class)) {
                cVar = new c(1);
            } else if (cls.equals(byte[].class)) {
                cVar = new c(0);
            } else {
                throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
            }
            hashMap.put(cls, cVar);
        }
        return cVar;
    }

    public final Object e(e eVar, Class cls) {
        Object obj;
        c d6 = d(cls);
        Object j6 = this.f407a.j(eVar);
        if (j6 != null) {
            this.f411f -= d6.b() * d6.a(j6);
            a(d6.a(j6), cls);
        }
        if (j6 != null) {
            return j6;
        }
        if (Log.isLoggable(d6.c(), 2)) {
            Log.v(d6.c(), "Allocated " + eVar.f404b + " bytes");
        }
        int i2 = eVar.f404b;
        switch (d6.f399a) {
            case 0:
                obj = new byte[i2];
                break;
            default:
                obj = new int[i2];
                break;
        }
        return obj;
    }

    public final NavigableMap f(Class cls) {
        HashMap hashMap = this.f409c;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        hashMap.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized void g(Object obj) {
        Class<?> cls = obj.getClass();
        c d6 = d(cls);
        int a6 = d6.a(obj);
        int b6 = d6.b() * a6;
        if (b6 <= this.f410e / 2) {
            f fVar = this.f408b;
            j jVar = (j) ((ArrayDeque) fVar.f398a).poll();
            if (jVar == null) {
                jVar = fVar.p();
            }
            e eVar = (e) jVar;
            eVar.f404b = a6;
            eVar.f405c = cls;
            this.f407a.E(eVar, obj);
            NavigableMap f6 = f(cls);
            Integer num = (Integer) f6.get(Integer.valueOf(eVar.f404b));
            Integer valueOf = Integer.valueOf(eVar.f404b);
            int i2 = 1;
            if (num != null) {
                i2 = 1 + num.intValue();
            }
            f6.put(valueOf, Integer.valueOf(i2));
            this.f411f += b6;
            b(this.f410e);
        }
    }
}
