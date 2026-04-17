package F0;

import T0.b;
import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z0.i;

public final class G implements s {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f671b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));

    /* renamed from: a  reason: collision with root package name */
    public final Object f672a;

    public G(F f6) {
        this.f672a = f6;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [F0.F, java.lang.Object] */
    public final r a(Object obj, int i2, int i5, i iVar) {
        Uri uri = (Uri) obj;
        return new r(new b(uri), this.f672a.f(uri));
    }

    public final boolean b(Object obj) {
        return f671b.contains(((Uri) obj).getScheme());
    }
}
