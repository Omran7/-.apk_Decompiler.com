package okhttp3.internal.connection;

import N5.n;
import N5.o;
import N5.p;
import N5.u;
import N5.w;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Address;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.http2.PushObserver;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: b  reason: collision with root package name */
    public final ConnectionPool f10708b;

    /* renamed from: c  reason: collision with root package name */
    public final Route f10709c;
    public Socket d;

    /* renamed from: e  reason: collision with root package name */
    public Socket f10710e;

    /* renamed from: f  reason: collision with root package name */
    public Handshake f10711f;
    public Protocol g;
    public Http2Connection h;

    /* renamed from: i  reason: collision with root package name */
    public p f10712i;

    /* renamed from: j  reason: collision with root package name */
    public o f10713j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10714k;

    /* renamed from: l  reason: collision with root package name */
    public int f10715l;

    /* renamed from: m  reason: collision with root package name */
    public int f10716m = 1;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f10717n = new ArrayList();

    /* renamed from: o  reason: collision with root package name */
    public long f10718o = Long.MAX_VALUE;

    /* renamed from: okhttp3.internal.connection.RealConnection$1  reason: invalid class name */
    class AnonymousClass1 extends RealWebSocket.Streams {
        public final void close() {
            throw null;
        }
    }

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.f10708b = connectionPool;
        this.f10709c = route;
    }

    public final void a(Http2Connection http2Connection) {
        synchronized (this.f10708b) {
            this.f10716m = http2Connection.k();
        }
    }

    public final void b(Http2Stream http2Stream) {
        http2Stream.c(ErrorCode.REFUSED_STREAM);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0058, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r9, int r10, int r11, boolean r12, okhttp3.EventListener r13) {
        /*
            r8 = this;
            okhttp3.Protocol r0 = r8.g
            if (r0 != 0) goto L_0x0130
            okhttp3.Route r0 = r8.f10709c
            okhttp3.Address r0 = r0.f10672a
            java.util.List r1 = r0.f10484f
            okhttp3.internal.connection.ConnectionSpecSelector r2 = new okhttp3.internal.connection.ConnectionSpecSelector
            r2.<init>(r1)
            javax.net.ssl.SSLSocketFactory r3 = r0.h
            if (r3 != 0) goto L_0x004c
            okhttp3.ConnectionSpec r0 = okhttp3.ConnectionSpec.f10531f
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x003f
            okhttp3.Route r0 = r8.f10709c
            okhttp3.Address r0 = r0.f10672a
            okhttp3.HttpUrl r0 = r0.f10480a
            java.lang.String r0 = r0.d
            okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.Platform.f10930a
            boolean r1 = r1.k(r0)
            if (r1 == 0) goto L_0x002c
            goto L_0x0056
        L_0x002c:
            okhttp3.internal.connection.RouteException r9 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r10 = new java.net.UnknownServiceException
            java.lang.String r11 = "CLEARTEXT communication to "
            java.lang.String r12 = " not permitted by network security policy"
            java.lang.String r11 = h0.C0552a.o(r11, r0, r12)
            r10.<init>(r11)
            r9.<init>(r10)
            throw r9
        L_0x003f:
            okhttp3.internal.connection.RouteException r9 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r10 = new java.net.UnknownServiceException
            java.lang.String r11 = "CLEARTEXT communication not enabled for client"
            r10.<init>(r11)
            r9.<init>(r10)
            throw r9
        L_0x004c:
            java.util.List r0 = r0.f10483e
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0123
        L_0x0056:
            r0 = 0
            r1 = r0
        L_0x0058:
            r3 = 1
            okhttp3.Route r4 = r8.f10709c     // Catch:{ IOException -> 0x0078 }
            okhttp3.Address r5 = r4.f10672a     // Catch:{ IOException -> 0x0078 }
            javax.net.ssl.SSLSocketFactory r5 = r5.h     // Catch:{ IOException -> 0x0078 }
            if (r5 == 0) goto L_0x006d
            java.net.Proxy r4 = r4.f10673b     // Catch:{ IOException -> 0x0078 }
            java.net.Proxy$Type r4 = r4.type()     // Catch:{ IOException -> 0x0078 }
            java.net.Proxy$Type r5 = java.net.Proxy.Type.HTTP     // Catch:{ IOException -> 0x0078 }
            if (r4 != r5) goto L_0x006d
            r4 = r3
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 == 0) goto L_0x007a
            r8.e(r9, r10, r11, r13)     // Catch:{ IOException -> 0x0078 }
            java.net.Socket r4 = r8.d     // Catch:{ IOException -> 0x0078 }
            if (r4 != 0) goto L_0x007d
            goto L_0x0087
        L_0x0078:
            r4 = move-exception
            goto L_0x00c0
        L_0x007a:
            r8.d(r9, r10, r13)     // Catch:{ IOException -> 0x0078 }
        L_0x007d:
            r8.f(r2, r13)     // Catch:{ IOException -> 0x0078 }
            okhttp3.Route r4 = r8.f10709c     // Catch:{ IOException -> 0x0078 }
            java.net.InetSocketAddress r4 = r4.f10674c     // Catch:{ IOException -> 0x0078 }
            r13.getClass()     // Catch:{ IOException -> 0x0078 }
        L_0x0087:
            okhttp3.Route r9 = r8.f10709c
            okhttp3.Address r10 = r9.f10672a
            javax.net.ssl.SSLSocketFactory r10 = r10.h
            if (r10 == 0) goto L_0x00ab
            java.net.Proxy r9 = r9.f10673b
            java.net.Proxy$Type r9 = r9.type()
            java.net.Proxy$Type r10 = java.net.Proxy.Type.HTTP
            if (r9 != r10) goto L_0x00ab
            java.net.Socket r9 = r8.d
            if (r9 == 0) goto L_0x009e
            goto L_0x00ab
        L_0x009e:
            java.net.ProtocolException r9 = new java.net.ProtocolException
            java.lang.String r10 = "Too many tunnel connections attempted: 21"
            r9.<init>(r10)
            okhttp3.internal.connection.RouteException r10 = new okhttp3.internal.connection.RouteException
            r10.<init>(r9)
            throw r10
        L_0x00ab:
            okhttp3.internal.http2.Http2Connection r9 = r8.h
            if (r9 == 0) goto L_0x00bf
            okhttp3.ConnectionPool r9 = r8.f10708b
            monitor-enter(r9)
            okhttp3.internal.http2.Http2Connection r10 = r8.h     // Catch:{ all -> 0x00bc }
            int r10 = r10.k()     // Catch:{ all -> 0x00bc }
            r8.f10716m = r10     // Catch:{ all -> 0x00bc }
            monitor-exit(r9)     // Catch:{ all -> 0x00bc }
            goto L_0x00bf
        L_0x00bc:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00bc }
            throw r10
        L_0x00bf:
            return
        L_0x00c0:
            java.net.Socket r5 = r8.f10710e
            okhttp3.internal.Util.f(r5)
            java.net.Socket r5 = r8.d
            okhttp3.internal.Util.f(r5)
            r8.f10710e = r0
            r8.d = r0
            r8.f10712i = r0
            r8.f10713j = r0
            r8.f10711f = r0
            r8.g = r0
            r8.h = r0
            okhttp3.Route r5 = r8.f10709c
            java.net.InetSocketAddress r5 = r5.f10674c
            r13.getClass()
            if (r1 != 0) goto L_0x00e7
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r4)
            goto L_0x00f6
        L_0x00e7:
            java.io.IOException r5 = r1.f10720a
            java.lang.reflect.Method r6 = okhttp3.internal.Util.f10695p
            if (r6 == 0) goto L_0x00f4
            java.lang.Object[] r7 = new java.lang.Object[]{r4}     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00f4 }
            r6.invoke(r5, r7)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x00f4 }
        L_0x00f4:
            r1.f10721b = r4
        L_0x00f6:
            if (r12 == 0) goto L_0x0122
            r2.d = r3
            boolean r3 = r2.f10707c
            if (r3 == 0) goto L_0x0122
            boolean r3 = r4 instanceof java.net.ProtocolException
            if (r3 != 0) goto L_0x0122
            boolean r3 = r4 instanceof java.io.InterruptedIOException
            if (r3 != 0) goto L_0x0122
            boolean r3 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L_0x0112
            java.lang.Throwable r5 = r4.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 != 0) goto L_0x0122
        L_0x0112:
            boolean r5 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r5 != 0) goto L_0x0122
            if (r3 != 0) goto L_0x0058
            boolean r3 = r4 instanceof javax.net.ssl.SSLProtocolException
            if (r3 != 0) goto L_0x0058
            boolean r3 = r4 instanceof javax.net.ssl.SSLException
            if (r3 == 0) goto L_0x0122
            goto L_0x0058
        L_0x0122:
            throw r1
        L_0x0123:
            okhttp3.internal.connection.RouteException r9 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r10 = new java.net.UnknownServiceException
            java.lang.String r11 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r10.<init>(r11)
            r9.<init>(r10)
            throw r9
        L_0x0130:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "already connected"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.c(int, int, int, boolean, okhttp3.EventListener):void");
    }

    public final void d(int i2, int i5, EventListener eventListener) {
        Socket socket;
        Route route = this.f10709c;
        Proxy proxy = route.f10673b;
        InetSocketAddress inetSocketAddress = route.f10674c;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
            socket = route.f10672a.f10482c.createSocket();
        } else {
            socket = new Socket(proxy);
        }
        this.d = socket;
        eventListener.getClass();
        this.d.setSoTimeout(i5);
        try {
            Platform.f10930a.g(this.d, inetSocketAddress, i2);
            try {
                this.f10712i = new p(n.b(this.d));
                this.f10713j = new o(n.a(this.d));
            } catch (NullPointerException e6) {
                if ("throw with null exception".equals(e6.getMessage())) {
                    throw new IOException(e6);
                }
            }
        } catch (ConnectException e7) {
            ConnectException connectException = new ConnectException("Failed to connect to " + inetSocketAddress);
            connectException.initCause(e7);
            throw connectException;
        }
    }

    public final void e(int i2, int i5, int i6, EventListener eventListener) {
        Request.Builder builder = new Request.Builder();
        Route route = this.f10709c;
        HttpUrl httpUrl = route.f10672a.f10480a;
        if (httpUrl != null) {
            builder.f10642a = httpUrl;
            builder.b("CONNECT", (RequestBody) null);
            Address address = route.f10672a;
            builder.f10644c.c("Host", Util.l(address.f10480a, true));
            builder.f10644c.c("Proxy-Connection", "Keep-Alive");
            builder.f10644c.c("User-Agent", "okhttp/3.12.13");
            Request a6 = builder.a();
            Response.Builder builder2 = new Response.Builder();
            builder2.f10661a = a6;
            builder2.f10662b = Protocol.HTTP_1_1;
            builder2.f10663c = 407;
            builder2.d = "Preemptive Authenticate";
            builder2.g = Util.f10685c;
            builder2.f10668k = -1;
            builder2.f10669l = -1;
            builder2.f10665f.c("Proxy-Authenticate", "OkHttp-Preemptive");
            builder2.a();
            address.d.getClass();
            d(i2, i5, eventListener);
            p pVar = this.f10712i;
            Http1Codec http1Codec = new Http1Codec((OkHttpClient) null, (StreamAllocation) null, pVar, this.f10713j);
            w b6 = pVar.f1953b.b();
            long j6 = (long) i5;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            b6.g(j6, timeUnit);
            this.f10713j.f1950b.b().g((long) i6, timeUnit);
            http1Codec.h(a6.f10639c, "CONNECT " + Util.l(a6.f10637a, true) + " HTTP/1.1");
            http1Codec.a();
            Response.Builder f6 = http1Codec.f(false);
            f6.f10661a = a6;
            Response a7 = f6.a();
            long a8 = HttpHeaders.a(a7);
            if (a8 == -1) {
                a8 = 0;
            }
            u g5 = http1Codec.g(a8);
            Util.r(g5, f.API_PRIORITY_OTHER, timeUnit);
            g5.close();
            int i7 = a7.f10651c;
            if (i7 != 200) {
                if (i7 == 407) {
                    address.d.getClass();
                    throw new IOException("Failed to authenticate with proxy");
                }
                throw new IOException(a.f(i7, "Unexpected response code for CONNECT: "));
            } else if (!this.f10712i.f1952a.d() || !this.f10713j.f1949a.d()) {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        } else {
            throw new NullPointerException("url == null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0114 A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x011a A[Catch:{ all -> 0x010b }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(okhttp3.internal.connection.ConnectionSpecSelector r9, okhttp3.EventListener r10) {
        /*
            r8 = this;
            okhttp3.Route r0 = r8.f10709c
            okhttp3.Address r1 = r0.f10672a
            javax.net.ssl.SSLSocketFactory r2 = r1.h
            okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_1
            if (r2 != 0) goto L_0x0025
            okhttp3.Protocol r9 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            java.util.List r10 = r1.f10483e
            boolean r10 = r10.contains(r9)
            if (r10 == 0) goto L_0x001e
            java.net.Socket r10 = r8.d
            r8.f10710e = r10
            r8.g = r9
            r8.i()
            return
        L_0x001e:
            java.net.Socket r9 = r8.d
            r8.f10710e = r9
            r8.g = r3
            return
        L_0x0025:
            r10.getClass()
            okhttp3.Address r10 = r0.f10672a
            javax.net.ssl.SSLSocketFactory r0 = r10.h
            okhttp3.HttpUrl r1 = r10.f10480a
            r2 = 0
            java.net.Socket r4 = r8.d     // Catch:{ AssertionError -> 0x010d }
            java.lang.String r5 = r1.d     // Catch:{ AssertionError -> 0x010d }
            int r6 = r1.f10565e     // Catch:{ AssertionError -> 0x010d }
            r7 = 1
            java.net.Socket r0 = r0.createSocket(r4, r5, r6, r7)     // Catch:{ AssertionError -> 0x010d }
            javax.net.ssl.SSLSocket r0 = (javax.net.ssl.SSLSocket) r0     // Catch:{ AssertionError -> 0x010d }
            okhttp3.ConnectionSpec r9 = r9.a(r0)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r1 = r1.d
            boolean r9 = r9.f10533b
            if (r9 == 0) goto L_0x0056
            okhttp3.internal.platform.Platform r4 = okhttp3.internal.platform.Platform.f10930a     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.util.List r5 = r10.f10483e     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r4.f(r0, r1, r5)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            goto L_0x0056
        L_0x004e:
            r9 = move-exception
            r2 = r0
            goto L_0x011b
        L_0x0052:
            r9 = move-exception
            r2 = r0
            goto L_0x010e
        L_0x0056:
            r0.startHandshake()     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            javax.net.ssl.SSLSession r4 = r0.getSession()     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            okhttp3.Handshake r5 = okhttp3.Handshake.a(r4)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            javax.net.ssl.HostnameVerifier r6 = r10.f10485i     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            boolean r4 = r6.verify(r1, r4)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.util.List r6 = r5.f10558c
            if (r4 != 0) goto L_0x00cb
            boolean r9 = r6.isEmpty()     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = "Hostname "
            if (r9 != 0) goto L_0x00b4
            r9 = 0
            java.lang.Object r9 = r6.get(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r3.<init>(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r3.append(r1)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = " not verified:\n    certificate: "
            r3.append(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = okhttp3.CertificatePinner.b(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r3.append(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = "\n    DN: "
            r3.append(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.security.Principal r10 = r9.getSubjectDN()     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = r10.getName()     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r3.append(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = "\n    subjectAltNames: "
            r3.append(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.util.ArrayList r9 = okhttp3.internal.tls.OkHostnameVerifier.a(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r3.append(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r9 = r3.toString()     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r2.<init>(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            throw r2     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
        L_0x00b4:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r2.<init>(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r2.append(r1)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = " not verified (no certificates)"
            r2.append(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r10 = r2.toString()     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r9.<init>(r10)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            throw r9     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
        L_0x00cb:
            okhttp3.CertificatePinner r10 = r10.f10486j     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r10.a(r1, r6)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            if (r9 == 0) goto L_0x00d8
            okhttp3.internal.platform.Platform r9 = okhttp3.internal.platform.Platform.f10930a     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.lang.String r2 = r9.i(r0)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
        L_0x00d8:
            r8.f10710e = r0     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            N5.b r9 = N5.n.b(r0)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            N5.p r10 = new N5.p     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r10.<init>(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r8.f10712i = r10     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            java.net.Socket r9 = r8.f10710e     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            N5.a r9 = N5.n.a(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            N5.o r10 = new N5.o     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r10.<init>(r9)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r8.f10713j = r10     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            r8.f10711f = r5     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            if (r2 == 0) goto L_0x00fa
            okhttp3.Protocol r3 = okhttp3.Protocol.a(r2)     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
        L_0x00fa:
            r8.g = r3     // Catch:{ AssertionError -> 0x0052, all -> 0x004e }
            okhttp3.internal.platform.Platform r9 = okhttp3.internal.platform.Platform.f10930a
            r9.a(r0)
            okhttp3.Protocol r9 = r8.g
            okhttp3.Protocol r10 = okhttp3.Protocol.HTTP_2
            if (r9 != r10) goto L_0x010a
            r8.i()
        L_0x010a:
            return
        L_0x010b:
            r9 = move-exception
            goto L_0x011b
        L_0x010d:
            r9 = move-exception
        L_0x010e:
            boolean r10 = okhttp3.internal.Util.p(r9)     // Catch:{ all -> 0x010b }
            if (r10 == 0) goto L_0x011a
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x010b }
            r10.<init>(r9)     // Catch:{ all -> 0x010b }
            throw r10     // Catch:{ all -> 0x010b }
        L_0x011a:
            throw r9     // Catch:{ all -> 0x010b }
        L_0x011b:
            if (r2 == 0) goto L_0x0122
            okhttp3.internal.platform.Platform r10 = okhttp3.internal.platform.Platform.f10930a
            r10.a(r2)
        L_0x0122:
            okhttp3.internal.Util.f(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.f(okhttp3.internal.connection.ConnectionSpecSelector, okhttp3.EventListener):void");
    }

    public final boolean g(Address address, Route route) {
        Proxy.Type type;
        if (this.f10717n.size() < this.f10716m && !this.f10714k) {
            Internal internal = Internal.f10681a;
            Route route2 = this.f10709c;
            if (!internal.g(route2.f10672a, address)) {
                return false;
            }
            HttpUrl httpUrl = address.f10480a;
            if (httpUrl.d.equals(route2.f10672a.f10480a.d)) {
                return true;
            }
            if (this.h == null || route == null || route.f10673b.type() != (type = Proxy.Type.DIRECT) || route2.f10673b.type() != type) {
                return false;
            }
            if (!route2.f10674c.equals(route.f10674c) || route.f10672a.f10485i != OkHostnameVerifier.f10939a || !j(httpUrl)) {
                return false;
            }
            try {
                address.f10486j.a(httpUrl.d, this.f10711f.f10558c);
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public final HttpCodec h(OkHttpClient okHttpClient, RealInterceptorChain realInterceptorChain, StreamAllocation streamAllocation) {
        if (this.h != null) {
            return new Http2Codec(okHttpClient, realInterceptorChain, streamAllocation, this.h);
        }
        Socket socket = this.f10710e;
        int i2 = realInterceptorChain.f10749j;
        socket.setSoTimeout(i2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f10712i.f1953b.b().g((long) i2, timeUnit);
        this.f10713j.f1950b.b().g((long) realInterceptorChain.f10750k, timeUnit);
        return new Http1Codec(okHttpClient, streamAllocation, this.f10712i, this.f10713j);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [okhttp3.internal.http2.Http2Connection$Builder, java.lang.Object] */
    public final void i() {
        this.f10710e.setSoTimeout(0);
        ? obj = new Object();
        obj.f10855e = Http2Connection.Listener.f10857a;
        obj.f10856f = PushObserver.f10906a;
        obj.g = true;
        Socket socket = this.f10710e;
        String str = this.f10709c.f10672a.f10480a.d;
        p pVar = this.f10712i;
        o oVar = this.f10713j;
        obj.f10852a = socket;
        obj.f10853b = str;
        obj.f10854c = pVar;
        obj.d = oVar;
        obj.f10855e = this;
        Http2Connection http2Connection = new Http2Connection(obj);
        this.h = http2Connection;
        http2Connection.o();
    }

    public final boolean j(HttpUrl httpUrl) {
        int i2 = httpUrl.f10565e;
        HttpUrl httpUrl2 = this.f10709c.f10672a.f10480a;
        if (i2 != httpUrl2.f10565e) {
            return false;
        }
        String str = httpUrl.d;
        if (str.equals(httpUrl2.d)) {
            return true;
        }
        Handshake handshake = this.f10711f;
        if (handshake == null) {
            return false;
        }
        OkHostnameVerifier.f10939a.getClass();
        if (OkHostnameVerifier.c(str, (X509Certificate) handshake.f10558c.get(0))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.f10709c;
        sb.append(route.f10672a.f10480a.d);
        sb.append(":");
        sb.append(route.f10672a.f10480a.f10565e);
        sb.append(", proxy=");
        sb.append(route.f10673b);
        sb.append(" hostAddress=");
        sb.append(route.f10674c);
        sb.append(" cipherSuite=");
        Handshake handshake = this.f10711f;
        if (handshake != null) {
            obj = handshake.f10557b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
