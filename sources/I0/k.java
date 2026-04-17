package I0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import z0.g;

public final class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f1118a;

    public k() {
        this.f1118a = ByteBuffer.allocate(8);
    }

    public short a(int i2) {
        ByteBuffer byteBuffer = this.f1118a;
        if (byteBuffer.remaining() - i2 >= 2) {
            return byteBuffer.getShort(i2);
        }
        return -1;
    }

    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Long l6 = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.f1118a) {
            this.f1118a.position(0);
            messageDigest.update(this.f1118a.putLong(l6.longValue()).array());
        }
    }

    public k(byte[] bArr, int i2) {
        this.f1118a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i2);
    }
}
