package N5;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f1948a = Logger.getLogger(n.class.getName());

    public static a a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getOutputStream() != null) {
            m mVar = new m(socket);
            OutputStream outputStream = socket.getOutputStream();
            if (outputStream != null) {
                return new a(mVar, new a((w) mVar, outputStream));
            }
            throw new IllegalArgumentException("out == null");
        } else {
            throw new IOException("socket's output stream == null");
        }
    }

    public static b b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        } else if (socket.getInputStream() != null) {
            m mVar = new m(socket);
            InputStream inputStream = socket.getInputStream();
            if (inputStream != null) {
                return new b(mVar, new b((w) mVar, inputStream));
            }
            throw new IllegalArgumentException("in == null");
        } else {
            throw new IOException("socket's input stream == null");
        }
    }
}
