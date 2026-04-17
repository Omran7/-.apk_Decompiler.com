package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.Util;

final class Jdk9Platform extends Platform {

    /* renamed from: c  reason: collision with root package name */
    public final Method f10920c;
    public final Method d;

    public Jdk9Platform(Method method, Method method2) {
        this.f10920c = method;
        this.d = method2;
    }

    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b6 = Platform.b(list);
            this.f10920c.invoke(sSLParameters, new Object[]{b6.toArray(new String[b6.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e6) {
            throw Util.a("unable to set ssl parameters", e6);
        }
    }

    public final String i(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, (Object[]) null);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e6) {
            if (e6.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw Util.a("failed to get ALPN selected protocol", e6);
        } catch (IllegalAccessException e7) {
            throw Util.a("failed to get ALPN selected protocol", e7);
        }
    }
}
