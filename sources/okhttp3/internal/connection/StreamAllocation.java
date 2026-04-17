package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.HttpCodec;

public final class StreamAllocation {

    /* renamed from: a  reason: collision with root package name */
    public final Address f10729a;

    /* renamed from: b  reason: collision with root package name */
    public RouteSelector.Selection f10730b;

    /* renamed from: c  reason: collision with root package name */
    public Route f10731c;
    public final ConnectionPool d;

    /* renamed from: e  reason: collision with root package name */
    public final Call f10732e;

    /* renamed from: f  reason: collision with root package name */
    public final EventListener f10733f;
    public final Object g;
    public final RouteSelector h;

    /* renamed from: i  reason: collision with root package name */
    public int f10734i;

    /* renamed from: j  reason: collision with root package name */
    public RealConnection f10735j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f10736k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f10737l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f10738m;

    /* renamed from: n  reason: collision with root package name */
    public HttpCodec f10739n;

    public static final class StreamAllocationReference extends WeakReference<StreamAllocation> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f10740a;

        public StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.f10740a = obj;
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address, Call call, EventListener eventListener, Object obj) {
        this.d = connectionPool;
        this.f10729a = address;
        this.f10732e = call;
        this.f10733f = eventListener;
        this.h = new RouteSelector(address, Internal.f10681a.j(connectionPool), call, eventListener);
        this.g = obj;
    }

    public final synchronized RealConnection a() {
        return this.f10735j;
    }

    public final Socket b(boolean z3, boolean z4, boolean z5) {
        Socket socket;
        if (z5) {
            this.f10739n = null;
        }
        if (z4) {
            this.f10737l = true;
        }
        RealConnection realConnection = this.f10735j;
        if (realConnection == null) {
            return null;
        }
        if (z3) {
            realConnection.f10714k = true;
        }
        if (this.f10739n != null) {
            return null;
        }
        if (!this.f10737l && !realConnection.f10714k) {
            return null;
        }
        ArrayList arrayList = realConnection.f10717n;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Reference) arrayList.get(i2)).get() == this) {
                arrayList.remove(i2);
                if (this.f10735j.f10717n.isEmpty()) {
                    this.f10735j.f10718o = System.nanoTime();
                    if (Internal.f10681a.e(this.d, this.f10735j)) {
                        socket = this.f10735j.f10710e;
                        this.f10735j = null;
                        return socket;
                    }
                }
                socket = null;
                this.f10735j = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: okhttp3.Route} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.connection.RealConnection c(int r17, int r18, int r19, boolean r20) {
        /*
            r16 = this;
            r1 = r16
            okhttp3.ConnectionPool r2 = r1.d
            monitor-enter(r2)
            boolean r0 = r1.f10737l     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x0306
            okhttp3.internal.http.HttpCodec r0 = r1.f10739n     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x02fe
            boolean r0 = r1.f10738m     // Catch:{ all -> 0x0045 }
            if (r0 != 0) goto L_0x02f6
            okhttp3.internal.connection.RealConnection r0 = r1.f10735j     // Catch:{ all -> 0x0045 }
            r3 = 0
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0021
            boolean r6 = r0.f10714k     // Catch:{ all -> 0x0045 }
            if (r6 == 0) goto L_0x0021
            java.net.Socket r6 = r1.b(r3, r3, r4)     // Catch:{ all -> 0x0045 }
            goto L_0x0022
        L_0x0021:
            r6 = r5
        L_0x0022:
            okhttp3.internal.connection.RealConnection r7 = r1.f10735j     // Catch:{ all -> 0x0045 }
            if (r7 == 0) goto L_0x0028
            r0 = r5
            goto L_0x0029
        L_0x0028:
            r7 = r5
        L_0x0029:
            boolean r8 = r1.f10736k     // Catch:{ all -> 0x0045 }
            if (r8 != 0) goto L_0x002e
            r0 = r5
        L_0x002e:
            if (r7 != 0) goto L_0x0048
            okhttp3.internal.Internal r8 = okhttp3.internal.Internal.f10681a     // Catch:{ all -> 0x0045 }
            okhttp3.ConnectionPool r9 = r1.d     // Catch:{ all -> 0x0045 }
            okhttp3.Address r10 = r1.f10729a     // Catch:{ all -> 0x0045 }
            r8.h(r9, r10, r1, r5)     // Catch:{ all -> 0x0045 }
            okhttp3.internal.connection.RealConnection r8 = r1.f10735j     // Catch:{ all -> 0x0045 }
            if (r8 == 0) goto L_0x0041
            r9 = r4
            r7 = r8
        L_0x003f:
            r8 = r5
            goto L_0x004a
        L_0x0041:
            okhttp3.Route r8 = r1.f10731c     // Catch:{ all -> 0x0045 }
            r9 = r3
            goto L_0x004a
        L_0x0045:
            r0 = move-exception
            goto L_0x030e
        L_0x0048:
            r9 = r3
            goto L_0x003f
        L_0x004a:
            monitor-exit(r2)     // Catch:{ all -> 0x0045 }
            okhttp3.internal.Util.f(r6)
            if (r0 == 0) goto L_0x0055
            okhttp3.EventListener r0 = r1.f10733f
            r0.getClass()
        L_0x0055:
            if (r9 == 0) goto L_0x005c
            okhttp3.EventListener r0 = r1.f10733f
            r0.getClass()
        L_0x005c:
            if (r7 == 0) goto L_0x0065
            okhttp3.internal.connection.RealConnection r0 = r1.f10735j
            okhttp3.Route r0 = r0.f10709c
            r1.f10731c = r0
            return r7
        L_0x0065:
            if (r8 != 0) goto L_0x020c
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.f10730b
            if (r0 == 0) goto L_0x0077
            int r2 = r0.f10728b
            java.util.ArrayList r0 = r0.f10727a
            int r0 = r0.size()
            if (r2 >= r0) goto L_0x0077
            goto L_0x020c
        L_0x0077:
            okhttp3.internal.connection.RouteSelector r0 = r1.h
            int r2 = r0.f10726f
            java.util.List r6 = r0.f10725e
            int r6 = r6.size()
            if (r2 >= r6) goto L_0x0084
            goto L_0x008c
        L_0x0084:
            java.util.ArrayList r2 = r0.h
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0206
        L_0x008c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0091:
            int r6 = r0.f10726f
            java.util.List r10 = r0.f10725e
            int r10 = r10.size()
            if (r6 >= r10) goto L_0x01ed
            int r6 = r0.f10726f
            java.util.List r10 = r0.f10725e
            int r10 = r10.size()
            if (r6 >= r10) goto L_0x00a7
            r6 = r4
            goto L_0x00a8
        L_0x00a7:
            r6 = r3
        L_0x00a8:
            okhttp3.Address r10 = r0.f10722a
            java.lang.String r11 = "No route to "
            if (r6 == 0) goto L_0x01cd
            java.util.List r6 = r0.f10725e
            int r12 = r0.f10726f
            int r13 = r12 + 1
            r0.f10726f = r13
            java.lang.Object r6 = r6.get(r12)
            java.net.Proxy r6 = (java.net.Proxy) r6
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r0.g = r12
            java.net.Proxy$Type r12 = r6.type()
            java.net.Proxy$Type r13 = java.net.Proxy.Type.DIRECT
            if (r12 == r13) goto L_0x010a
            java.net.Proxy$Type r12 = r6.type()
            java.net.Proxy$Type r13 = java.net.Proxy.Type.SOCKS
            if (r12 != r13) goto L_0x00d4
            goto L_0x010a
        L_0x00d4:
            java.net.SocketAddress r12 = r6.address()
            boolean r13 = r12 instanceof java.net.InetSocketAddress
            if (r13 == 0) goto L_0x00f2
            java.net.InetSocketAddress r12 = (java.net.InetSocketAddress) r12
            java.net.InetAddress r13 = r12.getAddress()
            if (r13 != 0) goto L_0x00e9
            java.lang.String r13 = r12.getHostName()
            goto L_0x00ed
        L_0x00e9:
            java.lang.String r13 = r13.getHostAddress()
        L_0x00ed:
            int r12 = r12.getPort()
            goto L_0x0110
        L_0x00f2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Proxy.address() is not an InetSocketAddress: "
            r2.<init>(r3)
            java.lang.Class r3 = r12.getClass()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x010a:
            okhttp3.HttpUrl r12 = r10.f10480a
            java.lang.String r13 = r12.d
            int r12 = r12.f10565e
        L_0x0110:
            if (r12 < r4) goto L_0x01ae
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r12 > r14) goto L_0x01ae
            java.net.Proxy$Type r11 = r6.type()
            java.net.Proxy$Type r14 = java.net.Proxy.Type.SOCKS
            if (r11 != r14) goto L_0x0129
            java.util.List r10 = r0.g
            java.net.InetSocketAddress r11 = java.net.InetSocketAddress.createUnresolved(r13, r12)
            r10.add(r11)
            goto L_0x0155
        L_0x0129:
            okhttp3.EventListener r11 = r0.d
            r11.getClass()
            okhttp3.Dns r11 = r10.f10481b
            java.util.List r11 = r11.a(r13)
            boolean r14 = r11.isEmpty()
            if (r14 != 0) goto L_0x0192
            int r10 = r11.size()
            r13 = r3
        L_0x013f:
            if (r13 >= r10) goto L_0x0155
            java.lang.Object r14 = r11.get(r13)
            java.net.InetAddress r14 = (java.net.InetAddress) r14
            java.util.List r15 = r0.g
            java.net.InetSocketAddress r5 = new java.net.InetSocketAddress
            r5.<init>(r14, r12)
            r15.add(r5)
            int r13 = r13 + 1
            r5 = 0
            goto L_0x013f
        L_0x0155:
            java.util.List r5 = r0.g
            int r5 = r5.size()
            r10 = r3
        L_0x015c:
            if (r10 >= r5) goto L_0x0188
            okhttp3.Route r11 = new okhttp3.Route
            okhttp3.Address r12 = r0.f10722a
            java.util.List r13 = r0.g
            java.lang.Object r13 = r13.get(r10)
            java.net.InetSocketAddress r13 = (java.net.InetSocketAddress) r13
            r11.<init>(r12, r6, r13)
            okhttp3.internal.connection.RouteDatabase r12 = r0.f10723b
            monitor-enter(r12)
            java.util.LinkedHashSet r13 = r12.f10719a     // Catch:{ all -> 0x0185 }
            boolean r13 = r13.contains(r11)     // Catch:{ all -> 0x0185 }
            monitor-exit(r12)
            if (r13 == 0) goto L_0x017f
            java.util.ArrayList r12 = r0.h
            r12.add(r11)
            goto L_0x0182
        L_0x017f:
            r2.add(r11)
        L_0x0182:
            int r10 = r10 + 1
            goto L_0x015c
        L_0x0185:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0185 }
            throw r0
        L_0x0188:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x018f
            goto L_0x01ed
        L_0x018f:
            r5 = 0
            goto L_0x0091
        L_0x0192:
            java.net.UnknownHostException r0 = new java.net.UnknownHostException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            okhttp3.Dns r3 = r10.f10481b
            r2.append(r3)
            java.lang.String r3 = " returned no addresses for "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01ae:
            java.net.SocketException r0 = new java.net.SocketException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r13)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r12)
            java.lang.String r3 = "; port is out of range"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x01cd:
            java.net.SocketException r2 = new java.net.SocketException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r11)
            okhttp3.HttpUrl r4 = r10.f10480a
            java.lang.String r4 = r4.d
            r3.append(r4)
            java.lang.String r4 = "; exhausted proxy configurations: "
            r3.append(r4)
            java.util.List r0 = r0.f10725e
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01ed:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x01fd
            java.util.ArrayList r5 = r0.h
            r2.addAll(r5)
            java.util.ArrayList r0 = r0.h
            r0.clear()
        L_0x01fd:
            okhttp3.internal.connection.RouteSelector$Selection r0 = new okhttp3.internal.connection.RouteSelector$Selection
            r0.<init>(r2)
            r1.f10730b = r0
            r0 = r4
            goto L_0x020d
        L_0x0206:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L_0x020c:
            r0 = r3
        L_0x020d:
            okhttp3.ConnectionPool r5 = r1.d
            monitor-enter(r5)
            boolean r2 = r1.f10738m     // Catch:{ all -> 0x0241 }
            if (r2 != 0) goto L_0x02ec
            if (r0 == 0) goto L_0x0247
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.f10730b     // Catch:{ all -> 0x0241 }
            r0.getClass()     // Catch:{ all -> 0x0241 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0241 }
            java.util.ArrayList r0 = r0.f10727a     // Catch:{ all -> 0x0241 }
            r2.<init>(r0)     // Catch:{ all -> 0x0241 }
            int r0 = r2.size()     // Catch:{ all -> 0x0241 }
            r6 = r3
        L_0x0227:
            if (r6 >= r0) goto L_0x0247
            java.lang.Object r10 = r2.get(r6)     // Catch:{ all -> 0x0241 }
            okhttp3.Route r10 = (okhttp3.Route) r10     // Catch:{ all -> 0x0241 }
            okhttp3.internal.Internal r11 = okhttp3.internal.Internal.f10681a     // Catch:{ all -> 0x0241 }
            okhttp3.ConnectionPool r12 = r1.d     // Catch:{ all -> 0x0241 }
            okhttp3.Address r13 = r1.f10729a     // Catch:{ all -> 0x0241 }
            r11.h(r12, r13, r1, r10)     // Catch:{ all -> 0x0241 }
            okhttp3.internal.connection.RealConnection r11 = r1.f10735j     // Catch:{ all -> 0x0241 }
            if (r11 == 0) goto L_0x0244
            r1.f10731c = r10     // Catch:{ all -> 0x0241 }
            r9 = r4
            r7 = r11
            goto L_0x0247
        L_0x0241:
            r0 = move-exception
            goto L_0x02f4
        L_0x0244:
            int r6 = r6 + 1
            goto L_0x0227
        L_0x0247:
            if (r9 != 0) goto L_0x0291
            if (r8 != 0) goto L_0x0272
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.f10730b     // Catch:{ all -> 0x0241 }
            int r2 = r0.f10728b     // Catch:{ all -> 0x0241 }
            java.util.ArrayList r6 = r0.f10727a     // Catch:{ all -> 0x0241 }
            int r6 = r6.size()     // Catch:{ all -> 0x0241 }
            if (r2 >= r6) goto L_0x0259
            r2 = r4
            goto L_0x025a
        L_0x0259:
            r2 = r3
        L_0x025a:
            if (r2 == 0) goto L_0x026c
            int r2 = r0.f10728b     // Catch:{ all -> 0x0241 }
            int r6 = r2 + 1
            r0.f10728b = r6     // Catch:{ all -> 0x0241 }
            java.util.ArrayList r0 = r0.f10727a     // Catch:{ all -> 0x0241 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0241 }
            r8 = r0
            okhttp3.Route r8 = (okhttp3.Route) r8     // Catch:{ all -> 0x0241 }
            goto L_0x0272
        L_0x026c:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0241 }
            r0.<init>()     // Catch:{ all -> 0x0241 }
            throw r0     // Catch:{ all -> 0x0241 }
        L_0x0272:
            r1.f10731c = r8     // Catch:{ all -> 0x0241 }
            r1.f10734i = r3     // Catch:{ all -> 0x0241 }
            okhttp3.internal.connection.RealConnection r7 = new okhttp3.internal.connection.RealConnection     // Catch:{ all -> 0x0241 }
            okhttp3.ConnectionPool r0 = r1.d     // Catch:{ all -> 0x0241 }
            r7.<init>(r0, r8)     // Catch:{ all -> 0x0241 }
            okhttp3.internal.connection.RealConnection r0 = r1.f10735j     // Catch:{ all -> 0x0241 }
            if (r0 != 0) goto L_0x0293
            r1.f10735j = r7     // Catch:{ all -> 0x0241 }
            r1.f10736k = r3     // Catch:{ all -> 0x0241 }
            java.util.ArrayList r0 = r7.f10717n     // Catch:{ all -> 0x0241 }
            okhttp3.internal.connection.StreamAllocation$StreamAllocationReference r2 = new okhttp3.internal.connection.StreamAllocation$StreamAllocationReference     // Catch:{ all -> 0x0241 }
            java.lang.Object r6 = r1.g     // Catch:{ all -> 0x0241 }
            r2.<init>(r1, r6)     // Catch:{ all -> 0x0241 }
            r0.add(r2)     // Catch:{ all -> 0x0241 }
        L_0x0291:
            r0 = r7
            goto L_0x0299
        L_0x0293:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0241 }
            r0.<init>()     // Catch:{ all -> 0x0241 }
            throw r0     // Catch:{ all -> 0x0241 }
        L_0x0299:
            monitor-exit(r5)     // Catch:{ all -> 0x0241 }
            if (r9 == 0) goto L_0x02a2
            okhttp3.EventListener r2 = r1.f10733f
            r2.getClass()
            return r0
        L_0x02a2:
            okhttp3.EventListener r11 = r1.f10733f
            r6 = r0
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r6.c(r7, r8, r9, r10, r11)
            okhttp3.internal.Internal r2 = okhttp3.internal.Internal.f10681a
            okhttp3.ConnectionPool r5 = r1.d
            okhttp3.internal.connection.RouteDatabase r2 = r2.j(r5)
            okhttp3.Route r5 = r0.f10709c
            r2.a(r5)
            okhttp3.ConnectionPool r2 = r1.d
            monitor-enter(r2)
            r1.f10736k = r4     // Catch:{ all -> 0x02dd }
            okhttp3.internal.Internal r5 = okhttp3.internal.Internal.f10681a     // Catch:{ all -> 0x02dd }
            okhttp3.ConnectionPool r6 = r1.d     // Catch:{ all -> 0x02dd }
            r5.i(r6, r0)     // Catch:{ all -> 0x02dd }
            okhttp3.internal.http2.Http2Connection r5 = r0.h     // Catch:{ all -> 0x02dd }
            if (r5 == 0) goto L_0x02ce
            r3 = r4
        L_0x02ce:
            if (r3 == 0) goto L_0x02df
            okhttp3.internal.Internal r0 = okhttp3.internal.Internal.f10681a     // Catch:{ all -> 0x02dd }
            okhttp3.ConnectionPool r3 = r1.d     // Catch:{ all -> 0x02dd }
            okhttp3.Address r4 = r1.f10729a     // Catch:{ all -> 0x02dd }
            java.net.Socket r5 = r0.f(r3, r4, r1)     // Catch:{ all -> 0x02dd }
            okhttp3.internal.connection.RealConnection r0 = r1.f10735j     // Catch:{ all -> 0x02dd }
            goto L_0x02e0
        L_0x02dd:
            r0 = move-exception
            goto L_0x02ea
        L_0x02df:
            r5 = 0
        L_0x02e0:
            monitor-exit(r2)     // Catch:{ all -> 0x02dd }
            okhttp3.internal.Util.f(r5)
            okhttp3.EventListener r2 = r1.f10733f
            r2.getClass()
            return r0
        L_0x02ea:
            monitor-exit(r2)     // Catch:{ all -> 0x02dd }
            throw r0
        L_0x02ec:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0241 }
            java.lang.String r2 = "Canceled"
            r0.<init>(r2)     // Catch:{ all -> 0x0241 }
            throw r0     // Catch:{ all -> 0x0241 }
        L_0x02f4:
            monitor-exit(r5)     // Catch:{ all -> 0x0241 }
            throw r0
        L_0x02f6:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "Canceled"
            r0.<init>(r3)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x02fe:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "codec != null"
            r0.<init>(r3)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0306:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "released"
            r0.<init>(r3)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x030e:
            monitor-exit(r2)     // Catch:{ all -> 0x0045 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.c(int, int, int, boolean):okhttp3.internal.connection.RealConnection");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        if (r0.f10710e.isClosed() != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        if (r0.f10710e.isInputShutdown() != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r0.f10710e.isOutputShutdown() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        r1 = r0.h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1 == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        r2 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r1.f10827p == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0049, code lost:
        if (r1.f10834w >= r1.f10833v) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004f, code lost:
        if (r2 < r1.f10835x) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0051, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0059, code lost:
        if (r13 == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r1 = r0.f10710e.getSoTimeout();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0.f10710e.setSoTimeout(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x006c, code lost:
        if (r0.f10712i.c() == false) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r0.f10710e.setSoTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0074, code lost:
        r0.f10710e.setSoTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x007a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x007b, code lost:
        r0.f10710e.setSoTimeout(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0080, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0082, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0082, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.connection.RealConnection d(int r9, int r10, int r11, boolean r12, boolean r13) {
        /*
            r8 = this;
        L_0x0000:
            okhttp3.internal.connection.RealConnection r0 = r8.c(r9, r10, r11, r12)
            okhttp3.ConnectionPool r1 = r8.d
            monitor-enter(r1)
            int r2 = r0.f10715l     // Catch:{ all -> 0x0017 }
            r3 = 1
            if (r2 != 0) goto L_0x001a
            okhttp3.internal.http2.Http2Connection r2 = r0.h     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x0012
            r2 = r3
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            if (r2 != 0) goto L_0x001a
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r9 = move-exception
            goto L_0x0087
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            java.net.Socket r1 = r0.f10710e
            boolean r1 = r1.isClosed()
            if (r1 != 0) goto L_0x0082
            java.net.Socket r1 = r0.f10710e
            boolean r1 = r1.isInputShutdown()
            if (r1 != 0) goto L_0x0082
            java.net.Socket r1 = r0.f10710e
            boolean r1 = r1.isOutputShutdown()
            if (r1 == 0) goto L_0x0034
            goto L_0x0082
        L_0x0034:
            okhttp3.internal.http2.Http2Connection r1 = r0.h
            if (r1 == 0) goto L_0x0059
            long r2 = java.lang.System.nanoTime()
            monitor-enter(r1)
            boolean r4 = r1.f10827p     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x0043
            monitor-exit(r1)
            goto L_0x0082
        L_0x0043:
            long r4 = r1.f10834w     // Catch:{ all -> 0x0053 }
            long r6 = r1.f10833v     // Catch:{ all -> 0x0053 }
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0055
            long r4 = r1.f10835x     // Catch:{ all -> 0x0053 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0055
            monitor-exit(r1)
            goto L_0x0082
        L_0x0053:
            r9 = move-exception
            goto L_0x0057
        L_0x0055:
            monitor-exit(r1)
            goto L_0x0081
        L_0x0057:
            monitor-exit(r1)     // Catch:{ all -> 0x0053 }
            throw r9
        L_0x0059:
            if (r13 == 0) goto L_0x0081
            java.net.Socket r1 = r0.f10710e     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            int r1 = r1.getSoTimeout()     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            java.net.Socket r2 = r0.f10710e     // Catch:{ all -> 0x007a }
            r2.setSoTimeout(r3)     // Catch:{ all -> 0x007a }
            N5.p r2 = r0.f10712i     // Catch:{ all -> 0x007a }
            boolean r2 = r2.c()     // Catch:{ all -> 0x007a }
            if (r2 == 0) goto L_0x0074
            java.net.Socket r2 = r0.f10710e     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            r2.setSoTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            goto L_0x0082
        L_0x0074:
            java.net.Socket r2 = r0.f10710e     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            r2.setSoTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            goto L_0x0081
        L_0x007a:
            r2 = move-exception
            java.net.Socket r3 = r0.f10710e     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            r3.setSoTimeout(r1)     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
            throw r2     // Catch:{ SocketTimeoutException -> 0x0081, IOException -> 0x0082 }
        L_0x0081:
            return r0
        L_0x0082:
            r8.e()
            goto L_0x0000
        L_0x0087:
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.d(int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    public final void e() {
        RealConnection realConnection;
        Socket b6;
        synchronized (this.d) {
            realConnection = this.f10735j;
            b6 = b(true, false, false);
            if (this.f10735j != null) {
                realConnection = null;
            }
        }
        Util.f(b6);
        if (realConnection != null) {
            this.f10733f.getClass();
        }
    }

    public final void f() {
        RealConnection realConnection;
        Socket b6;
        synchronized (this.d) {
            realConnection = this.f10735j;
            b6 = b(false, true, false);
            if (this.f10735j != null) {
                realConnection = null;
            }
        }
        Util.f(b6);
        if (realConnection != null) {
            Internal.f10681a.k(this.f10732e, (IOException) null);
            this.f10733f.getClass();
            this.f10733f.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0054 A[Catch:{ all -> 0x001c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(java.io.IOException r7) {
        /*
            r6 = this;
            okhttp3.ConnectionPool r0 = r6.d
            monitor-enter(r0)
            boolean r1 = r7 instanceof okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x001c }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0025
            okhttp3.internal.http2.StreamResetException r7 = (okhttp3.internal.http2.StreamResetException) r7     // Catch:{ all -> 0x001c }
            okhttp3.internal.http2.ErrorCode r7 = r7.f10909a     // Catch:{ all -> 0x001c }
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x001c }
            if (r7 != r1) goto L_0x001e
            int r7 = r6.f10734i     // Catch:{ all -> 0x001c }
            int r7 = r7 + r3
            r6.f10734i = r7     // Catch:{ all -> 0x001c }
            if (r7 <= r3) goto L_0x0049
            r6.f10731c = r4     // Catch:{ all -> 0x001c }
            goto L_0x0047
        L_0x001c:
            r7 = move-exception
            goto L_0x0066
        L_0x001e:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ all -> 0x001c }
            if (r7 == r1) goto L_0x0049
            r6.f10731c = r4     // Catch:{ all -> 0x001c }
            goto L_0x0047
        L_0x0025:
            okhttp3.internal.connection.RealConnection r1 = r6.f10735j     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0049
            okhttp3.internal.http2.Http2Connection r5 = r1.h     // Catch:{ all -> 0x001c }
            if (r5 == 0) goto L_0x002f
            r5 = r3
            goto L_0x0030
        L_0x002f:
            r5 = r2
        L_0x0030:
            if (r5 == 0) goto L_0x0036
            boolean r5 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x001c }
            if (r5 == 0) goto L_0x0049
        L_0x0036:
            int r1 = r1.f10715l     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0047
            okhttp3.Route r1 = r6.f10731c     // Catch:{ all -> 0x001c }
            if (r1 == 0) goto L_0x0045
            if (r7 == 0) goto L_0x0045
            okhttp3.internal.connection.RouteSelector r5 = r6.h     // Catch:{ all -> 0x001c }
            r5.a(r1, r7)     // Catch:{ all -> 0x001c }
        L_0x0045:
            r6.f10731c = r4     // Catch:{ all -> 0x001c }
        L_0x0047:
            r7 = r3
            goto L_0x004a
        L_0x0049:
            r7 = r2
        L_0x004a:
            okhttp3.internal.connection.RealConnection r1 = r6.f10735j     // Catch:{ all -> 0x001c }
            java.net.Socket r7 = r6.b(r7, r2, r3)     // Catch:{ all -> 0x001c }
            okhttp3.internal.connection.RealConnection r2 = r6.f10735j     // Catch:{ all -> 0x001c }
            if (r2 != 0) goto L_0x005a
            boolean r2 = r6.f10736k     // Catch:{ all -> 0x001c }
            if (r2 != 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            r4 = r1
        L_0x005a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            okhttp3.internal.Util.f(r7)
            if (r4 == 0) goto L_0x0065
            okhttp3.EventListener r7 = r6.f10733f
            r7.getClass()
        L_0x0065:
            return
        L_0x0066:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.g(java.io.IOException):void");
    }

    public final void h(boolean z3, HttpCodec httpCodec, IOException iOException) {
        RealConnection realConnection;
        Socket b6;
        boolean z4;
        this.f10733f.getClass();
        synchronized (this.d) {
            if (httpCodec != null) {
                try {
                    if (httpCodec == this.f10739n) {
                        if (!z3) {
                            this.f10735j.f10715l++;
                        }
                        realConnection = this.f10735j;
                        b6 = b(z3, false, true);
                        if (this.f10735j != null) {
                            realConnection = null;
                        }
                        z4 = this.f10737l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            throw new IllegalStateException("expected " + this.f10739n + " but was " + httpCodec);
        }
        Util.f(b6);
        if (realConnection != null) {
            this.f10733f.getClass();
        }
        if (iOException != null) {
            Internal.f10681a.k(this.f10732e, iOException);
            this.f10733f.getClass();
        } else if (z4) {
            Internal.f10681a.k(this.f10732e, (IOException) null);
            this.f10733f.getClass();
        }
    }

    public final String toString() {
        RealConnection a6 = a();
        if (a6 != null) {
            return a6.toString();
        }
        return this.f10729a.toString();
    }
}
