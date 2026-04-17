package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class N extends LinkedHashMap {

    /* renamed from: b  reason: collision with root package name */
    public static final N f6762b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f6763a = true;

    static {
        N n2 = new N();
        f6762b = n2;
        n2.f6763a = false;
    }

    public static int a(Object obj) {
        if (obj instanceof byte[]) {
            Charset charset = B.f6742a;
            int i2 = r1;
            for (byte b6 : (byte[]) obj) {
                i2 = (i2 * 31) + b6;
            }
            if (i2 == 0) {
                return 1;
            }
            return i2;
        } else if (!(obj instanceof C0420z)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        if (!this.f6763a) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.LinkedHashMap, com.google.crypto.tink.shaded.protobuf.N] */
    public final N c() {
        if (isEmpty()) {
            return new N();
        }
        ? linkedHashMap = new LinkedHashMap(this);
        linkedHashMap.f6763a = true;
        return linkedHashMap;
    }

    public final void clear() {
        b();
        super.clear();
    }

    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.emptySet();
        }
        return super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L_0x005e
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 != r7) goto L_0x000c
        L_0x000a:
            r7 = r0
            goto L_0x005b
        L_0x000c:
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L_0x0018
        L_0x0016:
            r7 = r1
            goto L_0x005b
        L_0x0018:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0020:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000a
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L_0x0054
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L_0x0054
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L_0x0058
        L_0x0054:
            boolean r3 = r4.equals(r3)
        L_0x0058:
            if (r3 != 0) goto L_0x0020
            goto L_0x0016
        L_0x005b:
            if (r7 == 0) goto L_0x005e
            r1 = r0
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.N.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i2 = 0;
        for (Map.Entry entry : entrySet()) {
            i2 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i2;
    }

    public final Object put(Object obj, Object obj2) {
        b();
        Charset charset = B.f6742a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        b();
        for (Object next : map.keySet()) {
            Charset charset = B.f6742a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        b();
        return super.remove(obj);
    }
}
