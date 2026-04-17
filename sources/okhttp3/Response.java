package okhttp3;

import java.io.Closeable;
import okhttp3.Headers;

public final class Response implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Request f10649a;

    /* renamed from: b  reason: collision with root package name */
    public final Protocol f10650b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10651c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final Handshake f10652e;

    /* renamed from: f  reason: collision with root package name */
    public final Headers f10653f;

    /* renamed from: p  reason: collision with root package name */
    public final ResponseBody f10654p;

    /* renamed from: q  reason: collision with root package name */
    public final Response f10655q;

    /* renamed from: r  reason: collision with root package name */
    public final Response f10656r;

    /* renamed from: s  reason: collision with root package name */
    public final Response f10657s;

    /* renamed from: t  reason: collision with root package name */
    public final long f10658t;

    /* renamed from: u  reason: collision with root package name */
    public final long f10659u;

    /* renamed from: v  reason: collision with root package name */
    public volatile CacheControl f10660v;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Request f10661a;

        /* renamed from: b  reason: collision with root package name */
        public Protocol f10662b;

        /* renamed from: c  reason: collision with root package name */
        public int f10663c = -1;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public Handshake f10664e;

        /* renamed from: f  reason: collision with root package name */
        public Headers.Builder f10665f = new Headers.Builder();
        public ResponseBody g;
        public Response h;

        /* renamed from: i  reason: collision with root package name */
        public Response f10666i;

        /* renamed from: j  reason: collision with root package name */
        public Response f10667j;

        /* renamed from: k  reason: collision with root package name */
        public long f10668k;

        /* renamed from: l  reason: collision with root package name */
        public long f10669l;

        public static void b(String str, Response response) {
            if (response.f10654p != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            } else if (response.f10655q != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            } else if (response.f10656r != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            } else if (response.f10657s != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }

        public final Response a() {
            if (this.f10661a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f10662b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f10663c < 0) {
                throw new IllegalStateException("code < 0: " + this.f10663c);
            } else if (this.d != null) {
                return new Response(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    public Response(Builder builder) {
        this.f10649a = builder.f10661a;
        this.f10650b = builder.f10662b;
        this.f10651c = builder.f10663c;
        this.d = builder.d;
        this.f10652e = builder.f10664e;
        Headers.Builder builder2 = builder.f10665f;
        builder2.getClass();
        this.f10653f = new Headers(builder2);
        this.f10654p = builder.g;
        this.f10655q = builder.h;
        this.f10656r = builder.f10666i;
        this.f10657s = builder.f10667j;
        this.f10658t = builder.f10668k;
        this.f10659u = builder.f10669l;
    }

    public final CacheControl c() {
        CacheControl cacheControl = this.f10660v;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl a6 = CacheControl.a(this.f10653f);
        this.f10660v = a6;
        return a6;
    }

    public final void close() {
        ResponseBody responseBody = this.f10654p;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String d(String str) {
        String a6 = this.f10653f.a(str);
        if (a6 != null) {
            return a6;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [okhttp3.Response$Builder, java.lang.Object] */
    public final Builder j() {
        ? obj = new Object();
        obj.f10661a = this.f10649a;
        obj.f10662b = this.f10650b;
        obj.f10663c = this.f10651c;
        obj.d = this.d;
        obj.f10664e = this.f10652e;
        obj.f10665f = this.f10653f.c();
        obj.g = this.f10654p;
        obj.h = this.f10655q;
        obj.f10666i = this.f10656r;
        obj.f10667j = this.f10657s;
        obj.f10668k = this.f10658t;
        obj.f10669l = this.f10659u;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.f10650b + ", code=" + this.f10651c + ", message=" + this.d + ", url=" + this.f10649a.f10637a + '}';
    }
}
