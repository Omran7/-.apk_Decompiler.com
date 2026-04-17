package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class f implements Iterable {

    /* renamed from: a  reason: collision with root package name */
    public c f9838a;

    /* renamed from: b  reason: collision with root package name */
    public c f9839b;

    /* renamed from: c  reason: collision with root package name */
    public final WeakHashMap f9840c = new WeakHashMap();
    public int d = 0;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((m.b) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof m.f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            m.f r7 = (m.f) r7
            int r1 = r6.d
            int r3 = r7.d
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            m.b r3 = (m.b) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            m.b r4 = (m.b) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            m.b r7 = (m.b) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = r2
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it2 = iterator();
        int i2 = 0;
        while (true) {
            b bVar = (b) it2;
            if (!bVar.hasNext()) {
                return i2;
            }
            i2 += ((Map.Entry) bVar.next()).hashCode();
        }
    }

    public final Iterator iterator() {
        b bVar = new b(this.f9838a, this.f9839b, 0);
        this.f9840c.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public c k(Object obj) {
        c cVar = this.f9838a;
        while (cVar != null && !cVar.f9832a.equals(obj)) {
            cVar = cVar.f9834c;
        }
        return cVar;
    }

    public Object t(Object obj) {
        c k6 = k(obj);
        if (k6 == null) {
            return null;
        }
        this.d--;
        WeakHashMap weakHashMap = this.f9840c;
        if (!weakHashMap.isEmpty()) {
            for (e a6 : weakHashMap.keySet()) {
                a6.a(k6);
            }
        }
        c cVar = k6.d;
        if (cVar != null) {
            cVar.f9834c = k6.f9834c;
        } else {
            this.f9838a = k6.f9834c;
        }
        c cVar2 = k6.f9834c;
        if (cVar2 != null) {
            cVar2.d = cVar;
        } else {
            this.f9839b = cVar;
        }
        k6.f9834c = null;
        k6.d = null;
        return k6.f9833b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it2 = iterator();
        while (true) {
            b bVar = (b) it2;
            if (bVar.hasNext()) {
                sb.append(((Map.Entry) bVar.next()).toString());
                if (bVar.hasNext()) {
                    sb.append(", ");
                }
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
