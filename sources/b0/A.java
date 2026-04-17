package B0;

import java.util.HashMap;
import n3.C0866g;
import q3.d;
import q3.l;
import s3.C0964b;
import v3.C1048c;
import v3.m;
import v3.s;

public final class A implements d {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f175a;

    public A(int i2) {
        switch (i2) {
            case 1:
                this.f175a = new HashMap();
                return;
            case 2:
                this.f175a = new HashMap();
                return;
            case 4:
                this.f175a = new HashMap();
                return;
            default:
                this.f175a = new HashMap();
                new HashMap();
                return;
        }
    }

    public void a(C0964b bVar) {
        boolean z3;
        int i2 = bVar.f11525a;
        if (i2 == 2 || i2 == 4 || i2 == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        l.b("Only child changes supported for tracking", z3);
        C1048c cVar = C1048c.d;
        C1048c cVar2 = bVar.d;
        l.c(!cVar2.equals(cVar));
        HashMap hashMap = this.f175a;
        if (hashMap.containsKey(cVar2)) {
            C0964b bVar2 = (C0964b) hashMap.get(cVar2);
            int i5 = bVar2.f11525a;
            m mVar = bVar.f11526b;
            if (i2 == 2 && i5 == 1) {
                hashMap.put(cVar2, new C0964b(4, mVar, cVar2, (C1048c) null, bVar2.f11526b));
            } else if (i2 == 1 && i5 == 2) {
                hashMap.remove(cVar2);
            } else {
                m mVar2 = bVar2.f11527c;
                if (i2 == 1 && i5 == 4) {
                    hashMap.put(cVar2, new C0964b(1, mVar2, cVar2, (C1048c) null, (m) null));
                } else if (i2 == 4 && i5 == 2) {
                    hashMap.put(cVar2, new C0964b(2, mVar, cVar2, (C1048c) null, (m) null));
                } else if (i2 == 4 && i5 == 4) {
                    hashMap.put(cVar2, new C0964b(4, mVar, cVar2, (C1048c) null, mVar2));
                } else {
                    throw new IllegalStateException("Illegal combination of changes: " + bVar + " occurred after " + bVar2);
                }
            }
        } else {
            hashMap.put(cVar2, bVar);
        }
    }

    public Object z(C0866g gVar, Object obj, Object obj2) {
        Void voidR = (Void) obj2;
        this.f175a.put(gVar.D(), ((s) obj).o(true));
        return null;
    }

    public A(HashMap hashMap) {
        this.f175a = hashMap;
    }
}
