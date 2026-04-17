package U0;

import I0.y;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

public final class f extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final ArrayDeque f3680c = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public y f3681a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f3682b;

    static {
        char[] cArr = o.f3697a;
    }

    public final int available() {
        return this.f3681a.available();
    }

    public final void close() {
        this.f3681a.close();
    }

    public final void mark(int i2) {
        this.f3681a.mark(i2);
    }

    public final boolean markSupported() {
        this.f3681a.getClass();
        return true;
    }

    public final int read() {
        try {
            return this.f3681a.read();
        } catch (IOException e6) {
            this.f3682b = e6;
            throw e6;
        }
    }

    public final synchronized void reset() {
        this.f3681a.reset();
    }

    public final long skip(long j6) {
        try {
            return this.f3681a.skip(j6);
        } catch (IOException e6) {
            this.f3682b = e6;
            throw e6;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.f3681a.read(bArr);
        } catch (IOException e6) {
            this.f3682b = e6;
            throw e6;
        }
    }

    public final int read(byte[] bArr, int i2, int i5) {
        try {
            return this.f3681a.read(bArr, i2, i5);
        } catch (IOException e6) {
            this.f3682b = e6;
            throw e6;
        }
    }
}
