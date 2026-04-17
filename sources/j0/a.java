package J0;

import I0.j;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.f;
import com.bumptech.glide.load.data.g;
import com.bumptech.glide.load.data.h;
import java.nio.ByteBuffer;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1292a;

    public /* synthetic */ a(int i2) {
        this.f1292a = i2;
    }

    public final g a(Object obj) {
        switch (this.f1292a) {
            case 0:
                return new j((ByteBuffer) obj, 2);
            case 1:
                return new h(obj);
            default:
                return new h((ParcelFileDescriptor) obj);
        }
    }

    public final Class b() {
        switch (this.f1292a) {
            case 0:
                return ByteBuffer.class;
            case 1:
                throw new UnsupportedOperationException("Not implemented");
            default:
                return ParcelFileDescriptor.class;
        }
    }
}
