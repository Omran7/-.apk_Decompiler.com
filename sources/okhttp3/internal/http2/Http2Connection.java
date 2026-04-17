package okhttp3.internal.http2;

import N5.d;
import N5.o;
import N5.p;
import N5.q;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.http2.PushObserver;

public final class Http2Connection implements Closeable {

    /* renamed from: G  reason: collision with root package name */
    public static final ThreadPoolExecutor f10816G = new ThreadPoolExecutor(0, f.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.u("OkHttp Http2Connection", true));

    /* renamed from: A  reason: collision with root package name */
    public final Settings f10817A;

    /* renamed from: B  reason: collision with root package name */
    public final Settings f10818B;

    /* renamed from: C  reason: collision with root package name */
    public final Socket f10819C;

    /* renamed from: D  reason: collision with root package name */
    public final Http2Writer f10820D;

    /* renamed from: E  reason: collision with root package name */
    public final ReaderRunnable f10821E;
    public final LinkedHashSet F;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10822a;

    /* renamed from: b  reason: collision with root package name */
    public final Listener f10823b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f10824c = new LinkedHashMap();
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public int f10825e;

    /* renamed from: f  reason: collision with root package name */
    public int f10826f;

    /* renamed from: p  reason: collision with root package name */
    public boolean f10827p;

    /* renamed from: q  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f10828q;

    /* renamed from: r  reason: collision with root package name */
    public final ThreadPoolExecutor f10829r;

    /* renamed from: s  reason: collision with root package name */
    public final PushObserver f10830s;

    /* renamed from: t  reason: collision with root package name */
    public long f10831t = 0;

    /* renamed from: u  reason: collision with root package name */
    public long f10832u = 0;

    /* renamed from: v  reason: collision with root package name */
    public long f10833v = 0;

    /* renamed from: w  reason: collision with root package name */
    public long f10834w = 0;

    /* renamed from: x  reason: collision with root package name */
    public long f10835x = 0;

    /* renamed from: y  reason: collision with root package name */
    public long f10836y = 0;

    /* renamed from: z  reason: collision with root package name */
    public long f10837z;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Socket f10852a;

        /* renamed from: b  reason: collision with root package name */
        public String f10853b;

        /* renamed from: c  reason: collision with root package name */
        public p f10854c;
        public o d;

        /* renamed from: e  reason: collision with root package name */
        public Listener f10855e;

