package com.mtma.criminal.city.fragments.gangBase;

import E4.a;
import S3.C0146g;
import b5.f;
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

public final class z implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7336a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A f7337b;

    public /* synthetic */ z(A a6, int i2) {
        this.f7336a = i2;
        this.f7337b = a6;
    }

    public final void B(C0588d dVar) {
        int i2 = this.f7336a;
    }

    public final void u(C0587c cVar) {
        switch (this.f7336a) {
            case 0:
                boolean g = cVar.g();
                A a6 = this.f7337b;
                if (g) {
                    int size = a6.f7098i0.size();
                    C0586b c3 = cVar.c();
                    boolean z3 = false;
                    while (true) {
                        Iterator it2 = c3.f8276a;
                        if (it2.hasNext()) {
                            v3.q qVar = (v3.q) it2.next();
                            C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                            m t6 = m.t(qVar.f12305b);
                            if (!z3) {
                                a6.f7100k0 = E6.F();
                                z3 = true;
                            }
                            a6.f7098i0.add(size, (f) b.c(f.class, t6.f12296a.getValue()));
                        } else {
                            a6.f7099j0.notifyDataSetChanged();
                            if (cVar.d() < 8) {
                                a6.f7101l0 = false;
                            }
                        }
                    }
                } else {
                    a6.f7101l0 = false;
                    v0.e(a6.f7093d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
                    R2.b.M0(R.raw.error_loading);
                }
                R2.b.w(false);
                return;
            case 1:
                boolean g5 = cVar.g();
                A a7 = this.f7337b;
                boolean z4 = false;
                if (g5) {
                    ArrayList arrayList = new ArrayList();
                    C0586b c6 = cVar.c();
                    while (true) {
                        Iterator it3 = c6.f8276a;
                        if (it3.hasNext()) {
                            v3.q qVar2 = (v3.q) it3.next();
                            C0590f E7 = c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                            String str = (String) b.c(String.class, m.t(qVar2.f12305b).f12296a.getValue());
                            if (!z4) {
                                a7.f7100k0 = str;
                                z4 = true;
                            }
                            String F = E7.F();
                            if (F != null) {
                                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                                d.c(C0592h.b().e(), "gangs", "gangsData", F).d(new a(taskCompletionSource, 6));
                                arrayList.add(taskCompletionSource.getTask());
                            }
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList).addOnCompleteListener(new P4.a(this, 4));
                            return;
                        }
                    }
                } else {
                    a7.f7101l0 = false;
                    com.google.android.gms.internal.measurement.a.o(MyApplication.f7090a, R.string.gang_empty_strongest_gangs, a7.f7097h0);
                    a7.f7096g0.setEmptyView(a7.f7097h0);
                    R2.b.w(false);
                    return;
                }
            default:
                boolean g6 = cVar.g();
                A a8 = this.f7337b;
                boolean z5 = false;
                if (g6) {
                    ArrayList arrayList2 = new ArrayList();
                    C0586b c7 = cVar.c();
                    while (true) {
                        Iterator it4 = c7.f8276a;
                        if (it4.hasNext()) {
                            v3.q qVar3 = (v3.q) it4.next();
                            C0590f E8 = c7.f8277b.f8279b.E(qVar3.f12304a.f12280a);
                            String str2 = (String) b.c(String.class, m.t(qVar3.f12305b).f12296a.getValue());
                            if (!z5) {
                                a8.f7100k0 = str2;
                                z5 = true;
                            }
                            String F6 = E8.F();
                            if (F6 != null) {
                                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                                d.c(C0592h.b().e(), "gangs", "gangsData", F6).d(new a(taskCompletionSource2, 7));
                                arrayList2.add(taskCompletionSource2.getTask());
                            }
                        } else {
                            Tasks.whenAllComplete((Collection<? extends Task<?>>) arrayList2).addOnCompleteListener(new C0146g(this, cVar, 1));
                            return;
                        }
                    }
                } else {
                    a8.f7101l0 = false;
                    v0.e(a8.f7093d0, MyApplication.f7090a.getApplicationContext().getString(R.string.no_more_items));
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

    private final void c(C0588d dVar) {
    }
}
