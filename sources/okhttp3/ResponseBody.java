package okhttp3;

import N5.f;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import okhttp3.internal.Util;

public abstract class ResponseBody implements Closeable {

    public static final class BomAwareReader extends Reader {
        public final void close() {
            throw null;
        }

        public final int read(char[] cArr, int i2, int i5) {
            throw new IOException("Stream closed");
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [N5.d, java.lang.Object] */
    public static ResponseBody j(byte[] bArr) {
        final ? obj = new Object();
        obj.x(bArr);
        final long length = (long) bArr.length;
        return new ResponseBody() {
            public final long c() {
                return length;
            }

            public final MediaType d() {
                return null;
            }

            public final f k() {
                return obj;
            }
        };
    }

    public abstract long c();

    public final void close() {
        Util.e(k());
    }

    public abstract MediaType d();

    public abstract f k();
}
