package com.mtma.criminal.city.utils;

import B0.C0004c;
import B0.H;
import F3.r;
import H4.g;
import H4.i;
import K1.e;
import K4.h;
import K4.l;
import K4.t;
import R2.b;
import T1.A;
import U3.c;
import Y4.D;
import Z3.d;
import Z4.j;
import Z4.m;
import Z4.p;
import Z4.q;
import Z4.v;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0424d;
import com.mtma.criminal.city.fragments.gangBase.I;
import d5.o;
import i3.C0586b;
import i3.C0587c;
import j4.C0612a;
import j4.C0631j0;
import j4.C0642s;
import j4.C0645v;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import k.C0724m;
import y4.C1116c;
import y4.C1118e;

/* renamed from: com.mtma.criminal.city.utils.v  reason: case insensitive filesystem */
public final class C0451v implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7480a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f7481b;

    public /* synthetic */ C0451v(Object obj, int i2) {
        this.f7480a = i2;
        this.f7481b = obj;
    }

    public final void onComplete(Task task) {
        boolean z3;
        boolean z4;
        int i2 = 1;
        boolean z5 = false;
        Object obj = this.f7481b;
        switch (this.f7480a) {
            case 0:
                C0424d dVar = (C0424d) obj;
                if (!task.isSuccessful()) {
                    dVar.a(new p());
                    return;
                } else if (task.getResult() != null) {
                    d dVar2 = new d();
                    p pVar = (p) dVar2.b(p.class, dVar2.e((Map) ((r) task.getResult()).f784a));
                    if (pVar != null) {
                        dVar.a(pVar);
                        return;
                    } else {
                        dVar.a(new p());
                        return;
                    }
                } else {
                    dVar.a(new p());
                    return;
                }
            case 1:
                A a6 = (A) obj;
                if (!task.isSuccessful()) {
                    a6.q(new j());
                    return;
                } else if (task.getResult() != null) {
                    d dVar3 = new d();
                    j jVar = (j) dVar3.b(j.class, dVar3.e((Map) ((r) task.getResult()).f784a));
                    if (jVar != null) {
                        a6.q(jVar);
                        if (jVar.isAllProcessSuccess) {
                            Q.h(132, o.getAccountObject().getId());
                            return;
                        }
                        return;
                    }
                    a6.q(new j());
                    return;
                } else {
                    a6.q(new j());
                    return;
                }
            case 2:
                C0724m mVar = (C0724m) obj;
                if (!task.isSuccessful()) {
                    mVar.F((ArrayList) null);
                    return;
                } else if (task.getResult() != null) {
                    Map map = (Map) ((r) task.getResult()).f784a;
                    if (map == null) {
                        mVar.F((ArrayList) null);
                        return;
                    } else if (map.containsKey("hasError")) {
                        mVar.F((ArrayList) null);
                        return;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : map.entrySet()) {
                            Map map2 = (Map) entry.getValue();
                            D s6 = D.s(Integer.parseInt(((String) entry.getKey()).replace("id-", "")), 0, ((Number) map2.get("count")).intValue());
                            s6.f4297f = (long) (((double) ((Number) map2.get("cost")).longValue()) * (1.0d - e.S(18)));
                            arrayList.add(s6);
                        }
                        arrayList.sort(new i(8));
                        mVar.F(arrayList);
                        return;
                    }
                } else {
                    mVar.F((ArrayList) null);
                    return;
                }
            case 3:
                c cVar = (c) obj;
                if (!task.isSuccessful()) {
                    cVar.v(new m());
                    return;
                } else if (task.getResult() != null) {
                    d dVar4 = new d();
                    m mVar2 = (m) dVar4.b(m.class, dVar4.e((Map) ((r) task.getResult()).f784a));
                    if (mVar2 != null) {
                        cVar.v(mVar2);
                        return;
                    } else {
                        cVar.v(new m());
                        return;
                    }
                } else {
                    cVar.v(new m());
                    return;
                }
            case 4:
                C0631j0 j0Var = (C0631j0) obj;
                if (!task.isSuccessful()) {
                    j0Var.a(new Z4.d());
                    return;
                } else if (task.getResult() != null) {
                    d dVar5 = new d();
                    Z4.d dVar6 = (Z4.d) dVar5.b(Z4.d.class, dVar5.e((Map) ((r) task.getResult()).f784a));
                    if (dVar6 != null) {
                        j0Var.a(dVar6);
                        return;
                    } else {
                        j0Var.a(new Z4.d());
                        return;
                    }
                } else {
                    j0Var.a(new Z4.d());
                    return;
                }
            case 5:
                b.w(false);
                a.n(MyApplication.f7090a, R.string.name_already_exist, (Context) ((A4.i) ((c1.i) ((K) ((h) ((C0004c) ((I) obj).f7143b).f212b).f1523c).f7360b).d).d, (String) null);
                return;
            case zzaky.zzf.zzf:
                t tVar = (t) obj;
                if (task.isSuccessful()) {
                    Map map3 = (Map) ((r) task.getResult()).f784a;
                    if (map3 != null) {
                        if (map3.containsKey("isAllProcessSuccess")) {
                            z3 = ((Boolean) map3.get("isAllProcessSuccess")).booleanValue();
                        } else {
                            z3 = false;
                        }
                        if (map3.containsKey("isSenderPlayerCashChanged")) {
                            z5 = ((Boolean) map3.get("isSenderPlayerCashChanged")).booleanValue();
                        }
                        if (map3.containsKey("isReceiverPlayerCashChanged")) {
                            ((Boolean) map3.get("isReceiverPlayerCashChanged")).getClass();
                        }
                        if (map3.containsKey("hasError")) {
                            ((Boolean) map3.get("hasError")).getClass();
                        }
                        tVar.a(z3, z5);
                        return;
                    }
                    return;
                }
                tVar.a(false, false);
                return;
            case zzaky.zzf.zzg:
                C0724m mVar3 = (C0724m) obj;
                if (!task.isSuccessful()) {
                    mVar3.E(new q());
                    return;
                } else if (task.getResult() != null) {
                    d dVar7 = new d();
                    q qVar = (q) dVar7.b(q.class, dVar7.e((Map) ((r) task.getResult()).f784a));
                    if (qVar != null) {
                        mVar3.E(qVar);
                        return;
                    } else {
                        mVar3.E(new q());
                        return;
                    }
                } else {
                    mVar3.E(new q());
                    return;
                }
            case 8:
                b.w(false);
                a.n(MyApplication.f7090a, R.string.name_already_exist, ((f0) ((c1.i) ((K) ((h) ((C0004c) ((I) obj).f7143b).f212b).f1523c).f7360b).d).f7410b, (String) null);
                return;
            case 9:
                F3.e eVar = (F3.e) obj;
                if (!task.isSuccessful()) {
                    eVar.h(new Z4.b());
                    return;
                } else if (task.getResult() != null) {
                    d dVar8 = new d();
                    Z4.b bVar = (Z4.b) dVar8.b(Z4.b.class, dVar8.e((Map) ((r) task.getResult()).f784a));
                    if (bVar != null) {
                        eVar.h(bVar);
                        return;
                    } else {
                        eVar.h(new Z4.b());
                        return;
                    }
                } else {
                    eVar.h(new Z4.b());
                    return;
                }
            case 10:
                C0449t tVar2 = (C0449t) obj;
                if (!task.isSuccessful()) {
                    tVar2.c(new Z4.r());
                    return;
                } else if (task.getResult() != null) {
                    d dVar9 = new d();
                    Z4.r rVar = (Z4.r) dVar9.b(Z4.r.class, dVar9.e((Map) ((r) task.getResult()).f784a));
                    if (rVar != null) {
                        tVar2.c(rVar);
                        return;
                    } else {
                        tVar2.c(new Z4.r());
                        return;
                    }
                } else {
                    tVar2.c(new Z4.r());
                    return;
                }
            case ModuleDescriptor.MODULE_VERSION:
                j0 j0Var2 = (j0) obj;
                if (!task.isSuccessful()) {
                    j0Var2.a(new Z4.e());
                    return;
                } else if (task.getResult() != null) {
                    d dVar10 = new d();
                    Z4.e eVar2 = (Z4.e) dVar10.b(Z4.e.class, dVar10.e((Map) ((r) task.getResult()).f784a));
                    if (eVar2 != null) {
                        j0Var2.a(eVar2);
                        return;
                    } else {
                        j0Var2.a(new Z4.e());
                        return;
                    }
                } else {
                    j0Var2.a(new Z4.e());
                    return;
                }
            case 12:
                C0445o oVar = (C0445o) obj;
                if (task.isSuccessful()) {
                    Map map4 = (Map) ((r) task.getResult()).f784a;
                    if (map4 != null) {
                        if (map4.containsKey("isAllProcessSuccess")) {
                            z4 = ((Boolean) map4.get("isAllProcessSuccess")).booleanValue();
                        } else {
                            z4 = false;
                        }
                        if (map4.containsKey("isSenderPlayerMaterialCountChanged")) {
                            z5 = ((Boolean) map4.get("isSenderPlayerMaterialCountChanged")).booleanValue();
                        }
                        if (map4.containsKey("isReceiverPlayerMaterialCountChanged")) {
                            ((Boolean) map4.get("isReceiverPlayerMaterialCountChanged")).getClass();
                        }
                        if (map4.containsKey("hasError")) {
                            ((Boolean) map4.get("hasError")).getClass();
                        }
                        oVar.a(z4, z5);
                        return;
                    }
                    return;
                }
                oVar.a(false, false);
                return;
            case 13:
                H h = (H) obj;
                if (!task.isSuccessful()) {
                    h.c(new v());
                    return;
                } else if (task.getResult() != null) {
                    d dVar11 = new d();
                    v vVar = (v) dVar11.b(v.class, dVar11.e((Map) ((r) task.getResult()).f784a));
                    if (vVar != null) {
                        h.c(vVar);
                        return;
                    } else {
                        h.c(new v());
                        return;
                    }
                } else {
                    h.c(new v());
                    return;
                }
            case 14:
                C0642s sVar = (C0642s) obj;
                sVar.d.remove(sVar.f9089b);
                C0645v vVar2 = sVar.d;
                vVar2.notifyDataSetChanged();
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, vVar2.f9109a, R.raw.add_new_item);
                return;
            case 15:
                l lVar = (l) obj;
                ((C0645v) lVar.f1578e).notifyDataSetChanged();
                b.w(false);
                a.l(MyApplication.f7090a, R.string.toast_successfully, ((C0645v) lVar.f1578e).f9109a, R.raw.add_new_item);
                return;
            case 16:
                B0.l lVar2 = (B0.l) obj;
                o.getGymObject().getGymLessonsOpenedStatesList().set(lVar2.f246b, Boolean.TRUE);
                C0612a.a((C0612a) lVar2.f247c, lVar2.f246b);
                return;
            case 17:
                if (task.isSuccessful()) {
                    String uri = ((Uri) task.getResult()).toString();
                    l4.i iVar = (l4.i) obj;
                    iVar.f9792N0.E("profilePicUrl").I(uri).addOnSuccessListener(new g(this, uri, 10));
                    iVar.f9792N0.E("profilePicUpdatedTime").I(Long.valueOf(com.bumptech.glide.c.f5744o));
                    return;
                }
                return;
            default:
                Class<Integer> cls = Integer.class;
                C1118e eVar3 = (C1118e) obj;
                try {
                    C0587c cVar2 = (C0587c) ((Task) ((List) task.getResult()).get(0)).getResult();
                    C0587c cVar3 = (C0587c) ((Task) ((List) task.getResult()).get(1)).getResult();
                    eVar3.f12734o0 = ((Integer) cVar2.a("oneRollCost").f(cls)).intValue();
                    eVar3.f12735p0 = ((Integer) cVar2.a("tenRollCost").f(cls)).intValue();
                    eVar3.f12736q0 = ((Integer) cVar2.a("startTime").f(cls)).intValue();
                    eVar3.f12737r0 = ((Integer) cVar2.a("endTime").f(cls)).intValue();
                    eVar3.f12738t0 = (ArrayList) cVar2.a("itemsIds").f8278a.f12296a.getValue();
                    eVar3.f12739u0 = (ArrayList) cVar2.a("itemsLuckPercent").f8278a.f12296a.getValue();
                    for (int i5 = 0; i5 < eVar3.f12739u0.size(); i5++) {
                        eVar3.s0 = (int) (((long) eVar3.s0) + ((Long) eVar3.f12739u0.get(i5)).longValue());
                    }
                    int E6 = com.bumptech.glide.c.E(com.bumptech.glide.c.f5744o);
                    if (E6 >= eVar3.f12737r0 || E6 < eVar3.f12736q0) {
                        eVar3.Z(com.bumptech.glide.c.f5744o);
                        eVar3.Y(true);
                    }
                    eVar3.f12731l0.setText(String.valueOf(eVar3.f12734o0));
                    eVar3.f12732m0.setText(String.valueOf(eVar3.f12735p0));
                    int i6 = eVar3.f12736q0;
                    int i7 = eVar3.f12737r0;
                    long j6 = com.bumptech.glide.c.f5744o;
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                    instance.setTimeInMillis(j6 * 1000);
                    if (instance.get(11) >= i7) {
                        long j7 = com.bumptech.glide.c.f5744o;
                        Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                        instance2.setTimeInMillis(j7 * 1000);
                        int i8 = i7 + 12;
                        if (instance2.get(11) < i8) {
                            i6 += 12;
                            i7 = i8;
                        }
                    }
                    eVar3.f12730k0.setText(eVar3.s(R.string.lucky_wheel_opening_time, e.B(i6), e.B(i7)));
                    int i9 = 0;
                    for (int i10 = 12; i9 < i10; i10 = 12) {
                        int longValue = (int) ((Long) eVar3.f12738t0.get(i9)).longValue();
                        D d = new D();
                        RelativeLayout relativeLayout = (RelativeLayout) eVar3.f12726g0.getChildAt(i9);
                        if (i9 == 0) {
                            relativeLayout.setBackgroundResource(R.drawable.lucky_wheel_green_frame);
                        }
                        ArrayList arrayList2 = eVar3.f12740v0;
                        if (longValue == -10) {
                            ((ImageView) relativeLayout.getChildAt(0)).setImageResource(R.drawable.money_buy_cash_4);
                            ((TextView) relativeLayout.getChildAt(i2)).setText(eVar3.s(R.string.number_with_multiply_sign_and_text, Integer.valueOf(Math.abs(longValue)), "M"));
                            arrayList2.add(eVar3.s(R.string.money_with_number_and_text, Integer.valueOf(Math.abs(longValue)), "M"));
                            d.d = R.drawable.money_buy_cash_4;
                            d.f4295c = R.string.money;
                            d.f4296e = R.string.ten_million;
                        } else if (longValue == -50) {
                            ((ImageView) relativeLayout.getChildAt(0)).setImageResource(R.drawable.money_buy_cash_5);
                            ((TextView) relativeLayout.getChildAt(1)).setText(eVar3.s(R.string.number_with_multiply_sign_and_text, Integer.valueOf(Math.abs(longValue)), "M"));
                            arrayList2.add(eVar3.s(R.string.money_with_number_and_text, Integer.valueOf(Math.abs(longValue)), "M"));
                            d.d = R.drawable.money_buy_cash_5;
                            d.f4295c = R.string.money;
                            d.f4296e = R.string.fifty_million;
                        } else if (longValue == -600) {
                            ((ImageView) relativeLayout.getChildAt(0)).setImageResource(R.drawable.money_buy_gold_4);
                            ((TextView) relativeLayout.getChildAt(1)).setText(eVar3.s(R.string.number_with_multiply_sign, Integer.valueOf(Math.abs(longValue))));
                            arrayList2.add(eVar3.s(R.string.gold_with_number, Integer.valueOf(Math.abs(longValue))));
                            d.d = R.drawable.money_buy_gold_4;
                            d.f4295c = R.string.gold;
                            d.f4296e = R.string.six_hundred_gold;
                        } else {
                            D s7 = D.s(longValue, 0, 1);
                            ((ImageView) relativeLayout.getChildAt(0)).setImageResource(s7.d);
                            ((TextView) relativeLayout.getChildAt(1)).setText(eVar3.s(R.string.number_with_multiply_sign, 1));
                            arrayList2.add(eVar3.r(s7.f4295c));
                            d = s7;
                        }
                        relativeLayout.setOnClickListener(new C1116c(this, relativeLayout, d));
                        i9++;
                        i2 = 1;
                    }
                    if (cVar3.g()) {
                        C0586b c3 = cVar3.c();
                        Iterator it2 = c3.f8276a;
                        while (it2.hasNext()) {
                            v3.q qVar2 = (v3.q) it2.next();
                            c3.f8277b.f8279b.E(qVar2.f12304a.f12280a);
                            eVar3.f12741w0.add((b5.h) r3.b.c(b5.h.class, v3.m.t(qVar2.f12305b).f12296a.getValue()));
                        }
                        eVar3.f12733n0.notifyDataSetChanged();
                        eVar3.f12729j0.setSelection(eVar3.f12741w0.size() - 1);
                    }
                    b.w(false);
                    return;
                } catch (Exception e6) {
                    a.q("Exception from try-catch block inside ", "e", " in displayDataOnScreen method.", e6, "e");
                    return;
                }
        }
    }
}
