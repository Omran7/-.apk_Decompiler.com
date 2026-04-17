package D3;

import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f564a;

    public final void write(int i2) {
        this.f564a++;
    }

    public final void write(byte[] bArr) {
        this.f564a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i2, int i5) {
        int i6;
        if (i2 < 0 || i2 > bArr.length || i5 < 0 || (i6 = i2 + i5) > bArr.length || i6 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f564a += (long) i5;
    }
}
