package U0;

import java.io.FilterInputStream;

public final class l extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f3692a = Integer.MIN_VALUE;

    public l(f fVar) {
        super(fVar);
    }

    public final int available() {
        int i2 = this.f3692a;
        if (i2 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i2, super.available());
    }

    public final long c(long j6) {
        int i2 = this.f3692a;
        if (i2 == 0) {
            return -1;
        }
        if (i2 == Integer.MIN_VALUE || j6 <= ((long) i2)) {
            return j6;
        }
        return (long) i2;
    }

    public final void d(long j6) {
        int i2 = this.f3692a;
        if (i2 != Integer.MIN_VALUE && j6 != -1) {
            this.f3692a = (int) (((long) i2) - j6);
        }
    }

    public final synchronized void mark(int i2) {
        super.mark(i2);
        this.f3692a = i2;
    }

    public final int read() {
        if (c(1) == -1) {
            return -1;
        }
        int read = super.read();
        d(1);
        return read;
    }

    public final synchronized void reset() {
        super.reset();
        this.f3692a = Integer.MIN_VALUE;
    }

    public final long skip(long j6) {
        long c3 = c(j6);
        if (c3 == -1) {
            return 0;
        }
        long skip = super.skip(c3);
        d(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i2, int i5) {
        int c3 = (int) c((long) i5);
        if (c3 == -1) {
            return -1;
        }
        int read = super.read(bArr, i2, c3);
        d((long) read);
        return read;
    }
}
