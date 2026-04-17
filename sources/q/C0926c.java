package q;

import J.b;
import c1.i;
import java.util.Arrays;
import m0.a0;
import s.c;

/* renamed from: q.c  reason: case insensitive filesystem */
public final class C0926c {

    /* renamed from: q  reason: collision with root package name */
    public static boolean f11046q = false;

    /* renamed from: a  reason: collision with root package name */
    public int f11047a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public boolean f11048b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f11049c = 0;
    public final C0927d d;

    /* renamed from: e  reason: collision with root package name */
    public int f11050e = 32;

    /* renamed from: f  reason: collision with root package name */
    public int f11051f = 32;
    public C0925b[] g = new C0925b[32];
    public boolean h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean[] f11052i = new boolean[32];

    /* renamed from: j  reason: collision with root package name */
    public int f11053j = 1;

    /* renamed from: k  reason: collision with root package name */
    public int f11054k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f11055l = 32;

    /* renamed from: m  reason: collision with root package name */
    public final i f11056m;

    /* renamed from: n  reason: collision with root package name */
    public C0929f[] f11057n = new C0929f[1000];

    /* renamed from: o  reason: collision with root package name */
    public int f11058o = 0;

    /* renamed from: p  reason: collision with root package name */
    public C0925b f11059p;

    /* JADX WARNING: type inference failed for: r2v2, types: [q.b, q.d] */
    public C0926c() {
        s();
        i iVar = new i(13);
        iVar.f5605b = new b();
        iVar.f5606c = new b();
        iVar.d = new C0929f[32];
        this.f11056m = iVar;
        ? bVar = new C0925b(iVar);
        bVar.f11060f = new C0929f[128];
        bVar.g = new C0929f[128];
        bVar.h = 0;
        bVar.f11061i = new a0((C0927d) bVar);
        this.d = bVar;
        this.f11059p = new C0925b(iVar);
    }

