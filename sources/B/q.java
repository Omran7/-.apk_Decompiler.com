package B;

public final class q {

    /* renamed from: k  reason: collision with root package name */
    public static final q f167k;

    /* renamed from: a  reason: collision with root package name */
    public final float f168a;

    /* renamed from: b  reason: collision with root package name */
    public final float f169b;

    /* renamed from: c  reason: collision with root package name */
    public final float f170c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f171e;

    /* renamed from: f  reason: collision with root package name */
    public final float f172f;
    public final float[] g;
    public final float h;

    /* renamed from: i  reason: collision with root package name */
    public final float f173i;

    /* renamed from: j  reason: collision with root package name */
    public final float f174j;

    static {
        float f6;
        float[] fArr = b.f140c;
        float l6 = (float) ((((double) b.l()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f138a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f8 = fArr[1];
        float f9 = (fArr3[1] * f8) + (fArr3[0] * f7);
        float f10 = fArr[2];
        float f11 = (fArr3[2] * f10) + f9;
        float[] fArr4 = fArr2[1];
        float f12 = (fArr4[2] * f10) + (fArr4[1] * f8) + (fArr4[0] * f7);
        float[] fArr5 = fArr2[2];
        float f13 = (f10 * fArr5[2]) + (f8 * fArr5[1]) + (f7 * fArr5[0]);
        if (((double) 1.0f) >= 0.9d) {
            f6 = 0.69f;
        } else {
            f6 = 0.655f;
        }
        float f14 = f6;
        float exp = (1.0f - (((float) Math.exp((double) (((-l6) - 42.0f) / 92.0f))) * 0.2777778f)) * 1.0f;
        double d6 = (double) exp;
        if (d6 > 1.0d) {
            exp = 1.0f;
        } else if (d6 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f11) * exp) + 1.0f) - exp, (((100.0f / f12) * exp) + 1.0f) - exp, (((100.0f / f13) * exp) + 1.0f) - exp};
        float f15 = 1.0f / ((5.0f * l6) + 1.0f);
        float f16 = f15 * f15 * f15 * f15;
        float f17 = 1.0f - f16;
        float cbrt = (0.1f * f17 * f17 * ((float) Math.cbrt(((double) l6) * 5.0d))) + (f16 * l6);
        float l7 = b.l() / fArr[1];
        double d7 = (double) l7;
        float sqrt = ((float) Math.sqrt(d7)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d7, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f11)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f12)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f13)) / 100.0d, 0.42d)};
        float f18 = fArr7[0];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr7[1];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float f22 = fArr7[2];
        float[] fArr8 = {f19, f21, (400.0f * f22) / (f22 + 27.13f)};
        f167k = new q(l7, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * pow, pow, pow, f14, 1.0f, fArr6, cbrt, (float) Math.pow((double) cbrt, 0.25d), sqrt);
    }

    public q(float f6, float f7, float f8, float f9, float f10, float f11, float[] fArr, float f12, float f13, float f14) {
        this.f172f = f6;
        this.f168a = f7;
        this.f169b = f8;
        this.f170c = f9;
        this.d = f10;
        this.f171e = f11;
        this.g = fArr;
        this.h = f12;
        this.f173i = f13;
        this.f174j = f14;
    }
}
