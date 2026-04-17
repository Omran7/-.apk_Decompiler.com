package okhttp3;

import I3.h;
import N5.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheInterceptor;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.ConnectInterceptor;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.BridgeInterceptor;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RetryAndFollowUpInterceptor;
import okhttp3.internal.platform.Platform;

final class RealCall implements Call {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f10629a;

    /* renamed from: b  reason: collision with root package name */
    public final RetryAndFollowUpInterceptor f10630b;

    /* renamed from: c  reason: collision with root package name */
    public final c f10631c;
    public EventListener d;

    /* renamed from: e  reason: collision with root package name */
    public final Request f10632e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f10633f;

    public final class AsyncCall extends NamedRunnable {

        /* renamed from: b  reason: collision with root package name */
        public final h f10635b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public AsyncCall(I3.h r12) {
            /*
                r10 = this;
                okhttp3.RealCall.this = r11
                okhttp3.Request r11 = r11.f10632e
                okhttp3.HttpUrl r11 = r11.f10637a
                r11.getClass()
                java.lang.String r0 = "/..."
                okhttp3.HttpUrl$Builder r1 = new okhttp3.HttpUrl$Builder     // Catch:{ IllegalArgumentException -> 0x0014 }
                r1.<init>()     // Catch:{ IllegalArgumentException -> 0x0014 }
                r1.b(r11, r0)     // Catch:{ IllegalArgumentException -> 0x0014 }
                goto L_0x0015
            L_0x0014:
                r1 = 0
            L_0x0015:
                r1.getClass()
                r6 = 0
                r7 = 0
                java.lang.String r2 = ""
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r8 = 0
                r9 = 1
                java.lang.String r11 = okhttp3.HttpUrl.a(r2, r3, r4, r5, r6, r7, r8, r9)
                r1.f10569b = r11
                r6 = 0
                r7 = 0
                java.lang.String r2 = ""
                r3 = 0
                r4 = 0
                java.lang.String r5 = " \"':;<=>@[]^`{}|/\\?#"
                r8 = 0
                r9 = 1
                java.lang.String r11 = okhttp3.HttpUrl.a(r2, r3, r4, r5, r6, r7, r8, r9)
                r1.f10570c = r11
                okhttp3.HttpUrl r11 = r1.a()
                java.lang.String r11 = r11.f10567i
                java.lang.Object[] r11 = new java.lang.Object[]{r11}
                java.lang.String r0 = "OkHttp %s"
                r10.<init>(r0, r11)
                r10.f10635b = r12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.AsyncCall.<init>(okhttp3.RealCall, I3.h):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x002a A[Catch:{ IOException -> 0x0042, all -> 0x0024, all -> 0x003f }] */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0049 A[Catch:{ IOException -> 0x0042, all -> 0x0024, all -> 0x003f }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x004a A[Catch:{ IOException -> 0x0042, all -> 0x0024, all -> 0x003f }] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[Catch:{ IOException -> 0x0042, all -> 0x0024, all -> 0x003f }] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006e A[Catch:{ IOException -> 0x0042, all -> 0x0024, all -> 0x003f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r8 = this;
                I3.h r0 = r8.f10635b
                java.lang.String r1 = "Callback failure for "
                java.lang.String r2 = "canceled due to "
                okhttp3.RealCall r3 = okhttp3.RealCall.this
                okhttp3.OkHttpClient r4 = r3.f10629a
                N5.c r5 = r3.f10631c
                r5.i()
                r6 = 0
                okhttp3.Response r6 = r3.b()     // Catch:{ IOException -> 0x0042, all -> 0x0024 }
                r7 = 1
                r0.C(r3, r6)     // Catch:{ IOException -> 0x0021, all -> 0x001e }
            L_0x0018:
                okhttp3.Dispatcher r0 = r4.f10585a
                r0.a(r8)
                goto L_0x0077
            L_0x001e:
                r1 = move-exception
                r6 = r7
                goto L_0x0025
            L_0x0021:
                r2 = move-exception
                r6 = r7
                goto L_0x0043
            L_0x0024:
                r1 = move-exception
            L_0x0025:
                r3.a()     // Catch:{ all -> 0x003f }
                if (r6 != 0) goto L_0x0041
                java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x003f }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
                r6.<init>(r2)     // Catch:{ all -> 0x003f }
                r6.append(r1)     // Catch:{ all -> 0x003f }
                java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x003f }
                r5.<init>(r2)     // Catch:{ all -> 0x003f }
                r0.A(r3, r5)     // Catch:{ all -> 0x003f }
                goto L_0x0041
            L_0x003f:
                r0 = move-exception
                goto L_0x0078
            L_0x0041:
                throw r1     // Catch:{ all -> 0x003f }
            L_0x0042:
                r2 = move-exception
            L_0x0043:
                boolean r5 = r5.k()     // Catch:{ all -> 0x003f }
                if (r5 != 0) goto L_0x004a
                goto L_0x0055
            L_0x004a:
                java.io.InterruptedIOException r5 = new java.io.InterruptedIOException     // Catch:{ all -> 0x003f }
                java.lang.String r7 = "timeout"
                r5.<init>(r7)     // Catch:{ all -> 0x003f }
                r5.initCause(r2)     // Catch:{ all -> 0x003f }
                r2 = r5
            L_0x0055:
                if (r6 == 0) goto L_0x006e
                okhttp3.internal.platform.Platform r0 = okhttp3.internal.platform.Platform.f10930a     // Catch:{ all -> 0x003f }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
                r5.<init>(r1)     // Catch:{ all -> 0x003f }
                java.lang.String r1 = r3.c()     // Catch:{ all -> 0x003f }
                r5.append(r1)     // Catch:{ all -> 0x003f }
                java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x003f }
                r3 = 4
                r0.l(r3, r1, r2)     // Catch:{ all -> 0x003f }
                goto L_0x0018
            L_0x006e:
                okhttp3.EventListener r1 = r3.d     // Catch:{ all -> 0x003f }
                r1.getClass()     // Catch:{ all -> 0x003f }
                r0.A(r3, r2)     // Catch:{ all -> 0x003f }
                goto L_0x0018
            L_0x0077:
                return
            L_0x0078:
                okhttp3.Dispatcher r1 = r4.f10585a
                r1.a(r8)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.RealCall.AsyncCall.a():void");
        }
    }