        /* renamed from: f  reason: collision with root package name */
        public PushObserver f10856f;
        public boolean g;
    }

    public final class IntervalPingRunnable extends NamedRunnable {
        public final void a() {
            throw null;
        }
    }

    public static abstract class Listener {

        /* renamed from: a  reason: collision with root package name */
        public static final Listener f10857a = new Listener() {
            public final void b(Http2Stream http2Stream) {
                http2Stream.c(ErrorCode.REFUSED_STREAM);
            }
        };

        public void a(Http2Connection http2Connection) {
        }

        public abstract void b(Http2Stream http2Stream);
    }

    public final class PingRunnable extends NamedRunnable {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f10858b = true;

        /* renamed from: c  reason: collision with root package name */
        public final int f10859c;
        public final int d;

        public PingRunnable(int i2, int i5) {
            super("OkHttp %s ping %08x%08x", Http2Connection.this.d, Integer.valueOf(i2), Integer.valueOf(i5));
            this.f10859c = i2;
            this.d = i5;
        }

        public final void a() {
            int i2 = this.f10859c;
            int i5 = this.d;
            boolean z3 = this.f10858b;
            Http2Connection http2Connection = Http2Connection.this;
            http2Connection.getClass();
            try {
                http2Connection.f10820D.m(i2, i5, z3);
            } catch (IOException unused) {
                http2Connection.d();
            }
        }
    }

    public class ReaderRunnable extends NamedRunnable implements Http2Reader.Handler {

        /* renamed from: b  reason: collision with root package name */
        public final Http2Reader f10861b;

        public ReaderRunnable(Http2Reader http2Reader) {
            super("OkHttp %s", Http2Connection.this.d);
            this.f10861b = http2Reader;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
            r4 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r2 = okhttp3.internal.http2.ErrorCode.f10782c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            r0.c(r2, r2);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0022 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r5 = this;
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
                okhttp3.internal.http2.Http2Reader r1 = r5.f10861b
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.INTERNAL_ERROR
                r1.j(r5)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            L_0x0009:
                r3 = 0
                boolean r3 = r1.d(r3, r5)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
                if (r3 == 0) goto L_0x0011
                goto L_0x0009
            L_0x0011:
                okhttp3.internal.http2.ErrorCode r3 = okhttp3.internal.http2.ErrorCode.NO_ERROR     // Catch:{ IOException -> 0x0021, all -> 0x001e }
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ IOException -> 0x0022 }
                r0.c(r3, r2)     // Catch:{ IOException -> 0x0018 }
            L_0x0018:
                okhttp3.internal.Util.e(r1)
                goto L_0x0028
            L_0x001c:
                r4 = move-exception
                goto L_0x0029
            L_0x001e:
                r4 = move-exception
                r3 = r2
                goto L_0x0029
            L_0x0021:
                r3 = r2
            L_0x0022:
                okhttp3.internal.http2.ErrorCode r2 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR     // Catch:{ all -> 0x001c }
                r0.c(r2, r2)     // Catch:{ IOException -> 0x0018 }
                goto L_0x0018
            L_0x0028:
                return
            L_0x0029:
                r0.c(r3, r2)     // Catch:{ IOException -> 0x002c }
            L_0x002c:
                okhttp3.internal.Util.e(r1)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.a():void");
        }

        /* JADX WARNING: type inference failed for: r5v6, types: [N5.d, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fc, code lost:
            if (r12 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00fe, code lost:
            r0.h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(boolean r12, int r13, N5.p r14, int r15) {
            /*
                r11 = this;
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
                r0.getClass()
                if (r13 == 0) goto L_0x0056
                r0 = r13 & 1
                if (r0 != 0) goto L_0x0056
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
                r0.getClass()
                N5.d r5 = new N5.d
                r5.<init>()
                long r1 = (long) r15
                r14.q(r1)
                r14.e(r1, r5)
                long r3 = r5.f1932b
                int r14 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r14 != 0) goto L_0x003a
                okhttp3.internal.http2.Http2Connection$6 r14 = new okhttp3.internal.http2.Http2Connection$6
                java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
                java.lang.String r2 = r0.d
                java.lang.Object[] r3 = new java.lang.Object[]{r2, r1}
                r1 = r14
                r2 = r0
                r4 = r13
                r6 = r15
                r7 = r12
                r1.<init>(r3, r4, r5, r6, r7)
                r0.l(r14)
                return
            L_0x003a:
                java.io.IOException r12 = new java.io.IOException
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                long r0 = r5.f1932b
                r13.append(r0)
                java.lang.String r14 = " != "
                r13.append(r14)
                r13.append(r15)
                java.lang.String r13 = r13.toString()
                r12.<init>(r13)
                throw r12
            L_0x0056:
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
                okhttp3.internal.http2.Http2Stream r0 = r0.j(r13)
                if (r0 != 0) goto L_0x006f
                okhttp3.internal.http2.Http2Connection r12 = okhttp3.internal.http2.Http2Connection.this
                okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR
                r12.r(r13, r0)
                okhttp3.internal.http2.Http2Connection r12 = okhttp3.internal.http2.Http2Connection.this
                long r0 = (long) r15
                r12.p(r0)
                r14.a(r0)
                return
            L_0x006f:
                okhttp3.internal.http2.Http2Stream$FramingSource r13 = r0.g
                long r1 = (long) r15
            L_0x0072:
                r3 = 0
                int r15 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r15 <= 0) goto L_0x00f9
                okhttp3.internal.http2.Http2Stream r15 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r15)
                boolean r5 = r13.f10891e     // Catch:{ all -> 0x00f6 }
                N5.d r6 = r13.f10889b     // Catch:{ all -> 0x00f6 }
                long r6 = r6.f1932b     // Catch:{ all -> 0x00f6 }
                long r6 = r6 + r1
                long r8 = r13.f10890c     // Catch:{ all -> 0x00f6 }
                int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r7 = 1
                r8 = 0
                if (r6 <= 0) goto L_0x008c
                r6 = r7
                goto L_0x008d
            L_0x008c:
                r6 = r8
            L_0x008d:
                monitor-exit(r15)     // Catch:{ all -> 0x00f6 }
                if (r6 == 0) goto L_0x00a6
                r14.a(r1)
                okhttp3.internal.http2.Http2Stream r13 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.ErrorCode r14 = okhttp3.internal.http2.ErrorCode.FLOW_CONTROL_ERROR
                boolean r15 = r13.d(r14)
                if (r15 != 0) goto L_0x009e
                goto L_0x00fc
            L_0x009e:
                okhttp3.internal.http2.Http2Connection r15 = r13.d
                int r13 = r13.f10879c
                r15.r(r13, r14)
                goto L_0x00fc
            L_0x00a6:
                if (r5 == 0) goto L_0x00ac
                r14.a(r1)
                goto L_0x00fc
            L_0x00ac:
                N5.d r15 = r13.f10888a
                long r5 = r14.e(r1, r15)
                r9 = -1
                int r15 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r15 == 0) goto L_0x00f0
                long r1 = r1 - r5
                okhttp3.internal.http2.Http2Stream r15 = okhttp3.internal.http2.Http2Stream.this
                monitor-enter(r15)
                boolean r5 = r13.d     // Catch:{ all -> 0x00c8 }
                if (r5 == 0) goto L_0x00ca
                N5.d r5 = r13.f10888a     // Catch:{ all -> 0x00c8 }
                long r6 = r5.f1932b     // Catch:{ all -> 0x00c8 }
                r5.c()     // Catch:{ all -> 0x00c8 }
                goto L_0x00e1
            L_0x00c8:
                r12 = move-exception
                goto L_0x00ee
            L_0x00ca:
                N5.d r5 = r13.f10889b     // Catch:{ all -> 0x00c8 }
                long r9 = r5.f1932b     // Catch:{ all -> 0x00c8 }
                int r6 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r6 != 0) goto L_0x00d3
                goto L_0x00d4
            L_0x00d3:
                r7 = r8
            L_0x00d4:
                N5.d r6 = r13.f10888a     // Catch:{ all -> 0x00c8 }
                r5.z(r6)     // Catch:{ all -> 0x00c8 }
                if (r7 == 0) goto L_0x00e0
                okhttp3.internal.http2.Http2Stream r5 = okhttp3.internal.http2.Http2Stream.this     // Catch:{ all -> 0x00c8 }
                r5.notifyAll()     // Catch:{ all -> 0x00c8 }
            L_0x00e0:
                r6 = r3
            L_0x00e1:
                monitor-exit(r15)     // Catch:{ all -> 0x00c8 }
                int r15 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
                if (r15 <= 0) goto L_0x0072
                okhttp3.internal.http2.Http2Stream r15 = okhttp3.internal.http2.Http2Stream.this
                okhttp3.internal.http2.Http2Connection r15 = r15.d
                r15.p(r6)
                goto L_0x0072
            L_0x00ee:
                monitor-exit(r15)     // Catch:{ all -> 0x00c8 }
                throw r12
            L_0x00f0:
                java.io.EOFException r12 = new java.io.EOFException
                r12.<init>()
                throw r12
            L_0x00f6:
                r12 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x00f6 }
                throw r12
            L_0x00f9:
                r13.getClass()
            L_0x00fc:
                if (r12 == 0) goto L_0x0101
                r0.h()
            L_0x0101:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.b(boolean, int, N5.p, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r1.f10881f = true;
            r1.f10880e.add(okhttp3.internal.Util.v(r11));
            r10 = r1.g();
            r1.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0097, code lost:
            if (r10 != false) goto L_0x00a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
            r1.d.m(r1.f10879c);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a0, code lost:
            if (r9 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
            r1.h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(boolean r9, int r10, java.util.ArrayList r11) {
            /*
                r8 = this;
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
                r0.getClass()
                if (r10 == 0) goto L_0x0028
                r0 = r10 & 1
                if (r0 != 0) goto L_0x0028
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
                r0.getClass()
                okhttp3.internal.http2.Http2Connection$5 r7 = new okhttp3.internal.http2.Http2Connection$5     // Catch:{ RejectedExecutionException -> 0x0027 }
                java.lang.String r1 = r0.d     // Catch:{ RejectedExecutionException -> 0x0027 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ RejectedExecutionException -> 0x0027 }
                java.lang.Object[] r3 = new java.lang.Object[]{r1, r2}     // Catch:{ RejectedExecutionException -> 0x0027 }
                r1 = r7
                r2 = r0
                r4 = r10
                r5 = r11
                r6 = r9
                r1.<init>(r3, r4, r5, r6)     // Catch:{ RejectedExecutionException -> 0x0027 }
                r0.l(r7)     // Catch:{ RejectedExecutionException -> 0x0027 }
            L_0x0027:
                return
            L_0x0028:
                okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
                monitor-enter(r0)
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x003b }
                okhttp3.internal.http2.Http2Stream r1 = r1.j(r10)     // Catch:{ all -> 0x003b }
                if (r1 != 0) goto L_0x0081
                okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x003b }
                boolean r2 = r1.f10827p     // Catch:{ all -> 0x003b }
                if (r2 == 0) goto L_0x003d
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                return
            L_0x003b:
                r9 = move-exception
                goto L_0x00a9
            L_0x003d:
                int r2 = r1.f10825e     // Catch:{ all -> 0x003b }
                if (r10 > r2) goto L_0x0043
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                return
            L_0x0043:
                int r2 = r10 % 2
                int r1 = r1.f10826f     // Catch:{ all -> 0x003b }
                int r1 = r1 % 2
                if (r2 != r1) goto L_0x004d
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                return
            L_0x004d:
                okhttp3.Headers r6 = okhttp3.internal.Util.v(r11)     // Catch:{ all -> 0x003b }
                okhttp3.internal.http2.Http2Stream r11 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x003b }
                okhttp3.internal.http2.Http2Connection r3 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x003b }
                r4 = 0
                r1 = r11
                r2 = r10
                r5 = r9
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003b }
                okhttp3.internal.http2.Http2Connection r9 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x003b }
                r9.f10825e = r10     // Catch:{ all -> 0x003b }
                java.util.LinkedHashMap r9 = r9.f10824c     // Catch:{ all -> 0x003b }
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x003b }
                r9.put(r1, r11)     // Catch:{ all -> 0x003b }
                java.util.concurrent.ThreadPoolExecutor r9 = okhttp3.internal.http2.Http2Connection.f10816G     // Catch:{ all -> 0x003b }
                okhttp3.internal.http2.Http2Connection$ReaderRunnable$1 r1 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$1     // Catch:{ all -> 0x003b }
                okhttp3.internal.http2.Http2Connection r2 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x003b }
                java.lang.String r2 = r2.d     // Catch:{ all -> 0x003b }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x003b }
                java.lang.Object[] r10 = new java.lang.Object[]{r2, r10}     // Catch:{ all -> 0x003b }
                r1.<init>(r10, r11)     // Catch:{ all -> 0x003b }
                r9.execute(r1)     // Catch:{ all -> 0x003b }
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                return
            L_0x0081:
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                monitor-enter(r1)
                r10 = 1
                r1.f10881f = r10     // Catch:{ all -> 0x00a6 }
                java.util.ArrayDeque r10 = r1.f10880e     // Catch:{ all -> 0x00a6 }
                okhttp3.Headers r11 = okhttp3.internal.Util.v(r11)     // Catch:{ all -> 0x00a6 }
                r10.add(r11)     // Catch:{ all -> 0x00a6 }
                boolean r10 = r1.g()     // Catch:{ all -> 0x00a6 }
                r1.notifyAll()     // Catch:{ all -> 0x00a6 }
                monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
                if (r10 != 0) goto L_0x00a0
                okhttp3.internal.http2.Http2Connection r10 = r1.d
                int r11 = r1.f10879c
                r10.m(r11)
            L_0x00a0:
                if (r9 == 0) goto L_0x00a5
                r1.h()
            L_0x00a5:
                return
            L_0x00a6:
                r9 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00a6 }
                throw r9
            L_0x00a9:
                monitor-exit(r0)     // Catch:{ all -> 0x003b }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.ReaderRunnable.c(boolean, int, java.util.ArrayList):void");
        }

        public final void d(int i2, int i5, boolean z3) {
            if (z3) {
                synchronized (Http2Connection.this) {
                    if (i2 == 1) {
                        try {
                            Http2Connection.this.f10832u++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else if (i2 == 2) {
                        Http2Connection.this.f10834w++;
                    } else if (i2 == 3) {
                        Http2Connection http2Connection = Http2Connection.this;
                        http2Connection.getClass();
                        http2Connection.notifyAll();
                    }
                }
                return;
            }
            try {
                Http2Connection http2Connection2 = Http2Connection.this;
                http2Connection2.f10828q.execute(new PingRunnable(i2, i5));
            } catch (RejectedExecutionException unused) {
            }
        }

        public final void e(int i2, ArrayList arrayList) {
            Http2Connection http2Connection = Http2Connection.this;
            synchronized (http2Connection) {
                try {
                    if (http2Connection.F.contains(Integer.valueOf(i2))) {
                        http2Connection.r(i2, ErrorCode.PROTOCOL_ERROR);
                        return;
                    }
                    http2Connection.F.add(Integer.valueOf(i2));
                    try {
                        http2Connection.l(new NamedRunnable(new Object[]{http2Connection.d, Integer.valueOf(i2)}, i2, arrayList) {

                            /* renamed from: b  reason: collision with root package name */
                            public final /* synthetic */ int f10843b;

                            {
                                this.f10843b = r3;
                            }

                            public final void a() {
                                ((PushObserver.AnonymousClass1) Http2Connection.this.f10830s).getClass();
                                try {
                                    Http2Connection.this.f10820D.n(this.f10843b, ErrorCode.CANCEL);
                                    synchronized (Http2Connection.this) {
                                        Http2Connection.this.F.remove(Integer.valueOf(this.f10843b));
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        });
                    } catch (RejectedExecutionException unused) {
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
        }

        public final void f(int i2, ErrorCode errorCode) {
            Http2Connection http2Connection = Http2Connection.this;
            http2Connection.getClass();
            if (i2 == 0 || (i2 & 1) != 0) {
                Http2Stream m6 = http2Connection.m(i2);
                if (m6 != null) {
                    synchronized (m6) {
                        if (m6.f10884k == null) {
                            m6.f10884k = errorCode;
                            m6.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            http2Connection.l(new NamedRunnable(new Object[]{http2Connection.d, Integer.valueOf(i2)}, i2, errorCode) {

                /* renamed from: b  reason: collision with root package name */
                public final /* synthetic */ int f10850b;

                {
                    this.f10850b = r3;
                }

                public final void a() {
                    Http2Connection.this.f10830s.getClass();
                    synchronized (Http2Connection.this) {
                        Http2Connection.this.F.remove(Integer.valueOf(this.f10850b));
                    }
                }
            });
        }
    }

    public Http2Connection(Builder builder) {
        int i2;
        Builder builder2 = builder;
        Settings settings = new Settings();
        this.f10817A = settings;
        Settings settings2 = new Settings();
        this.f10818B = settings2;
        this.F = new LinkedHashSet();
        this.f10830s = builder2.f10856f;
        boolean z3 = builder2.g;
        this.f10822a = z3;
        this.f10823b = builder2.f10855e;
        if (z3) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        this.f10826f = i2;
        if (z3) {
            this.f10826f = i2 + 2;
        }
        if (z3) {
            settings.b(7, 16777216);
        }
        String str = builder2.f10853b;
        this.d = str;
        Locale locale = Locale.US;
        this.f10828q = new ScheduledThreadPoolExecutor(1, Util.u("OkHttp " + str + " Writer", false));
        this.f10829r = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.u("OkHttp " + str + " Push Observer", true));
        settings2.b(7, 65535);
        settings2.b(5, 16384);
        this.f10837z = (long) settings2.a();
        this.f10819C = builder2.f10852a;
        this.f10820D = new Http2Writer(builder2.d, z3);
        this.f10821E = new ReaderRunnable(new Http2Reader(builder2.f10854c, z3));
    }

    public final void c(ErrorCode errorCode, ErrorCode errorCode2) {
        Http2Stream[] http2StreamArr = null;
        try {
            n(errorCode);
            e = null;
        } catch (IOException e6) {
            e = e6;
        }
        synchronized (this) {
            try {
                if (!this.f10824c.isEmpty()) {
                    http2StreamArr = (Http2Stream[]) this.f10824c.values().toArray(new Http2Stream[this.f10824c.size()]);
                    this.f10824c.clear();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream c3 : http2StreamArr) {
                try {
                    c3.c(errorCode2);
                } catch (IOException e7) {
                    if (e != null) {
                        e = e7;
                    }
                }
            }
        }
        try {
            this.f10820D.close();
        } catch (IOException e8) {
            if (e == null) {
                e = e8;
            }
        }
        try {
            this.f10819C.close();
        } catch (IOException e9) {
            e = e9;
        }
        this.f10828q.shutdown();
        this.f10829r.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void close() {
        c(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    public final void d() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            c(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    public final void flush() {
        this.f10820D.flush();
    }

    public final synchronized Http2Stream j(int i2) {
        return (Http2Stream) this.f10824c.get(Integer.valueOf(i2));
    }

    public final synchronized int k() {
        int i2;
        Settings settings = this.f10818B;
        if ((settings.f10907a & 16) != 0) {
            i2 = settings.f10908b[4];
        } else {
            i2 = f.API_PRIORITY_OTHER;
        }
        return i2;
    }

    public final synchronized void l(NamedRunnable namedRunnable) {
        if (!this.f10827p) {
            this.f10829r.execute(namedRunnable);
        }
    }

    public final synchronized Http2Stream m(int i2) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f10824c.remove(Integer.valueOf(i2));
        notifyAll();
        return http2Stream;
    }

    public final void n(ErrorCode errorCode) {
        synchronized (this.f10820D) {
            synchronized (this) {
                if (!this.f10827p) {
                    this.f10827p = true;
                    int i2 = this.f10825e;
                    this.f10820D.k(i2, errorCode, Util.f10683a);
                }
            }
        }
    }

    public final void o() {
        boolean z3;
        int i2;
        Http2Writer http2Writer = this.f10820D;
        synchronized (http2Writer) {
            try {
                if (http2Writer.f10898e) {
                    throw new IOException("closed");
                } else if (http2Writer.f10896b) {
                    Logger logger = Http2Writer.f10894p;
                    if (logger.isLoggable(Level.FINE)) {
                        String n2 = Http2.f10806a.n();
                        byte[] bArr = Util.f10683a;
                        Locale locale = Locale.US;
                        logger.fine(">> CONNECTION " + n2);
                    }
                    http2Writer.f10895a.d((byte[]) Http2.f10806a.f1934a.clone());
                    http2Writer.f10895a.flush();
                }
            } finally {
            }
        }
        Http2Writer http2Writer2 = this.f10820D;
        Settings settings = this.f10817A;
        synchronized (http2Writer2) {
            try {
                if (!http2Writer2.f10898e) {
                    http2Writer2.j(0, Integer.bitCount(settings.f10907a) * 6, (byte) 4, (byte) 0);
                    for (int i5 = 0; i5 < 10; i5++) {
                        if (((1 << i5) & settings.f10907a) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i5 == 4) {
                                i2 = 3;
                            } else if (i5 == 7) {
                                i2 = 4;
                            } else {
                                i2 = i5;
                            }
                            o oVar = http2Writer2.f10895a;
                            if (!oVar.f1951c) {
                                d dVar = oVar.f1949a;
                                q w6 = dVar.w(2);
                                int i6 = w6.f1957c;
                                byte[] bArr2 = w6.f1955a;
                                bArr2[i6] = (byte) ((i2 >>> 8) & 255);
                                bArr2[i6 + 1] = (byte) (i2 & 255);
                                w6.f1957c = i6 + 2;
                                dVar.f1932b += 2;
                                oVar.c();
                                http2Writer2.f10895a.k(settings.f10908b[i5]);
                            } else {
                                throw new IllegalStateException("closed");
                            }
                        }
                    }
                    http2Writer2.f10895a.flush();
                } else {
                    throw new IOException("closed");
                }
            } finally {
            }
        }
        int a6 = this.f10817A.a();
        if (a6 != 65535) {
            this.f10820D.o(0, (long) (a6 - 65535));
        }
        new Thread(this.f10821E).start();
    }

    public final synchronized void p(long j6) {
        long j7 = this.f10836y + j6;
        this.f10836y = j7;
        if (j7 >= ((long) (this.f10817A.a() / 2))) {
            s(0, this.f10836y);
            this.f10836y = 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:27|28|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r4), r8.f10820D.d);
        r6 = (long) r2;
        r8.f10837z -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(int r9, boolean r10, N5.d r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            okhttp3.internal.http2.Http2Writer r12 = r8.f10820D
            r12.d(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0065
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.f10837z     // Catch:{ InterruptedException -> 0x0056 }
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0032
            java.util.LinkedHashMap r2 = r8.f10824c     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r2 == 0) goto L_0x002a
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            r9 = move-exception
            goto L_0x0063
        L_0x002a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0032:
            long r4 = java.lang.Math.min(r12, r4)     // Catch:{ all -> 0x0028 }
            int r2 = (int) r4     // Catch:{ all -> 0x0028 }
            okhttp3.internal.http2.Http2Writer r4 = r8.f10820D     // Catch:{ all -> 0x0028 }
            int r4 = r4.d     // Catch:{ all -> 0x0028 }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x0028 }
            long r4 = r8.f10837z     // Catch:{ all -> 0x0028 }
            long r6 = (long) r2     // Catch:{ all -> 0x0028 }
            long r4 = r4 - r6
            r8.f10837z = r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            long r12 = r12 - r6
            okhttp3.internal.http2.Http2Writer r4 = r8.f10820D
            if (r10 == 0) goto L_0x0051
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0051
            r5 = 1
            goto L_0x0052
        L_0x0051:
            r5 = r3
        L_0x0052:
            r4.d(r5, r9, r11, r2)
            goto L_0x000d
        L_0x0056:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0028 }
            r9.interrupt()     // Catch:{ all -> 0x0028 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0028 }
            r9.<init>()     // Catch:{ all -> 0x0028 }
            throw r9     // Catch:{ all -> 0x0028 }
        L_0x0063:
            monitor-exit(r8)     // Catch:{ all -> 0x0028 }
            throw r9
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.q(int, boolean, N5.d, long):void");
    }

    public final void r(final int i2, final ErrorCode errorCode) {
        try {
            this.f10828q.execute(new NamedRunnable(new Object[]{this.d, Integer.valueOf(i2)}) {
                public final void a() {
                    Http2Connection http2Connection = Http2Connection.this;
                    try {
                        http2Connection.f10820D.n(i2, errorCode);
                    } catch (IOException unused) {
                        ThreadPoolExecutor threadPoolExecutor = Http2Connection.f10816G;
                        http2Connection.d();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    public final void s(int i2, long j6) {
        try {
            final int i5 = i2;
            final long j7 = j6;
            this.f10828q.execute(new NamedRunnable(new Object[]{this.d, Integer.valueOf(i2)}) {
                public final void a() {
                    Http2Connection http2Connection = Http2Connection.this;
                    try {
                        http2Connection.f10820D.o(i5, j7);
                    } catch (IOException unused) {
                        ThreadPoolExecutor threadPoolExecutor = Http2Connection.f10816G;
                        http2Connection.d();
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }
}
