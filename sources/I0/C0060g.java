package I0;

import B0.D;
import U0.c;
import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import z0.i;
import z0.k;

/* renamed from: I0.g  reason: case insensitive filesystem */
public final class C0060g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1113a;

    /* renamed from: b  reason: collision with root package name */
    public final C0056c f1114b;

    public C0060g(int i2) {
        this.f1113a = i2;
        switch (i2) {
            case 1:
                this.f1114b = new C0056c();
                return;
            default:
                this.f1114b = new C0056c();
                return;
        }
    }

    public final D a(Object obj, int i2, int i5, i iVar) {
        switch (this.f1113a) {
            case 0:
                return this.f1114b.c(ImageDecoder.createSource((ByteBuffer) obj), i2, i5, iVar);
            default:
                return this.f1114b.c(ImageDecoder.createSource(c.b((InputStream) obj)), i2, i5, iVar);
        }
    }

    public final /* bridge */ /* synthetic */ boolean b(Object obj, i iVar) {
        switch (this.f1113a) {
            case 0:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                return true;
            default:
                InputStream inputStream = (InputStream) obj;
                return true;
        }
    }
}
