package V3;

import android.util.Log;
import com.google.android.gms.common.api.internal.C0358l;
import com.google.android.gms.common.api.internal.C0359m;
import java.util.ArrayList;
import java.util.Iterator;

public final class b extends C0358l {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f3765a = new ArrayList();

    public b(C0359m mVar) {
        super(mVar);
        this.mLifecycleFragment.b("StorageOnStopCallback", this);
    }

    public final void onStop() {
        ArrayList arrayList;
        synchronized (this.f3765a) {
            arrayList = new ArrayList(this.f3765a);
            this.f3765a.clear();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (aVar != null) {
                Log.d("StorageOnStopCallback", "removing subscription from activity.");
                aVar.f3763b.run();
                c.f3766c.a(aVar.f3764c);
            }
        }
    }
}
