package n5;

import K1.e;
import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.j;
import m5.C0845d;

/* renamed from: n5.r  reason: case insensitive filesystem */
public abstract class C0886r extends e {
    public static Map A0(C0845d... dVarArr) {
        if (dVarArr.length <= 0) {
            return C0884p.f10399a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z0(dVarArr.length));
        B0(linkedHashMap, dVarArr);
        return linkedHashMap;
    }

    public static final void B0(LinkedHashMap linkedHashMap, C0845d[] dVarArr) {
        for (C0845d dVar : dVarArr) {
            linkedHashMap.put(dVar.f10195a, dVar.f10196b);
        }
    }

    public static Map C0(ArrayList arrayList) {
        C0884p pVar = C0884p.f10399a;
        int size = arrayList.size();
        if (size == 0) {
            return pVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(z0(arrayList.size()));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0845d dVar = (C0845d) it2.next();
                linkedHashMap.put(dVar.f10195a, dVar.f10196b);
            }
            return linkedHashMap;
        }
        C0845d dVar2 = (C0845d) arrayList.get(0);
        j.e(dVar2, "pair");
        Map singletonMap = Collections.singletonMap(dVar2.f10195a, dVar2.f10196b);
        j.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static int z0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((((float) i2) / 0.75f) + 1.0f);
        }
        return f.API_PRIORITY_OTHER;
    }
}
