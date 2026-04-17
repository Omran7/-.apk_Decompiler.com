package com.google.android.gms.common.api.internal;

import A4.a;
import B0.A;
import B0.C0004c;
import K.O;
import S3.z;
import T1.C0208t;
import android.view.View;
import com.google.android.gms.common.internal.I;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j4.p0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import s3.C0968f;
import t3.C1008b;
import v3.k;
import v3.l;
import v3.m;
import v3.q;
import v3.s;
import z1.d;

/* renamed from: com.google.android.gms.common.api.internal.y  reason: case insensitive filesystem */
public final class C0370y implements C1008b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f6112a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f6113b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6114c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public Object f6115e;

    public /* synthetic */ C0370y() {
    }

    public m A(m mVar, m mVar2, A a6) {
        m mVar3;
        Iterator it2;
        int i2;
        q qVar;
        q qVar2;
        boolean h = mVar2.f12296a.h();
        l lVar = (l) this.f6115e;
        z zVar = (z) this.d;
        if (!h) {
            s sVar = mVar2.f12296a;
            if (!sVar.isEmpty()) {
                mVar3 = new m(sVar.b(k.f12295e), mVar2.f12298c, mVar2.f12297b);
                if (this.f6114c) {
                    mVar2.k();
                    if (I.j(mVar2.f12297b, m.d)) {
                        it2 = sVar.s();
                    } else {
                        it2 = new C0208t(mVar2.f12297b.f9468a.s(), 1);
                    }
                    qVar2 = (q) zVar.f2713e;
                    qVar = (q) zVar.d;
                    i2 = -1;
                } else {
                    it2 = mVar2.iterator();
                    qVar2 = (q) zVar.d;
                    qVar = (q) zVar.f2713e;
                    i2 = 1;
                }
                boolean z3 = false;
                int i5 = 0;
                while (it2.hasNext()) {
                    q qVar3 = (q) it2.next();
                    if (!z3 && lVar.compare(qVar2, qVar3) * i2 <= 0) {
                        z3 = true;
                    }
                    if (!z3 || i5 >= this.f6113b || lVar.compare(qVar3, qVar) * i2 > 0) {
                        mVar3 = mVar3.v(qVar3.f12304a, k.f12295e);
                    } else {
                        i5++;
                    }
                }
                ((p0) zVar.f2711b).A(mVar, mVar3, a6);
                return mVar3;
            }
        }
        mVar3 = new m(k.f12295e, lVar);
        ((p0) zVar.f2711b).A(mVar, mVar3, a6);
        return mVar3;
    }

    public S a() {
        boolean z3;
        if (((C0366u) this.d) != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        I.a("execute parameter required", z3);
        return new S(this, (d[]) this.f6115e, this.f6114c, this.f6113b);
    }

    public void c(int i2) {
        switch (this.f6112a) {
            case 1:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f6115e;
                WeakReference weakReference = bottomSheetBehavior.f6308U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f6113b = i2;
                    if (!this.f6114c) {
                        WeakHashMap weakHashMap = O.f1352a;
                        ((View) bottomSheetBehavior.f6308U.get()).postOnAnimation((C0004c) this.d);
                        this.f6114c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f6115e;
                WeakReference weakReference2 = sideSheetBehavior.f6496p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f6113b = i2;
                    if (!this.f6114c) {
                        WeakHashMap weakHashMap2 = O.f1352a;
                        ((View) sideSheetBehavior.f6496p.get()).postOnAnimation((a) this.d);
                        this.f6114c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public v3.m g(v3.m r18, v3.C1048c r19, v3.s r20, n3.C0866g r21, t3.C1007a r22, B0.A r23) {
        /*
            r17 = this;
            r0 = r17
            r2 = r18
            r9 = r19
            r6 = r22
            r10 = r23
            v3.q r1 = new v3.q
            r3 = r20
            r1.<init>(r9, r3)
            java.lang.Object r4 = r0.d
            r11 = r4
            S3.z r11 = (S3.z) r11
            boolean r1 = r11.C(r1)
            if (r1 != 0) goto L_0x0020
            v3.k r1 = v3.k.f12295e
            r12 = r1
            goto L_0x0021
        L_0x0020:
            r12 = r3
        L_0x0021:
            v3.s r1 = r2.f12296a
            v3.s r1 = r1.l(r9)
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x002e
            return r2
        L_0x002e:
            v3.s r1 = r2.f12296a
            int r3 = r1.i()
            int r4 = r0.f6113b
            if (r3 >= r4) goto L_0x004c
            java.lang.Object r1 = r11.f2711b
            j4.p0 r1 = (j4.p0) r1
            r2 = r18
            r3 = r19
            r4 = r12
            r5 = r21
            r6 = r22
            r7 = r23
            v3.m r1 = r1.g(r2, r3, r4, r5, r6, r7)
            return r1
        L_0x004c:
            int r3 = r1.i()
            r5 = 1
            if (r3 != r4) goto L_0x0055
            r3 = r5
            goto L_0x0056
        L_0x0055:
            r3 = 0
        L_0x0056:
            q3.l.c(r3)
            v3.q r3 = new v3.q
            r3.<init>(r9, r12)
            r4 = 0
            boolean r7 = r0.f6114c
            if (r7 == 0) goto L_0x0097
            boolean r8 = r1 instanceof v3.C1051f
            if (r8 != 0) goto L_0x0068
            goto L_0x0095
        L_0x0068:
            r18.k()
            k3.e r4 = r2.f12297b
            k3.e r8 = v3.m.d
            boolean r4 = com.google.android.gms.common.internal.I.j(r4, r8)
            if (r4 == 0) goto L_0x008b
            r4 = r1
            v3.f r4 = (v3.C1051f) r4
            k3.c r4 = r4.f12284a
            java.lang.Object r4 = r4.x()
            v3.c r4 = (v3.C1048c) r4
            v3.q r8 = new v3.q
            v3.s r13 = r1.l(r4)
            r8.<init>(r4, r13)
        L_0x0089:
            r4 = r8
            goto L_0x0095
        L_0x008b:
            k3.e r4 = r2.f12297b
            k3.c r4 = r4.f9468a
            java.lang.Object r4 = r4.x()
            v3.q r4 = (v3.q) r4
        L_0x0095:
            r13 = r4
            goto L_0x00c9
        L_0x0097:
            boolean r8 = r1 instanceof v3.C1051f
            if (r8 != 0) goto L_0x009c
            goto L_0x0095
        L_0x009c:
            r18.k()
            k3.e r4 = r2.f12297b
            k3.e r8 = v3.m.d
            boolean r4 = com.google.android.gms.common.internal.I.j(r4, r8)
            if (r4 == 0) goto L_0x00be
            r4 = r1
            v3.f r4 = (v3.C1051f) r4
            k3.c r4 = r4.f12284a
            java.lang.Object r4 = r4.w()
            v3.c r4 = (v3.C1048c) r4
            v3.q r8 = new v3.q
            v3.s r13 = r1.l(r4)
            r8.<init>(r4, r13)
            goto L_0x0089
        L_0x00be:
            k3.e r4 = r2.f12297b
            k3.c r4 = r4.f9468a
            java.lang.Object r4 = r4.w()
            v3.q r4 = (v3.q) r4
            goto L_0x0095
        L_0x00c9:
            boolean r4 = r11.C(r3)
            boolean r8 = r1.d(r9)
            java.lang.Object r14 = r0.f6115e
            v3.l r14 = (v3.l) r14
            if (r8 == 0) goto L_0x0169
            v3.s r8 = r1.l(r9)
            v3.q r13 = r6.h(r14, r13, r7)
        L_0x00df:
            if (r13 == 0) goto L_0x00f4
            v3.c r15 = r13.f12304a
            boolean r16 = r15.equals(r9)
            if (r16 != 0) goto L_0x00ef
            boolean r15 = r1.d(r15)
            if (r15 == 0) goto L_0x00f4
        L_0x00ef:
            v3.q r13 = r6.h(r14, r13, r7)
            goto L_0x00df
        L_0x00f4:
            if (r13 != 0) goto L_0x00f7
            goto L_0x0104
        L_0x00f7:
            if (r7 == 0) goto L_0x00ff
            int r1 = r14.compare(r3, r13)
        L_0x00fd:
            r5 = r1
            goto L_0x0104
        L_0x00ff:
            int r1 = r14.compare(r13, r3)
            goto L_0x00fd
        L_0x0104:
            if (r4 == 0) goto L_0x012b
            boolean r1 = r12.isEmpty()
            if (r1 != 0) goto L_0x012b
            if (r5 < 0) goto L_0x012b
            if (r10 == 0) goto L_0x0125
            v3.m r5 = v3.m.t(r12)
            v3.m r8 = v3.m.t(r8)
            s3.b r1 = new s3.b
            r4 = 4
            r7 = 0
            r3 = r1
            r6 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            r10.a(r1)
        L_0x0125:
            v3.m r1 = r2.v(r9, r12)
            goto L_0x01b4
        L_0x012b:
            if (r10 == 0) goto L_0x013f
            v3.m r5 = v3.m.t(r8)
            s3.b r1 = new s3.b
            r4 = 1
            r7 = 0
            r8 = 0
            r3 = r1
            r6 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            r10.a(r1)
        L_0x013f:
            v3.k r1 = v3.k.f12295e
            v3.m r1 = r2.v(r9, r1)
            if (r13 == 0) goto L_0x01b4
            boolean r2 = r11.C(r13)
            if (r2 == 0) goto L_0x01b4
            v3.s r2 = r13.f12305b
            v3.c r9 = r13.f12304a
            if (r10 == 0) goto L_0x0164
            v3.m r5 = v3.m.t(r2)
            s3.b r11 = new s3.b
            r4 = 2
            r7 = 0
            r8 = 0
            r3 = r11
            r6 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r10.a(r11)
        L_0x0164:
            v3.m r1 = r1.v(r9, r2)
            goto L_0x01b4
        L_0x0169:
            boolean r1 = r12.isEmpty()
            if (r1 == 0) goto L_0x0171
        L_0x016f:
            r1 = r2
            goto L_0x01b4
        L_0x0171:
            if (r4 == 0) goto L_0x016f
            if (r7 == 0) goto L_0x017a
            int r1 = r14.compare(r3, r13)
            goto L_0x017e
        L_0x017a:
            int r1 = r14.compare(r13, r3)
        L_0x017e:
            if (r1 < 0) goto L_0x016f
            if (r10 == 0) goto L_0x01a8
            v3.c r6 = r13.f12304a
            v3.s r1 = r13.f12305b
            v3.m r5 = v3.m.t(r1)
            s3.b r1 = new s3.b
            r4 = 1
            r7 = 0
            r8 = 0
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8)
            r10.a(r1)
            v3.m r5 = v3.m.t(r12)
            s3.b r1 = new s3.b
            r4 = 2
            r7 = 0
            r8 = 0
            r3 = r1
            r6 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            r10.a(r1)
        L_0x01a8:
            v3.m r1 = r2.v(r9, r12)
            v3.c r2 = r13.f12304a
            v3.k r3 = v3.k.f12295e
            v3.m r1 = r1.v(r2, r3)
        L_0x01b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.C0370y.g(v3.m, v3.c, v3.s, n3.g, t3.a, B0.A):v3.m");
    }

    public p0 j() {
        return (p0) ((z) this.d).f2711b;
    }

    public boolean m() {
        return true;
    }

    public l n() {
        return (l) this.f6115e;
    }

    public C0370y(C0968f fVar) {
        this.d = new z(fVar);
        this.f6115e = fVar.g;
        if (fVar.d()) {
            this.f6113b = fVar.f11533a.intValue();
            this.f6114c = !fVar.g();
            return;
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public C0370y(SideSheetBehavior sideSheetBehavior) {
        this.f6115e = sideSheetBehavior;
        this.d = new a(this, 17);
    }

    public C0370y(BottomSheetBehavior bottomSheetBehavior) {
        this.f6115e = bottomSheetBehavior;
        this.d = new C0004c((Object) this, 26);
    }

    public m b(m mVar, s sVar) {
        return mVar;
    }
}
