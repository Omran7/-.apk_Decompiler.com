package T1;

import android.os.Bundle;
import java.util.EnumMap;

public final class J0 {

    /* renamed from: c  reason: collision with root package name */
    public static final J0 f2969c = new J0(100);

    /* renamed from: a  reason: collision with root package name */
    public final EnumMap f2970a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2971b;

    public J0(int i2) {
        EnumMap enumMap = new EnumMap(I0.class);
        this.f2970a = enumMap;
        I0 i02 = I0.AD_STORAGE;
        G0 g02 = G0.UNINITIALIZED;
        enumMap.put(i02, g02);
        enumMap.put(I0.ANALYTICS_STORAGE, g02);
        this.f2971b = i2;
    }

    public static char a(G0 g02) {
        if (g02 == null) {
            return '-';
        }
        int ordinal = g02.ordinal();
        if (ordinal == 1) {
            return '+';
        }
        if (ordinal == 2) {
            return '0';
        }
        if (ordinal != 3) {
            return '-';
        }
        return '1';
    }

    public static G0 b(String str) {
        G0 g02 = G0.UNINITIALIZED;
        if (str == null) {
            return g02;
        }
        if (str.equals("granted")) {
            return G0.GRANTED;
        }
        if (str.equals("denied")) {
            return G0.DENIED;
        }
        return g02;
    }

    public static G0 c(char c3) {
        if (c3 == '+') {
            return G0.POLICY;
        }
        if (c3 == '0') {
            return G0.DENIED;
        }
        if (c3 != '1') {
            return G0.UNINITIALIZED;
        }
        return G0.GRANTED;
    }

    public static J0 d(int i2, Bundle bundle) {
        if (bundle == null) {
            return new J0(i2);
        }
        EnumMap enumMap = new EnumMap(I0.class);
        for (I0 i02 : H0.STORAGE.f2959a) {
            enumMap.put(i02, b(bundle.getString(i02.f2965a)));
        }
        return new J0(enumMap, i2);
    }

    public static J0 e(int i2, String str) {
        String str2;
        EnumMap enumMap = new EnumMap(I0.class);
        H0 h02 = H0.STORAGE;
        int i5 = 0;
        while (true) {
            I0[] i0Arr = h02.f2959a;
            if (i5 >= i0Arr.length) {
                return new J0(enumMap, i2);
            }
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            I0 i02 = i0Arr[i5];
            int i6 = i5 + 2;
            if (i6 < str2.length()) {
                enumMap.put(i02, c(str2.charAt(i6)));
            } else {
                enumMap.put(i02, G0.UNINITIALIZED);
            }
            i5++;
        }
    }

    public static String h(int i2) {
        if (i2 == -30) {
            return "TCF";
        }
        if (i2 == -20) {
            return "API";
        }
        if (i2 == -10) {
            return "MANIFEST";
        }
        if (i2 == 0) {
            return "1P_API";
        }
        if (i2 == 30) {
            return "1P_INIT";
        }
        if (i2 == 90) {
            return "REMOTE_CONFIG";
        }
        if (i2 != 100) {
            return "OTHER";
        }
        return "UNKNOWN";
    }

    public static boolean l(int i2, int i5) {
        int i6 = -30;
        if (i2 == -20) {
            if (i5 == -30) {
                return true;
            }
            i2 = -20;
        }
        if (i2 != -30) {
            i6 = i2;
        } else if (i5 == -20) {
            return true;
        }
        if (i6 != i5 && i2 >= i5) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof J0)) {
            return false;
        }
        J0 j02 = (J0) obj;
        for (I0 i02 : H0.STORAGE.f2959a) {
            if (this.f2970a.get(i02) != j02.f2970a.get(i02)) {
                return false;
            }
        }
        if (this.f2971b == j02.f2971b) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T1.J0 f(T1.J0 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<T1.I0> r1 = T1.I0.class
            r0.<init>(r1)
            T1.H0 r1 = T1.H0.STORAGE
            T1.I0[] r1 = r1.f2959a
            int r2 = r1.length
            r3 = 0
        L_0x000d:
            if (r3 >= r2) goto L_0x0048
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f2970a
            java.lang.Object r5 = r5.get(r4)
            T1.G0 r5 = (T1.G0) r5
            java.util.EnumMap r6 = r9.f2970a
            java.lang.Object r6 = r6.get(r4)
            T1.G0 r6 = (T1.G0) r6
            if (r5 != 0) goto L_0x0024
            goto L_0x0031
        L_0x0024:
            if (r6 == 0) goto L_0x0040
            T1.G0 r7 = T1.G0.UNINITIALIZED
            if (r5 != r7) goto L_0x002b
            goto L_0x0031
        L_0x002b:
            if (r6 == r7) goto L_0x0040
            T1.G0 r7 = T1.G0.POLICY
            if (r5 != r7) goto L_0x0033
        L_0x0031:
            r5 = r6
            goto L_0x0040
        L_0x0033:
            if (r6 == r7) goto L_0x0040
            T1.G0 r7 = T1.G0.DENIED
            if (r5 == r7) goto L_0x003f
            if (r6 != r7) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            T1.G0 r5 = T1.G0.GRANTED
            goto L_0x0040
        L_0x003f:
            r5 = r7
        L_0x0040:
            if (r5 == 0) goto L_0x0045
            r0.put(r4, r5)
        L_0x0045:
            int r3 = r3 + 1
            goto L_0x000d
        L_0x0048:
            T1.J0 r9 = new T1.J0
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: T1.J0.f(T1.J0):T1.J0");
    }

    public final J0 g(J0 j02) {
        EnumMap enumMap = new EnumMap(I0.class);
        for (I0 i02 : H0.STORAGE.f2959a) {
            G0 g02 = (G0) this.f2970a.get(i02);
            if (g02 == G0.UNINITIALIZED) {
                g02 = (G0) j02.f2970a.get(i02);
            }
            if (g02 != null) {
                enumMap.put(i02, g02);
            }
        }
        return new J0(enumMap, this.f2971b);
    }

    public final int hashCode() {
        int i2 = this.f2971b * 17;
        for (G0 hashCode : this.f2970a.values()) {
            i2 = (i2 * 31) + hashCode.hashCode();
        }
        return i2;
    }

    public final String i() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (I0 i02 : H0.STORAGE.f2959a) {
            G0 g02 = (G0) this.f2970a.get(i02);
            char c3 = '-';
            if (!(g02 == null || (ordinal = g02.ordinal()) == 0)) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        c3 = '0';
                    } else if (ordinal != 3) {
                    }
                }
                c3 = '1';
            }
            sb.append(c3);
        }
        return sb.toString();
    }

    public final String j() {
        StringBuilder sb = new StringBuilder("G1");
        for (I0 i02 : H0.STORAGE.f2959a) {
            sb.append(a((G0) this.f2970a.get(i02)));
        }
        return sb.toString();
    }

    public final boolean k(I0 i02) {
        if (((G0) this.f2970a.get(i02)) == G0.DENIED) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(h(this.f2971b));
        for (I0 i02 : H0.STORAGE.f2959a) {
            sb.append(",");
            sb.append(i02.f2965a);
            sb.append("=");
            G0 g02 = (G0) this.f2970a.get(i02);
            if (g02 == null) {
                g02 = G0.UNINITIALIZED;
            }
            sb.append(g02);
        }
        return sb.toString();
    }

    public J0(EnumMap enumMap, int i2) {
        EnumMap enumMap2 = new EnumMap(I0.class);
        this.f2970a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f2971b = i2;
    }
}
