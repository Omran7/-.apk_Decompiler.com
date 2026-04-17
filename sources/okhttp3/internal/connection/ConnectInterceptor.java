package okhttp3.internal.connection;

import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.RealInterceptorChain;

public final class ConnectInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f10704a;

    public ConnectInterceptor(OkHttpClient okHttpClient) {
        this.f10704a = okHttpClient;
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.f10747f;
        StreamAllocation streamAllocation = realInterceptorChain.f10744b;
        boolean z3 = !request.f10638b.equals("GET");
        OkHttpClient okHttpClient = this.f10704a;
        streamAllocation.getClass();
        int i2 = realInterceptorChain.f10748i;
        int i5 = realInterceptorChain.f10749j;
        int i6 = realInterceptorChain.f10750k;
        okHttpClient.getClass();
        try {
            HttpCodec h = streamAllocation.d(i2, i5, i6, okHttpClient.f10581C, z3).h(okHttpClient, realInterceptorChain, streamAllocation);
            synchronized (streamAllocation.d) {
                streamAllocation.f10739n = h;
            }
            return realInterceptorChain.b(request, streamAllocation, h, streamAllocation.a());
        } catch (IOException e6) {
            throw new RouteException(e6);
        }
    }
}
