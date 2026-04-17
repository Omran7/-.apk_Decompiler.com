package H4;

import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import i3.C0585a;
import i3.C0587c;
import java.util.ArrayList;
import r0.j;
import x1.i;

public final class b implements j, C0585a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f1020a;

    public /* synthetic */ b(h hVar) {
        this.f1020a = hVar;
    }

    public void a() {
        h hVar = this.f1020a;
        if (hVar.f1050u0) {
            hVar.f1044n0.r().h(hVar.f1049t0).p(10).d(new i((Object) hVar, 11));
            return;
        }
        hVar.f1036f0.setRefreshing(false);
        v0.e(hVar.f1034d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
        R2.b.M0(R.raw.error_loading);
    }

    public void k(C0587c cVar) {
        h hVar = this.f1020a;
        try {
            int i2 = hVar.s0;
            if (((long) i2) < hVar.f1048r0) {
                hVar.s0 = i2 + 1;
                return;
            }
            b5.j jVar = (b5.j) cVar.f(b5.j.class);
            if (jVar != null) {
                boolean isFromSystem = jVar.isFromSystem();
                ArrayList arrayList = hVar.f1042l0;
                if (isFromSystem) {
                    hVar.Y(jVar, arrayList.size());
                } else {
                    hVar.X(jVar, arrayList.size());
                }
                hVar.b0();
                hVar.f1043m0.notifyDataSetChanged();
                if (jVar.getPlayerId().equals(o.getAccountObject().getId())) {
                    hVar.f1037g0.setSelection(arrayList.size() - 1);
                }
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "h", " class in addListenerToChatMessages method.", "h", e6);
        }
    }

    public void i(C0587c cVar) {
    }

    public void q(C0587c cVar) {
    }
}
