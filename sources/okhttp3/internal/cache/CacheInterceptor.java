package okhttp3.internal.cache;

import N5.d;
import N5.u;
import N5.w;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.internal.Util;

public final class CacheInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final InternalCache f10699a;

    /* renamed from: okhttp3.internal.cache.CacheInterceptor$1  reason: invalid class name */
    class AnonymousClass1 implements u {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10700a;

        public final w b() {
            throw null;
        }

        public final void close() {
            boolean z3;
            if (!this.f10700a) {
                try {
                    z3 = Util.r(this, 100, TimeUnit.MILLISECONDS);
                } catch (IOException unused) {
                    z3 = false;
                }
                if (!z3) {
                    this.f10700a = true;
                    throw null;
                }
            }
            throw null;
        }

        public final long e(long j6, d dVar) {
            throw null;
        }
    }

    public CacheInterceptor(InternalCache internalCache) {
        this.f10699a = internalCache;
    }

    public static boolean b(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    public static Response c(Response response) {
        if (response == null || response.f10654p == null) {
            return response;
        }
        Response.Builder j6 = response.j();
        j6.g = null;
        return j6.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c3, code lost:
        if (r0.c().f10492e == false) goto L_0x01df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response a(okhttp3.internal.http.RealInterceptorChain r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            okhttp3.internal.cache.InternalCache r2 = r0.f10699a
            r3 = 0
            if (r2 != 0) goto L_0x021d
            java.lang.System.currentTimeMillis()
            okhttp3.Request r4 = r1.f10747f
            okhttp3.internal.cache.CacheStrategy r5 = new okhttp3.internal.cache.CacheStrategy
            r5.<init>(r4, r3)
            if (r4 == 0) goto L_0x002b
            okhttp3.CacheControl r6 = r4.f10641f
            if (r6 == 0) goto L_0x001a
            goto L_0x0022
        L_0x001a:
            okhttp3.Headers r6 = r4.f10639c
            okhttp3.CacheControl r6 = okhttp3.CacheControl.a(r6)
            r4.f10641f = r6
        L_0x0022:
            boolean r4 = r6.f10495j
            if (r4 == 0) goto L_0x002b
            okhttp3.internal.cache.CacheStrategy r5 = new okhttp3.internal.cache.CacheStrategy
            r5.<init>(r3, r3)
        L_0x002b:
            if (r2 != 0) goto L_0x0218
            okhttp3.Response r4 = r5.f10702b
            okhttp3.Request r5 = r5.f10701a
            if (r5 != 0) goto L_0x005d
            if (r4 != 0) goto L_0x005d
            okhttp3.Response$Builder r2 = new okhttp3.Response$Builder
            r2.<init>()
            okhttp3.Request r1 = r1.f10747f
            r2.f10661a = r1
            okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_1
            r2.f10662b = r1
            r1 = 504(0x1f8, float:7.06E-43)
            r2.f10663c = r1
            java.lang.String r1 = "Unsatisfiable Request (only-if-cached)"
            r2.d = r1
            okhttp3.ResponseBody r1 = okhttp3.internal.Util.f10685c
            r2.g = r1
            r3 = -1
            r2.f10668k = r3
            long r3 = java.lang.System.currentTimeMillis()
            r2.f10669l = r3
            okhttp3.Response r1 = r2.a()
            return r1
        L_0x005d:
            java.lang.String r6 = "cacheResponse"
            if (r5 != 0) goto L_0x0075
            okhttp3.Response$Builder r1 = r4.j()
            okhttp3.Response r2 = c(r4)
            if (r2 == 0) goto L_0x006e
            okhttp3.Response.Builder.b(r6, r2)
        L_0x006e:
            r1.f10666i = r2
            okhttp3.Response r1 = r1.a()
            return r1
        L_0x0075:
            okhttp3.Response r1 = r1.a(r5)
            java.lang.String r7 = "networkResponse"
            if (r4 == 0) goto L_0x014f
            int r8 = r1.f10651c
            r9 = 304(0x130, float:4.26E-43)
            if (r8 != r9) goto L_0x014a
            okhttp3.Response$Builder r5 = r4.j()
            okhttp3.Headers$Builder r8 = new okhttp3.Headers$Builder
            r8.<init>()
            okhttp3.Headers r9 = r4.f10653f
            int r10 = r9.d()
            r12 = 0
        L_0x0093:
            okhttp3.Headers r13 = r1.f10653f
            java.lang.String r14 = "Content-Type"
            java.lang.String r15 = "Content-Encoding"
            java.lang.String r11 = "Content-Length"
            if (r12 >= r10) goto L_0x00e4
            java.lang.String r3 = r9.b(r12)
            java.lang.String r0 = r9.e(r12)
            r16 = r9
            java.lang.String r9 = "Warning"
            boolean r9 = r9.equalsIgnoreCase(r3)
            if (r9 == 0) goto L_0x00b8
            java.lang.String r9 = "1"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L_0x00b8
            goto L_0x00dc
        L_0x00b8:
            boolean r9 = r11.equalsIgnoreCase(r3)
            if (r9 != 0) goto L_0x00d7
            boolean r9 = r15.equalsIgnoreCase(r3)
            if (r9 != 0) goto L_0x00d7
            boolean r9 = r14.equalsIgnoreCase(r3)
            if (r9 == 0) goto L_0x00cb
            goto L_0x00d7
        L_0x00cb:
            boolean r9 = b(r3)
            if (r9 == 0) goto L_0x00d7
            java.lang.String r9 = r13.a(r3)
            if (r9 != 0) goto L_0x00dc
        L_0x00d7:
            okhttp3.internal.Internal r9 = okhttp3.internal.Internal.f10681a
            r9.b(r8, r3, r0)
        L_0x00dc:
            int r12 = r12 + 1
            r0 = r17
            r9 = r16
            r3 = 0
            goto L_0x0093
        L_0x00e4:
            int r0 = r13.d()
            r3 = 0
        L_0x00e9:
            if (r3 >= r0) goto L_0x0114
            java.lang.String r9 = r13.b(r3)
            boolean r10 = r11.equalsIgnoreCase(r9)
            if (r10 != 0) goto L_0x0111
            boolean r10 = r15.equalsIgnoreCase(r9)
            if (r10 != 0) goto L_0x0111
            boolean r10 = r14.equalsIgnoreCase(r9)
            if (r10 == 0) goto L_0x0102
            goto L_0x0111
        L_0x0102:
            boolean r10 = b(r9)
            if (r10 == 0) goto L_0x0111
            okhttp3.internal.Internal r10 = okhttp3.internal.Internal.f10681a
            java.lang.String r12 = r13.e(r3)
            r10.b(r8, r9, r12)
        L_0x0111:
            int r3 = r3 + 1
            goto L_0x00e9
        L_0x0114:
            okhttp3.Headers r0 = new okhttp3.Headers
            r0.<init>(r8)
            okhttp3.Headers$Builder r0 = r0.c()
            r5.f10665f = r0
            long r8 = r1.f10658t
            r5.f10668k = r8
            long r8 = r1.f10659u
            r5.f10669l = r8
            okhttp3.Response r0 = c(r4)
            if (r0 == 0) goto L_0x0130
            okhttp3.Response.Builder.b(r6, r0)
        L_0x0130:
            r5.f10666i = r0
            okhttp3.Response r0 = c(r1)
            if (r0 == 0) goto L_0x013b
            okhttp3.Response.Builder.b(r7, r0)
        L_0x013b:
            r5.h = r0
            r5.a()
            okhttp3.ResponseBody r0 = r1.f10654p
            r0.close()
            r2.a()
            r0 = 0
            throw r0
        L_0x014a:
            okhttp3.ResponseBody r0 = r4.f10654p
            okhttp3.internal.Util.e(r0)
        L_0x014f:
            okhttp3.Response$Builder r0 = r1.j()
            okhttp3.Response r3 = c(r4)
            if (r3 == 0) goto L_0x015c
            okhttp3.Response.Builder.b(r6, r3)
        L_0x015c:
            r0.f10666i = r3
            okhttp3.Response r1 = c(r1)
            if (r1 == 0) goto L_0x0167
            okhttp3.Response.Builder.b(r7, r1)
        L_0x0167:
            r0.h = r1
            okhttp3.Response r0 = r0.a()
            if (r2 == 0) goto L_0x0217
            boolean r1 = okhttp3.internal.http.HttpHeaders.b(r0)
            if (r1 == 0) goto L_0x01e7
            int r1 = r0.f10651c
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 0
            if (r1 == r3) goto L_0x01c5
            r3 = 410(0x19a, float:5.75E-43)
            if (r1 == r3) goto L_0x01c5
            r3 = 414(0x19e, float:5.8E-43)
            if (r1 == r3) goto L_0x01c5
            r3 = 501(0x1f5, float:7.02E-43)
            if (r1 == r3) goto L_0x01c5
            r3 = 203(0xcb, float:2.84E-43)
            if (r1 == r3) goto L_0x01c5
            r3 = 204(0xcc, float:2.86E-43)
            if (r1 == r3) goto L_0x01c5
            r3 = 307(0x133, float:4.3E-43)
            if (r1 == r3) goto L_0x01a4
            r3 = 308(0x134, float:4.32E-43)
            if (r1 == r3) goto L_0x01c5
            r3 = 404(0x194, float:5.66E-43)
            if (r1 == r3) goto L_0x01c5
            r3 = 405(0x195, float:5.68E-43)
            if (r1 == r3) goto L_0x01c5
            switch(r1) {
                case 300: goto L_0x01c5;
                case 301: goto L_0x01c5;
                case 302: goto L_0x01a4;
                default: goto L_0x01a3;
            }
        L_0x01a3:
            goto L_0x01df
        L_0x01a4:
            java.lang.String r1 = "Expires"
            java.lang.String r1 = r0.d(r1)
            if (r1 != 0) goto L_0x01c5
            okhttp3.CacheControl r1 = r0.c()
            r3 = -1
            int r1 = r1.f10491c
            if (r1 != r3) goto L_0x01c5
            okhttp3.CacheControl r1 = r0.c()
            boolean r1 = r1.f10493f
            if (r1 != 0) goto L_0x01c5
            okhttp3.CacheControl r1 = r0.c()
            boolean r1 = r1.f10492e
            if (r1 == 0) goto L_0x01df
        L_0x01c5:
            okhttp3.CacheControl r1 = r0.c()
            boolean r1 = r1.f10490b
            if (r1 != 0) goto L_0x01df
            okhttp3.CacheControl r1 = r5.f10641f
            if (r1 == 0) goto L_0x01d2
            goto L_0x01da
        L_0x01d2:
            okhttp3.Headers r1 = r5.f10639c
            okhttp3.CacheControl r1 = okhttp3.CacheControl.a(r1)
            r5.f10641f = r1
        L_0x01da:
            boolean r1 = r1.f10490b
            if (r1 != 0) goto L_0x01df
            r4 = 1
        L_0x01df:
            if (r4 != 0) goto L_0x01e2
            goto L_0x01e7
        L_0x01e2:
            r2.b()
            r0 = 0
            throw r0
        L_0x01e7:
            java.lang.String r1 = r5.f10638b
            java.lang.String r3 = "POST"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0212
            java.lang.String r3 = "PATCH"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0212
            java.lang.String r3 = "PUT"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0212
            java.lang.String r3 = "DELETE"
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x0212
            java.lang.String r3 = "MOVE"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0212
            goto L_0x0217
        L_0x0212:
            r2.remove()     // Catch:{ IOException -> 0x0217 }
            r1 = 0
            throw r1     // Catch:{ IOException -> 0x0217 }
        L_0x0217:
            return r0
        L_0x0218:
            r1 = r3
            r2.c()
            throw r1
        L_0x021d:
            r1 = r3
            r2.get()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheInterceptor.a(okhttp3.internal.http.RealInterceptorChain):okhttp3.Response");
    }
}
