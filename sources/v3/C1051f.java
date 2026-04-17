package v3;

import H4.i;
import T1.C0208t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import k3.C0762b;
import k3.c;
import n3.C0866g;
import q3.l;
import z0.C1129e;

/* renamed from: v3.f  reason: case insensitive filesystem */
public class C1051f implements s {
    public static final i d = new i(13);

    /* renamed from: a  reason: collision with root package name */
    public final c f12284a;

    /* renamed from: b  reason: collision with root package name */
    public final s f12285b;

    /* renamed from: c  reason: collision with root package name */
    public String f12286c;

    public C1051f() {
        this.f12286c = null;
        this.f12284a = new C0762b(d);
        this.f12285b = k.f12295e;
    }

    public s b(s sVar) {
        c cVar = this.f12284a;
        if (cVar.isEmpty()) {
            return k.f12295e;
        }
        return new C1051f(cVar, sVar);
    }

    public s c() {
        return this.f12285b;
    }

    public boolean d(C1048c cVar) {
        return !l(cVar).isEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0004
            return r0
        L_0x0004:
            r1 = 1
            if (r8 != r7) goto L_0x0008
            return r1
        L_0x0008:
            boolean r2 = r8 instanceof v3.C1051f
            if (r2 != 0) goto L_0x000d
            return r0
        L_0x000d:
            v3.f r8 = (v3.C1051f) r8
            v3.s r2 = r7.c()
            v3.s r3 = r8.c()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001e
            return r0
        L_0x001e:
            k3.c r2 = r7.f12284a
            int r3 = r2.size()
            k3.c r8 = r8.f12284a
            int r4 = r8.size()
            if (r3 == r4) goto L_0x002d
            return r0
        L_0x002d:
            java.util.Iterator r2 = r2.iterator()
            java.util.Iterator r8 = r8.iterator()
        L_0x0035:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x006e
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L_0x006e
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r8.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r3.getKey()
            v3.c r5 = (v3.C1048c) r5
            java.lang.Object r6 = r4.getKey()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x006d
            java.lang.Object r3 = r3.getValue()
            v3.s r3 = (v3.s) r3
            java.lang.Object r4 = r4.getValue()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0035
        L_0x006d:
            return r0
        L_0x006e:
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x007b
            boolean r8 = r8.hasNext()
            if (r8 != 0) goto L_0x007b
            return r1
        L_0x007b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Something went wrong internally."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.C1051f.equals(java.lang.Object):boolean");
    }

    public s f(C0866g gVar) {
        C1048c z3 = gVar.z();
        if (z3 == null) {
            return this;
        }
        return l(z3).f(gVar.C());
    }

    public String g(int i2) {
        boolean z3;
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder();
            s sVar = this.f12285b;
            if (!sVar.isEmpty()) {
                sb.append("priority:");
                sb.append(sVar.g(1));
                sb.append(":");
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = iterator();
            loop0:
            while (true) {
                z3 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    }
                    q qVar = (q) it2.next();
                    arrayList.add(qVar);
                    if (z3 || !qVar.f12305b.c().isEmpty()) {
                        z3 = true;
                    }
                }
            }
            if (z3) {
                Collections.sort(arrayList, u.f12308a);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                q qVar2 = (q) it3.next();
                String u6 = qVar2.f12305b.u();
                if (!u6.equals("")) {
                    sb.append(":");
                    sb.append(qVar2.f12304a.f12280a);
                    sb.append(":");
                    sb.append(u6);
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
    }

    public Object getValue() {
        return o(false);
    }

    public boolean h() {
        return false;
    }

    public int hashCode() {
        Iterator it2 = iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            q qVar = (q) it2.next();
            int hashCode = qVar.f12304a.f12280a.hashCode();
            i2 = qVar.f12305b.hashCode() + ((hashCode + (i2 * 31)) * 17);
        }
        return i2;
    }

    public int i() {
        return this.f12284a.size();
    }

    public boolean isEmpty() {
        return this.f12284a.isEmpty();
    }

    public Iterator iterator() {
        return new C0208t(this.f12284a.iterator(), 2);
    }

    /* renamed from: k */
    public int compareTo(s sVar) {
        if (isEmpty()) {
            if (sVar.isEmpty()) {
                return 0;
            }
            return -1;
        } else if (sVar.h() || sVar.isEmpty()) {
            return 1;
        } else {
            if (sVar == s.f12306n) {
                return -1;
            }
            return 0;
        }
    }

    public s l(C1048c cVar) {
        if (cVar.equals(C1048c.d)) {
            s sVar = this.f12285b;
            if (!sVar.isEmpty()) {
                return sVar;
            }
        }
        c cVar2 = this.f12284a;
        if (cVar2.k(cVar)) {
            return (s) cVar2.t(cVar);
        }
        return k.f12295e;
    }

    public Object o(boolean z3) {
        Integer g;
        if (isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        boolean z4 = true;
        int i2 = 0;
        int i5 = 0;
        for (Map.Entry entry : this.f12284a) {
            String str = ((C1048c) entry.getKey()).f12280a;
            hashMap.put(str, ((s) entry.getValue()).o(z3));
            i2++;
            if (z4) {
                if ((str.length() > 1 && str.charAt(0) == '0') || (g = l.g(str)) == null || g.intValue() < 0) {
                    z4 = false;
                } else if (g.intValue() > i5) {
                    i5 = g.intValue();
                }
            }
        }
        if (z3 || !z4 || i5 >= i2 * 2) {
            if (z3) {
                s sVar = this.f12285b;
                if (!sVar.isEmpty()) {
                    hashMap.put(".priority", sVar.getValue());
                }
            }
            return hashMap;
        }
        ArrayList arrayList = new ArrayList(i5 + 1);
        for (int i6 = 0; i6 <= i5; i6++) {
            arrayList.add(hashMap.get("" + i6));
        }
        return arrayList;
    }

    public C1048c p(C1048c cVar) {
        return (C1048c) this.f12284a.y(cVar);
    }

    public s q(C0866g gVar, s sVar) {
        C1048c z3 = gVar.z();
        if (z3 == null) {
            return sVar;
        }
        if (!z3.equals(C1048c.d)) {
            return r(z3, l(z3).q(gVar.C(), sVar));
        }
        l.c(C1129e.d(sVar));
        return b(sVar);
    }

    public s r(C1048c cVar, s sVar) {
        if (cVar.equals(C1048c.d)) {
            return b(sVar);
        }
        c cVar2 = this.f12284a;
        if (cVar2.k(cVar)) {
            cVar2 = cVar2.B(cVar);
        }
        if (!sVar.isEmpty()) {
            cVar2 = cVar2.A(sVar, cVar);
        }
        if (cVar2.isEmpty()) {
            return k.f12295e;
        }
        return new C1051f(cVar2, this.f12285b);
    }

    public Iterator s() {
        return new C0208t(this.f12284a.s(), 2);
    }

    public final void t(C1050e eVar, boolean z3) {
        c cVar = this.f12284a;
        if (!z3 || c().isEmpty()) {
            cVar.z(eVar);
        } else {
            cVar.z(new C1049d(this, eVar));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        v(0, sb);
        return sb.toString();
    }

    public String u() {
        String str;
        if (this.f12286c == null) {
            String g = g(1);
            if (g.isEmpty()) {
                str = "";
            } else {
                str = l.e(g);
            }
            this.f12286c = str;
        }
        return this.f12286c;
    }

    public final void v(int i2, StringBuilder sb) {
        int i5;
        c cVar = this.f12284a;
        boolean isEmpty = cVar.isEmpty();
        s sVar = this.f12285b;
        if (!isEmpty || !sVar.isEmpty()) {
            sb.append("{\n");
            Iterator it2 = cVar.iterator();
            while (true) {
                i5 = 0;
                if (!it2.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                int i6 = i2 + 2;
                while (i5 < i6) {
                    sb.append(" ");
                    i5++;
                }
                sb.append(((C1048c) entry.getKey()).f12280a);
                sb.append("=");
                if (entry.getValue() instanceof C1051f) {
                    ((C1051f) entry.getValue()).v(i6, sb);
                } else {
                    sb.append(((s) entry.getValue()).toString());
                }
                sb.append("\n");
            }
            if (!sVar.isEmpty()) {
                int i7 = i2 + 2;
                for (int i8 = 0; i8 < i7; i8++) {
                    sb.append(" ");
                }
                sb.append(".priority=");
                sb.append(sVar.toString());
                sb.append("\n");
            }
            while (i5 < i2) {
                sb.append(" ");
                i5++;
            }
            sb.append("}");
            return;
        }
        sb.append("{ }");
    }

    public C1051f(c cVar, s sVar) {
        this.f12286c = null;
        if (!cVar.isEmpty() || sVar.isEmpty()) {
            this.f12285b = sVar;
            this.f12284a = cVar;
            return;
        }
        throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
    }
}
