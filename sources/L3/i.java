package L3;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final byte f1729a = Byte.parseByte("01110000", 2);

    /* renamed from: b  reason: collision with root package name */
    public static final byte f1730b = Byte.parseByte("00001111", 2);

    public static String a() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b6 = array[0];
        array[16] = b6;
        array[0] = (byte) ((b6 & f1730b) | f1729a);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
}
