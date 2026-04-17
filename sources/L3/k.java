package L3;

import H3.f;
import M3.b;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final long f1731b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f1732c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static k d;

    /* renamed from: a  reason: collision with root package name */
    public final f f1733a;

    public k(f fVar) {
        this.f1733a = fVar;
    }

    public final boolean a(b bVar) {
        if (TextUtils.isEmpty(bVar.f1831c)) {
            return true;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f1733a.getClass();
        if (bVar.f1833f + bVar.f1832e < timeUnit.toSeconds(System.currentTimeMillis()) + f1731b) {
            return true;
        }
        return false;
    }
}
