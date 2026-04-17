package okhttp3.internal.cache;

import okhttp3.Request;
import okhttp3.Response;

public final class CacheStrategy {

    /* renamed from: a  reason: collision with root package name */
    public final Request f10701a;

    /* renamed from: b  reason: collision with root package name */
    public final Response f10702b;

    public static class Factory {
    }

    public CacheStrategy(Request request, Response response) {
        this.f10701a = request;
        this.f10702b = response;
    }
}
