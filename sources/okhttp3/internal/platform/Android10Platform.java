package okhttp3.internal.platform;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

class Android10Platform extends AndroidPlatform {
    public final void f(SSLSocket sSLSocket, String str, List list) {
        try {
            if (SSLSockets.isSupportedSocket(sSLSocket)) {
                SSLSockets.setUseSessionTickets(sSLSocket, true);
            }
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) Platform.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e6) {
            throw new IOException("Android internal error", e6);
        }
    }

    public final String i(SSLSocket sSLSocket) {
        String e6 = sSLSocket.getApplicationProtocol();
        if (e6 == null || e6.isEmpty()) {
            return null;
        }
        return e6;
    }
}
