package r4;

import b5.j;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d5.o;
import i3.C0585a;
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
import r3.b;
import v3.m;

/* renamed from: r4.c  reason: case insensitive filesystem */
public final class C0953c implements q, C0585a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C0956f f11213a;

    public /* synthetic */ C0953c(C0956f fVar) {
        this.f11213a = fVar;
    }

    public void k(C0587c cVar) {
        C0956f fVar = this.f11213a;
        try {
            int i2 = fVar.f11232o0;
            if (((long) i2) < fVar.f11231n0) {
                fVar.f11232o0 = i2 + 1;
                return;
            }
            j jVar = (j) cVar.f(j.class);
            if (jVar != null) {
                boolean isFromSystem = jVar.isFromSystem();
                ArrayList arrayList = fVar.f11227j0;
                if (isFromSystem) {
                    C0956f.V(fVar, jVar, arrayList.size());
                    fVar.f11228k0.notifyDataSetChanged();
                } else if (jVar.getPlayerId().equals(o.getAccountObject().getId())) {
                    fVar.X(jVar, arrayList.size());
                    fVar.f11228k0.notifyDataSetChanged();
                } else {
                    C0956f.W(fVar, jVar);
                }
            }
        } catch (Exception e6) {
            a.r("Exception from try-catch inside ", "f", " class in addListenerToChatMessages method.", "f", e6);
        }
    }

    public void u(C0587c cVar) {
        boolean g = cVar.g();
        C0956f fVar = this.f11213a;
        if (g) {
            fVar.f11227j0.clear();
            fVar.f11232o0 = 0;
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
                        a.r("Exception from try-catch inside ", "f", " class in displayFirstLoadingMessages method.", "f", e6);
                    }
                }
                j jVar = (j) b.c(j.class, t6.f12296a.getValue());
                arrayList.add(jVar);
                if (!jVar.isFromSystem() && !jVar.getPlayerId().equals(o.getAccountObject().getId()) && !arrayList2.contains(jVar.getPlayerId())) {
                    arrayList2.add(jVar.getPlayerId());
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                String str = (String) arrayList2.get(i2);
                d.c(C0592h.b().e(), "players", str, "mainStatesObject").d(new C0952b(this, str, taskCompletionSource, 0));
                arrayList3.add(taskCompletionSource.getTask());
                d.d(C0592h.b().e(), "players", str, "gangObject", "tag").d(new C0952b(this, str, taskCompletionSource2, 1));
                arrayList3.add(taskCompletionSource2.getTask());
            }
            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList3).addOnCompleteListener(new B4.d((Object) this, (Object) arrayList, (Object) cVar, 9));
            return;
        }
        fVar.f11225h0.setAdapter(fVar.f11228k0);
        fVar.f11225h0.setEmptyView(fVar.f11226i0);
        if (fVar.f11230m0 == null) {
            fVar.f11230m0 = new C0953c(fVar);
            fVar.f11229l0.p(15).b(fVar.f11230m0);
        }
        R2.b.w(false);
    }

    public void B(C0588d dVar) {
    }

    public void i(C0587c cVar) {
    }

    public void q(C0587c cVar) {
    }
}
