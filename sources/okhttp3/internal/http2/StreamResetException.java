package okhttp3.internal.http2;

import java.io.IOException;

public final class StreamResetException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final ErrorCode f10909a;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.f10909a = errorCode;
    }
}
