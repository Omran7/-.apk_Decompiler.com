package com.bumptech.glide;

import B0.p;
import Q0.a;
import Q0.c;
import Q0.d;
import Q0.e;
import Q0.f;
import R0.b;
import U0.g;
import U0.o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.internal.p002firebaseauthapi.zzaky;
import com.mtma.criminal.city.utils.Z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public final class j extends a {

    /* renamed from: B  reason: collision with root package name */
    public final Context f5779B;

    /* renamed from: C  reason: collision with root package name */
    public final l f5780C;

    /* renamed from: D  reason: collision with root package name */
    public final Class f5781D;

    /* renamed from: E  reason: collision with root package name */
    public final e f5782E;
    public a F;

    /* renamed from: G  reason: collision with root package name */
    public Object f5783G;

    /* renamed from: H  reason: collision with root package name */
    public ArrayList f5784H;

    /* renamed from: I  reason: collision with root package name */
    public j f5785I;

    /* renamed from: J  reason: collision with root package name */
    public j f5786J;

    /* renamed from: K  reason: collision with root package name */
    public Float f5787K;

    /* renamed from: L  reason: collision with root package name */
    public final boolean f5788L = true;

    /* renamed from: M  reason: collision with root package name */
    public boolean f5789M;

    /* renamed from: N  reason: collision with root package name */
    public boolean f5790N;

    static {
        e eVar = (e) ((e) ((e) new a().d(p.f285c)).l()).q();
    }

    public j(b bVar, l lVar, Class cls, Context context) {
        e eVar;
        this.f5780C = lVar;
        this.f5781D = cls;
        this.f5779B = context;
        n.e eVar2 = lVar.f5794a.f5729c.f5763f;
        a aVar = (a) eVar2.get(cls);
        if (aVar == null) {
            Iterator it2 = ((b4.j) eVar2.entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    aVar = (a) entry.getValue();
                }
            }
        }
        this.F = aVar == null ? e.f5758k : aVar;
        this.f5782E = bVar.f5729c;
        Iterator it3 = lVar.f5801r.iterator();
        while (it3.hasNext()) {
            u((Z) it3.next());
        }
        synchronized (lVar) {
            eVar = lVar.f5802s;
        }
        a(eVar);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, I0.e] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, I0.e] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, I0.e] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, I0.e] */
    public final void A(ImageView imageView) {
        a aVar;
        b bVar;
        o.a();
        g.b(imageView);
        if (!a.g(this.f2339a, 2048) && imageView.getScaleType() != null) {
            switch (i.f5777a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().h(I0.o.d, new Object());
                    break;
                case 2:
                    aVar = clone().h(I0.o.f1122c, new Object());
                    aVar.f2354z = true;
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().h(I0.o.f1121b, new Object());
                    aVar.f2354z = true;
                    break;
                case zzaky.zzf.zzf /*6*/:
                    aVar = clone().h(I0.o.f1122c, new Object());
                    aVar.f2354z = true;
                    break;
            }
        }
        aVar = this;
        this.f5782E.f5761c.getClass();
        Class cls = this.f5781D;
        if (Bitmap.class.equals(cls)) {
            bVar = new b(imageView, 0);
        } else if (Drawable.class.isAssignableFrom(cls)) {
            bVar = new b(imageView, 1);
        } else {
            throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
        }
        z(bVar, aVar);
    }

    public final j B(Z z3) {
        if (this.f2353y) {
            return clone().B(z3);
        }
        this.f5784H = null;
        return u(z3);
    }

    public final j C(Object obj) {
        if (this.f2353y) {
            return clone().C(obj);
        }
        this.f5783G = obj;
        this.f5789M = true;
        m();
        return this;
    }

    public final f D(int i2, int i5, a aVar, d dVar, R0.d dVar2, a aVar2, f fVar, Object obj) {
        Object obj2 = this.f5783G;
        ArrayList arrayList = this.f5784H;
        e eVar = this.f5782E;
        return new f(this.f5779B, eVar, obj, obj2, this.f5781D, aVar, i2, i5, fVar, dVar2, arrayList, dVar, eVar.g, aVar2.f5724a);
    }

    public final j E() {
        if (this.f2353y) {
            return clone().E();
        }
        this.f5787K = Float.valueOf(1.0f);
        m();
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (!super.equals(jVar)) {
            return false;
        }
        if (!Objects.equals(this.f5781D, jVar.f5781D) || !this.F.equals(jVar.F) || !Objects.equals(this.f5783G, jVar.f5783G) || !Objects.equals(this.f5784H, jVar.f5784H) || !Objects.equals(this.f5785I, jVar.f5785I) || !Objects.equals(this.f5786J, jVar.f5786J) || !Objects.equals(this.f5787K, jVar.f5787K) || this.f5788L != jVar.f5788L || this.f5789M != jVar.f5789M) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return o.g(this.f5789M ? 1 : 0, o.g(this.f5788L ? 1 : 0, o.h(o.h(o.h(o.h(o.h(o.h(o.h(super.hashCode(), this.f5781D), this.F), this.f5783G), this.f5784H), this.f5785I), this.f5786J), this.f5787K)));
    }

    public final j u(Z z3) {
        if (this.f2353y) {
            return clone().u(z3);
        }
        if (z3 != null) {
            if (this.f5784H == null) {
                this.f5784H = new ArrayList();
            }
            this.f5784H.add(z3);
        }
        m();
        return this;
    }

    /* renamed from: v */
    public final j a(a aVar) {
        g.b(aVar);
        return (j) super.a(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: Q0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: Q0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: Q0.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: Q0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: Q0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: Q0.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: Q0.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: Q0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: Q0.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Q0.c w(int r19, int r20, Q0.a r21, Q0.d r22, R0.d r23, com.bumptech.glide.a r24, com.bumptech.glide.f r25, java.lang.Object r26) {
        /*
            r18 = this;
            r9 = r18
            r10 = r21
            r11 = r25
            r12 = r26
            com.bumptech.glide.j r0 = r9.f5786J
            if (r0 == 0) goto L_0x0016
            Q0.b r0 = new Q0.b
            r1 = r22
            r0.<init>(r12, r1)
            r4 = r0
            r13 = r4
            goto L_0x001b
        L_0x0016:
            r1 = r22
            r0 = 0
            r13 = r0
            r4 = r1
        L_0x001b:
            com.bumptech.glide.j r0 = r9.f5785I
            if (r0 == 0) goto L_0x00a6
            boolean r1 = r9.f5790N
            if (r1 != 0) goto L_0x009e
            com.bumptech.glide.a r1 = r0.F
            boolean r2 = r0.f5788L
            if (r2 == 0) goto L_0x002c
            r14 = r24
            goto L_0x002d
        L_0x002c:
            r14 = r1
        L_0x002d:
            int r0 = r0.f2339a
            r1 = 8
            boolean r0 = Q0.a.g(r0, r1)
            if (r0 == 0) goto L_0x003d
            com.bumptech.glide.j r0 = r9.f5785I
            com.bumptech.glide.f r0 = r0.d
        L_0x003b:
            r15 = r0
            goto L_0x0042
        L_0x003d:
            com.bumptech.glide.f r0 = r9.y(r11)
            goto L_0x003b
        L_0x0042:
            com.bumptech.glide.j r0 = r9.f5785I
            int r1 = r0.f2346r
            int r0 = r0.f2345q
            boolean r2 = U0.o.i(r19, r20)
            if (r2 == 0) goto L_0x0063
            com.bumptech.glide.j r2 = r9.f5785I
            int r3 = r2.f2346r
            int r2 = r2.f2345q
            boolean r2 = U0.o.i(r3, r2)
            if (r2 != 0) goto L_0x0063
            int r0 = r10.f2346r
            int r1 = r10.f2345q
            r16 = r0
            r17 = r1
            goto L_0x0067
        L_0x0063:
            r17 = r0
            r16 = r1
        L_0x0067:
            Q0.g r8 = new Q0.g
            r8.<init>(r12, r4)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r8
            r5 = r23
            r6 = r24
            r7 = r25
            r11 = r8
            r8 = r26
            Q0.f r8 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 1
            r9.f5790N = r0
            com.bumptech.glide.j r3 = r9.f5785I
            r0 = r3
            r1 = r16
            r2 = r17
            r4 = r11
            r6 = r14
            r7 = r15
            r14 = r8
            r8 = r26
            Q0.c r0 = r0.w(r1, r2, r3, r4, r5, r6, r7, r8)
            r1 = 0
            r9.f5790N = r1
            r11.f2388c = r14
            r11.d = r0
            goto L_0x00f9
        L_0x009e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()"
            r0.<init>(r1)
            throw r0
        L_0x00a6:
            java.lang.Float r0 = r9.f5787K
            if (r0 == 0) goto L_0x00e4
            Q0.g r14 = new Q0.g
            r14.<init>(r12, r4)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r14
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            Q0.f r15 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8)
            Q0.a r0 = r21.clone()
            java.lang.Float r1 = r9.f5787K
            float r1 = r1.floatValue()
            Q0.a r3 = r0.p(r1)
            com.bumptech.glide.f r7 = r9.y(r11)
            r0 = r18
            r1 = r19
            Q0.f r0 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.f2388c = r15
            r14.d = r0
            r11 = r14
            goto L_0x00f9
        L_0x00e4:
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            Q0.f r8 = r0.D(r1, r2, r3, r4, r5, r6, r7, r8)
            r11 = r8
        L_0x00f9:
            if (r13 != 0) goto L_0x00fc
            return r11
        L_0x00fc:
            com.bumptech.glide.j r0 = r9.f5786J
            int r1 = r0.f2346r
            int r0 = r0.f2345q
            boolean r2 = U0.o.i(r19, r20)
            if (r2 == 0) goto L_0x011b
            com.bumptech.glide.j r2 = r9.f5786J
            int r3 = r2.f2346r
            int r2 = r2.f2345q
            boolean r2 = U0.o.i(r3, r2)
            if (r2 != 0) goto L_0x011b
            int r0 = r10.f2346r
            int r1 = r10.f2345q
            r2 = r1
            r1 = r0
            goto L_0x011c
        L_0x011b:
            r2 = r0
        L_0x011c:
            com.bumptech.glide.j r3 = r9.f5786J
            com.bumptech.glide.a r6 = r3.F
            com.bumptech.glide.f r7 = r3.d
            r0 = r3
            r4 = r13
            r5 = r23
            r8 = r26
            Q0.c r0 = r0.w(r1, r2, r3, r4, r5, r6, r7, r8)
            r13.f2357c = r11
            r13.d = r0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.w(int, int, Q0.a, Q0.d, R0.d, com.bumptech.glide.a, com.bumptech.glide.f, java.lang.Object):Q0.c");
    }

    /* renamed from: x */
    public final j clone() {
        j jVar = (j) super.clone();
        jVar.F = jVar.F.clone();
        if (jVar.f5784H != null) {
            jVar.f5784H = new ArrayList(jVar.f5784H);
        }
        j jVar2 = jVar.f5785I;
        if (jVar2 != null) {
            jVar.f5785I = jVar2.clone();
        }
        j jVar3 = jVar.f5786J;
        if (jVar3 != null) {
            jVar.f5786J = jVar3.clone();
        }
        return jVar;
    }

    public final f y(f fVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return f.f5766a;
        }
        if (ordinal == 2) {
            return f.f5767b;
        }
        if (ordinal == 3) {
            return f.f5768c;
        }
        throw new IllegalArgumentException("unknown priority: " + this.d);
    }

    public final void z(R0.d dVar, a aVar) {
        g.b(dVar);
        if (this.f5789M) {
            Object obj = new Object();
            c w6 = w(aVar.f2346r, aVar.f2345q, aVar, (d) null, dVar, this.F, aVar.d, obj);
            c g = dVar.g();
            if (!w6.e(g) || (!aVar.f2344p && g.k())) {
                this.f5780C.m(dVar);
                dVar.d(w6);
                l lVar = this.f5780C;
                synchronized (lVar) {
                    lVar.f5798f.f5845a.add(dVar);
                    com.bumptech.glide.manager.o oVar = lVar.d;
                    ((Set) oVar.f5844c).add(w6);
                    if (!oVar.f5843b) {
                        w6.h();
                    } else {
                        w6.clear();
                        if (Log.isLoggable("RequestTracker", 2)) {
                            Log.v("RequestTracker", "Paused, delaying request");
                        }
                        ((HashSet) oVar.d).add(w6);
                    }
                }
                return;
            }
            g.c(g, "Argument must not be null");
            if (!g.isRunning()) {
                g.h();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }
}
