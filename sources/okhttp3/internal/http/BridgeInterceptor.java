package okhttp3.internal.http;

import N5.k;
import N5.n;
import N5.p;
import java.util.List;
import java.util.logging.Logger;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;

public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final CookieJar f10741a;

    public BridgeInterceptor(CookieJar cookieJar) {
        this.f10741a = cookieJar;
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        boolean z3;
        BridgeInterceptor bridgeInterceptor;
        RealInterceptorChain realInterceptorChain2 = realInterceptorChain;
        Request request = realInterceptorChain2.f10747f;
        Request.Builder a6 = request.a();
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            MediaType b6 = requestBody.b();
            if (b6 != null) {
                a6.f10644c.c("Content-Type", b6.f10574a);
            }
            long a7 = requestBody.a();
            if (a7 != -1) {
                a6.f10644c.c("Content-Length", Long.toString(a7));
                a6.c("Transfer-Encoding");
            } else {
                a6.f10644c.c("Transfer-Encoding", "chunked");
                a6.c("Content-Length");
            }
        }
        Headers headers = request.f10639c;
        String a8 = headers.a("Host");
        HttpUrl httpUrl = request.f10637a;
        if (a8 == null) {
            a6.f10644c.c("Host", Util.l(httpUrl, false));
        }
        if (headers.a("Connection") == null) {
            a6.f10644c.c("Connection", "Keep-Alive");
        }
        if (headers.a("Accept-Encoding") == null && headers.a("Range") == null) {
            a6.f10644c.c("Accept-Encoding", "gzip");
            z3 = true;
            bridgeInterceptor = this;
        } else {
            bridgeInterceptor = this;
            z3 = false;
        }
        CookieJar cookieJar = bridgeInterceptor.f10741a;
        List a9 = cookieJar.a();
        if (!a9.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            for (int size = a9.size(); i2 < size; size = size) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                Cookie cookie = (Cookie) a9.get(i2);
                sb.append(cookie.f10542a);
                sb.append('=');
                sb.append(cookie.f10543b);
                i2++;
            }
            a6.f10644c.c("Cookie", sb.toString());
        }
        if (headers.a("User-Agent") == null) {
            a6.f10644c.c("User-Agent", "okhttp/3.12.13");
        }
        Response a10 = realInterceptorChain2.a(a6.a());
        HttpHeaders.d(cookieJar, httpUrl, a10.f10653f);
        Response.Builder j6 = a10.j();
        j6.f10661a = request;
        if (z3 && "gzip".equalsIgnoreCase(a10.d("Content-Encoding")) && HttpHeaders.b(a10)) {
            k kVar = new k(a10.f10654p.k());
            Headers.Builder c3 = a10.f10653f.c();
            c3.b("Content-Encoding");
            c3.b("Content-Length");
            j6.f10665f = new Headers(c3).c();
            String d = a10.d("Content-Type");
            Logger logger = n.f1948a;
            j6.g = new RealResponseBody(d, -1, new p(kVar));
        }
        return j6.a();
    }
}
