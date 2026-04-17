package okhttp3;

import okhttp3.internal.http.RealInterceptorChain;

public interface Interceptor {

    public interface Chain {
    }

    Response a(RealInterceptorChain realInterceptorChain);
}
