package okhttp3.internal.connection;

import java.util.LinkedHashSet;
import okhttp3.Route;

public final class RouteDatabase {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashSet f10719a = new LinkedHashSet();

    public final synchronized void a(Route route) {
        this.f10719a.remove(route);
    }
}
