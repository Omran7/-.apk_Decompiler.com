package okhttp3.internal.http;

import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.measurement.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.tls.OkHostnameVerifier;

public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f10755a;

    /* renamed from: b  reason: collision with root package name */
    public volatile StreamAllocation f10756b;

    /* renamed from: c  reason: collision with root package name */
    public Object f10757c;
    public volatile boolean d;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient) {
        this.f10755a = okHttpClient;
    }

    public static boolean e(Response response, HttpUrl httpUrl) {
        HttpUrl httpUrl2 = response.f10649a.f10637a;
        if (!httpUrl2.d.equals(httpUrl.d) || httpUrl2.f10565e != httpUrl.f10565e || !httpUrl2.f10562a.equals(httpUrl.f10562a)) {
            return false;
        }
        return true;
    }

    public final Response a(RealInterceptorChain realInterceptorChain) {
        HttpCodec httpCodec;
        Request request = realInterceptorChain.f10747f;
        Call call = realInterceptorChain.g;
        EventListener eventListener = realInterceptorChain.h;
        StreamAllocation streamAllocation = new StreamAllocation(this.f10755a.f10599y, b(request.f10637a), call, eventListener, this.f10757c);
        this.f10756b = streamAllocation;
        int i2 = 0;
        Response response = null;
        while (!this.d) {
            try {
                Response b6 = realInterceptorChain.b(request, streamAllocation, (HttpCodec) null, (RealConnection) null);
                if (response != null) {
                    Response.Builder j6 = b6.j();
                    Response.Builder j7 = response.j();
                    j7.g = null;
                    Response a6 = j7.a();
                    if (a6.f10654p == null) {
                        j6.f10667j = a6;
                        b6 = j6.a();
                    } else {
                        throw new IllegalArgumentException("priorResponse.body != null");
                    }
                }
                try {
                    Request c3 = c(b6, streamAllocation.f10731c);
                    if (c3 == null) {
                        streamAllocation.f();
                        return b6;
                    }
                    Util.e(b6.f10654p);
                    int i5 = i2 + 1;
                    if (i5 > 20) {
                        streamAllocation.f();
                        throw new ProtocolException(a.f(i5, "Too many follow-up requests: "));
                    } else if (!(c3.d instanceof UnrepeatableRequestBody)) {
                        if (!e(b6, c3.f10637a)) {
                            streamAllocation.f();
                            streamAllocation = new StreamAllocation(this.f10755a.f10599y, b(c3.f10637a), call, eventListener, this.f10757c);
                            this.f10756b = streamAllocation;
                        } else {
                            synchronized (streamAllocation.d) {
                                httpCodec = streamAllocation.f10739n;
                            }
                            if (httpCodec != null) {
                                throw new IllegalStateException("Closing the body of " + b6 + " didn't close its backing stream. Bad interceptor?");
                            }
                        }
                        response = b6;
                        request = c3;
                        i2 = i5;
                    } else {
                        streamAllocation.f();
                        throw new HttpRetryException("Cannot retry streamed HTTP body", b6.f10651c);
                    }
                } catch (IOException e6) {
                    streamAllocation.f();
                    throw e6;
                }
            } catch (RouteException e7) {
                if (!d(e7.f10721b, streamAllocation, false, request)) {
                    throw e7.f10720a;
                }
            } catch (IOException e8) {
                if (!d(e8, streamAllocation, !(e8 instanceof ConnectionShutdownException), request)) {
                    throw e8;
                }
            } catch (Throwable th) {
                streamAllocation.g((IOException) null);
                streamAllocation.f();
                throw th;
            }
        }
        streamAllocation.f();
        throw new IOException("Canceled");
    }

    public final Address b(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        OkHostnameVerifier okHostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        boolean equals = httpUrl.f10562a.equals("https");
        OkHttpClient okHttpClient = this.f10755a;
        if (equals) {
            sSLSocketFactory = okHttpClient.f10593s;
            okHostnameVerifier = okHttpClient.f10595u;
            certificatePinner = okHttpClient.f10596v;
        } else {
            sSLSocketFactory = null;
            okHostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.d, httpUrl.f10565e, okHttpClient.f10600z, okHttpClient.f10592r, sSLSocketFactory, okHostnameVerifier, certificatePinner, okHttpClient.f10597w, okHttpClient.f10586b, okHttpClient.f10587c, okHttpClient.f10590p);
    }

    public final Request c(Response response, Route route) {
        String d6;
        HttpUrl.Builder builder;
        HttpUrl httpUrl;
        Request request = response.f10649a;
        String str = request.f10638b;
        RequestBody requestBody = null;
        RequestBody requestBody2 = request.d;
        OkHttpClient okHttpClient = this.f10755a;
        int i2 = response.f10651c;
        if (i2 == 307 || i2 == 308) {
            if (!str.equals("GET") && !str.equals("HEAD")) {
                return null;
            }
        } else if (i2 != 401) {
            int i5 = f.API_PRIORITY_OTHER;
            Response response2 = response.f10657s;
            if (i2 != 503) {
                if (i2 != 407) {
                    if (i2 != 408) {
                        switch (i2) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!okHttpClient.f10581C || (requestBody2 instanceof UnrepeatableRequestBody)) {
                        return null;
                    } else {
                        if (response2 != null && response2.f10651c == 408) {
                            return null;
                        }
                        String d7 = response.d("Retry-After");
                        if (d7 == null) {
                            i5 = 0;
                        } else if (d7.matches("\\d+")) {
                            i5 = Integer.valueOf(d7).intValue();
                        }
                        if (i5 > 0) {
                            return null;
                        }
                        return request;
                    }
                } else if (route.f10673b.type() == Proxy.Type.HTTP) {
                    okHttpClient.f10597w.getClass();
                    return null;
                } else {
                    throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                }
            } else if (response2 != null && response2.f10651c == 503) {
                return null;
            } else {
                String d8 = response.d("Retry-After");
                if (d8 != null && d8.matches("\\d+")) {
                    i5 = Integer.valueOf(d8).intValue();
                }
                if (i5 == 0) {
                    return request;
                }
                return null;
            }
        } else {
            okHttpClient.f10598x.getClass();
            return null;
        }
        if (!okHttpClient.f10580B || (d6 = response.d("Location")) == null) {
            return null;
        }
        HttpUrl httpUrl2 = request.f10637a;
        httpUrl2.getClass();
        try {
            builder = new HttpUrl.Builder();
            builder.b(httpUrl2, d6);
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        if (builder != null) {
            httpUrl = builder.a();
        } else {
            httpUrl = null;
        }
        if (httpUrl == null) {
            return null;
        }
        if (!httpUrl.f10562a.equals(httpUrl2.f10562a) && !okHttpClient.f10579A) {
            return null;
        }
        Request.Builder a6 = request.a();
        if (HttpMethod.a(str)) {
            boolean equals = str.equals("PROPFIND");
            if (!str.equals("PROPFIND")) {
                a6.b("GET", (RequestBody) null);
            } else {
                if (equals) {
                    requestBody = requestBody2;
                }
                a6.b(str, requestBody);
            }
            if (!equals) {
                a6.c("Transfer-Encoding");
                a6.c("Content-Length");
                a6.c("Content-Type");
            }
        }
        if (!e(response, httpUrl)) {
            a6.c("Authorization");
        }
        a6.f10642a = httpUrl;
        return a6.a();
    }

    public final boolean d(IOException iOException, StreamAllocation streamAllocation, boolean z3, Request request) {
        streamAllocation.g(iOException);
        if (!this.f10755a.f10581C) {
            return false;
        }
        if ((z3 && ((request.d instanceof UnrepeatableRequestBody) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z3))) {
            return false;
        }
        if (streamAllocation.f10731c != null) {
            return true;
        }
        RouteSelector.Selection selection = streamAllocation.f10730b;
        if (selection != null && selection.f10728b < selection.f10727a.size()) {
            return true;
        }
        RouteSelector routeSelector = streamAllocation.h;
        if (routeSelector.f10726f >= routeSelector.f10725e.size() && routeSelector.h.isEmpty()) {
            return false;
        }
        return true;
    }
}
