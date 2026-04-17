package okhttp3.internal.connection;

import java.io.IOException;

public final class RouteException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final IOException f10720a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f10721b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f10720a = iOException;
        this.f10721b = iOException;
    }
}
