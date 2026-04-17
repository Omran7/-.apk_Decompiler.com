package X;

import java.io.InputStream;

public final class f extends b {
    public f(byte[] bArr) {
        super(bArr);
        this.f4125a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final void d(long j6) {
        int i2 = this.f4126b;
        if (((long) i2) > j6) {
            this.f4126b = 0;
            this.f4125a.reset();
        } else {
            j6 -= (long) i2;
        }
        c((int) j6);
    }

    public f(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f4125a.mark(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
