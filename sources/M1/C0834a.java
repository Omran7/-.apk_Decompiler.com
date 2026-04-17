package m1;

import Z0.d;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.a;
import java.util.HashMap;

/* renamed from: m1.a  reason: case insensitive filesystem */
public abstract class C0834a {

    /* renamed from: a  reason: collision with root package name */
    public static final SparseArray f10070a = new SparseArray();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f10071b;

    static {
        HashMap hashMap = new HashMap();
        f10071b = hashMap;
        hashMap.put(d.f4466a, 0);
        hashMap.put(d.f4467b, 1);
        hashMap.put(d.f4468c, 2);
        for (d dVar : hashMap.keySet()) {
            f10070a.append(((Integer) f10071b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f10071b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i2) {
        d dVar = (d) f10070a.get(i2);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(a.f(i2, "Unknown Priority for value "));
    }
}
