package n3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k3.k;
import q3.l;
import v3.C1048c;

/* renamed from: n3.g  reason: case insensitive filesystem */
public final class C0866g implements Iterable, Comparable {
    public static final C0866g d = new C0866g("");

    /* renamed from: a  reason: collision with root package name */
    public final C1048c[] f10276a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10277b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10278c;

    public C0866g(C1048c... cVarArr) {
        this.f10276a = (C1048c[]) Arrays.copyOf(cVarArr, cVarArr.length);
        this.f10277b = 0;
        this.f10278c = cVarArr.length;
        int length = cVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            l.b("Can't construct a path with a null value!", cVarArr[i2] != null);
        }
    }

    public static C0866g B(C0866g gVar, C0866g gVar2) {
        C1048c z3 = gVar.z();
        C1048c z4 = gVar2.z();
        if (z3 == null) {
            return gVar2;
        }
        if (z3.equals(z4)) {
            return B(gVar.C(), gVar2.C());
        }
        throw new RuntimeException("INTERNAL ERROR: " + gVar2 + " is not contained in " + gVar);
    }

    public final C0866g A() {
        if (isEmpty()) {
            return null;
        }
        return new C0866g(this.f10276a, this.f10277b, this.f10278c - 1);
    }

    public final C0866g C() {
        boolean isEmpty = isEmpty();
        int i2 = this.f10277b;
        if (!isEmpty) {
            i2++;
        }
        return new C0866g(this.f10276a, i2, this.f10278c);
    }

    public final String D() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = this.f10277b;
        for (int i5 = i2; i5 < this.f10278c; i5++) {
            if (i5 > i2) {
                sb.append("/");
            }
            sb.append(this.f10276a[i5].f12280a);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0866g)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0866g gVar = (C0866g) obj;
        if (size() != gVar.size()) {
            return false;
        }
        int i2 = this.f10277b;
        int i5 = gVar.f10277b;
        while (i2 < this.f10278c && i5 < gVar.f10278c) {
            if (!this.f10276a[i2].equals(gVar.f10276a[i5])) {
                return false;
            }
            i2++;
            i5++;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = 0;
        for (int i5 = this.f10277b; i5 < this.f10278c; i5++) {
            i2 = (i2 * 37) + this.f10276a[i5].f12280a.hashCode();
        }
        return i2;
    }

    public final boolean isEmpty() {
        if (this.f10277b >= this.f10278c) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new k(this);
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList(size());
        k kVar = new k(this);
        while (kVar.hasNext()) {
            arrayList.add(((C1048c) kVar.next()).f12280a);
        }
        return arrayList;
    }

    public final int size() {
        return this.f10278c - this.f10277b;
    }

    public final C0866g t(C0866g gVar) {
        int size = gVar.size() + size();
        C1048c[] cVarArr = new C1048c[size];
        System.arraycopy(this.f10276a, this.f10277b, cVarArr, 0, size());
        System.arraycopy(gVar.f10276a, gVar.f10277b, cVarArr, size(), gVar.size());
        return new C0866g(cVarArr, 0, size);
    }

    public final String toString() {
        if (isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = this.f10277b; i2 < this.f10278c; i2++) {
            sb.append("/");
            sb.append(this.f10276a[i2].f12280a);
        }
        return sb.toString();
    }

    public final C0866g v(C1048c cVar) {
        int size = size();
        int i2 = size + 1;
        C1048c[] cVarArr = new C1048c[i2];
        System.arraycopy(this.f10276a, this.f10277b, cVarArr, 0, size);
        cVarArr[size] = cVar;
        return new C0866g(cVarArr, 0, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a A[RETURN] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(n3.C0866g r5) {
        /*
            r4 = this;
            int r0 = r5.f10277b
            int r1 = r4.f10277b
        L_0x0004:
            int r2 = r5.f10278c
            int r3 = r4.f10278c
            if (r1 >= r3) goto L_0x0020
            if (r0 >= r2) goto L_0x0020
            v3.c[] r2 = r4.f10276a
            r2 = r2[r1]
            v3.c[] r3 = r5.f10276a
            r3 = r3[r0]
            int r2 = r2.compareTo(r3)
            if (r2 == 0) goto L_0x001b
            return r2
        L_0x001b:
            int r1 = r1 + 1
            int r0 = r0 + 1
            goto L_0x0004
        L_0x0020:
            if (r1 != r3) goto L_0x0026
            if (r0 != r2) goto L_0x0026
            r5 = 0
            return r5
        L_0x0026:
            if (r1 != r3) goto L_0x002a
            r5 = -1
            return r5
        L_0x002a:
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C0866g.compareTo(n3.g):int");
    }

    public final boolean x(C0866g gVar) {
        if (size() > gVar.size()) {
            return false;
        }
        int i2 = this.f10277b;
        int i5 = gVar.f10277b;
        while (i2 < this.f10278c) {
            if (!this.f10276a[i2].equals(gVar.f10276a[i5])) {
                return false;
            }
            i2++;
            i5++;
        }
        return true;
    }

    public final C1048c y() {
        if (isEmpty()) {
            return null;
        }
        return this.f10276a[this.f10278c - 1];
    }

    public final C1048c z() {
        if (isEmpty()) {
            return null;
        }
        return this.f10276a[this.f10277b];
    }

    public C0866g(ArrayList arrayList) {
        this.f10276a = new C1048c[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            this.f10276a[i2] = C1048c.e((String) it2.next());
            i2++;
        }
        this.f10277b = 0;
        this.f10278c = arrayList.size();
    }

    public C0866g(String str) {
        String[] split = str.split("/", -1);
        int i2 = 0;
        for (String length : split) {
            if (length.length() > 0) {
                i2++;
            }
        }
        this.f10276a = new C1048c[i2];
        int i5 = 0;
        for (String str2 : split) {
            if (str2.length() > 0) {
                this.f10276a[i5] = C1048c.e(str2);
                i5++;
            }
        }
        this.f10277b = 0;
        this.f10278c = this.f10276a.length;
    }

    public C0866g(C1048c[] cVarArr, int i2, int i5) {
        this.f10276a = cVarArr;
        this.f10277b = i2;
        this.f10278c = i5;
    }
}
