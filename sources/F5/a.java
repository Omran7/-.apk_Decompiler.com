package F5;

import java.nio.charset.Charset;
import kotlin.jvm.internal.j;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f795a;

    static {
        Charset forName = Charset.forName("UTF-8");
        j.d(forName, "forName(...)");
        f795a = forName;
        j.d(Charset.forName("UTF-16"), "forName(...)");
        j.d(Charset.forName("UTF-16BE"), "forName(...)");
        j.d(Charset.forName("UTF-16LE"), "forName(...)");
        j.d(Charset.forName("US-ASCII"), "forName(...)");
        j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
