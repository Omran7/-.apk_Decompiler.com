package R2;

import android.util.Log;
import com.google.android.gms.common.api.internal.C0348b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class g implements C0348b {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f2485a = new AtomicReference();

    public final void a(boolean z3) {
        synchronized (i.f2488j) {
            try {
                Iterator it2 = new ArrayList(i.f2489k.values()).iterator();
                while (it2.hasNext()) {
                    i iVar = (i) it2.next();
                    if (iVar.f2493e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it3 = iVar.f2495i.iterator();
                        while (it3.hasNext()) {
                            ((f) it3.next()).a(z3);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
