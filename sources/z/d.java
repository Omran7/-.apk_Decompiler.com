package Z;

import android.util.Log;
import androidx.fragment.app.C0286s;
import kotlin.jvm.internal.j;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f4461a = c.f4460a;

    public static c a(C0286s sVar) {
        while (sVar != null) {
            if (sVar.v()) {
                sVar.p();
            }
            sVar = sVar.f5150D;
        }
        return f4461a;
    }

    public static void b(a aVar) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f4456a.getClass().getName()), aVar);
        }
    }

    public static final void c(C0286s sVar, String str) {
        j.e(sVar, "fragment");
        j.e(str, "previousFragmentId");
        b(new a(sVar, "Attempting to reuse fragment " + sVar + " with previous ID " + str));
        a(sVar).getClass();
    }
}
