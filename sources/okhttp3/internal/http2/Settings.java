package okhttp3.internal.http2;

public final class Settings {

    /* renamed from: a  reason: collision with root package name */
    public int f10907a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f10908b = new int[10];

    public final int a() {
        if ((this.f10907a & 128) != 0) {
            return this.f10908b[7];
        }
        return 65535;
    }

    public final void b(int i2, int i5) {
        if (i2 >= 0) {
            int[] iArr = this.f10908b;
            if (i2 < iArr.length) {
                this.f10907a = (1 << i2) | this.f10907a;
                iArr[i2] = i5;
            }
        }
    }
}