    public static int n(Object obj) {
        C0929f fVar = ((c) obj).f11288i;
        if (fVar != null) {
            return (int) (fVar.f11066e + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: q.f} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q.C0929f a(int r6) {
        /*
            r5 = this;
            c1.i r0 = r5.f11056m
            java.lang.Object r0 = r0.f5606c
            J.b r0 = (J.b) r0
            int r1 = r0.f1290b
            r2 = 0
            if (r1 <= 0) goto L_0x0016
            int r1 = r1 + -1
            java.lang.Object[] r3 = r0.f1289a
            r4 = r3[r1]
            r3[r1] = r2
            r0.f1290b = r1
            r2 = r4
        L_0x0016:
            q.f r2 = (q.C0929f) r2
            if (r2 != 0) goto L_0x0022
            q.f r2 = new q.f
            r2.<init>(r6)
            r2.f11073u = r6
            goto L_0x0027
        L_0x0022:
            r2.j()
            r2.f11073u = r6
        L_0x0027:
            int r6 = r5.f11058o
            int r0 = r5.f11047a
            if (r6 < r0) goto L_0x003b
            int r0 = r0 * 2
            r5.f11047a = r0
            q.f[] r6 = r5.f11057n
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            q.f[] r6 = (q.C0929f[]) r6
            r5.f11057n = r6
        L_0x003b:
            q.f[] r6 = r5.f11057n
            int r0 = r5.f11058o
            int r1 = r0 + 1
            r5.f11058o = r1
            r6[r0] = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0926c.a(int):q.f");
    }

    public final void b(C0929f fVar, C0929f fVar2, int i2, float f6, C0929f fVar3, C0929f fVar4, int i5, int i6) {
        C0925b l6 = l();
        if (fVar2 == fVar3) {
            l6.d.g(fVar, 1.0f);
            l6.d.g(fVar4, 1.0f);
            l6.d.g(fVar2, -2.0f);
        } else if (f6 == 0.5f) {
            l6.d.g(fVar, 1.0f);
            l6.d.g(fVar2, -1.0f);
            l6.d.g(fVar3, -1.0f);
            l6.d.g(fVar4, 1.0f);
            if (i2 > 0 || i5 > 0) {
                l6.f11043b = (float) ((-i2) + i5);
            }
        } else if (f6 <= 0.0f) {
            l6.d.g(fVar, -1.0f);
            l6.d.g(fVar2, 1.0f);
            l6.f11043b = (float) i2;
        } else if (f6 >= 1.0f) {
            l6.d.g(fVar4, -1.0f);
            l6.d.g(fVar3, 1.0f);
            l6.f11043b = (float) (-i5);
        } else {
            float f7 = 1.0f - f6;
            l6.d.g(fVar, f7 * 1.0f);
            l6.d.g(fVar2, f7 * -1.0f);
            l6.d.g(fVar3, -1.0f * f6);
            l6.d.g(fVar4, 1.0f * f6);
            if (i2 > 0 || i5 > 0) {
                l6.f11043b = (((float) i5) * f6) + (((float) (-i2)) * f7);
            }
        }
        if (i6 != 8) {
            l6.a(this, i6);
        }
        c(l6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        if (r4.f11072t <= 1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00dd, code lost:
        if (r4.f11072t <= 1) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00f2, code lost:
        if (r4.f11072t <= 1) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00ff, code lost:
        if (r4.f11072t <= 1) goto L_0x0108;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:143:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(q.C0925b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r0.f11054k
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f11055l
            if (r2 >= r4) goto L_0x0013
            int r2 = r0.f11053j
            int r2 = r2 + r3
            int r4 = r0.f11051f
            if (r2 < r4) goto L_0x0016
        L_0x0013:
            r16.o()
        L_0x0016:
            boolean r2 = r1.f11045e
            if (r2 != 0) goto L_0x01ba
            q.b[] r2 = r0.g
            int r2 = r2.length
            r5 = -1
            if (r2 != 0) goto L_0x0021
            goto L_0x007d
        L_0x0021:
            r2 = 0
        L_0x0022:
            if (r2 != 0) goto L_0x006d
            q.a r6 = r1.d
            int r6 = r6.d()
            r7 = 0
        L_0x002b:
            java.util.ArrayList r8 = r1.f11044c
            if (r7 >= r6) goto L_0x0044
            q.a r9 = r1.d
            q.f r9 = r9.e(r7)
            int r10 = r9.f11065c
            if (r10 != r5) goto L_0x003e
            boolean r10 = r9.f11067f
            if (r10 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r8.add(r9)
        L_0x0041:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x0044:
            int r6 = r8.size()
            if (r6 <= 0) goto L_0x006b
            r7 = 0
        L_0x004b:
            if (r7 >= r6) goto L_0x0067
            java.lang.Object r9 = r8.get(r7)
            q.f r9 = (q.C0929f) r9
            boolean r10 = r9.f11067f
            if (r10 == 0) goto L_0x005b
            r1.h(r0, r9, r3)
            goto L_0x0064
        L_0x005b:
            q.b[] r10 = r0.g
            int r9 = r9.f11065c
            r9 = r10[r9]
            r1.i(r0, r9, r3)
        L_0x0064:
            int r7 = r7 + 1
            goto L_0x004b
        L_0x0067:
            r8.clear()
            goto L_0x0022
        L_0x006b:
            r2 = r3
            goto L_0x0022
        L_0x006d:
            q.f r2 = r1.f11042a
            if (r2 == 0) goto L_0x007d
            q.a r2 = r1.d
            int r2 = r2.d()
            if (r2 != 0) goto L_0x007d
            r1.f11045e = r3
            r0.f11048b = r3
        L_0x007d:
            boolean r2 = r17.e()
            if (r2 == 0) goto L_0x0084
            return
        L_0x0084:
            float r2 = r1.f11043b
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ac
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f11043b = r2
            q.a r2 = r1.d
            int r7 = r2.h
            r8 = 0
        L_0x0095:
            r9 = -1
            if (r7 == r9) goto L_0x00ac
            int r9 = r2.f11035a
            if (r8 >= r9) goto L_0x00ac
            float[] r9 = r2.g
            r10 = r9[r7]
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r10 = r10 * r11
            r9[r7] = r10
            int[] r9 = r2.f11039f
            r7 = r9[r7]
            int r8 = r8 + 1
            goto L_0x0095
        L_0x00ac:
            q.a r2 = r1.d
            int r2 = r2.d()
            r7 = 0
            r11 = r6
            r13 = r11
            r9 = r7
            r10 = r9
            r8 = 0
            r12 = 0
            r14 = 0
        L_0x00ba:
            if (r8 >= r2) goto L_0x010e
            q.a r15 = r1.d
            float r15 = r15.f(r8)
            q.a r4 = r1.d
            q.f r4 = r4.e(r8)
            int r5 = r4.f11073u
            if (r5 != r3) goto L_0x00e8
            if (r9 != 0) goto L_0x00d7
            int r5 = r4.f11072t
            if (r5 > r3) goto L_0x00d3
            goto L_0x00e6
        L_0x00d3:
            r12 = 0
        L_0x00d4:
            r9 = r4
            r11 = r15
            goto L_0x010a
        L_0x00d7:
            int r5 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e0
            int r5 = r4.f11072t
            if (r5 > r3) goto L_0x00d3
            goto L_0x00e6
        L_0x00e0:
            if (r12 != 0) goto L_0x010a
            int r5 = r4.f11072t
            if (r5 > r3) goto L_0x010a
        L_0x00e6:
            r12 = r3
            goto L_0x00d4
        L_0x00e8:
            if (r9 != 0) goto L_0x010a
            int r5 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x010a
            if (r10 != 0) goto L_0x00f9
            int r5 = r4.f11072t
            if (r5 > r3) goto L_0x00f5
            goto L_0x0108
        L_0x00f5:
            r14 = 0
        L_0x00f6:
            r10 = r4
            r13 = r15
            goto L_0x010a
        L_0x00f9:
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 <= 0) goto L_0x0102
            int r5 = r4.f11072t
            if (r5 > r3) goto L_0x00f5
            goto L_0x0108
        L_0x0102:
            if (r14 != 0) goto L_0x010a
            int r5 = r4.f11072t
            if (r5 > r3) goto L_0x010a
        L_0x0108:
            r14 = r3
            goto L_0x00f6
        L_0x010a:
            int r8 = r8 + 1
            r5 = -1
            goto L_0x00ba
        L_0x010e:
            if (r9 == 0) goto L_0x0111
            goto L_0x0112
        L_0x0111:
            r9 = r10
        L_0x0112:
            if (r9 != 0) goto L_0x0116
            r2 = r3
            goto L_0x011a
        L_0x0116:
            r1.g(r9)
            r2 = 0
        L_0x011a:
            q.a r4 = r1.d
            int r4 = r4.d()
            if (r4 != 0) goto L_0x0124
            r1.f11045e = r3
        L_0x0124:
            if (r2 == 0) goto L_0x01a9
            int r2 = r0.f11053j
            int r2 = r2 + r3
            int r4 = r0.f11051f
            if (r2 < r4) goto L_0x0130
            r16.o()
        L_0x0130:
            r2 = 3
            q.f r2 = r0.a(r2)
            int r4 = r0.f11049c
            int r4 = r4 + r3
            r0.f11049c = r4
            int r5 = r0.f11053j
            int r5 = r5 + r3
            r0.f11053j = r5
            r2.f11064b = r4
            c1.i r5 = r0.f11056m
            java.lang.Object r8 = r5.d
            q.f[] r8 = (q.C0929f[]) r8
            r8[r4] = r2
            r1.f11042a = r2
            int r4 = r0.f11054k
            r16.h(r17)
            int r8 = r0.f11054k
            int r4 = r4 + r3
            if (r8 != r4) goto L_0x01a9
            q.b r4 = r0.f11059p
            r4.f11042a = r7
            q.a r8 = r4.d
            r8.b()
            r8 = 0
        L_0x015f:
            q.a r9 = r1.d
            int r9 = r9.d()
            if (r8 >= r9) goto L_0x017b
            q.a r9 = r1.d
            q.f r9 = r9.e(r8)
            q.a r10 = r1.d
            float r10 = r10.f(r8)
            q.a r11 = r4.d
            r11.a(r9, r10, r3)
            int r8 = r8 + 1
            goto L_0x015f
        L_0x017b:
            q.b r4 = r0.f11059p
            r0.r(r4)
            int r4 = r2.f11065c
            r8 = -1
            if (r4 != r8) goto L_0x01a7
            q.f r4 = r1.f11042a
            if (r4 != r2) goto L_0x0192
            q.f r2 = r1.f(r7, r2)
            if (r2 == 0) goto L_0x0192
            r1.g(r2)
        L_0x0192:
            boolean r2 = r1.f11045e
            if (r2 != 0) goto L_0x019b
            q.f r2 = r1.f11042a
            r2.m(r0, r1)
        L_0x019b:
            java.lang.Object r2 = r5.f5605b
            J.b r2 = (J.b) r2
            r2.b(r1)
            int r2 = r0.f11054k
            int r2 = r2 - r3
            r0.f11054k = r2
        L_0x01a7:
            r4 = r3
            goto L_0x01aa
        L_0x01a9:
            r4 = 0
        L_0x01aa:
            q.f r2 = r1.f11042a
            if (r2 == 0) goto L_0x01b9
            int r2 = r2.f11073u
            if (r2 == r3) goto L_0x01bb
            float r2 = r1.f11043b
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01b9
            goto L_0x01bb
        L_0x01b9:
            return
        L_0x01ba:
            r4 = 0
        L_0x01bb:
            if (r4 != 0) goto L_0x01c0
            r16.h(r17)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0926c.c(q.b):void");
    }

    public final void d(C0929f fVar, int i2) {
        int i5 = fVar.f11065c;
        if (i5 == -1) {
            fVar.k(this, (float) i2);
            for (int i6 = 0; i6 < this.f11049c + 1; i6++) {
                C0929f fVar2 = ((C0929f[]) this.f11056m.d)[i6];
            }
        } else if (i5 != -1) {
            C0925b bVar = this.g[i5];
            if (bVar.f11045e) {
                bVar.f11043b = (float) i2;
            } else if (bVar.d.d() == 0) {
                bVar.f11045e = true;
                bVar.f11043b = (float) i2;
            } else {
                C0925b l6 = l();
                if (i2 < 0) {
                    l6.f11043b = (float) (i2 * -1);
                    l6.d.g(fVar, 1.0f);
                } else {
                    l6.f11043b = (float) i2;
                    l6.d.g(fVar, -1.0f);
                }
                c(l6);
            }
        } else {
            C0925b l7 = l();
            l7.f11042a = fVar;
            float f6 = (float) i2;
            fVar.f11066e = f6;
            l7.f11043b = f6;
            l7.f11045e = true;
            c(l7);
        }
    }

    public final void e(C0929f fVar, C0929f fVar2, int i2, int i5) {
        if (i5 == 8 && fVar2.f11067f && fVar.f11065c == -1) {
            fVar.k(this, fVar2.f11066e + ((float) i2));
            return;
        }
        C0925b l6 = l();
        boolean z3 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z3 = true;
            }
            l6.f11043b = (float) i2;
        }
        if (!z3) {
            l6.d.g(fVar, -1.0f);
            l6.d.g(fVar2, 1.0f);
        } else {
            l6.d.g(fVar, 1.0f);
            l6.d.g(fVar2, -1.0f);
        }
        if (i5 != 8) {
            l6.a(this, i5);
        }
        c(l6);
    }

    public final void f(C0929f fVar, C0929f fVar2, int i2, int i5) {
        C0925b l6 = l();
        C0929f m6 = m();
        m6.d = 0;
        l6.b(fVar, fVar2, m6, i2);
        if (i5 != 8) {
            l6.d.g(j(i5), (float) ((int) (l6.d.c(m6) * -1.0f)));
        }
        c(l6);
    }

    public final void g(C0929f fVar, C0929f fVar2, int i2, int i5) {
        C0925b l6 = l();
        C0929f m6 = m();
        m6.d = 0;
        l6.c(fVar, fVar2, m6, i2);
        if (i5 != 8) {
            l6.d.g(j(i5), (float) ((int) (l6.d.c(m6) * -1.0f)));
        }
        c(l6);
    }

    public final void h(C0925b bVar) {
        int i2;
        if (bVar.f11045e) {
            bVar.f11042a.k(this, bVar.f11043b);
        } else {
            C0925b[] bVarArr = this.g;
            int i5 = this.f11054k;
            bVarArr[i5] = bVar;
            C0929f fVar = bVar.f11042a;
            fVar.f11065c = i5;
            this.f11054k = i5 + 1;
            fVar.m(this, bVar);
        }
        if (this.f11048b) {
            int i6 = 0;
            while (i6 < this.f11054k) {
                if (this.g[i6] == null) {
                    System.out.println("WTF");
                }
                C0925b bVar2 = this.g[i6];
                if (bVar2 != null && bVar2.f11045e) {
                    bVar2.f11042a.k(this, bVar2.f11043b);
                    ((b) this.f11056m.f5605b).b(bVar2);
                    this.g[i6] = null;
                    int i7 = i6 + 1;
                    int i8 = i7;
                    while (true) {
                        i2 = this.f11054k;
                        if (i7 >= i2) {
                            break;
                        }
                        C0925b[] bVarArr2 = this.g;
                        int i9 = i7 - 1;
                        C0925b bVar3 = bVarArr2[i7];
                        bVarArr2[i9] = bVar3;
                        C0929f fVar2 = bVar3.f11042a;
                        if (fVar2.f11065c == i7) {
                            fVar2.f11065c = i9;
                        }
                        i8 = i7;
                        i7++;
                    }
                    if (i8 < i2) {
                        this.g[i8] = null;
                    }
                    this.f11054k = i2 - 1;
                    i6--;
                }
                i6++;
            }
            this.f11048b = false;
        }
    }

    public final void i() {
        for (int i2 = 0; i2 < this.f11054k; i2++) {
            C0925b bVar = this.g[i2];
            bVar.f11042a.f11066e = bVar.f11043b;
        }
    }

    public final C0929f j(int i2) {
        if (this.f11053j + 1 >= this.f11051f) {
            o();
        }
        C0929f a6 = a(4);
        int i5 = this.f11049c + 1;
        this.f11049c = i5;
        this.f11053j++;
        a6.f11064b = i5;
        a6.d = i2;
        ((C0929f[]) this.f11056m.d)[i5] = a6;
        C0927d dVar = this.d;
        dVar.f11061i.f9925b = a6;
        float[] fArr = a6.f11069q;
        Arrays.fill(fArr, 0.0f);
        fArr[a6.d] = 1.0f;
        dVar.j(a6);
        return a6;
    }

    public final C0929f k(Object obj) {
        C0929f fVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f11053j + 1 >= this.f11051f) {
            o();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            fVar = cVar.f11288i;
            if (fVar == null) {
                cVar.k();
                fVar = cVar.f11288i;
            }
            int i2 = fVar.f11064b;
            i iVar = this.f11056m;
            if (i2 == -1 || i2 > this.f11049c || ((C0929f[]) iVar.d)[i2] == null) {
                if (i2 != -1) {
                    fVar.j();
                }
                int i5 = this.f11049c + 1;
                this.f11049c = i5;
                this.f11053j++;
                fVar.f11064b = i5;
                fVar.f11073u = 1;
                ((C0929f[]) iVar.d)[i5] = fVar;
            }
        }
        return fVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: q.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q.C0925b l() {
        /*
            r6 = this;
            c1.i r0 = r6.f11056m
            java.lang.Object r1 = r0.f5605b
            J.b r1 = (J.b) r1
            int r2 = r1.f1290b
            r3 = 0
            if (r2 <= 0) goto L_0x0016
            int r2 = r2 + -1
            java.lang.Object[] r4 = r1.f1289a
            r5 = r4[r2]
            r4[r2] = r3
            r1.f1290b = r2
            goto L_0x0017
        L_0x0016:
            r5 = r3
        L_0x0017:
            q.b r5 = (q.C0925b) r5
            if (r5 != 0) goto L_0x0021
            q.b r5 = new q.b
            r5.<init>(r0)
            goto L_0x002e
        L_0x0021:
            r5.f11042a = r3
            q.a r0 = r5.d
            r0.b()
            r0 = 0
            r5.f11043b = r0
            r0 = 0
            r5.f11045e = r0
        L_0x002e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0926c.l():q.b");
    }

    public final C0929f m() {
        if (this.f11053j + 1 >= this.f11051f) {
            o();
        }
        C0929f a6 = a(3);
        int i2 = this.f11049c + 1;
        this.f11049c = i2;
        this.f11053j++;
        a6.f11064b = i2;
        ((C0929f[]) this.f11056m.d)[i2] = a6;
        return a6;
    }

    public final void o() {
        int i2 = this.f11050e * 2;
        this.f11050e = i2;
        this.g = (C0925b[]) Arrays.copyOf(this.g, i2);
        i iVar = this.f11056m;
        iVar.d = (C0929f[]) Arrays.copyOf((C0929f[]) iVar.d, this.f11050e);
        int i5 = this.f11050e;
        this.f11052i = new boolean[i5];
        this.f11051f = i5;
        this.f11055l = i5;
    }

    public final void p() {
        C0927d dVar = this.d;
        if (dVar.e()) {
            i();
        } else if (this.h) {
            for (int i2 = 0; i2 < this.f11054k; i2++) {
                if (!this.g[i2].f11045e) {
                    q(dVar);
                    return;
                }
            }
            i();
        } else {
            q(dVar);
        }
    }

    public final void q(C0927d dVar) {
        int i2 = 0;
        while (true) {
            if (i2 >= this.f11054k) {
                break;
            }
            C0925b bVar = this.g[i2];
            int i5 = 1;
            if (bVar.f11042a.f11073u != 1) {
                float f6 = 0.0f;
                if (bVar.f11043b < 0.0f) {
                    boolean z3 = false;
                    int i6 = 0;
                    while (!z3) {
                        i6 += i5;
                        float f7 = Float.MAX_VALUE;
                        int i7 = -1;
                        int i8 = -1;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < this.f11054k) {
                            C0925b bVar2 = this.g[i9];
                            if (bVar2.f11042a.f11073u != i5 && !bVar2.f11045e && bVar2.f11043b < f6) {
                                int d6 = bVar2.d.d();
                                int i11 = 0;
                                while (i11 < d6) {
                                    C0929f e6 = bVar2.d.e(i11);
                                    float c3 = bVar2.d.c(e6);
                                    if (c3 > f6) {
                                        for (int i12 = 0; i12 < 9; i12++) {
                                            float f8 = e6.f11068p[i12] / c3;
                                            if ((f8 < f7 && i12 == i10) || i12 > i10) {
                                                i10 = i12;
                                                i8 = e6.f11064b;
                                                i7 = i9;
                                                f7 = f8;
                                            }
                                        }
                                    }
                                    i11++;
                                    f6 = 0.0f;
                                }
                            }
                            i9++;
                            f6 = 0.0f;
                            i5 = 1;
                        }
                        if (i7 != -1) {
                            C0925b bVar3 = this.g[i7];
                            bVar3.f11042a.f11065c = -1;
                            bVar3.g(((C0929f[]) this.f11056m.d)[i8]);
                            C0929f fVar = bVar3.f11042a;
                            fVar.f11065c = i7;
                            fVar.m(this, bVar3);
                        } else {
                            z3 = true;
                        }
                        if (i6 > this.f11053j / 2) {
                            z3 = true;
                        }
                        f6 = 0.0f;
                        i5 = 1;
                    }
                }
            }
            i2++;
        }
        r(dVar);
        i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0090 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(q.C0925b r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = 0
            r3 = r2
        L_0x0006:
            int r4 = r0.f11053j
            if (r3 >= r4) goto L_0x0011
            boolean[] r4 = r0.f11052i
            r4[r3] = r2
            int r3 = r3 + 1
            goto L_0x0006
        L_0x0011:
            r3 = r2
            r4 = r3
        L_0x0013:
            if (r3 != 0) goto L_0x00ae
            r5 = 1
            int r4 = r4 + r5
            int r6 = r0.f11053j
            int r6 = r6 * 2
            if (r4 < r6) goto L_0x001e
            return
        L_0x001e:
            q.f r6 = r1.f11042a
            if (r6 == 0) goto L_0x0028
            boolean[] r7 = r0.f11052i
            int r6 = r6.f11064b
            r7[r6] = r5
        L_0x0028:
            boolean[] r6 = r0.f11052i
            q.f r6 = r1.d(r6)
            if (r6 == 0) goto L_0x003b
            boolean[] r7 = r0.f11052i
            int r8 = r6.f11064b
            boolean r9 = r7[r8]
            if (r9 == 0) goto L_0x0039
            return
        L_0x0039:
            r7[r8] = r5
        L_0x003b:
            if (r6 == 0) goto L_0x00aa
            r7 = -1
            r8 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r2
            r10 = r7
        L_0x0043:
            int r11 = r0.f11054k
            if (r9 >= r11) goto L_0x0095
            q.b[] r11 = r0.g
            r11 = r11[r9]
            q.f r12 = r11.f11042a
            int r12 = r12.f11073u
            if (r12 != r5) goto L_0x0052
            goto L_0x0090
        L_0x0052:
            boolean r12 = r11.f11045e
            if (r12 == 0) goto L_0x0057
            goto L_0x0090
        L_0x0057:
            q.a r12 = r11.d
            int r13 = r12.h
            r15 = -1
            if (r13 != r15) goto L_0x0060
        L_0x005e:
            r14 = 0
            goto L_0x0079
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r13 == r15) goto L_0x005e
            int r5 = r12.f11035a
            if (r2 >= r5) goto L_0x005e
            int[] r5 = r12.f11038e
            r5 = r5[r13]
            int r14 = r6.f11064b
            if (r5 != r14) goto L_0x0071
            r14 = 1
            goto L_0x0079
        L_0x0071:
            int[] r5 = r12.f11039f
            r13 = r5[r13]
            int r2 = r2 + 1
            r5 = 1
            goto L_0x0061
        L_0x0079:
            if (r14 == 0) goto L_0x0090
            q.a r2 = r11.d
            float r2 = r2.c(r6)
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x0090
            float r5 = r11.f11043b
            float r5 = -r5
            float r5 = r5 / r2
            int r2 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0090
            r8 = r5
            r10 = r9
        L_0x0090:
            int r9 = r9 + 1
            r2 = 0
            r5 = 1
            goto L_0x0043
        L_0x0095:
            if (r10 <= r7) goto L_0x00ab
            q.b[] r2 = r0.g
            r2 = r2[r10]
            q.f r5 = r2.f11042a
            r5.f11065c = r7
            r2.g(r6)
            q.f r5 = r2.f11042a
            r5.f11065c = r10
            r5.m(r0, r2)
            goto L_0x00ab
        L_0x00aa:
            r3 = 1
        L_0x00ab:
            r2 = 0
            goto L_0x0013
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0926c.r(q.b):void");
    }

    public final void s() {
        for (int i2 = 0; i2 < this.f11054k; i2++) {
            C0925b bVar = this.g[i2];
            if (bVar != null) {
                ((b) this.f11056m.f5605b).b(bVar);
            }
            this.g[i2] = null;
        }
    }

    public final void t() {
        i iVar;
        int i2 = 0;
        while (true) {
            iVar = this.f11056m;
            C0929f[] fVarArr = (C0929f[]) iVar.d;
            if (i2 >= fVarArr.length) {
                break;
            }
            C0929f fVar = fVarArr[i2];
            if (fVar != null) {
                fVar.j();
            }
            i2++;
        }
        b bVar = (b) iVar.f5606c;
        C0929f[] fVarArr2 = this.f11057n;
        int i5 = this.f11058o;
        bVar.getClass();
        if (i5 > fVarArr2.length) {
            i5 = fVarArr2.length;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            C0929f fVar2 = fVarArr2[i6];
            int i7 = bVar.f1290b;
            Object[] objArr = bVar.f1289a;
            if (i7 < objArr.length) {
                objArr[i7] = fVar2;
                bVar.f1290b = i7 + 1;
            }
        }
        this.f11058o = 0;
        Arrays.fill((C0929f[]) iVar.d, (Object) null);
        this.f11049c = 0;
        C0927d dVar = this.d;
        dVar.h = 0;
        dVar.f11043b = 0.0f;
        this.f11053j = 1;
        for (int i8 = 0; i8 < this.f11054k; i8++) {
            C0925b bVar2 = this.g[i8];
        }
        s();
        this.f11054k = 0;
        this.f11059p = new C0925b(iVar);
    }
}
