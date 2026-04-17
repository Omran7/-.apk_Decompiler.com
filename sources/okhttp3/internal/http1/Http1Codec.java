package okhttp3.internal.http1;

import N5.d;
import N5.j;
import N5.n;
import N5.o;
import N5.p;
import N5.t;
import N5.u;
import N5.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

public final class Http1Codec implements HttpCodec {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f10761a;

    /* renamed from: b  reason: collision with root package name */
    public final StreamAllocation f10762b;

    /* renamed from: c  reason: collision with root package name */
    public final p f10763c;
    public final o d;

    /* renamed from: e  reason: collision with root package name */
    public int f10764e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f10765f = 262144;

    public abstract class AbstractSource implements u {

        /* renamed from: a  reason: collision with root package name */
        public final j f10766a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10767b;

        /* renamed from: c  reason: collision with root package name */
        public long f10768c = 0;

        public AbstractSource() {
            this.f10766a = new j(Http1Codec.this.f10763c.f1953b.b());
        }

        public final w b() {
            return this.f10766a;
        }

        public final void c(boolean z3, IOException iOException) {
            Http1Codec http1Codec = Http1Codec.this;
            int i2 = http1Codec.f10764e;
            if (i2 != 6) {
                if (i2 == 5) {
                    j jVar = this.f10766a;
                    w wVar = jVar.f1939e;
                    jVar.f1939e = w.d;
                    wVar.a();
                    wVar.b();
                    http1Codec.f10764e = 6;
                    StreamAllocation streamAllocation = http1Codec.f10762b;
                    if (streamAllocation != null) {
                        streamAllocation.h(!z3, http1Codec, iOException);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("state: " + http1Codec.f10764e);
            }
        }

        public long e(long j6, d dVar) {
            try {
                long e6 = Http1Codec.this.f10763c.e(j6, dVar);
                if (e6 > 0) {
                    this.f10768c += e6;
                }
                return e6;
            } catch (IOException e7) {
                c(false, e7);
                throw e7;
            }
        }
    }

    public final class ChunkedSink implements t {

        /* renamed from: a  reason: collision with root package name */
        public final j f10769a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10770b;

        public ChunkedSink() {
            this.f10769a = new j(Http1Codec.this.d.f1950b.b());
        }

        public final w b() {
            return this.f10769a;
        }

        public final synchronized void close() {
            if (!this.f10770b) {
                this.f10770b = true;
                Http1Codec.this.d.g("0\r\n\r\n");
                Http1Codec http1Codec = Http1Codec.this;
                j jVar = this.f10769a;
                http1Codec.getClass();
                w wVar = jVar.f1939e;
                jVar.f1939e = w.d;
                wVar.a();
                wVar.b();
                Http1Codec.this.f10764e = 3;
            }
        }

        public final void f(long j6, d dVar) {
            if (this.f10770b) {
                throw new IllegalStateException("closed");
            } else if (j6 != 0) {
                Http1Codec http1Codec = Http1Codec.this;
                o oVar = http1Codec.d;
                if (!oVar.f1951c) {
                    oVar.f1949a.B(j6);
                    oVar.c();
                    o oVar2 = http1Codec.d;
                    oVar2.g("\r\n");
                    oVar2.f(j6, dVar);
                    oVar2.g("\r\n");
                    return;
                }
                throw new IllegalStateException("closed");
            }
        }

        public final synchronized void flush() {
            if (!this.f10770b) {
                Http1Codec.this.d.flush();
            }
        }
    }

    public class ChunkedSource extends AbstractSource {

        /* renamed from: e  reason: collision with root package name */
        public final HttpUrl f10772e;

        /* renamed from: f  reason: collision with root package name */
        public long f10773f = -1;

        /* renamed from: p  reason: collision with root package name */
        public boolean f10774p = true;

        public ChunkedSource(HttpUrl httpUrl) {
            super();
            this.f10772e = httpUrl;
        }

        public final void close() {
            boolean z3;
            if (!this.f10767b) {
                if (this.f10774p) {
                    try {
                        z3 = Util.r(this, 100, TimeUnit.MILLISECONDS);
                    } catch (IOException unused) {
                        z3 = false;
                    }
                    if (!z3) {
                        c(false, (IOException) null);
                    }
                }
                this.f10767b = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0061, code lost:
            if (r10 == 0) goto L_0x0064;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
            throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", new java.lang.Object[]{java.lang.Byte.valueOf(r12)}));
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long e(long r17, N5.d r19) {
            /*
                r16 = this;
                r1 = r16
                boolean r0 = r1.f10767b
                if (r0 != 0) goto L_0x012d
                boolean r0 = r1.f10774p
                r2 = -1
                if (r0 != 0) goto L_0x000d
                return r2
            L_0x000d:
                long r4 = r1.f10773f
                r6 = 0
                int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r8 = 0
                if (r0 == 0) goto L_0x001a
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 != 0) goto L_0x00e4
            L_0x001a:
                java.lang.String r0 = "expected chunk size and optional extensions but was \""
                int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                okhttp3.internal.http1.Http1Codec r5 = okhttp3.internal.http1.Http1Codec.this
                if (r4 == 0) goto L_0x002c
                N5.p r4 = r5.f10763c
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r4.o(r9)
            L_0x002c:
                N5.p r4 = r5.f10763c     // Catch:{ NumberFormatException -> 0x00a0 }
                N5.p r9 = r5.f10763c
                r10 = 1
                r4.q(r10)     // Catch:{ NumberFormatException -> 0x00a0 }
                r10 = r8
            L_0x0036:
                int r11 = r10 + 1
                long r12 = (long) r11     // Catch:{ NumberFormatException -> 0x00a0 }
                boolean r12 = r4.p(r12)     // Catch:{ NumberFormatException -> 0x00a0 }
                N5.d r13 = r4.f1952a     // Catch:{ NumberFormatException -> 0x00a0 }
                if (r12 == 0) goto L_0x0078
                long r14 = (long) r10     // Catch:{ NumberFormatException -> 0x00a0 }
                byte r12 = r13.j(r14)     // Catch:{ NumberFormatException -> 0x00a0 }
                r14 = 48
                if (r12 < r14) goto L_0x004e
                r14 = 57
                if (r12 <= r14) goto L_0x005f
            L_0x004e:
                r14 = 97
                if (r12 < r14) goto L_0x0056
                r14 = 102(0x66, float:1.43E-43)
                if (r12 <= r14) goto L_0x005f
            L_0x0056:
                r14 = 65
                if (r12 < r14) goto L_0x0061
                r14 = 70
                if (r12 <= r14) goto L_0x005f
                goto L_0x0061
            L_0x005f:
                r10 = r11
                goto L_0x0036
            L_0x0061:
                if (r10 == 0) goto L_0x0064
                goto L_0x0078
            L_0x0064:
                java.lang.NumberFormatException r0 = new java.lang.NumberFormatException     // Catch:{ NumberFormatException -> 0x00a0 }
                java.lang.Byte r2 = java.lang.Byte.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00a0 }
                java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ NumberFormatException -> 0x00a0 }
                java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was %#x"
                java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ NumberFormatException -> 0x00a0 }
                r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x00a0 }
                throw r0     // Catch:{ NumberFormatException -> 0x00a0 }
            L_0x0078:
                long r10 = r13.q()     // Catch:{ NumberFormatException -> 0x00a0 }
                r1.f10773f = r10     // Catch:{ NumberFormatException -> 0x00a0 }
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.String r4 = r9.o(r10)     // Catch:{ NumberFormatException -> 0x00a0 }
                java.lang.String r4 = r4.trim()     // Catch:{ NumberFormatException -> 0x00a0 }
                long r10 = r1.f10773f     // Catch:{ NumberFormatException -> 0x00a0 }
                int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r10 < 0) goto L_0x0107
                boolean r10 = r4.isEmpty()     // Catch:{ NumberFormatException -> 0x00a0 }
                if (r10 != 0) goto L_0x00a3
                java.lang.String r10 = ";"
                boolean r10 = r4.startsWith(r10)     // Catch:{ NumberFormatException -> 0x00a0 }
                if (r10 == 0) goto L_0x0107
                goto L_0x00a3
            L_0x00a0:
                r0 = move-exception
                goto L_0x0123
            L_0x00a3:
                long r10 = r1.f10773f
                int r0 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r0 != 0) goto L_0x00df
                r1.f10774p = r8
                okhttp3.OkHttpClient r0 = r5.f10761a
                okhttp3.CookieJar r0 = r0.f10591q
                okhttp3.Headers$Builder r4 = new okhttp3.Headers$Builder
                r4.<init>()
            L_0x00b4:
                long r6 = r5.f10765f
                java.lang.String r6 = r9.o(r6)
                long r10 = r5.f10765f
                int r7 = r6.length()
                long r12 = (long) r7
                long r10 = r10 - r12
                r5.f10765f = r10
                int r7 = r6.length()
                if (r7 == 0) goto L_0x00d0
                okhttp3.internal.Internal r7 = okhttp3.internal.Internal.f10681a
                r7.a(r4, r6)
                goto L_0x00b4
            L_0x00d0:
                okhttp3.Headers r5 = new okhttp3.Headers
                r5.<init>(r4)
                okhttp3.HttpUrl r4 = r1.f10772e
                okhttp3.internal.http.HttpHeaders.d(r0, r4, r5)
                r0 = 0
                r4 = 1
                r1.c(r4, r0)
            L_0x00df:
                boolean r0 = r1.f10774p
                if (r0 != 0) goto L_0x00e4
                return r2
            L_0x00e4:
                long r4 = r1.f10773f
                r6 = 8192(0x2000, double:4.0474E-320)
                long r4 = java.lang.Math.min(r6, r4)
                r0 = r19
                long r4 = super.e(r4, r0)
                int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x00fc
                long r2 = r1.f10773f
                long r2 = r2 - r4
                r1.f10773f = r2
                return r4
            L_0x00fc:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r2 = "unexpected end of stream"
                r0.<init>(r2)
                r1.c(r8, r0)
                throw r0
            L_0x0107:
                java.net.ProtocolException r2 = new java.net.ProtocolException     // Catch:{ NumberFormatException -> 0x00a0 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00a0 }
                r3.<init>(r0)     // Catch:{ NumberFormatException -> 0x00a0 }
                long r5 = r1.f10773f     // Catch:{ NumberFormatException -> 0x00a0 }
                r3.append(r5)     // Catch:{ NumberFormatException -> 0x00a0 }
                r3.append(r4)     // Catch:{ NumberFormatException -> 0x00a0 }
                java.lang.String r0 = "\""
                r3.append(r0)     // Catch:{ NumberFormatException -> 0x00a0 }
                java.lang.String r0 = r3.toString()     // Catch:{ NumberFormatException -> 0x00a0 }
                r2.<init>(r0)     // Catch:{ NumberFormatException -> 0x00a0 }
                throw r2     // Catch:{ NumberFormatException -> 0x00a0 }
            L_0x0123:
                java.net.ProtocolException r2 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r2.<init>(r0)
                throw r2
            L_0x012d:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1Codec.ChunkedSource.e(long, N5.d):long");
        }
    }

    public final class FixedLengthSink implements t {

        /* renamed from: a  reason: collision with root package name */
        public final j f10776a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f10777b;

        /* renamed from: c  reason: collision with root package name */
        public long f10778c;

        public FixedLengthSink(long j6) {
            this.f10776a = new j(Http1Codec.this.d.f1950b.b());
            this.f10778c = j6;
        }

        public final w b() {
            return this.f10776a;
        }

        public final void close() {
            if (!this.f10777b) {
                this.f10777b = true;
                if (this.f10778c <= 0) {
                    Http1Codec http1Codec = Http1Codec.this;
                    http1Codec.getClass();
                    j jVar = this.f10776a;
                    w wVar = jVar.f1939e;
                    jVar.f1939e = w.d;
                    wVar.a();
                    wVar.b();
                    http1Codec.f10764e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        public final void f(long j6, d dVar) {
            if (!this.f10777b) {
                long j7 = dVar.f1932b;
                byte[] bArr = Util.f10683a;
                if (j6 < 0 || 0 > j7 || j7 < j6) {
                    throw new ArrayIndexOutOfBoundsException();
                } else if (j6 <= this.f10778c) {
                    Http1Codec.this.d.f(j6, dVar);
                    this.f10778c -= j6;
                } else {
                    throw new ProtocolException("expected " + this.f10778c + " bytes but received " + j6);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public final void flush() {
            if (!this.f10777b) {
                Http1Codec.this.d.flush();
            }
        }
    }

    public class FixedLengthSource extends AbstractSource {

        /* renamed from: e  reason: collision with root package name */
        public long f10779e;

        public final void close() {
            boolean z3;
            if (!this.f10767b) {
                if (this.f10779e != 0) {
                    try {
                        z3 = Util.r(this, 100, TimeUnit.MILLISECONDS);
                    } catch (IOException unused) {
                        z3 = false;
                    }
                    if (!z3) {
                        c(false, (IOException) null);
                    }
                }
                this.f10767b = true;
            }
        }

        public final long e(long j6, d dVar) {
            if (!this.f10767b) {
                long j7 = this.f10779e;
                if (j7 == 0) {
                    return -1;
                }
                long e6 = super.e(Math.min(j7, 8192), dVar);
                if (e6 != -1) {
                    long j8 = this.f10779e - e6;
                    this.f10779e = j8;
                    if (j8 == 0) {
                        c(true, (IOException) null);
                    }
                    return e6;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c(false, protocolException);
                throw protocolException;
            }
            throw new IllegalStateException("closed");
        }
    }

    public class UnknownLengthSource extends AbstractSource {

        /* renamed from: e  reason: collision with root package name */
        public boolean f10780e;

        public final void close() {
            if (!this.f10767b) {
                if (!this.f10780e) {
                    c(false, (IOException) null);
                }
                this.f10767b = true;
            }
        }

        public final long e(long j6, d dVar) {
            if (this.f10767b) {
                throw new IllegalStateException("closed");
            } else if (this.f10780e) {
                return -1;
            } else {
                long e6 = super.e(8192, dVar);
                if (e6 != -1) {
                    return e6;
                }
                this.f10780e = true;
                c(true, (IOException) null);
                return -1;
            }
        }
    }

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, p pVar, o oVar) {
        this.f10761a = okHttpClient;
        this.f10762b = streamAllocation;
        this.f10763c = pVar;
        this.d = oVar;
    }

    public final void a() {
        this.d.flush();
    }

    public final void b(Request request) {
        Proxy.Type type = this.f10762b.a().f10709c.f10673b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(request.f10638b);
        sb.append(' ');
        HttpUrl httpUrl = request.f10637a;
        if (httpUrl.f10562a.equals("https") || type != Proxy.Type.HTTP) {
            sb.append(RequestLine.a(httpUrl));
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        h(request.f10639c, sb.toString());
    }

    public final RealResponseBody c(Response response) {
        StreamAllocation streamAllocation = this.f10762b;
        streamAllocation.f10733f.getClass();
        String d6 = response.d("Content-Type");
        if (!HttpHeaders.b(response)) {
            u g = g(0);
            Logger logger = n.f1948a;
            return new RealResponseBody(d6, 0, new p(g));
        } else if ("chunked".equalsIgnoreCase(response.d("Transfer-Encoding"))) {
            HttpUrl httpUrl = response.f10649a.f10637a;
            if (this.f10764e == 4) {
                this.f10764e = 5;
                ChunkedSource chunkedSource = new ChunkedSource(httpUrl);
                Logger logger2 = n.f1948a;
                return new RealResponseBody(d6, -1, new p(chunkedSource));
            }
            throw new IllegalStateException("state: " + this.f10764e);
        } else {
            long a6 = HttpHeaders.a(response);
            if (a6 != -1) {
                u g5 = g(a6);
                Logger logger3 = n.f1948a;
                return new RealResponseBody(d6, a6, new p(g5));
            } else if (this.f10764e == 4) {
                this.f10764e = 5;
                streamAllocation.e();
                AbstractSource abstractSource = new AbstractSource();
                Logger logger4 = n.f1948a;
                return new RealResponseBody(d6, -1, new p(abstractSource));
            } else {
                throw new IllegalStateException("state: " + this.f10764e);
            }
        }
    }

    public final void cancel() {
        RealConnection a6 = this.f10762b.a();
        if (a6 != null) {
            Util.f(a6.d);
        }
    }

    public final void d() {
        this.d.flush();
    }

    public final t e(Request request, long j6) {
        if ("chunked".equalsIgnoreCase(request.f10639c.a("Transfer-Encoding"))) {
            if (this.f10764e == 1) {
                this.f10764e = 2;
                return new ChunkedSink();
            }
            throw new IllegalStateException("state: " + this.f10764e);
        } else if (j6 == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f10764e == 1) {
            this.f10764e = 2;
            return new FixedLengthSink(j6);
        } else {
            throw new IllegalStateException("state: " + this.f10764e);
        }
    }

    public final Response.Builder f(boolean z3) {
        p pVar = this.f10763c;
        int i2 = this.f10764e;
        if (i2 == 1 || i2 == 3) {
            try {
                String o6 = pVar.o(this.f10765f);
                this.f10765f -= (long) o6.length();
                StatusLine a6 = StatusLine.a(o6);
                int i5 = a6.f10759b;
                Response.Builder builder = new Response.Builder();
                builder.f10662b = a6.f10758a;
                builder.f10663c = i5;
                builder.d = a6.f10760c;
                Headers.Builder builder2 = new Headers.Builder();
                while (true) {
                    String o7 = pVar.o(this.f10765f);
                    this.f10765f -= (long) o7.length();
                    if (o7.length() == 0) {
                        break;
                    }
                    Internal.f10681a.a(builder2, o7);
                }
                builder.f10665f = new Headers(builder2).c();
                if (z3 && i5 == 100) {
                    return null;
                }
                if (i5 == 100) {
                    this.f10764e = 3;
                    return builder;
                }
                this.f10764e = 4;
                return builder;
            } catch (EOFException e6) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f10762b);
                iOException.initCause(e6);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f10764e);
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [okhttp3.internal.http1.Http1Codec$FixedLengthSource, okhttp3.internal.http1.Http1Codec$AbstractSource, N5.u] */
    public final u g(long j6) {
        if (this.f10764e == 4) {
            this.f10764e = 5;
            ? abstractSource = new AbstractSource();
            abstractSource.f10779e = j6;
            if (j6 == 0) {
                abstractSource.c(true, (IOException) null);
            }
            return abstractSource;
        }
        throw new IllegalStateException("state: " + this.f10764e);
    }

    public final void h(Headers headers, String str) {
        if (this.f10764e == 0) {
            o oVar = this.d;
            oVar.g(str);
            oVar.g("\r\n");
            int d6 = headers.d();
            for (int i2 = 0; i2 < d6; i2++) {
                oVar.g(headers.b(i2));
                oVar.g(": ");
                oVar.g(headers.e(i2));
                oVar.g("\r\n");
            }
            oVar.g("\r\n");
            this.f10764e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f10764e);
    }
}
