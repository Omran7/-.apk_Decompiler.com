package q;

import java.util.Arrays;

/* renamed from: q.f  reason: case insensitive filesystem */
public final class C0929f implements Comparable {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11063a;

    /* renamed from: b  reason: collision with root package name */
    public int f11064b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f11065c = -1;
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f11066e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f11067f = false;

    /* renamed from: p  reason: collision with root package name */
    public final float[] f11068p = new float[9];

    /* renamed from: q  reason: collision with root package name */
    public final float[] f11069q = new float[9];

    /* renamed from: r  reason: collision with root package name */
    public C0925b[] f11070r = new C0925b[16];

    /* renamed from: s  reason: collision with root package name */
    public int f11071s = 0;

    /* renamed from: t  reason: collision with root package name */
    public int f11072t = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f11073u;

    public C0929f(int i2) {
        this.f11073u = i2;
    }

    public final void a(C0925b bVar) {
        int i2 = 0;
        while (true) {
            int i5 = this.f11071s;
            if (i2 >= i5) {
                C0925b[] bVarArr = this.f11070r;
                if (i5 >= bVarArr.length) {
                    this.f11070r = (C0925b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C0925b[] bVarArr2 = this.f11070r;
                int i6 = this.f11071s;
                bVarArr2[i6] = bVar;
                this.f11071s = i6 + 1;
                return;
            } else if (this.f11070r[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final int compareTo(Object obj) {
        return this.f11064b - ((C0929f) obj).f11064b;
    }

    public final void e(C0925b bVar) {
        int i2 = this.f11071s;
        int i5 = 0;
        while (i5 < i2) {
            if (this.f11070r[i5] == bVar) {
                while (i5 < i2 - 1) {
                    C0925b[] bVarArr = this.f11070r;
                    int i6 = i5 + 1;
                    bVarArr[i5] = bVarArr[i6];
                    i5 = i6;
                }
                this.f11071s--;
                return;
            }
            i5++;
        }
    }

    public final void j() {
        this.f11073u = 5;
        this.d = 0;
        this.f11064b = -1;
        this.f11065c = -1;
        this.f11066e = 0.0f;
        this.f11067f = false;
        int i2 = this.f11071s;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f11070r[i5] = null;
        }
        this.f11071s = 0;
        this.f11072t = 0;
        this.f11063a = false;
        Arrays.fill(this.f11069q, 0.0f);
    }

    public final void k(C0926c cVar, float f6) {
        this.f11066e = f6;
        this.f11067f = true;
        int i2 = this.f11071s;
        this.f11065c = -1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f11070r[i5].h(cVar, this, false);
        }
        this.f11071s = 0;
    }

    public final void m(C0926c cVar, C0925b bVar) {
        int i2 = this.f11071s;
        for (int i5 = 0; i5 < i2; i5++) {
            this.f11070r[i5].i(cVar, bVar, false);
        }
        this.f11071s = 0;
    }

    public final String toString() {
        return "" + this.f11064b;
    }
}
