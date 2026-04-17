package n5;

import I1.b;
import h0.C0552a;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.j;
import x5.l;

/* renamed from: n5.g  reason: case insensitive filesystem */
public abstract class C0875g extends C0881m {
    public static String U0(Iterable iterable, String str, String str2, String str3, l lVar, int i2) {
        if ((i2 & 1) != 0) {
            str = ", ";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        j.e(iterable, "<this>");
        j.e(str, "separator");
        j.e(str2, "prefix");
        j.e(str3, "postfix");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        int i5 = 0;
        for (Object next : iterable) {
            i5++;
            if (i5 > 1) {
                sb.append(str);
            }
            b.i(sb, next, lVar);
        }
        sb.append(str3);
        String sb2 = sb.toString();
        j.d(sb2, "toString(...)");
        return sb2;
    }

    public static List V0(int i2, List list) {
        j.e(list, "<this>");
        if (i2 >= 0) {
            C0883o oVar = C0883o.f10398a;
            if (i2 == 0) {
                return oVar;
            }
            if (i2 >= list.size()) {
                return Z0(list);
            }
            if (i2 != 1) {
                ArrayList arrayList = new ArrayList(i2);
                int i5 = 0;
                for (Object add : list) {
                    arrayList.add(add);
                    i5++;
                    if (i5 == i2) {
                        break;
                    }
                }
                int size = arrayList.size();
                if (size == 0) {
                    return oVar;
                }
                if (size != 1) {
                    return arrayList;
                }
                return b.t0(arrayList.get(0));
            } else if (!list.isEmpty()) {
                return b.t0(list.get(0));
            } else {
                throw new NoSuchElementException("List is empty.");
            }
        } else {
            throw new IllegalArgumentException(C0552a.k(i2, "Requested element count ", " is less than zero.").toString());
        }
    }

    public static byte[] W0(ArrayList arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            bArr[i2] = ((Number) it2.next()).byteValue();
            i2++;
        }
        return bArr;
    }

    public static final void X0(Iterable iterable, AbstractCollection abstractCollection) {
        j.e(iterable, "<this>");
        for (Object add : iterable) {
            abstractCollection.add(add);
        }
    }

    public static int[] Y0(ArrayList arrayList) {
        int[] iArr = new int[arrayList.size()];
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            iArr[i2] = ((Number) it2.next()).intValue();
            i2++;
        }
        return iArr;
    }

    public static List Z0(Iterable iterable) {
        ArrayList arrayList;
        Object obj;
        j.e(iterable, "<this>");
        boolean z3 = iterable instanceof Collection;
        C0883o oVar = C0883o.f10398a;
        if (z3) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return oVar;
            }
            if (size != 1) {
                return new ArrayList(collection);
            }
            if (iterable instanceof List) {
                obj = ((List) iterable).get(0);
            } else {
                obj = iterable.iterator().next();
            }
            return b.t0(obj);
        }
        if (z3) {
            arrayList = new ArrayList((Collection) iterable);
        } else {
            arrayList = new ArrayList();
            X0(iterable, arrayList);
        }
        int size2 = arrayList.size();
        if (size2 == 0) {
            return oVar;
        }
        if (size2 != 1) {
            return arrayList;
        }
        return b.t0(arrayList.get(0));
    }

    public static long[] a1(List list) {
        j.e(list, "<this>");
        long[] jArr = new long[list.size()];
        Iterator it2 = list.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            jArr[i2] = ((Number) it2.next()).longValue();
            i2++;
        }
        return jArr;
    }

    public static Set b1(List list) {
        j.e(list, "<this>");
        C0885q qVar = C0885q.f10400a;
        int size = list.size();
        if (size == 0) {
            return qVar;
        }
        if (size != 1) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(C0886r.z0(list.size()));
            X0(list, linkedHashSet);
            return linkedHashSet;
        }
        Set singleton = Collections.singleton(list.get(0));
        j.d(singleton, "singleton(...)");
        return singleton;
    }
}
