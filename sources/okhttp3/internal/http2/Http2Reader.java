package okhttp3.internal.http2;

import N5.d;
import N5.g;
import N5.p;
import N5.u;
import N5.w;
import com.google.android.gms.common.api.f;
import java.io.Closeable;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;

final class Http2Reader implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    public static final Logger f10868e = Logger.getLogger(Http2.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final p f10869a;

    /* renamed from: b  reason: collision with root package name */
    public final ContinuationSource f10870b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10871c;
    public final Hpack.Reader d;

    public static final class ContinuationSource implements u {

        /* renamed from: a  reason: collision with root package name */
        public final p f10872a;

        /* renamed from: b  reason: collision with root package name */
        public int f10873b;

        /* renamed from: c  reason: collision with root package name */
        public byte f10874c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f10875e;

        /* renamed from: f  reason: collision with root package name */
        public short f10876f;

        public ContinuationSource(p pVar) {
            this.f10872a = pVar;
        }

        public final w b() {
            return this.f10872a.f1953b.b();
        }

        public final void close() {
        }

        public final long e(long j6, d dVar) {
            int i2;
            int m6;
            do {
                int i5 = this.f10875e;
                p pVar = this.f10872a;
                if (i5 == 0) {
                    pVar.a((long) this.f10876f);
                    this.f10876f = 0;
                    if ((this.f10874c & 4) != 0) {
                        return -1;
                    }
                    i2 = this.d;
                    int l6 = Http2Reader.l(pVar);
                    this.f10875e = l6;
                    this.f10873b = l6;
                    byte j7 = (byte) (pVar.j() & 255);
                    this.f10874c = (byte) (pVar.j() & 255);
                    Logger logger = Http2Reader.f10868e;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(Http2.a(true, this.d, this.f10873b, j7, this.f10874c));
                    }
                    m6 = pVar.m() & f.API_PRIORITY_OTHER;
                    this.d = m6;
                    if (j7 != 9) {
                        Http2.c("%s != TYPE_CONTINUATION", Byte.valueOf(j7));
                        throw null;
                    }
                } else {
                    long e6 = pVar.e(Math.min(8192, (long) i5), dVar);
                    if (e6 == -1) {
                        return -1;
                    }
                    this.f10875e = (int) (((long) this.f10875e) - e6);
                    return e6;
                }
            } while (m6 == i2);
            Http2.c("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    public interface Handler {
    }

    public Http2Reader(p pVar, boolean z3) {
        this.f10869a = pVar;
        this.f10871c = z3;
        ContinuationSource continuationSource = new ContinuationSource(pVar);
        this.f10870b = continuationSource;
        this.d = new Hpack.Reader(continuationSource);
    }

    public static int c(int i2, byte b6, short s6) {
        if ((b6 & 8) != 0) {
            i2--;
        }
        if (s6 <= i2) {
            return (short) (i2 - s6);
        }
        Http2.c("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s6), Integer.valueOf(i2));
        throw null;
    }

    public static int l(p pVar) {
        return (pVar.j() & 255) | ((pVar.j() & 255) << 16) | ((pVar.j() & 255) << 8);
    }

    public final void close() {
        this.f10869a.close();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v5, types: [int] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [int] */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(boolean r13, okhttp3.internal.http2.Http2Connection.ReaderRunnable r14) {
        /*
            r12 = this;
            N5.p r0 = r12.f10869a
            r1 = 9
            r3 = 0
            r0.q(r1)     // Catch:{ IOException -> 0x0317 }
            int r1 = l(r0)
            r2 = 0
            if (r1 < 0) goto L_0x0309
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r1 > r4) goto L_0x0309
            byte r5 = r0.j()
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6 = 4
            if (r13 == 0) goto L_0x002e
            if (r5 != r6) goto L_0x0020
            goto L_0x002e
        L_0x0020:
            java.lang.Byte r13 = java.lang.Byte.valueOf(r5)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "Expected a SETTINGS frame but was %s"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x002e:
            byte r13 = r0.j()
            r13 = r13 & 255(0xff, float:3.57E-43)
            byte r13 = (byte) r13
            int r7 = r0.m()
            r8 = 2147483647(0x7fffffff, float:NaN)
            r7 = r7 & r8
            java.util.logging.Level r9 = java.util.logging.Level.FINE
            java.util.logging.Logger r10 = f10868e
            boolean r9 = r10.isLoggable(r9)
            r11 = 1
            if (r9 == 0) goto L_0x004f
            java.lang.String r9 = okhttp3.internal.http2.Http2.a(r11, r7, r1, r5, r13)
            r10.fine(r9)
        L_0x004f:
            r9 = 8
            r10 = 5
            switch(r5) {
                case 0: goto L_0x02d5;
                case 1: goto L_0x02a4;
                case 2: goto L_0x0285;
                case 3: goto L_0x0240;
                case 4: goto L_0x01ab;
                case 5: goto L_0x0182;
                case 6: goto L_0x0157;
                case 7: goto L_0x00b6;
                case 8: goto L_0x005b;
                default: goto L_0x0055;
            }
        L_0x0055:
            long r13 = (long) r1
            r0.a(r13)
            goto L_0x02f8
        L_0x005b:
            if (r1 != r6) goto L_0x00a8
            int r13 = r0.m()
            long r0 = (long) r13
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r3
            r3 = 0
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 == 0) goto L_0x009a
            if (r7 != 0) goto L_0x0081
            okhttp3.internal.http2.Http2Connection r2 = okhttp3.internal.http2.Http2Connection.this
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Connection r13 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x007e }
            long r3 = r13.f10837z     // Catch:{ all -> 0x007e }
            long r3 = r3 + r0
            r13.f10837z = r3     // Catch:{ all -> 0x007e }
            r13.notifyAll()     // Catch:{ all -> 0x007e }
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            goto L_0x02f8
        L_0x007e:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x007e }
            throw r13
        L_0x0081:
            okhttp3.internal.http2.Http2Connection r14 = okhttp3.internal.http2.Http2Connection.this
            okhttp3.internal.http2.Http2Stream r14 = r14.j(r7)
            if (r14 == 0) goto L_0x02f8
            monitor-enter(r14)
            long r2 = r14.f10878b     // Catch:{ all -> 0x0097 }
            long r2 = r2 + r0
            r14.f10878b = r2     // Catch:{ all -> 0x0097 }
            if (r13 <= 0) goto L_0x0094
            r14.notifyAll()     // Catch:{ all -> 0x0097 }
        L_0x0094:
            monitor-exit(r14)     // Catch:{ all -> 0x0097 }
            goto L_0x02f8
        L_0x0097:
            r13 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x0097 }
            throw r13
        L_0x009a:
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "windowSizeIncrement was 0"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x00a8:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_WINDOW_UPDATE length !=4: %s"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x00b6:
            if (r1 < r9) goto L_0x0149
            if (r7 != 0) goto L_0x0141
            int r13 = r0.m()
            int r4 = r0.m()
            int r1 = r1 - r9
            okhttp3.internal.http2.ErrorCode[] r5 = okhttp3.internal.http2.ErrorCode.values()
            int r6 = r5.length
            r7 = r3
        L_0x00c9:
            if (r7 >= r6) goto L_0x00d5
            r8 = r5[r7]
            int r9 = r8.f10787a
            if (r9 != r4) goto L_0x00d2
            goto L_0x00d6
        L_0x00d2:
            int r7 = r7 + 1
            goto L_0x00c9
        L_0x00d5:
            r8 = r2
        L_0x00d6:
            if (r8 == 0) goto L_0x0133
            N5.g r2 = N5.g.f1933e
            if (r1 <= 0) goto L_0x00e1
            long r1 = (long) r1
            N5.g r2 = r0.k(r1)
        L_0x00e1:
            r2.x()
            okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this
            monitor-enter(r0)
            okhttp3.internal.http2.Http2Connection r1 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0130 }
            java.util.LinkedHashMap r1 = r1.f10824c     // Catch:{ all -> 0x0130 }
            java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0130 }
            okhttp3.internal.http2.Http2Connection r2 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0130 }
            java.util.LinkedHashMap r2 = r2.f10824c     // Catch:{ all -> 0x0130 }
            int r2 = r2.size()     // Catch:{ all -> 0x0130 }
            okhttp3.internal.http2.Http2Stream[] r2 = new okhttp3.internal.http2.Http2Stream[r2]     // Catch:{ all -> 0x0130 }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0130 }
            okhttp3.internal.http2.Http2Stream[] r1 = (okhttp3.internal.http2.Http2Stream[]) r1     // Catch:{ all -> 0x0130 }
            okhttp3.internal.http2.Http2Connection r2 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ all -> 0x0130 }
            r2.f10827p = r11     // Catch:{ all -> 0x0130 }
            monitor-exit(r0)     // Catch:{ all -> 0x0130 }
            int r0 = r1.length
        L_0x0105:
            if (r3 >= r0) goto L_0x02f8
            r2 = r1[r3]
            int r4 = r2.f10879c
            if (r4 <= r13) goto L_0x012d
            boolean r4 = r2.f()
            if (r4 == 0) goto L_0x012d
            okhttp3.internal.http2.ErrorCode r4 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM
            monitor-enter(r2)
            okhttp3.internal.http2.ErrorCode r5 = r2.f10884k     // Catch:{ all -> 0x0120 }
            if (r5 != 0) goto L_0x0122
            r2.f10884k = r4     // Catch:{ all -> 0x0120 }
            r2.notifyAll()     // Catch:{ all -> 0x0120 }
            goto L_0x0122
        L_0x0120:
            r13 = move-exception
            goto L_0x012b
        L_0x0122:
            monitor-exit(r2)
            okhttp3.internal.http2.Http2Connection r4 = okhttp3.internal.http2.Http2Connection.this
            int r2 = r2.f10879c
            r4.m(r2)
            goto L_0x012d
        L_0x012b:
            monitor-exit(r2)     // Catch:{ all -> 0x0120 }
            throw r13
        L_0x012d:
            int r3 = r3 + 1
            goto L_0x0105
        L_0x0130:
            r13 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0130 }
            throw r13
        L_0x0133:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_GOAWAY unexpected error code: %d"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0141:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r14 = "TYPE_GOAWAY streamId != 0"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0149:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_GOAWAY length < 8: %s"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0157:
            if (r1 != r9) goto L_0x0174
            if (r7 != 0) goto L_0x016c
            int r1 = r0.m()
            int r0 = r0.m()
            r13 = r13 & r11
            if (r13 == 0) goto L_0x0167
            r3 = r11
        L_0x0167:
            r14.d(r1, r0, r3)
            goto L_0x02f8
        L_0x016c:
            java.lang.String r13 = "TYPE_PING streamId != 0"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x0174:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_PING length != 8: %s"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0182:
            if (r7 == 0) goto L_0x01a3
            r2 = r13 & 8
            if (r2 == 0) goto L_0x018f
            byte r2 = r0.j()
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r3 = (short) r2
        L_0x018f:
            int r0 = r0.m()
            r0 = r0 & r8
            int r1 = r1 + -4
            int r1 = c(r1, r13, r3)
            java.util.ArrayList r13 = r12.k(r1, r3, r13, r7)
            r14.e(r0, r13)
            goto L_0x02f8
        L_0x01a3:
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x01ab:
            if (r7 != 0) goto L_0x0238
            r13 = r13 & r11
            if (r13 == 0) goto L_0x01bc
            if (r1 != 0) goto L_0x01b4
            goto L_0x02f8
        L_0x01b4:
            java.lang.String r13 = "FRAME_SIZE_ERROR ack frame should be empty!"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x01bc:
            int r13 = r1 % 6
            if (r13 != 0) goto L_0x022a
            okhttp3.internal.http2.Settings r13 = new okhttp3.internal.http2.Settings
            r13.<init>()
            r5 = r3
        L_0x01c6:
            if (r5 >= r1) goto L_0x0216
            short r7 = r0.n()
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            int r8 = r0.m()
            r9 = 2
            if (r7 == r9) goto L_0x0203
            r9 = 3
            if (r7 == r9) goto L_0x0201
            if (r7 == r6) goto L_0x01f5
            if (r7 == r10) goto L_0x01df
            goto L_0x0210
        L_0x01df:
            if (r8 < r4) goto L_0x01e7
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 > r9) goto L_0x01e7
            goto L_0x0210
        L_0x01e7:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x01f5:
            if (r8 < 0) goto L_0x01f9
            r7 = 7
            goto L_0x0210
        L_0x01f9:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x0201:
            r7 = r6
            goto L_0x0210
        L_0x0203:
            if (r8 == 0) goto L_0x0210
            if (r8 != r11) goto L_0x0208
            goto L_0x0210
        L_0x0208:
            java.lang.String r13 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x0210:
            r13.b(r7, r8)
            int r5 = r5 + 6
            goto L_0x01c6
        L_0x0216:
            okhttp3.internal.http2.Http2Connection r0 = okhttp3.internal.http2.Http2Connection.this     // Catch:{ RejectedExecutionException -> 0x02f8 }
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r0.f10828q     // Catch:{ RejectedExecutionException -> 0x02f8 }
            okhttp3.internal.http2.Http2Connection$ReaderRunnable$2 r2 = new okhttp3.internal.http2.Http2Connection$ReaderRunnable$2     // Catch:{ RejectedExecutionException -> 0x02f8 }
            java.lang.String r0 = r0.d     // Catch:{ RejectedExecutionException -> 0x02f8 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ RejectedExecutionException -> 0x02f8 }
            r2.<init>(r0, r13)     // Catch:{ RejectedExecutionException -> 0x02f8 }
            r1.execute(r2)     // Catch:{ RejectedExecutionException -> 0x02f8 }
            goto L_0x02f8
        L_0x022a:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_SETTINGS length %% 6 != 0: %s"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0238:
            java.lang.String r13 = "TYPE_SETTINGS streamId != 0"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x0240:
            if (r1 != r6) goto L_0x0277
            if (r7 == 0) goto L_0x026f
            int r13 = r0.m()
            okhttp3.internal.http2.ErrorCode[] r0 = okhttp3.internal.http2.ErrorCode.values()
            int r1 = r0.length
        L_0x024d:
            if (r3 >= r1) goto L_0x0259
            r4 = r0[r3]
            int r5 = r4.f10787a
            if (r5 != r13) goto L_0x0256
            goto L_0x025a
        L_0x0256:
            int r3 = r3 + 1
            goto L_0x024d
        L_0x0259:
            r4 = r2
        L_0x025a:
            if (r4 == 0) goto L_0x0261
            r14.f(r7, r4)
            goto L_0x02f8
        L_0x0261:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_RST_STREAM unexpected error code: %d"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x026f:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r14 = "TYPE_RST_STREAM streamId == 0"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0277:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_RST_STREAM length: %d != 4"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0285:
            if (r1 != r10) goto L_0x0296
            if (r7 == 0) goto L_0x028e
            r12.m(r14, r7)
            goto L_0x02f8
        L_0x028e:
            java.lang.Object[] r13 = new java.lang.Object[r3]
            java.lang.String r14 = "TYPE_PRIORITY streamId == 0"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0296:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "TYPE_PRIORITY length: %d != 5"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x02a4:
            if (r7 == 0) goto L_0x02cd
            r2 = r13 & 1
            if (r2 == 0) goto L_0x02ac
            r2 = r11
            goto L_0x02ad
        L_0x02ac:
            r2 = r3
        L_0x02ad:
            r4 = r13 & 8
            if (r4 == 0) goto L_0x02b8
            byte r0 = r0.j()
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r3 = (short) r0
        L_0x02b8:
            r0 = r13 & 32
            if (r0 == 0) goto L_0x02c1
            r12.m(r14, r7)
            int r1 = r1 + -5
        L_0x02c1:
            int r0 = c(r1, r13, r3)
            java.util.ArrayList r13 = r12.k(r0, r3, r13, r7)
            r14.c(r2, r7, r13)
            goto L_0x02f8
        L_0x02cd:
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x02d5:
            if (r7 == 0) goto L_0x0301
            r4 = r13 & 1
            if (r4 == 0) goto L_0x02dd
            r4 = r11
            goto L_0x02de
        L_0x02dd:
            r4 = r3
        L_0x02de:
            r5 = r13 & 32
            if (r5 != 0) goto L_0x02f9
            r2 = r13 & 8
            if (r2 == 0) goto L_0x02ed
            byte r2 = r0.j()
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r3 = (short) r2
        L_0x02ed:
            int r13 = c(r1, r13, r3)
            r14.b(r4, r7, r0, r13)
            long r13 = (long) r3
            r0.a(r13)
        L_0x02f8:
            return r11
        L_0x02f9:
            java.lang.String r13 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x0301:
            java.lang.String r13 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            java.lang.Object[] r14 = new java.lang.Object[r3]
            okhttp3.internal.http2.Http2.c(r13, r14)
            throw r2
        L_0x0309:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r14 = "FRAME_SIZE_ERROR: %s"
            okhttp3.internal.http2.Http2.c(r14, r13)
            throw r2
        L_0x0317:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.d(boolean, okhttp3.internal.http2.Http2Connection$ReaderRunnable):boolean");
    }

    public final void j(Http2Connection.ReaderRunnable readerRunnable) {
        if (!this.f10871c) {
            g gVar = Http2.f10806a;
            g k6 = this.f10869a.k((long) gVar.f1934a.length);
            Level level = Level.FINE;
            Logger logger = f10868e;
            if (logger.isLoggable(level)) {
                String n2 = k6.n();
                byte[] bArr = Util.f10683a;
                Locale locale = Locale.US;
                logger.fine("<< CONNECTION " + n2);
            }
            if (!gVar.equals(k6)) {
                Http2.c("Expected a connection header but was %s", k6.A());
                throw null;
            }
        } else if (!d(true, readerRunnable)) {
            Http2.c("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        throw new java.io.IOException(com.google.android.gms.internal.measurement.a.f(r4, "Header index too large "));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList k(int r3, short r4, byte r5, int r6) {
        /*
            r2 = this;
            okhttp3.internal.http2.Http2Reader$ContinuationSource r0 = r2.f10870b
            r0.f10875e = r3
            r0.f10873b = r3
            r0.f10876f = r4
            r0.f10874c = r5
            r0.d = r6
        L_0x000c:
            okhttp3.internal.http2.Hpack$Reader r3 = r2.d
            N5.p r4 = r3.f10797b
            boolean r5 = r4.c()
            java.util.ArrayList r6 = r3.f10796a
            if (r5 != 0) goto L_0x011d
            byte r4 = r4.j()
            r5 = r4 & 255(0xff, float:3.57E-43)
            r0 = 128(0x80, float:1.794E-43)
            if (r5 == r0) goto L_0x0115
            r1 = r4 & 128(0x80, float:1.794E-43)
            if (r1 != r0) goto L_0x005f
            r4 = 127(0x7f, float:1.78E-43)
            int r4 = r3.e(r5, r4)
            int r5 = r4 + -1
            if (r5 < 0) goto L_0x003d
            okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.f10794a
            int r1 = r0.length
            int r1 = r1 + -1
            if (r5 > r1) goto L_0x003d
            r3 = r0[r5]
            r6.add(r3)
            goto L_0x000c
        L_0x003d:
            okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.f10794a
            int r0 = r0.length
            int r5 = r5 - r0
            int r0 = r3.f10800f
            int r0 = r0 + 1
            int r0 = r0 + r5
            if (r0 < 0) goto L_0x0053
            okhttp3.internal.http2.Header[] r3 = r3.f10799e
            int r5 = r3.length
            if (r0 >= r5) goto L_0x0053
            r3 = r3[r0]
            r6.add(r3)
            goto L_0x000c
        L_0x0053:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r5 = "Header index too large "
            java.lang.String r4 = com.google.android.gms.internal.measurement.a.f(r4, r5)
            r3.<init>(r4)
            throw r3
        L_0x005f:
            r0 = 64
            if (r5 != r0) goto L_0x0077
            N5.g r4 = r3.d()
            okhttp3.internal.http2.Hpack.a(r4)
            N5.g r5 = r3.d()
            okhttp3.internal.http2.Header r6 = new okhttp3.internal.http2.Header
            r6.<init>((N5.g) r4, (N5.g) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0077:
            r1 = r4 & 64
            if (r1 != r0) goto L_0x0095
            r4 = 63
            int r4 = r3.e(r5, r4)
            int r4 = r4 + -1
            N5.g r4 = r3.b(r4)
            N5.g r5 = r3.d()
            okhttp3.internal.http2.Header r6 = new okhttp3.internal.http2.Header
            r6.<init>((N5.g) r4, (N5.g) r5)
            r3.c(r6)
            goto L_0x000c
        L_0x0095:
            r4 = r4 & 32
            r0 = 32
            if (r4 != r0) goto L_0x00df
            r4 = 31
            int r4 = r3.e(r5, r4)
            r3.d = r4
            if (r4 < 0) goto L_0x00c9
            int r5 = r3.f10798c
            if (r4 > r5) goto L_0x00c9
            int r5 = r3.h
            if (r4 >= r5) goto L_0x000c
            if (r4 != 0) goto L_0x00c3
            okhttp3.internal.http2.Header[] r4 = r3.f10799e
            r5 = 0
            java.util.Arrays.fill(r4, r5)
            okhttp3.internal.http2.Header[] r4 = r3.f10799e
            int r4 = r4.length
            int r4 = r4 + -1
            r3.f10800f = r4
            r4 = 0
            r3.g = r4
            r3.h = r4
            goto L_0x000c
        L_0x00c3:
            int r5 = r5 - r4
            r3.a(r5)
            goto L_0x000c
        L_0x00c9:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Invalid dynamic table size update "
            r5.<init>(r6)
            int r3 = r3.d
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x00df:
            r4 = 16
            if (r5 == r4) goto L_0x0100
            if (r5 != 0) goto L_0x00e6
            goto L_0x0100
        L_0x00e6:
            r4 = 15
            int r4 = r3.e(r5, r4)
            int r4 = r4 + -1
            N5.g r4 = r3.b(r4)
            N5.g r3 = r3.d()
            okhttp3.internal.http2.Header r5 = new okhttp3.internal.http2.Header
            r5.<init>((N5.g) r4, (N5.g) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0100:
            N5.g r4 = r3.d()
            okhttp3.internal.http2.Hpack.a(r4)
            N5.g r3 = r3.d()
            okhttp3.internal.http2.Header r5 = new okhttp3.internal.http2.Header
            r5.<init>((N5.g) r4, (N5.g) r3)
            r6.add(r5)
            goto L_0x000c
        L_0x0115:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "index == 0"
            r3.<init>(r4)
            throw r3
        L_0x011d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r6)
            r6.clear()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Reader.k(int, short, byte, int):java.util.ArrayList");
    }

    public final void m(Http2Connection.ReaderRunnable readerRunnable, int i2) {
        p pVar = this.f10869a;
        pVar.m();
        pVar.j();
    }
}
