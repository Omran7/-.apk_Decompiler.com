package okhttp3.internal.platform;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

public class ConscryptPlatform extends Platform {
    private ConscryptPlatform() {
    }

    public static ConscryptPlatform n() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new ConscryptPlatform();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider o() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    public final void e(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public final void f(SSLSocket sSLSocket, String str, List list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) Platform.b(list).toArray(new String[0]));
        }
    }

    public final SSLContext h() {
        try {
            return SSLContext.getInstance("TLSv1.3", o());
        } catch (NoSuchAlgorithmException e6) {
            try {
                return SSLContext.getInstance("TLS", o());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e6);
            }
        }
    }

    public final String i(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}
