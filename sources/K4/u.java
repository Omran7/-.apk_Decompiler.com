package K4;

import B0.l;
import I3.h;
import R2.b;
import Y4.B;
import android.content.Context;
import com.bumptech.glide.c;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.R;
import com.mtma.criminal.city.app.MyApplication;
import com.mtma.criminal.city.fragments.gangBase.I;
import com.mtma.criminal.city.utils.C0451v;
import com.mtma.criminal.city.utils.J;
import com.mtma.criminal.city.utils.K;
import com.mtma.criminal.city.utils.T;
import com.mtma.criminal.city.utils.U;
import com.mtma.criminal.city.utils.g0;
import d5.j;
import d5.k;
import d5.o;
import d5.v;
import i3.C0587c;
import i3.C0588d;
import i3.p;
import i3.q;
import java.util.HashMap;
import java.util.TreeMap;
import x1.i;

public final class u implements q, p, T {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1610a;

    /* renamed from: b  reason: collision with root package name */
    public long f1611b;

    /* renamed from: c  reason: collision with root package name */
    public Object f1612c;

    public /* synthetic */ u(long j6, Object obj, int i2) {
        this.f1610a = i2;
        this.f1611b = j6;
        this.f1612c = obj;
    }

    public void B(C0588d dVar) {
        int i2 = this.f1610a;
    }

    public void a(int i2) {
        if (i2 >= 64) {
            u uVar = (u) this.f1612c;
            if (uVar != null) {
                uVar.a(i2 - 64);
                return;
            }
            return;
        }
        this.f1611b &= ~(1 << i2);
    }

    public int b(int i2) {
        u uVar = (u) this.f1612c;
        if (uVar == null) {
            if (i2 >= 64) {
                return Long.bitCount(this.f1611b);
            }
            return Long.bitCount(this.f1611b & ((1 << i2) - 1));
        } else if (i2 < 64) {
            return Long.bitCount(this.f1611b & ((1 << i2) - 1));
        } else {
            return Long.bitCount(this.f1611b) + uVar.b(i2 - 64);
        }
    }

    public void c(boolean z3) {
        g0 g0Var = (g0) this.f1612c;
        if (z3) {
            b.a1(g0Var.f7413a, 0, this.f1611b, new K(this, 9));
            return;
        }
        b.w(false);
        boolean equals = g0Var.f7415c.equals("gold");
        Context context = g0Var.f7414b;
        if (equals) {
            c.y0(context);
        } else if (g0Var.f7415c.equals("check")) {
            a.n(MyApplication.f7090a, R.string.do_not_have_enough_check, context, (String) null);
        }
    }

    public void d() {
        if (((u) this.f1612c) == null) {
            this.f1612c = new u();
        }
    }

