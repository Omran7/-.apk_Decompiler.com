package I5;

import E5.a;
import E5.c;
import H5.b;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import kotlin.jvm.internal.j;

public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final List f1254a;

    static {
        try {
            Iterator it2 = Arrays.asList(new b[]{new b()}).iterator();
            j.e(it2, "<this>");
            f1254a = E5.f.I0(new a(new c(it2, 2)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
