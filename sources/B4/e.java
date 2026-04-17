package B4;

import b5.b;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.utils.v0;
import i3.C0586b;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import v3.m;

public final class e implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f353a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f354b;

    public /* synthetic */ e(g gVar, int i2) {
        this.f353a = i2;
        this.f354b = gVar;
    }

    public final void B(C0588d dVar) {
        int i2 = this.f353a;
    }

    public final void u(C0587c cVar) {
        switch (this.f353a) {
            case 0:
                boolean g = cVar.g();
                g gVar = this.f354b;
                boolean z3 = false;
                if (g) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C0586b c3 = cVar.c();
                    while (true) {
                        Iterator it2 = c3.f8276a;
                        if (it2.hasNext()) {
                            v3.q qVar = (v3.q) it2.next();
                            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            m t6 = m.t(qVar.f12305b);
                            if (!z3) {
                                gVar.f365l0 = E6.F();
                                z3 = true;
                            }
                            b bVar = (b) r3.b.c(b.class, t6.f12296a.getValue());
                            arrayList2.add(bVar);
                            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                            a.c(C0592h.b().e(), "players").E(bVar.getPlayerId()).E("mainStatesObject").d(new c(taskCompletionSource, 0));
                            arrayList.add(taskCompletionSource.getTask());
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new d((Object) this, (Object) arrayList2, (Object) cVar, 0));
                            return;
                        }
                    }
                } else {
                    gVar.f366m0 = false;
                    gVar.f360g0.setEmptyView(gVar.f361h0);
                    R2.b.w(false);
                    return;
                }
            default:
                boolean g5 = cVar.g();
                g gVar2 = this.f354b;
                boolean z4 = false;
                if (g5) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    C0586b c6 = cVar.c();
                    while (true) {
                        Iterator it3 = c6.f8276a;
                        if (it3.hasNext()) {
                            v3.q qVar2 = (v3.q) it3.next();
                            C0590f E7 = c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                            m t7 = m.t(qVar2.f12305b);
                            if (!z4) {
                                gVar2.f365l0 = E7.F();
                                z4 = true;
                            }
                            b bVar2 = (b) r3.b.c(b.class, t7.f12296a.getValue());
                            arrayList4.add(bVar2);
                            TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                            a.c(C0592h.b().e(), "players").E(bVar2.getPlayerId()).E("mainStatesObject").d(new c(taskCompletionSource2, 1));
                            arrayList3.add(taskCompletionSource2.getTask());
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList3).addOnCompleteListener(new d((Object) this, (Object) arrayList4, (Object) cVar, 1));
                            return;
                        }
                    }
                } else {
                    gVar2.f366m0 = false;
                    v0.e(gVar2.f357d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                    R2.b.w(false);
                    return;
                }
        }
    }

    private final void a(C0588d dVar) {
    }

    private final void b(C0588d dVar) {
    }
}
