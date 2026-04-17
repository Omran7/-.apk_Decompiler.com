package n5;

import java.util.Collection;
import kotlin.jvm.internal.j;

/* renamed from: n5.i  reason: case insensitive filesystem */
public abstract class C0877i extends C0876h {
    public static int T0(Iterable iterable) {
        j.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
