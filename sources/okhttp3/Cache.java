package okhttp3;

import N5.f;
import N5.h;
import N5.i;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.platform.Platform;

public final class Cache implements Closeable, Flushable {

    /* renamed from: okhttp3.Cache$1  reason: invalid class name */
    public class AnonymousClass1 implements InternalCache {
        public final void a() {
            throw null;
        }

        public final CacheRequest b() {
            throw null;
        }

        public final void c() {
            throw null;
        }

        public final Response get() {
            throw null;
        }

        public final void remove() {
            throw null;
        }
    }

    /* renamed from: okhttp3.Cache$2  reason: invalid class name */
    class AnonymousClass2 implements Iterator<String> {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10488a;

        public final boolean hasNext() {
            this.f10488a = false;
            throw null;
        }

        public final Object next() {
            this.f10488a = false;
            throw null;
        }

        public final void remove() {
            if (!this.f10488a) {
                throw new IllegalStateException("remove() before next()");
            }
            throw null;
        }
    }

    public final class CacheRequestImpl implements CacheRequest {

        /* renamed from: okhttp3.Cache$CacheRequestImpl$1  reason: invalid class name */
        class AnonymousClass1 extends h {
            public final void close() {
                throw null;
            }
        }

        public final void a() {
            throw null;
        }
    }

    public static class CacheResponseBody extends ResponseBody {

        /* renamed from: okhttp3.Cache$CacheResponseBody$1  reason: invalid class name */
        class AnonymousClass1 extends i {
            public final void close() {
                throw null;
            }
        }

        public final long c() {
            return -1;
        }

        public final MediaType d() {
            return null;
        }

        public final f k() {
            return null;
        }
    }

    public static final class Entry {
        static {
            Platform.f10930a.getClass();
        }
    }

    public final void close() {
        throw null;
    }

    public final void flush() {
        throw null;
    }
}
