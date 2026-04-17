package okhttp3;

import h0.C0552a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

public final class Request {

    /* renamed from: a  reason: collision with root package name */
    public final HttpUrl f10637a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10638b;

    /* renamed from: c  reason: collision with root package name */
    public final Headers f10639c;
    public final RequestBody d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f10640e;

    /* renamed from: f  reason: collision with root package name */
    public volatile CacheControl f10641f;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public HttpUrl f10642a;

        /* renamed from: b  reason: collision with root package name */
        public String f10643b = "GET";

        /* renamed from: c  reason: collision with root package name */
        public Headers.Builder f10644c = new Headers.Builder();
        public RequestBody d;

        /* renamed from: e  reason: collision with root package name */
        public Map f10645e = Collections.emptyMap();

        public final Request a() {
            if (this.f10642a != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public final void b(String str, RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (requestBody != null && !HttpMethod.a(str)) {
                throw new IllegalArgumentException(C0552a.o("method ", str, " must not have a request body."));
            } else if (requestBody != null || (!str.equals("POST") && !str.equals("PUT") && !str.equals("PATCH") && !str.equals("PROPPATCH") && !str.equals("REPORT"))) {
                this.f10643b = str;
                this.d = requestBody;
            } else {
                throw new IllegalArgumentException(C0552a.o("method ", str, " must have a request body."));
            }
        }

        public final void c(String str) {
            this.f10644c.b(str);
        }
    }

    public Request(Builder builder) {
        Map map;
        this.f10637a = builder.f10642a;
        this.f10638b = builder.f10643b;
        Headers.Builder builder2 = builder.f10644c;
        builder2.getClass();
        this.f10639c = new Headers(builder2);
        this.d = builder.d;
        byte[] bArr = Util.f10683a;
        Map map2 = builder.f10645e;
        if (map2.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = Collections.unmodifiableMap(new LinkedHashMap(map2));
        }
        this.f10640e = map;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [okhttp3.Request$Builder, java.lang.Object] */
    public final Builder a() {
        Map map;
        ? obj = new Object();
        obj.f10645e = Collections.emptyMap();
        obj.f10642a = this.f10637a;
        obj.f10643b = this.f10638b;
        obj.d = this.d;
        Map map2 = this.f10640e;
        if (map2.isEmpty()) {
            map = Collections.emptyMap();
        } else {
            map = new LinkedHashMap(map2);
        }
        obj.f10645e = map;
        obj.f10644c = this.f10639c.c();
        return obj;
    }

    public final String toString() {
        return "Request{method=" + this.f10638b + ", url=" + this.f10637a + ", tags=" + this.f10640e + '}';
    }
}
