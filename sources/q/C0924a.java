package q;

import c1.i;
import java.util.Arrays;
import o3.d;

/* renamed from: q.a  reason: case insensitive filesystem */
public final class C0924a {

    /* renamed from: a  reason: collision with root package name */
    public int f11035a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final C0925b f11036b;

    /* renamed from: c  reason: collision with root package name */
    public final i f11037c;
    public int d = 8;

    /* renamed from: e  reason: collision with root package name */
    public int[] f11038e = new int[8];

    /* renamed from: f  reason: collision with root package name */
    public int[] f11039f = new int[8];
    public float[] g = new float[8];
    public int h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f11040i = -1;

    /* renamed from: j  reason: collision with root package name */
    public boolean f11041j = false;

    public C0924a(C0925b bVar, i iVar) {
        this.f11036b = bVar;
        this.f11037c = iVar;
    }

    public final void a(C0929f fVar, float f6, boolean z3) {
        if (f6 <= -0.001f || f6 >= 0.001f) {
            int i2 = this.h;
            C0925b bVar = this.f11036b;
            if (i2 == -1) {
                this.h = 0;
                this.g[0] = f6;
                this.f11038e[0] = fVar.f11064b;
                this.f11039f[0] = -1;
                fVar.f11072t++;
                fVar.a(bVar);
                this.f11035a++;
                if (!this.f11041j) {
                    int i5 = this.f11040i + 1;
                    this.f11040i = i5;
                    int[] iArr = this.f11038e;
                    if (i5 >= iArr.length) {
                        this.f11041j = true;
                        this.f11040i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i6 = 0;
            int i7 = -1;
            while (i2 != -1 && i6 < this.f11035a) {
                int i8 = this.f11038e[i2];
                int i9 = fVar.f11064b;
                if (i8 == i9) {
                    float[] fArr = this.g;
                    float f7 = fArr[i2] + f6;
                    if (f7 > -0.001f && f7 < 0.001f) {
                        f7 = 0.0f;
                    }
                    fArr[i2] = f7;
                    if (f7 == 0.0f) {
                        if (i2 == this.h) {
                            this.h = this.f11039f[i2];
                        } else {
                            int[] iArr2 = this.f11039f;
                            iArr2[i7] = iArr2[i2];
                        }
                        if (z3) {
                            fVar.e(bVar);
                        }
                        if (this.f11041j) {
                            this.f11040i = i2;
                        }
                        fVar.f11072t--;
                        this.f11035a--;
                        return;
                    }
                    return;
                }
                if (i8 < i9) {
                    i7 = i2;
                }
                i2 = this.f11039f[i2];
                i6++;
            }
            int i10 = this.f11040i;
            int i11 = i10 + 1;
            if (this.f11041j) {
                int[] iArr3 = this.f11038e;
                if (iArr3[i10] != -1) {
                    i10 = iArr3.length;
                }
            } else {
                i10 = i11;
            }
            int[] iArr4 = this.f11038e;
            if (i10 >= iArr4.length && this.f11035a < iArr4.length) {
                int i12 = 0;
                while (true) {
                    int[] iArr5 = this.f11038e;
                    if (i12 >= iArr5.length) {
                        break;
                    } else if (iArr5[i12] == -1) {
                        i10 = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            int[] iArr6 = this.f11038e;
            if (i10 >= iArr6.length) {
                i10 = iArr6.length;
                int i13 = this.d * 2;
                this.d = i13;
                this.f11041j = false;
                this.f11040i = i10 - 1;
                this.g = Arrays.copyOf(this.g, i13);
                this.f11038e = Arrays.copyOf(this.f11038e, this.d);
                this.f11039f = Arrays.copyOf(this.f11039f, this.d);
            }
            this.f11038e[i10] = fVar.f11064b;
            this.g[i10] = f6;
            if (i7 != -1) {
                int[] iArr7 = this.f11039f;
                iArr7[i10] = iArr7[i7];
                iArr7[i7] = i10;
            } else {
                this.f11039f[i10] = this.h;
                this.h = i10;
            }
            fVar.f11072t++;
            fVar.a(bVar);
            this.f11035a++;
            if (!this.f11041j) {
                this.f11040i++;
            }
            int i14 = this.f11040i;
            int[] iArr8 = this.f11038e;
            if (i14 >= iArr8.length) {
                this.f11041j = true;
                this.f11040i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i2 = this.h;
        int i5 = 0;
        while (i2 != -1 && i5 < this.f11035a) {
            C0929f fVar = ((C0929f[]) this.f11037c.d)[this.f11038e[i2]];
            if (fVar != null) {
                fVar.e(this.f11036b);
            }
            i2 = this.f11039f[i2];
            i5++;
        }
        this.h = -1;
        this.f11040i = -1;
        this.f11041j = false;
        this.f11035a = 0;
    }

    public final float c(C0929f fVar) {
        int i2 = this.h;
        int i5 = 0;
        while (i2 != -1 && i5 < this.f11035a) {
            if (this.f11038e[i2] == fVar.f11064b) {
                return this.g[i2];
            }
            i2 = this.f11039f[i2];
            i5++;
        }
        return 0.0f;
    }

    public final int d() {
        return this.f11035a;
    }

    public final C0929f e(int i2) {
        int i5 = this.h;
        int i6 = 0;
        while (i5 != -1 && i6 < this.f11035a) {
            if (i6 == i2) {
                return ((C0929f[]) this.f11037c.d)[this.f11038e[i5]];
            }
            i5 = this.f11039f[i5];
            i6++;
        }
        return null;
    }

    public final float f(int i2) {
        int i5 = this.h;
        int i6 = 0;
        while (i5 != -1 && i6 < this.f11035a) {
            if (i6 == i2) {
                return this.g[i5];
            }
            i5 = this.f11039f[i5];
            i6++;
        }
        return 0.0f;
    }

    public final void g(C0929f fVar, float f6) {
        if (f6 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i2 = this.h;
        C0925b bVar = this.f11036b;
        if (i2 == -1) {
            this.h = 0;
            this.g[0] = f6;
            this.f11038e[0] = fVar.f11064b;
            this.f11039f[0] = -1;
            fVar.f11072t++;
            fVar.a(bVar);
            this.f11035a++;
            if (!this.f11041j) {
                int i5 = this.f11040i + 1;
                this.f11040i = i5;
                int[] iArr = this.f11038e;
                if (i5 >= iArr.length) {
                    this.f11041j = true;
                    this.f11040i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i6 = 0;
        int i7 = -1;
        while (i2 != -1 && i6 < this.f11035a) {
            int i8 = this.f11038e[i2];
            int i9 = fVar.f11064b;
            if (i8 == i9) {
                this.g[i2] = f6;
                return;
            }
            if (i8 < i9) {
                i7 = i2;
            }
            i2 = this.f11039f[i2];
            i6++;
        }
        int i10 = this.f11040i;
        int i11 = i10 + 1;
        if (this.f11041j) {
            int[] iArr2 = this.f11038e;
            if (iArr2[i10] != -1) {
                i10 = iArr2.length;
            }
        } else {
            i10 = i11;
        }
        int[] iArr3 = this.f11038e;
        if (i10 >= iArr3.length && this.f11035a < iArr3.length) {
            int i12 = 0;
            while (true) {
                int[] iArr4 = this.f11038e;
                if (i12 >= iArr4.length) {
                    break;
                } else if (iArr4[i12] == -1) {
                    i10 = i12;
                    break;
                } else {
                    i12++;
                }
            }
        }
        int[] iArr5 = this.f11038e;
        if (i10 >= iArr5.length) {
            i10 = iArr5.length;
            int i13 = this.d * 2;
            this.d = i13;
            this.f11041j = false;
            this.f11040i = i10 - 1;
            this.g = Arrays.copyOf(this.g, i13);
            this.f11038e = Arrays.copyOf(this.f11038e, this.d);
            this.f11039f = Arrays.copyOf(this.f11039f, this.d);
        }
        this.f11038e[i10] = fVar.f11064b;
        this.g[i10] = f6;
        if (i7 != -1) {
            int[] iArr6 = this.f11039f;
            iArr6[i10] = iArr6[i7];
            iArr6[i7] = i10;
        } else {
            this.f11039f[i10] = this.h;
            this.h = i10;
        }
        fVar.f11072t++;
        fVar.a(bVar);
        int i14 = this.f11035a + 1;
        this.f11035a = i14;
        if (!this.f11041j) {
            this.f11040i++;
        }
        int[] iArr7 = this.f11038e;
        if (i14 >= iArr7.length) {
            this.f11041j = true;
        }
        if (this.f11040i >= iArr7.length) {
            this.f11041j = true;
            this.f11040i = iArr7.length - 1;
        }
    }

    public final float h(C0929f fVar, boolean z3) {
        int i2 = this.h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i5 = 0;
        int i6 = -1;
        while (i2 != -1 && i5 < this.f11035a) {
            if (this.f11038e[i2] == fVar.f11064b) {
                if (i2 == this.h) {
                    this.h = this.f11039f[i2];
                } else {
                    int[] iArr = this.f11039f;
                    iArr[i6] = iArr[i2];
                }
                if (z3) {
                    fVar.e(this.f11036b);
                }
                fVar.f11072t--;
                this.f11035a--;
                this.f11038e[i2] = -1;
                if (this.f11041j) {
                    this.f11040i = i2;
                }
                return this.g[i2];
            }
            i5++;
            i6 = i2;
            i2 = this.f11039f[i2];
        }
        return 0.0f;
    }

    public final String toString() {
        int i2 = this.h;
        String str = "";
        int i5 = 0;
        while (i2 != -1 && i5 < this.f11035a) {
            str = (d.f(str, " -> ") + this.g[i2] + " : ") + ((C0929f[]) this.f11037c.d)[this.f11038e[i2]];
            i2 = this.f11039f[i2];
            i5++;
        }
        return str;
    }
}
