package A2;

import com.bumptech.glide.d;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class n implements Map, Serializable {

    /* renamed from: p  reason: collision with root package name */
    public static final n f43p = new n((Object) null, new Object[0], 0);

    /* renamed from: a  reason: collision with root package name */
    public transient k f44a;

    /* renamed from: b  reason: collision with root package name */
    public transient l f45b;

    /* renamed from: c  reason: collision with root package name */
    public transient m f46c;
    public final transient Object d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f47e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f48f;

    public n(Object obj, Object[] objArr, int i2) {
        this.d = obj;
        this.f47e = objArr;
        this.f48f = i2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v12, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static A2.n a(int r16, java.lang.Object[] r17, A2.f r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto L_0x000b
            A2.n r0 = f43p
            return r0
        L_0x000b:
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 != r3) goto L_0x0020
            r0 = r1[r5]
            java.util.Objects.requireNonNull(r0)
            r0 = r1[r3]
            java.util.Objects.requireNonNull(r0)
            A2.n r0 = new A2.n
            r0.<init>(r4, r1, r3)
            return r0
        L_0x0020:
            int r6 = r1.length
            int r6 = r6 >> r3
            w5.a.c(r0, r6)
            int r6 = A2.g.y(r16)
            if (r0 != r3) goto L_0x0038
            r6 = r1[r5]
            java.util.Objects.requireNonNull(r6)
            r6 = r1[r3]
            java.util.Objects.requireNonNull(r6)
        L_0x0035:
            r3 = 2
            goto L_0x0179
        L_0x0038:
            int r8 = r6 + -1
            r9 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r6 > r9) goto L_0x00a9
            byte[] r6 = new byte[r6]
            java.util.Arrays.fill(r6, r11)
            r9 = r5
            r11 = r9
        L_0x0047:
            if (r9 >= r0) goto L_0x0095
            int r12 = r9 * 2
            int r13 = r11 * 2
            r14 = r1[r12]
            java.util.Objects.requireNonNull(r14)
            r12 = r12 ^ r3
            r12 = r1[r12]
            java.util.Objects.requireNonNull(r12)
            int r15 = r14.hashCode()
            int r15 = I1.b.F0(r15)
        L_0x0060:
            r15 = r15 & r8
            byte r7 = r6[r15]
            r3 = 255(0xff, float:3.57E-43)
            r7 = r7 & r3
            if (r7 != r3) goto L_0x0076
            byte r3 = (byte) r13
            r6[r15] = r3
            if (r11 >= r9) goto L_0x0073
            r1[r13] = r14
            r3 = r13 ^ 1
            r1[r3] = r12
        L_0x0073:
            int r11 = r11 + 1
            goto L_0x008d
        L_0x0076:
            r3 = r1[r7]
            boolean r3 = r14.equals(r3)
            if (r3 == 0) goto L_0x0091
            A2.e r3 = new A2.e
            r4 = r7 ^ 1
            r7 = r1[r4]
            java.util.Objects.requireNonNull(r7)
            r3.<init>(r14, r12, r7)
            r1[r4] = r12
            r4 = r3
        L_0x008d:
            int r9 = r9 + 1
            r3 = 1
            goto L_0x0047
        L_0x0091:
            int r15 = r15 + 1
            r3 = 1
            goto L_0x0060
        L_0x0095:
            if (r11 != r0) goto L_0x0099
        L_0x0097:
            r4 = r6
            goto L_0x0035
        L_0x0099:
            java.lang.Object[] r3 = new java.lang.Object[r10]
            r3[r5] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r3[r7] = r6
            r6 = 2
            r3[r6] = r4
            goto L_0x0167
        L_0x00a9:
            r3 = 32768(0x8000, float:4.5918E-41)
            if (r6 > r3) goto L_0x0114
            short[] r3 = new short[r6]
            java.util.Arrays.fill(r3, r11)
            r6 = r5
            r7 = r6
        L_0x00b5:
            if (r6 >= r0) goto L_0x0102
            int r9 = r6 * 2
            int r11 = r7 * 2
            r12 = r1[r9]
            java.util.Objects.requireNonNull(r12)
            r13 = 1
            r9 = r9 ^ r13
            r9 = r1[r9]
            java.util.Objects.requireNonNull(r9)
            int r13 = r12.hashCode()
            int r13 = I1.b.F0(r13)
        L_0x00cf:
            r13 = r13 & r8
            short r14 = r3[r13]
            r15 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r15
            if (r14 != r15) goto L_0x00e6
            short r14 = (short) r11
            r3[r13] = r14
            if (r7 >= r6) goto L_0x00e3
            r1[r11] = r12
            r11 = r11 ^ 1
            r1[r11] = r9
        L_0x00e3:
            int r7 = r7 + 1
            goto L_0x00fc
        L_0x00e6:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x00ff
            A2.e r4 = new A2.e
            r11 = r14 ^ 1
            r13 = r1[r11]
            java.util.Objects.requireNonNull(r13)
            r4.<init>(r12, r9, r13)
            r1[r11] = r9
        L_0x00fc:
            int r6 = r6 + 1
            goto L_0x00b5
        L_0x00ff:
            int r13 = r13 + 1
            goto L_0x00cf
        L_0x0102:
            if (r7 != r0) goto L_0x0105
            goto L_0x0167
        L_0x0105:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r6[r7] = r3
            r3 = 2
            r6[r3] = r4
            goto L_0x0097
        L_0x0114:
            int[] r3 = new int[r6]
            java.util.Arrays.fill(r3, r11)
            r6 = r5
            r7 = r6
        L_0x011b:
            if (r6 >= r0) goto L_0x0165
            int r9 = r6 * 2
            int r12 = r7 * 2
            r13 = r1[r9]
            java.util.Objects.requireNonNull(r13)
            r14 = 1
            r9 = r9 ^ r14
            r9 = r1[r9]
            java.util.Objects.requireNonNull(r9)
            int r14 = r13.hashCode()
            int r14 = I1.b.F0(r14)
        L_0x0135:
            r14 = r14 & r8
            r15 = r3[r14]
            if (r15 != r11) goto L_0x0147
            r3[r14] = r12
            if (r7 >= r6) goto L_0x0144
            r1[r12] = r13
            r12 = r12 ^ 1
            r1[r12] = r9
        L_0x0144:
            int r7 = r7 + 1
            goto L_0x015d
        L_0x0147:
            r11 = r1[r15]
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x0161
            A2.e r4 = new A2.e
            r11 = r15 ^ 1
            r12 = r1[r11]
            java.util.Objects.requireNonNull(r12)
            r4.<init>(r13, r9, r12)
            r1[r11] = r9
        L_0x015d:
            int r6 = r6 + 1
            r11 = -1
            goto L_0x011b
        L_0x0161:
            int r14 = r14 + 1
            r11 = -1
            goto L_0x0135
        L_0x0165:
            if (r7 != r0) goto L_0x016a
        L_0x0167:
            r4 = r3
            goto L_0x0035
        L_0x016a:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r7 = 1
            r6[r7] = r3
            r3 = 2
            r6[r3] = r4
            r4 = r6
        L_0x0179:
            boolean r6 = r4 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01a1
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            r0 = r4[r3]
            A2.e r0 = (A2.e) r0
            if (r2 == 0) goto L_0x019c
            r2.d = r0
            r0 = r4[r5]
            r2 = 1
            r2 = r4[r2]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 * 2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r4 = r0
            r0 = r2
            goto L_0x01a1
        L_0x019c:
            java.lang.IllegalArgumentException r0 = r0.a()
            throw r0
        L_0x01a1:
            A2.n r2 = new A2.n
            r2.<init>(r4, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.n.a(int, java.lang.Object[], A2.f):A2.n");
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final boolean containsValue(Object obj) {
        m mVar = this.f46c;
        if (mVar == null) {
            mVar = new m(this.f47e, 1, this.f48f);
            this.f46c = mVar;
        }
        return mVar.contains(obj);
    }

    public final Set entrySet() {
        k kVar = this.f44a;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, this.f47e, this.f48f);
        this.f44a = kVar2;
        return kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((g) entrySet()).equals(((Map) obj).entrySet());
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L_0x0006
        L_0x0003:
            r9 = r0
            goto L_0x009c
        L_0x0006:
            r1 = 1
            java.lang.Object[] r2 = r8.f47e
            int r3 = r8.f48f
            if (r3 != r1) goto L_0x0020
            r3 = 0
            r3 = r2[r3]
            java.util.Objects.requireNonNull(r3)
            boolean r9 = r3.equals(r9)
            if (r9 == 0) goto L_0x0003
            r9 = r2[r1]
            java.util.Objects.requireNonNull(r9)
            goto L_0x009c
        L_0x0020:
            java.lang.Object r3 = r8.d
            if (r3 != 0) goto L_0x0025
            goto L_0x0003
        L_0x0025:
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L_0x0050
            r4 = r3
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            int r5 = r3 + -1
            int r3 = r9.hashCode()
            int r3 = I1.b.F0(r3)
        L_0x0037:
            r3 = r3 & r5
            byte r6 = r4[r3]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0040
            goto L_0x0003
        L_0x0040:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x004d
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L_0x009c
        L_0x004d:
            int r3 = r3 + 1
            goto L_0x0037
        L_0x0050:
            boolean r4 = r3 instanceof short[]
            if (r4 == 0) goto L_0x007c
            r4 = r3
            short[] r4 = (short[]) r4
            int r3 = r4.length
            int r5 = r3 + -1
            int r3 = r9.hashCode()
            int r3 = I1.b.F0(r3)
        L_0x0062:
            r3 = r3 & r5
            short r6 = r4[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x006c
            goto L_0x0003
        L_0x006c:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x0079
            r9 = r6 ^ 1
            r9 = r2[r9]
            goto L_0x009c
        L_0x0079:
            int r3 = r3 + 1
            goto L_0x0062
        L_0x007c:
            int[] r3 = (int[]) r3
            int r4 = r3.length
            int r4 = r4 - r1
            int r5 = r9.hashCode()
            int r5 = I1.b.F0(r5)
        L_0x0088:
            r5 = r5 & r4
            r6 = r3[r5]
            r7 = -1
            if (r6 != r7) goto L_0x0090
            goto L_0x0003
        L_0x0090:
            r7 = r2[r6]
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x00a0
            r9 = r6 ^ 1
            r9 = r2[r9]
        L_0x009c:
            if (r9 != 0) goto L_0x009f
            return r0
        L_0x009f:
            return r9
        L_0x00a0:
            int r5 = r5 + 1
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.n.get(java.lang.Object):java.lang.Object");
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    public final int hashCode() {
        int i2;
        k kVar = this.f44a;
        if (kVar == null) {
            kVar = new k(this, this.f47e, this.f48f);
            this.f44a = kVar;
        }
        int i5 = 0;
        for (Object next : kVar) {
            if (next != null) {
                i2 = next.hashCode();
            } else {
                i2 = 0;
            }
            i5 = ~(~(i5 + i2));
        }
        return i5;
    }

    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Set keySet() {
        l lVar = this.f45b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, new m(this.f47e, 0, this.f48f));
        this.f45b = lVar2;
        return lVar2;
    }

    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.f48f;
    }

    public final String toString() {
        int i2 = this.f48f;
        d.f(i2, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824));
        sb.append('{');
        s B6 = ((k) entrySet()).iterator();
        boolean z3 = true;
        while (true) {
            b bVar = (b) B6;
            if (bVar.hasNext()) {
                Map.Entry entry = (Map.Entry) bVar.next();
                if (!z3) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z3 = false;
            } else {
                sb.append('}');
                return sb.toString();
            }
        }
    }

    public final Collection values() {
        m mVar = this.f46c;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this.f47e, 1, this.f48f);
        this.f46c = mVar2;
        return mVar2;
    }
}
