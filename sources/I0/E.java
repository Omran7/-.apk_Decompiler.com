package I0;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class E extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f1094a;

    public E(ByteBuffer byteBuffer) {
        this.f1094a = byteBuffer;
    }

    public final long getSize() {
        return (long) this.f1094a.limit();
    }

    public final int readAt(long j6, byte[] bArr, int i2, int i5) {
        ByteBuffer byteBuffer = this.f1094a;
        if (j6 >= ((long) byteBuffer.limit())) {
            return -1;
        }
        byteBuffer.position((int) j6);
        int min = Math.min(i5, byteBuffer.remaining());
        byteBuffer.get(bArr, i2, min);
        return min;
    }

    public final void close() {
    }
}
