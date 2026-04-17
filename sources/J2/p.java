package J2;

import B0.C0009h;
import C2.f;
import C2.k;
import M2.a;
import M2.b;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import s2.e;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    public static final e f1322a = new e(9);

    public static void a(C0009h hVar) {
        Integer num;
        f fVar;
        ArrayList arrayList = new ArrayList();
        a aVar = a.f1819b;
        for (List it2 : ((ConcurrentHashMap) hVar.f228b).values()) {
            Iterator it3 = it2.iterator();
            while (true) {
                if (it3.hasNext()) {
                    k kVar = (k) it3.next();
                    int ordinal = kVar.d.ordinal();
                    if (ordinal == 1) {
                        fVar = f.f437c;
                    } else if (ordinal == 2) {
                        fVar = f.d;
                    } else if (ordinal == 3) {
                        fVar = f.f438e;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    String str = kVar.g;
                    if (str.startsWith("type.googleapis.com/google.crypto.")) {
                        str = str.substring(34);
                    }
                    arrayList.add(new b(fVar, kVar.f448f, str, kVar.f447e.name()));
                }
            }
        }
        k kVar2 = (k) hVar.f229c;
        if (kVar2 != null) {
            num = Integer.valueOf(kVar2.f448f);
        } else {
            num = null;
        }
        if (num != null) {
            try {
                int intValue = num.intValue();
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    if (((b) it4.next()).f1822b == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e6) {
                throw new IllegalStateException(e6);
            }
        }
        Collections.unmodifiableList(arrayList);
    }
}
