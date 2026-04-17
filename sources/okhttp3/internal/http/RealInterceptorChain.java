package okhttp3.internal.http;

import java.util.ArrayList;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10743a;

    /* renamed from: b  reason: collision with root package name */
    public final StreamAllocation f10744b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpCodec f10745c;
    public final RealConnection d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10746e;

    /* renamed from: f  reason: collision with root package name */
    public final Request f10747f;
    public final Call g;
    public final EventListener h;

    /* renamed from: i  reason: collision with root package name */
    public final int f10748i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10749j;

    /* renamed from: k  reason: collision with root package name */
    public final int f10750k;

    /* renamed from: l  reason: collision with root package name */
    public int f10751l;

    public RealInterceptorChain(ArrayList arrayList, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i2, Request request, Call call, EventListener eventListener, int i5, int i6, int i7) {
        this.f10743a = arrayList;
        this.d = realConnection;
        this.f10744b = streamAllocation;
        this.f10745c = httpCodec;
        this.f10746e = i2;
        this.f10747f = request;
        this.g = call;
        this.h = eventListener;
        this.f10748i = i5;
        this.f10749j = i6;
        this.f10750k = i7;
    }

    public final Response a(Request request) {
        return b(request, this.f10744b, this.f10745c, this.d);
    }

    public final Response b(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) {
        ArrayList arrayList = this.f10743a;
        int size = arrayList.size();
        int i2 = this.f10746e;
        if (i2 < size) {
            this.f10751l++;
            HttpCodec httpCodec2 = this.f10745c;
            Request request2 = request;
            if (httpCodec2 != null) {
                if (!this.d.j(request2.f10637a)) {
                    throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must retain the same host and port");
                }
            }
            if (httpCodec2 == null || this.f10751l <= 1) {
                int i5 = i2 + 1;
                Call call = this.g;
                EventListener eventListener = this.h;
                int i6 = this.f10748i;
                int i7 = this.f10749j;
                int i8 = this.f10750k;
                EventListener eventListener2 = eventListener;
                int i9 = i5;
                RealInterceptorChain realInterceptorChain = r1;
                String str = " must call proceed() exactly once";
                String str2 = "network interceptor ";
                RealInterceptorChain realInterceptorChain2 = new RealInterceptorChain(arrayList, streamAllocation, httpCodec, realConnection, i5, request, call, eventListener2, i6, i7, i8);
                Interceptor interceptor = (Interceptor) arrayList.get(i2);
                Response a6 = interceptor.a(realInterceptorChain);
                if (httpCodec != null && i9 < arrayList.size() && realInterceptorChain.f10751l != 1) {
                    throw new IllegalStateException(str2 + interceptor + str);
                } else if (a6 == null) {
                    throw new NullPointerException("interceptor " + interceptor + " returned null");
                } else if (a6.f10654p != null) {
                    return a6;
                } else {
                    throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + arrayList.get(i2 - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }
}
