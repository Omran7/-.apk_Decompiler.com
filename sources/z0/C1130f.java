package z0;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: z0.f  reason: case insensitive filesystem */
public interface C1130f {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f12789a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
