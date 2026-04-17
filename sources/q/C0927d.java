package q;

import H4.i;
import java.util.Arrays;
import m0.a0;

/* renamed from: q.d  reason: case insensitive filesystem */
public final class C0927d extends C0925b {

    /* renamed from: f  reason: collision with root package name */
    public C0929f[] f11060f;
    public C0929f[] g;
    public int h;

    /* renamed from: i  reason: collision with root package name */
    public a0 f11061i;

    public final C0929f d(boolean[] zArr) {
        int i2 = -1;
        for (int i5 = 0; i5 < this.h; i5++) {
            C0929f[] fVarArr = this.f11060f;
            C0929f fVar = fVarArr[i5];
            if (!zArr[fVar.f11064b]) {
                a0 a0Var = this.f11061i;
                a0Var.f9925b = fVar;
                int i6 = 8;
                if (i2 != -1) {
                    C0929f fVar2 = fVarArr[i2];
                    while (true) {
                        if (i6 < 0) {
                            break;
                        }
                        float f6 = fVar2.f11069q[i6];
                        float f7 = ((C0929f) a0Var.f9925b).f11069q[i6];
                        if (f7 == f6) {
                            i6--;
                        } else if (f7 >= f6) {
                        }
                    }
                } else {
                    while (true) {
                        if (i6 < 0) {
                            break;
                        }
                        float f8 = ((C0929f) a0Var.f9925b).f11069q[i6];
                        if (f8 > 0.0f) {
                            break;
                        } else if (f8 < 0.0f) {
                            break;
                        } else {
                            i6--;
                        }
                    }
                }
                i2 = i5;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f11060f[i2];
    }

    public final boolean e() {
        if (this.h == 0) {
            return true;
        }
        return false;
    }

    public final void i(C0926c cVar, C0925b bVar, boolean z3) {
        C0925b bVar2 = bVar;
        C0929f fVar = bVar2.f11042a;
        if (fVar != null) {
            C0924a aVar = bVar2.d;
            int d = aVar.d();
            for (int i2 = 0; i2 < d; i2++) {
                C0929f e6 = aVar.e(i2);
                float f6 = aVar.f(i2);
                a0 a0Var = this.f11061i;
                a0Var.f9925b = e6;
                boolean z4 = e6.f11063a;
                float[] fArr = fVar.f11069q;
                if (z4) {
                    boolean z5 = true;
                    for (int i5 = 0; i5 < 9; i5++) {
                        float[] fArr2 = ((C0929f) a0Var.f9925b).f11069q;
                        float f7 = (fArr[i5] * f6) + fArr2[i5];
                        fArr2[i5] = f7;
                        if (Math.abs(f7) < 1.0E-4f) {
                            ((C0929f) a0Var.f9925b).f11069q[i5] = 0.0f;
                        } else {
                            z5 = false;
                        }
                    }
                    if (z5) {
                        ((C0927d) a0Var.f9926c).k((C0929f) a0Var.f9925b);
                    }
                } else {
                    for (int i6 = 0; i6 < 9; i6++) {
                        float f8 = fArr[i6];
                        if (f8 != 0.0f) {
                            float f9 = f8 * f6;
                            if (Math.abs(f9) < 1.0E-4f) {
                                f9 = 0.0f;
                            }
                            ((C0929f) a0Var.f9925b).f11069q[i6] = f9;
                        } else {
                            ((C0929f) a0Var.f9925b).f11069q[i6] = 0.0f;
                        }
                    }
                    j(e6);
                }
                this.f11043b = (bVar2.f11043b * f6) + this.f11043b;
            }
            k(fVar);
        }
    }

    public final void j(C0929f fVar) {
        int i2;
        int i5 = this.h + 1;
        C0929f[] fVarArr = this.f11060f;
        if (i5 > fVarArr.length) {
            C0929f[] fVarArr2 = (C0929f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f11060f = fVarArr2;
            this.g = (C0929f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        C0929f[] fVarArr3 = this.f11060f;
        int i6 = this.h;
        fVarArr3[i6] = fVar;
        int i7 = i6 + 1;
        this.h = i7;
        if (i7 > 1 && fVarArr3[i6].f11064b > fVar.f11064b) {
            int i8 = 0;
            while (true) {
                i2 = this.h;
                if (i8 >= i2) {
                    break;
                }
                this.g[i8] = this.f11060f[i8];
                i8++;
            }
            Arrays.sort(this.g, 0, i2, new i(12));
            for (int i9 = 0; i9 < this.h; i9++) {
                this.f11060f[i9] = this.g[i9];
            }
        }
        fVar.f11063a = true;
        fVar.a(this);
    }

    public final void k(C0929f fVar) {
        int i2 = 0;
        while (i2 < this.h) {
            if (this.f11060f[i2] == fVar) {
                while (true) {
                    int i5 = this.h;
                    if (i2 < i5 - 1) {
                        C0929f[] fVarArr = this.f11060f;
                        int i6 = i2 + 1;
                        fVarArr[i2] = fVarArr[i6];
                        i2 = i6;
                    } else {
                        this.h = i5 - 1;
                        fVar.f11063a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.f11043b + ") : ";
        for (int i2 = 0; i2 < this.h; i2++) {
            C0929f fVar = this.f11060f[i2];
            a0 a0Var = this.f11061i;
            a0Var.f9925b = fVar;
            str = str + a0Var + " ";
        }
        return str;
    }
}
