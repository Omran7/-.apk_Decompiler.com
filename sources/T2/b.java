package T2;

import A2.i;
import S1.a;
import android.os.Bundle;
import com.google.android.gms.common.internal.I;
import java.util.concurrent.ConcurrentHashMap;

public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f3557b;

    /* renamed from: a  reason: collision with root package name */
    public final a f3558a;

    public b(a aVar) {
        I.g(aVar);
        this.f3558a = aVar;
        new ConcurrentHashMap();
    }

    public final void a(Bundle bundle, String str) {
        if (!U2.a.f3705b.contains("fcm") && !U2.a.f3704a.contains(str)) {
            i iVar = U2.a.f3706c;
            int i2 = iVar.d;
            int i5 = 0;
            int i6 = 0;
            while (i6 < i2) {
                boolean containsKey = bundle.containsKey((String) iVar.get(i6));
                i6++;
                if (containsKey) {
                    return;
                }
            }
            if ("_cmp".equals(str)) {
                if (!U2.a.f3705b.contains("fcm")) {
                    i iVar2 = U2.a.f3706c;
                    int i7 = iVar2.d;
                    while (i5 < i7) {
                        boolean containsKey2 = bundle.containsKey((String) iVar2.get(i5));
                        i5++;
                        if (containsKey2) {
                            return;
                        }
                    }
                    bundle.putString("_cis", "fcm_integration");
                } else {
                    return;
                }
            }
            this.f3558a.f2601a.zzz("fcm", str, bundle);
        }
    }
}
