package Q;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f2309a;

    /* renamed from: b  reason: collision with root package name */
    public int f2310b;

    /* renamed from: c  reason: collision with root package name */
    public float f2311c;
    public float d;

    /* renamed from: e  reason: collision with root package name */
    public long f2312e;

    /* renamed from: f  reason: collision with root package name */
    public long f2313f;
    public long g;
    public float h;

    /* renamed from: i  reason: collision with root package name */
    public int f2314i;

    public final float a(long j6) {
        long j7 = this.f2312e;
        if (j6 < j7) {
            return 0.0f;
        }
        long j8 = this.g;
        if (j8 < 0 || j6 < j8) {
            return g.b(((float) (j6 - j7)) / ((float) this.f2309a), 0.0f, 1.0f) * 0.5f;
        }
        float f6 = this.h;
        return (g.b(((float) (j6 - j8)) / ((float) this.f2314i), 0.0f, 1.0f) * f6) + (1.0f - f6);
    }
}
