package com.mtma.criminal.city.utils;

import F3.f;
import F3.h;
import I1.b;
import K1.e;
import Y4.D;
import Z2.d;
import a5.C0264a;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import d5.j;
import d5.o;
import d5.u;
import j4.M0;
import java.util.HashMap;

/* renamed from: com.mtma.criminal.city.utils.n  reason: case insensitive filesystem */
public final /* synthetic */ class C0444n implements H, p0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7438a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7439b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f7440c;
    public final /* synthetic */ Object d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f7441e;

    public /* synthetic */ C0444n(int i2, u uVar, u uVar2, Object obj, int i5) {
        this.f7438a = i5;
        this.f7439b = i2;
        this.f7440c = uVar;
        this.d = uVar2;
        this.f7441e = obj;
    }

    public void a(C0264a aVar) {
        switch (this.f7438a) {
            case 0:
                d dVar = (d) this.f7441e;
                int i2 = this.f7439b;
                u uVar = (u) this.f7440c;
                u uVar2 = (u) this.d;
                if (i2 > 0) {
                    com.bumptech.glide.d.m1(3, -i2, false, new f(uVar, uVar2, dVar, aVar, 2));
                    return;
                } else if (aVar.isAllProcessSuccess) {
                    int Y3 = e.Y(10, uVar2.getSkillsObject(), uVar2.getArmingObject(), uVar2.getSchoolObject());
                    String id = uVar.getAccountObject().getId();
                    C0447q qVar = new C0447q(uVar2, dVar, aVar, 1);
                    if (b.l0(1, c.f5744o)) {
                        c.s(true, new C0445o((Object) id, Y3, (Object) qVar));
                        return;
                    } else {
                        e.r0(id, Y3, qVar);
                        return;
                    }
                } else {
                    dVar.b(false, aVar.currentPlace, (String) null, 0);
                    return;
                }
            default:
                d dVar2 = (d) this.f7441e;
                int i5 = this.f7439b;
                u uVar3 = (u) this.f7440c;
                u uVar4 = (u) this.d;
                if (i5 > 0) {
                    com.bumptech.glide.d.m1(3, -i5, false, new f(uVar3, uVar4, dVar2, aVar, 3));
                    return;
                } else if (aVar.isAllProcessSuccess) {
                    long level = (((long) (uVar4.getMainStatesObject().getLevel() - uVar3.getMainStatesObject().getLevel())) * 2) + (((long) uVar3.getMainStatesObject().getLevel()) * 2) + 10;
                    com.bumptech.glide.d.l1(level, new C0446p(dVar2, aVar, level, 1));
                    return;
                } else {
                    dVar2.a(false, aVar.currentPlace, 0);
                    return;
                }
        }
    }

    public void o(int i2) {
        String str;
        X4.d dVar = (X4.d) this.f7440c;
        A2.f fVar = (A2.f) dVar.f4210c;
        int i5 = this.f7439b;
        if (i5 > i2) {
            R2.b.w(false);
            a.n(MyApplication.f7090a, R.string.other_player_not_has_enough_space, ((M0) fVar.d).f8919a, (String) null);
            return;
        }
        String str2 = ((M0) fVar.d).d;
        if (((j) this.d).getCurrentCity() != 0) {
            str = "countInBag";
        } else {
            str = "count";
        }
        D d6 = (D) this.f7441e;
        int i6 = d6.f4294b;
        int i7 = d6.f4293a;
        int i8 = d6.f4298i;
        C0445o oVar = new C0445o((Object) dVar, (Object) d6, i5);
        HashMap hashMap = new HashMap();
        hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
        hashMap.put("senderPlayerId", o.getAccountObject().getId());
        hashMap.put("receiverPlayerId", str2);
        hashMap.put("materialType", Integer.valueOf(i6));
        hashMap.put("materialId", Integer.valueOf(i7));
        hashMap.put("materialLevel", Integer.valueOf(i8));
        hashMap.put("countValue", Integer.valueOf(i5));
        hashMap.put("countNode", str);
        h.b().a("sendMaterialToOtherPlayer").q(hashMap).addOnCompleteListener(new C0451v(oVar, 12));
    }

    public /* synthetic */ C0444n(X4.d dVar, int i2, j jVar, D d6) {
        this.f7438a = 2;
        this.f7440c = dVar;
        this.f7439b = i2;
        this.d = jVar;
        this.f7441e = d6;
    }
}
