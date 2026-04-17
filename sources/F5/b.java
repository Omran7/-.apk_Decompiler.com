package F5;

import java.io.Serializable;
import java.util.regex.Pattern;
import kotlin.jvm.internal.j;

public final class b implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f796a;

    public b() {
        Pattern compile = Pattern.compile("^[a-zA-Z0-9/_]{0,100}$");
        j.d(compile, "compile(...)");
        this.f796a = compile;
    }

    public final String toString() {
        String pattern = this.f796a.toString();
        j.d(pattern, "toString(...)");
        return pattern;
    }
}
