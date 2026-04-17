package okhttp3.internal.connection;

import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;

public final class RouteSelector {

    /* renamed from: a  reason: collision with root package name */
    public final Address f10722a;

    /* renamed from: b  reason: collision with root package name */
    public final RouteDatabase f10723b;

    /* renamed from: c  reason: collision with root package name */
    public final Call f10724c;
    public final EventListener d;

    /* renamed from: e  reason: collision with root package name */
    public final List f10725e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public int f10726f;
    public List g = Collections.emptyList();
    public final ArrayList h = new ArrayList();

    public static final class Selection {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f10727a;

        /* renamed from: b  reason: collision with root package name */
        public int f10728b = 0;

        public Selection(ArrayList arrayList) {
            this.f10727a = arrayList;
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List list;
        this.f10722a = address;
        this.f10723b = routeDatabase;
        this.f10724c = call;
        this.d = eventListener;
        List<Proxy> select = address.g.select(address.f10480a.k());
        if (select == null || select.isEmpty()) {
            list = Util.n(Proxy.NO_PROXY);
        } else {
            list = Util.m(select);
        }
        this.f10725e = list;
        this.f10726f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f10722a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(okhttp3.Route r4, java.io.IOException r5) {
        /*
            r3 = this;
            java.net.Proxy r0 = r4.f10673b
            java.net.Proxy$Type r0 = r0.type()
            java.net.Proxy$Type r1 = java.net.Proxy.Type.DIRECT
            if (r0 == r1) goto L_0x001f
            okhttp3.Address r0 = r3.f10722a
            java.net.ProxySelector r1 = r0.g
            if (r1 == 0) goto L_0x001f
            okhttp3.HttpUrl r0 = r0.f10480a
            java.net.URI r0 = r0.k()
            java.net.Proxy r2 = r4.f10673b
            java.net.SocketAddress r2 = r2.address()
            r1.connectFailed(r0, r2, r5)
        L_0x001f:
            okhttp3.internal.connection.RouteDatabase r5 = r3.f10723b
            monitor-enter(r5)
            java.util.LinkedHashSet r0 = r5.f10719a     // Catch:{ all -> 0x0029 }
            r0.add(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r5)
            return
        L_0x0029:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0029 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RouteSelector.a(okhttp3.Route, java.io.IOException):void");
    }
}
