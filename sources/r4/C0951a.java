package r4;

import K4.h;
import R2.b;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o3.d;
import r0.j;
import v3.m;

/* renamed from: r4.a  reason: case insensitive filesystem */
public final class C0951a implements j, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0956f f11209a;

    public /* synthetic */ C0951a(C0956f fVar) {
        this.f11209a = fVar;
    }

    public void a() {
        C0956f fVar = this.f11209a;
        if (fVar.f11234q0) {
            fVar.f11229l0.r().h(fVar.f11233p0).p(10).d(new C0951a(fVar));
            return;
        }
        fVar.f11224g0.setRefreshing(false);
        v0.e(fVar.f11221d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
        b.M0(R.raw.error_loading);
    }

    public void u(C0587c cVar) {
        boolean g = cVar.g();
        C0956f fVar = this.f11209a;
        if (g) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0586b c3 = cVar.c();
            boolean z3 = false;
            while (true) {
                Iterator it2 = c3.f8276a;
                if (!it2.hasNext()) {
                    break;
                }
                v3.q qVar = (v3.q) it2.next();
                C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                m t6 = m.t(qVar.f12305b);
                if (!z3) {
                    try {
                        fVar.f11233p0 = E6.F();
                        z3 = true;
                    } catch (Exception e6) {
                        a.r("Exception from try-catch inside ", "f", " class in displayOldMessages method.", "f", e6);
                    }
                }
                b5.j jVar = (b5.j) r3.b.c(b5.j.class, t6.f12296a.getValue());
                if (jVar != null) {
                    arrayList.add(jVar);
                    if (!jVar.isFromSystem() && !jVar.getPlayerId().equals(o.getAccountObject().getId()) && !arrayList2.contains(jVar.getPlayerId()) && !fVar.f11235r0.containsKey(jVar.getPlayerId())) {
                        arrayList2.add(jVar.getPlayerId());
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                String str = (String) arrayList2.get(i2);
                d.c(C0592h.b().e(), "players", str, "mainStatesObject").d(new C0954d(this, str, taskCompletionSource, 0));
                arrayList3.add(taskCompletionSource.getTask());
                d.d(C0592h.b().e(), "players", str, "gangObject", "tag").d(new C0954d(this, str, taskCompletionSource2, 1));
                arrayList3.add(taskCompletionSource2.getTask());
            }
            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList3).addOnCompleteListener(new h(this, arrayList, 10));
            if (cVar.d() < 10) {
                fVar.f11234q0 = false;
            }
        } else {
            fVar.f11234q0 = false;
            v0.e(fVar.f11221d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
            b.M0(R.raw.error_loading);
        }
        fVar.f11224g0.setRefreshing(false);
    }

    public void B(C0588d dVar) {
    }
}
