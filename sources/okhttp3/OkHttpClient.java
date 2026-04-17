package okhttp3;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.CipherSuite;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.proxy.NullProxySelector;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;

public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    /* renamed from: H  reason: collision with root package name */
    public static final List f10577H = Util.n(Protocol.HTTP_2, Protocol.HTTP_1_1);

    /* renamed from: I  reason: collision with root package name */
    public static final List f10578I = Util.n(ConnectionSpec.f10530e, ConnectionSpec.f10531f);

    /* renamed from: A  reason: collision with root package name */
    public final boolean f10579A;

    /* renamed from: B  reason: collision with root package name */
    public final boolean f10580B;

    /* renamed from: C  reason: collision with root package name */
    public final boolean f10581C;

    /* renamed from: D  reason: collision with root package name */
    public final int f10582D;

    /* renamed from: E  reason: collision with root package name */
    public final int f10583E;
    public final int F;

    /* renamed from: G  reason: collision with root package name */
    public final int f10584G;

    /* renamed from: a  reason: collision with root package name */
    public final Dispatcher f10585a;

    /* renamed from: b  reason: collision with root package name */
    public final List f10586b;

    /* renamed from: c  reason: collision with root package name */
    public final List f10587c;
    public final List d;

    /* renamed from: e  reason: collision with root package name */
    public final List f10588e;

    /* renamed from: f  reason: collision with root package name */
    public final EventListener.Factory f10589f;

    /* renamed from: p  reason: collision with root package name */
    public final ProxySelector f10590p;

    /* renamed from: q  reason: collision with root package name */
    public final CookieJar f10591q;

    /* renamed from: r  reason: collision with root package name */
    public final SocketFactory f10592r;

    /* renamed from: s  reason: collision with root package name */
    public final SSLSocketFactory f10593s;

    /* renamed from: t  reason: collision with root package name */
    public final CertificateChainCleaner f10594t;

    /* renamed from: u  reason: collision with root package name */
    public final OkHostnameVerifier f10595u;

    /* renamed from: v  reason: collision with root package name */
    public final CertificatePinner f10596v;

    /* renamed from: w  reason: collision with root package name */
    public final Authenticator f10597w;

    /* renamed from: x  reason: collision with root package name */
    public final Authenticator f10598x;

    /* renamed from: y  reason: collision with root package name */
    public final ConnectionPool f10599y;

    /* renamed from: z  reason: collision with root package name */
    public final Dns f10600z;

    static {
        Internal.f10681a = new Internal() {
            public final void a(Headers.Builder builder, String str) {
                int indexOf = str.indexOf(":", 1);
                if (indexOf != -1) {
                    builder.a(str.substring(0, indexOf), str.substring(indexOf + 1));
                } else if (str.startsWith(":")) {
                    builder.a("", str.substring(1));
                } else {
                    builder.a("", str);
                }
            }

            public final void b(Headers.Builder builder, String str, String str2) {
                builder.a(str, str2);
            }

            /* JADX WARNING: type inference failed for: r6v1, types: [okhttp3.ConnectionSpec$Builder, java.lang.Object] */
            public final void c(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z3) {
                String[] strArr;
                String[] strArr2;
                ConnectionSpec connectionSpec2 = connectionSpec;
                SSLSocket sSLSocket2 = sSLSocket;
                String[] strArr3 = connectionSpec2.f10534c;
                if (strArr3 != null) {
                    strArr = Util.o(CipherSuite.f10506b, sSLSocket.getEnabledCipherSuites(), strArr3);
                } else {
                    strArr = sSLSocket.getEnabledCipherSuites();
                }
                String[] strArr4 = connectionSpec2.d;
                if (strArr4 != null) {
                    strArr2 = Util.o(Util.f10694o, sSLSocket.getEnabledProtocols(), strArr4);
                } else {
                    strArr2 = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                Comparator comparator = CipherSuite.f10506b;
                byte[] bArr = Util.f10683a;
                int length = supportedCipherSuites.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    if (((CipherSuite.AnonymousClass1) comparator).compare(supportedCipherSuites[i2], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i2++;
                }
                if (z3 && i2 != -1) {
                    String str = supportedCipherSuites[i2];
                    int length2 = strArr.length;
                    String[] strArr5 = new String[(length2 + 1)];
                    System.arraycopy(strArr, 0, strArr5, 0, strArr.length);
                    strArr5[length2] = str;
                    strArr = strArr5;
                }
                ? obj = new Object();
                obj.f10535a = connectionSpec2.f10532a;
                obj.f10536b = strArr3;
                obj.f10537c = strArr4;
                obj.d = connectionSpec2.f10533b;
                obj.a(strArr);
                obj.c(strArr2);
                ConnectionSpec connectionSpec3 = new ConnectionSpec(obj);
                String[] strArr6 = connectionSpec3.d;
                if (strArr6 != null) {
                    sSLSocket2.setEnabledProtocols(strArr6);
                }
                String[] strArr7 = connectionSpec3.f10534c;
                if (strArr7 != null) {
                    sSLSocket2.setEnabledCipherSuites(strArr7);
                }
            }

            public final int d(Response.Builder builder) {
                return builder.f10663c;
            }

            public final boolean e(ConnectionPool connectionPool, RealConnection realConnection) {
                connectionPool.getClass();
                if (realConnection.f10714k || connectionPool.f10524a == 0) {
                    connectionPool.d.remove(realConnection);
                    return true;
                }
                connectionPool.notifyAll();
                return false;
            }

            public final Socket f(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
                Iterator it2 = connectionPool.d.iterator();
                while (it2.hasNext()) {
                    RealConnection realConnection = (RealConnection) it2.next();
                    if (realConnection.g(address, (Route) null) && realConnection.h != null && realConnection != streamAllocation.a()) {
                        if (streamAllocation.f10739n == null && streamAllocation.f10735j.f10717n.size() == 1) {
                            Socket b6 = streamAllocation.b(true, false, false);
                            streamAllocation.f10735j = realConnection;
                            realConnection.f10717n.add((Reference) streamAllocation.f10735j.f10717n.get(0));
                            return b6;
                        }
                        throw new IllegalStateException();
                    }
                }
                return null;
            }

            public final boolean g(Address address, Address address2) {
                return address.a(address2);
            }

            public final RealConnection h(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
                Iterator it2 = connectionPool.d.iterator();
                while (it2.hasNext()) {
                    RealConnection realConnection = (RealConnection) it2.next();
                    if (realConnection.g(address, route)) {
                        if (streamAllocation.f10735j == null) {
                            streamAllocation.f10735j = realConnection;
                            streamAllocation.f10736k = true;
                            realConnection.f10717n.add(new StreamAllocation.StreamAllocationReference(streamAllocation, streamAllocation.g));
                            return realConnection;
                        }
                        throw new IllegalStateException();
                    }
                }
                return null;
            }

            public final void i(ConnectionPool connectionPool, RealConnection realConnection) {
                if (!connectionPool.f10528f) {
                    connectionPool.f10528f = true;
                    ConnectionPool.g.execute(connectionPool.f10526c);
                }
                connectionPool.d.add(realConnection);
            }

            public final RouteDatabase j(ConnectionPool connectionPool) {
                return connectionPool.f10527e;
            }

            public final IOException k(Call call, IOException iOException) {
                if (!((RealCall) call).f10631c.k()) {
                    return iOException;
                }
                InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
                if (iOException != null) {
                    interruptedIOException.initCause(iOException);
                }
                return interruptedIOException;
            }
        };
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public final Call a(Request request) {
        RealCall realCall = new RealCall(this, request);
        realCall.d = EventListener.this;
        return realCall;
    }

    public OkHttpClient(Builder builder) {
        boolean z3;
        this.f10585a = builder.f10601a;
        this.f10586b = builder.f10602b;
        List list = builder.f10603c;
        this.f10587c = list;
        this.d = Util.m(builder.d);
        this.f10588e = Util.m(builder.f10604e);
        this.f10589f = builder.f10605f;
        this.f10590p = builder.g;
        this.f10591q = builder.h;
        this.f10592r = builder.f10606i;
        Iterator it2 = list.iterator();
        loop0:
        while (true) {
            z3 = false;
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                }
                ConnectionSpec connectionSpec = (ConnectionSpec) it2.next();
                if (z3 || connectionSpec.f10532a) {
                    z3 = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = builder.f10607j;
        if (sSLSocketFactory != null || !z3) {
            this.f10593s = sSLSocketFactory;
            this.f10594t = builder.f10608k;
        } else {
            try {
                TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                instance.init((KeyStore) null);
                TrustManager[] trustManagers = instance.getTrustManagers();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
                        try {
                            Platform platform = Platform.f10930a;
                            SSLContext h = platform.h();
                            h.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
                            this.f10593s = h.getSocketFactory();
                            this.f10594t = platform.c(x509TrustManager);
                        } catch (GeneralSecurityException e6) {
                            throw Util.a("No System TLS", e6);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers:" + Arrays.toString(trustManagers));
            } catch (GeneralSecurityException e7) {
                throw Util.a("No System TLS", e7);
            }
        }
        SSLSocketFactory sSLSocketFactory2 = this.f10593s;
        if (sSLSocketFactory2 != null) {
            Platform.f10930a.e(sSLSocketFactory2);
        }
        this.f10595u = builder.f10609l;
        CertificateChainCleaner certificateChainCleaner = this.f10594t;
        CertificatePinner certificatePinner = builder.f10610m;
        this.f10596v = !Util.k(certificatePinner.f10504b, certificateChainCleaner) ? new CertificatePinner(certificatePinner.f10503a, certificateChainCleaner) : certificatePinner;
        this.f10597w = builder.f10611n;
        this.f10598x = builder.f10612o;
        this.f10599y = builder.f10613p;
        this.f10600z = builder.f10614q;
        this.f10579A = builder.f10615r;
        this.f10580B = builder.f10616s;
        this.f10581C = builder.f10617t;
        this.f10582D = builder.f10618u;
        this.f10583E = builder.f10619v;
        this.F = builder.f10620w;
        this.f10584G = builder.f10621x;
        if (this.d.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.d);
        } else if (this.f10588e.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f10588e);
        }
    }

    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public final Dispatcher f10601a;

        /* renamed from: b  reason: collision with root package name */
        public final List f10602b;

        /* renamed from: c  reason: collision with root package name */
        public final List f10603c;
        public final ArrayList d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f10604e;

        /* renamed from: f  reason: collision with root package name */
        public final EventListener.Factory f10605f;
        public final ProxySelector g;
        public final CookieJar h;

        /* renamed from: i  reason: collision with root package name */
        public final SocketFactory f10606i;

        /* renamed from: j  reason: collision with root package name */
        public final SSLSocketFactory f10607j;

        /* renamed from: k  reason: collision with root package name */
        public final CertificateChainCleaner f10608k;

        /* renamed from: l  reason: collision with root package name */
        public final OkHostnameVerifier f10609l;

        /* renamed from: m  reason: collision with root package name */
        public final CertificatePinner f10610m;

        /* renamed from: n  reason: collision with root package name */
        public final Authenticator f10611n;

        /* renamed from: o  reason: collision with root package name */
        public final Authenticator f10612o;

        /* renamed from: p  reason: collision with root package name */
        public final ConnectionPool f10613p;

        /* renamed from: q  reason: collision with root package name */
        public final Dns f10614q;

        /* renamed from: r  reason: collision with root package name */
        public final boolean f10615r;

        /* renamed from: s  reason: collision with root package name */
        public final boolean f10616s;

        /* renamed from: t  reason: collision with root package name */
        public final boolean f10617t;

        /* renamed from: u  reason: collision with root package name */
        public int f10618u;

        /* renamed from: v  reason: collision with root package name */
        public final int f10619v;

        /* renamed from: w  reason: collision with root package name */
        public int f10620w;

        /* renamed from: x  reason: collision with root package name */
        public final int f10621x;

        public Builder() {
            this.d = new ArrayList();
            this.f10604e = new ArrayList();
            this.f10601a = new Dispatcher();
            this.f10602b = OkHttpClient.f10577H;
            this.f10603c = OkHttpClient.f10578I;
            this.f10605f = new EventListener.Factory() {
            };
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.g = proxySelector;
            if (proxySelector == null) {
                this.g = new NullProxySelector();
            }
            this.h = CookieJar.f10548a;
            this.f10606i = SocketFactory.getDefault();
            this.f10609l = OkHostnameVerifier.f10939a;
            this.f10610m = CertificatePinner.f10502c;
            Authenticator authenticator = Authenticator.f10487a;
            this.f10611n = authenticator;
            this.f10612o = authenticator;
            this.f10613p = new ConnectionPool();
            this.f10614q = Dns.f10552a;
            this.f10615r = true;
            this.f10616s = true;
            this.f10617t = true;
            this.f10618u = 0;
            this.f10619v = 10000;
            this.f10620w = 10000;
            this.f10621x = 10000;
        }

        public Builder(OkHttpClient okHttpClient) {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f10604e = arrayList2;
            this.f10601a = okHttpClient.f10585a;
            this.f10602b = okHttpClient.f10586b;
            this.f10603c = okHttpClient.f10587c;
            arrayList.addAll(okHttpClient.d);
            arrayList2.addAll(okHttpClient.f10588e);
            this.f10605f = okHttpClient.f10589f;
            this.g = okHttpClient.f10590p;
            this.h = okHttpClient.f10591q;
            this.f10606i = okHttpClient.f10592r;
            this.f10607j = okHttpClient.f10593s;
            this.f10608k = okHttpClient.f10594t;
            this.f10609l = okHttpClient.f10595u;
            this.f10610m = okHttpClient.f10596v;
            this.f10611n = okHttpClient.f10597w;
            this.f10612o = okHttpClient.f10598x;
            this.f10613p = okHttpClient.f10599y;
            this.f10614q = okHttpClient.f10600z;
            this.f10615r = okHttpClient.f10579A;
            this.f10616s = okHttpClient.f10580B;
            this.f10617t = okHttpClient.f10581C;
            this.f10618u = okHttpClient.f10582D;
            this.f10619v = okHttpClient.f10583E;
            this.f10620w = okHttpClient.F;
            this.f10621x = okHttpClient.f10584G;
        }
    }
}
