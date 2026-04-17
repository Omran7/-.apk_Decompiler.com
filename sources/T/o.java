package t;

import q.C0928e;
import s.c;
import s.d;

public abstract class o implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f11602a;

    /* renamed from: b  reason: collision with root package name */
    public d f11603b;

    /* renamed from: c  reason: collision with root package name */
    public l f11604c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public final g f11605e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f11606f = 0;
    public boolean g = false;
    public final f h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public final f f11607i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public int f11608j = 1;

    public o(d dVar) {
        this.f11603b = dVar;
    }

    public static void b(f fVar, f fVar2, int i2) {
        fVar.f11589l.add(fVar2);
        fVar.f11585f = i2;
        fVar2.f11588k.add(fVar);
    }

    public static f h(c cVar) {
        c cVar2 = cVar.f11287f;
        if (cVar2 == null) {
            return null;
        }
        int c3 = C0928e.c(cVar2.f11286e);
        d dVar = cVar2.d;
        if (c3 == 1) {
            return dVar.d.h;
        }
        if (c3 == 2) {
            return dVar.f11321e.h;
        }
        if (c3 == 3) {
            return dVar.d.f11607i;
        }
        if (c3 == 4) {
            return dVar.f11321e.f11607i;
        }
        if (c3 != 5) {
            return null;
        }
        return dVar.f11321e.f11595k;
    }

    public static f i(c cVar, int i2) {
        o oVar;
        c cVar2 = cVar.f11287f;
        if (cVar2 == null) {
            return null;
        }
        d dVar = cVar2.d;
        if (i2 == 0) {
            oVar = dVar.d;
        } else {
            oVar = dVar.f11321e;
        }
        int c3 = C0928e.c(cVar2.f11286e);
        if (c3 == 1 || c3 == 2) {
            return oVar.h;
        }
        if (c3 == 3 || c3 == 4) {
            return oVar.f11607i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i2, g gVar) {
        fVar.f11589l.add(fVar2);
        fVar.f11589l.add(this.f11605e);
        fVar.h = i2;
        fVar.f11586i = gVar;
        fVar2.f11588k.add(fVar);
        gVar.f11588k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i2, int i5) {
        int i6;
        if (i5 == 0) {
            d dVar = this.f11603b;
            int i7 = dVar.f11348v;
            i6 = Math.max(dVar.f11347u, i2);
            if (i7 > 0) {
                i6 = Math.min(i7, i2);
            }
            if (i6 == i2) {
                return i2;
            }
        } else {
            d dVar2 = this.f11603b;
            int i8 = dVar2.f11351y;
            int max = Math.max(dVar2.f11350x, i2);
            if (i8 > 0) {
                max = Math.min(i8, i2);
            }
            if (i6 == i2) {
                return i2;
            }
        }
        return i6;
    }

    public long j() {
        g gVar = this.f11605e;
        if (gVar.f11587j) {
            return (long) gVar.g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r9.f11602a == 3) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(s.c r12, s.c r13, int r14) {
        /*
            r11 = this;
            t.f r0 = h(r12)
            t.f r1 = h(r13)
            boolean r2 = r0.f11587j
            if (r2 == 0) goto L_0x00e9
            boolean r2 = r1.f11587j
            if (r2 != 0) goto L_0x0012
            goto L_0x00e9
        L_0x0012:
            int r2 = r0.g
            int r12 = r12.e()
            int r12 = r12 + r2
            int r2 = r1.g
            int r13 = r13.e()
            int r2 = r2 - r13
            int r13 = r2 - r12
            t.g r3 = r11.f11605e
            boolean r4 = r3.f11587j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b0
            int r4 = r11.d
            r6 = 3
            if (r4 != r6) goto L_0x00b0
            int r4 = r11.f11602a
            if (r4 == 0) goto L_0x00a9
            r7 = 1
            if (r4 == r7) goto L_0x009b
            r8 = 2
            if (r4 == r8) goto L_0x0073
            if (r4 == r6) goto L_0x003d
            goto L_0x00b0
        L_0x003d:
            s.d r4 = r11.f11603b
            t.k r8 = r4.d
            int r9 = r8.d
            if (r9 != r6) goto L_0x0054
            int r9 = r8.f11602a
            if (r9 != r6) goto L_0x0054
            t.m r9 = r4.f11321e
            int r10 = r9.d
            if (r10 != r6) goto L_0x0054
            int r9 = r9.f11602a
            if (r9 != r6) goto L_0x0054
            goto L_0x00b0
        L_0x0054:
            if (r14 != 0) goto L_0x0058
            t.m r8 = r4.f11321e
        L_0x0058:
            t.g r6 = r8.f11605e
            boolean r8 = r6.f11587j
            if (r8 == 0) goto L_0x00b0
            float r4 = r4.f11310W
            if (r14 != r7) goto L_0x0069
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x006f
        L_0x0069:
            int r6 = r6.g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x006f:
            r3.d(r4)
            goto L_0x00b0
        L_0x0073:
            s.d r4 = r11.f11603b
            s.d r6 = r4.f11307T
            if (r6 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x007e
            t.k r6 = r6.d
            goto L_0x0080
        L_0x007e:
            t.m r6 = r6.f11321e
        L_0x0080:
            t.g r6 = r6.f11605e
            boolean r7 = r6.f11587j
            if (r7 == 0) goto L_0x00b0
            if (r14 != 0) goto L_0x008b
            float r4 = r4.f11349w
            goto L_0x008d
        L_0x008b:
            float r4 = r4.f11352z
        L_0x008d:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r11.g(r4, r14)
            r3.d(r4)
            goto L_0x00b0
        L_0x009b:
            int r4 = r3.f11590m
            int r4 = r11.g(r4, r14)
            int r4 = java.lang.Math.min(r4, r13)
            r3.d(r4)
            goto L_0x00b0
        L_0x00a9:
            int r4 = r11.g(r13, r14)
            r3.d(r4)
        L_0x00b0:
            boolean r4 = r3.f11587j
            if (r4 != 0) goto L_0x00b5
            return
        L_0x00b5:
            int r4 = r3.g
            t.f r6 = r11.f11607i
            t.f r7 = r11.h
            if (r4 != r13) goto L_0x00c4
            r7.d(r12)
            r6.d(r2)
            return
        L_0x00c4:
            if (r14 != 0) goto L_0x00cb
            s.d r13 = r11.f11603b
            float r13 = r13.f11320d0
            goto L_0x00cf
        L_0x00cb:
            s.d r13 = r11.f11603b
            float r13 = r13.f11322e0
        L_0x00cf:
            if (r0 != r1) goto L_0x00d6
            int r12 = r0.g
            int r2 = r1.g
            r13 = r5
        L_0x00d6:
            int r2 = r2 - r12
            int r2 = r2 - r4
            float r12 = (float) r12
            float r12 = r12 + r5
            float r14 = (float) r2
            float r14 = r14 * r13
            float r14 = r14 + r12
            int r12 = (int) r14
            r7.d(r12)
            int r12 = r7.g
            int r13 = r3.g
            int r12 = r12 + r13
            r6.d(r12)
        L_0x00e9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.o.l(s.c, s.c, int):void");
    }
}
