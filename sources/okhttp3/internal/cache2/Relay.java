package okhttp3.internal.cache2;

import N5.d;
import N5.g;
import N5.u;
import N5.w;

final class Relay {

    public class RelaySource implements u {
        public final w b() {
            return null;
        }

        public final void close() {
        }

        public final long e(long j6, d dVar) {
            throw new IllegalStateException("closed");
        }
    }

    static {
        g.k("OkHttp cache v1\n");
        g.k("OkHttp DIRTY :(\n");
    }
}
