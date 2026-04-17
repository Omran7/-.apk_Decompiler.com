package okhttp3.internal.http;

import N5.h;
import N5.n;
import N5.o;
import h0.C0552a;
import java.net.ProtocolException;
import java.util.logging.Logger;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.StreamAllocation;

public final class CallServerInterceptor implements Interceptor {

    public static final class CountingSink extends h {
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        RequestBody requestBody;
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.h.getClass();
        HttpCodec httpCodec = realInterceptorChain.f10745c;
        Request request = realInterceptorChain.f10747f;
        httpCodec.b(request);
        boolean a6 = HttpMethod.a(request.f10638b);
        StreamAllocation streamAllocation = realInterceptorChain.f10744b;
        Response.Builder builder = null;
        if (a6 && (requestBody = request.d) != null) {
            if ("100-continue".equalsIgnoreCase(request.f10639c.a("Expect"))) {
                httpCodec.d();
                builder = httpCodec.f(true);
            }
            if (builder == null) {
                h hVar = new h(httpCodec.e(request, requestBody.a()));
                Logger logger = n.f1948a;
                o oVar = new o(hVar);
                requestBody.d(oVar);
                oVar.close();
            } else if (realInterceptorChain.d.h == null) {
                streamAllocation.e();
            }
        }
        httpCodec.a();
        if (builder == null) {
            builder = httpCodec.f(false);
        }
        builder.f10661a = request;
        builder.f10664e = streamAllocation.a().f10711f;
        builder.f10668k = currentTimeMillis;
        builder.f10669l = System.currentTimeMillis();
        Response a7 = builder.a();
        int i2 = a7.f10651c;
        if (i2 == 100) {
            Response.Builder f6 = httpCodec.f(false);
            f6.f10661a = request;
            f6.f10664e = streamAllocation.a().f10711f;
            f6.f10668k = currentTimeMillis;
            f6.f10669l = System.currentTimeMillis();
            a7 = f6.a();
            i2 = a7.f10651c;
        }
        Response.Builder j6 = a7.j();
        j6.g = httpCodec.c(a7);
        Response a8 = j6.a();
        if ("close".equalsIgnoreCase(a8.f10649a.f10639c.a("Connection")) || "close".equalsIgnoreCase(a8.d("Connection"))) {
            streamAllocation.e();
        }
        if (i2 == 204 || i2 == 205) {
            ResponseBody responseBody = a8.f10654p;
            if (responseBody.c() > 0) {
                StringBuilder s6 = C0552a.s(i2, "HTTP ", " had non-zero Content-Length: ");
                s6.append(responseBody.c());
                throw new ProtocolException(s6.toString());
            }
        }
        return a8;
    }
}
