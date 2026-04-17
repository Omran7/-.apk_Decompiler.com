package K0;

import B0.D;
import C0.g;
import I3.h;
import U0.c;
import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import z0.C1129e;
import z0.i;
import z0.k;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1442a;

    /* renamed from: b  reason: collision with root package name */
    public final h f1443b;

    public /* synthetic */ b(h hVar, int i2) {
        this.f1442a = i2;
        this.f1443b = hVar;
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        switch (this.f1442a) {
            case 0:
                return h.g(ImageDecoder.createSource((ByteBuffer) obj), i2, i5, iVar);
            default:
                return h.g(ImageDecoder.createSource(c.b((InputStream) obj)), i2, i5, iVar);
        }
    }

    public final boolean b(Object obj, i iVar) {
        switch (this.f1442a) {
            case 0:
                ImageHeaderParser$ImageType c3 = C1129e.c((ArrayList) this.f1443b.f1179b, (ByteBuffer) obj);
                if (c3 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && c3 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return true;
                }
                return false;
            default:
                h hVar = this.f1443b;
                ImageHeaderParser$ImageType b6 = C1129e.b((ArrayList) hVar.f1179b, (InputStream) obj, (g) hVar.f1180c);
                if (b6 == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && b6 == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                    return true;
                }
                return false;
        }
    }
}
