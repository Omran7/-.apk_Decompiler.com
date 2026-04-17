package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b  reason: case insensitive filesystem */
public final class C0291b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f5259a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f5260b;

    public C0291b(HashMap hashMap) {
        this.f5260b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            C0302m mVar = (C0302m) entry.getValue();
            List list = (List) this.f5259a.get(mVar);
            if (list == null) {
                list = new ArrayList();
                this.f5259a.put(mVar, list);
            }
            list.add((C0292c) entry.getKey());
        }
    }

    public static void a(List list, C0307s sVar, C0302m mVar, r rVar) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                C0292c cVar = (C0292c) list.get(size);
                cVar.getClass();
                try {
                    int i2 = cVar.f5261a;
                    Method method = cVar.f5262b;
                    if (i2 == 0) {
                        method.invoke(rVar, (Object[]) null);
                    } else if (i2 == 1) {
                        method.invoke(rVar, new Object[]{sVar});
                    } else if (i2 == 2) {
                        method.invoke(rVar, new Object[]{sVar, mVar});
                    }
                    size--;
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                } catch (IllegalAccessException e7) {
                    throw new RuntimeException(e7);
                }
            }
        }
    }
}
