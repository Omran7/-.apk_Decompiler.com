package P4;

import D2.l;
import F3.r;
import K1.e;
import R2.b;
import S3.I;
import S3.K;
import Z3.d;
import a5.C0264a;
import a5.C0265b;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.ListView;
import b5.f;
import com.bumptech.glide.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.A;
import com.mtma.criminal.city.fragments.gangBase.z;
import com.mtma.criminal.city.utils.Q;
import com.mtma.criminal.city.utils.v0;
import d5.k;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import j4.C0626h;
import j4.C0633k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import v3.m;
import v3.q;

public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f2186b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f2185a = i2;
        this.f2186b = obj;
    }

    /* JADX WARNING: type inference failed for: r9v6, types: [Y4.b, java.lang.Object] */
    public final void onComplete(Task task) {
        boolean z3;
        f fVar;
        MyApplication myApplication;
        switch (this.f2185a) {
            case 0:
                d dVar = (d) this.f2186b;
                dVar.getClass();
                boolean z4 = false;
                try {
                    C0587c cVar = (C0587c) ((Task) ((List) task.getResult()).get(1)).getResult();
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    C0586b c3 = ((C0587c) ((Task) ((List) task.getResult()).get(0)).getResult()).c();
                    Iterator it2 = c3.f8276a;
                    while (it2.hasNext()) {
                        q qVar = (q) it2.next();
                        arrayList.add(new C0587c(c3.f8277b.f8279b.E(qVar.f12304a.f12280a), m.t(qVar.f12305b)));
                        arrayList2.add(0);
                    }
                    C0586b c6 = cVar.c();
                    Iterator it3 = c6.f8276a;
                    while (it3.hasNext()) {
                        q qVar2 = (q) it3.next();
                        arrayList.add(new C0587c(c6.f8277b.f8279b.E(qVar2.f12304a.f12280a), m.t(qVar2.f12305b)));
                        arrayList2.add(1);
                    }
                    if (arrayList.isEmpty()) {
                        b.w(false);
                        dVar.f2198j0.setText(R.string.empty_admin_players);
                        ((ListView) dVar.f2199k0).setEmptyView(dVar.f2198j0);
                        return;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    int i2 = 0;
                    while (i2 < arrayList.size()) {
                        C0587c cVar2 = (C0587c) arrayList.get(i2);
                        k kVar = (k) cVar2.a("mainStatesObject").f(k.class);
                        String nickName = kVar.getNickName();
                        String profilePicUrl = kVar.getProfilePicUrl();
                        boolean k02 = b.k0(kVar.getVipEndTime());
                        int gender = kVar.getGender();
                        int intValue = ((Integer) arrayList2.get(i2)).intValue();
                        try {
                            long lastSeen = kVar.getLastSeen();
                            String F = cVar2.f8279b.F();
                            ? obj = new Object();
                            obj.f4329b = nickName;
                            obj.f4328a = F;
                            obj.f4330c = profilePicUrl;
                            obj.d = k02;
                            obj.f4331e = gender;
                            obj.f4332f = intValue;
                            obj.g = lastSeen;
                            arrayList3.add(obj);
                            i2++;
                            z4 = false;
                        } catch (Exception unused) {
                            z3 = false;
                        }
                    }
                    z3 = z4;
                    try {
                        b.w(z3);
                        ((ListView) dVar.f2199k0).setAdapter(new C0626h(dVar.f2197i0, arrayList3, 0));
                        return;
                    } catch (Exception unused2) {
                        b.w(z3);
                        dVar.f2198j0.setText(R.string.empty_admin_players);
                        ((ListView) dVar.f2199k0).setEmptyView(dVar.f2198j0);
                        return;
                    }
                } catch (Exception unused3) {
                    z3 = false;
                    b.w(z3);
                    dVar.f2198j0.setText(R.string.empty_admin_players);
                    ((ListView) dVar.f2199k0).setEmptyView(dVar.f2198j0);
                    return;
                }
            case 1:
                I.b((Intent) this.f2186b);
                return;
            case 2:
                ((K) this.f2186b).f2640b.trySetResult(null);
                return;
            case 3:
                ((ScheduledFuture) this.f2186b).cancel(false);
                return;
            case 4:
                z zVar = (z) this.f2186b;
                zVar.getClass();
                Iterator it4 = ((List) task.getResult()).iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    A a6 = zVar.f7337b;
                    if (hasNext) {
                        Task task2 = (Task) it4.next();
                        if (task2.isSuccessful() && (fVar = (f) ((C0587c) task2.getResult()).f(f.class)) != null) {
                            a6.f7098i0.add(0, fVar);
                        }
                    } else {
                        Context context = a6.f7093d0;
                        ArrayList arrayList4 = a6.f7098i0;
                        C0626h hVar = new C0626h(context, arrayList4, 1);
                        a6.f7099j0 = hVar;
                        a6.f7096g0.setAdapter(hVar);
                        com.google.android.gms.internal.measurement.a.o(MyApplication.f7090a, R.string.gang_empty_strongest_gangs, a6.f7097h0);
                        a6.f7096g0.setEmptyView(a6.f7097h0);
                        if (arrayList4.size() == 8) {
                            a6.f7101l0 = true;
                        }
                        b.w(false);
                        return;
                    }
                }
            case 5:
                boolean isSuccessful = task.isSuccessful();
                Context context2 = (Context) this.f2186b;
                int i5 = R.string.unknown_error_try_again;
                if (!isSuccessful) {
                    b.w(false);
                    myApplication = MyApplication.f7090a;
                } else if (task.getResult() != null) {
                    d dVar2 = new d();
                    C0265b bVar = (C0265b) dVar2.b(C0265b.class, dVar2.e((Map) ((r) task.getResult()).f784a));
                    if (bVar == null) {
                        b.w(false);
                        myApplication = MyApplication.f7090a;
                    } else if (bVar.isAllProcessSuccess) {
                        b.w(false);
                        b.M0(R.raw.use_pharmacy_material);
                        if (bVar.currentPlace == 0) {
                            v0.e(context2, MyApplication.f7090a.getApplicationContext().getString(R.string.toast_getting_out_of_hospital));
                            Q.b(32, o.getAccountObject().getId(), (long) 1);
                        } else {
                            c.s0(context2, MyApplication.f7090a.getApplicationContext().getString(R.string.remaining_time_for_hospital, new Object[]{e.L("HH:mm:ss", c.W(Long.valueOf(bVar.placeEndTimeInMilli)) - c.f5744o)}), (String) null);
                        }
                        Q.b(31, o.getAccountObject().getId(), (long) 1);
                        return;
                    } else {
                        b.w(false);
                        if (!bVar.isMaterialCountChanged) {
                            myApplication = MyApplication.f7090a;
                            i5 = R.string.toast_not_enough_items;
                        } else if (bVar.currentPlace != 1) {
                            myApplication = MyApplication.f7090a;
                            i5 = R.string.toast_not_in_hospital;
                        } else {
                            myApplication = MyApplication.f7090a;
                        }
                    }
                } else {
                    b.w(false);
                    myApplication = MyApplication.f7090a;
                }
                com.google.android.gms.internal.measurement.a.n(myApplication, i5, context2, (String) null);
                return;
            case zzaky.zzf.zzf /*6*/:
                ((l) this.f2186b).a((C0264a) null);
                return;
            case zzaky.zzf.zzg /*7*/:
                boolean isSuccessful2 = task.isSuccessful();
                I4.a aVar = (I4.a) this.f2186b;
                if (!isSuccessful2) {
                    aVar.a(new C0265b());
                    return;
                } else if (task.getResult() != null) {
                    d dVar3 = new d();
                    C0265b bVar2 = (C0265b) dVar3.b(C0265b.class, dVar3.e((Map) ((r) task.getResult()).f784a));
                    if (bVar2 != null) {
                        aVar.a(bVar2);
                        return;
                    } else {
                        aVar.a(new C0265b());
                        return;
                    }
                } else {
                    aVar.a(new C0265b());
                    return;
                }
            case 8:
                boolean isSuccessful3 = task.isSuccessful();
                C0633k0 k0Var = (C0633k0) this.f2186b;
                if (!isSuccessful3) {
                    k0Var.a(new C0265b());
                    return;
                } else if (task.getResult() != null) {
                    d dVar4 = new d();
                    C0265b bVar3 = (C0265b) dVar4.b(C0265b.class, dVar4.e((Map) ((r) task.getResult()).f784a));
                    if (bVar3 != null) {
                        k0Var.a(bVar3);
                        return;
                    } else {
                        k0Var.a(new C0265b());
                        return;
                    }
                } else {
                    k0Var.a(new C0265b());
                    return;
                }
            default:
                boolean isSuccessful4 = task.isSuccessful();
                C0633k0 k0Var2 = (C0633k0) this.f2186b;
                if (!isSuccessful4) {
                    Log.e("UNIX", "the updateLocationPlaceTimeResultObject : 4 " + task.getException());
                    k0Var2.a(new C0265b());
                    return;
                } else if (task.getResult() != null) {
                    d dVar5 = new d();
                    C0265b bVar4 = (C0265b) dVar5.b(C0265b.class, dVar5.e((Map) ((r) task.getResult()).f784a));
                    if (bVar4 != null) {
                        Log.e("UNIX", "the updateLocationPlaceTimeResultObject : " + bVar4);
                        k0Var2.a(bVar4);
                        return;
                    }
                    Log.e("UNIX", "the updateLocationPlaceTimeResultObject : 2");
                    k0Var2.a(new C0265b());
                    return;
                } else {
                    Log.e("UNIX", "the updateLocationPlaceTimeResultObject : 3");
                    k0Var2.a(new C0265b());
                    return;
                }
        }
    }
}
