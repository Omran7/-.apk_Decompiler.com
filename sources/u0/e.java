package U0;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class e extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f3678a;

    /* renamed from: b  reason: collision with root package name */
    public int f3679b;

    public e(InputStream inputStream, long j6) {
        super(inputStream);
        this.f3678a = j6;
    }

    public final synchronized int available() {
        return (int) Math.max(this.f3678a - ((long) this.f3679b), (long) this.in.available());
    }

    public final void c(int i2) {
        if (i2 >= 0) {
            this.f3679b += i2;
            return;
        }
        long j6 = this.f3678a;
        if (j6 - ((long) this.f3679b) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + j6 + ", but read: " + this.f3679b);
        }
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        c(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i2, int i5) {
        int read;
        read = super.read(bArr, i2, i5);
        c(read);
        return read;
    }
}
