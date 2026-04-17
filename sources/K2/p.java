package K2;

import B0.C0009h;
import C2.b;
import C2.j;
import C2.k;
import C2.m;
import Q2.a;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

public final class p implements m {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f1498a = Logger.getLogger(p.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f1499b = {0};

    /* renamed from: c  reason: collision with root package name */
    public static final p f1500c = new Object();

    public final Class a() {
        return j.class;
    }

    public final Object b(C0009h hVar) {
        byte[] bArr;
        for (List it2 : ((ConcurrentHashMap) hVar.f228b).values()) {
            Iterator it3 = it2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    k kVar = (k) it3.next();
                    b bVar = kVar.h;
                    if (bVar instanceof n) {
                        n nVar = (n) bVar;
                        byte[] bArr2 = kVar.f446c;
                        if (bArr2 == null) {
                            bArr = null;
                        } else {
                            bArr = Arrays.copyOf(bArr2, bArr2.length);
                        }
                        a a6 = a.a(bArr);
                        if (!a6.equals(nVar.b())) {
                            throw new GeneralSecurityException("Mac Key with parameters " + nVar.c() + " has wrong output prefix (" + nVar.b() + ") instead of (" + a6 + ")");
                        }
                    }
                }
            }
        }
        return new o(hVar);
    }

    public final Class c() {
        return j.class;
    }
}
