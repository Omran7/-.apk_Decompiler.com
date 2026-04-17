package okhttp3;

import N5.n;
import N5.o;
import java.util.logging.Logger;
import okhttp3.internal.Util;

public abstract class RequestBody {

    /* renamed from: okhttp3.RequestBody$1  reason: invalid class name */
    class AnonymousClass1 extends RequestBody {
        public final long a() {
            throw null;
        }

        public final MediaType b() {
            return null;
        }

        public final void d(o oVar) {
            if (!oVar.f1951c) {
                oVar.f1949a.getClass();
                throw new IllegalArgumentException("byteString == null");
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: okhttp3.RequestBody$3  reason: invalid class name */
    class AnonymousClass3 extends RequestBody {
        public final long a() {
            throw null;
        }

        public final MediaType b() {
            return null;
        }

        public final void d(o oVar) {
            try {
                Logger logger = n.f1948a;
                throw new IllegalArgumentException("file == null");
            } catch (Throwable th) {
                byte[] bArr = Util.f10683a;
                throw th;
            }
        }
    }

    public static RequestBody c(final MediaType mediaType, final byte[] bArr) {
        final int length = bArr.length;
        long length2 = (long) bArr.length;
        long j6 = (long) 0;
        long j7 = (long) length;
        byte[] bArr2 = Util.f10683a;
        if ((j6 | j7) >= 0 && j6 <= length2 && length2 - j6 >= j7) {
            return new RequestBody() {
                public final long a() {
                    return (long) length;
                }

                public final MediaType b() {
                    return MediaType.this;
                }

                public final void d(o oVar) {
                    if (!oVar.f1951c) {
                        oVar.f1949a.y(bArr, length);
                        oVar.c();
                        return;
                    }
                    throw new IllegalStateException("closed");
                }
            };
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public long a() {
        return -1;
    }

    public abstract MediaType b();

    public abstract void d(o oVar);
}
