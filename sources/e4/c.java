package E4;

import android.support.v4.media.session.a;
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
import o3.d;
import r3.b;
import v3.m;

public final class c implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f628a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f629b;

    public /* synthetic */ c(d dVar, int i2) {
        this.f628a = i2;
        this.f629b = dVar;
    }

    public final void B(C0588d dVar) {
        int i2 = this.f628a;
    }

    public final void u(C0587c cVar) {
        switch (this.f628a) {
            case 0:
                boolean g = cVar.g();
                d dVar = this.f629b;
                boolean z3 = false;
                if (g) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    C0586b c3 = cVar.c();
                    while (true) {
                        Iterator it2 = c3.f8276a;
                        if (it2.hasNext()) {
                            v3.q qVar = (v3.q) it2.next();
                            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            String str = (String) b.c(String.class, m.t(qVar.f12305b).f12296a.getValue());
                            if (!z3) {
                                dVar.f640n0 = str;
                                z3 = true;
                            }
                            String F = E6.F();
                            long c02 = a.c0(str);
                            arrayList2.add(F);
                            arrayList3.add(Long.valueOf(c02));
                            if (dVar.f631e0 == 3) {
                                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                d.d(C0592h.b().e(), "gangs", "gangsData", F, "name").d(new B4.c(taskCompletionSource, 2));
                                arrayList.add(taskCompletionSource.getTask());
                                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                                d.d(C0592h.b().e(), "gangs", "gangsData", F, "imageUrl").d(new a(taskCompletionSource2, 0));
                                arrayList.add(taskCompletionSource2.getTask());
                            } else {
                                TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
                                d.c(C0592h.b().e(), "players", F, "mainStatesObject").d(new B4.c(taskCompletionSource3, 3));
                                arrayList.add(taskCompletionSource3.getTask());
                            }
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new b(this, arrayList2, arrayList3, cVar, 0));
                            return;
                        }
                    }
                } else {
                    dVar.f641o0 = false;
                    dVar.f635i0.setEmptyView(dVar.f636j0);
                    R2.b.w(false);
                    return;
                }
            default:
                boolean g5 = cVar.g();
                d dVar2 = this.f629b;
                boolean z4 = false;
                if (g5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    C0586b c6 = cVar.c();
                    while (true) {
                        Iterator it3 = c6.f8276a;
                        if (it3.hasNext()) {
                            v3.q qVar2 = (v3.q) it3.next();
                            C0590f E7 = c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                            String str2 = (String) b.c(String.class, m.t(qVar2.f12305b).f12296a.getValue());
                            if (!z4) {
                                dVar2.f640n0 = str2;
                                z4 = true;
                            }
                            String F6 = E7.F();
                            long c03 = a.c0(str2);
                            arrayList5.add(F6);
                            arrayList6.add(Long.valueOf(c03));
                            TaskCompletionSource taskCompletionSource4 = new TaskCompletionSource();
                            d.c(C0592h.b().e(), "players", F6, "mainStatesObject").d(new B4.c(taskCompletionSource4, 4));
                            arrayList4.add(taskCompletionSource4.getTask());
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList4).addOnCompleteListener(new b(this, arrayList5, arrayList6, cVar, 1));
                            return;
                        }
                    }
                } else {
                    dVar2.f641o0 = false;
                    v0.e(dVar2.f630d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
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
