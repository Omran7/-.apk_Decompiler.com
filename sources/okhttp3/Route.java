package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;

public final class Route {

    /* renamed from: a  reason: collision with root package name */
    public final Address f10672a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f10673b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f10674c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address == null) {
            throw new NullPointerException("address == null");
        } else if (inetSocketAddress != null) {
            this.f10672a = address;
            this.f10673b = proxy;
            this.f10674c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (!route.f10672a.equals(this.f10672a) || !route.f10673b.equals(this.f10673b) || !route.f10674c.equals(this.f10674c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f10673b.hashCode();
        return this.f10674c.hashCode() + ((hashCode + ((this.f10672a.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f10674c + "}";
    }
}
