package X;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public long f4123a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f f4124b;

    public a(f fVar) {
        this.f4124b = fVar;
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j6, byte[] bArr, int i2, int i5) {
        if (i5 == 0) {
            return 0;
        }
        if (j6 < 0) {
            return -1;
        }
        try {
            long j7 = this.f4123a;
            int i6 = (j7 > j6 ? 1 : (j7 == j6 ? 0 : -1));
            f fVar = this.f4124b;
            if (i6 != 0) {
                if (j7 >= 0) {
                    if (j6 >= j7 + ((long) fVar.f4125a.available())) {
                        return -1;
                    }
                }
                fVar.d(j6);
                this.f4123a = j6;
            }
            if (i5 > fVar.f4125a.available()) {
                i5 = fVar.f4125a.available();
            }
            int read = fVar.read(bArr, i2, i5);
            if (read >= 0) {
                this.f4123a += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.f4123a = -1;
        return -1;
    }

    public final void close() {
    }
}
