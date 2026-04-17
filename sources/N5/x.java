package N5;

import java.nio.charset.Charset;

public abstract class x {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f1968a = Charset.forName("UTF-8");

    public static void a(long j6, long j7, long j8) {
        if ((j7 | j8) < 0 || j7 > j6 || j6 - j7 < j8) {
            throw new ArrayIndexOutOfBoundsException("size=" + j6 + " offset=" + j7 + " byteCount=" + j8);
        }
    }
}
