package n;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.j;
import o.b;
import o.c;

public class i {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final b lock;
    private final c map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    /* JADX WARNING: type inference failed for: r2v3, types: [o.b, java.lang.Object] */
    public i(int i2) {
        this.maxSize = i2;
        if (i2 > 0) {
            this.map = new c();
            this.lock = new Object();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int a(Object obj, Object obj2) {
        int sizeOf = sizeOf(obj, obj2);
        if (sizeOf >= 0) {
            return sizeOf;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public Object create(Object obj) {
        j.e(obj, "key");
        return null;
    }

    public final int createCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.createCount;
        }
        return i2;
    }

    public void entryRemoved(boolean z3, Object obj, Object obj2, Object obj3) {
        j.e(obj, "key");
        j.e(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.evictionCount;
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = create(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r1 = r5.lock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.createCount++;
        r2 = r5.map;
        r2.getClass();
        r2 = r2.f10416a.put(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r2 == null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        r3 = r5.map;
        r3.getClass();
        r3.f10416a.put(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r5.size += a(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        if (r2 == null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        entryRemoved(false, r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0063, code lost:
        trimToSize(r5.maxSize);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.j.e(r6, r0)
            o.b r0 = r5.lock
            monitor-enter(r0)
            o.c r1 = r5.map     // Catch:{ all -> 0x001d }
            r1.getClass()     // Catch:{ all -> 0x001d }
            java.util.LinkedHashMap r1 = r1.f10416a     // Catch:{ all -> 0x001d }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            int r6 = r5.hitCount     // Catch:{ all -> 0x001d }
            int r6 = r6 + 1
            r5.hitCount = r6     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            return r1
        L_0x001d:
            r6 = move-exception
            goto L_0x006b
        L_0x001f:
            int r1 = r5.missCount     // Catch:{ all -> 0x001d }
            int r1 = r1 + 1
            r5.missCount = r1     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            java.lang.Object r0 = r5.create(r6)
            if (r0 != 0) goto L_0x002e
            r6 = 0
            return r6
        L_0x002e:
            o.b r1 = r5.lock
            monitor-enter(r1)
            int r2 = r5.createCount     // Catch:{ all -> 0x004f }
            int r2 = r2 + 1
            r5.createCount = r2     // Catch:{ all -> 0x004f }
            o.c r2 = r5.map     // Catch:{ all -> 0x004f }
            r2.getClass()     // Catch:{ all -> 0x004f }
            java.util.LinkedHashMap r2 = r2.f10416a     // Catch:{ all -> 0x004f }
            java.lang.Object r2 = r2.put(r6, r0)     // Catch:{ all -> 0x004f }
            if (r2 == 0) goto L_0x0051
            o.c r3 = r5.map     // Catch:{ all -> 0x004f }
            r3.getClass()     // Catch:{ all -> 0x004f }
            java.util.LinkedHashMap r3 = r3.f10416a     // Catch:{ all -> 0x004f }
            r3.put(r6, r2)     // Catch:{ all -> 0x004f }
            goto L_0x005a
        L_0x004f:
            r6 = move-exception
            goto L_0x0069
        L_0x0051:
            int r3 = r5.size     // Catch:{ all -> 0x004f }
            int r4 = r5.a(r6, r0)     // Catch:{ all -> 0x004f }
            int r3 = r3 + r4
            r5.size = r3     // Catch:{ all -> 0x004f }
        L_0x005a:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0063
            r1 = 0
            r5.entryRemoved(r1, r6, r0, r2)
            r0 = r2
            goto L_0x0068
        L_0x0063:
            int r6 = r5.maxSize
            r5.trimToSize(r6)
        L_0x0068:
            return r0
        L_0x0069:
            monitor-exit(r1)
            throw r6
        L_0x006b:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n.i.get(java.lang.Object):java.lang.Object");
    }

    public final int hitCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.hitCount;
        }
        return i2;
    }

    public final int maxSize() {
        int i2;
        synchronized (this.lock) {
            i2 = this.maxSize;
        }
        return i2;
    }

    public final int missCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.missCount;
        }
        return i2;
    }

    public final Object put(Object obj, Object obj2) {
        Object put;
        j.e(obj, "key");
        j.e(obj2, "value");
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            c cVar = this.map;
            cVar.getClass();
            put = cVar.f10416a.put(obj, obj2);
            if (put != null) {
                this.size -= a(obj, put);
            }
        }
        if (put != null) {
            entryRemoved(false, obj, put, obj2);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i2;
        synchronized (this.lock) {
            i2 = this.putCount;
        }
        return i2;
    }

    public final Object remove(Object obj) {
        Object remove;
        j.e(obj, "key");
        synchronized (this.lock) {
            c cVar = this.map;
            cVar.getClass();
            remove = cVar.f10416a.remove(obj);
            if (remove != null) {
                this.size -= a(obj, remove);
            }
        }
        if (remove != null) {
            entryRemoved(false, obj, remove, (Object) null);
        }
        return remove;
    }

    public void resize(int i2) {
        if (i2 > 0) {
            synchronized (this.lock) {
                this.maxSize = i2;
            }
            trimToSize(i2);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final int size() {
        int i2;
        synchronized (this.lock) {
            i2 = this.size;
        }
        return i2;
    }

    public int sizeOf(Object obj, Object obj2) {
        j.e(obj, "key");
        j.e(obj2, "value");
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.lock) {
            Set<Map.Entry> entrySet = this.map.f10416a.entrySet();
            j.d(entrySet, "map.entries");
            for (Map.Entry entry : entrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        int i2;
        String str;
        synchronized (this.lock) {
            try {
                int i5 = this.hitCount;
                int i6 = this.missCount + i5;
                if (i6 != 0) {
                    i2 = (i5 * 100) / i6;
                } else {
                    i2 = 0;
                }
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + i2 + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0094, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f A[SYNTHETIC, Splitter:B:31:0x005f] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x005d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L_0x0000:
            o.b r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch:{ all -> 0x0016 }
            if (r1 < 0) goto L_0x008d
            o.c r1 = r6.map     // Catch:{ all -> 0x0016 }
            java.util.LinkedHashMap r1 = r1.f10416a     // Catch:{ all -> 0x0016 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0019
            int r1 = r6.size     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x008d
            goto L_0x0019
        L_0x0016:
            r7 = move-exception
            goto L_0x0095
        L_0x0019:
            int r1 = r6.size     // Catch:{ all -> 0x0016 }
            if (r1 <= r7) goto L_0x008b
            o.c r1 = r6.map     // Catch:{ all -> 0x0016 }
            java.util.LinkedHashMap r1 = r1.f10416a     // Catch:{ all -> 0x0016 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0028
            goto L_0x008b
        L_0x0028:
            o.c r1 = r6.map     // Catch:{ all -> 0x0016 }
            java.util.LinkedHashMap r1 = r1.f10416a     // Catch:{ all -> 0x0016 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = "map.entries"
            kotlin.jvm.internal.j.d(r1, r2)     // Catch:{ all -> 0x0016 }
            boolean r2 = r1 instanceof java.util.List     // Catch:{ all -> 0x0016 }
            r3 = 0
            if (r2 == 0) goto L_0x004a
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0016 }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0044
        L_0x0042:
            r1 = r3
            goto L_0x0059
        L_0x0044:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0016 }
            goto L_0x0059
        L_0x004a:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0016 }
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0016 }
            if (r2 != 0) goto L_0x0055
            goto L_0x0042
        L_0x0055:
            java.lang.Object r1 = r1.next()     // Catch:{ all -> 0x0016 }
        L_0x0059:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x005f
            monitor-exit(r0)
            return
        L_0x005f:
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0016 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0016 }
            o.c r4 = r6.map     // Catch:{ all -> 0x0016 }
            r4.getClass()     // Catch:{ all -> 0x0016 }
            java.lang.String r5 = "key"
            kotlin.jvm.internal.j.e(r2, r5)     // Catch:{ all -> 0x0016 }
            java.util.LinkedHashMap r4 = r4.f10416a     // Catch:{ all -> 0x0016 }
            r4.remove(r2)     // Catch:{ all -> 0x0016 }
            int r4 = r6.size     // Catch:{ all -> 0x0016 }
            int r5 = r6.a(r2, r1)     // Catch:{ all -> 0x0016 }
            int r4 = r4 - r5
            r6.size = r4     // Catch:{ all -> 0x0016 }
            int r4 = r6.evictionCount     // Catch:{ all -> 0x0016 }
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)
            r6.entryRemoved(r5, r2, r1, r3)
            goto L_0x0000
        L_0x008b:
            monitor-exit(r0)
            return
        L_0x008d:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0016 }
            r1.<init>(r7)     // Catch:{ all -> 0x0016 }
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x0095:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n.i.trimToSize(int):void");
    }
}
