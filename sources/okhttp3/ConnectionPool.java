package okhttp3;

import com.google.android.gms.common.api.f;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;

public final class ConnectionPool {
    public static final ThreadPoolExecutor g = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.u("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: collision with root package name */
    public final int f10524a = 5;

    /* renamed from: b  reason: collision with root package name */
    public final long f10525b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f10526c = new Runnable() {
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x007c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r14 = this;
            L_0x0000:
                okhttp3.ConnectionPool r0 = okhttp3.ConnectionPool.this
                long r1 = java.lang.System.nanoTime()
                monitor-enter(r0)
                java.util.ArrayDeque r3 = r0.d     // Catch:{ all -> 0x0035 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0035 }
                r4 = 0
                r5 = 0
                r6 = -9223372036854775808
                r8 = r4
                r9 = r8
            L_0x0013:
                boolean r10 = r3.hasNext()     // Catch:{ all -> 0x0035 }
                if (r10 == 0) goto L_0x0037
                java.lang.Object r10 = r3.next()     // Catch:{ all -> 0x0035 }
                okhttp3.internal.connection.RealConnection r10 = (okhttp3.internal.connection.RealConnection) r10     // Catch:{ all -> 0x0035 }
                int r11 = r0.a(r10, r1)     // Catch:{ all -> 0x0035 }
                if (r11 <= 0) goto L_0x0028
                int r9 = r9 + 1
                goto L_0x0013
            L_0x0028:
                int r8 = r8 + 1
                long r11 = r10.f10718o     // Catch:{ all -> 0x0035 }
                long r11 = r1 - r11
                int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r13 <= 0) goto L_0x0013
                r5 = r10
                r6 = r11
                goto L_0x0013
            L_0x0035:
                r1 = move-exception
                goto L_0x0080
            L_0x0037:
                long r1 = r0.f10525b     // Catch:{ all -> 0x0035 }
                int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                r10 = 0
                r12 = -1
                if (r3 >= 0) goto L_0x0054
                int r3 = r0.f10524a     // Catch:{ all -> 0x0035 }
                if (r8 <= r3) goto L_0x0046
                goto L_0x0054
            L_0x0046:
                if (r8 <= 0) goto L_0x004b
                long r1 = r1 - r6
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                goto L_0x0060
            L_0x004b:
                if (r9 <= 0) goto L_0x004f
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                goto L_0x0060
            L_0x004f:
                r0.f10528f = r4     // Catch:{ all -> 0x0035 }
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                r1 = r12
                goto L_0x0060
            L_0x0054:
                java.util.ArrayDeque r1 = r0.d     // Catch:{ all -> 0x0035 }
                r1.remove(r5)     // Catch:{ all -> 0x0035 }
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                java.net.Socket r0 = r5.f10710e
                okhttp3.internal.Util.f(r0)
                r1 = r10
            L_0x0060:
                int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r0 != 0) goto L_0x0065
                return
            L_0x0065:
                int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
                if (r0 <= 0) goto L_0x0000
                r3 = 1000000(0xf4240, double:4.940656E-318)
                long r5 = r1 / r3
                long r3 = r3 * r5
                long r1 = r1 - r3
                okhttp3.ConnectionPool r0 = okhttp3.ConnectionPool.this
                monitor-enter(r0)
                okhttp3.ConnectionPool r3 = okhttp3.ConnectionPool.this     // Catch:{ InterruptedException -> 0x007c }
                int r1 = (int) r1     // Catch:{ InterruptedException -> 0x007c }
                r3.wait(r5, r1)     // Catch:{ InterruptedException -> 0x007c }
                goto L_0x007c
            L_0x007a:
                r1 = move-exception
                goto L_0x007e
            L_0x007c:
                monitor-exit(r0)     // Catch:{ all -> 0x007a }
                goto L_0x0000
            L_0x007e:
                monitor-exit(r0)     // Catch:{ all -> 0x007a }
                throw r1
            L_0x0080:
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.ConnectionPool.AnonymousClass1.run():void");
        }
    };
    public final ArrayDeque d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final RouteDatabase f10527e = new RouteDatabase();

    /* renamed from: f  reason: collision with root package name */
    public boolean f10528f;

    public ConnectionPool() {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        this.f10525b = timeUnit.toNanos(5);
    }

    public final int a(RealConnection realConnection, long j6) {
        ArrayList arrayList = realConnection.f10717n;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                Platform.f10930a.m(((StreamAllocation.StreamAllocationReference) reference).f10740a, "A connection to " + realConnection.f10709c.f10672a.f10480a + " was leaked. Did you forget to close a response body?");
                arrayList.remove(i2);
                realConnection.f10714k = true;
                if (arrayList.isEmpty()) {
                    realConnection.f10718o = j6 - this.f10525b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
