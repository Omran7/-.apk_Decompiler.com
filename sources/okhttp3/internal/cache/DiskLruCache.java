package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Iterator;
import java.util.regex.Pattern;

public final class DiskLruCache implements Closeable, Flushable {

    /* renamed from: okhttp3.internal.cache.DiskLruCache$1  reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public final void run() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$2  reason: invalid class name */
    class AnonymousClass2 extends FaultHidingSink {
        public final void c() {
            throw null;
        }
    }

    /* renamed from: okhttp3.internal.cache.DiskLruCache$3  reason: invalid class name */
    class AnonymousClass3 implements Iterator<Snapshot> {
        public final boolean hasNext() {
            throw null;
        }

        public final Object next() {
            throw null;
        }

        public final void remove() {
            throw new IllegalStateException("remove() before next()");
        }
    }

    public final class Editor {

        /* renamed from: okhttp3.internal.cache.DiskLruCache$Editor$1  reason: invalid class name */
        class AnonymousClass1 extends FaultHidingSink {
            public final void c() {
                throw null;
            }
        }
    }

    public final class Entry {
    }

    public final class Snapshot implements Closeable {
        public final void close() {
            throw null;
        }
    }

    static {
        Pattern.compile("[a-z0-9_-]{1,120}");
    }

    public final synchronized void close() {
        throw null;
    }

    public final synchronized void flush() {
    }
}
