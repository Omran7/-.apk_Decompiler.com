package okhttp3;

import N5.g;
import N5.o;
import java.util.ArrayList;
import java.util.UUID;

public final class MultipartBody extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f10576a = 0;

    public static final class Builder {
        public Builder() {
            String uuid = UUID.randomUUID().toString();
            int i2 = MultipartBody.f10576a;
            new ArrayList();
            g.k(uuid);
        }
    }

    public static final class Part {
    }

    static {
        MediaType.a("multipart/mixed");
        MediaType.a("multipart/alternative");
        MediaType.a("multipart/digest");
        MediaType.a("multipart/parallel");
        MediaType.a("multipart/form-data");
    }

    public final long a() {
        throw null;
    }

    public final MediaType b() {
        return null;
    }

    public final void d(o oVar) {
        throw null;
    }
}
