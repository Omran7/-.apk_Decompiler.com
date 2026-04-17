package okhttp3.internal.platform;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import o3.d;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.internal.tls.BasicCertificateChainCleaner;
import okhttp3.internal.tls.BasicTrustRootIndex;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

public class Platform {

    /* renamed from: a  reason: collision with root package name */
    public static final Platform f10930a;

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f10931b = Logger.getLogger(OkHttpClient.class.getName());

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    static {
        /*
            java.lang.String r0 = "java.vm.name"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            java.lang.String r2 = "Dalvik"
            boolean r1 = r2.equals(r1)
            r3 = 0
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x009f
            java.lang.String r1 = java.lang.System.getProperty(r0)
            boolean r1 = r2.equals(r1)
            java.lang.String r6 = "com.android.org.conscrypt.SSLParametersImpl"
            if (r1 != 0) goto L_0x001f
        L_0x001d:
            r1 = r3
            goto L_0x002f
        L_0x001f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoClassDefFoundError -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r1 = r5
        L_0x0023:
            r7 = 29
            if (r1 < r7) goto L_0x001d
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x001d }
            okhttp3.internal.platform.Android10Platform r1 = new okhttp3.internal.platform.Android10Platform     // Catch:{ ClassNotFoundException -> 0x001d }
            r1.<init>(r3, r3, r3, r3)     // Catch:{ ClassNotFoundException -> 0x001d }
        L_0x002f:
            if (r1 == 0) goto L_0x0033
            goto L_0x012f
        L_0x0033:
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.String r0 = java.lang.System.getProperty(r0)
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0040
            goto L_0x0092
        L_0x0040:
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0044 }
            goto L_0x0049
        L_0x0044:
            java.lang.String r0 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl"
            java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0092 }
        L_0x0049:
            okhttp3.internal.platform.OptionalMethod r0 = new okhttp3.internal.platform.OptionalMethod     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r2 = "setUseSessionTickets"
            java.lang.Class r6 = java.lang.Boolean.TYPE     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch:{ ClassNotFoundException -> 0x0092 }
            r0.<init>(r3, r2, r6)     // Catch:{ ClassNotFoundException -> 0x0092 }
            okhttp3.internal.platform.OptionalMethod r2 = new okhttp3.internal.platform.OptionalMethod     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r6 = "setHostname"
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch:{ ClassNotFoundException -> 0x0092 }
            r2.<init>(r3, r6, r7)     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r6 = "GMSCore_OpenSSL"
            java.security.Provider r6 = java.security.Security.getProvider(r6)     // Catch:{ ClassNotFoundException -> 0x0092 }
            if (r6 == 0) goto L_0x006c
            goto L_0x0073
        L_0x006c:
            java.lang.String r6 = "android.net.Network"
            java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0072 }
            goto L_0x0073
        L_0x0072:
            r4 = r5
        L_0x0073:
            if (r4 == 0) goto L_0x008a
            okhttp3.internal.platform.OptionalMethod r4 = new okhttp3.internal.platform.OptionalMethod     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r6 = "getAlpnSelectedProtocol"
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x0092 }
            r4.<init>(r1, r6, r5)     // Catch:{ ClassNotFoundException -> 0x0092 }
            okhttp3.internal.platform.OptionalMethod r5 = new okhttp3.internal.platform.OptionalMethod     // Catch:{ ClassNotFoundException -> 0x0092 }
            java.lang.String r6 = "setAlpnProtocols"
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch:{ ClassNotFoundException -> 0x0092 }
            r5.<init>(r3, r6, r1)     // Catch:{ ClassNotFoundException -> 0x0092 }
            goto L_0x008c
        L_0x008a:
            r4 = r3
            r5 = r4
        L_0x008c:
            okhttp3.internal.platform.AndroidPlatform r1 = new okhttp3.internal.platform.AndroidPlatform     // Catch:{ ClassNotFoundException -> 0x0092 }
            r1.<init>(r0, r2, r4, r5)     // Catch:{ ClassNotFoundException -> 0x0092 }
            r3 = r1
        L_0x0092:
            if (r3 == 0) goto L_0x0097
        L_0x0094:
            r1 = r3
            goto L_0x012f
        L_0x0097:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "No platform found on Android"
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r1 = "okhttp.platform"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            java.lang.String r2 = "conscrypt"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00b0
            goto L_0x00c0
        L_0x00b0:
            java.security.Provider[] r1 = java.security.Security.getProviders()
            r1 = r1[r5]
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "Conscrypt"
            boolean r4 = r2.equals(r1)
        L_0x00c0:
            if (r4 == 0) goto L_0x00c9
            okhttp3.internal.platform.ConscryptPlatform r1 = okhttp3.internal.platform.ConscryptPlatform.n()
            if (r1 == 0) goto L_0x00c9
            goto L_0x012f
        L_0x00c9:
            java.lang.Class<javax.net.ssl.SSLParameters> r1 = javax.net.ssl.SSLParameters.class
            java.lang.String r2 = "setApplicationProtocols"
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch:{ NoSuchMethodException -> 0x00e3 }
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x00e3 }
            java.lang.String r2 = "getApplicationProtocol"
            java.lang.reflect.Method r2 = r0.getMethod(r2, r3)     // Catch:{ NoSuchMethodException -> 0x00e3 }
            okhttp3.internal.platform.Jdk9Platform r4 = new okhttp3.internal.platform.Jdk9Platform     // Catch:{ NoSuchMethodException -> 0x00e3 }
            r4.<init>(r1, r2)     // Catch:{ NoSuchMethodException -> 0x00e3 }
            goto L_0x00e4
        L_0x00e3:
            r4 = r3
        L_0x00e4:
            if (r4 == 0) goto L_0x00e8
            r1 = r4
            goto L_0x012f
        L_0x00e8:
            java.lang.String r1 = "org.eclipse.jetty.alpn.ALPN"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.String r2 = "org.eclipse.jetty.alpn.ALPN$Provider"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ClientProvider"
            java.lang.Class r9 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.String r4 = "org.eclipse.jetty.alpn.ALPN$ServerProvider"
            java.lang.Class r10 = java.lang.Class.forName(r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.String r4 = "put"
            java.lang.Class[] r2 = new java.lang.Class[]{r0, r2}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.reflect.Method r6 = r1.getMethod(r4, r2)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.String r2 = "get"
            java.lang.Class[] r4 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.reflect.Method r7 = r1.getMethod(r2, r4)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.String r2 = "remove"
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            java.lang.reflect.Method r8 = r1.getMethod(r2, r0)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            okhttp3.internal.platform.JdkWithJettyBootPlatform r0 = new okhttp3.internal.platform.JdkWithJettyBootPlatform     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ ClassNotFoundException | NoSuchMethodException -> 0x0125 }
            r3 = r0
        L_0x0125:
            if (r3 == 0) goto L_0x0129
            goto L_0x0094
        L_0x0129:
            okhttp3.internal.platform.Platform r0 = new okhttp3.internal.platform.Platform
            r0.<init>()
            r1 = r0
        L_0x012f:
            f10930a = r1
            java.lang.Class<okhttp3.OkHttpClient> r0 = okhttp3.OkHttpClient.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            f10931b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.platform.Platform.<clinit>():void");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Protocol protocol = (Protocol) list.get(i2);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.f10628a);
            }
        }
        return arrayList;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        return new BasicCertificateChainCleaner(d(x509TrustManager));
    }

    public TrustRootIndex d(X509TrustManager x509TrustManager) {
        return new BasicTrustRootIndex(x509TrustManager.getAcceptedIssuers());
    }

    public void e(SSLSocketFactory sSLSocketFactory) {
    }

    public void f(SSLSocket sSLSocket, String str, List list) {
    }

    public void g(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        socket.connect(inetSocketAddress, i2);
    }

    public SSLContext h() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e6) {
            throw new IllegalStateException("No TLS provider", e6);
        }
    }

    public String i(SSLSocket sSLSocket) {
        return null;
    }

    public Object j() {
        if (f10931b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean k(String str) {
        return true;
    }

    public void l(int i2, String str, Throwable th) {
        Level level;
        if (i2 == 5) {
            level = Level.WARNING;
        } else {
            level = Level.INFO;
        }
        f10931b.log(level, str, th);
    }

    public void m(Object obj, String str) {
        if (obj == null) {
            str = d.f(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        l(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
