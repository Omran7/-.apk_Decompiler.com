package V3;

import B.m;
import android.app.Activity;
import com.google.android.gms.common.api.internal.C0357k;
import com.google.android.gms.common.api.internal.C0358l;
import com.google.android.gms.common.api.internal.C0359m;
import java.util.HashMap;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final c f3766c = new c();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f3767a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Object f3768b = new Object();

    public final void a(Object obj) {
        synchronized (this.f3768b) {
            a aVar = (a) this.f3767a.get(obj);
            if (aVar != null) {
                C0359m fragment = C0358l.getFragment(new C0357k(aVar.f3762a));
                b bVar = (b) fragment.d(b.class, "StorageOnStopCallback");
                if (bVar == null) {
                    bVar = new b(fragment);
                }
                synchronized (bVar.f3765a) {
                    bVar.f3765a.remove(aVar);
                }
            }
        }
    }

    public final void b(m mVar, Activity activity, Object obj) {
        synchronized (this.f3768b) {
            a aVar = new a(mVar, activity, obj);
            C0359m fragment = C0358l.getFragment(new C0357k(activity));
            b bVar = (b) fragment.d(b.class, "StorageOnStopCallback");
            if (bVar == null) {
                bVar = new b(fragment);
            }
            synchronized (bVar.f3765a) {
                bVar.f3765a.add(aVar);
            }
            this.f3767a.put(obj, aVar);
        }
    }
}
