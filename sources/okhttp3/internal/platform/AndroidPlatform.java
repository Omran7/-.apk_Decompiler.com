package okhttp3.internal.platform;

import android.os.Build;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.Util;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.TrustRootIndex;

class AndroidPlatform extends Platform {

    /* renamed from: c  reason: collision with root package name */
    public final OptionalMethod f10910c;
    public final OptionalMethod d;

    /* renamed from: e  reason: collision with root package name */
    public final OptionalMethod f10911e;

    /* renamed from: f  reason: collision with root package name */
    public final OptionalMethod f10912f;
    public final CloseGuard g;

    public static final class AndroidCertificateChainCleaner extends CertificateChainCleaner {

        /* renamed from: a  reason: collision with root package name */
        public final Object f10913a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f10914b;

        public AndroidCertificateChainCleaner(Object obj, Method method) {
            this.f10913a = obj;
            this.f10914b = method;
        }

        public final List a(String str, List list) {
            try {
                return (List) this.f10914b.invoke(this.f10913a, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str});
            } catch (InvocationTargetException e6) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e6.getMessage());
                sSLPeerUnverifiedException.initCause(e6);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e7) {
                throw new AssertionError(e7);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof AndroidCertificateChainCleaner;
        }

        public final int hashCode() {
            return 0;
        }
    }

    public static final class AndroidTrustRootIndex implements TrustRootIndex {

        /* renamed from: a  reason: collision with root package name */
        public final X509TrustManager f10915a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f10916b;

        public AndroidTrustRootIndex(X509TrustManager x509TrustManager, Method method) {
            this.f10916b = method;
            this.f10915a = x509TrustManager;
        }

        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f10916b.invoke(this.f10915a, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
                return null;
            } catch (IllegalAccessException e6) {
                throw Util.a("unable to get issues and signature", e6);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AndroidTrustRootIndex)) {
                return false;
            }
            AndroidTrustRootIndex androidTrustRootIndex = (AndroidTrustRootIndex) obj;
            if (!this.f10915a.equals(androidTrustRootIndex.f10915a) || !this.f10916b.equals(androidTrustRootIndex.f10916b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f10916b.hashCode() * 31) + this.f10915a.hashCode();
        }
    }

    public static final class CloseGuard {

        /* renamed from: a  reason: collision with root package name */
        public final Method f10917a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f10918b;

        /* renamed from: c  reason: collision with root package name */
        public final Method f10919c;

        public CloseGuard(Method method, Method method2, Method method3) {
            this.f10917a = method;
            this.f10918b = method2;
            this.f10919c = method3;
        }
    }

    public AndroidPlatform(OptionalMethod optionalMethod, OptionalMethod optionalMethod2, OptionalMethod optionalMethod3, OptionalMethod optionalMethod4) {
        Method method;
        Method method2;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", (Class[]) null);
            method = cls.getMethod("open", new Class[]{String.class});
            method2 = cls.getMethod("warnIfOpen", (Class[]) null);
            method3 = method4;
        } catch (Exception unused) {
            method2 = null;
            method = null;
        }
        this.g = new CloseGuard(method3, method, method2);
        this.f10910c = optionalMethod;
        this.d = optionalMethod2;
        this.f10911e = optionalMethod3;
        this.f10912f = optionalMethod4;
    }

    public static boolean n(String str, Class cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", (Class[]) null).invoke(obj, (Object[]) null)).booleanValue();
            } catch (NoSuchMethodException unused2) {
                return true;
            }
        }
    }

    public final CertificateChainCleaner c(X509TrustManager x509TrustManager) {
        Class<String> cls = String.class;
        try {
            Class<?> cls2 = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new AndroidCertificateChainCleaner(cls2.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls2.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, cls, cls}));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    public final TrustRootIndex d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new AndroidTrustRootIndex(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.d(x509TrustManager);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [N5.d, java.lang.Object] */
    public void f(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f10910c.c(sSLSocket, Boolean.TRUE);
            this.d.c(sSLSocket, str);
        }
        OptionalMethod optionalMethod = this.f10912f;
        if (optionalMethod != null && optionalMethod.a(sSLSocket.getClass()) != null) {
            ? obj = new Object();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Protocol protocol = (Protocol) list.get(i2);
                if (protocol != Protocol.HTTP_1_0) {
                    obj.A(protocol.f10628a.length());
                    String str2 = protocol.f10628a;
                    obj.C(0, str2.length(), str2);
                }
            }
            try {
                try {
                    optionalMethod.b(sSLSocket, obj.n(obj.f1932b));
                } catch (InvocationTargetException e6) {
                    Throwable targetException = e6.getTargetException();
                    if (targetException instanceof RuntimeException) {
                        throw ((RuntimeException) targetException);
                    }
                    AssertionError assertionError = new AssertionError("Unexpected exception");
                    assertionError.initCause(targetException);
                    throw assertionError;
                }
            } catch (EOFException e7) {
                throw new AssertionError(e7);
            }
        }
    }

    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int i2) {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e6) {
            if (Util.p(e6)) {
                throw new IOException(e6);
            }
            throw e6;
        } catch (SecurityException e7) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e7);
            throw iOException;
        } catch (ClassCastException e8) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e8);
                throw iOException2;
            }
            throw e8;
        }
    }

    public final SSLContext h() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e6) {
            throw new IllegalStateException("No TLS provider", e6);
        }
    }

    public String i(SSLSocket sSLSocket) {
        OptionalMethod optionalMethod = this.f10911e;
        if (optionalMethod == null || optionalMethod.a(sSLSocket.getClass()) == null) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) optionalMethod.b(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, Util.f10688i);
            }
            return null;
        } catch (InvocationTargetException e6) {
            Throwable targetException = e6.getTargetException();
            if (targetException instanceof RuntimeException) {
                throw ((RuntimeException) targetException);
            }
            AssertionError assertionError = new AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public final Object j() {
        CloseGuard closeGuard = this.g;
        Method method = closeGuard.f10917a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke((Object) null, (Object[]) null);
            closeGuard.f10918b.invoke(invoke, new Object[]{"response.body().close()"});
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean k(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return n(str, cls, cls.getMethod("getInstance", (Class[]) null).invoke((Object) null, (Object[]) null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
            throw Util.a("unable to determine cleartext support", e6);
        }
    }

    public final void l(int i2, String str, Throwable th) {
        int min;
        int i5 = 5;
        if (i2 != 5) {
            i5 = 3;
        }
        if (th != null) {
            str = str + 10 + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i6 = 0;
        while (i6 < length) {
            int indexOf = str.indexOf(10, i6);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i6 + 4000);
                Log.println(i5, "OkHttp", str.substring(i6, min));
                if (min >= indexOf) {
                    break;
                }
                i6 = min;
            }
            i6 = min + 1;
        }
    }

    public final void m(Object obj, String str) {
        CloseGuard closeGuard = this.g;
        closeGuard.getClass();
        if (obj != null) {
            try {
                closeGuard.f10919c.invoke(obj, (Object[]) null);
                return;
            } catch (Exception unused) {
            }
        }
        l(5, str, (Throwable) null);
    }
}
