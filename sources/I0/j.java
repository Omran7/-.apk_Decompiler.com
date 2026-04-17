package I0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import z0.g;

public final class j implements m, g, com.bumptech.glide.load.data.g {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f1117a;

    public j() {
        this.f1117a = ByteBuffer.allocate(4);
    }

    public long a(long j6) {
        ByteBuffer byteBuffer = this.f1117a;
        int min = (int) Math.min((long) byteBuffer.remaining(), j6);
        byteBuffer.position(byteBuffer.position() + min);
        return (long) min;
    }

    public void b(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f1117a) {
                this.f1117a.position(0);
                messageDigest.update(this.f1117a.putInt(num.intValue()).array());
            }
        }
    }

    public Object d() {
        ByteBuffer byteBuffer = this.f1117a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    public int g(byte[] bArr, int i2) {
        ByteBuffer byteBuffer = this.f1117a;
        int min = Math.min(i2, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    public short h() {
        ByteBuffer byteBuffer = this.f1117a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new l();
    }

    public int m() {
        return (h() << 8) | h();
    }

    public j(ByteBuffer byteBuffer, int i2) {
        switch (i2) {
            case 2:
                this.f1117a = byteBuffer;
                return;
            default:
                this.f1117a = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                return;
        }
    }

    public void c() {
    }
}
