package k;

/* renamed from: k.M0  reason: case insensitive filesystem */
public final class C0675M0 {

    /* renamed from: a  reason: collision with root package name */
    public int f9204a;

    /* renamed from: b  reason: collision with root package name */
    public int f9205b;

    /* renamed from: c  reason: collision with root package name */
    public int f9206c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f9207e;

    /* renamed from: f  reason: collision with root package name */
    public int f9208f;
    public boolean g;
    public boolean h;

    public final void a(int i2, int i5) {
        this.f9206c = i2;
        this.d = i5;
        this.h = true;
        if (this.g) {
            if (i5 != Integer.MIN_VALUE) {
                this.f9204a = i5;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f9205b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f9204a = i2;
        }
        if (i5 != Integer.MIN_VALUE) {
            this.f9205b = i5;
        }
    }
}
