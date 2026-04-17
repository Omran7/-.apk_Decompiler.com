package N5;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class m extends c {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ Socket f1947k;

    public m(Socket socket) {
        this.f1947k = socket;
    }

    public final IOException l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    public final void m() {
        Socket socket = this.f1947k;
        try {
            socket.close();
        } catch (Exception e6) {
            Logger logger = n.f1948a;
            Level level = Level.WARNING;
            logger.log(level, "Failed to close timed out socket " + socket, e6);
        } catch (AssertionError e7) {
            if (e7.getCause() == null || e7.getMessage() == null || !e7.getMessage().contains("getsockname failed")) {
                throw e7;
            }
            Logger logger2 = n.f1948a;
            Level level2 = Level.WARNING;
            logger2.log(level2, "Failed to close timed out socket " + socket, e7);
        }
    }
}
