package F0;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import z0.i;

public final class H implements s {

    /* renamed from: b  reason: collision with root package name */
    public static final Set f673b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));

    /* renamed from: a  reason: collision with root package name */
    public final s f674a;

    public H(s sVar) {
        this.f674a = sVar;
    }

    public final r a(Object obj, int i2, int i5, i iVar) {
        return this.f674a.a(new i(((Uri) obj).toString()), i2, i5, iVar);
    }

    public final boolean b(Object obj) {
        return f673b.contains(((Uri) obj).getScheme());
    }
}
