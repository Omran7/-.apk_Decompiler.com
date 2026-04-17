package com.bumptech.glide.load.data;

import com.google.android.gms.internal.measurement.a;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class i extends FilterInputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f5815c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int d = 31;

    /* renamed from: a  reason: collision with root package name */
    public final byte f5816a;

    /* renamed from: b  reason: collision with root package name */
    public int f5817b;

    public i(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 < -1 || i2 > 8) {
            throw new IllegalArgumentException(a.f(i2, "Cannot add invalid orientation: "));
        }
        this.f5816a = (byte) i2;
    }

    public final void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() {
        int i2;
        int i5;
        int i6 = this.f5817b;
        if (i6 < 2 || i6 > (i5 = d)) {
            i2 = super.read();
        } else if (i6 == i5) {
            i2 = this.f5816a;
        } else {
            i2 = f5815c[i6 - 2] & 255;
        }
        if (i2 != -1) {
            this.f5817b++;
        }
        return i2;
    }

    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public final long skip(long j6) {
        long skip = super.skip(j6);
        if (skip > 0) {
            this.f5817b = (int) (((long) this.f5817b) + skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i2, int i5) {
        int i6;
        int i7 = this.f5817b;
        int i8 = d;
        if (i7 > i8) {
            i6 = super.read(bArr, i2, i5);
        } else if (i7 == i8) {
            bArr[i2] = this.f5816a;
            i6 = 1;
        } else if (i7 < 2) {
            i6 = super.read(bArr, i2, 2 - i7);
        } else {
            int min = Math.min(i8 - i7, i5);
            System.arraycopy(f5815c, this.f5817b - 2, bArr, i2, min);
            i6 = min;
        }
        if (i6 > 0) {
            this.f5817b += i6;
        }
        return i6;
    }
}
