package okhttp3.internal.http2;

import N5.d;
import N5.g;
import N5.i;
import N5.n;
import N5.p;
import N5.t;
import N5.u;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.http2.Http2Stream;

public final class Http2Codec implements HttpCodec {

    /* renamed from: f  reason: collision with root package name */
    public static final List f10809f = Util.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List g = Util.n("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: a  reason: collision with root package name */
    public final RealInterceptorChain f10810a;

    /* renamed from: b  reason: collision with root package name */
    public final StreamAllocation f10811b;

    /* renamed from: c  reason: collision with root package name */
    public final Http2Connection f10812c;
    public Http2Stream d;

    /* renamed from: e  reason: collision with root package name */
    public final Protocol f10813e;

    public class StreamFinishingSource extends i {

        /* renamed from: b  reason: collision with root package name */
        public boolean f10814b = false;

        /* renamed from: c  reason: collision with root package name */
        public long f10815c = 0;

        public StreamFinishingSource(u uVar) {
            super(uVar);
        }

        public final void close() {
            super.close();
            if (!this.f10814b) {
                this.f10814b = true;
                Http2Codec http2Codec = Http2Codec.this;
                http2Codec.f10811b.h(false, http2Codec, (IOException) null);
            }
        }

        public final long e(long j6, d dVar) {
            try {
                long e6 = this.f1938a.e(8192, dVar);
                if (e6 > 0) {
                    this.f10815c += e6;
                }
                return e6;
            } catch (IOException e7) {
                if (!this.f10814b) {
                    this.f10814b = true;
                    Http2Codec http2Codec = Http2Codec.this;
                    http2Codec.f10811b.h(false, http2Codec, e7);
                }
                throw e7;
            }
        }
    }

    public Http2Codec(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain, StreamAllocation streamAllocation, Http2Connection http2Connection) {
        this.f10810a = realInterceptorChain;
        this.f10811b = streamAllocation;
        this.f10812c = http2Connection;
        List list = okHttpClient.f10586b;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f10813e = !list.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    public final void a() {
        ((Http2Stream.FramingSink) this.d.e()).close();
    }

    public final void b(Request request) {
        boolean z3;
        int i2;
        Http2Stream http2Stream;
        if (this.d == null) {
            boolean z4 = true;
            if (request.d != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            Headers headers = request.f10639c;
            ArrayList arrayList = new ArrayList(headers.d() + 4);
            arrayList.add(new Header(Header.f10789f, request.f10638b));
            g gVar = Header.g;
            HttpUrl httpUrl = request.f10637a;
            arrayList.add(new Header(gVar, RequestLine.a(httpUrl)));
            String a6 = request.f10639c.a("Host");
            if (a6 != null) {
                arrayList.add(new Header(Header.f10790i, a6));
            }
            arrayList.add(new Header(Header.h, httpUrl.f10562a));
            int d6 = headers.d();
            for (int i5 = 0; i5 < d6; i5++) {
                g k6 = g.k(headers.b(i5).toLowerCase(Locale.US));
                if (!f10809f.contains(k6.A())) {
                    arrayList.add(new Header(k6, headers.e(i5)));
                }
            }
            Http2Connection http2Connection = this.f10812c;
            boolean z5 = !z3;
            synchronized (http2Connection.f10820D) {
                synchronized (http2Connection) {
                    try {
                        if (http2Connection.f10826f > 1073741823) {
                            http2Connection.n(ErrorCode.REFUSED_STREAM);
                        }
                        if (!http2Connection.f10827p) {
                            i2 = http2Connection.f10826f;
                            http2Connection.f10826f = i2 + 2;
                            http2Stream = new Http2Stream(i2, http2Connection, z5, false, (Headers) null);
                            if (z3 && http2Connection.f10837z != 0) {
                                if (http2Stream.f10878b != 0) {
                                    z4 = false;
                                }
                            }
                            if (http2Stream.g()) {
                                http2Connection.f10824c.put(Integer.valueOf(i2), http2Stream);
                            }
                        } else {
                            throw new ConnectionShutdownException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Http2Writer http2Writer = http2Connection.f10820D;
                synchronized (http2Writer) {
                    if (!http2Writer.f10898e) {
                        http2Writer.l(z5, i2, arrayList);
                    } else {
                        throw new IOException("closed");
                    }
                }
            }
            if (z4) {
                http2Connection.f10820D.flush();
            }
            this.d = http2Stream;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            http2Stream.f10882i.g((long) this.f10810a.f10749j, timeUnit);
            this.d.f10883j.g((long) this.f10810a.f10750k, timeUnit);
        }
    }

    public final RealResponseBody c(Response response) {
        this.f10811b.f10733f.getClass();
        String d6 = response.d("Content-Type");
        long a6 = HttpHeaders.a(response);
        StreamFinishingSource streamFinishingSource = new StreamFinishingSource(this.d.g);
        Logger logger = n.f1948a;
        return new RealResponseBody(d6, a6, new p(streamFinishingSource));
    }

    public final void cancel() {
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            ErrorCode errorCode = ErrorCode.CANCEL;
            if (http2Stream.d(errorCode)) {
                http2Stream.d.r(http2Stream.f10879c, errorCode);
            }
        }
    }

    public final void d() {
        this.f10812c.flush();
    }

    public final t e(Request request, long j6) {
        return this.d.e();
    }

    /* JADX INFO: finally extract failed */
    public final Response.Builder f(boolean z3) {
        Headers headers;
        Http2Stream http2Stream = this.d;
        synchronized (http2Stream) {
            http2Stream.f10882i.i();
            while (http2Stream.f10880e.isEmpty() && http2Stream.f10884k == null) {
                try {
                    http2Stream.i();
                } catch (Throwable th) {
                    http2Stream.f10882i.n();
                    throw th;
                }
            }
            http2Stream.f10882i.n();
            if (!http2Stream.f10880e.isEmpty()) {
                headers = (Headers) http2Stream.f10880e.removeFirst();
            } else {
                throw new StreamResetException(http2Stream.f10884k);
            }
        }
        Protocol protocol = this.f10813e;
        Headers.Builder builder = new Headers.Builder();
        int d6 = headers.d();
        StatusLine statusLine = null;
        for (int i2 = 0; i2 < d6; i2++) {
            String b6 = headers.b(i2);
            String e6 = headers.e(i2);
            if (b6.equals(":status")) {
                statusLine = StatusLine.a("HTTP/1.1 " + e6);
            } else if (!g.contains(b6)) {
                Internal.f10681a.b(builder, b6, e6);
            }
        }
        if (statusLine != null) {
            Response.Builder builder2 = new Response.Builder();
            builder2.f10662b = protocol;
            builder2.f10663c = statusLine.f10759b;
            builder2.d = statusLine.f10760c;
            builder2.f10665f = new Headers(builder).c();
            if (!z3 || Internal.f10681a.d(builder2) != 100) {
                return builder2;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }
}