    public RealCall(OkHttpClient okHttpClient, Request request) {
        this.f10629a = okHttpClient;
        this.f10632e = request;
        this.f10630b = new RetryAndFollowUpInterceptor(okHttpClient);
        AnonymousClass1 r42 = new c() {
            public final void m() {
                RealCall.this.a();
            }
        };
        this.f10631c = r42;
        r42.g((long) okHttpClient.f10582D, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        RetryAndFollowUpInterceptor retryAndFollowUpInterceptor = this.f10630b;
        retryAndFollowUpInterceptor.d = true;
        StreamAllocation streamAllocation = retryAndFollowUpInterceptor.f10756b;
        if (streamAllocation != null) {
            synchronized (streamAllocation.d) {
                streamAllocation.f10738m = true;
                httpCodec = streamAllocation.f10739n;
                realConnection = streamAllocation.f10735j;
            }
            if (httpCodec != null) {
                httpCodec.cancel();
            } else if (realConnection != null) {
                Util.f(realConnection.d);
            }
        }
    }

    public final Response b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f10629a.d);
        arrayList.add(this.f10630b);
        arrayList.add(new BridgeInterceptor(this.f10629a.f10591q));
        this.f10629a.getClass();
        arrayList.add(new CacheInterceptor((InternalCache) null));
        arrayList.add(new ConnectInterceptor(this.f10629a));
        arrayList.addAll(this.f10629a.f10588e);
        arrayList.add(new Object());
        Request request = this.f10632e;
        EventListener eventListener = this.d;
        OkHttpClient okHttpClient = this.f10629a;
        Response a6 = new RealInterceptorChain(arrayList, (StreamAllocation) null, (HttpCodec) null, (RealConnection) null, 0, request, this, eventListener, okHttpClient.f10583E, okHttpClient.F, okHttpClient.f10584G).a(request);
        if (!this.f10630b.d) {
            return a6;
        }
        Util.e(a6);
        throw new IOException("Canceled");
    }

    public final String c() {
        String str;
        HttpUrl.Builder builder;
        StringBuilder sb = new StringBuilder();
        if (this.f10630b.d) {
            str = "canceled ";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append("call");
        sb.append(" to ");
        HttpUrl httpUrl = this.f10632e.f10637a;
        httpUrl.getClass();
        try {
            builder = new HttpUrl.Builder();
            builder.b(httpUrl, "/...");
        } catch (IllegalArgumentException unused) {
            builder = null;
        }
        builder.getClass();
        builder.f10569b = HttpUrl.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        builder.f10570c = HttpUrl.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        sb.append(builder.a().f10567i);
        return sb.toString();
    }

    public final Object clone() {
        Request request = this.f10632e;
        OkHttpClient okHttpClient = this.f10629a;
        RealCall realCall = new RealCall(okHttpClient, request);
        realCall.d = EventListener.this;
        return realCall;
    }

    public final void k(h hVar) {
        synchronized (this) {
            if (!this.f10633f) {
                this.f10633f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.f10630b.f10757c = Platform.f10930a.j();
        this.d.getClass();
        Dispatcher dispatcher = this.f10629a.f10585a;
        AsyncCall asyncCall = new AsyncCall(hVar);
        synchronized (dispatcher) {
            dispatcher.f10550b.add(asyncCall);
        }
        dispatcher.b();
    }
}
