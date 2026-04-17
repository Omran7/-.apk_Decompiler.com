package q4;

import R2.b;
import Y4.t;
import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.Purchase;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import j3.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import w0.C1056c;
import w0.C1059f;

/* renamed from: q4.a  reason: case insensitive filesystem */
public final class C0937a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11103a;

    public /* synthetic */ C0937a(e eVar) {
        this.f11103a = eVar;
    }

    public void a(C1056c cVar, ArrayList arrayList) {
        int i2 = cVar.f12358a;
        e eVar = this.f11103a;
        if (i2 == 0) {
            HashMap hashMap = new HashMap();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C1059f fVar = (C1059f) it2.next();
                for (int i5 = 0; i5 < eVar.f11118m0.size(); i5++) {
                    if (((t) eVar.f11118m0.get(i5)).f4432e.equals(fVar.f12365c)) {
                        ((t) eVar.f11118m0.get(i5)).f4433f = fVar.a().f12360a;
                    }
                }
                hashMap.put(fVar.f12365c, fVar);
            }
            new Handler(Looper.getMainLooper()).post(new g((Object) this, (Object) hashMap, 8, false));
            return;
        }
        b.w(false);
        a.n(MyApplication.f7090a, R.string.purchase_not_available_at_the_moment, eVar.f11109d0, (String) null);
    }

    public void b(C1056c cVar, List list) {
        int i2 = cVar.f12358a;
        e eVar = this.f11103a;
        if (i2 == 0 && list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                e.V(eVar, (Purchase) it2.next());
            }
        } else if (i2 != 1) {
            b.w(false);
            a.n(MyApplication.f7090a, R.string.purchase_uncompleted, eVar.f11109d0, (String) null);
        }
    }
}
