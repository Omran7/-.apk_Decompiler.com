package okhttp3.internal.http;

import N5.f;
import N5.p;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

public final class RealResponseBody extends ResponseBody {

    /* renamed from: a  reason: collision with root package name */
    public final String f10752a;

    /* renamed from: b  reason: collision with root package name */
    public final long f10753b;

    /* renamed from: c  reason: collision with root package name */
    public final p f10754c;

    public RealResponseBody(String str, long j6, p pVar) {
        this.f10752a = str;
        this.f10753b = j6;
        this.f10754c = pVar;
    }

    public final long c() {
        return this.f10753b;
    }

    public final MediaType d() {
        String str = this.f10752a;
        if (str == null) {
            return null;
        }
        try {
            return MediaType.a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final f k() {
        return this.f10754c;
    }
}
