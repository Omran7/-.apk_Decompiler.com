package I0;

import z0.h;

public final class o {

    /* renamed from: b  reason: collision with root package name */
    public static final o f1121b = new o(2);

    /* renamed from: c  reason: collision with root package name */
    public static final o f1122c = new o(0);
    public static final o d;

    /* renamed from: e  reason: collision with root package name */
    public static final o f1123e = new o(3);

    /* renamed from: f  reason: collision with root package name */
    public static final o f1124f;
    public static final h g;
    public static final boolean h = true;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1125a;

    static {
        o oVar = new o(1);
        d = oVar;
        f1124f = oVar;
        g = h.a(oVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public /* synthetic */ o(int i2) {
        this.f1125a = i2;
    }

    public final int a(int i2, int i5, int i6, int i7) {
        switch (this.f1125a) {
            case 0:
                if (b(i2, i5, i6, i7) == 1.0f) {
                    return 2;
                }
                return f1121b.a(i2, i5, i6, i7);
            case 1:
                return 2;
            case 2:
                if (h) {
                    return 2;
                }
                return 1;
            default:
                return 2;
        }
    }

    public final float b(int i2, int i5, int i6, int i7) {
        switch (this.f1125a) {
            case 0:
                return Math.min(1.0f, f1121b.b(i2, i5, i6, i7));
            case 1:
                return Math.max(((float) i6) / ((float) i2), ((float) i7) / ((float) i5));
            case 2:
                if (h) {
                    return Math.min(((float) i6) / ((float) i2), ((float) i7) / ((float) i5));
                }
                int max = Math.max(i5 / i7, i2 / i6);
                float f6 = 1.0f;
                if (max != 0) {
                    f6 = 1.0f / ((float) Integer.highestOneBit(max));
                }
                return f6;
            default:
                return 1.0f;
        }
    }
}
