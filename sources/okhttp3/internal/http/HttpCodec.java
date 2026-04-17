package okhttp3.internal.http;

import N5.t;
import okhttp3.Request;
import okhttp3.Response;

public interface HttpCodec {
    void a();

    void b(Request request);

    RealResponseBody c(Response response);

    void cancel();

    void d();

    t e(Request request, long j6);

    Response.Builder f(boolean z3);
}
