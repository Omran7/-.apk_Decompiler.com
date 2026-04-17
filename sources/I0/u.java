package I0;

import C0.g;
import U0.a;
import X.c;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import z0.C1128d;

public final class u implements C1128d {
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public final int b(InputStream inputStream, g gVar) {
        X.g gVar2 = new X.g(inputStream);
        c c3 = gVar2.c("Orientation");
        int i2 = 1;
        if (c3 != null) {
            try {
                i2 = c3.e(gVar2.f4171f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i2 == 0) {
            return -1;
        }
        return i2;
    }

    public final int c(ByteBuffer byteBuffer, g gVar) {
        AtomicReference atomicReference = U0.c.f3676a;
        return b(new a(byteBuffer), gVar);
    }

    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
