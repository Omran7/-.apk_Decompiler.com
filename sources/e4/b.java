package E4;

import F3.r;
import H4.i;
import P4.l;
import T1.A;
import Y4.z;
import Z3.d;
import Z4.s;
import android.content.Context;
import com.bumptech.glide.c;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.H;
import d5.C0474g;
import d5.k;
import e3.C0496d;
import i3.C0587c;
import j4.Z;
import j4.n0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f624a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Serializable f625b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Serializable f626c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f627e;

    public /* synthetic */ b(Object obj, Serializable serializable, Serializable serializable2, Object obj2, int i2) {
        this.f624a = i2;
        this.f627e = obj;
        this.f625b = serializable;
        this.f626c = serializable2;
        this.d = obj2;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [java.lang.Object, Y4.z] */
    public final void onComplete(Task task) {
        k kVar;
        k kVar2;
        switch (this.f624a) {
            case 0:
                c cVar = (c) this.f627e;
                int i2 = cVar.f629b.f631e0;
                ArrayList arrayList = (ArrayList) this.f626c;
                ArrayList arrayList2 = (ArrayList) this.f625b;
                d dVar = cVar.f629b;
                if (i2 == 3) {
                    int i5 = 0;
                    for (int i6 = 0; i6 < ((List) task.getResult()).size(); i6 += 2) {
                        if (((Task) ((List) task.getResult()).get(i6)).isSuccessful()) {
                            int i7 = i6 + 1;
                            if (((Task) ((List) task.getResult()).get(i7)).isSuccessful()) {
                                Class<String> cls = String.class;
                                String str = (String) ((C0587c) ((Task) ((List) task.getResult()).get(i6)).getResult()).f(cls);
                                String str2 = (String) ((C0587c) ((Task) ((List) task.getResult()).get(i7)).getResult()).f(cls);
                                if (!(str == null || str2 == null)) {
                                    long longValue = ((Long) arrayList.get(i5)).longValue();
                                    ? obj = new Object();
                                    obj.d = 0;
                                    obj.g = false;
                                    obj.h = false;
                                    obj.f4451a = (String) arrayList2.get(i5);
                                    obj.f4455f = longValue;
                                    obj.f4452b = str;
                                    obj.f4453c = str2;
                                    dVar.f638l0.add(0, obj);
                                }
                            }
                        }
                        i5++;
                    }
                } else {
                    int i8 = 0;
                    for (Task task2 : (List) task.getResult()) {
                        if (task2.isSuccessful() && (kVar = (k) ((C0587c) task2.getResult()).f(k.class)) != null) {
                            dVar.f638l0.add(0, z.a((String) arrayList2.get(i8), ((Long) arrayList.get(i8)).longValue(), kVar));
                        }
                        i8++;
                    }
                }
                dVar.f639m0 = new n0(dVar.f630d0, dVar.f638l0, dVar.f631e0, dVar.f632f0);
                dVar.f635i0.setAdapter(dVar.f639m0);
                dVar.f635i0.setEmptyView(dVar.f636j0);
                R2.b.w(false);
                if (((C0587c) this.d).d() == 15) {
                    dVar.f641o0 = true;
                    return;
                }
                return;
            case 1:
                c cVar2 = (c) this.f627e;
                int size = cVar2.f629b.f638l0.size();
                Iterator it2 = ((List) task.getResult()).iterator();
                int i9 = 0;
                while (true) {
                    boolean hasNext = it2.hasNext();
                    d dVar2 = cVar2.f629b;
                    if (hasNext) {
                        Task task3 = (Task) it2.next();
                        if (task3.isSuccessful() && (kVar2 = (k) ((C0587c) task3.getResult()).f(k.class)) != null) {
                            dVar2.f638l0.add(size, z.a((String) ((ArrayList) this.f625b).get(i9), ((Long) ((ArrayList) this.f626c).get(i9)).longValue(), kVar2));
                        }
                        i9++;
                    } else {
                        dVar2.f639m0.notifyDataSetChanged();
                        R2.b.w(false);
                        if (((C0587c) this.d).d() < 10) {
                            dVar2.f641o0 = false;
                            return;
                        }
                        return;
                    }
                }
            case 2:
                boolean isSuccessful = task.isSuccessful();
                l lVar = (l) this.f627e;
                if (!isSuccessful) {
                    R2.b.w(false);
                    Context context = lVar.f2248d0;
                    c.s0(context, context.getString(R.string.unknown_error_try_again), (String) null);
                    return;
                } else if (task.getResult() != null) {
                    d dVar3 = new d();
                    s sVar = (s) dVar3.b(s.class, dVar3.e((Map) ((r) task.getResult()).f784a));
                    if (sVar == null) {
                        R2.b.w(false);
                        Context context2 = lVar.f2248d0;
                        c.s0(context2, context2.getString(R.string.unknown_error_try_again), (String) null);
                        return;
                    } else if (sVar.isEmailAlreadyExist) {
                        R2.b.w(false);
                        a.n(MyApplication.f7090a, R.string.email_used_before, lVar.f2248d0, (String) null);
                        return;
                    } else if (sVar.isUserNameAlreadyExist) {
                        R2.b.w(false);
                        a.n(MyApplication.f7090a, R.string.username_used_before, lVar.f2248d0, (String) null);
                        return;
                    } else if (sVar.hasError) {
                        R2.b.w(false);
                        a.n(MyApplication.f7090a, R.string.unknown_error_try_again, lVar.f2248d0, (String) null);
                        return;
                    } else if (sVar.isAllProcessSuccess) {
                        String str3 = (String) this.f625b;
                        String str4 = (String) this.f626c;
                        I.d(str3);
                        I.d(str4);
                        FirebaseAuth.getInstance().f6866f.x(new C0496d(str3, str4, (String) null, (String) null, false)).addOnCompleteListener(new H4.d((Object) this, 6));
                        return;
                    } else {
                        R2.b.w(false);
                        Context context3 = lVar.f2248d0;
                        c.s0(context3, context3.getString(R.string.unknown_error_try_again), (String) null);
                        return;
                    }
                } else {
                    R2.b.w(false);
                    Context context4 = lVar.f2248d0;
                    c.s0(context4, context4.getString(R.string.unknown_error_try_again), (String) null);
                    return;
                }
            default:
                ArrayList arrayList3 = new ArrayList();
                HashMap hashMap = (HashMap) this.f625b;
                for (String str5 : hashMap.keySet()) {
                    int intValue = ((Integer) hashMap.get(str5)).intValue();
                    k kVar3 = (k) ((HashMap) this.f626c).get(str5);
                    C0474g gVar = (C0474g) ((HashMap) this.d).get(str5);
                    Y4.l lVar2 = new Y4.l();
                    lVar2.f4385a = str5;
                    lVar2.f4386b = kVar3.getNickName();
                    lVar2.f4387c = kVar3.getProfilePicUrl();
                    lVar2.d = kVar3.getGender();
                    lVar2.f4388e = kVar3.getLevel();
                    lVar2.f4394m = R2.b.k0(kVar3.getVipEndTime());
                    lVar2.f4395n = R2.b.l0(kVar3.getLastSeen());
                    lVar2.h = intValue;
                    lVar2.f4390i = gVar.getRespect();
                    lVar2.f4391j = gVar.getLoyalty();
                    lVar2.f4392k = gVar.getContribution();
                    lVar2.f4393l = ((Long) gVar.getJoinTimeInMilli()).longValue();
                    arrayList3.add(lVar2);
                }
                arrayList3.sort(new i(6));
                A a6 = (A) this.f627e;
                H h = (H) a6.f2796b;
                ((H) a6.f2796b).f7140h0.setAdapter(new Z(h.f7136d0, arrayList3, h.f7137e0));
                R2.b.w(false);
                return;
        }
    }
}
