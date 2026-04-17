package com.mtma.criminal.city.activities;

import I4.f;
import X4.d;
import android.os.Handler;
import androidx.fragment.app.C0269a;
import androidx.fragment.app.C0286s;
import androidx.fragment.app.I;
import com.bumptech.glide.c;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.C0429i;
import com.mtma.criminal.city.fragments.gangBase.D;
import com.mtma.criminal.city.fragments.gangBase.G;
import com.mtma.criminal.city.fragments.gangBase.H;
import com.mtma.criminal.city.fragments.gangBase.J;
import com.mtma.criminal.city.fragments.gangBase.r;
import com.mtma.criminal.city.fragments.gangBase.s;
import com.mtma.criminal.city.fragments.gangBase.v;
import com.mtma.criminal.city.fragments.gangBase.w;
import com.mtma.criminal.city.fragments.gangBase.y;
import com.mtma.criminal.city.utils.Q;
import d5.o;
import h0.C0552a;
import i3.C0585a;
import i3.C0587c;
import i3.C0588d;
import i3.C0590f;
import i3.q;
import x4.C1105h;

public final class e implements C0585a, q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7054a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f7055b;

    public /* synthetic */ e(MainActivity mainActivity, int i2) {
        this.f7054a = i2;
        this.f7055b = mainActivity;
    }

    public void i(C0587c cVar) {
        int i2 = this.f7054a;
    }

    public void k(C0587c cVar) {
        Boolean bool;
        char c3 = 65535;
        Class<Boolean> cls = Boolean.class;
        Class<Long> cls2 = Long.class;
        MainActivity mainActivity = this.f7055b;
        Class<Integer> cls3 = Integer.class;
        switch (this.f7054a) {
            case 0:
                try {
                    String F = cVar.f8279b.F();
                    if (F != null) {
                        switch (F.hashCode()) {
                            case -1707660207:
                                if (F.equals("leaveGangTimeInMilli")) {
                                    c3 = 8;
                                    break;
                                }
                                break;
                            case 3355:
                                if (F.equals("id")) {
                                    c3 = 0;
                                    break;
                                }
                                break;
                            case 114586:
                                if (F.equals("tag")) {
                                    c3 = 2;
                                    break;
                                }
                                break;
                            case 3373707:
                                if (F.equals("name")) {
                                    c3 = 1;
                                    break;
                                }
                                break;
                            case 358728774:
                                if (F.equals("loyalty")) {
                                    c3 = 5;
                                    break;
                                }
                                break;
                            case 747804969:
                                if (F.equals("position")) {
                                    c3 = 3;
                                    break;
                                }
                                break;
                            case 1097390534:
                                if (F.equals("respect")) {
                                    c3 = 4;
                                    break;
                                }
                                break;
                            case 1174770321:
                                if (F.equals("joinTimeInMilli")) {
                                    c3 = 7;
                                    break;
                                }
                                break;
                            case 1375970320:
                                if (F.equals("contribution")) {
                                    c3 = 6;
                                    break;
                                }
                                break;
                        }
                        Class<String> cls4 = String.class;
                        switch (c3) {
                            case 0:
                                String str = (String) cVar.f(cls4);
                                if (str != null) {
                                    o.getGangObject().setId(str);
                                    for (C0286s sVar : mainActivity.l().f5000c.v()) {
                                        if (str.equals("not_in_gang")) {
                                            if ((sVar instanceof C0429i) || (sVar instanceof s) || (sVar instanceof v) || (sVar instanceof D) || (sVar instanceof G) || (sVar instanceof J) || (sVar instanceof H) || (sVar instanceof com.mtma.criminal.city.fragments.gangBase.o) || (sVar instanceof w) || (sVar instanceof r)) {
                                                I l6 = mainActivity.l();
                                                l6.getClass();
                                                C0269a aVar = new C0269a(l6);
                                                aVar.h(sVar);
                                                aVar.e(false);
                                            }
                                        } else if (sVar instanceof y) {
                                            I l7 = mainActivity.l();
                                            l7.getClass();
                                            C0269a aVar2 = new C0269a(l7);
                                            aVar2.h(sVar);
                                            aVar2.e(false);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 1:
                                String str2 = (String) cVar.f(cls4);
                                if (str2 != null) {
                                    o.getGangObject().setName(str2);
                                    return;
                                }
                                return;
                            case 2:
                                String str3 = (String) cVar.f(cls4);
                                if (str3 != null) {
                                    o.getGangObject().setTag(str3);
                                    return;
                                }
                                return;
                            case 3:
                                Integer num = (Integer) cVar.f(cls3);
                                if (num != null) {
                                    o.getGangObject().setPosition(num.intValue());
                                    for (C0286s sVar2 : mainActivity.l().f5000c.v()) {
                                        if ((sVar2 instanceof D) && num.intValue() != ((D) sVar2).f7118m0) {
                                            I l8 = mainActivity.l();
                                            l8.getClass();
                                            C0269a aVar3 = new C0269a(l8);
                                            aVar3.h(sVar2);
                                            aVar3.e(false);
                                        } else if ((sVar2 instanceof J) && o.getGangObject().getPosition() > 3) {
                                            I l9 = mainActivity.l();
                                            l9.getClass();
                                            C0269a aVar4 = new C0269a(l9);
                                            aVar4.h(sVar2);
                                            aVar4.e(false);
                                        } else if ((sVar2 instanceof H) && o.getGangObject().getPosition() > 2) {
                                            I l10 = mainActivity.l();
                                            l10.getClass();
                                            C0269a aVar5 = new C0269a(l10);
                                            aVar5.h(sVar2);
                                            aVar5.e(false);
                                        } else if ((sVar2 instanceof com.mtma.criminal.city.fragments.gangBase.o) && num.intValue() != ((com.mtma.criminal.city.fragments.gangBase.o) sVar2).f7230e0) {
                                            I l11 = mainActivity.l();
                                            l11.getClass();
                                            C0269a aVar6 = new C0269a(l11);
                                            aVar6.h(sVar2);
                                            aVar6.e(false);
                                        } else if ((sVar2 instanceof w) && o.getGangObject().getId().equals(((w) sVar2).f7309f0) && num.intValue() != ((w) sVar2).f7310g0) {
                                            I l12 = mainActivity.l();
                                            l12.getClass();
                                            C0269a aVar7 = new C0269a(l12);
                                            aVar7.h(sVar2);
                                            aVar7.e(false);
                                        }
                                    }
                                    return;
                                }
                                return;
                            case 4:
                                Long l13 = (Long) cVar.f(cls2);
                                if (l13 != null) {
                                    o.getGangObject().setRespect(l13.longValue());
                                    Q.b(133, o.getAccountObject().getId(), l13.longValue());
                                    return;
                                }
                                return;
                            case 5:
                                Long l14 = (Long) cVar.f(cls2);
                                if (l14 != null) {
                                    o.getGangObject().setLoyalty(l14.longValue());
                                    return;
                                }
                                return;
                            case zzaky.zzf.zzf:
                                Long l15 = (Long) cVar.f(cls2);
                                if (l15 != null) {
                                    o.getGangObject().setContribution(l15.longValue());
                                    Q.b(134, o.getAccountObject().getId(), l15.longValue());
                                    return;
                                }
                                return;
                            case zzaky.zzf.zzg:
                                Long l16 = (Long) cVar.f(cls2);
                                if (l16 != null) {
                                    o.getGangObject().setJoinTimeInMilli(l16);
                                    return;
                                }
                                return;
                            case 8:
                                Long l17 = (Long) cVar.f(cls2);
                                if (l17 != null) {
                                    o.getGangObject().setLeaveGangTimeInMilli(l17);
                                    return;
                                }
                                return;
                            default:
                                return;
                        }
                        int i2 = MainActivity.L0;
                        C0552a.x(e, "Exception from try-catch block inside MainActivity in addListenerToNotificationAlerts method.", "MainActivity");
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    int i22 = MainActivity.L0;
                    C0552a.x(e6, "Exception from try-catch block inside MainActivity in addListenerToNotificationAlerts method.", "MainActivity");
                    return;
                }
            case 1:
                try {
                    String F6 = cVar.f8279b.F();
                    if (F6 != null) {
                        int hashCode = F6.hashCode();
                        if (hashCode != -762498763) {
                            if (hashCode == 688591589) {
                                if (F6.equals("versionCode")) {
                                    c3 = 0;
                                }
                            }
                        } else if (F6.equals("repairing")) {
                            c3 = 1;
                        }
                        if (c3 == 0) {
                            Integer num2 = (Integer) cVar.f(cls3);
                            int i5 = mainActivity.f6979I.getPackageManager().getPackageInfo(K1.e.F(), 0).versionCode;
                            if (num2 != null && num2.intValue() > i5) {
                                c.z0(mainActivity.f6979I);
                                return;
                            }
                            return;
                        } else if (c3 == 1) {
                            Boolean bool2 = (Boolean) cVar.f(cls);
                            if (bool2 != null && bool2.booleanValue()) {
                                new Handler().postDelayed(new d(this, c.u0(mainActivity.f6979I), 0), 15000);
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 3:
                try {
                    C0590f fVar = cVar.f8279b;
                    String F7 = fVar.F();
                    if (F7 == null) {
                        return;
                    }
                    if (F7.equals("currentPlace")) {
                        Integer num3 = (Integer) cVar.f(cls3);
                        if (num3 != null) {
                            o.getLocationObject().setCurrentPlace(num3.intValue());
                            int i6 = MainActivity.L0;
                            mainActivity.x();
                            return;
                        }
                        return;
                    } else if (F7.equals("currentCity")) {
                        Integer num4 = (Integer) cVar.f(cls3);
                        if (num4 != null) {
                            o.getLocationObject().setCurrentCity(num4.intValue());
                            int intValue = num4.intValue();
                            int i7 = MainActivity.L0;
                            mainActivity.u(intValue);
                            return;
                        }
                        return;
                    } else if (fVar.F().equals("placeEndTimeInMilli")) {
                        Long l18 = (Long) cVar.f(cls2);
                        if (l18 != null) {
                            o.getLocationObject().setPlaceEndTimeInMilli(l18.longValue());
                            for (C0286s sVar3 : mainActivity.l().f5000c.v()) {
                                if (sVar3 instanceof f) {
                                    f fVar2 = (f) sVar3;
                                    fVar2.f1212p0 = l18.longValue() - (c.f5744o * 1000);
                                    fVar2.Z();
                                    return;
                                } else if (sVar3 instanceof C1105h) {
                                    C1105h hVar = (C1105h) sVar3;
                                    hVar.f12604o0 = l18.longValue() - (c.f5744o * 1000);
                                    hVar.Z();
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    } else if (fVar.F().equals("needFreeBag") && (bool = (Boolean) cVar.f(cls)) != null) {
                        o.getLocationObject().setNeedFreeBag(bool.booleanValue());
                        if (bool.booleanValue()) {
                            c.s0(mainActivity.f6979I, MyApplication.f7090a.getApplicationContext().getString(R.string.no_enough_space_in_stock_to_free_bag), (String) null);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e7) {
                    int i8 = MainActivity.L0;
                    C0552a.x(e7, "Exception from try-catch block inside MainActivity in addListenerToLocation method.", "MainActivity");
                    return;
                }
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void q(i3.C0587c r14) {
        /*
            r13 = this;
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            r2 = 5
            r3 = 2
            r4 = 4
            r5 = 3
            java.lang.String r6 = "MainActivity"
            r7 = -1
            r8 = 0
            com.mtma.criminal.city.activities.MainActivity r9 = r13.f7055b
            java.lang.Class<java.lang.Integer> r10 = java.lang.Integer.class
            r11 = 1
            int r12 = r13.f7054a
            switch(r12) {
                case 0: goto L_0x02b2;
                case 1: goto L_0x023b;
                case 2: goto L_0x0016;
                case 3: goto L_0x012f;
                default: goto L_0x0016;
            }
        L_0x0016:
            i3.f r0 = r14.f8279b     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = r0.F()     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x012e
            int r1 = r0.hashCode()     // Catch:{ Exception -> 0x0030 }
            switch(r1) {
                case -2014824059: goto L_0x005b;
                case -1192893916: goto L_0x0051;
                case -771904304: goto L_0x0047;
                case -738650438: goto L_0x003d;
                case 98716283: goto L_0x0033;
                case 1793072117: goto L_0x0026;
                default: goto L_0x0025;
            }     // Catch:{ Exception -> 0x0030 }
        L_0x0025:
            goto L_0x0064
        L_0x0026:
            java.lang.String r1 = "bioChemicalId"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0064
            r7 = r2
            goto L_0x0064
        L_0x0030:
            r14 = move-exception
            goto L_0x0127
        L_0x0033:
            java.lang.String r1 = "gunId"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0064
            r7 = r8
            goto L_0x0064
        L_0x003d:
            java.lang.String r1 = "armorId"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0064
            r7 = r3
            goto L_0x0064
        L_0x0047:
            java.lang.String r1 = "specialEquipmentId"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0064
            r7 = r4
            goto L_0x0064
        L_0x0051:
            java.lang.String r1 = "gunLevel"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0064
            r7 = r11
            goto L_0x0064
        L_0x005b:
            java.lang.String r1 = "armorLevel"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x0064
            r7 = r5
        L_0x0064:
            if (r7 == 0) goto L_0x0113
            if (r7 == r11) goto L_0x00ff
            if (r7 == r3) goto L_0x00eb
            if (r7 == r5) goto L_0x00d7
            if (r7 == r4) goto L_0x0087
            if (r7 == r2) goto L_0x0072
            goto L_0x012e
        L_0x0072:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0030 }
            if (r14 == 0) goto L_0x012e
            d5.b r0 = d5.o.getArmingObject()     // Catch:{ Exception -> 0x0030 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0030 }
            r0.setBioChemicalId(r14)     // Catch:{ Exception -> 0x0030 }
            goto L_0x012e
        L_0x0087:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0030 }
            if (r14 == 0) goto L_0x012e
            d5.b r0 = d5.o.getArmingObject()     // Catch:{ Exception -> 0x0030 }
            int r1 = r14.intValue()     // Catch:{ Exception -> 0x0030 }
            r0.setSpecialEquipmentId(r1)     // Catch:{ Exception -> 0x0030 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0030 }
            Y4.D r14 = Y4.D.s(r14, r8, r11)     // Catch:{ Exception -> 0x0030 }
            java.util.ArrayList r14 = r14.f4315z     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0030 }
            boolean r14 = r14.contains(r0)     // Catch:{ Exception -> 0x0030 }
            if (r14 == 0) goto L_0x012e
            android.support.v4.media.session.a.t0()     // Catch:{ Exception -> 0x0030 }
            com.mtma.criminal.city.activities.MainActivity r14 = r9.f6979I     // Catch:{ Exception -> 0x0030 }
            androidx.fragment.app.I r14 = r14.l()     // Catch:{ Exception -> 0x0030 }
            S3.z r14 = r14.f5000c     // Catch:{ Exception -> 0x0030 }
            java.util.List r14 = r14.v()     // Catch:{ Exception -> 0x0030 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x0030 }
        L_0x00c1:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x0030 }
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r14.next()     // Catch:{ Exception -> 0x0030 }
            androidx.fragment.app.s r0 = (androidx.fragment.app.C0286s) r0     // Catch:{ Exception -> 0x0030 }
            boolean r1 = r0 instanceof S4.d     // Catch:{ Exception -> 0x0030 }
            if (r1 == 0) goto L_0x00c1
            S4.d r0 = (S4.d) r0     // Catch:{ Exception -> 0x0030 }
            r0.Y()     // Catch:{ Exception -> 0x0030 }
            goto L_0x012e
        L_0x00d7:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0030 }
            if (r14 == 0) goto L_0x012e
            d5.b r0 = d5.o.getArmingObject()     // Catch:{ Exception -> 0x0030 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0030 }
            r0.setArmorLevel(r14)     // Catch:{ Exception -> 0x0030 }
            goto L_0x012e
        L_0x00eb:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0030 }
            if (r14 == 0) goto L_0x012e
            d5.b r0 = d5.o.getArmingObject()     // Catch:{ Exception -> 0x0030 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0030 }
            r0.setArmorId(r14)     // Catch:{ Exception -> 0x0030 }
            goto L_0x012e
        L_0x00ff:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0030 }
            if (r14 == 0) goto L_0x012e
            d5.b r0 = d5.o.getArmingObject()     // Catch:{ Exception -> 0x0030 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0030 }
            r0.setGunLevel(r14)     // Catch:{ Exception -> 0x0030 }
            goto L_0x012e
        L_0x0113:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x0030 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x0030 }
            if (r14 == 0) goto L_0x012e
            d5.b r0 = d5.o.getArmingObject()     // Catch:{ Exception -> 0x0030 }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x0030 }
            r0.setGunId(r14)     // Catch:{ Exception -> 0x0030 }
            goto L_0x012e
        L_0x0127:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "Exception from try-catch inside MainActivity class in addListenerToArming method."
            android.util.Log.e(r6, r0, r14)
        L_0x012e:
            return
        L_0x012f:
            i3.f r2 = r14.f8279b     // Catch:{ Exception -> 0x015d }
            java.lang.String r3 = r2.F()     // Catch:{ Exception -> 0x015d }
            if (r3 == 0) goto L_0x023a
            java.lang.String r3 = r2.F()     // Catch:{ Exception -> 0x015d }
            java.lang.String r4 = "currentPlace"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x015d }
            if (r3 == 0) goto L_0x0160
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x015d }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x015d }
            if (r14 == 0) goto L_0x023a
            d5.j r0 = d5.o.getLocationObject()     // Catch:{ Exception -> 0x015d }
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x015d }
            r0.setCurrentPlace(r14)     // Catch:{ Exception -> 0x015d }
            int r14 = com.mtma.criminal.city.activities.MainActivity.L0     // Catch:{ Exception -> 0x015d }
            r9.x()     // Catch:{ Exception -> 0x015d }
            goto L_0x023a
        L_0x015d:
            r14 = move-exception
            goto L_0x0233
        L_0x0160:
            java.lang.String r3 = r2.F()     // Catch:{ Exception -> 0x015d }
            java.lang.String r4 = "currentCity"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x015d }
            if (r3 == 0) goto L_0x0197
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x015d }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x015d }
            if (r14 == 0) goto L_0x023a
            d5.j r0 = d5.o.getLocationObject()     // Catch:{ Exception -> 0x015d }
            int r1 = r14.intValue()     // Catch:{ Exception -> 0x015d }
            r0.setCurrentCity(r1)     // Catch:{ Exception -> 0x015d }
            int r0 = r14.intValue()     // Catch:{ Exception -> 0x015d }
            l4.c r1 = r9.f6972B0     // Catch:{ Exception -> 0x015d }
            int r1 = r1.f9765e0     // Catch:{ Exception -> 0x015d }
            if (r0 == r1) goto L_0x023a
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x015d }
            r9.u(r14)     // Catch:{ Exception -> 0x015d }
            l4.b r14 = r9.f6971A0     // Catch:{ Exception -> 0x015d }
            r14.X()     // Catch:{ Exception -> 0x015d }
            goto L_0x023a
        L_0x0197:
            java.lang.String r3 = r2.F()     // Catch:{ Exception -> 0x015d }
            java.lang.String r4 = "placeEndTimeInMilli"
            boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x015d }
            if (r3 == 0) goto L_0x01fa
            java.lang.Object r14 = r14.f(r1)     // Catch:{ Exception -> 0x015d }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x015d }
            if (r14 == 0) goto L_0x023a
            d5.j r0 = d5.o.getLocationObject()     // Catch:{ Exception -> 0x015d }
            long r1 = r14.longValue()     // Catch:{ Exception -> 0x015d }
            r0.setPlaceEndTimeInMilli(r1)     // Catch:{ Exception -> 0x015d }
            androidx.fragment.app.I r0 = r9.l()     // Catch:{ Exception -> 0x015d }
            S3.z r0 = r0.f5000c     // Catch:{ Exception -> 0x015d }
            java.util.List r0 = r0.v()     // Catch:{ Exception -> 0x015d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x015d }
        L_0x01c4:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x015d }
            if (r1 == 0) goto L_0x023a
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x015d }
            androidx.fragment.app.s r1 = (androidx.fragment.app.C0286s) r1     // Catch:{ Exception -> 0x015d }
            boolean r2 = r1 instanceof I4.f     // Catch:{ Exception -> 0x015d }
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r2 == 0) goto L_0x01e6
            I4.f r1 = (I4.f) r1     // Catch:{ Exception -> 0x015d }
            long r7 = r14.longValue()     // Catch:{ Exception -> 0x015d }
            long r9 = com.bumptech.glide.c.f5744o     // Catch:{ Exception -> 0x015d }
            long r9 = r9 * r3
            long r7 = r7 - r9
            r1.f1212p0 = r7     // Catch:{ Exception -> 0x015d }
            r1.Z()     // Catch:{ Exception -> 0x015d }
            goto L_0x023a
        L_0x01e6:
            boolean r2 = r1 instanceof x4.C1105h     // Catch:{ Exception -> 0x015d }
            if (r2 == 0) goto L_0x01c4
            x4.h r1 = (x4.C1105h) r1     // Catch:{ Exception -> 0x015d }
            long r7 = r14.longValue()     // Catch:{ Exception -> 0x015d }
            long r9 = com.bumptech.glide.c.f5744o     // Catch:{ Exception -> 0x015d }
            long r9 = r9 * r3
            long r7 = r7 - r9
            r1.f12604o0 = r7     // Catch:{ Exception -> 0x015d }
            r1.Z()     // Catch:{ Exception -> 0x015d }
            goto L_0x023a
        L_0x01fa:
            java.lang.String r1 = r2.F()     // Catch:{ Exception -> 0x015d }
            java.lang.String r2 = "needFreeBag"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x015d }
            if (r1 == 0) goto L_0x023a
            java.lang.Object r14 = r14.f(r0)     // Catch:{ Exception -> 0x015d }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Exception -> 0x015d }
            if (r14 == 0) goto L_0x023a
            d5.j r0 = d5.o.getLocationObject()     // Catch:{ Exception -> 0x015d }
            boolean r1 = r14.booleanValue()     // Catch:{ Exception -> 0x015d }
            r0.setNeedFreeBag(r1)     // Catch:{ Exception -> 0x015d }
            boolean r14 = r14.booleanValue()     // Catch:{ Exception -> 0x015d }
            if (r14 == 0) goto L_0x023a
            com.mtma.criminal.city.activities.MainActivity r14 = r9.f6979I     // Catch:{ Exception -> 0x015d }
            com.mtma.criminal.city.app.MyApplication r0 = com.mtma.criminal.city.app.MyApplication.f7090a     // Catch:{ Exception -> 0x015d }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ Exception -> 0x015d }
            r1 = 2131888135(0x7f120807, float:1.9410897E38)
            java.lang.String r0 = r0.getString(r1)     // Catch:{ Exception -> 0x015d }
            r1 = 0
            com.bumptech.glide.c.s0(r14, r0, r1)     // Catch:{ Exception -> 0x015d }
            goto L_0x023a
        L_0x0233:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "Exception from try-catch block inside MainActivity in addListenerToLocation method."
            h0.C0552a.x(r14, r0, r6)
        L_0x023a:
            return
        L_0x023b:
            i3.f r1 = r14.f8279b     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r1 = r1.F()     // Catch:{ Exception -> 0x02b1 }
            if (r1 == 0) goto L_0x02b1
            int r2 = r1.hashCode()     // Catch:{ Exception -> 0x02b1 }
            r3 = -762498763(0xffffffffd28d3135, float:-3.03207973E11)
            if (r2 == r3) goto L_0x025c
            r3 = 688591589(0x290b12e5, float:3.088059E-14)
            if (r2 == r3) goto L_0x0252
            goto L_0x0265
        L_0x0252:
            java.lang.String r2 = "versionCode"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x02b1 }
            if (r1 == 0) goto L_0x0265
            r7 = r8
            goto L_0x0265
        L_0x025c:
            java.lang.String r2 = "repairing"
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x02b1 }
            if (r1 == 0) goto L_0x0265
            r7 = r11
        L_0x0265:
            if (r7 == 0) goto L_0x028e
            if (r7 == r11) goto L_0x026a
            goto L_0x02b1
        L_0x026a:
            java.lang.Object r14 = r14.f(r0)     // Catch:{ Exception -> 0x02b1 }
            java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ Exception -> 0x02b1 }
            if (r14 == 0) goto L_0x02b1
            boolean r14 = r14.booleanValue()     // Catch:{ Exception -> 0x02b1 }
            if (r14 == 0) goto L_0x02b1
            com.mtma.criminal.city.activities.MainActivity r14 = r9.f6979I     // Catch:{ Exception -> 0x02b1 }
            e5.b r14 = com.bumptech.glide.c.u0(r14)     // Catch:{ Exception -> 0x02b1 }
            android.os.Handler r0 = new android.os.Handler     // Catch:{ Exception -> 0x02b1 }
            r0.<init>()     // Catch:{ Exception -> 0x02b1 }
            com.mtma.criminal.city.activities.d r1 = new com.mtma.criminal.city.activities.d     // Catch:{ Exception -> 0x02b1 }
            r1.<init>(r13, r14, r11)     // Catch:{ Exception -> 0x02b1 }
            r2 = 15000(0x3a98, double:7.411E-320)
            r0.postDelayed(r1, r2)     // Catch:{ Exception -> 0x02b1 }
            goto L_0x02b1
        L_0x028e:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x02b1 }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x02b1 }
            com.mtma.criminal.city.activities.MainActivity r0 = r9.f6979I     // Catch:{ Exception -> 0x02b1 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ Exception -> 0x02b1 }
            java.lang.String r1 = K1.e.F()     // Catch:{ Exception -> 0x02b1 }
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r8)     // Catch:{ Exception -> 0x02b1 }
            int r0 = r0.versionCode     // Catch:{ Exception -> 0x02b1 }
            if (r14 == 0) goto L_0x02b1
            int r14 = r14.intValue()     // Catch:{ Exception -> 0x02b1 }
            if (r14 <= r0) goto L_0x02b1
            com.mtma.criminal.city.activities.MainActivity r14 = r9.f6979I     // Catch:{ Exception -> 0x02b1 }
            com.bumptech.glide.c.z0(r14)     // Catch:{ Exception -> 0x02b1 }
        L_0x02b1:
            return
        L_0x02b2:
            i3.f r0 = r14.f8279b     // Catch:{ Exception -> 0x02cd }
            java.lang.String r0 = r0.F()     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0541
            int r12 = r0.hashCode()     // Catch:{ Exception -> 0x02cd }
            switch(r12) {
                case -1707660207: goto L_0x0315;
                case 3355: goto L_0x030b;
                case 114586: goto L_0x0301;
                case 3373707: goto L_0x02f7;
                case 358728774: goto L_0x02ee;
                case 747804969: goto L_0x02e4;
                case 1097390534: goto L_0x02da;
                case 1174770321: goto L_0x02d0;
                case 1375970320: goto L_0x02c3;
                default: goto L_0x02c1;
            }     // Catch:{ Exception -> 0x02cd }
        L_0x02c1:
            goto L_0x0320
        L_0x02c3:
            java.lang.String r2 = "contribution"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = 6
            goto L_0x0321
        L_0x02cd:
            r14 = move-exception
            goto L_0x053a
        L_0x02d0:
            java.lang.String r2 = "joinTimeInMilli"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = 7
            goto L_0x0321
        L_0x02da:
            java.lang.String r2 = "respect"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = r4
            goto L_0x0321
        L_0x02e4:
            java.lang.String r2 = "position"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = r5
            goto L_0x0321
        L_0x02ee:
            java.lang.String r4 = "loyalty"
            boolean r0 = r0.equals(r4)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            goto L_0x0321
        L_0x02f7:
            java.lang.String r2 = "name"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = r11
            goto L_0x0321
        L_0x0301:
            java.lang.String r2 = "tag"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = r3
            goto L_0x0321
        L_0x030b:
            java.lang.String r2 = "id"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = r8
            goto L_0x0321
        L_0x0315:
            java.lang.String r2 = "leaveGangTimeInMilli"
            boolean r0 = r0.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r0 == 0) goto L_0x0320
            r2 = 8
            goto L_0x0321
        L_0x0320:
            r2 = r7
        L_0x0321:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            switch(r2) {
                case 0: goto L_0x04b7;
                case 1: goto L_0x04a6;
                case 2: goto L_0x0495;
                case 3: goto L_0x03ab;
                case 4: goto L_0x0385;
                case 5: goto L_0x0370;
                case 6: goto L_0x034a;
                case 7: goto L_0x0339;
                case 8: goto L_0x0328;
                default: goto L_0x0326;
            }
        L_0x0326:
            goto L_0x0541
        L_0x0328:
            java.lang.Object r14 = r14.f(r1)     // Catch:{ Exception -> 0x02cd }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            r0.setLeaveGangTimeInMilli(r14)     // Catch:{ Exception -> 0x02cd }
            goto L_0x0541
        L_0x0339:
            java.lang.Object r14 = r14.f(r1)     // Catch:{ Exception -> 0x02cd }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            r0.setJoinTimeInMilli(r14)     // Catch:{ Exception -> 0x02cd }
            goto L_0x0541
        L_0x034a:
            java.lang.Object r14 = r14.f(r1)     // Catch:{ Exception -> 0x02cd }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            long r1 = r14.longValue()     // Catch:{ Exception -> 0x02cd }
            r0.setContribution(r1)     // Catch:{ Exception -> 0x02cd }
            d5.a r0 = d5.o.getAccountObject()     // Catch:{ Exception -> 0x02cd }
            java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x02cd }
            long r1 = r14.longValue()     // Catch:{ Exception -> 0x02cd }
            r14 = 134(0x86, float:1.88E-43)
            com.mtma.criminal.city.utils.Q.b(r14, r0, r1)     // Catch:{ Exception -> 0x02cd }
            goto L_0x0541
        L_0x0370:
            java.lang.Object r14 = r14.f(r1)     // Catch:{ Exception -> 0x02cd }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            long r1 = r14.longValue()     // Catch:{ Exception -> 0x02cd }
            r0.setLoyalty(r1)     // Catch:{ Exception -> 0x02cd }
            goto L_0x0541
        L_0x0385:
            java.lang.Object r14 = r14.f(r1)     // Catch:{ Exception -> 0x02cd }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            long r1 = r14.longValue()     // Catch:{ Exception -> 0x02cd }
            r0.setRespect(r1)     // Catch:{ Exception -> 0x02cd }
            d5.a r0 = d5.o.getAccountObject()     // Catch:{ Exception -> 0x02cd }
            java.lang.String r0 = r0.getId()     // Catch:{ Exception -> 0x02cd }
            long r1 = r14.longValue()     // Catch:{ Exception -> 0x02cd }
            r14 = 133(0x85, float:1.86E-43)
            com.mtma.criminal.city.utils.Q.b(r14, r0, r1)     // Catch:{ Exception -> 0x02cd }
            goto L_0x0541
        L_0x03ab:
            java.lang.Object r14 = r14.f(r10)     // Catch:{ Exception -> 0x02cd }
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            int r1 = r14.intValue()     // Catch:{ Exception -> 0x02cd }
            r0.setPosition(r1)     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.I r0 = r9.l()     // Catch:{ Exception -> 0x02cd }
            S3.z r0 = r0.f5000c     // Catch:{ Exception -> 0x02cd }
            java.util.List r0 = r0.v()     // Catch:{ Exception -> 0x02cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x02cd }
        L_0x03cc:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x02cd }
            if (r1 == 0) goto L_0x0541
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.s r1 = (androidx.fragment.app.C0286s) r1     // Catch:{ Exception -> 0x02cd }
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.D     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x03fa
            int r2 = r14.intValue()     // Catch:{ Exception -> 0x02cd }
            r4 = r1
            com.mtma.criminal.city.fragments.gangBase.D r4 = (com.mtma.criminal.city.fragments.gangBase.D) r4     // Catch:{ Exception -> 0x02cd }
            int r4 = r4.f7118m0     // Catch:{ Exception -> 0x02cd }
            if (r2 == r4) goto L_0x03fa
            androidx.fragment.app.I r2 = r9.l()     // Catch:{ Exception -> 0x02cd }
            r2.getClass()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.a r4 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x02cd }
            r4.<init>(r2)     // Catch:{ Exception -> 0x02cd }
            r4.h(r1)     // Catch:{ Exception -> 0x02cd }
            r4.e(r8)     // Catch:{ Exception -> 0x02cd }
            goto L_0x03cc
        L_0x03fa:
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.J     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x041b
            d5.g r2 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            int r2 = r2.getPosition()     // Catch:{ Exception -> 0x02cd }
            if (r2 <= r5) goto L_0x041b
            androidx.fragment.app.I r2 = r9.l()     // Catch:{ Exception -> 0x02cd }
            r2.getClass()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.a r4 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x02cd }
            r4.<init>(r2)     // Catch:{ Exception -> 0x02cd }
            r4.h(r1)     // Catch:{ Exception -> 0x02cd }
            r4.e(r8)     // Catch:{ Exception -> 0x02cd }
            goto L_0x03cc
        L_0x041b:
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.H     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x043c
            d5.g r2 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            int r2 = r2.getPosition()     // Catch:{ Exception -> 0x02cd }
            if (r2 <= r3) goto L_0x043c
            androidx.fragment.app.I r2 = r9.l()     // Catch:{ Exception -> 0x02cd }
            r2.getClass()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.a r4 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x02cd }
            r4.<init>(r2)     // Catch:{ Exception -> 0x02cd }
            r4.h(r1)     // Catch:{ Exception -> 0x02cd }
            r4.e(r8)     // Catch:{ Exception -> 0x02cd }
            goto L_0x03cc
        L_0x043c:
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.o     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x045f
            int r2 = r14.intValue()     // Catch:{ Exception -> 0x02cd }
            r4 = r1
            com.mtma.criminal.city.fragments.gangBase.o r4 = (com.mtma.criminal.city.fragments.gangBase.o) r4     // Catch:{ Exception -> 0x02cd }
            int r4 = r4.f7230e0     // Catch:{ Exception -> 0x02cd }
            if (r2 == r4) goto L_0x045f
            androidx.fragment.app.I r2 = r9.l()     // Catch:{ Exception -> 0x02cd }
            r2.getClass()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.a r4 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x02cd }
            r4.<init>(r2)     // Catch:{ Exception -> 0x02cd }
            r4.h(r1)     // Catch:{ Exception -> 0x02cd }
            r4.e(r8)     // Catch:{ Exception -> 0x02cd }
            goto L_0x03cc
        L_0x045f:
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.w     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x03cc
            d5.g r2 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            java.lang.String r2 = r2.getId()     // Catch:{ Exception -> 0x02cd }
            r4 = r1
            com.mtma.criminal.city.fragments.gangBase.w r4 = (com.mtma.criminal.city.fragments.gangBase.w) r4     // Catch:{ Exception -> 0x02cd }
            java.lang.String r4 = r4.f7309f0     // Catch:{ Exception -> 0x02cd }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x03cc
            int r2 = r14.intValue()     // Catch:{ Exception -> 0x02cd }
            r4 = r1
            com.mtma.criminal.city.fragments.gangBase.w r4 = (com.mtma.criminal.city.fragments.gangBase.w) r4     // Catch:{ Exception -> 0x02cd }
            int r4 = r4.f7310g0     // Catch:{ Exception -> 0x02cd }
            if (r2 == r4) goto L_0x03cc
            androidx.fragment.app.I r2 = r9.l()     // Catch:{ Exception -> 0x02cd }
            r2.getClass()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.a r4 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x02cd }
            r4.<init>(r2)     // Catch:{ Exception -> 0x02cd }
            r4.h(r1)     // Catch:{ Exception -> 0x02cd }
            r4.e(r8)     // Catch:{ Exception -> 0x02cd }
            goto L_0x03cc
        L_0x0495:
            java.lang.Object r14 = r14.f(r0)     // Catch:{ Exception -> 0x02cd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            r0.setTag(r14)     // Catch:{ Exception -> 0x02cd }
            goto L_0x0541
        L_0x04a6:
            java.lang.Object r14 = r14.f(r0)     // Catch:{ Exception -> 0x02cd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            r0.setName(r14)     // Catch:{ Exception -> 0x02cd }
            goto L_0x0541
        L_0x04b7:
            java.lang.Object r14 = r14.f(r0)     // Catch:{ Exception -> 0x02cd }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Exception -> 0x02cd }
            if (r14 == 0) goto L_0x0541
            d5.g r0 = d5.o.getGangObject()     // Catch:{ Exception -> 0x02cd }
            r0.setId(r14)     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.I r0 = r9.l()     // Catch:{ Exception -> 0x02cd }
            S3.z r0 = r0.f5000c     // Catch:{ Exception -> 0x02cd }
            java.util.List r0 = r0.v()     // Catch:{ Exception -> 0x02cd }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x02cd }
        L_0x04d4:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x02cd }
            if (r1 == 0) goto L_0x0541
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.s r1 = (androidx.fragment.app.C0286s) r1     // Catch:{ Exception -> 0x02cd }
            java.lang.String r2 = "not_in_gang"
            boolean r2 = r14.equals(r2)     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x0523
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.C0429i     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.s     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.v     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.D     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.G     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.J     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.H     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.o     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.w     // Catch:{ Exception -> 0x02cd }
            if (r2 != 0) goto L_0x0510
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.r     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x04d4
        L_0x0510:
            androidx.fragment.app.I r2 = r9.l()     // Catch:{ Exception -> 0x02cd }
            r2.getClass()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.a r3 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x02cd }
            r3.<init>(r2)     // Catch:{ Exception -> 0x02cd }
            r3.h(r1)     // Catch:{ Exception -> 0x02cd }
            r3.e(r8)     // Catch:{ Exception -> 0x02cd }
            goto L_0x04d4
        L_0x0523:
            boolean r2 = r1 instanceof com.mtma.criminal.city.fragments.gangBase.y     // Catch:{ Exception -> 0x02cd }
            if (r2 == 0) goto L_0x04d4
            androidx.fragment.app.I r2 = r9.l()     // Catch:{ Exception -> 0x02cd }
            r2.getClass()     // Catch:{ Exception -> 0x02cd }
            androidx.fragment.app.a r3 = new androidx.fragment.app.a     // Catch:{ Exception -> 0x02cd }
            r3.<init>(r2)     // Catch:{ Exception -> 0x02cd }
            r3.h(r1)     // Catch:{ Exception -> 0x02cd }
            r3.e(r8)     // Catch:{ Exception -> 0x02cd }
            goto L_0x04d4
        L_0x053a:
            int r0 = com.mtma.criminal.city.activities.MainActivity.L0
            java.lang.String r0 = "Exception from try-catch block inside MainActivity in addListenerToNotificationAlerts method."
            h0.C0552a.x(r14, r0, r6)
        L_0x0541:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mtma.criminal.city.activities.e.q(i3.c):void");
    }

    public void u(C0587c cVar) {
        MainActivity mainActivity = this.f7055b;
        if (mainActivity.f7012m0 == null) {
            d dVar = new d(this, cVar, 10);
            mainActivity.f7012m0 = dVar;
            mainActivity.f6997X.b(dVar);
        }
    }

    private final void a(C0587c cVar) {
    }

    private final void b(C0587c cVar) {
    }

    private final void c(C0587c cVar) {
    }

    private final void d(C0587c cVar) {
    }

    private final void e(C0587c cVar) {
    }

    public void B(C0588d dVar) {
    }
}
