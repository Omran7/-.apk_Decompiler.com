package v;

import java.util.Arrays;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public int[] f12033a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f12034b;

    /* renamed from: c  reason: collision with root package name */
    public int f12035c;
    public int[] d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f12036e;

    /* renamed from: f  reason: collision with root package name */
    public int f12037f;
    public int[] g;
    public String[] h;

    /* renamed from: i  reason: collision with root package name */
    public int f12038i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f12039j;

    /* renamed from: k  reason: collision with root package name */
    public boolean[] f12040k;

    /* renamed from: l  reason: collision with root package name */
    public int f12041l;

    public final void a(int i2, float f6) {
        int i5 = this.f12037f;
        int[] iArr = this.d;
        if (i5 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f12036e;
            this.f12036e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i6 = this.f12037f;
        iArr2[i6] = i2;
        float[] fArr2 = this.f12036e;
        this.f12037f = i6 + 1;
        fArr2[i6] = f6;
    }

    public final void b(int i2, int i5) {
        int i6 = this.f12035c;
        int[] iArr = this.f12033a;
        if (i6 >= iArr.length) {
            this.f12033a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f12034b;
            this.f12034b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f12033a;
        int i7 = this.f12035c;
        iArr3[i7] = i2;
        int[] iArr4 = this.f12034b;
        this.f12035c = i7 + 1;
        iArr4[i7] = i5;
    }

    public final void c(int i2, String str) {
        int i5 = this.f12038i;
        int[] iArr = this.g;
        if (i5 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i6 = this.f12038i;
        iArr2[i6] = i2;
        String[] strArr2 = this.h;
        this.f12038i = i6 + 1;
        strArr2[i6] = str;
    }

    public final void d(int i2, boolean z3) {
        int i5 = this.f12041l;
        int[] iArr = this.f12039j;
        if (i5 >= iArr.length) {
            this.f12039j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f12040k;
            this.f12040k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f12039j;
        int i6 = this.f12041l;
        iArr2[i6] = i2;
        boolean[] zArr2 = this.f12040k;
        this.f12041l = i6 + 1;
        zArr2[i6] = z3;
    }
}
