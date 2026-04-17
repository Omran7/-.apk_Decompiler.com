package U0;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class a extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f3671a;

    /* renamed from: b  reason: collision with root package name */
    public int f3672b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f3671a = byteBuffer;
    }

    public final int available() {
        return this.f3671a.remaining();
    }

    public final synchronized void mark(int i2) {
        this.f3672b = this.f3671a.position();
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        ByteBuffer byteBuffer = this.f3671a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        return byteBuffer.get() & 255;
    }

    public final synchronized void reset() {
        int i2 = this.f3672b;
        if (i2 != -1) {
            this.f3671a.position(i2);
        } else {
            throw new IOException("Cannot reset to unset mark position");
        }
    }

    public final long skip(long j6) {
        ByteBuffer byteBuffer = this.f3671a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j6, (long) byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + min));
        return min;
    }

    public final int read(byte[] bArr, int i2, int i5) {
        ByteBuffer byteBuffer = this.f3671a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i5, byteBuffer.remaining());
        byteBuffer.get(bArr, i2, min);
        return min;
    }
}