    public boolean e(int i2) {
        if (i2 >= 64) {
            d();
            return ((u) this.f1612c).e(i2 - 64);
        } else if ((this.f1611b & (1 << i2)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:87:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public B0.H f(i3.C0595k r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.Class<d5.k> r0 = d5.k.class
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            r4 = 0
            int r6 = r1.f1610a
            switch(r6) {
                case 6: goto L_0x00ff;
                case 7: goto L_0x00b5;
                case 8: goto L_0x0088;
                case 9: goto L_0x004a;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.Object r0 = r21.b()
            if (r0 != 0) goto L_0x001a
            B0.H r0 = R2.b.W0(r21)
            goto L_0x0049
        L_0x001a:
            java.lang.String r0 = "jobGotSalaryTimeInMilli"
            i3.k r4 = r2.a(r0)
            java.lang.Object r3 = r4.c(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            r3.getClass()
            long r3 = com.bumptech.glide.c.W(r3)
            long r5 = r1.f1611b
            long r5 = com.bumptech.glide.c.Y(r5)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0045
            i3.k r0 = r2.a(r0)
            java.util.Map r3 = i3.n.f8294a
            r0.d(r3)
            B0.H r0 = R2.b.W0(r21)
            goto L_0x0049
        L_0x0045:
            B0.H r0 = R2.b.a()
        L_0x0049:
            return r0
        L_0x004a:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Object r0 = r2.c(r0)     // Catch:{ Exception -> 0x0057 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0057 }
            long r4 = android.support.v4.media.session.a.c0(r0)     // Catch:{ Exception -> 0x0057 }
            goto L_0x005f
        L_0x0057:
            r0 = move-exception
            java.lang.String r3 = "Exception from try-catch block when get long from firebase for rankValue in the updateRankForIncreasedValue method (ignore it, default value added 0)."
            java.lang.String r6 = "a"
            h0.C0552a.x(r0, r3, r6)
        L_0x005f:
            long r6 = r1.f1611b
            long r4 = r4 + r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r3 = 18
            java.lang.String r3 = K1.e.d(r3, r4)
            r0.append(r3)
            java.lang.String r3 = "."
            r0.append(r3)
            java.lang.Object r3 = r1.f1612c
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.d(r0)
            B0.H r0 = R2.b.W0(r21)
            return r0
        L_0x0088:
            java.lang.Object r0 = r21.b()
            if (r0 != 0) goto L_0x0093
            B0.H r0 = R2.b.W0(r21)
            goto L_0x00b4
        L_0x0093:
            java.lang.Object r0 = r2.c(r3)
            java.lang.Long r0 = (java.lang.Long) r0
            long r6 = r0.longValue()
            long r8 = r1.f1611b
            long r6 = r6 + r8
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a9
            B0.H r0 = R2.b.a()
            goto L_0x00b4
        L_0x00a9:
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r2.d(r0)
            B0.H r0 = R2.b.W0(r21)
        L_0x00b4:
            return r0
        L_0x00b5:
            java.lang.Object r0 = r2.c(r0)
            d5.k r0 = (d5.k) r0
            if (r0 != 0) goto L_0x00c2
            B0.H r0 = R2.b.W0(r21)
            goto L_0x00fe
        L_0x00c2:
            java.lang.Object r3 = r1.f1612c
            B0.l r3 = (B0.l) r3
            int r3 = r3.f246b
            int r3 = I1.b.k0(r3)
            long r3 = (long) r3
            r5 = 86400(0x15180, double:4.26873E-319)
            long r3 = r3 * r5
            long r5 = r0.getVipEndTime()
            long r7 = r1.f1611b
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x00ef
            long r7 = r7 + r3
            r0.setVipEndTime(r7)
            int r3 = r0.getPowerCurrent()
            int r4 = com.bumptech.glide.d.B0(r0)
            if (r3 > r4) goto L_0x00f7
            java.util.Map r3 = i3.n.f8294a
            r0.setPowerChangeTimeInMilli(r3)
            goto L_0x00f7
        L_0x00ef:
            long r5 = r0.getVipEndTime()
            long r5 = r5 + r3
            r0.setVipEndTime(r5)
        L_0x00f7:
            r2.d(r0)
            B0.H r0 = R2.b.W0(r21)
        L_0x00fe:
            return r0
        L_0x00ff:
            java.lang.Object r0 = r2.c(r0)
            d5.k r0 = (d5.k) r0
            if (r0 != 0) goto L_0x010d
            B0.H r0 = R2.b.W0(r21)
            goto L_0x024b
        L_0x010d:
            int r3 = com.bumptech.glide.d.B0(r0)
            int r6 = r0.getPowerCurrent()
            r7 = 120(0x78, double:5.93E-322)
            long r9 = r1.f1611b
            if (r6 >= r3) goto L_0x0152
            long r11 = r0.getPowerChangeTimeInSeconds()
            long r11 = r9 - r11
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x0152
            int r6 = (int) r11
            int r6 = r6 / 120
            d5.k r11 = d5.o.getMainStatesObject()
            long r11 = r11.getVipEndTime()
            boolean r11 = R2.b.k0(r11)
            if (r11 == 0) goto L_0x0138
            int r6 = r6 * 2
        L_0x0138:
            if (r6 <= 0) goto L_0x0152
            int r11 = r0.getPowerCurrent()
            int r11 = r11 + r6
            if (r11 < r3) goto L_0x0145
            r0.setPowerCurrent(r3)
            goto L_0x014d
        L_0x0145:
            int r3 = r0.getPowerCurrent()
            int r3 = r3 + r6
            r0.setPowerCurrent(r3)
        L_0x014d:
            java.util.Map r3 = i3.n.f8294a
            r0.setPowerChangeTimeInMilli(r3)
        L_0x0152:
            int r3 = r0.getLevel()
            int r3 = com.bumptech.glide.d.e0(r3)
            int r6 = r0.getCourageCurrent()
            if (r6 >= r3) goto L_0x01ac
            long r11 = r0.getCourageChangeTimeInSeconds()
            long r11 = r9 - r11
            int r6 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x01ac
            int r6 = (int) r11
            int r6 = r6 / 120
            long r7 = r0.getCourageDoubleEffectEndTime()
            long r11 = com.bumptech.glide.c.f5744o
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x017a
            int r6 = r6 * 2
            goto L_0x0192
        L_0x017a:
            long r7 = r0.getCourageDoubleEffectEndTime()
            long r11 = r0.getCourageChangeTimeInSeconds()
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0192
            long r7 = r0.getCourageDoubleEffectEndTime()
            long r7 = com.bumptech.glide.c.U(r7)
            int r7 = (int) r7
            int r7 = r7 / 120
            int r6 = r6 + r7
        L_0x0192:
            if (r6 <= 0) goto L_0x01ac
            int r7 = r0.getCourageCurrent()
            int r7 = r7 + r6
            if (r7 < r3) goto L_0x019f
            r0.setCourageCurrent(r3)
            goto L_0x01a7
        L_0x019f:
            int r3 = r0.getCourageCurrent()
            int r3 = r3 + r6
            r0.setCourageCurrent(r3)
        L_0x01a7:
            java.util.Map r3 = i3.n.f8294a
            r0.setCourageChangeTimeInMilli(r3)
        L_0x01ac:
            int r3 = r0.getNobilityCurrent()
            r6 = 100
            if (r3 >= r6) goto L_0x01dd
            long r7 = r0.getNobilityChangeTimeInSeconds()
            long r7 = r9 - r7
            r11 = 300(0x12c, double:1.48E-321)
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x01dd
            int r3 = (int) r7
            int r3 = r3 / 300
            if (r3 <= 0) goto L_0x01dd
            int r7 = r0.getNobilityCurrent()
            int r7 = r7 + r3
            if (r7 < r6) goto L_0x01d0
            r0.setNobilityCurrent(r6)
            goto L_0x01d8
        L_0x01d0:
            int r6 = r0.getNobilityCurrent()
            int r6 = r6 + r3
            r0.setNobilityCurrent(r6)
        L_0x01d8:
            java.util.Map r3 = i3.n.f8294a
            r0.setNobilityChangeTimeInMilli(r3)
        L_0x01dd:
            long r6 = com.bumptech.glide.d.p0(r0)
            long r11 = r0.getHealthCurrent()
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0244
            long r11 = r0.getHealthChangeTimeInSeconds()
            long r9 = r9 - r11
            double r8 = (double) r9
            r10 = 4638144666238189568(0x405e000000000000, double:120.0)
            double r8 = r8 / r10
            double r12 = (double) r6
            double r8 = r8 * r12
            r14 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r8 = r8 * r14
            long r8 = (long) r8
            long r16 = r0.getHealthDoubleEffectEndTime()
            long r18 = com.bumptech.glide.c.f5744o
            int r3 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x020a
            r10 = 2
            long r8 = r8 * r10
        L_0x0208:
            r3 = r4
            goto L_0x0226
        L_0x020a:
            long r16 = r0.getHealthDoubleEffectEndTime()
            long r18 = r0.getHealthChangeTimeInSeconds()
            int r3 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r3 <= 0) goto L_0x0208
            long r16 = r0.getHealthDoubleEffectEndTime()
            long r4 = com.bumptech.glide.c.U(r16)
            double r3 = (double) r4
            double r3 = r3 / r10
            double r3 = r3 * r12
            double r3 = r3 * r14
            long r3 = (long) r3
            long r8 = r8 + r3
            r3 = 0
        L_0x0226:
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0244
            long r3 = r0.getHealthCurrent()
            long r3 = r3 + r8
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0237
            r0.setHealthCurrent(r6)
            goto L_0x023f
        L_0x0237:
            long r3 = r0.getHealthCurrent()
            long r3 = r3 + r8
            r0.setHealthCurrent(r3)
        L_0x023f:
            java.util.Map r3 = i3.n.f8294a
            r0.setHealthChangeTimeInMilli(r3)
        L_0x0244:
            r2.d(r0)
            B0.H r0 = R2.b.W0(r21)
        L_0x024b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: K4.u.f(i3.k):B0.H");
    }

    public void g(int i2, boolean z3) {
        boolean z4;
        if (i2 >= 64) {
            d();
            ((u) this.f1612c).g(i2 - 64, z3);
            return;
        }
        long j6 = this.f1611b;
        if ((Long.MIN_VALUE & j6) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        long j7 = (1 << i2) - 1;
        this.f1611b = ((j6 & (~j7)) << 1) | (j6 & j7);
        if (z3) {
            o(i2);
        } else {
            a(i2);
        }
        if (z4 || ((u) this.f1612c) != null) {
            d();
            ((u) this.f1612c).g(0, z4);
        }
    }

    public void l(C0588d dVar, boolean z3, C0587c cVar) {
        switch (this.f1610a) {
            case zzaky.zzf.zzf /*6*/:
                k kVar = (k) cVar.f(k.class);
                J j6 = (J) this.f1612c;
                if (dVar != null || !z3 || !cVar.b()) {
                    j6.h(false, kVar);
                    return;
                }
                o.setMainStatesObject(kVar);
                j6.h(true, kVar);
                return;
            case zzaky.zzf.zzg /*7*/:
                k kVar2 = (k) cVar.f(k.class);
                l lVar = (l) this.f1612c;
                if (dVar != null || !z3 || !cVar.b()) {
                    ((I) lVar.f247c).h(false, kVar2);
                    return;
                }
                o.setMainStatesObject(kVar2);
                ((I) lVar.f247c).h(true, kVar2);
                return;
            case 8:
                T t6 = (T) this.f1612c;
                if (dVar != null || !cVar.b() || !z3) {
                    if (t6 != null) {
                        t6.c(false);
                        return;
                    }
                    return;
                } else if (t6 != null) {
                    ((Long) cVar.f(Long.class)).getClass();
                    t6.c(true);
                    return;
                } else {
                    return;
                }
            case 9:
                return;
            default:
                K k6 = (K) this.f1612c;
                if (dVar != null || !cVar.b() || !z3) {
                    ((h) k6.f7360b).y(false);
                    return;
                }
                o.setWorkObject((v) cVar.f(v.class));
                ((h) k6.f7360b).y(true);
                return;
        }
    }

    public boolean m(int i2) {
        boolean z3;
        if (i2 >= 64) {
            d();
            return ((u) this.f1612c).m(i2 - 64);
        }
        long j6 = 1 << i2;
        long j7 = this.f1611b;
        if ((j7 & j6) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        long j8 = j7 & (~j6);
        this.f1611b = j8;
        long j9 = j6 - 1;
        this.f1611b = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
        u uVar = (u) this.f1612c;
        if (uVar != null) {
            if (uVar.e(0)) {
                o(63);
            }
            ((u) this.f1612c).m(0);
        }
        return z3;
    }

    public void n() {
        this.f1611b = 0;
        u uVar = (u) this.f1612c;
        if (uVar != null) {
            uVar.n();
        }
    }

    public void o(int i2) {
        if (i2 >= 64) {
            d();
            ((u) this.f1612c).o(i2 - 64);
            return;
        }
        this.f1611b |= 1 << i2;
    }

    public String toString() {
        switch (this.f1610a) {
            case 12:
                if (((u) this.f1612c) == null) {
                    return Long.toBinaryString(this.f1611b);
                }
                return ((u) this.f1612c).toString() + "xx" + Long.toBinaryString(this.f1611b);
            default:
                return super.toString();
        }
    }

    public void u(C0587c cVar) {
        C0587c cVar2 = cVar;
        Class<j> cls = j.class;
        Class<k> cls2 = k.class;
        switch (this.f1610a) {
            case 0:
                Integer num = (Integer) cVar2.f(Integer.class);
                if (num != null) {
                    int intValue = num.intValue();
                    v vVar = (v) this.f1612c;
                    if (intValue == 3) {
                        b.w(false);
                        a.n(MyApplication.f7090a, R.string.can_not_send_material_during_flight, vVar.f1626d0, (String) null);
                        return;
                    }
                    String str = vVar.f1627e0;
                    long j6 = this.f1611b;
                    t tVar = new t(this, j6);
                    TreeMap treeMap = U.f7378a;
                    HashMap hashMap = new HashMap();
                    hashMap.put("serverNumber", Integer.valueOf(o.getAccountObject().getCurrentOpenedServer()));
                    hashMap.put("senderPlayerId", o.getAccountObject().getId());
                    hashMap.put("receiverPlayerId", str);
                    hashMap.put("cashValue", Long.valueOf(j6));
                    F3.h.b().a("sendCashToOtherPlayer").q(hashMap).addOnCompleteListener(new C0451v(tVar, 6));
                    return;
                }
                return;
            case 1:
                k kVar = (k) cVar2.a("mainStatesObject").f(cls2);
                j jVar = (j) cVar2.a("locationObject").f(cls);
                String nickName = kVar.getNickName();
                String profilePicUrl = kVar.getProfilePicUrl();
                int gender = kVar.getGender();
                int level = kVar.getLevel();
                B b6 = new B(cVar2.f8279b.F(), nickName, profilePicUrl, b.k0(kVar.getVipEndTime()), b.l0(kVar.getLastSeen()), gender, level, jVar.getCurrentCity(), jVar.getCurrentPlace());
                U3.c cVar3 = (U3.c) this.f1612c;
                ((P4.j) cVar3.f3713b).f2237i0.add(0, b6);
                P4.j jVar2 = (P4.j) cVar3.f3713b;
                long j7 = this.f1611b;
                if (((long) jVar2.f2237i0.size()) == j7 - 1) {
                    jVar2.f2240l0 = (int) j7;
                    if (j7 < 10) {
                        jVar2.f2241m0 = false;
                    }
                    jVar2.f2238j0.notifyDataSetChanged();
                    b.w(false);
                    return;
                }
                return;
            default:
                k kVar2 = (k) cVar2.a("mainStatesObject").f(cls2);
                j jVar3 = (j) cVar2.a("locationObject").f(cls);
                String nickName2 = kVar2.getNickName();
                String profilePicUrl2 = kVar2.getProfilePicUrl();
                int gender2 = kVar2.getGender();
                int level2 = kVar2.getLevel();
                B b7 = new B(cVar2.f8279b.F(), nickName2, profilePicUrl2, b.k0(kVar2.getVipEndTime()), b.l0(kVar2.getLastSeen()), gender2, level2, jVar3.getCurrentCity(), jVar3.getCurrentPlace());
                i iVar = (i) this.f1612c;
                P4.j jVar4 = (P4.j) iVar.f12553b;
                jVar4.f2237i0.add(jVar4.f2240l0, b7);
                P4.j jVar5 = (P4.j) iVar.f12553b;
                long j8 = this.f1611b;
                if (((long) jVar5.f2237i0.size()) == j8 - 1) {
                    jVar5.f2240l0 = (int) (((long) jVar5.f2240l0) + j8);
                    if (j8 < 10) {
                        jVar5.f2241m0 = false;
                    }
                    jVar5.f2238j0.notifyDataSetChanged();
                    b.w(false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ u(Object obj, long j6, int i2) {
        this.f1610a = i2;
        this.f1612c = obj;
        this.f1611b = j6;
    }

    public u(G1.b bVar) {
        this.f1610a = 3;
        com.google.android.gms.common.internal.I.g(bVar);
        this.f1612c = bVar;
    }

    public u() {
        this.f1610a = 12;
        this.f1611b = 0;
    }

    private final void h(C0588d dVar) {
    }

    private final void i(C0588d dVar) {
    }

    private final void j(C0588d dVar) {
    }

    private final void k(C0588d dVar, boolean z3, C0587c cVar) {
    }
}
