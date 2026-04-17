package S3;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: S3.d  reason: case insensitive filesystem */
public final class C0143d extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f2662a = 1048577;

    /* renamed from: b  reason: collision with root package name */
    public long f2663b = -1;

    public C0143d(InputStream inputStream) {
        super(inputStream);
    }

    public final int available() {
        return (int) Math.min((long) this.in.available(), this.f2662a);
    }

    public final synchronized void mark(int i2) {
        this.in.mark(i2);
        this.f2663b = this.f2662a;
    }

    public final int read() {
        if (this.f2662a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f2662a--;
        }
        return read;
    }

    public final synchronized void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.f2663b != -1) {
            this.in.reset();
            this.f2662a = this.f2663b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public final long skip(long j6) {
        long skip = this.in.skip(Math.min(j6, this.f2662a));
        this.f2662a -= skip;
        return skip;
    }

    public final int read(byte[] bArr, int i2, int i5) {
        long j6 = this.f2662a;
        if (j6 == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i2, (int) Math.min((long) i5, j6));
        if (read != -1) {
            this.f2662a -= (long) read;
        }
        return read;
    }
}
