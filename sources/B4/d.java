package B4;

import H4.e;
import H4.f;
import P4.g;
import P4.w;
import R2.i;
import S3.t;
import Y4.C0244a;
import Y4.n;
import Y4.z;
import b5.b;
import b5.j;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.J;
import d5.k;
import e3.C0499g;
import e3.m;
import f3.C0528e;
import i3.C0586b;
import i3.C0587c;
import i3.C0590f;
import i3.C0592h;
import i3.q;
import j4.C0614b;
import j4.C0615b0;
import j4.C0624g;
import j4.n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import k.C0724m;
import m4.C0841c;
import r4.C0953c;
import r4.C0956f;

public final class d implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f350a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f351b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f352c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d(q qVar, C0587c cVar, HashMap hashMap, int i2) {
        this.f350a = i2;
        this.d = qVar;
        this.f352c = cVar;
        this.f351b = hashMap;
    }

    /* JADX WARNING: type inference failed for: r2v6, types: [e3.g, f3.t] */
    public final void onComplete(Task task) {
        k kVar;
        k kVar2;
        k kVar3;
        switch (this.f350a) {
            case 0:
                Iterator it2 = ((List) task.getResult()).iterator();
                int i2 = 0;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    e eVar = (e) this.d;
                    if (hasNext) {
                        Task task2 = (Task) it2.next();
                        if (task2.isSuccessful() && (kVar = (k) ((C0587c) task2.getResult()).f(k.class)) != null) {
                            eVar.f354b.f363j0.add(0, C0244a.a((b) ((ArrayList) this.f351b).get(i2), kVar));
                        }
                        i2++;
                    } else {
                        g gVar = eVar.f354b;
                        g gVar2 = eVar.f354b;
                        gVar.f364k0 = new C0614b(gVar2.f357d0, gVar2.f363j0, 0);
                        gVar2.f360g0.setAdapter(gVar2.f364k0);
                        gVar2.f360g0.setEmptyView(gVar2.f361h0);
                        R2.b.w(false);
                        if (((C0587c) this.f352c).d() == 15) {
                            gVar2.f366m0 = true;
                            return;
                        }
                        return;
                    }
                }
            case 1:
                e eVar2 = (e) this.d;
                int size = eVar2.f354b.f363j0.size();
                Iterator it3 = ((List) task.getResult()).iterator();
                int i5 = 0;
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    g gVar3 = eVar2.f354b;
                    if (hasNext2) {
                        Task task3 = (Task) it3.next();
                        if (task3.isSuccessful() && (kVar2 = (k) ((C0587c) task3.getResult()).f(k.class)) != null) {
                            gVar3.f363j0.add(size, C0244a.a((b) ((ArrayList) this.f351b).get(i5), kVar2));
                        }
                        i5++;
                    } else {
                        gVar3.f364k0.notifyDataSetChanged();
                        R2.b.w(false);
                        if (((C0587c) this.f352c).d() < 10) {
                            gVar3.f366m0 = false;
                            return;
                        }
                        return;
                    }
                }
            case 2:
                ((K4.k) ((f) this.d).d).f1544Q0.E("notificationObject").E("hasUnReadPrivateMessage").I(Boolean.TRUE).addOnSuccessListener(new e(this, 3));
                return;
            case 3:
                if (task.isSuccessful()) {
                    m mVar = (m) this.f351b;
                    mVar.getClass();
                    String str = (String) this.f352c;
                    I.d(str);
                    FirebaseAuth instance = FirebaseAuth.getInstance(i.f(((C0528e) mVar).f7922c));
                    instance.getClass();
                    I.d(str);
                    instance.f6865e.zzd(instance.f6862a, mVar, str, new C0499g(instance, 0)).addOnCompleteListener(new H4.d((Object) this, 4));
                    return;
                }
                R2.b.w(false);
                a.n(MyApplication.f7090a, R.string.wrong_old_password, ((g) this.d).f2207d0, (String) null);
                return;
            case 4:
                if (!task.isSuccessful()) {
                    return;
                }
                if (((C0528e) FirebaseAuth.getInstance().f6866f).f7921b.f7918p) {
                    R2.b.w(false);
                    a.n(MyApplication.f7090a, R.string.can_not_change_verified_email, ((w) this.d).f2290d0, (String) null);
                    return;
                }
                FirebaseAuth instance2 = FirebaseAuth.getInstance();
                instance2.getClass();
                String str2 = (String) this.f351b;
                I.d(str2);
                instance2.f6865e.zzc(instance2.f6862a, str2, instance2.f6867i).addOnCompleteListener(new H4.d((Object) this, 8));
                return;
            case 5:
                C0587c cVar = (C0587c) this.f352c;
                C0586b c3 = cVar.c();
                while (true) {
                    Iterator it4 = c3.f8276a;
                    boolean hasNext3 = it4.hasNext();
                    t tVar = (t) this.d;
                    if (hasNext3) {
                        v3.q qVar = (v3.q) it4.next();
                        C0590f E6 = c3.f8277b.f8279b.E(qVar.f12304a.f12280a);
                        v3.m t6 = v3.m.t(qVar.f12305b);
                        String F = E6.F();
                        ((J) tVar.f2700b).f7151k0.add(0, n.a(F, ((Long) r3.b.c(Long.class, t6.f12296a.getValue())).longValue(), (k) ((HashMap) this.f351b).get(F)));
                    } else {
                        J j6 = (J) tVar.f2700b;
                        ((J) tVar.f2700b).f7150j0 = new C0615b0(j6.f7144d0, j6.f7151k0);
                        j6.f7148h0.setAdapter(j6.f7150j0);
                        j6.f7148h0.setEmptyView(j6.f7147g0);
                        R2.b.w(false);
                        if (cVar.d() == 15) {
                            j6.f7153m0 = true;
                            return;
                        }
                        return;
                    }
                }
            case zzaky.zzf.zzf /*6*/:
                com.mtma.criminal.city.fragments.gangBase.I i6 = (com.mtma.criminal.city.fragments.gangBase.I) this.d;
                int size2 = ((J) i6.f7143b).f7151k0.size();
                C0587c cVar2 = (C0587c) this.f352c;
                C0586b c6 = cVar2.c();
                while (true) {
                    Iterator it5 = c6.f8276a;
                    boolean hasNext4 = it5.hasNext();
                    J j7 = (J) i6.f7143b;
                    if (hasNext4) {
                        v3.q qVar2 = (v3.q) it5.next();
                        C0590f E7 = c6.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                        v3.m t7 = v3.m.t(qVar2.f12305b);
                        String F6 = E7.F();
                        j7.f7151k0.add(size2, n.a(F6, ((Long) r3.b.c(Long.class, t7.f12296a.getValue())).longValue(), (k) ((HashMap) this.f351b).get(F6)));
                    } else {
                        j7.f7150j0.notifyDataSetChanged();
                        R2.b.w(false);
                        if (cVar2.d() < 10) {
                            j7.f7153m0 = false;
                            return;
                        }
                        return;
                    }
                }
            case zzaky.zzf.zzg /*7*/:
                a.c(C0592h.b().e(), "players").E(((C0624g) this.d).f9012c).E("notificationObject").E("hasUnReadPrivateMessage").I(Boolean.TRUE).addOnSuccessListener(new e(this, 19));
                return;
            case 8:
                Iterator it6 = ((List) task.getResult()).iterator();
                int i7 = 0;
                while (true) {
                    boolean hasNext5 = it6.hasNext();
                    C0724m mVar2 = (C0724m) this.d;
                    if (hasNext5) {
                        Task task4 = (Task) it6.next();
                        if (task4.isSuccessful() && (kVar3 = (k) ((C0587c) task4.getResult()).f(k.class)) != null) {
                            z zVar = new z();
                            zVar.f4451a = (String) ((ArrayList) this.f351b).get(i7);
                            zVar.f4455f = ((Long) ((ArrayList) this.f352c).get(i7)).longValue();
                            zVar.f4452b = kVar3.getNickName();
                            zVar.f4453c = kVar3.getProfilePicUrl();
                            zVar.f4454e = kVar3.getGender();
                            zVar.g = R2.b.k0(kVar3.getVipEndTime());
                            zVar.h = R2.b.l0(kVar3.getLastSeen());
                            ((C0841c) mVar2.f9345b).f10191k0.add(0, zVar);
                        }
                        i7++;
                    } else {
                        C0841c cVar3 = (C0841c) mVar2.f9345b;
                        ((C0841c) mVar2.f9345b).f10192l0 = new n0(cVar3.f10184d0, cVar3.f10191k0);
                        cVar3.f10188h0.setAdapter(cVar3.f10192l0);
                        R2.b.w(false);
                        return;
                    }
                }
            case 9:
                int i8 = 0;
                while (true) {
                    ArrayList arrayList = (ArrayList) this.f351b;
                    int size3 = arrayList.size();
                    C0953c cVar4 = (C0953c) this.d;
                    if (i8 < size3) {
                        if (((j) arrayList.get(i8)).isFromSystem()) {
                            C0956f.V(cVar4.f11213a, (j) arrayList.get(i8), i8);
                        } else {
                            cVar4.f11213a.X((j) arrayList.get(i8), i8);
                        }
                        i8++;
                    } else {
                        C0956f fVar = cVar4.f11213a;
                        fVar.f11225h0.setAdapter(fVar.f11228k0);
                        C0956f fVar2 = cVar4.f11213a;
                        fVar2.f11225h0.setSelection(fVar2.f11227j0.size() - 1);
                        C0587c cVar5 = (C0587c) this.f352c;
                        fVar2.f11231n0 = cVar5.d();
                        if (fVar2.f11230m0 == null) {
                            fVar2.f11230m0 = new C0953c(fVar2);
                            fVar2.f11229l0.p(15).b(fVar2.f11230m0);
                        }
                        if (cVar5.d() == 15) {
                            fVar2.f11234q0 = true;
                        }
                        R2.b.w(false);
                        return;
                    }
                }
            default:
                y1.b bVar = (y1.b) this.f351b;
                String str3 = (String) this.f352c;
                ScheduledFuture scheduledFuture = (ScheduledFuture) this.d;
                synchronized (bVar.f12651a) {
                    bVar.f12651a.remove(str3);
                }
                scheduledFuture.cancel(false);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i2) {
        this.f350a = i2;
        this.d = obj;
        this.f351b = obj2;
        this.f352c = obj3;
    }

    public /* synthetic */ d(y1.b bVar, String str, ScheduledFuture scheduledFuture) {
        this.f350a = 10;
        this.f351b = bVar;
        this.f352c = str;
        this.d = scheduledFuture;
    }
}
