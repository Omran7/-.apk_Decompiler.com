package C3;

import A3.f;
import A3.g;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public final class c implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f457a;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
        f457a = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    public final void a(Object obj, Object obj2) {
        ((g) obj2).b(f457a.format((Date) obj));
    }
}
