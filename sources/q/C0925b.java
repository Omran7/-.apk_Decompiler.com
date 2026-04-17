package q;

import c1.i;
import java.util.ArrayList;

/* renamed from: q.b  reason: case insensitive filesystem */
public class C0925b {

    /* renamed from: a  reason: collision with root package name */
    public C0929f f11042a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f11043b = 0.0f;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f11044c = new ArrayList();
    public final C0924a d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11045e = false;

    public C0925b(i iVar) {
        this.d = new C0924a(this, iVar);
    }

    public final void a(C0926c cVar, int i2) {
        this.d.g(cVar.j(i2), 1.0f);
        this.d.g(cVar.j(i2), -1.0f);
    }

    public final void b(C0929f fVar, C0929f fVar2, C0929f fVar3, int i2) {
        boolean z3 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z3 = true;
            }
            this.f11043b = (float) i2;
        }
        if (!z3) {
            this.d.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, 1.0f);
            return;
        }
        this.d.g(fVar, 1.0f);
        this.d.g(fVar2, -1.0f);
        this.d.g(fVar3, -1.0f);
    }

    public final void c(C0929f fVar, C0929f fVar2, C0929f fVar3, int i2) {
        boolean z3 = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z3 = true;
            }
            this.f11043b = (float) i2;
        }
        if (!z3) {
            this.d.g(fVar, -1.0f);
            this.d.g(fVar2, 1.0f);
            this.d.g(fVar3, -1.0f);
            return;
        }
        this.d.g(fVar, 1.0f);
        this.d.g(fVar2, -1.0f);
        this.d.g(fVar3, 1.0f);
    }

    public C0929f d(boolean[] zArr) {
        return f(zArr, (C0929f) null);
    }

    public boolean e() {
        if (this.f11042a == null && this.f11043b == 0.0f && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final C0929f f(boolean[] zArr, C0929f fVar) {
        int i2;
        int d6 = this.d.d();
        C0929f fVar2 = null;
        float f6 = 0.0f;
        for (int i5 = 0; i5 < d6; i5++) {
            float f7 = this.d.f(i5);
            if (f7 < 0.0f) {
                C0929f e6 = this.d.e(i5);
                if ((zArr == null || !zArr[e6.f11064b]) && e6 != fVar && (((i2 = e6.f11073u) == 3 || i2 == 4) && f7 < f6)) {
                    f6 = f7;
                    fVar2 = e6;
                }
            }
        }
        return fVar2;
    }

    public final void g(C0929f fVar) {
        C0929f fVar2 = this.f11042a;
        if (fVar2 != null) {
            this.d.g(fVar2, -1.0f);
            this.f11042a.f11065c = -1;
            this.f11042a = null;
        }
        float h = this.d.h(fVar, true) * -1.0f;
        this.f11042a = fVar;
        if (h != 1.0f) {
            this.f11043b /= h;
            C0924a aVar = this.d;
            int i2 = aVar.h;
            int i5 = 0;
            while (i2 != -1 && i5 < aVar.f11035a) {
                float[] fArr = aVar.g;
                fArr[i2] = fArr[i2] / h;
                i2 = aVar.f11039f[i2];
                i5++;
            }
        }
    }

    public final void h(C0926c cVar, C0929f fVar, boolean z3) {
        if (fVar != null && fVar.f11067f) {
            float c3 = this.d.c(fVar);
            this.f11043b = (fVar.f11066e * c3) + this.f11043b;
            this.d.h(fVar, z3);
            if (z3) {
                fVar.e(this);
            }
            if (this.d.d() == 0) {
                this.f11045e = true;
                cVar.f11048b = true;
            }
        }
    }

    public void i(C0926c cVar, C0925b bVar, boolean z3) {
        C0924a aVar = this.d;
        aVar.getClass();
        float c3 = aVar.c(bVar.f11042a);
        aVar.h(bVar.f11042a, z3);
        C0924a aVar2 = bVar.d;
        int d6 = aVar2.d();
        for (int i2 = 0; i2 < d6; i2++) {
            C0929f e6 = aVar2.e(i2);
            aVar.a(e6, aVar2.c(e6) * c3, z3);
        }
        this.f11043b = (bVar.f11043b * c3) + this.f11043b;
        if (z3) {
            bVar.f11042a.e(this);
        }
        if (this.f11042a != null && this.d.d() == 0) {
            this.f11045e = true;
            cVar.f11048b = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004b, code lost:
        r7 = r10.d.f(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            q.f r0 = r10.f11042a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            q.f r1 = r10.f11042a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = o3.d.f(r0, r1)
            float r1 = r10.f11043b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0039
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f11043b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            q.a r5 = r10.d
            int r5 = r5.d()
        L_0x0040:
            if (r4 >= r5) goto L_0x00a0
            q.a r6 = r10.d
            q.f r6 = r6.e(r4)
            if (r6 != 0) goto L_0x004b
            goto L_0x009d
        L_0x004b:
            q.a r7 = r10.d
            float r7 = r7.f(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0056
            goto L_0x009d
        L_0x0056:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x006a
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x007a
            java.lang.String r1 = "- "
            java.lang.String r0 = o3.d.f(r0, r1)
        L_0x0068:
            float r7 = r7 * r9
            goto L_0x007a
        L_0x006a:
            if (r8 <= 0) goto L_0x0073
            java.lang.String r1 = " + "
            java.lang.String r0 = o3.d.f(r0, r1)
            goto L_0x007a
        L_0x0073:
            java.lang.String r1 = " - "
            java.lang.String r0 = o3.d.f(r0, r1)
            goto L_0x0068
        L_0x007a:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0085
            java.lang.String r0 = o3.d.f(r0, r6)
            goto L_0x009c
        L_0x0085:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x009c:
            r1 = r3
        L_0x009d:
            int r4 = r4 + 1
            goto L_0x0040
        L_0x00a0:
            if (r1 != 0) goto L_0x00a8
            java.lang.String r1 = "0.0"
            java.lang.String r0 = o3.d.f(r0, r1)
        L_0x00a8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q.C0925b.toString():java.lang.String");
    }
}
